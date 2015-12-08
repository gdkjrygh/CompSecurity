// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import com.pinterest.activity.contacts.UploadContactsUtil;
import com.pinterest.activity.settings.dialog.CountrySettingDialog;
import com.pinterest.activity.settings.model.AccountSettings;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.dialog.SimpleTextDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.ListFragment;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Partner;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.api.remote.SettingsApi;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.notify.DialogCheckedTextViewAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

// Referenced classes of package com.pinterest.activity.settings:
//            AccountSettingsAdapter

public class UpdatedAccountSettingsFragment extends ListFragment
    implements android.widget.AdapterView.OnItemClickListener
{

    private static final String TEMP_STR = "(%1$s)";
    public static final int TYPE_ABOUT = 0x7f07002b;
    public static final int TYPE_ABOUT_YOU = 0x7f070032;
    public static final int TYPE_ACCOUNT = 0x7f07003a;
    public static final int TYPE_BUSINESS_NAME = 0x7f0700a6;
    public static final int TYPE_CHANGE_PASSWORD = 0x7f0700db;
    private static final int TYPE_CHECKED_TEXT = 2;
    public static final int TYPE_CONTACT_NAME = 0x7f070177;
    public static final int TYPE_COUNTRY = 0x7f070190;
    public static final int TYPE_DEACTIVATE = 0x7f0701c0;
    public static final int TYPE_EMAIL = 0x7f070533;
    public static final int TYPE_EMAIL_NOTIFY = 0x7f070235;
    public static final int TYPE_FACEBOOK = 0x7f070280;
    public static final int TYPE_GENDER = 0x7f07053c;
    public static final int TYPE_GENERAL_SETTINGS = 0x7f0702cc;
    public static final int TYPE_GOOGLE = 0x7f0702d8;
    public static final int TYPE_LANGUAGE = 0x7f070318;
    public static final int TYPE_LOCATION = 0x7f070344;
    public static final int TYPE_LOGIN_FB = 0x7f070357;
    public static final int TYPE_LOGIN_GOOGLE = 0x7f070358;
    public static final int TYPE_LOGIN_RAKUTEN = 0x7f070359;
    public static final int TYPE_LOGIN_TWITTER = 0x7f07035a;
    public static final int TYPE_NAME = 0x7f07053e;
    public static final int TYPE_OFFLINE_ACCESS = 0x7f070039;
    public static final int TYPE_PERSONALIZATION = 0x7f0703e5;
    public static final int TYPE_PROFILE = 0x7f07046c;
    public static final int TYPE_PUSH_NOTIFY = 0x7f07036c;
    public static final int TYPE_RAKUTEN = 0x7f07047b;
    public static final int TYPE_RECENT_SEARCH = 0x7f0700e6;
    public static final int TYPE_SEARCH_ENGINE_PRIVACY = 0x7f0704e1;
    public static final int TYPE_STORE_CONTACTS = 0x7f070573;
    private static final int TYPE_TEXT_VALUE = 1;
    private static final int TYPE_TITLE = 0;
    public static final int TYPE_TWITTER = 0x7f0705a4;
    public static final int TYPE_UPDATE_OTA = 0x7f07073c;
    public static final int TYPE_USERNAME = 0x7f070551;
    public static final int TYPE_VERSION = 0x7f0705d9;
    public static final int TYPE_WEBSITE = 0x7f0705ee;
    private static ArrayList sNotifArray;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private ApiResponseHandler _notifHandler;
    private PinterestJsonArray _notifs;
    SettingsFeed _settingsFeed;
    private HashMap _settingsMap;
    ArrayList dialogItems;
    android.widget.AdapterView.OnItemClickListener notifItemClicked;
    public android.view.View.OnClickListener onCheckedTextViewClicked;
    public android.view.View.OnClickListener onTextValueViewClicked;
    private BaseDialog pushNotifDialog;
    private boolean shouldAddPushNotif;

    public UpdatedAccountSettingsFragment()
    {
        _settingsMap = new LinkedHashMap();
        shouldAddPushNotif = true;
        _eventsSubscriber = new _cls1();
        onTextValueViewClicked = new _cls2();
        onCheckedTextViewClicked = new _cls3();
        notifItemClicked = new _cls5();
        _notifHandler = new _cls15();
    }

    private void addAboutOtaItems()
    {
        addTitleItems(0x7f07002b);
        if (ApplicationInfo.isOta())
        {
            addAccountSettings(0x7f07073c, 1, null);
        }
        addAccountSettings(0x7f0705d9, 1, ApplicationInfo.getVersionName());
    }

    private void addAccountSettings(int i, int j, String s)
    {
        String s1 = Resources.string(i);
        _settingsMap.put(Integer.valueOf(i), new AccountSettings(s1, j, s, i));
    }

    private void addAccountSettingsChecked(int i, int j, Boolean boolean1)
    {
        String s = Resources.string(i);
        _settingsMap.put(Integer.valueOf(i), new AccountSettings(s, j, null, boolean1, i));
    }

    private void addDeactivateAccountItems()
    {
        addTitleItems(0x7f07003a);
        addAccountSettings(0x7f0701c0, 1, null);
    }

    private void addGeneralItems()
    {
        addTitleItems(0x7f0702cc);
        if (shouldAddPushNotif)
        {
            addAccountSettings(0x7f07036c, 1, null);
        }
        addAccountSettings(0x7f070235, 1, null);
        if (Experiments.v())
        {
            addAccountSettings(0x7f070039, 1, null);
        }
        addAccountSettings(0x7f0700e6, 1, null);
        addAccountSettings(0x7f0704e1, 1, null);
        addAccountSettings(0x7f0703e5, 1, null);
        addAccountSettingsChecked(0x7f070573, 2, Boolean.valueOf(UploadContactsUtil.isAccountStoredContacts()));
    }

    private void addProfileItems()
    {
        addTitleItems(0x7f07046c);
        if (MyUser.get() != null)
        {
            User user = MyUser.get();
            Partner partner = user.getPartner();
            if (partner != null)
            {
                addAccountSettings(0x7f0700a6, 1, partner.getBusinessName());
                addAccountSettings(0x7f070177, 1, partner.getContactName());
            } else
            {
                addAccountSettings(0x7f07053e, 1, user.getFullName());
            }
            addAccountSettings(0x7f070551, 1, user.getUsername());
            if (Experiments.x())
            {
                addAccountSettings(0x7f070032, 1, user.getAbout());
                addAccountSettings(0x7f0705ee, 1, user.getWebsite());
                addAccountSettings(0x7f070344, 1, user.getLocation());
            }
            addAccountSettings(0x7f070533, 1, user.getEmail());
            addAccountSettings(0x7f070190, 1, LocaleUtils.getCountry());
            if (partner == null)
            {
                addAccountSettings(0x7f07053c, 1, getGenderText(user.getGender()));
            }
            addAccountSettings(0x7f070318, 1, Resources.string(0x7f0705d1));
            addAccountSettings(0x7f0700db, 1, null);
        }
    }

    private void addSocialNetworkItems()
    {
        addTitleItems(0x7f070280);
        addAccountSettingsChecked(0x7f070357, 2, Boolean.valueOf(MyUser.isConnectedToFacebook()));
        if (GooglePlayServices.isAvailable())
        {
            addTitleItems(0x7f0702d8);
            addAccountSettingsChecked(0x7f070358, 2, Boolean.valueOf(MyUser.isConnectedToGplus()));
        }
        addTitleItems(0x7f0705a4);
        addAccountSettingsChecked(0x7f07035a, 2, Boolean.valueOf(MyUser.isConnectedToTwitter()));
        if (LocaleUtils.isLanguageJa())
        {
            addTitleItems(0x7f07047b);
            addAccountSettingsChecked(0x7f070359, 2, Boolean.valueOf(MyUser.isConnectedToRakuten()));
        }
    }

    private void addTitleItems(int i)
    {
        String s = Resources.string(i);
        _settingsMap.put(Integer.valueOf(i), new AccountSettings(s, 0, null, i));
    }

    private void constructSettingsFeed()
    {
        addProfileItems();
        addSocialNetworkItems();
        addGeneralItems();
        addDeactivateAccountItems();
        addAboutOtaItems();
        makeFeed();
    }

    private String getGenderText(String s)
    {
        if (s.equals("female"))
        {
            return Resources.string(0x7f070545);
        }
        if (s.equals("male"))
        {
            return Resources.string(0x7f070546);
        }
        if (s.equals("unspecified"))
        {
            s = MyUser.get();
            if (s != null && s.getCustomGender() != null)
            {
                return s.getCustomGender();
            } else
            {
                return Resources.string(0x7f070549);
            }
        } else
        {
            return null;
        }
    }

    private void initNotifKeyArray()
    {
        if (sNotifArray == null || dialogItems == null)
        {
            sNotifArray = new ArrayList();
            dialogItems = new ArrayList();
            int i = 0;
            while (i < _notifs.a()) 
            {
                try
                {
                    PinterestJsonObject pinterestjsonobject = _notifs.d(i);
                    sNotifArray.add(pinterestjsonobject.a("key", ""));
                    dialogItems.add(pinterestjsonobject.a("label", ""));
                }
                catch (Exception exception) { }
                i++;
            }
        }
    }

    private void loadCountries()
    {
        SettingsApi.c(new _cls4(), getApiTag());
    }

    private void loadMyUser()
    {
        MyUserApi.a(new _cls13(true), getApiTag());
    }

    private void loadNotifSettings()
    {
        SettingsApi.b(_notifHandler, getApiTag());
    }

    private void loadSettings()
    {
        SettingsApi.a(new _cls14(), getApiTag());
    }

    private void makeFeed()
    {
        _settingsFeed = new SettingsFeed(_settingsMap);
        ((AccountSettingsAdapter)_adapter).setDataSource(_settingsFeed);
    }

    private void promptDisconnectSocial(final com.pinterest.base.Social.Network methodName, final CheckedTextView socialCb)
    {
        _cls16..SwitchMap.com.pinterest.base.Social.Network[methodName.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 138
    //                   2 172
    //                   3 155;
           goto _L1 _L2 _L3 _L4
_L1:
        int i;
        int j;
        j = 0x7f070201;
        i = 0x7f070200;
        methodName = "actuallyDisconnectRakuten";
_L6:
        final SimpleTextDialog dialog = SimpleTextDialog.newInstance();
        dialog.setTitle(j);
        dialog.setText(getString(i).replace("(%1$s)", ""));
        dialog.setPositiveButton(0x7f0701ff, new _cls6());
        dialog.setNegativeButton(0x7f0701fe, new _cls7());
        dialog.addOnDismissListener(new _cls8());
        Events.post(new DialogEvent(dialog));
        return;
_L2:
        j = 0x7f0701fb;
        i = 0x7f0701fa;
        methodName = "actuallyDisconnectFb";
        continue; /* Loop/switch isn't completed */
_L4:
        j = 0x7f0701fd;
        i = 0x7f0701fc;
        methodName = "actuallyDisconnectGplus";
        continue; /* Loop/switch isn't completed */
_L3:
        j = 0x7f070203;
        i = 0x7f070202;
        methodName = "actuallyDisconnectTwitter";
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void registerEvents()
    {
        Events.register(_eventsSubscriber, com/pinterest/base/Social$UpdateEvent, new Class[] {
            com/pinterest/api/model/MyUser$UpdateEvent, com/pinterest/activity/contacts/UploadContactsUtil$UploadContactsCancelledEvent, com/pinterest/activity/settings/UpdatedAccountSettingsFragment$AccountSettingsEvent
        });
    }

    private void showCountriesDialog()
    {
        if (DiskCache.getJsonObject("COUNTRIES") == null)
        {
            return;
        } else
        {
            Events.post(new DialogEvent(new CountrySettingDialog()));
            return;
        }
    }

    private void showLanguageSetting()
    {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName("com.android.settings", "com.android.settings.LanguageSettings");
        try
        {
            getActivity().startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            CrashReporting.a(exception);
        }
    }

    private void showNotifSettingDialog()
    {
        if (dialogItems == null)
        {
            return;
        } else
        {
            pushNotifDialog = new BaseDialog();
            pushNotifDialog.setTitle(0x7f07036c);
            pushNotifDialog.setSubTitle(0x7f0702d3);
            DialogCheckedTextViewAdapter dialogcheckedtextviewadapter = new DialogCheckedTextViewAdapter(dialogItems, _notifs);
            pushNotifDialog.setListViewOptions(dialogcheckedtextviewadapter, notifItemClicked);
            pushNotifDialog.setPositiveButton(0x7f0703d3, null);
            Events.post(new DialogEvent(pushNotifDialog));
            return;
        }
    }

    private void showProfileDialog(ElementType elementtype, BaseDialog basedialog)
    {
        if (elementtype != null)
        {
            Pinalytics.a(elementtype);
        }
        Events.post(new DialogEvent(basedialog));
    }

    private void unregisterEvents()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/base/Social$UpdateEvent, com/pinterest/api/model/MyUser$UpdateEvent, com/pinterest/activity/contacts/UploadContactsUtil$UploadContactsCancelledEvent, com/pinterest/activity/settings/UpdatedAccountSettingsFragment$AccountSettingsEvent
        });
    }

    private void updateCountryEmailSetting()
    {
        Object obj = (AccountSettings)_settingsMap.get(Integer.valueOf(0x7f070190));
        if (obj != null)
        {
            ((AccountSettings) (obj)).setValue(LocaleUtils.getCountry());
        }
        obj = MyUser.get();
        if (obj != null)
        {
            AccountSettings accountsettings = (AccountSettings)_settingsMap.get(Integer.valueOf(0x7f070533));
            if (accountsettings != null)
            {
                accountsettings.setValue(((User) (obj)).getEmail());
            }
        }
        makeFeed();
        ((AccountSettingsAdapter)_adapter).notifyDataSetChanged();
    }

    private void updateSocialMediaCbs(com.pinterest.base.Social.Network network)
    {
        _cls16..SwitchMap.com.pinterest.base.Social.Network[network.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 81
    //                   2 147
    //                   3 114;
           goto _L1 _L2 _L3 _L4
_L1:
        network = (AccountSettings)_settingsMap.get(Integer.valueOf(0x7f070359));
        if (network != null)
        {
            network.setChecked(Boolean.valueOf(MyUser.isConnectedToRakuten()));
        }
_L6:
        makeFeed();
        ((AccountSettingsAdapter)_adapter).notifyDataSetChanged();
        return;
_L2:
        network = (AccountSettings)_settingsMap.get(Integer.valueOf(0x7f070357));
        if (network != null)
        {
            network.setChecked(Boolean.valueOf(MyUser.isConnectedToFacebook()));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        network = (AccountSettings)_settingsMap.get(Integer.valueOf(0x7f070358));
        if (network != null)
        {
            network.setChecked(Boolean.valueOf(MyUser.isConnectedToGplus()));
        }
        continue; /* Loop/switch isn't completed */
_L3:
        network = (AccountSettings)_settingsMap.get(Integer.valueOf(0x7f07035a));
        if (network != null)
        {
            network.setChecked(Boolean.valueOf(MyUser.isConnectedToTwitter()));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateStoreContactsSettings()
    {
        AccountSettings accountsettings = (AccountSettings)_settingsMap.get(Integer.valueOf(0x7f070573));
        if (accountsettings != null)
        {
            accountsettings.setChecked(Boolean.valueOf(false));
            makeFeed();
            ((AccountSettingsAdapter)_adapter).notifyDataSetChanged();
        }
    }

    private void updateUi()
    {
        constructSettingsFeed();
    }

    void actuallyDisconnectFb()
    {
        MyUserApi.a(3, new _cls10(true), getApiTag());
    }

    void actuallyDisconnectGplus()
    {
        MyUserApi.a(5, new _cls9(true), getApiTag());
    }

    void actuallyDisconnectRakuten()
    {
        MyUserApi.a(4, new _cls12(true), getApiTag());
    }

    void actuallyDisconnectTwitter()
    {
        MyUserApi.a(2, new _cls11(true), getApiTag());
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        loadMyUser();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030116;
        _menuId = 0x7f100009;
        _adapter = new AccountSettingsAdapter();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        unregisterEvents();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (AccountSettings)((AccountSettingsAdapter)_adapter).getItem(i);
        if (adapterview != null)
        {
            i = adapterview.getType();
            if (i == 2)
            {
                onCheckedTextViewClicked.onClick(view);
                return;
            }
            if (i == 1)
            {
                onTextValueViewClicked.onClick(view);
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        registerEvents();
        _actionBar.setTitle(0x7f07003b);
        _actionBarWrapper.setShadowVisibility(0);
        _listView = (ListView)view.findViewById(0x7f0f02d3);
        _listView.setAdapter(_adapter);
        _listView.setOnItemClickListener(this);
    }













/*
    static PinterestJsonArray access$1802(UpdatedAccountSettingsFragment updatedaccountsettingsfragment, PinterestJsonArray pinterestjsonarray)
    {
        updatedaccountsettingsfragment._notifs = pinterestjsonarray;
        return pinterestjsonarray;
    }

*/





/*
    static boolean access$2102(UpdatedAccountSettingsFragment updatedaccountsettingsfragment, boolean flag)
    {
        updatedaccountsettingsfragment.shouldAddPushNotif = flag;
        return flag;
    }

*/









    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onEventMainThread(com.pinterest.activity.contacts.UploadContactsUtil.UploadContactsCancelledEvent uploadcontactscancelledevent)
        {
            updateStoreContactsSettings();
        }

        public void onEventMainThread(AccountSettingsEvent accountsettingsevent)
        {
            updateCountryEmailSetting();
        }

        public void onEventMainThread(com.pinterest.api.model.MyUser.UpdateEvent updateevent)
        {
            updateUi();
        }

        public void onEventMainThread(com.pinterest.base.Social.UpdateEvent updateevent)
        {
            switch (_cls16..SwitchMap.com.pinterest.base.Social.Network[updateevent.getNetwork().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                updateSocialMediaCbs(com.pinterest.base.Social.Network.FACEBOOK);
                return;

            case 2: // '\002'
                updateSocialMediaCbs(com.pinterest.base.Social.Network.TWITTER);
                return;

            case 3: // '\003'
                updateSocialMediaCbs(com.pinterest.base.Social.Network.GPLUS);
                return;

            case 4: // '\004'
                updateSocialMediaCbs(com.pinterest.base.Social.Network.RAKUTEN);
                break;
            }
        }

        _cls1()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onClick(View view)
        {
            if (view == null)
            {
                return;
            }
            switch (((Integer)((TextValueSettingsListCell)view).getTag()).intValue())
            {
            default:
                return;

            case 2131165234: 
                showProfileDialog(ElementType.USER_ABOUT_BUTTON, new AboutSettingDialog());
                return;

            case 2131166526: 
                showProfileDialog(ElementType.NAME_BUTTON, new NameSettingDialog());
                return;

            case 2131165350: 
                showProfileDialog(ElementType.NAME_BUTTON, new BusinessNameSettingDialog());
                return;

            case 2131165559: 
                showProfileDialog(ElementType.NAME_BUTTON, new ContactNameSettingDialog());
                return;

            case 2131166545: 
                showProfileDialog(ElementType.USERNAME_BUTTON, new UsernameSettingDialog());
                return;

            case 2131166515: 
                Pinalytics.a(ElementType.EMAIL_BUTTON);
                view = ((TextView)view.findViewById(0x7f0f03a0)).getText().toString();
                showProfileDialog(ElementType.EMAIL_BUTTON, new EmailSettingDialog(view));
                return;

            case 2131166702: 
                showProfileDialog(ElementType.WEBSITE_BUTTON, new UserEditWebsiteDialog());
                return;

            case 2131166020: 
                showProfileDialog(ElementType.LOCATION_BUTTON, new LocationSettingDialog());
                return;

            case 2131165584: 
                Pinalytics.a(ElementType.COUNTRY_BUTTON);
                loadCountries();
                return;

            case 2131166524: 
                showProfileDialog(ElementType.GENDER_BUTTON, new GenderSettingDialog());
                return;

            case 2131165976: 
                Pinalytics.a(ElementType.LANGUAGE_BUTTON);
                showLanguageSetting();
                return;

            case 2131165403: 
                showProfileDialog(ElementType.CHANGE_PASSWORD_BUTTON, new ChangePasswordDialog());
                return;

            case 2131165749: 
                Pinalytics.a(ElementType.EMAIL_BUTTON);
                Events.post(new Navigation(Location.EMAIL_NOTIFICATIONS_SETTINGS));
                return;

            case 2131166060: 
                Pinalytics.a(ElementType.PUSH_NOTIFICATIONS_BUTTON);
                showNotifSettingDialog();
                return;

            case 2131165241: 
                Events.post(new Navigation(Location.OFFLINE_BOARDS_SETTINGS));
                return;

            case 2131165414: 
                Pinalytics.a(ElementType.CLEAR_SEARCHES_BUTTON);
                SearchApi.a(new ClearSearchHistoryApiResponseHandler(), getApiTag());
                return;

            case 2131166433: 
                showProfileDialog(ElementType.SEARCH_PRIVACY_BUTTON, new SearchPrivacyDialog());
                return;

            case 2131166181: 
                showProfileDialog(ElementType.PERSONALIZED_RECOMMENDATIONS_BUTTON, new PersonalizationSettingDialog());
                return;

            case 2131165632: 
                Events.post(new Navigation(Location.DEACTIVATE_ACCOUNT_SETTINGS));
                return;

            case 2131167036: 
                AutoUpdateManager.a().startUpdate(null);
                return;

            case 2131166681: 
                showProfileDialog(null, new SettingsVersionDialog());
                return;
            }
        }

        _cls2()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super();
        }

        private class ClearSearchHistoryApiResponseHandler extends BaseApiResponseHandler
        {

            final UpdatedAccountSettingsFragment this$0;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                Application.showToast(apiresponse.getMessage());
            }

            public void onSuccess(ApiResponse apiresponse)
            {
                Application.showToast(0x7f070484);
            }

            ClearSearchHistoryApiResponseHandler()
            {
                this$0 = UpdatedAccountSettingsFragment.this;
                super();
            }
        }

    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onClick(View view)
        {
            if (view == null)
            {
                return;
            }
            view = (CheckedTextViewSettingsListCell)view;
            int i = ((Integer)view.getTag()).intValue();
            boolean flag;
            if (!view.getSocialCheckedTv().isChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSocialChecked(Boolean.valueOf(flag));
            view = view.getSocialCheckedTv();
            switch (i)
            {
            default:
                return;

            case 2131166039: 
                if (view.isChecked())
                {
                    Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
                    return;
                } else
                {
                    promptDisconnectSocial(com.pinterest.base.Social.Network.FACEBOOK, view);
                    return;
                }

            case 2131166040: 
                if (view.isChecked())
                {
                    Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.GPLUS));
                    return;
                } else
                {
                    promptDisconnectSocial(com.pinterest.base.Social.Network.GPLUS, view);
                    return;
                }

            case 2131166042: 
                if (view.isChecked())
                {
                    Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.TWITTER));
                    return;
                } else
                {
                    promptDisconnectSocial(com.pinterest.base.Social.Network.TWITTER, view);
                    return;
                }

            case 2131166041: 
                if (view.isChecked())
                {
                    ActivityHelper.goRakutenAuth(getActivity());
                    return;
                } else
                {
                    promptDisconnectSocial(com.pinterest.base.Social.Network.RAKUTEN, view);
                    return;
                }

            case 2131166579: 
                Pinalytics.a(ElementType.ANALYTICS_BUTTON);
                break;
            }
            if (view.isChecked())
            {
                UploadContactsDialog uploadcontactsdialog = new UploadContactsDialog();
                Bundle bundle = new Bundle();
                bundle.putBoolean("shouldShowFbDialogNext", true);
                uploadcontactsdialog.setArguments(bundle);
                Events.post(new DialogEvent(uploadcontactsdialog));
            } else
            {
                UploadContactsUtil.setStoreContacts(false);
            }
            PLog.info((new StringBuilder("onStoreContactsClick: ")).append(view.isChecked()).toString(), new Object[0]);
        }

        _cls3()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super();
        }
    }


    private class _cls5
        implements android.widget.AdapterView.OnItemClickListener
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (view != null)
            {
                if ((adapterview = (CheckedTextView)view.findViewById(0x7f0f033a)) != null)
                {
                    boolean flag;
                    if (!adapterview.isChecked())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    adapterview.setChecked(flag);
                    if (UpdatedAccountSettingsFragment.sNotifArray != null)
                    {
                        view = (String)UpdatedAccountSettingsFragment.sNotifArray.get(i);
                        if (adapterview.isChecked())
                        {
                            adapterview = "anyone";
                        } else
                        {
                            adapterview = "none";
                        }
                        SettingsApi.d(view, adapterview, _notifHandler, getApiTag());
                        return;
                    }
                }
            }
        }

        _cls5()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super();
        }
    }


    private class _cls15 extends ApiResponseHandler
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            if (pushNotifDialog != null)
            {
                throwable = (DialogCheckedTextViewAdapter)pushNotifDialog.getAdapter();
                if (throwable != null)
                {
                    throwable.notifyDataSetChanged();
                }
            }
        }

        public void onSuccess(ApiResponse apiresponse)
        {
label0:
            {
label1:
                {
                    super.onSuccess(apiresponse);
                    apiresponse = ((ApiResponse) (apiresponse.getData()));
                    if (apiresponse instanceof PinterestJsonArray)
                    {
                        _notifs = (PinterestJsonArray)apiresponse;
                        if (pushNotifDialog != null)
                        {
                            apiresponse = (DialogCheckedTextViewAdapter)pushNotifDialog.getAdapter();
                            if (apiresponse != null)
                            {
                                apiresponse.updateNotifs(_notifs);
                            }
                        }
                        if (_notifs.a() != 0)
                        {
                            break label0;
                        }
                        if (_settingsMap.get(Integer.valueOf(0x7f07036c)) == null)
                        {
                            break label1;
                        }
                        _settingsMap.remove(Integer.valueOf(0x7f07036c));
                        if (_settingsFeed != null)
                        {
                            makeFeed();
                        }
                    }
                    return;
                }
                shouldAddPushNotif = false;
                return;
            }
            initNotifKeyArray();
        }

        _cls15()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super();
        }
    }


    private class _cls4 extends ApiResponseHandler
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            DiskCache.setJsonObject("COUNTRIES", (PinterestJsonObject)apiresponse.getData());
            if (isActive())
            {
                showCountriesDialog();
            }
        }

        _cls4()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super();
        }
    }


    private class _cls13 extends com.pinterest.api.remote.MyUserApi.MyUserApiResponse
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            constructSettingsFeed();
        }

        public void onSuccess(User user)
        {
            super.onSuccess(user);
            constructSettingsFeed();
            loadSettings();
            loadNotifSettings();
        }

        _cls13(boolean flag)
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super(flag);
        }
    }



    private class SettingsFeed extends Feed
    {

        final UpdatedAccountSettingsFragment this$0;

        protected List getPersistedItems()
        {
            return null;
        }

        public SettingsFeed(HashMap hashmap)
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super();
            setItems(new ArrayList(hashmap.values()));
        }
    }


    private class _cls16
    {

        static final int $SwitchMap$com$pinterest$base$Social$Network[];

        static 
        {
            $SwitchMap$com$pinterest$base$Social$Network = new int[com.pinterest.base.Social.Network.values().length];
            try
            {
                $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.FACEBOOK.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.TWITTER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.GPLUS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.RAKUTEN.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final UpdatedAccountSettingsFragment this$0;
        final SimpleTextDialog val$dialog;
        final String val$methodName;
        final CheckedTextView val$socialCb;

        public void onClick(View view)
        {
            try
            {
                socialCb.setChecked(false);
                com/pinterest/activity/settings/UpdatedAccountSettingsFragment.getDeclaredMethod(methodName, null).invoke(UpdatedAccountSettingsFragment.this, null);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                CrashReporting.a(view);
            }
            dialog.dismiss();
        }

        _cls6()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            socialCb = checkedtextview;
            methodName = s;
            dialog = simpletextdialog;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final UpdatedAccountSettingsFragment this$0;
        final SimpleTextDialog val$dialog;
        final CheckedTextView val$socialCb;

        public void onClick(View view)
        {
            socialCb.setChecked(true);
            dialog.dismiss();
        }

        _cls7()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            socialCb = checkedtextview;
            dialog = simpletextdialog;
            super();
        }
    }


    private class _cls8
        implements com.pinterest.activity.task.dialog.BaseDialog.OnDismissListener
    {

        final UpdatedAccountSettingsFragment this$0;
        final CheckedTextView val$socialCb;

        public void onDismiss(BaseDialog basedialog)
        {
            socialCb.setChecked(true);
        }

        _cls8()
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            socialCb = checkedtextview;
            super();
        }
    }


    private class _cls10 extends ApiResponseHandler
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onFinish()
        {
            onFinish();
            updateSocialMediaCbs(com.pinterest.base.Social.Network.FACEBOOK);
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            Pinalytics.a(EventType.USER_DISABLE_FACBOOK, "0");
            Preferences.user().set("PREF_CONNETED_FACEBOOK", false);
            Social.tryCloseFacebookSession();
            Events.post(new com.pinterest.base.Social.RequestDisconnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
        }

        _cls10(boolean flag)
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super(flag);
        }
    }


    private class _cls9 extends ApiResponseHandler
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onFinish()
        {
            super.onFinish();
            updateSocialMediaCbs(com.pinterest.base.Social.Network.GPLUS);
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            Pinalytics.a(EventType.USER_DISABLE_GPLUS, "0");
            Preferences.user().set("PREF_CONNETED_GPLUS", false);
        }

        _cls9(boolean flag)
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super(flag);
        }
    }


    private class _cls12 extends ApiResponseHandler
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onFinish()
        {
            super.onFinish();
            updateSocialMediaCbs(com.pinterest.base.Social.Network.RAKUTEN);
        }

        public void onSuccess(PinterestJsonArray pinterestjsonarray)
        {
            super.onSuccess(pinterestjsonarray);
            Pinalytics.a(EventType.USER_DISABLE_RAKUTEN, "0");
            Preferences.user().set("PREF_CONNETED_RAKUTEN", false);
        }

        _cls12(boolean flag)
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super(flag);
        }
    }


    private class _cls11 extends ApiResponseHandler
    {

        final UpdatedAccountSettingsFragment this$0;

        public void onFinish()
        {
            super.onFinish();
            updateSocialMediaCbs(com.pinterest.base.Social.Network.TWITTER);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Pinalytics.a(EventType.USER_DISABLE_TWITTER, "0");
            Preferences.user().set("PREF_CONNETED_TWITTER", false);
        }

        _cls11(boolean flag)
        {
            this$0 = UpdatedAccountSettingsFragment.this;
            super(flag);
        }
    }

}
