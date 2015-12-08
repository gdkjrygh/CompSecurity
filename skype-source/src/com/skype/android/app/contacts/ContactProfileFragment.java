// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.NotificationManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.ListItemMenuDialog;
import com.skype.android.app.Navigation;
import com.skype.android.app.main.EditPropertyActivity;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.SpanUtil;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;
import com.skype.android.widget.SymbolView;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSendAuthRequestActivity, ContactAddNumberActivity, ContactMoodMessageFragment, ContactRequestDeclineDialog

public class ContactProfileFragment extends SkypeFragment
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, com.skype.android.app.ListItemMenuDialog.MenuCallback
{
    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a ABOUT;
        public static final a AGE;
        public static final a BIRTHDAY;
        public static final a CITY;
        public static final a COUNTRY;
        public static final a GENDER;
        public static final a LANGUAGE;
        public static final a MS_ACCOUNT;
        public static final a SKYPE_NAME;
        public static final a STATE;
        public static final a WEBSITE;
        private int resId;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/contacts/ContactProfileFragment$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        public final int titleResourceId()
        {
            return resId;
        }

        static 
        {
            MS_ACCOUNT = new a("MS_ACCOUNT", 0, 0x7f08025d);
            SKYPE_NAME = new a("SKYPE_NAME", 1, 0x7f08027b);
            ABOUT = new a("ABOUT", 2, 0x7f080224);
            GENDER = new a("GENDER", 3, 0x7f08024f);
            LANGUAGE = new a("LANGUAGE", 4, 0x7f080253);
            AGE = new a("AGE", 5, 0x7f08022e);
            BIRTHDAY = new a("BIRTHDAY", 6, 0x7f080230);
            CITY = new a("CITY", 7, 0x7f08023a);
            STATE = new a("STATE", 8, 0x7f08027d);
            COUNTRY = new a("COUNTRY", 9, 0x7f080241);
            WEBSITE = new a("WEBSITE", 10, 0x7f080251);
            $VALUES = (new a[] {
                MS_ACCOUNT, SKYPE_NAME, ABOUT, GENDER, LANGUAGE, AGE, BIRTHDAY, CITY, STATE, COUNTRY, 
                WEBSITE
            });
        }

        private a(String s, int i, int j)
        {
            super(s, i);
            resId = j;
        }
    }


    public static final String EXTRA_EDIT_MODE = "editMode";
    private static final String EXTRA_NEW_CONTACT = "new_contact";
    public static final String EXTRA_PHONE_POSITION = "phonePosition";
    public static final int REQUEST_SEND_CONTACT_REQUEST = 1;
    LinearLayout actions;
    Analytics analytics;
    LinearLayout assignedActions;
    PathClippedImageView avatarImage;
    private Contact contact;
    private android.view.View.OnClickListener contactRequestAuthorizationClickListener;
    LinearLayout contactRequestButtonContainer;
    ContactUtil contactUtil;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    private boolean editMode;
    private boolean hasAction;
    LinearLayout homeCall;
    ImageCache imageCache;
    LayoutExperience layoutExperience;
    SkyLib lib;
    LinearLayout mobileCall;
    TextView moodText;
    Navigation navigation;
    private boolean newContact;
    NotificationManager notificationManager;
    LinearLayout officeCall;
    PermissionRequest permissionRequest;
    LinearLayout profileInfo;
    View profileInfoSeparator;
    TextView requestMessage;
    LinearLayout saveNameNumber;
    LinearLayout sendContactRequest;
    LinearLayout skypeAudioCall;
    TextView skypeCertifiedText;
    LinearLayout skypeoutCall;
    SpanUtil spanUtil;
    TimeUtil timeUtil;
    LinearLayout videoCall;
    private boolean wereWaitingForTheirAuth;

    public ContactProfileFragment()
    {
        contactRequestAuthorizationClickListener = new android.view.View.OnClickListener() {

            final ContactProfileFragment this$0;

            public final void onClick(View view)
            {
                if (view.getId() == 0x7f100274)
                {
                    view = contactUtil;
                    ContactUtil.o(contact);
                    requestMessage.setVisibility(8);
                    contactRequestButtonContainer.setVisibility(8);
                    notificationManager.cancel(contact.getObjectID());
                    return;
                } else
                {
                    SkypeDialogFragment.create(contact, com/skype/android/app/contacts/ContactRequestDeclineDialog).show(getActivity().getSupportFragmentManager());
                    return;
                }
            }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
        };
    }

    private void addClickableAddNumber()
    {
        boolean flag;
        if (TextUtils.isEmpty(contact.getAssignedPhone1Prop()) || TextUtils.isEmpty(contact.getAssignedPhone2Prop()) || TextUtils.isEmpty(contact.getAssignedPhone3Prop()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (editMode && flag)
        {
            LinearLayout linearlayout = (LinearLayout)getActivity().getLayoutInflater().inflate(0x7f0300e3, assignedActions, false);
            loadActionLayout(linearlayout, com.skype.android.widget.SymbolElement.SymbolCode.cc, null, getString(0x7f08010c), true);
            assignedActions.addView(linearlayout);
            linearlayout.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactProfileFragment this$0;

                public final void onClick(View view)
                {
                    view = navigation.intentFor(contact, com/skype/android/app/contacts/ContactAddNumberActivity);
                    startActivity(view);
                }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
            });
        }
    }

    private void addClickableName()
    {
        if (editMode && !newContact)
        {
            LinearLayout linearlayout = (LinearLayout)getActivity().getLayoutInflater().inflate(0x7f0300e3, assignedActions, false);
            if (ContactUtil.q(contact))
            {
                loadActionLayout(linearlayout, com.skype.android.widget.SymbolElement.SymbolCode.cc, null, getString(0x7f08010b), true);
            } else
            {
                loadActionLayout(linearlayout, com.skype.android.widget.SymbolElement.SymbolCode.a, getString(0x7f08025e), contactUtil.l(contact), true);
            }
            assignedActions.addView(linearlayout);
            linearlayout.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactProfileFragment this$0;

                public final void onClick(View view)
                {
                    view = navigation.intentFor(contact, com/skype/android/app/main/EditPropertyActivity);
                    view.putExtra("com.skype.propkey", PROPKEY.CONTACT_GIVEN_DISPLAYNAME);
                    startActivity(view);
                }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
            });
        }
    }

    private boolean addUserAssignedNumber(com.skype.android.widget.SymbolElement.SymbolCode symbolcode, final String phone, final int position, final PROPKEY phoneKey, PROPKEY propkey, boolean flag)
    {
        boolean flag2 = true;
        boolean flag1;
        if (!TextUtils.isEmpty(phone))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            LinearLayout linearlayout = (LinearLayout)getActivity().getLayoutInflater().inflate(0x7f0300e3, assignedActions, false);
            propkey = getString(contactUtil.a(contact.getStrProperty(propkey)));
            if (!flag)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            loadActionLayout(linearlayout, symbolcode, propkey, phone, flag);
            assignedActions.addView(linearlayout);
            linearlayout.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactProfileFragment this$0;
                final String val$phone;
                final PROPKEY val$phoneKey;
                final int val$position;

                public final void onClick(View view)
                {
                    if (editMode)
                    {
                        view = navigation.intentFor(contact, com/skype/android/app/main/EditPropertyActivity);
                        view.putExtra("com.skype.propkey", phoneKey);
                        view.putExtra("editMode", editMode);
                        view.putExtra("phonePosition", position + 1);
                        startActivity(view);
                        return;
                    } else
                    {
                        permissionRequest.a(Permission.n, true, new PermissionHandlerAdapter() {

                            final _cls2 this$1;

                            public final void onGranted()
                            {
                                navigation.placeCall(phone);
                            }

            
            {
                this$1 = _cls2.this;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                this$0 = ContactProfileFragment.this;
                phoneKey = propkey;
                position = i;
                phone = s;
                super();
            }
            });
            linearlayout.setOnLongClickListener(new android.view.View.OnLongClickListener() {

                final ContactProfileFragment this$0;
                final int val$position;

                public final boolean onLongClick(View view)
                {
                    view = contact.getStrProperty(ContactUtil.e[position]);
                    ListItemMenuDialog.create(ContactProfileFragment.this, view, position).show(getFragmentManager());
                    return true;
                }

            
            {
                this$0 = ContactProfileFragment.this;
                position = i;
                super();
            }
            });
        }
        return flag1;
    }

    private CharSequence getContent(a a1)
    {
        String s = null;
        static final class _cls6
        {

            static final int $SwitchMap$com$skype$Contact$TYPE[];
            static final int $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[];

            static 
            {
                $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field = new int[a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.ABOUT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.AGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.BIRTHDAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.CITY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.COUNTRY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.GENDER.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.LANGUAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.MS_ACCOUNT.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.STATE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.WEBSITE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactProfileFragment$Field[a.SKYPE_NAME.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                $SwitchMap$com$skype$Contact$TYPE = new int[com.skype.Contact.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Contact$TYPE[com.skype.Contact.TYPE.PASSPORT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Contact$TYPE[com.skype.Contact.TYPE.BOT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6..SwitchMap.com.skype.android.app.contacts.ContactProfileFragment.Field[a1.ordinal()];
        JVM INSTR tableswitch 1 11: default 68
    //                   1 72
    //                   2 86
    //                   3 179
    //                   4 196
    //                   5 206
    //                   6 228
    //                   7 286
    //                   8 303
    //                   9 348
    //                   10 358
    //                   11 372;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        a1 = s;
_L14:
        return a1;
_L2:
        return getLinkifiedField(contact.getAboutProp());
_L3:
        GregorianCalendar gregoriancalendar;
        Calendar calendar;
        int i = contact.getBirthdayProp();
        s = "";
        gregoriancalendar = TimeUtil.b(i);
        calendar = TimeUtil.d();
        a1 = s;
        if (gregoriancalendar == null) goto _L14; else goto _L13
_L13:
        a1 = s;
        if (calendar.before(gregoriancalendar)) goto _L14; else goto _L15
_L15:
        int l = gregoriancalendar.get(1);
        int k = calendar.get(1);
        gregoriancalendar.set(1, k);
        int j = k;
        if (calendar.before(gregoriancalendar))
        {
            j = k - 1;
        }
        return String.valueOf(j - l);
_L4:
        return TimeUtil.a(contact.getBirthdayProp(), "", 3);
_L5:
        return contact.getCityProp();
_L6:
        s = contactUtil.m(contact);
        a1 = s;
        if (s != null) goto _L14; else goto _L16
_L16:
        return "";
_L7:
        if (contact.getGenderProp() == 1)
        {
            a1 = getString(0x7f0802ce);
        } else
        if (contact.getGenderProp() == 2)
        {
            a1 = getString(0x7f0802b5);
        } else
        {
            a1 = getString(0x7f0802e9);
        }
        return a1;
_L8:
        return contactUtil.i(contact.getLanguagesProp());
_L9:
        if (contact.getType() == com.skype.Contact.TYPE.PASSPORT)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = s;
        if (contact.getType() != com.skype.Contact.TYPE.LYNC) goto _L14; else goto _L17
_L17:
        return ContactUtil.d(contact.getIdentity());
_L10:
        return contact.getProvinceProp();
_L11:
        return getLinkifiedField(contact.getHomepageProp());
_L12:
        a1 = s;
        switch (_cls6..SwitchMap.com.skype.Contact.TYPE[contact.getTypeProp().ordinal()])
        {
        default:
            return contact.getSkypenameProp();

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (true) goto _L14; else goto _L18
_L18:
    }

    private CharSequence getLinkifiedField(String s)
    {
        s = new SpannableStringBuilder(s);
        Linkify.addLinks(s, 1);
        spanUtil.a(s);
        return s;
    }

    private void handlePhoneView(LinearLayout linearlayout, final PROPKEY phoneKey, String s, int i, boolean flag, com.skype.android.widget.SymbolElement.SymbolCode symbolcode)
    {
        if (!TextUtils.isEmpty(s))
        {
            linearlayout.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactProfileFragment this$0;
                final PROPKEY val$phoneKey;

                public final void onClick(View view)
                {
                    permissionRequest.a(Permission.n, true, new PermissionHandlerAdapter() {

                        final _cls13 this$1;

                        public final void onGranted()
                        {
                            analytics.c(AnalyticsEvent.d);
                            navigation.placeCall(contact, phoneKey);
                        }

            
            {
                this$1 = _cls13.this;
                super();
            }
                    });
                }

            
            {
                this$0 = ContactProfileFragment.this;
                phoneKey = propkey;
                super();
            }
            });
            phoneKey = getString(i);
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loadActionLayout(linearlayout, symbolcode, phoneKey, s, flag);
            return;
        } else
        {
            linearlayout.setVisibility(8);
            return;
        }
    }

    private void handleSkypeOutNonContact(String s, boolean flag)
    {
        assignedActions.removeAllViews();
        if (flag)
        {
            saveNameNumber.setVisibility(0);
            s = com.skype.android.widget.SymbolElement.SymbolCode.cc;
            loadActionLayout(saveNameNumber, s, null, getString(0x7f08017b), true);
            saveNameNumber.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactProfileFragment this$0;

                public final void onClick(View view)
                {
                    startActivity(navigation.intentFor(contact, com/skype/android/app/contacts/ContactAddNumberActivity));
                }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
            });
            return;
        } else
        {
            saveNameNumber.setVisibility(8);
            return;
        }
    }

    private void loadActionLayout(LinearLayout linearlayout, com.skype.android.widget.SymbolElement.SymbolCode symbolcode, String s, String s1, boolean flag)
    {
        Object obj = (SymbolView)linearlayout.findViewById(0x7f10046e);
        ((SymbolView) (obj)).setSymbolCode(symbolcode);
        ((SymbolView) (obj)).setContentDescription(s1);
        ((SymbolView) (obj)).setEnabled(flag);
        obj = (TextView)linearlayout.findViewById(0x7f10020a);
        ((TextView) (obj)).setText(s);
        ((TextView) (obj)).setEnabled(flag);
        byte byte0;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
        s = (TextView)linearlayout.findViewById(0x7f10020b);
        s.setEnabled(flag);
        s.setText(s1);
        if (symbolcode == null)
        {
            ((android.widget.RelativeLayout.LayoutParams)s.getLayoutParams()).setMargins(0, 0, 0, 0);
            ((android.widget.RelativeLayout.LayoutParams)((TextView) (obj)).getLayoutParams()).setMargins(0, 0, 0, 0);
        }
        linearlayout.setEnabled(flag);
    }

    private boolean stringIsURL(CharSequence charsequence)
    {
        charsequence = new SpannableString(charsequence);
        return ((URLSpan[])charsequence.getSpans(0, charsequence.length(), android/text/style/URLSpan)).length > 0;
    }

    private void updateActions()
    {
        String s1;
        int i;
        int j;
        int k;
        if (conversation == null)
        {
            conversation = new ConversationImpl();
            contact.openConversation(conversation);
        }
        com.skype.android.widget.SymbolElement.SymbolCode symbolcode1 = com.skype.android.widget.SymbolElement.SymbolCode.u;
        getResources().getDrawable(0x7f020204);
        boolean flag = conversationUtil.b(true);
        boolean flag1 = ContactUtil.g(contact);
        LinearLayout linearlayout;
        Object obj;
        LinearLayout linearlayout1;
        PROPKEY propkey;
        String s5;
        if (!flag && !flag1 && conversationUtil.i(conversation))
        {
            videoCall.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactProfileFragment this$0;

                public final void onClick(View view)
                {
                    analytics.c(AnalyticsEvent.j);
                    navigation.placeCallWithVideo(contact);
                }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
            });
            com.skype.android.widget.SymbolElement.SymbolCode symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.w;
            String s2 = getString(0x7f080328);
            String s4 = getString(0x7f0801a5);
            loadActionLayout(videoCall, symbolcode, s2, s4, true);
            videoCall.setVisibility(0);
            hasAction = true;
        } else
        {
            videoCall.setVisibility(8);
        }
        if (!flag && !flag1 && conversationUtil.f(conversation))
        {
            skypeAudioCall.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactProfileFragment this$0;

                public final void onClick(View view)
                {
                    analytics.c(AnalyticsEvent.k);
                    navigation.placeCall(contact);
                }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
            });
            String s = getString(0x7f080328);
            String s3 = getString(0x7f080110);
            loadActionLayout(skypeAudioCall, symbolcode1, s, s3, true);
            skypeAudioCall.setVisibility(0);
            hasAction = true;
        } else
        {
            skypeAudioCall.setVisibility(8);
        }
        linearlayout = mobileCall;
        obj = homeCall;
        linearlayout1 = officeCall;
        s1 = contact.getPstnnumberProp();
        if (!TextUtils.isEmpty(s1))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        k = 0;
_L10:
        i = j;
        if (k >= ContactUtil.d.length) goto _L2; else goto _L1
_L1:
        propkey = ContactUtil.d[k];
        s5 = contact.getStrProperty(ContactUtil.d[k]);
        handlePhoneView((new LinearLayout[] {
            linearlayout, obj, linearlayout1
        })[k], propkey, s5, (new int[] {
            0x7f0802dc, 0x7f0802c3, 0x7f0802f4
        })[k], flag, symbolcode1);
        if (j == 0 || s5 == null || !s5.equals(s1)) goto _L4; else goto _L3
_L3:
        i = 0;
_L2:
        k = i;
        if (!i) goto _L6; else goto _L5
_L5:
        j = ContactUtil.e.length - 1;
_L11:
        k = i;
        if (j < 0) goto _L6; else goto _L7
_L7:
        if (!s1.equals(contact.getStrProperty(ContactUtil.e[j]))) goto _L9; else goto _L8
_L8:
        k = 0;
_L6:
        if (!contactUtil.i(contact))
        {
            linearlayout = skypeoutCall;
            obj = PROPKEY.CONTACT_PSTNNUMBER;
            if (k == 0)
            {
                s1 = null;
            }
            handlePhoneView(linearlayout, ((PROPKEY) (obj)), s1, 0x7f0802f9, flag, symbolcode1);
        }
        i = 0;
_L12:
        if (i < ContactUtil.d.length)
        {
            if (TextUtils.isEmpty(contact.getStrProperty(ContactUtil.d[i])))
            {
                break MISSING_BLOCK_LABEL_578;
            }
            hasAction = true;
        }
        updateLineSeparator();
        return;
_L4:
        k++;
          goto _L10
_L9:
        j--;
          goto _L11
        i++;
          goto _L12
    }

    private void updateAvatar()
    {
        imageCache.b(contact, avatarImage, new UiCallback(this, new AsyncCallback() {

            final ContactProfileFragment this$0;

            public final void done(AsyncResult asyncresult)
            {
                ImageView imageview = (ImageView)asyncresult.b();
                Object obj = contactUtil;
                boolean flag = ContactUtil.p(contact);
                PathClippedImageView pathclippedimageview = avatarImage;
                if (flag)
                {
                    obj = PathType.b;
                } else
                {
                    obj = PathType.a;
                }
                pathclippedimageview.setPathType(((PathType) (obj)));
                if (asyncresult.a() != null)
                {
                    avatarImage.a(true);
                    avatarImage.setImageBitmap((Bitmap)asyncresult.a());
                } else
                {
                    avatarImage.a(false);
                    avatarImage.setImageDrawable(contactUtil.c(contact));
                }
                imageview.setVisibility(0);
            }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
        }));
    }

    private void updateBuddyRequestStatus()
    {
        boolean flag = ContactUtil.g(contact);
        boolean flag2 = contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_WAITING_MY_AUTHORIZATION);
        boolean flag3 = contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.UNKNOWN_OR_PENDINGAUTH_BUDDIES);
        int i;
        if (flag2)
        {
            Button button = (Button)contactRequestButtonContainer.findViewById(0x7f100274);
            Button button1 = (Button)contactRequestButtonContainer.findViewById(0x7f100275);
            button.setOnClickListener(contactRequestAuthorizationClickListener);
            button1.setOnClickListener(contactRequestAuthorizationClickListener);
            requestMessage.setText(0x7f080476);
            requestMessage.setVisibility(0);
        } else
        {
            requestMessage.setVisibility(8);
            contactRequestButtonContainer.setVisibility(8);
        }
        if (!contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES) || flag3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!flag2 && !flag && i != 0)
        {
            com.skype.android.widget.SymbolElement.SymbolCode symbolcode;
            boolean flag1;
            if (wereWaitingForTheirAuth && flag3)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.an;
            if (!flag3 || i != 0)
            {
                if (i != 0)
                {
                    i = 0x7f080130;
                } else
                {
                    i = 0x7f08012a;
                }
                sendContactRequest.setOnClickListener(new android.view.View.OnClickListener() {

                    final ContactProfileFragment this$0;

                    public final void onClick(View view)
                    {
                        view = navigation.intentFor(contact, com/skype/android/app/contacts/ContactSendAuthRequestActivity);
                        startActivityForResult(view, 1);
                        wereWaitingForTheirAuth = false;
                    }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
                });
                flag1 = true;
            } else
            {
                sendContactRequest.setOnClickListener(null);
                i = 0x7f0803b5;
                flag1 = false;
            }
            loadActionLayout(sendContactRequest, symbolcode, "", getString(i), flag1);
            sendContactRequest.setVisibility(0);
            hasAction = true;
        } else
        {
            sendContactRequest.setVisibility(8);
        }
        updateLineSeparator();
    }

    private void updateInfo()
    {
        avatarImage.setClipCircleEnabled(false);
        avatarImage.setFocusable(false);
        moodText.setFocusable(false);
        boolean flag = ContactUtil.p(contact);
        byte byte0 = 8;
        if (flag)
        {
            byte0 = 0;
        }
        skypeCertifiedText.setVisibility(byte0);
        if (!ContactUtil.g(contact) && !editMode) goto _L2; else goto _L1
_L1:
        profileInfo.setVisibility(8);
        profileInfoSeparator.setVisibility(8);
        moodText.setVisibility(8);
        Object obj = saveNameNumber;
        int i;
        if (newContact)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((LinearLayout) (obj)).setVisibility(i);
        if (!newContact) goto _L4; else goto _L3
_L3:
        obj = com.skype.android.widget.SymbolElement.SymbolCode.cc;
        loadActionLayout(saveNameNumber, ((com.skype.android.widget.SymbolElement.SymbolCode) (obj)), null, getString(0x7f08010b), true);
        saveNameNumber.setOnClickListener(new android.view.View.OnClickListener() {

            final ContactProfileFragment this$0;

            public final void onClick(View view1)
            {
                getActivity().getIntent().removeExtra("new_contact");
                newContact = false;
                view1 = navigation.intentFor(contact, com/skype/android/app/main/EditPropertyActivity);
                view1.putExtra("com.skype.propkey", PROPKEY.CONTACT_GIVEN_DISPLAYNAME);
                startActivity(view1);
            }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
        });
_L6:
        return;
_L4:
        if (ContactUtil.g(contact))
        {
            String s = contact.getStrProperty(PROPKEY.CONTACT_PSTNNUMBER);
            boolean flag1 = true;
            if (contactUtil.i(contact))
            {
                flag1 = false;
            }
            if (!contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES))
            {
                handleSkypeOutNonContact(s, flag1);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        Object obj1 = contactUtil.d(contact);
        new SpannedAnimationDrawableCallback(moodText);
        moodText.setBackgroundResource(0x7f020141);
        int j;
        int k;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            moodText.setFocusable(false);
            moodText.setText(((CharSequence) (obj1)));
            moodText.setVisibility(8);
        } else
        {
            moodText.setFocusable(true);
            moodText.setVisibility(0);
            moodText.setText(((CharSequence) (obj1)));
            moodText.setOnClickListener(new android.view.View.OnClickListener() {

                final ContactProfileFragment this$0;

                public final void onClick(View view1)
                {
                    view1 = getFragmentManager().a();
                    ContactMoodMessageFragment contactmoodmessagefragment = new ContactMoodMessageFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("com.skype.objId", contact.getObjectID());
                    contactmoodmessagefragment.setArguments(bundle);
                    view1.a(0x1020002, contactmoodmessagefragment);
                    view1.a(contact.getIdentity());
                    view1.a();
                }

            
            {
                this$0 = ContactProfileFragment.this;
                super();
            }
            });
        }
        profileInfo.removeAllViews();
        profileInfo.setFocusable(true);
        obj1 = a.values();
        k = obj1.length;
        j = 0;
        while (j < k) 
        {
            a a1 = obj1[j];
            CharSequence charsequence = getContent(a1);
            if (!TextUtils.isEmpty(charsequence))
            {
                View view = getActivity().getLayoutInflater().inflate(0x7f0300e5, null);
                TextView textview = (TextView)ViewUtil.a(view, 0x7f1004cd);
                TextView textview1 = (TextView)ViewUtil.a(view, 0x7f1004ce);
                textview1.setMovementMethod(LinkMovementMethod.getInstance());
                textview1.setText(charsequence);
                textview.setText(a1.titleResourceId());
                if (stringIsURL(charsequence))
                {
                    textview1.setFocusable(true);
                    profileInfo.setFocusable(false);
                } else
                {
                    textview1.setFocusable(false);
                }
                profileInfo.addView(view);
            }
            j++;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateLineSeparator()
    {
        View view = profileInfoSeparator;
        int i;
        if (hasAction)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void updateUserAssignedInfo()
    {
        assignedActions.removeAllViews();
        addClickableName();
        com.skype.android.widget.SymbolElement.SymbolCode symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.u;
        boolean flag = conversationUtil.b(true);
        for (int i = 0; i < ContactUtil.e.length; i++)
        {
            addUserAssignedNumber(symbolcode, contact.getStrProperty(ContactUtil.e[i]), i, ContactUtil.e[i], ContactUtil.f[i], flag);
        }

        addClickableAddNumber();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getActivity();
        int i;
        if (editMode)
        {
            i = 0x7f08007f;
        } else
        {
            i = 0x7f0800b1;
        }
        bundle.setTitle(getString(i, new Object[] {
            contactUtil.l(contact)
        }));
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1 && layoutExperience.isMultipane() && j == -1)
        {
            getActivity().finish();
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem, int i)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756482: 
            contact.setPhoneNumber(i + 1, "", "");
            updateUserAssignedInfo();
            return true;

        case 2131756481: 
            menuitem = contact.getStrProperty(ContactUtil.e[i]);
            ((ClipboardManager)getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", menuitem));
            return true;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        contact = (Contact)getObjectInterface(com/skype/Contact);
    }

    public void onCreateContextMenu(Menu menu, int i)
    {
        i = 0x7f11000b;
        if (editMode)
        {
            i = 0x7f11000c;
        }
        getActionBarActivity().getMenuInflater().inflate(i, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300e2, viewgroup, false);
    }

    public void onDestroyView()
    {
        View view = getView();
        if (view != null)
        {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        super.onDestroyView();
    }

    public void onEvent(com.skype.android.gen.ContactGroupListener.OnChange onchange)
    {
        if (onchange.getContactObjectID() == contact.getObjectID())
        {
            updateBuddyRequestStatus();
            updateInfo();
        }
    }

    public void onEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
label0:
        {
            if (onpropertychange.getSender().getObjectID() == contact.getObjectID())
            {
                if (onpropertychange.getPropKey() != PROPKEY.CONTACT_AVATAR_IMAGE)
                {
                    break label0;
                }
                updateAvatar();
            }
            return;
        }
        updateInfo();
    }

    public void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (conversation != null && onpropertychange.getSender().getObjectID() == conversation.getObjectID() && onpropertychange.getPropKey() == PROPKEY.CONVERSATION_LOCAL_LIVESTATUS)
        {
            updateActions();
            updateUserAssignedInfo();
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
    {
        if (onconversationlistchange.getType() == com.skype.Conversation.LIST_TYPE.LIVE_CONVERSATIONS)
        {
            updateActions();
            updateUserAssignedInfo();
        }
    }

    public void onGlobalLayout()
    {
        if ((isVisible() || isResumed()) && moodText.getVisibility() == 0)
        {
            int i = moodText.getHeight() / moodText.getLineHeight();
            moodText.setMaxLines(i);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (editMode)
        {
            actions.removeAllViews();
        } else
        {
            updateActions();
            updateBuddyRequestStatus();
        }
        updateUserAssignedInfo();
        updateAvatar();
        updateInfo();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        editMode = getArguments().getBoolean("editMode", false);
        newContact = getArguments().getBoolean("new_contact", false);
        bundle = getActivity().getIntent();
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            bundle = bundle.getExtras();
        }
        if (bundle != null && bundle.containsKey("were_pending_auth"))
        {
            wereWaitingForTheirAuth = bundle.getBoolean("were_pending_auth");
        } else
        {
            wereWaitingForTheirAuth = contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.UNKNOWN_OR_PENDINGAUTH_BUDDIES);
        }
        ViewUtil.a(moodText, null);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }


/*
    static boolean access$002(ContactProfileFragment contactprofilefragment, boolean flag)
    {
        contactprofilefragment.newContact = flag;
        return flag;
    }

*/



/*
    static boolean access$202(ContactProfileFragment contactprofilefragment, boolean flag)
    {
        contactprofilefragment.wereWaitingForTheirAuth = flag;
        return flag;
    }

*/

}
