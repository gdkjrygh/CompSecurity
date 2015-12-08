// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me.lyft.android.IUserSession;
import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.InviteFriendsAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.MenuButtonToolbar;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.SocialSharing;
import me.lyft.android.infrastructure.lyft.invite.InviteRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.logging.L;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.providers.UserContact;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.SecureSubscriber;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.ViewExtensions;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.invites:
//            ClipboardUtil, SocialIntentProvider

public class InviteScreenView extends LinearLayout
{

    static final int ANIMATION_DURATION = 250;
    static final int SMS_INTENT_DELAY = 250;
    ActivityController activityController;
    final Interpolator animationInterpolator = new AccelerateDecelerateInterpolator() {

        final InviteScreenView this$0;

        public float getInterpolation(float f)
        {
            f = super.getInterpolation(f);
            updatePosition();
            return f;
        }

        void updatePosition()
        {
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)contactsList.getLayoutParams();
            layoutparams.bottomMargin = sendInvitesButton.getHeight() - (int)sendInvitesButton.getTranslationY();
            contactsList.setLayoutParams(layoutparams);
        }

            
            {
                this$0 = InviteScreenView.this;
                super();
            }
    };
    Binder binder;
    MessageBus bus;
    IConstantsProvider constantsProvider;
    ContactsAdapter contactsAdapter;
    ListView contactsList;
    LinearLayout contactsListEmptyView;
    ContactsProvider contactsProvider;
    IDevice device;
    DialogFlow dialogFlow;
    final Handler handler = new Handler(Looper.getMainLooper());
    FrameLayout headerView;
    View heroContainer;
    View invitesHeaderContainer;
    TextView invitesHeaderText;
    TextView invitesReferralCodeText;
    boolean isShowingSearch;
    ILyftApi lyftApi;
    final android.view.View.OnClickListener onCopyReferralCodeClicked = new android.view.View.OnClickListener() {

        final InviteScreenView this$0;

        public void onClick(View view)
        {
            copyReferralCodeToClipboard();
        }

            
            {
                this$0 = InviteScreenView.this;
                super();
            }
    };
    final Action1 onMeasureAction = new Action1() {

        final InviteScreenView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            if (!contactsAdapter.isEmpty()) goto _L2; else goto _L1
_L1:
            int i = 0;
_L3:
            int j;
            try
            {
                unit = (android.widget.AbsListView.LayoutParams)headerView.getLayoutParams();
                unit.height = i;
                headerView.setLayoutParams(unit);
                heroContainer.setVisibility(0);
                unit = (android.widget.FrameLayout.LayoutParams)contactsListEmptyView.getLayoutParams();
                unit.topMargin = heroContainer.getHeight();
                contactsListEmptyView.setLayoutParams(unit);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Unit unit)
            {
                L.e(unit, "initHeroViewPaddingRunnable", new Object[0]);
            }
            break MISSING_BLOCK_LABEL_136;
_L2:
            i = heroContainer.getHeight();
            j = headerView.getHeight();
            i += j;
              goto _L3
        }

            
            {
                this$0 = InviteScreenView.this;
                super();
            }
    };
    final android.widget.AbsListView.OnScrollListener onScrollListener = new android.widget.AbsListView.OnScrollListener() {

        final TimeInterpolator invitesHeaderInterpolator = new _cls1();
        final InviteScreenView this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            if (abslistview.getCount() > 0 && i == 0)
            {
                abslistview = abslistview.getChildAt(0);
                if (abslistview != null)
                {
                    float f = abslistview.getHeight();
                    float f1 = abslistview.getBottom();
                    setScaleAndAlpha(invitesHeaderContainer, invitesHeaderInterpolator.getInterpolation(f - f1));
                }
            }
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
        }

            
            {
                this$0 = InviteScreenView.this;
                super();
            }
    };
    IProgressController progressController;
    View sendInvitesButton;
    private final ActionAnalytics showInvitesAnalytics = InviteFriendsAnalytics.createShownInviteFriends();
    SlideMenuController slideMenuController;
    SocialIntentProvider socialIntentProvider;
    MenuButtonToolbar toolbar;
    final Action1 toolbarItemAction = new Action1() {

        final InviteScreenView this$0;

        public void call(Integer integer)
        {
            switch (integer.intValue())
            {
            case 2131558438: 
            case 2131558439: 
            default:
                return;

            case 2131558440: 
                showBottomSheet();
                return;

            case 2131558437: 
                integer = contactsAdapter.getData();
                List list = contactsAdapter.getCheckedData();
                List list1 = contactsAdapter.getDisabledData();
                dialogFlow.show(new me.lyft.android.ui.splitfare.SplitFareDialogs.ContactsSearchDialog(integer, list, list1));
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = InviteScreenView.this;
                super();
            }
    };
    IUserSession userSession;
    IViewErrorHandler viewErrorHandler;

    public InviteScreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isShowingSearch = false;
        Scoop.a(this).b(this);
    }

    private void updateButtonAndTextStates()
    {
        updateButtonAndTextStates(250);
    }

    void checkAllItems(boolean flag)
    {
        for (int i = 0; i < contactsList.getCount(); i++)
        {
            contactsList.setItemChecked(i, flag);
        }

    }

    void copyReferralCodeToClipboard()
    {
        InviteFriendsAnalytics.trackShareInvites("copy_to_clipboard").trackSuccess();
        String s1 = (String)Objects.firstNonNull(userSession.getUser().getReferralUrl(), "");
        Context context = getContext();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = getResources().getString(0x7f070103, new Object[] {
                Objects.firstNonNull(userSession.getUser().getReferralCode(), "")
            });
        }
        ClipboardUtil.copyToClipboard(context, s);
        dialogFlow.show(new Toast(getResources().getString(0x7f0700c6)));
    }

    void loadContacts()
    {
        contactsProvider.create().emails().phones().observe().subscribe(new SecureSubscriber() {

            final InviteScreenView this$0;

            public volatile void onSafeNext(Object obj)
            {
                onSafeNext((List)obj);
            }

            public void onSafeNext(List list)
            {
                contactsAdapter.swapData(list);
                contactsList.setEmptyView(contactsListEmptyView);
                if (heroContainer.getHeight() != 0 && heroContainer.getWidth() != 0)
                {
                    onMeasureAction.call(null);
                } else
                {
                    binder.bind(ViewExtensions.onLoadedObservable(heroContainer), onMeasureAction);
                }
                if (list.isEmpty())
                {
                    list = "show_social_options";
                } else
                {
                    list = "show_contact_list";
                }
                showInvitesAnalytics.trackSuccess(list);
            }

            
            {
                this$0 = InviteScreenView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            showInvitesAnalytics.trackInitiation();
            binder = Binder.attach(this);
            binder.bind(toolbar.observeItemClick(), toolbarItemAction);
            binder.bind(bus.observe(me/lyft/android/ui/splitfare/ContactsSearchDialogView$ContactSelectedEvent), new Action1() {

                final InviteScreenView this$0;

                public volatile void call(Object obj)
                {
                    call((UserContact)obj);
                }

                public void call(UserContact usercontact)
                {
                    int i = contactsAdapter.getData().indexOf(usercontact);
                    if (i != -1)
                    {
                        contactsAdapter.toggleChecked(i);
                        updateButtonAndTextStates();
                        contactsList.setSelection(i);
                    }
                }

            
            {
                this$0 = InviteScreenView.this;
                super();
            }
            });
            binder.bind(dialogFlow.observeDialogChange(), new Action1() {

                final InviteScreenView this$0;

                public void call(Screen screen)
                {
                    isShowingSearch = screen instanceof me.lyft.android.ui.splitfare.SplitFareDialogs.ContactsSearchDialog;
                    updateButtonAndTextStates(0);
                }

                public volatile void call(Object obj)
                {
                    call((Screen)obj);
                }

            
            {
                this$0 = InviteScreenView.this;
                super();
            }
            });
            slideMenuController.enableMenu();
            loadContacts();
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        handler.removeCallbacksAndMessages(null);
        slideMenuController.disableMenu();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.a(this, this);
            toolbar.clearItems().setTitle(getResources().getString(0x7f0701be)).addItem(0x7f0d0028, 0x7f0201b7);
            socialIntentProvider = (new SocialIntentProvider.Builder()).twitter((String)Objects.firstNonNull(constantsProvider.getConstants().getSocialSharing().getInviteTwitterShareText(), getResources().getString(0x7f07010a, new Object[] {
                Objects.firstNonNull(userSession.getUser().getReferralUrl(), "")
            }))).build(getContext().getPackageManager(), userSession, constantsProvider, device);
            headerView = new FrameLayout(getContext());
            headerView.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 0));
            headerView.setOnClickListener(onCopyReferralCodeClicked);
            heroContainer.setOnClickListener(onCopyReferralCodeClicked);
            contactsList.addHeaderView(headerView, null, false);
            contactsAdapter = new ContactsAdapter(LayoutInflater.from(getContext()));
            contactsList.setAdapter(contactsAdapter);
            contactsList.setOnScrollListener(onScrollListener);
            String s = constantsProvider.getConstants().getReferralHeaderText();
            if (!Strings.isNullOrEmpty(s))
            {
                invitesHeaderText.setText(s);
            }
            s = userSession.getUser().getReferralCode();
            if (!Strings.isNullOrEmpty(s))
            {
                invitesReferralCodeText.setText(s);
                return;
            }
        }
    }

    void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        contactsAdapter.toggleChecked(i - contactsList.getHeaderViewsCount());
        if (i == 0)
        {
            copyReferralCodeToClipboard();
            return;
        } else
        {
            updateButtonAndTextStates();
            return;
        }
    }

    void sendInvites()
    {
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        ArrayList arraylist = new ArrayList();
        final StringBuilder phones = new StringBuilder();
        Object obj = contactsAdapter.getCheckedData();
        final ActionAnalytics analytics = InviteFriendsAnalytics.trackSendInvites(((List) (obj)).size());
        String s;
        if (Build.MANUFACTURER.toLowerCase().contains("samsung"))
        {
            s = ", ";
        } else
        {
            s = "; ";
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            UserContact usercontact = (UserContact)((Iterator) (obj)).next();
            me.lyft.android.infrastructure.lyft.invite.InviteDTO invitedto = usercontact.createEmailInvite();
            if (invitedto != null)
            {
                arraylist.add(invitedto);
                atomicboolean.set(true);
            }
            invitedto = usercontact.createPhoneInvite();
            if (invitedto != null)
            {
                if (phones.length() > 0)
                {
                    phones.append(s);
                }
                phones.append(usercontact.getPhoneNumber().getPhoneNumber());
                arraylist.add(invitedto);
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            analytics.trackFailure("empty_invite_list");
            return;
        } else
        {
            progressController.disableUI();
            progressController.showProgress();
            binder.bind(lyftApi.sendInvites(new InviteRequestDTO(arraylist)), new AsyncCall() {

                final InviteScreenView this$0;
                final ActionAnalytics val$analytics;
                final StringBuilder val$phones;

                public void onFail(Throwable throwable)
                {
                    analytics.trackFailure(throwable);
                    viewErrorHandler.handle(throwable);
                }

                public volatile void onSuccess(Object obj1)
                {
                    onSuccess((Unit)obj1);
                }

                public void onSuccess(Unit unit)
                {
                    checkAllItems(false);
                    updateButtonAndTextStates();
                    if (!Strings.isNullOrEmpty(phones.toString()))
                    {
                        startGroupSmsIntentWithDelay(phones.toString(), 250);
                    }
                    analytics.trackSuccess();
                    dialogFlow.show(new me.lyft.android.ui.passenger.PassengerDialogs.InvitesSentDialog());
                }

                public void onUnsubscribe()
                {
                    progressController.enableUI();
                    progressController.hideProgress();
                }

            
            {
                this$0 = InviteScreenView.this;
                analytics = actionanalytics;
                phones = stringbuilder;
                super();
            }
            });
            return;
        }
    }

    void setScaleAndAlpha(View view, float f)
    {
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(f);
    }

    void shareWithEmail()
    {
        startActivityOrShowErrorToast(socialIntentProvider.getGmailShareItem(), 0x7f07036e);
    }

    void shareWithFacebook()
    {
        startActivityOrShowErrorToast(socialIntentProvider.getFacebookShareItem(), 0x7f07036d);
    }

    void shareWithSms()
    {
        startActivityOrShowErrorToast(socialIntentProvider.getHangoutsShareItem(), 0x7f07036f);
    }

    void shareWithTwitter()
    {
        startActivityOrShowErrorToast(socialIntentProvider.getTwitterShareItem(), 0x7f070370);
    }

    void showBottomSheet()
    {
        dialogFlow.show(new InviteDialogs.SocialSheet());
    }

    void startActivityOrShowErrorToast(SocialIntentProvider.ShareItem shareitem, int i)
    {
        ActionAnalytics actionanalytics = InviteFriendsAnalytics.trackShareInvites(shareitem.name);
        shareitem = socialIntentProvider.createShareIntent(shareitem);
        if (shareitem != null)
        {
            actionanalytics.trackSuccess();
            activityController.startActivity(shareitem);
            return;
        } else
        {
            shareitem = getResources().getString(i);
            actionanalytics.trackFailure(shareitem);
            dialogFlow.show(new Toast(shareitem));
            return;
        }
    }

    void startGroupSmsIntent(String s)
    {
        String s2 = constantsProvider.getConstants().getDefaultSmsInviteText();
        SocialIntentProvider socialintentprovider = socialIntentProvider;
        String s1 = s2;
        if (Strings.isNullOrEmpty(s2))
        {
            s1 = getResources().getString(0x7f070103, new Object[] {
                Objects.firstNonNull(userSession.getUser().getReferralCode(), "")
            });
        }
        s = socialintentprovider.createSmsIntent(s, s1);
        if (s != null)
        {
            activityController.startActivity(s);
        }
    }

    void startGroupSmsIntentWithDelay(final String phones, int i)
    {
        handler.postDelayed(new Runnable() {

            final InviteScreenView this$0;
            final String val$phones;

            public void run()
            {
                try
                {
                    startGroupSmsIntent(phones);
                    return;
                }
                catch (Exception exception)
                {
                    return;
                }
            }

            
            {
                this$0 = InviteScreenView.this;
                phones = s;
                super();
            }
        }, i);
    }

    void updateButtonAndTextStates(int i)
    {
        int j = contactsAdapter.getCheckedItemCount();
        float f;
        boolean flag;
        if (j > 0)
        {
            toolbar.hideItem(0x7f0d0028);
        } else
        {
            toolbar.showItem(0x7f0d0028);
        }
        if (j > 0 && !isShowingSearch)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f = 0.0F;
        } else
        {
            f = sendInvitesButton.getHeight();
        }
        if (f != sendInvitesButton.getTranslationY())
        {
            sendInvitesButton.clearAnimation();
            sendInvitesButton.animate().translationY(f).setDuration(i).setInterpolator(animationInterpolator).start();
        }
    }



    // Unreferenced inner class me/lyft/android/ui/invites/InviteScreenView$8$1

/* anonymous class */
    class _cls1
        implements TimeInterpolator
    {

        final float HEADER_SCALE_FACTOR = 0.0009F;
        final float MIN_HEADER_SCALE = 0.75F;
        final _cls8 this$1;

        public float getInterpolation(float f)
        {
            return Math.max(Math.min(1.0F - 0.0009F * f, 1.0F), 0.75F);
        }

            
            {
                this$1 = _cls8.this;
                super();
            }
    }

}
