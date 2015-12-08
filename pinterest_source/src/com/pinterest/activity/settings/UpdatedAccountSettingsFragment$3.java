// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.contacts.UploadContactsDialog;
import com.pinterest.activity.contacts.UploadContactsUtil;
import com.pinterest.activity.settings.view.CheckedTextViewSettingsListCell;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class this._cls0
    implements android.view.SettingsFragment._cls3
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
                Events.post(new com.pinterest.base.(com.pinterest.base.));
                return;
            } else
            {
                UpdatedAccountSettingsFragment.access$800(UpdatedAccountSettingsFragment.this, com.pinterest.base.gsFragment, view);
                return;
            }

        case 2131166040: 
            if (view.isChecked())
            {
                Events.post(new com.pinterest.base.(com.pinterest.base.));
                return;
            } else
            {
                UpdatedAccountSettingsFragment.access$800(UpdatedAccountSettingsFragment.this, com.pinterest.base.gsFragment, view);
                return;
            }

        case 2131166042: 
            if (view.isChecked())
            {
                Events.post(new com.pinterest.base.(com.pinterest.base.));
                return;
            } else
            {
                UpdatedAccountSettingsFragment.access$800(UpdatedAccountSettingsFragment.this, com.pinterest.base.gsFragment, view);
                return;
            }

        case 2131166041: 
            if (view.isChecked())
            {
                ActivityHelper.goRakutenAuth(getActivity());
                return;
            } else
            {
                UpdatedAccountSettingsFragment.access$800(UpdatedAccountSettingsFragment.this, com.pinterest.base.gsFragment, view);
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

    ell()
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super();
    }
}
