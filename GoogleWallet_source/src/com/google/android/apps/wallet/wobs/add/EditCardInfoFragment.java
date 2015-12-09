// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import com.google.android.apps.wallet.wobs.add.api.AddWobsApi;
import com.google.android.libraries.view.thumbnail.Iso7810ThumbnailView;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            RpcAware, ProgramCardsUiProperties, UserDataPromptDisplay, UserDataPrompt, 
//            ProgramCardInfo, ProgramIcons, PromptValueSerialization, ImageInfo, 
//            UserDataWidgetFactory, ProgramCardsHandler, InvalidUserDataEvent

public class EditCardInfoFragment extends WalletFragment
    implements RpcAware
{
    public static interface EditCardInfoCallback
    {

        public abstract ProgramCardInfo getCardInfo();

        public abstract ProgramCardsHandler getProgramCardsHandler();

        public abstract ProgramCardsUiProperties getUiProperties();

        public abstract boolean hasImageCaptureActivity();

        public abstract void intentToImageCapture(int i);

        public abstract boolean isMerchantNameEditable();

        public abstract void onCardInfoComplete();

        public abstract void onEditMerchantNameIconClicked();

        public abstract void onSaveRequested();

        public abstract void onValidationError();
    }


    private static final String TAG = com/google/android/apps/wallet/wobs/add/EditCardInfoFragment.getSimpleName();
    private View backImageView;
    private EditCardInfoCallback callback;
    private View capturedImagesSection;
    private ProgramCardInfo cardInfo;
    private ImageView cardLogo;
    public EventBus eventBus;
    private View frontImageView;
    private ProgramCardsHandler handler;
    private TextView merchantNameText;
    private int mode;
    public Picasso picasso;
    private List promptDisplays;
    public boolean savingEnabled;
    private int selectedColorIndex;
    private int selectedIconIndex;
    private ProgramCardsUiProperties uiProperties;
    private UserDataWidgetFactory userDataWidgetFactory;
    public ValidationGroup validationGroup;

    public EditCardInfoFragment()
    {
        validationGroup = new ValidationGroup();
        savingEnabled = true;
    }

    private int findColorIndex(String s, int i)
    {
        for (int j = 0; j < uiProperties.getColorOptions().length; j++)
        {
            int k = uiProperties.getColorOptions()[j];
            if (toColorHex(getResources().getColor(k)).equals(s))
            {
                return j;
            }
        }

        return i;
    }

    private int findProgramIconIndex(int i, int j)
    {
        for (int k = 0; k < uiProperties.getProgramIcons().length; k++)
        {
            if (i == uiProperties.getProgramIcons()[k])
            {
                return k;
            }
        }

        return j;
    }

    private UserDataPromptDisplay findPromptDisplay(int i)
    {
        for (Iterator iterator = promptDisplays.iterator(); iterator.hasNext();)
        {
            UserDataPromptDisplay userdatapromptdisplay = (UserDataPromptDisplay)iterator.next();
            if (userdatapromptdisplay.getPrompt().getId().intValue() == i)
            {
                return userdatapromptdisplay;
            }
        }

        return null;
    }

    private void setCardInfoColor()
    {
        if (cardInfo.getColorPrompt() != null)
        {
            int i = uiProperties.getProgramIcons()[selectedIconIndex];
            ProgramIcons.setIcon(cardLogo, i);
            int j = uiProperties.getColorOptions()[selectedColorIndex];
            ProgramIcons.setColor(cardLogo, j);
            String s = toColorHex(getResources().getColor(j));
            cardInfo.getColorPrompt().setValue(PromptValueSerialization.serializeLogoInfo(i, s));
        }
    }

    private static String toColorHex(int i)
    {
        return String.format("%06X", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

    private void updateImageView(View view, final ImageInfo imageInfo, int i, int j, int k, final int retakeMode)
    {
        if (imageInfo == null && !callback.hasImageCaptureActivity())
        {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        Object obj = (Iso7810ThumbnailView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.CapturedImage);
        View view1 = view.findViewById(com.google.android.apps.walletnfcrel.R.id.AddPhotoPrompt);
        if (imageInfo != null)
        {
            view1.setVisibility(8);
            ((Iso7810ThumbnailView) (obj)).setVisibility(0);
            ((Iso7810ThumbnailView) (obj)).setImageBytes(imageInfo.getImageBytes());
        } else
        {
            view1.setVisibility(0);
            ((Iso7810ThumbnailView) (obj)).setVisibility(8);
            ((Iso7810ThumbnailView) (obj)).setImageDrawable(null);
        }
        obj = view.findViewById(com.google.android.apps.walletnfcrel.R.id.RetakePrompt);
        if (callback.hasImageCaptureActivity())
        {
            if (imageInfo != null)
            {
                ((View) (obj)).setVisibility(0);
            }
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final EditCardInfoFragment this$0;
                final ImageInfo val$imageInfo;
                final int val$retakeMode;

                public final void onClick(View view2)
                {
                    view2 = callback;
                    int l;
                    if (imageInfo == null)
                    {
                        l = 3;
                    } else
                    {
                        l = retakeMode;
                    }
                    view2.intentToImageCapture(l);
                }

            
            {
                this$0 = EditCardInfoFragment.this;
                imageInfo = imageinfo;
                retakeMode = i;
                super();
            }
            });
            if (imageInfo != null)
            {
                i = k;
            }
            view.setContentDescription(getString(i));
            return;
        } else
        {
            ((View) (obj)).setVisibility(8);
            view.setContentDescription(getString(j));
            return;
        }
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j == -1 && i == 791)
        {
            selectedIconIndex = intent.getIntExtra("selected_icon_index", 0);
            selectedColorIndex = intent.getIntExtra("selected_color_index", 0);
            setCardInfoColor();
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            callback = (EditCardInfoCallback)activity;
            handler = callback.getProgramCardsHandler();
            uiProperties = callback.getUiProperties();
            cardInfo = callback.getCardInfo();
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException(String.valueOf(activity.getClass().getSimpleName()).concat(" must implement EditCardInfoCallback"));
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        userDataWidgetFactory = new UserDataWidgetFactory(getActivity(), getLayoutInflater(bundle));
        if (bundle != null)
        {
            savingEnabled = bundle.getBoolean("saving_enabled");
        }
        mode = 1;
        if (getArguments() != null)
        {
            mode = getArguments().getInt("edit_mode", 1);
        }
        getActivity().setTitle(uiProperties.getEditCardInfoFragmentTitle(mode));
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        int i;
        if (mode == 2)
        {
            i = com.google.android.apps.walletnfcrel.R.string.button_done;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.string.button_save;
        }
        menu = menu.add(0, 58, 1, i);
        menu.setShowAsAction(2);
        menu.setEnabled(savingEnabled);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_edit_card_info, viewgroup, false);
        cardLogo = (ImageView)Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.CardLogo);
        viewgroup = Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.ClickableIndicator);
        if (callback.isMerchantNameEditable())
        {
            ImageView imageview = (ImageView)Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.EditCardTitleButton);
            imageview.setVisibility(0);
            imageview.setOnClickListener(new android.view.View.OnClickListener() {

                final EditCardInfoFragment this$0;

                public final void onClick(View view)
                {
                    callback.onEditMerchantNameIconClicked();
                }

            
            {
                this$0 = EditCardInfoFragment.this;
                super();
            }
            });
        }
        merchantNameText = (TextView)Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.CardTitle);
        Object obj = cardInfo.getColorPrompt();
        Object obj1;
        if (obj != null)
        {
            cardLogo.setOnClickListener(new android.view.View.OnClickListener() {

                final EditCardInfoFragment this$0;

                public final void onClick(View view)
                {
                    view = AddWobsApi.createCustomizeProgramCardActivityIntent(getActivity(), merchantNameText.getText().toString(), null, uiProperties.getProgramIcons(), uiProperties.getProgramIconNames(), selectedIconIndex, uiProperties.getColorOptions(), uiProperties.getColorNames(), selectedColorIndex);
                    startActivityForResult(view, 791);
                }

            
            {
                this$0 = EditCardInfoFragment.this;
                super();
            }
            });
            viewgroup.setVisibility(0);
            TextView textview;
            if (!Strings.isNullOrEmpty(((UserDataPrompt) (obj)).getValue()))
            {
                viewgroup = ((UserDataPrompt) (obj)).getValue();
            } else
            {
                viewgroup = ((UserDataPrompt) (obj)).getPrefilledValue();
            }
            if (!Strings.isNullOrEmpty(viewgroup))
            {
                viewgroup = PromptValueSerialization.deserializeLogoInfo(viewgroup);
                selectedIconIndex = findProgramIconIndex(((PromptValueSerialization.LogoInfo) (viewgroup)).programIcon.intValue(), 0);
                selectedColorIndex = findColorIndex(((PromptValueSerialization.LogoInfo) (viewgroup)).colorHex, 0);
            }
            setCardInfoColor();
        } else
        if (cardInfo.getLogoUrl() != null)
        {
            picasso.load(Uri.parse(cardInfo.getLogoUrl())).resizeDimen(com.google.android.apps.walletnfcrel.R.dimen.wobs_card_preview_logo_frame_size, com.google.android.apps.walletnfcrel.R.dimen.wobs_card_preview_logo_frame_size).into(cardLogo);
        }
        merchantNameText.setText(cardInfo.getMerchantName());
        viewgroup = cardInfo.getAddMsgTitle();
        obj = cardInfo.getAddMsgContent();
        obj1 = Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.AddMessageSection);
        if (viewgroup != null || obj != null)
        {
            ((View) (obj1)).setVisibility(0);
            obj1 = (TextView)Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.AddMsgTitle);
            textview = (TextView)Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.AddMsgContent);
            ((TextView) (obj1)).setText(Strings.nullToEmpty(viewgroup));
            Views.setTextOrHide(textview, Strings.emptyToNull(((String) (obj))));
        } else
        {
            ((View) (obj1)).setVisibility(8);
        }
        viewgroup = (ViewGroup)Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.UserDataPrompts);
        promptDisplays = Lists.newArrayList();
        for (obj = cardInfo.getFormPrompts().iterator(); ((Iterator) (obj)).hasNext(); validationGroup.addInput(((UserDataPromptDisplay) (obj1)).getView()))
        {
            obj1 = (UserDataPrompt)((Iterator) (obj)).next();
            obj1 = userDataWidgetFactory.createInput(((UserDataPrompt) (obj1)), viewgroup);
            promptDisplays.add(obj1);
        }

        handler.placeUserDataPrompts(promptDisplays, viewgroup, layoutinflater, cardInfo);
        handler.onEditCardInfoViewInflated(layoutinflater, bundle, mode, cardInfo);
        capturedImagesSection = Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.CapturedImagesHeadedSection);
        frontImageView = Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.FrontImage);
        backImageView = Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.BackImage);
        setHasOptionsMenu(true);
        return bundle;
    }

    public final void onDestroy()
    {
        super.onDestroy();
    }

    public void onInvalidUserDataEvent(InvalidUserDataEvent invaliduserdataevent)
    {
        invaliduserdataevent = invaliduserdataevent.getPromptIds().iterator();
        do
        {
            if (!invaliduserdataevent.hasNext())
            {
                break;
            }
            UserDataPromptDisplay userdatapromptdisplay = findPromptDisplay(((Integer)invaliduserdataevent.next()).intValue());
            if (userdatapromptdisplay != null)
            {
                userdatapromptdisplay.getValidatedView().setInvalidState("");
            }
        } while (true);
        validationGroup.focusOnFirstError();
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag1;
        flag1 = true;
        if (menuitem.getItemId() != 58)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (savingEnabled) goto _L2; else goto _L1
_L1:
        boolean flag;
        WLog.v(TAG, "ignoring save menu item selected");
        flag = super.onOptionsItemSelected(menuitem);
_L4:
        return flag;
_L2:
        callback.onSaveRequested();
        Preconditions.checkNotNull(cardInfo);
        if (validationGroup.checkForErrors())
        {
            validationGroup.focusOnFirstError();
            callback.onValidationError();
            return true;
        }
        flag = flag1;
        if (!handler.processCustomSection(cardInfo, mode)) goto _L4; else goto _L3
_L3:
        Views.hideSoftKeyboard(getActivity(), getView());
        flag = flag1;
        if (handler.showAddProgramCardWarningDialogIfNecessary(callback, cardInfo)) goto _L4; else goto _L5
_L5:
        callback.onCardInfoComplete();
        return true;
        return super.onOptionsItemSelected(menuitem);
    }

    public final void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        eventBus.register(this);
        if (callback.hasImageCaptureActivity() || cardInfo.getImages() != null)
        {
            capturedImagesSection.setVisibility(0);
            updateImageView(frontImageView, cardInfo.getImage(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT), com.google.android.apps.walletnfcrel.R.string.wobs_add_photo_description, com.google.android.apps.walletnfcrel.R.string.wobs_card_front_description, com.google.android.apps.walletnfcrel.R.string.wobs_retake_card_front_description, 1);
            updateImageView(backImageView, cardInfo.getImage(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK), com.google.android.apps.walletnfcrel.R.string.wobs_add_photo_description, com.google.android.apps.walletnfcrel.R.string.wobs_card_back_description, com.google.android.apps.walletnfcrel.R.string.wobs_retake_card_back_description, 0);
            return;
        } else
        {
            capturedImagesSection.setVisibility(8);
            return;
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("saving_enabled", savingEnabled);
    }

    public final void setSavingEnabled(boolean flag)
    {
        if (flag != savingEnabled)
        {
            savingEnabled = flag;
            getActivity().supportInvalidateOptionsMenu();
        }
    }






}
