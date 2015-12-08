// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import a.a;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.soundcloud.android.main.ScrollContent;

public class YouView
    implements ScrollContent
{
    static interface Listener
    {

        public abstract void onActivitiesClicked(View view);

        public abstract void onBasicSettingsClicked(View view);

        public abstract void onExploreClicked(View view);

        public abstract void onHelpCenterClicked(View view);

        public abstract void onLegalClicked(View view);

        public abstract void onNotificationSettingsClicked(View view);

        public abstract void onOfflineSettingsClicked(View view);

        public abstract void onProfileClicked(View view);

        public abstract void onRecordClicked(View view);

        public abstract void onReportBugClicked(View view);

        public abstract void onSignOutClicked(View view);
    }


    View headerLayout;
    private Listener listener;
    View offlineSettingsView;
    ImageView profileImageView;
    View reportBug;
    ScrollView scrollView;
    TextView username;
    TextView versionText;

    YouView(View view, Listener listener1)
    {
        listener = listener1;
        a.a(this, view);
        setAppVersionString(view.getResources());
    }

    private void setAppVersionString(Resources resources)
    {
        resources = resources.getString(0x7f070227, new Object[] {
            "2015.11.20-release"
        });
        versionText.setText(resources);
    }

    ImageView getProfileImageView()
    {
        return profileImageView;
    }

    public void hideOfflineSettings()
    {
        offlineSettingsView.setVisibility(8);
    }

    void onActivityLinkClicked(View view)
    {
        if (listener != null)
        {
            listener.onActivitiesClicked(view);
        }
    }

    void onBasicSettingsClicked(View view)
    {
        if (listener != null)
        {
            listener.onBasicSettingsClicked(view);
        }
    }

    void onExploreLinkClicked(View view)
    {
        if (listener != null)
        {
            listener.onExploreClicked(view);
        }
    }

    void onHeaderLayoutClicked(View view)
    {
        if (listener != null)
        {
            listener.onProfileClicked(view);
        }
    }

    void onHelpCenterClicked(View view)
    {
        if (listener != null)
        {
            listener.onHelpCenterClicked(view);
        }
    }

    void onLegalClicked(View view)
    {
        if (listener != null)
        {
            listener.onLegalClicked(view);
        }
    }

    void onNotificationSettingsClicked(View view)
    {
        if (listener != null)
        {
            listener.onNotificationSettingsClicked(view);
        }
    }

    void onOfflineSyncSettingsClicked(View view)
    {
        if (listener != null)
        {
            listener.onOfflineSettingsClicked(view);
        }
    }

    void onRecordLinkClicked(View view)
    {
        if (listener != null)
        {
            listener.onRecordClicked(view);
        }
    }

    void onReportBugClicked(View view)
    {
        if (listener != null)
        {
            listener.onReportBugClicked(view);
        }
    }

    void onSignOutClicked(View view)
    {
        if (listener != null)
        {
            listener.onSignOutClicked(view);
        }
    }

    public void resetScroll()
    {
        scrollView.smoothScrollTo(0, 0);
    }

    void setUsername(String s)
    {
        username.setText(s);
    }

    public void showOfflineSettings()
    {
        offlineSettingsView.setVisibility(0);
    }

    public void showReportBug()
    {
        reportBug.setVisibility(0);
    }

    public void unbind()
    {
        a.a(this);
        listener = null;
    }
}
