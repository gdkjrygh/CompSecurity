// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.chat.picker.InputMethodOverlay;
import com.skype.android.app.main.EditPropertyActivity;
import com.skype.android.app.main.OnDrawerVisibilityChanged;
import com.skype.android.app.settings.SnoozeNotificationHelper;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.signin.SignoutHelper;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.MojiContent;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.CallForwarding;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.SkypeCredit;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.widget.ChatEditText;
import com.skype.android.widget.SkypeAvatarView;
import com.skype.android.widget.SymbolView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.account:
//            PresenceControlAdapter, BuyCreditDialog, BuyOnlineNumberDialog, CallForwardingActivity, 
//            BuyCallForwardingDialog, ChangeAvatarDialog, AccountProfileInfoActivity

public class MyInfoFragment extends SkypeFragment
    implements TextWatcher, android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener, com.skype.android.app.chat.picker.ExtensiblePickerDialogFragment.Callback, com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaSendCallback
{
    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a ACCOUNT;
        public static final a CALL_FORWARDING;
        public static final a CREDIT;
        public static final a SETTINGS;
        public static final a SIGNOUT;
        public static final a SKYPE_NUMBER;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/account/MyInfoFragment$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            ACCOUNT = new a("ACCOUNT", 0);
            CREDIT = new a("CREDIT", 1);
            SKYPE_NUMBER = new a("SKYPE_NUMBER", 2);
            CALL_FORWARDING = new a("CALL_FORWARDING", 3);
            SIGNOUT = new a("SIGNOUT", 4);
            SETTINGS = new a("SETTINGS", 5);
            $VALUES = (new a[] {
                ACCOUNT, CREDIT, SKYPE_NUMBER, CALL_FORWARDING, SIGNOUT, SETTINGS
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class b
    {

        Button button;
        RelativeLayout container;
        com.skype.Contact.AVAILABILITY status;
        SymbolView statusView;

        private b()
        {
        }

    }


    private static final int BACKGROUND_IMAGE_ALPHA = 25;
    private static final int PRESENCE_BUTTON_IDS[] = {
        0x7f100460, 0x7f100476
    };
    private static final com.skype.Contact.AVAILABILITY PRESENCE_BUTTON_PRESENCE_TYPES[];
    private static final int PRESENCE_BUTTON_TITLES[] = {
        0x7f080294, 0x7f0802c8
    };
    private static final int REQUEST_MOOD_CHANGE = 1;
    private static final Logger log = Logger.getLogger("MyInfoFragment");
    Account account;
    TextView accountFullName;
    View accountNameContainer;
    TextView accountNameText;
    Analytics analytics;
    View avatarImage;
    RelativeLayout backGroundLayout;
    private List buttonHoldersList;
    private CallForwarding callForwarding;
    ViewGroup callForwardingRoot;
    ChatServiceMonitor chatServiceMonitor;
    ChatText chatText;
    ContactUtil contactUtil;
    SkypeCredit credit;
    DefaultAvatars defaultAvatars;
    EcsConfiguration ecsConfiguration;
    SymbolView emoticonButton;
    ImageCache imageCache;
    private InputMethodOverlay inputMethodOverlay;
    LayoutExperience layoutExperience;
    SkyLib lib;
    ObjectIdMap map;
    ChatEditText moodEdit;
    Navigation nav;
    NavigationUrl navUrl;
    private PresenceControlAdapter presenceAdapter;
    private Spinner presenceSelector;
    private SnoozeNotificationHelper snoozeNotificationHelper;
    ContactMoodCache spannedText;
    TypeFaceFactory typeFaceFactory;
    private boolean unifiedPresence;
    UserPreferences userPrefs;

    public MyInfoFragment()
    {
    }

    private String callForwardNumber()
    {
        if (callForwarding == null)
        {
            callForwarding = new CallForwarding(lib, account);
        }
        return ((com.skype.android.util.CallForwarding.Number)callForwarding.a().get(0)).c;
    }

    private String getCallForwardingInfo()
    {
        if (TextUtils.isEmpty(account.getOfflineCallforwardProp()))
        {
            return getString(0x7f0802c6);
        } else
        {
            return callForwardNumber();
        }
    }

    private String getCallFowardingDescription()
    {
        if (TextUtils.isEmpty(account.getOfflineCallforwardProp()))
        {
            return getString(0x7f080059);
        } else
        {
            return getString(0x7f080058, new Object[] {
                callForwardNumber()
            });
        }
    }

    private String getHeader(a a1)
    {
        static final class _cls4
        {

            static final int $SwitchMap$com$skype$PROPKEY[];
            static final int $SwitchMap$com$skype$android$app$account$MyInfoFragment$Field[];

            static 
            {
                $SwitchMap$com$skype$android$app$account$MyInfoFragment$Field = new int[a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$account$MyInfoFragment$Field[a.ACCOUNT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$android$app$account$MyInfoFragment$Field[a.CREDIT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$android$app$account$MyInfoFragment$Field[a.SKYPE_NUMBER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$account$MyInfoFragment$Field[a.CALL_FORWARDING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$account$MyInfoFragment$Field[a.SIGNOUT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$account$MyInfoFragment$Field[a.SETTINGS.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_MOOD_TEXT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_MOOD_TIMESTAMP.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVATAR_IMAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_OFFLINE_CALLFORWARD.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.skype.android.app.account.MyInfoFragment.Field[a1.ordinal()])
        {
        default:
            return "";

        case 2: // '\002'
            return getString(0x7f080274);

        case 3: // '\003'
            return getString(0x7f080278);

        case 4: // '\004'
            return getString(0x7f080232);
        }
    }

    private int getId(a a1)
    {
        switch (_cls4..SwitchMap.com.skype.android.app.account.MyInfoFragment.Field[a1.ordinal()])
        {
        case 1: // '\001'
        default:
            return 0x7f100463;

        case 2: // '\002'
            return 0x7f100462;

        case 3: // '\003'
            return 0x7f10046f;

        case 4: // '\004'
            return 0x7f100470;

        case 5: // '\005'
            return 0x7f100465;

        case 6: // '\006'
            return 0x7f100464;
        }
    }

    private com.skype.android.widget.SymbolElement.SymbolCode getSymbol(a a1)
    {
        switch (_cls4..SwitchMap.com.skype.android.app.account.MyInfoFragment.Field[a1.ordinal()])
        {
        default:
            return com.skype.android.widget.SymbolElement.SymbolCode.am;

        case 1: // '\001'
            return com.skype.android.widget.SymbolElement.SymbolCode.am;

        case 2: // '\002'
            if (layoutExperience.isMultipane())
            {
                return com.skype.android.widget.SymbolElement.SymbolCode.dh;
            } else
            {
                return com.skype.android.widget.SymbolElement.SymbolCode.da;
            }

        case 3: // '\003'
            return com.skype.android.widget.SymbolElement.SymbolCode.P;

        case 4: // '\004'
            return com.skype.android.widget.SymbolElement.SymbolCode.L;

        case 5: // '\005'
            return com.skype.android.widget.SymbolElement.SymbolCode.dC;

        case 6: // '\006'
            return com.skype.android.widget.SymbolElement.SymbolCode.dA;
        }
    }

    private String getTextProp(a a1)
    {
        switch (_cls4..SwitchMap.com.skype.android.app.account.MyInfoFragment.Field[a1.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            if (layoutExperience.isMultipane())
            {
                return getString(0x7f08034a);
            } else
            {
                return getString(0x7f080287);
            }

        case 2: // '\002'
            return credit.h();

        case 3: // '\003'
            if (TextUtils.isEmpty(account.getSkypeinNumbersProp()))
            {
                return getString(0x7f0802c6);
            } else
            {
                return account.getSkypeinNumbersProp();
            }

        case 4: // '\004'
            return getCallForwardingInfo();

        case 5: // '\005'
            return getString(0x7f08018e);

        case 6: // '\006'
            return getString(0x7f080188);
        }
    }

    private void initAccountSublayout(View view)
    {
        if (accountFullName != null)
        {
            accountFullName.setOnClickListener(null);
        }
        if (accountNameText != null)
        {
            accountNameText.setOnClickListener(null);
        }
        updateUsernameInfo();
        credit.a();
        a aa[] = a.values();
        int j = aa.length;
        int i = 0;
        while (i < j) 
        {
            a a1 = aa[i];
            int k = getId(a1);
            View view1 = view.findViewById(k);
            if (view1 != null)
            {
                SymbolView symbolview = (SymbolView)view1.findViewById(0x7f10046e);
                Object obj = (TextView)view1.findViewById(0x7f10020a);
                TextView textview = (TextView)view1.findViewById(0x7f10020b);
                view1.setFocusable(true);
                symbolview.setSymbolCode(getSymbol(a1));
                if (obj != null)
                {
                    String s = getHeader(a1);
                    if (TextUtils.isEmpty(s))
                    {
                        ((TextView) (obj)).setVisibility(8);
                    } else
                    {
                        ((TextView) (obj)).setText(s);
                    }
                }
                textview.setText(getTextProp(a1));
                if (obj == null || TextUtils.isEmpty(((TextView) (obj)).getText()))
                {
                    obj = "";
                } else
                {
                    obj = (new StringBuilder()).append(((TextView) (obj)).getText()).append(", ").toString();
                }
                view1.setContentDescription(getString(0x7f080084, new Object[] {
                    (new StringBuilder()).append(((String) (obj))).append(textview.getText()).toString()
                }));
                if (k == 0x7f100463)
                {
                    view1.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyInfoFragment this$0;

                        public final void onClick(View view2)
                        {
                            if (layoutExperience.isMultipane())
                            {
                                navUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.h);
                                return;
                            } else
                            {
                                view2 = new Intent(getActivity(), com/skype/android/app/account/AccountProfileInfoActivity);
                                startActivity(view2);
                                return;
                            }
                        }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
                    });
                } else
                if (k == 0x7f100462)
                {
                    view1.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyInfoFragment this$0;

                        public final void onClick(View view2)
                        {
                            (new BuyCreditDialog()).show(getFragmentManager());
                        }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
                    });
                    view1.setContentDescription(getString(0x7f08007c, new Object[] {
                        getTextProp(a1)
                    }));
                } else
                if (k == 0x7f10046f)
                {
                    view1.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyInfoFragment this$0;

                        public final void onClick(View view2)
                        {
                            (new BuyOnlineNumberDialog()).show(getFragmentManager());
                        }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
                    });
                    view1.setContentDescription(getString(0x7f080084, new Object[] {
                        obj
                    }));
                } else
                if (k == 0x7f100470)
                {
                    view1.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyInfoFragment this$0;

                        public final void onClick(View view2)
                        {
                            if (account.getCapabilityStatus(com.skype.Contact.CAPABILITY.CAPABILITY_CALL_FORWARD).m_return == com.skype.Account.CAPABILITYSTATUS.CAPABILITY_EXISTS || credit.b())
                            {
                                view2 = new Intent(getActivity(), com/skype/android/app/account/CallForwardingActivity);
                                startActivity(view2);
                                return;
                            } else
                            {
                                (new BuyCallForwardingDialog()).show(getFragmentManager());
                                return;
                            }
                        }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
                    });
                    view1.setContentDescription(getCallFowardingDescription());
                } else
                if (k == 0x7f100465)
                {
                    view1.setVisibility(0);
                    view1.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyInfoFragment this$0;

                        public final void onClick(View view2)
                        {
                            performSignout();
                        }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
                    });
                } else
                if (k == 0x7f100464)
                {
                    view1.setOnClickListener(new android.view.View.OnClickListener() {

                        final MyInfoFragment this$0;

                        public final void onClick(View view2)
                        {
                            nav.settings();
                        }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
                    });
                }
            }
            i++;
        }
        snoozeNotificationHelper.handleSnoozeButtonLayout(view, layoutExperience.isMultipane());
    }

    private void initMoodSublayout(View view)
    {
        if (!layoutExperience.isMultipane())
        {
            moodEdit.setOnClickListener(new android.view.View.OnClickListener() {

                final MyInfoFragment this$0;

                public final void onClick(View view1)
                {
                    view1 = nav.intentFor(account, com/skype/android/app/main/EditPropertyActivity);
                    view1.putExtra("com.skype.propkey", PROPKEY.CONTACT_MOOD_TEXT);
                    startActivityForResult(view1, 1);
                }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
            });
        } else
        {
            moodEdit.forceImeAction(true);
            moodEdit.setOnEditorActionListener(this);
            moodEdit.addTextChangedListener(this);
            moodEdit.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(300)
            });
            if (emoticonButton != null)
            {
                emoticonButton.setOnClickListener(new android.view.View.OnClickListener() {

                    final MyInfoFragment this$0;

                    public final void onClick(View view1)
                    {
                        inputMethodOverlay.showWithInputMethod(moodEdit);
                    }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
                });
            }
            getActivity().getWindow().setSoftInputMode(3);
        }
        moodEdit.addOnAttachStateChangeListener(new SpannedAnimationDrawableCallback(moodEdit));
        moodEdit.setContentDescription(getString(0x7f0800a0));
        avatarImage.setOnClickListener(new android.view.View.OnClickListener() {

            final MyInfoFragment this$0;

            public final void onClick(View view1)
            {
                (new ChangeAvatarDialog()).show(getFragmentManager());
            }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
        });
        updateAvatar();
    }

    private void initPresenceSublayout(View view)
    {
        presenceSelector = (Spinner)view.findViewById(0x7f100471);
        if (unifiedPresence)
        {
            presenceAdapter = new PresenceControlAdapter(getActivity(), contactUtil);
            presenceSelector.setAdapter(presenceAdapter);
            presenceSelector.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final MyInfoFragment this$0;

                public final void onItemSelected(AdapterView adapterview, View view1, int i, long l)
                {
                    adapterview = (PresenceControlAdapter.PresenceModel)presenceSelector.getItemAtPosition(i);
                    if (i != presenceAdapter.getSelectedPosition())
                    {
                        presenceAdapter.setSelectedPosition(i);
                        account.setAvailability(adapterview.getAvailabilityStatus());
                        analytics.a(AnalyticsEvent.W, adapterview.getAvailabilityStatus().toString());
                    }
                    updateAvatarPresence();
                }

                public final void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
            });
            ViewUtil.a(presenceSelector);
            return;
        } else
        {
            presenceSelector.setVisibility(8);
            return;
        }
    }

    private void initStatusSublayout(View view)
    {
        int i = 0;
        while (i < PRESENCE_BUTTON_IDS.length) 
        {
            b b1 = new b();
            int j = PRESENCE_BUTTON_IDS[i];
            String s = getString(PRESENCE_BUTTON_TITLES[i]);
            b1.container = (RelativeLayout)view.findViewById(j);
            if (b1.container != null)
            {
                b1.statusView = (SymbolView)view.findViewById(j).findViewById(0x7f100475);
                b1.button = (Button)view.findViewById(j).findViewById(0x7f100474);
                if (unifiedPresence)
                {
                    b1.button.setVisibility(8);
                } else
                {
                    b1.status = PRESENCE_BUTTON_PRESENCE_TYPES[i];
                    if (b1.statusView != null)
                    {
                        contactUtil.a(b1.statusView, b1.status);
                    }
                    b1.button.setText(s);
                    b1.button.setTag(b1.status);
                    b1.button.setOnClickListener(this);
                    buttonHoldersList.add(b1);
                }
            }
            i++;
        }
    }

    private void performSignout()
    {
        (new SignoutHelper(analytics, userPrefs)).performSignout(getActivity(), getFragmentManager(), true);
    }

    private void saveMoodMessage(TextView textview)
    {
        boolean flag = false;
        PROPKEY propkey = PROPKEY.CONTACT_MOOD_TEXT;
        textview = textview.getEditableText().toString().trim();
        com.skype.SkyLib.ValidateProfileString_Result validateprofilestring_result = lib.validateProfileString(propkey, textview.toString(), false);
        if (validateprofilestring_result.m_return == com.skype.SkyLib.VALIDATERESULT.VALIDATED_OK || validateprofilestring_result.m_return == com.skype.SkyLib.VALIDATERESULT.NOT_VALIDATED)
        {
            flag = account.setStrProperty(propkey, textview.toString());
        }
        if (!flag)
        {
            (new com.skype.android.app.main.EditPropertyFragment.ProfileErrorDialogFragment()).show(getActivity().getSupportFragmentManager(), null);
        }
    }

    private void updateAvailability(com.skype.Contact.AVAILABILITY availability, boolean flag)
    {
        log.info((new StringBuilder("updateAvailability: ")).append(availability).append(" fromUser: ").append(flag).toString());
        if (unifiedPresence)
        {
            if (!flag)
            {
                int i = presenceAdapter.getPosition(presenceAdapter.getPresenceModel(availability));
                if (!ContactUtil.b(availability))
                {
                    presenceSelector.setSelection(i);
                }
            }
        } else
        {
            Iterator iterator = buttonHoldersList.iterator();
            while (iterator.hasNext()) 
            {
                b b1 = (b)iterator.next();
                float f = b1.button.getTextSize();
                boolean flag2 = true;
                int j;
                boolean flag1;
                if (b1.status == com.skype.Contact.AVAILABILITY.INVISIBLE)
                {
                    if (!ContactUtil.a(availability) || ContactUtil.b(availability))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                if (ContactUtil.b(availability))
                {
                    flag1 = false;
                    flag2 = false;
                } else
                {
                    flag1 = ContactUtil.a(availability);
                }
                if (b1.statusView != null)
                {
                    Object obj = b1.statusView;
                    Object obj2;
                    if (flag1)
                    {
                        j = 0;
                    } else
                    {
                        j = 4;
                    }
                    ((SymbolView) (obj)).setVisibility(j);
                }
                b1.button.setEnabled(flag2);
                obj = b1.button;
                obj2 = new StringBuilder();
                if (flag1)
                {
                    j = 0x7f080085;
                } else
                {
                    j = 0x7f080086;
                }
                ((Button) (obj)).setContentDescription(((StringBuilder) (obj2)).append(getString(j)).append(", ").append(b1.button.getText()).toString());
                if (layoutExperience.isMultipane())
                {
                    obj2 = b1.button;
                    Object obj1;
                    if (flag1)
                    {
                        obj1 = typeFaceFactory.getBold(f);
                    } else
                    {
                        obj1 = typeFaceFactory.getDefault(f);
                    }
                    ((Button) (obj2)).setTypeface(((android.graphics.Typeface) (obj1)));
                    obj1 = b1.container.getBackground();
                    if (flag1)
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    ((Drawable) (obj1)).setLevel(j);
                } else
                {
                    ((Switch)b1.button).setChecked(flag1);
                }
            }
        }
        if (flag)
        {
            account.setAvailability(availability);
            analytics.a(AnalyticsEvent.W, availability.toString());
        }
        updateAvatarPresence();
    }

    private void updateAvatar()
    {
        Object obj;
        int i;
        if (avatarImage instanceof ImageView)
        {
            obj = (ImageView)avatarImage;
        } else
        {
            obj = ((SkypeAvatarView)avatarImage).a();
        }
        i = account.getContactObjectID();
        if (i == 0)
        {
            return;
        } else
        {
            Contact contact = (Contact)map.a(i, com/skype/Contact);
            imageCache.b(contact, obj, new UiCallback(this, new AsyncCallback() {

                final MyInfoFragment this$0;

                public final void done(AsyncResult asyncresult)
                {
                    Object obj1 = (ImageView)asyncresult.b();
                    asyncresult = (Bitmap)asyncresult.a();
                    if (asyncresult == null)
                    {
                        ((ImageView) (obj1)).setImageDrawable(contactUtil.a(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.c, com.skype.android.res.DefaultAvatars.AvatarSize.c, account.getSkypenameProp())));
                    } else
                    {
                        ((ImageView) (obj1)).setImageBitmap(asyncresult);
                    }
                    if (!layoutExperience.isMultipane())
                    {
                        if (asyncresult == null)
                        {
                            defaultAvatars.a(backGroundLayout, account.getSkypenameProp());
                        } else
                        {
                            BitmapDrawable bitmapdrawable = new BitmapDrawable(asyncresult);
                            if (android.os.Build.VERSION.SDK_INT >= 16)
                            {
                                backGroundLayout.setBackground(bitmapdrawable);
                            } else
                            {
                                backGroundLayout.setBackgroundDrawable(bitmapdrawable);
                            }
                        }
                        backGroundLayout.getBackground().setAlpha(25);
                    }
                    if (accountNameContainer != null)
                    {
                        obj1 = accountNameContainer;
                        if (asyncresult == null)
                        {
                            asyncresult = null;
                        } else
                        {
                            asyncresult = getResources().getDrawable(0x7f020070);
                        }
                        ((View) (obj1)).setBackgroundDrawable(asyncresult);
                    }
                }

            
            {
                this$0 = MyInfoFragment.this;
                super();
            }
            }));
            updateAvatarPresence();
            return;
        }
    }

    private void updateAvatarPresence()
    {
        while (layoutExperience.isMultipane() || !(avatarImage instanceof SkypeAvatarView)) 
        {
            return;
        }
        com.skype.Contact.AVAILABILITY availability = account.getAvailabilityProp();
        contactUtil.a(((SkypeAvatarView)avatarImage).b(), availability);
    }

    private void updateCallForwarding()
    {
        if (callForwardingRoot != null)
        {
            ((TextView)callForwardingRoot.findViewById(0x7f10020b)).setText(getCallForwardingInfo());
            callForwardingRoot.setContentDescription(getCallFowardingDescription());
        }
    }

    private void updateMood()
    {
        spannedText.a(account.getContactObjectID());
        moodEdit.setText(spannedText.a(account));
    }

    private void updateUsernameInfo()
    {
        String s = account.getSigninNameProp();
        if (accountFullName != null)
        {
            accountFullName.setText(account.getFullnameProp());
        }
        if (accountNameText != null)
        {
            accountNameText.setText(s);
        }
        if (accountNameContainer != null)
        {
            AccessibilityUtil.a(new View[] {
                accountFullName
            });
            AccessibilityUtil.a(new View[] {
                accountNameText
            });
            accountNameContainer.setContentDescription((new StringBuilder()).append(account.getFullnameProp()).append(", ").append(s).toString());
        }
    }

    public void afterTextChanged(Editable editable)
    {
        moodEdit.a();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public int getPickerHeight()
    {
        return inputMethodOverlay.getInputMethodHeight();
    }

    public boolean getShowEmoticonsOnly()
    {
        return true;
    }

    boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        switch (_cls4..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return true;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            updateMood();
            break;
        }
    }

    public void onClick(View view)
    {
label0:
        {
            if ((view.getTag() instanceof com.skype.Contact.AVAILABILITY) && !ContactUtil.b(account.getAvailabilityProp()))
            {
                if (!layoutExperience.isMultipane())
                {
                    break label0;
                }
                updateAvailability((com.skype.Contact.AVAILABILITY)view.getTag(), true);
            }
            return;
        }
        if (ContactUtil.a(account.getAvailabilityProp()))
        {
            view = com.skype.Contact.AVAILABILITY.INVISIBLE;
        } else
        {
            view = com.skype.Contact.AVAILABILITY.ONLINE;
        }
        updateAvailability(view, true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setHasOptionsMenu(true);
        buttonHoldersList = new ArrayList();
        snoozeNotificationHelper = new SnoozeNotificationHelper(getContext());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f11001b, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300b7, viewgroup, false);
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            saveMoodMessage(textview);
            moodEdit.clearFocus();
            ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(moodEdit.getWindowToken(), 0);
        }
        return false;
    }

    public void onEmoticonSelected(EmoticonContent emoticoncontent)
    {
        int i = moodEdit.getSelectionStart();
        moodEdit.setText(chatText.a(moodEdit.getText().toString()));
        moodEdit.setSelection(i);
    }

    public void onEvent(OnDrawerVisibilityChanged ondrawervisibilitychanged)
    {
        if (ondrawervisibilitychanged.isOpen())
        {
            updateAvatar();
            updateMood();
            initAccountSublayout(getView());
        }
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        switch (_cls4..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            log.info("CONTACT_AVAILABILITY changed");
            updateAvailability(account.getAvailabilityProp(), false);
            chatServiceMonitor.onAccountAvailability(account.getAvailabilityProp());
            return;

        case 2: // '\002'
        case 3: // '\003'
            updateMood();
            return;

        case 4: // '\004'
            updateAvatar();
            return;

        case 5: // '\005'
            updateCallForwarding();
            break;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756524: 
            nav.settings();
            return true;

        case 2131756525: 
            performSignout();
            return true;

        case 2131756528: 
            navUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.a);
            return true;

        case 16908332: 
            nav.upToHome();
            return true;
        }
    }

    public void onPickerDeleteKey()
    {
    }

    public void onPickerDismiss()
    {
    }

    public void onResume()
    {
        super.onResume();
        log.info("onResume");
        updateAvailability(account.getAvailabilityProp(), false);
        updateCallForwarding();
    }

    public void onSendMoji(MojiContent mojicontent)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        boolean flag;
        if (ecsConfiguration.isUnifiedPresenceEnabled() && !layoutExperience.isMultipane())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        unifiedPresence = flag;
        if (bundle == null)
        {
            updateMood();
        }
        initMoodSublayout(view);
        initStatusSublayout(view);
        initAccountSublayout(view);
        if (!layoutExperience.isMultipane())
        {
            initPresenceSublayout(view);
        }
        if (emoticonButton != null)
        {
            inputMethodOverlay = new InputMethodOverlay(getActivity(), this, null, this);
        }
    }

    static 
    {
        PRESENCE_BUTTON_PRESENCE_TYPES = (new com.skype.Contact.AVAILABILITY[] {
            com.skype.Contact.AVAILABILITY.ONLINE, com.skype.Contact.AVAILABILITY.INVISIBLE
        });
    }





}
