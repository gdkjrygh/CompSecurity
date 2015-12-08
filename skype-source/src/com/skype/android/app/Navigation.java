// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.t;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeConstants;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.LogEvent;
import com.skype.android.annotation.RequireNotOffline;
import com.skype.android.app.account.MyInfoActivity;
import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.ConnectionDialogTransparentHostActivity;
import com.skype.android.app.calling.ConnectionRequiredDialog;
import com.skype.android.app.calling.PreCallActivity;
import com.skype.android.app.calling.TurnOffAirplaneModeDialog;
import com.skype.android.app.chat.AddParticipantsActivity;
import com.skype.android.app.chat.ChatActivity;
import com.skype.android.app.chat.MigratedChatActivity;
import com.skype.android.app.chat.OutlookNotInstalledActivity;
import com.skype.android.app.chat.ParticipantActivity;
import com.skype.android.app.chat.picker.Search.MediaPickerSearchActivity;
import com.skype.android.app.contacts.ContactBlockedDialog;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.app.contacts.ContactPickerActivity;
import com.skype.android.app.contacts.ContactProfileActivity;
import com.skype.android.app.contacts.ContactSuggestedInvitesPickerFragment;
import com.skype.android.app.contacts.OffNetworkInviteActivity;
import com.skype.android.app.dialer.DialpadActivity;
import com.skype.android.app.location.ReceivedLocationActivity;
import com.skype.android.app.location.SendLocationActivity;
import com.skype.android.app.main.HubActivity;
import com.skype.android.app.main.HubMaterialActivity;
import com.skype.android.app.main.HubSection;
import com.skype.android.app.main.OfflineWarningDialog;
import com.skype.android.app.media.MediaPhotoViewerActivity;
import com.skype.android.app.mnv.MnvActivity;
import com.skype.android.app.mnv.MnvAddFriendsFragment;
import com.skype.android.app.mnv.MnvAddNumberActivity;
import com.skype.android.app.mnv.MnvCheckingAccountFragment;
import com.skype.android.app.mnv.MnvEnterPinFragment;
import com.skype.android.app.mnv.MnvErrorFragment;
import com.skype.android.app.mnv.MnvLearnMoreFragment;
import com.skype.android.app.mnv.MnvVerifiedFragment;
import com.skype.android.app.recents.RecentListActivity;
import com.skype.android.app.settings.SettingsActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.signin.AuthenticateWithMsaActivity;
import com.skype.android.app.signin.LandingPageActivity;
import com.skype.android.app.signin.SignUpActivity;
import com.skype.android.app.signin.SimpleLandingPageActivity;
import com.skype.android.app.signin.TermsOfUseActivity;
import com.skype.android.app.signin.UnifiedLandingPageActivity;
import com.skype.android.app.vim.VideoMessagePlayerActivity;
import com.skype.android.app.vim.VideoMessageRecorderActivity;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.TimeUtil;
import com.skype.android.wakeup.DreamKeeper;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.skype.android.app:
//            LayoutExperience

public class Navigation
    implements SkypeConstants
{

    private static final String CHOOSER_CALENDAR_TYPE = "vnd.android.cursor.item/event";
    private static final int HALF_AN_HOUR_IN_MINUTES = 30;
    private static final int ONE_WEEK_IN_DAYS = 7;
    private static final String OUTLOOK_CALENDAR_URI_STRING = "mscal://create_event";
    private static final String SCHEDULE_A_MEETING_RECURRENCE_RULE = "FREQ=WEEKLY;BYDAY=";
    private AccountProvider accountProvider;
    private Analytics analytics;
    private AnalyticsPersistentStorage analyticsPersistentStorage;
    private EcsConfiguration configuration;
    protected Context context;
    private ConversationUtil conversationUtil;
    private DreamKeeper dreamKeeper;
    private LayoutExperience layoutExperience;
    private SkyLib lib;
    private NetworkUtil networkUtil;
    private SignInDurationReporter signInDurationReporter;
    private TimeUtil timeUtil;

    public Navigation(Activity activity, AccountProvider accountprovider, SkyLib skylib, DreamKeeper dreamkeeper, ConversationUtil conversationutil, Analytics analytics1, NetworkUtil networkutil, 
            EcsConfiguration ecsconfiguration, SignInDurationReporter signindurationreporter, AnalyticsPersistentStorage analyticspersistentstorage, LayoutExperience layoutexperience, TimeUtil timeutil)
    {
        context = activity;
        accountProvider = accountprovider;
        lib = skylib;
        dreamKeeper = dreamkeeper;
        conversationUtil = conversationutil;
        analytics = analytics1;
        networkUtil = networkutil;
        configuration = ecsconfiguration;
        signInDurationReporter = signindurationreporter;
        analyticsPersistentStorage = analyticspersistentstorage;
        layoutExperience = layoutexperience;
        timeUtil = timeutil;
    }

    private void chat(Conversation conversation, boolean flag, Bundle bundle)
    {
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG && handleBlockedContact(conversationUtil.r(conversation)))
        {
            return;
        }
        if (conversation.getIsP2pMigratedProp())
        {
            toMigratedChat(conversation);
            return;
        }
        conversation = intentFor(conversation, com/skype/android/app/chat/ChatActivity);
        if (flag)
        {
            conversation.addFlags(0x4000000);
        }
        if (bundle != null)
        {
            conversation.putExtras(bundle);
        }
        startActivity(conversation);
    }

    private void checkNetworkAndStartActivity(Intent intent)
    {
        if (networkUtil.a())
        {
            startActivity(intent);
            return;
        }
        boolean flag = networkUtil.c();
        int i;
        int j;
        if (flag)
        {
            i = 0x7f08022f;
        } else
        {
            i = 0x7f080260;
        }
        if (flag)
        {
            j = 0x7f080442;
        } else
        {
            j = 0x7f0803fc;
        }
        if (context instanceof FragmentActivity)
        {
            FragmentActivity fragmentactivity = (FragmentActivity)context;
            if (flag)
            {
                analytics.c(AnalyticsEvent.bF);
                intent = TurnOffAirplaneModeDialog.create(fragmentactivity.getString(i), fragmentactivity.getString(j), fragmentactivity.getString(0x7f080128), fragmentactivity.getString(0x7f080188));
            } else
            {
                analytics.c(AnalyticsEvent.bE);
                intent = ConnectionRequiredDialog.create(fragmentactivity.getString(i), fragmentactivity.getString(j), fragmentactivity.getString(0x7f080128), fragmentactivity.getString(0x7f080188));
            }
            intent.show(fragmentactivity.getSupportFragmentManager());
            return;
        }
        Analytics analytics1 = analytics;
        if (flag)
        {
            intent = AnalyticsEvent.bF;
        } else
        {
            intent = AnalyticsEvent.bE;
        }
        analytics1.c(intent);
        intent = new Intent(context, com/skype/android/app/calling/ConnectionDialogTransparentHostActivity);
        intent.putExtra("EXTRA_AIRPLANE_MODE", flag);
        intent.putExtra("EXTRA_DIALOG_TITLE", i);
        intent.putExtra("EXTRA_DIALOG_MESSAGE", j);
        intent.setFlags(0x10010000);
        startActivity(intent);
    }

    private Intent getCalendarIntent(boolean flag, String s)
    {
        Intent intent = new Intent("android.intent.action.INSERT");
        String s1;
        long l;
        long l1;
        if (flag)
        {
            intent.setData(Uri.parse("mscal://create_event"));
        } else
        {
            intent.setType("vnd.android.cursor.item/event");
        }
        intent.putExtra("title", context.getResources().getString(0x7f08049f, new Object[] {
            s
        }));
        intent.putExtra("description", context.getResources().getString(0x7f08049e, new Object[] {
            s
        }));
        s = Calendar.getInstance();
        s1 = (new DateFormatSymbols()).getWeekdays()[s.get(7)].substring(0, 2).toUpperCase();
        intent.putExtra("rrule", (new StringBuilder("FREQ=WEEKLY;BYDAY=")).append(s1).toString());
        TimeUtil.b(s);
        l = s.getTimeInMillis() + TimeUnit.MILLISECONDS.convert(7L, TimeUnit.DAYS);
        l1 = TimeUnit.MILLISECONDS.convert(30L, TimeUnit.MINUTES);
        intent.putExtra("beginTime", l);
        intent.putExtra("endTime", l + l1);
        return intent;
    }

    private Class getHomeActivity()
    {
        if (!layoutExperience.isMultipane())
        {
            return com/skype/android/app/main/HubMaterialActivity;
        } else
        {
            return com/skype/android/app/main/HubActivity;
        }
    }

    private Intent getMobileVerificationIntent(com.skype.android.app.mnv.MnvCases.REFERRER referrer)
    {
        return intentForMnvActivity(referrer, com/skype/android/app/mnv/MnvAddFriendsFragment);
    }

    private boolean handleBlockedContact(Contact contact)
    {
        if (contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_BLOCKED_BY_ME) && (context instanceof FragmentActivity))
        {
            FragmentActivity fragmentactivity = (FragmentActivity)context;
            ((ContactBlockedDialog)SkypeDialogFragment.create(contact, com/skype/android/app/contacts/ContactBlockedDialog)).show(fragmentactivity.getSupportFragmentManager());
            return true;
        } else
        {
            return false;
        }
    }

    private Intent intentForCallPlacement(Conversation conversation)
    {
        dreamKeeper.b();
        conversation = intentFor(conversation, com/skype/android/app/calling/PreCallActivity);
        conversation.putExtra("outgoing", true);
        return conversation;
    }

    private Intent intentForCallPlacement(List list, String s)
    {
        list = conversationUtil.a(list);
        if (s != null)
        {
            list.setTopic(s, false);
        }
        list = intentForCallPlacement(((Conversation) (list)));
        if (newTask())
        {
            list.addFlags(0x4000000);
        }
        return list;
    }

    private Intent intentForMnvActivity(com.skype.android.app.mnv.MnvCases.REFERRER referrer, Class class1)
    {
        Intent intent = intentFor(com/skype/android/app/mnv/MnvActivity);
        intent.putExtra("fragmentClass", class1);
        if (referrer != null)
        {
            intent.putExtra("referrerId", referrer);
        }
        intent.putExtra("fragmentTag", class1.getSimpleName());
        return intent;
    }

    private Intent intentForOngoingCall(Conversation conversation)
    {
        conversation = intentFor(conversation, com/skype/android/app/calling/CallActivity);
        conversation.addFlags(0x4000000);
        return conversation;
    }

    private boolean newTask()
    {
        return !(context instanceof Activity);
    }

    private boolean shouldStartActivity(Intent intent)
    {
        if (!Class.forName(intent.getComponent().getClassName()).isAnnotationPresent(com/skype/android/annotation/RequireNotOffline))
        {
            break MISSING_BLOCK_LABEL_92;
        }
        intent = accountProvider.get().getAvailabilityProp();
        if (intent != com.skype.Contact.AVAILABILITY.OFFLINE && intent != com.skype.Contact.AVAILABILITY.OFFLINE_BUT_CF_ABLE && intent != com.skype.Contact.AVAILABILITY.OFFLINE_BUT_VM_ABLE || !(context instanceof FragmentActivity))
        {
            break MISSING_BLOCK_LABEL_92;
        }
        intent = (FragmentActivity)context;
        (new OfflineWarningDialog()).show(intent.getSupportFragmentManager());
        return false;
        intent;
        intent.printStackTrace();
        return true;
    }

    private void startActivity(Intent intent)
    {
        if (shouldStartActivity(intent))
        {
            context.startActivity(intent);
        }
    }

    private void startActivityForResult(Intent intent, int i)
    {
        if (shouldStartActivity(intent) && (context instanceof SkypeActivity))
        {
            ((SkypeActivity)context).startActivityForResult(intent, i);
        }
    }

    private void upToHome(int i)
    {
        Intent intent = intentFor(getHomeActivity());
        intent.addFlags(0x4000000);
        if (i >= 0)
        {
            intent.putExtra("com.skype.index", i);
        }
        if ((context instanceof Activity) && !((Activity)context).isTaskRoot())
        {
            t.b((Activity)context, intent);
            return;
        } else
        {
            startActivity(intent);
            return;
        }
    }

    public void chat(Contact contact)
    {
        chat(contact, true);
    }

    public void chat(Contact contact, boolean flag)
    {
        if (handleBlockedContact(contact))
        {
            return;
        } else
        {
            ConversationImpl conversationimpl = new ConversationImpl();
            contact.openConversation(conversationimpl);
            chat(((Conversation) (conversationimpl)), flag);
            return;
        }
    }

    public void chat(Conversation conversation)
    {
        chat(conversation, true);
    }

    public void chat(Conversation conversation, int i, long l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("messageIdScrollTo", i);
        bundle.putLong("loadUntilTimestamp", l);
        chat(conversation, true, bundle);
    }

    public void chat(Conversation conversation, boolean flag)
    {
        chat(conversation, flag, ((Bundle) (null)));
    }

    public void chat(ContactItem contactitem)
    {
        if (contactitem.isLocalContact())
        {
            invite(contactitem.getIdentity());
        } else
        {
            ContactImpl contactimpl = new ContactImpl();
            if (lib.getContact(contactitem.getContactObjectId(), contactimpl))
            {
                chat(((Contact) (contactimpl)));
                return;
            }
        }
    }

    public void chatWithUpAsBack(String s, boolean flag)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        lib.getConversationByIdentity(s, conversationimpl, true);
        s = intentFor(conversationimpl, com/skype/android/app/chat/ChatActivity);
        if (flag)
        {
            s.addFlags(0x4000000);
        }
        s.putExtra("com.skype.upIsBack", true);
        startActivity(s);
    }

    public void dialWithNumber(String s)
    {
        Intent intent = new Intent(context, com/skype/android/app/dialer/DialpadActivity);
        intent.putExtra("phone", s);
        if (newTask())
        {
            intent.addFlags(0x10000000);
            intent.addFlags(0x4000000);
        }
        startActivity(intent);
    }

    public Class getSignInLandingPage()
    {
        if (configuration.isAccountDisambiguationSupported())
        {
            return com/skype/android/app/signin/UnifiedLandingPageActivity;
        } else
        {
            return com/skype/android/app/signin/SimpleLandingPageActivity;
        }
    }

    public void groupProfile(Conversation conversation)
    {
        startIntentFor(conversation, com/skype/android/app/chat/ParticipantActivity);
    }

    public void home()
    {
        Intent intent = intentFor(getHomeActivity());
        intent.addFlags(0x4000000);
        startActivity(intent);
    }

    public void home(int i)
    {
        Intent intent = intentFor(getHomeActivity());
        if (i >= 0)
        {
            intent.putExtra("com.skype.index", i);
        }
        intent.addFlags(0x4000000);
        startActivity(intent);
    }

    public Intent intentFor(ObjectInterface objectinterface, Class class1)
    {
        class1 = new Intent(context, class1);
        if (objectinterface != null)
        {
            class1.putExtra("com.skype.objId", objectinterface.getObjectID());
            class1.putExtra("com.skype.objClass", objectinterface.getClass().getName());
        }
        if (newTask())
        {
            class1.addFlags(0x10000000);
        }
        return class1;
    }

    public Intent intentFor(Class class1)
    {
        class1 = new Intent(context, class1);
        if (newTask())
        {
            class1.addFlags(0x4000000);
            class1.addFlags(0x10000000);
        }
        return class1;
    }

    public Intent intentForLandingPageForUserWithPwdSaved()
    {
        analytics.a(LogEvent.g);
        return intentFor(com/skype/android/app/signin/LandingPageActivity);
    }

    public Intent intentForMediaPickerSearch(Conversation conversation)
    {
        return intentFor(conversation, com/skype/android/app/chat/picker/Search/MediaPickerSearchActivity);
    }

    public Intent intentForSuggestedContactsPicker()
    {
        Intent intent = intentFor(com/skype/android/app/contacts/ContactPickerActivity);
        intent.putExtra("fragmentClass", com/skype/android/app/contacts/ContactSuggestedInvitesPickerFragment);
        intent.putExtra("CHECKBOX_MODE", true);
        intent.putExtra("EXTRA_MODE", 2);
        return intent;
    }

    public void invite(String s)
    {
        if (configuration.showExternalContacts())
        {
            Intent intent = new Intent(context, com/skype/android/app/contacts/OffNetworkInviteActivity);
            intent.putExtra("extra_lookupkey", s);
            startActivity(intent);
        }
    }

    public void joinCall(Conversation conversation)
    {
        conversation = intentForCallPlacement(conversation);
        conversation.putExtra("joinLiveSession", true);
        checkNetworkAndStartActivity(conversation);
    }

    public void launchMobileVerification(Preference preference, com.skype.android.app.mnv.MnvCases.REFERRER referrer)
    {
        preference.setIntent(getMobileVerificationIntent(referrer));
    }

    public void launchMobileVerification(com.skype.android.app.mnv.MnvCases.REFERRER referrer)
    {
        startActivity(getMobileVerificationIntent(referrer));
    }

    public void myProfile()
    {
        startActivity(new Intent(context, com/skype/android/app/account/MyInfoActivity));
    }

    public void openDirectionInExternalApp(float f, float f1)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("geo:0,0?q=")).append(f).append(",").append(f1).toString()));
        context.startActivity(intent);
    }

    public void outlookNotInstalled(String s)
    {
        Intent intent = intentFor(com/skype/android/app/chat/OutlookNotInstalledActivity);
        intent.putExtra("contactName", s);
        startActivity(intent);
    }

    public PendingIntent pendingIntentForCallPlacement(Conversation conversation)
    {
        analytics.c(AnalyticsEvent.dh);
        return PendingIntent.getActivity(context, 0, intentForCallPlacement(conversation), 0x10000000);
    }

    public PendingIntent pendingIntentForChatPlacement(Conversation conversation)
    {
        analytics.c(AnalyticsEvent.di);
        conversation = intentFor(conversation, com/skype/android/app/chat/ChatActivity);
        conversation.putExtra("is_writing", true);
        return PendingIntent.getActivity(context, 0, conversation, 0x10000000);
    }

    public PendingIntent pendingIntentForRecent()
    {
        Intent intent = intentFor(null, getHomeActivity());
        return PendingIntent.getActivity(context, 0, intent, 0x10000000);
    }

    public void people()
    {
        Intent intent = intentFor(getHomeActivity());
        intent.addFlags(0x4000000);
        intent.putExtra("com.skype.index", HubSection.CONTACTS.getIndex());
        startActivity(intent);
    }

    public void placeCall(Contact contact)
    {
        placeCall(Collections.singletonList(contact), ((String) (null)));
    }

    public void placeCall(Contact contact, PROPKEY propkey)
    {
        placeCall(contact, contact.getStrProperty(propkey));
    }

    public void placeCall(Contact contact, String s)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        contact.openConversation(conversationimpl);
        contact = intentForCallPlacement(conversationimpl);
        contact.putExtra("com.skype.identitiy", s);
        checkNetworkAndStartActivity(contact);
    }

    public void placeCall(Conversation conversation)
    {
        checkNetworkAndStartActivity(intentForCallPlacement(conversation));
    }

    public void placeCall(List list, String s)
    {
        analytics.c(AnalyticsEvent.h);
        checkNetworkAndStartActivity(intentForCallPlacement(list, s));
    }

    public boolean placeCall(String s)
    {
        ContactImpl contactimpl = new ContactImpl();
        if (lib.getContact(s, contactimpl))
        {
            placeCall(((Contact) (contactimpl)));
            return true;
        } else
        {
            return false;
        }
    }

    public void placeCallWithVideo(Contact contact)
    {
        placeCallWithVideo(Collections.singletonList(contact), null);
    }

    public void placeCallWithVideo(Conversation conversation)
    {
        analytics.c(AnalyticsEvent.R);
        conversation = intentForCallPlacement(conversation);
        conversation.putExtra("extraVideo", true);
        checkNetworkAndStartActivity(conversation);
    }

    public void placeCallWithVideo(List list, String s)
    {
        analytics.c(AnalyticsEvent.R);
        list = intentForCallPlacement(list, s);
        list.putExtra("extraVideo", true);
        checkNetworkAndStartActivity(list);
    }

    public void playVideoMessage(Message message)
    {
        startActivity(intentFor(message, com/skype/android/app/vim/VideoMessagePlayerActivity));
    }

    public void profile(Contact contact)
    {
        startActivity(intentFor(contact, com/skype/android/app/contacts/ContactProfileActivity));
    }

    public void profileForResult(Contact contact, int i)
    {
        startActivityForResult(intentFor(contact, com/skype/android/app/contacts/ContactProfileActivity), i);
    }

    public void scheduleCallInAnyCalendar(String s)
    {
        s = Intent.createChooser(getCalendarIntent(false, s), context.getResources().getString(0x7f080317));
        context.startActivity(s);
    }

    public void scheduleCallInOutlookCalendar(String s)
    {
        s = getCalendarIntent(true, s);
        context.startActivity(s);
    }

    public void settings()
    {
        startActivity(new Intent(context, com/skype/android/app/settings/SettingsActivity));
    }

    public void share(String s)
    {
        Intent intent = intentFor(com/skype/android/app/chat/AddParticipantsActivity);
        intent.putExtra("shareContent", s);
        startActivity(intent);
    }

    public void showImage(MediaDocument mediadocument, String s)
    {
        analytics.c(AnalyticsEvent.br);
        mediadocument = intentFor(mediadocument, com/skype/android/app/media/MediaPhotoViewerActivity);
        mediadocument.putExtra("TITLE_TEXT", s);
        startActivity(mediadocument);
    }

    public void signup()
    {
        Object obj;
        Intent intent;
        if (configuration.isMsaUsedForNewAccount())
        {
            obj = com/skype/android/app/signin/AuthenticateWithMsaActivity;
        } else
        {
            obj = com/skype/android/app/signin/SignUpActivity;
        }
        obj = new Intent(context, ((Class) (obj)));
        ((Intent) (obj)).putExtra("msasignup", true);
        intent = intentFor(com/skype/android/app/signin/TermsOfUseActivity);
        intent.putExtra("com.skype.nextIntent", ((android.os.Parcelable) (obj)));
        startActivity(intent);
    }

    public void sms(Contact contact)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        contact.openConversation(conversationimpl);
        contact = intentFor(conversationimpl, com/skype/android/app/chat/ChatActivity);
        contact.putExtra("startInSmsMode", true);
        startActivity(contact);
    }

    public void startIntentFor(ObjectInterface objectinterface, Class class1)
    {
        startActivity(intentFor(objectinterface, class1));
    }

    public void startMnvPinEntryWithResult(com.skype.android.app.mnv.MnvCases.REFERRER referrer, int i)
    {
        startActivityForResult(intentForMnvActivity(referrer, com/skype/android/app/mnv/MnvEnterPinFragment), i);
    }

    public void toLandingPage(Account account)
    {
        toLandingPage(account, true);
    }

    public void toLandingPage(Account account, boolean flag)
    {
        boolean flag2 = true;
        boolean flag1 = flag2;
        if (account != null)
        {
            flag1 = flag2;
            if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
            {
                flag1 = flag2;
                if ((new UserPreferences(account, (Application)context.getApplicationContext())).saveUserPwdOnLogout())
                {
                    flag1 = flag2;
                    static final class _cls1
                    {

                        static final int $SwitchMap$com$skype$Account$LOGOUTREASON[];

                        static 
                        {
                            $SwitchMap$com$skype$Account$LOGOUTREASON = new int[com.skype.Account.LOGOUTREASON.values().length];
                            try
                            {
                                $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.INCORRECT_PASSWORD.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.UNACCEPTABLE_PASSWORD.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.PASSWORD_HAS_CHANGED.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    switch (_cls1..SwitchMap.com.skype.Account.LOGOUTREASON[account.getLogoutReasonProp().ordinal()])
                    {
                    default:
                        flag1 = false;
                        break;

                    case 1: // '\001'
                    case 2: // '\002'
                    case 3: // '\003'
                        break;
                    }
                }
            }
        }
        if (flag1)
        {
            account = intentFor(getSignInLandingPage());
        } else
        {
            account = intentForLandingPageForUserWithPwdSaved();
        }
        if (flag)
        {
            account.addFlags(32768);
            account.addFlags(0x10000000);
        }
        context.startActivity(account);
    }

    public void toLocation(Conversation conversation)
    {
        startIntentFor(conversation, com/skype/android/app/location/SendLocationActivity);
    }

    public void toLocation(Message message, boolean flag)
    {
        if (!message.getLocation().m_return)
        {
            throw new RuntimeException("navigate.toLocation called with a message without location");
        } else
        {
            message = intentFor(message, com/skype/android/app/location/ReceivedLocationActivity);
            message.putExtra("isFromMe", flag);
            startActivity(message);
            return;
        }
    }

    public void toMigratedChat(Conversation conversation)
    {
        conversation = intentFor(conversation, com/skype/android/app/chat/MigratedChatActivity);
        conversation.addFlags(0x4000000);
        startActivity(conversation);
    }

    public void toMnvAddNumber(com.skype.android.app.mnv.MnvCases.REFERRER referrer)
    {
        Intent intent = intentFor(com/skype/android/app/mnv/MnvAddNumberActivity);
        intent.putExtra("referrerId", referrer);
        intent.addFlags(0x4000000);
        startActivity(intent);
    }

    public void toMnvCheckingAccount(com.skype.android.app.mnv.MnvCases.REFERRER referrer)
    {
        StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.c);
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.g);
        startActivity(intentForMnvActivity(referrer, com/skype/android/app/mnv/MnvCheckingAccountFragment));
    }

    public void toMnvError(com.skype.android.app.mnv.MnvCases.REFERRER referrer)
    {
        startActivity(intentForMnvActivity(referrer, com/skype/android/app/mnv/MnvErrorFragment));
    }

    public void toMnvLearnMore()
    {
        startActivity(intentForMnvActivity(null, com/skype/android/app/mnv/MnvLearnMoreFragment));
    }

    public void toMnvVerified(com.skype.android.app.mnv.MnvCases.REFERRER referrer)
    {
        startActivity(intentForMnvActivity(referrer, com/skype/android/app/mnv/MnvVerifiedFragment));
    }

    public void toOngoingCall(Conversation conversation)
    {
        startActivity(intentForOngoingCall(conversation));
    }

    public void upToHome()
    {
        upToHome(-1);
    }

    public void upToRecents()
    {
        if (layoutExperience.isMultipane())
        {
            startActivity(intentFor(com/skype/android/app/recents/RecentListActivity));
            return;
        } else
        {
            upToHome(HubSection.RECENTS.getIndex());
            return;
        }
    }

    public void videoMessage(Conversation conversation)
    {
        startActivity(intentFor(conversation, com/skype/android/app/vim/VideoMessageRecorderActivity));
    }
}
