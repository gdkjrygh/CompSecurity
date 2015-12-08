// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.callstatus.CallStatus;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.fragment.FragmentFactory;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.upload.ImageUploadManager;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            ProgramCardsUiProperties, DaggerOcrImageHolder, ImageInfo, ProgramCardInfo, 
//            EditCardInfoFragment, InvalidUserDataEvent, ProgramCardsAnalyticsProperties, OcrUserEventData, 
//            OcrResults, ProgramCardsHandler, SearchProgramsFragment, Program

public abstract class NewProgramCardActivity extends WalletActivity
    implements EditCardInfoFragment.EditCardInfoCallback, SearchProgramsFragment.SearchProgramsCallback
{
    final class LinkCardAction
        implements Callable
    {

        private final ProgramCardInfo actionCardInfo;
        final NewProgramCardActivity this$0;

        private CallStatus call()
            throws RpcException, CallErrorException
        {
            ImageInfo aimageinfo[] = actionCardInfo.getImages();
            if (aimageinfo != null)
            {
                int k = aimageinfo.length;
                for (int i = 0; i < k; i++)
                {
                    aimageinfo[i].setIdentifier(imageUploadManager.generateIdentifier());
                }

            }
            com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = getProgramCardsHandler().makeWobInstance(actionCardInfo);
            if (wobinstance != null)
            {
                if (aimageinfo != null)
                {
                    int l = aimageinfo.length;
                    int j = 0;
                    while (j < l) 
                    {
                        ImageInfo imageinfo = aimageinfo[j];
                        String s = imageinfo.getIdentifier();
                        try
                        {
                            imageUploadManager.registerAndUploadImage(s, wobinstance.id, imageinfo.getImageBytes());
                        }
                        catch (com.google.android.apps.wallet.wobs.upload.ImageUploadManager.UploadException uploadexception)
                        {
                            WLog.efmt(NewProgramCardActivity.TAG, uploadexception, "Failed to start upload: identifier=%s", new Object[] {
                                s
                            });
                        }
                        j++;
                    }
                    DaggerOcrImageHolder daggerocrimageholder = ocrImageHolder;
                    DaggerOcrImageHolder.clear();
                }
                wobsManager.upsertWobIfNecessary(wobinstance);
                ocrUserEventData.setSaveResult(true);
                sendOcrLogging();
                return CallStatus.SUCCESS;
            } else
            {
                ocrUserEventData.setSaveResult(false);
                sendOcrLogging();
                return CallStatus.failure(getUiProperties().getErrorDialogTitle(), getUiProperties().getErrorDialogMessage());
            }
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

        private LinkCardAction(ProgramCardInfo programcardinfo)
        {
            this$0 = NewProgramCardActivity.this;
            super();
            actionCardInfo = programcardinfo.copy();
        }

    }


    private static final String TAG = com/google/android/apps/wallet/wobs/add/NewProgramCardActivity.getSimpleName();
    public AnalyticsUtil analyticsUtil;
    public ProgramCardInfo cardInfo;
    private String currentAnalyticsTag;
    public EventBus eventBus;
    public FragmentFactory fragmentFactory;
    public ImageUploadManager imageUploadManager;
    public NetworkAccessChecker networkAccessChecker;
    public DaggerOcrImageHolder ocrImageHolder;
    public OcrUserEventData ocrUserEventData;
    private String previousAnalyticsTag;
    private Class previousFragment;
    public FullScreenProgressSpinnerManager progressSpinnerManager;
    private boolean triedOcr;
    public UserEventLogger userEventLogger;
    public WobsManager wobsManager;

    public NewProgramCardActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder createDialogForExceptionOnRpc(Exception exception)
    {
        WLog.e(TAG, "Exception from RPC response", exception);
        return CallErrorDialogs.createBuilder(exception, getUiProperties().getErrorDialogTitle(), getUiProperties().getErrorDialogMessage());
    }

    private void decodeImages(boolean flag)
    {
        Object obj = ocrImageHolder;
        obj = DaggerOcrImageHolder.get(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT);
        Object obj1 = ocrImageHolder;
        obj1 = DaggerOcrImageHolder.get(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK);
        if (obj != null && obj1 != null)
        {
            obj = new ImageInfo(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT, ((byte []) (obj)));
            obj1 = new ImageInfo(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK, ((byte []) (obj1)));
            cardInfo.setImages(new ImageInfo[] {
                obj, obj1
            });
        } else
        {
            if (obj == null && obj1 == null)
            {
                cardInfo.setImages(null);
                return;
            }
            if (!flag)
            {
                throw new IllegalStateException("Image holder has only one image");
            }
        }
    }

    private void enableSaving(boolean flag)
    {
        ((EditCardInfoFragment)getSupportFragmentManager().findFragmentById(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer)).setSavingEnabled(flag);
    }

    private Fragment getCurrentFragment()
    {
        return getSupportFragmentManager().findFragmentById(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer);
    }

    private ArrayList getOcrResult()
    {
        ArrayList arraylist = getIntent().getParcelableArrayListExtra("extra_wob_ocr_results");
        if (arraylist != null)
        {
            ArrayList arraylist1 = Lists.newArrayList();
            Iterator iterator = arraylist.iterator();
            do
            {
                arraylist = arraylist1;
                if (!iterator.hasNext())
                {
                    break;
                }
                arraylist1.add((RecognizedWobInstanceParcelable)(Parcelable)iterator.next());
            } while (true);
        } else
        {
            arraylist = null;
        }
        return arraylist;
    }

    private void onFetchProgramFailure(Exception exception)
    {
        analyticsUtil.sendError("ChooseMerchant", new AnalyticsCustomDimension[0]);
        createDialogForExceptionOnRpc(exception).setFinishActivityOnClick().setFinishActivityOnDismiss().build().show(getSupportFragmentManager());
    }

    private void onLinkCardFailure(Exception exception)
    {
        enableSaving(true);
        if (exception instanceof InvalidUserDataEvent)
        {
            eventBus.post(exception);
        } else
        {
            analyticsUtil.sendError(getAnalyticsProperties().getSaveEvent(), new AnalyticsCustomDimension[0]);
        }
        createDialogForExceptionOnRpc(exception).build().show(getSupportFragmentManager());
    }

    private void onLinkCardSuccess(CallStatus callstatus)
    {
        if (callstatus.isSuccess())
        {
            analyticsUtil.endTiming(getAnalyticsProperties().getGoogleAnalyticsSaveTiming(), getAnalyticsProperties().getCsiSaveTiming());
            analyticsUtil.sendSuccess(getAnalyticsProperties().getSaveEvent(), new AnalyticsCustomDimension[0]);
            Toasts.show(this, getString(getUiProperties().getSuccessToastMessage()));
            startActivity(UriIntents.create(this, UriRegistry.getUri(5, new Object[0])));
            return;
        } else
        {
            analyticsUtil.sendError(getAnalyticsProperties().getSaveEvent(), new AnalyticsCustomDimension[0]);
            enableSaving(true);
            AlertDialogFragment.newBuilder().setTitle(callstatus.getDisplayableErrorTitle(this)).setMessage(callstatus.getDisplayableErrorMessage(this)).build().show(getSupportFragmentManager());
            return;
        }
    }

    private void onOcrResult(int i, int j)
    {
        if (i != 3 && i != 1 && i != 0) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR lookupswitch 4: default 56
    //                   -1: 120
    //                   0: 73
    //                   10005: 120
    //                   10007: 73;
           goto _L3 _L4 _L5 _L4 _L5
_L3:
        decodeImages(true);
        Toasts.show(this, getString(com.google.android.apps.walletnfcrel.R.string.wobs_image_capture_error_message));
_L5:
        if (i != 3) goto _L7; else goto _L6
_L6:
        ocrUserEventData.setOcrResultCode(j);
        j;
        JVM INSTR tableswitch -1 -1: default 108
    //                   -1 128;
           goto _L7 _L8
_L7:
        if (getCurrentFragment() == null)
        {
            showSearchFragment();
        }
_L2:
        return;
_L4:
        decodeImages(false);
        continue; /* Loop/switch isn't completed */
_L8:
        Object obj = getOcrResult();
        if (cardInfo.getMerchantName() != null || obj == null) goto _L7; else goto _L9
_L9:
        obj = OcrResults.OcrResultsExtractor.extractOcrResults(((java.util.List) (obj)));
        ocrUserEventData.setScannedDiscoverableId(((OcrResults) (obj)).discoverableId).setScannedCardNumber(((OcrResults) (obj)).cardNumber).setScannedMerchantName(((OcrResults) (obj)).merchantName);
        if (((OcrResults) (obj)).discoverableId == null && ((OcrResults) (obj)).merchantName == null) goto _L7; else goto _L10
_L10:
        showEditFragmentForDiscoverable(((OcrResults) (obj)).discoverableId);
        return;
        if (true) goto _L5; else goto _L11
_L11:
    }

    private void pushFragment(Class class1, String s)
    {
        Object obj = getCurrentFragment();
        if (obj == null || !class1.equals(obj.getClass()))
        {
            if (obj != null)
            {
                obj = obj.getClass();
            } else
            {
                obj = null;
            }
            previousFragment = ((Class) (obj));
            previousAnalyticsTag = currentAnalyticsTag;
            currentAnalyticsTag = s;
        }
        showFragment(class1, s);
    }

    private void sendOcrLogging()
    {
        if (triedOcr)
        {
            com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo usereventcontextextrainfo = new com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo();
            usereventcontextextrainfo.ocrExtraInfo = ocrUserEventData.generateOcrExtraInfo(getProgramCardsHandler().getOcrType(), cardInfo.getMerchantName(), (String)cardInfo.getCardNumber().orNull(), SystemClock.elapsedRealtime());
            userEventLogger.log(32, getProgramCardsHandler().getOcrUserEventType(), usereventcontextextrainfo);
        }
    }

    private void showEditFragmentForDiscoverable(final String discoverableId)
    {
        progressSpinnerManager.show();
        executeAction("fetch_program_action", new Callable() {

            final NewProgramCardActivity this$0;
            final String val$discoverableId;

            private Program call()
                throws Exception
            {
                WLog.ifmt(NewProgramCardActivity.TAG, "Fetching program form, discoverableId=%s", new Object[] {
                    discoverableId
                });
                return getProgramCardsHandler().fetchProgram(discoverableId);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = NewProgramCardActivity.this;
                discoverableId = s;
                super();
            }
        });
    }

    private void showEditFragmentForProgram(Program program)
    {
        OcrResults ocrresults = null;
        String s = null;
        ArrayList arraylist = getOcrResult();
        if (arraylist != null)
        {
            ocrresults = OcrResults.OcrResultsExtractor.extractOcrResults(arraylist);
            s = ocrresults.cardNumber;
        }
        if (getProgramCardsHandler().setupProgram(cardInfo, program, s))
        {
            if (ocrresults != null)
            {
                getProgramCardsHandler().loadCardInfoWithOcrResults(cardInfo, ocrresults);
            }
            if (getIntent().hasExtra("extra_merchant_name"))
            {
                cardInfo.setMerchantName(getIntent().getStringExtra("extra_merchant_name"));
                getIntent().removeExtra("extra_merchant_name");
            }
            pushFragment(com/google/android/apps/wallet/wobs/add/EditCardInfoFragment, getAnalyticsProperties().getEditCardInfoFragmentScreen());
        }
    }

    private void showFragment(Class class1, String s)
    {
        analyticsUtil.sendScreen(s, new AnalyticsCustomDimension[0]);
        s = getSupportFragmentManager().beginTransaction();
        int i = com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer;
        FragmentFactory fragmentfactory = fragmentFactory;
        s.replace(i, FragmentFactory.get(class1)).commit();
    }

    private void showSearchFragment()
    {
        pushFragment(com/google/android/apps/wallet/wobs/add/SearchProgramsFragment, getAnalyticsProperties().getSearchProgramsFragmentScreen());
    }

    protected void doOnCreate(Bundle bundle)
    {
        if (bundle == null)
        {
            bundle = getIntent();
            if (bundle.hasExtra("extra_ocr_result_code"))
            {
                triedOcr = true;
                onOcrResult(3, bundle.getIntExtra("extra_ocr_result_code", 10007));
                return;
            }
            if (getIntent().hasExtra("extra_discoverable_id") && getIntent().getStringExtra("extra_discoverable_id") != null)
            {
                showEditFragmentForDiscoverable(getIntent().getStringExtra("extra_discoverable_id"));
                return;
            } else
            {
                showSearchFragment();
                return;
            }
        } else
        {
            decodeImages(false);
            return;
        }
    }

    public abstract ProgramCardsAnalyticsProperties getAnalyticsProperties();

    public final ProgramCardInfo getCardInfo()
    {
        return cardInfo;
    }

    public final String getMerchantName()
    {
        return cardInfo.getMerchantName();
    }

    public abstract ProgramCardsHandler getProgramCardsHandler();

    public abstract ProgramCardsUiProperties getUiProperties();

    public final boolean hasImageCaptureActivity()
    {
        return getProgramCardsHandler().supportsImageCapture();
    }

    public final void intentToImageCapture(int i)
    {
        Preconditions.checkState(hasImageCaptureActivity());
        com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings imagecaptureanalyticsstrings = getAnalyticsProperties().getImageCaptureAnalyticsStrings();
        boolean flag;
        if (i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        triedOcr = flag;
        startActivityForResult(getProgramCardsHandler().getImageCaptureIntent(this, i, imagecaptureanalyticsstrings), i);
    }

    public boolean isMerchantNameEditable()
    {
        return true;
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (super.onActionFailure(s, callable, exception))
        {
            return true;
        }
        if (s.equals("fetch_program_action"))
        {
            progressSpinnerManager.hide();
            onFetchProgramFailure(exception);
            return true;
        }
        if (s.equals("link_card_action"))
        {
            progressSpinnerManager.hide();
            onLinkCardFailure(exception);
        }
        return false;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if (s.equals("fetch_program_action"))
        {
            progressSpinnerManager.hide();
            showEditFragmentForProgram((Program)obj);
        } else
        if (s.equals("link_card_action"))
        {
            progressSpinnerManager.hide();
            onLinkCardSuccess((CallStatus)obj);
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (intent != null)
        {
            intent = intent.getParcelableArrayListExtra("extra_wob_ocr_results");
            getIntent().putParcelableArrayListExtra("extra_wob_ocr_results", intent);
        }
        onOcrResult(i, j);
    }

    public void onBackPressed()
    {
        if (previousFragment == null)
        {
            ocrUserEventData.setCanceled();
            sendOcrLogging();
            finish();
            return;
        } else
        {
            showFragment(previousFragment, previousAnalyticsTag);
            previousFragment = null;
            return;
        }
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        super.onBeforeCreate(bundle);
        if (bundle == null)
        {
            cardInfo = getProgramCardsHandler().createProgramCard();
            ocrUserEventData = new OcrUserEventData();
            ocrUserEventData.startTiming(SystemClock.elapsedRealtime());
            return;
        } else
        {
            cardInfo = (ProgramCardInfo)bundle.getParcelable("card_info");
            triedOcr = bundle.getBoolean("tried_ocr");
            ocrUserEventData = (OcrUserEventData)bundle.getParcelable("ocr_user_event_data");
            return;
        }
    }

    public final void onCardInfoComplete()
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            enableSaving(false);
            progressSpinnerManager.show();
            analyticsUtil.startTiming(getAnalyticsProperties().getGoogleAnalyticsSaveTiming(), getAnalyticsProperties().getCsiSaveTiming());
            executeAction("link_card_action", new LinkCardAction(cardInfo));
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    public final void onDiscoverableProgramSelected(Program program)
    {
        analyticsUtil.sendListItemTap("ChooseMerchant", new AnalyticsCustomDimension[0]);
        showEditFragmentForProgram(program);
    }

    public final void onEditMerchantNameIconClicked()
    {
        showSearchFragment();
    }

    public final void onMerchantNameEntered(String s)
    {
        analyticsUtil.sendKeyboardReturn("AddUserEnteredMerchant", new AnalyticsCustomDimension[0]);
        getIntent().putExtra("extra_merchant_name", s);
        showEditFragmentForDiscoverable(null);
    }

    public final void onMerchantNameSelected(String s)
    {
        analyticsUtil.sendListItemTap("AddUserEnteredMerchant", new AnalyticsCustomDimension[0]);
        getIntent().putExtra("extra_merchant_name", s);
        showEditFragmentForDiscoverable(null);
    }

    protected void onPause()
    {
        progressSpinnerManager.hide();
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("card_info", cardInfo);
        bundle.putBoolean("tried_ocr", triedOcr);
        bundle.putParcelable("ocr_user_event_data", ocrUserEventData);
    }

    public final void onSaveRequested()
    {
        analyticsUtil.sendButtonTap(getAnalyticsProperties().getSaveEvent(), new AnalyticsCustomDimension[0]);
    }

    public final void onUpPressed()
    {
        navigateUpWithIntent(UriIntents.create(this, UriRegistry.getUri(5, new Object[0])));
    }

    public final void onValidationError()
    {
        analyticsUtil.sendUserError(getAnalyticsProperties().getSaveEvent(), new AnalyticsCustomDimension[0]);
    }



}
