// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import android.view.View;
import android.widget.TextView;
import com.pinterest.activity.settings.dialog.AboutSettingDialog;
import com.pinterest.activity.settings.dialog.BusinessNameSettingDialog;
import com.pinterest.activity.settings.dialog.ChangePasswordDialog;
import com.pinterest.activity.settings.dialog.ContactNameSettingDialog;
import com.pinterest.activity.settings.dialog.EmailSettingDialog;
import com.pinterest.activity.settings.dialog.GenderSettingDialog;
import com.pinterest.activity.settings.dialog.LocationSettingDialog;
import com.pinterest.activity.settings.dialog.NameSettingDialog;
import com.pinterest.activity.settings.dialog.PersonalizationSettingDialog;
import com.pinterest.activity.settings.dialog.SearchPrivacyDialog;
import com.pinterest.activity.settings.dialog.SettingsVersionDialog;
import com.pinterest.activity.settings.dialog.UsernameSettingDialog;
import com.pinterest.activity.settings.view.TextValueSettingsListCell;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.dialog.UserEditWebsiteDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Events;
import com.pinterest.kit.autoupdate.AutoUpdateManager;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class this._cls0
    implements android.view.SettingsFragment._cls2
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
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.USER_ABOUT_BUTTON, new AboutSettingDialog());
            return;

        case 2131166526: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.NAME_BUTTON, new NameSettingDialog());
            return;

        case 2131165350: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.NAME_BUTTON, new BusinessNameSettingDialog());
            return;

        case 2131165559: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.NAME_BUTTON, new ContactNameSettingDialog());
            return;

        case 2131166545: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.USERNAME_BUTTON, new UsernameSettingDialog());
            return;

        case 2131166515: 
            Pinalytics.a(ElementType.EMAIL_BUTTON);
            view = ((TextView)view.findViewById(0x7f0f03a0)).getText().toString();
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.EMAIL_BUTTON, new EmailSettingDialog(view));
            return;

        case 2131166702: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.WEBSITE_BUTTON, new UserEditWebsiteDialog());
            return;

        case 2131166020: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.LOCATION_BUTTON, new LocationSettingDialog());
            return;

        case 2131165584: 
            Pinalytics.a(ElementType.COUNTRY_BUTTON);
            UpdatedAccountSettingsFragment.access$500(UpdatedAccountSettingsFragment.this);
            return;

        case 2131166524: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.GENDER_BUTTON, new GenderSettingDialog());
            return;

        case 2131165976: 
            Pinalytics.a(ElementType.LANGUAGE_BUTTON);
            UpdatedAccountSettingsFragment.access$600(UpdatedAccountSettingsFragment.this);
            return;

        case 2131165403: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.CHANGE_PASSWORD_BUTTON, new ChangePasswordDialog());
            return;

        case 2131165749: 
            Pinalytics.a(ElementType.EMAIL_BUTTON);
            Events.post(new Navigation(Location.EMAIL_NOTIFICATIONS_SETTINGS));
            return;

        case 2131166060: 
            Pinalytics.a(ElementType.PUSH_NOTIFICATIONS_BUTTON);
            UpdatedAccountSettingsFragment.access$700(UpdatedAccountSettingsFragment.this);
            return;

        case 2131165241: 
            Events.post(new Navigation(Location.OFFLINE_BOARDS_SETTINGS));
            return;

        case 2131165414: 
            Pinalytics.a(ElementType.CLEAR_SEARCHES_BUTTON);
            SearchApi.a(new earSearchHistoryApiResponseHandler(UpdatedAccountSettingsFragment.this), getApiTag());
            return;

        case 2131166433: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.SEARCH_PRIVACY_BUTTON, new SearchPrivacyDialog());
            return;

        case 2131166181: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, ElementType.PERSONALIZED_RECOMMENDATIONS_BUTTON, new PersonalizationSettingDialog());
            return;

        case 2131165632: 
            Events.post(new Navigation(Location.DEACTIVATE_ACCOUNT_SETTINGS));
            return;

        case 2131167036: 
            AutoUpdateManager.a().startUpdate(null);
            return;

        case 2131166681: 
            UpdatedAccountSettingsFragment.access$400(UpdatedAccountSettingsFragment.this, null, new SettingsVersionDialog());
            return;
        }
    }

    og()
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super();
    }
}
