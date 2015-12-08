// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import com.arist.c.f;
import com.arist.service.DeskLrcService;
import java.util.List;

// Referenced classes of package com.arist.activity:
//            MyApplication

public class SettingScreen extends PreferenceActivity
{

    private CheckBoxPreference a;

    public SettingScreen()
    {
    }

    private void a(int i)
    {
        if (!(new f(this)).f())
        {
            return;
        } else
        {
            Intent intent = new Intent(this, com/arist/service/DeskLrcService);
            intent.setAction("desk_lrc_action_activity_changed");
            intent.putExtra("desk_lrc_action_activity_changed_key", i);
            startService(intent);
            return;
        }
    }

    public void handleBackClicked(View view)
    {
        onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        MyApplication.d.b.add(this);
        getPreferenceManager().setSharedPreferencesName("music_preference");
        setContentView(0x7f030007);
        addPreferencesFromResource(0x7f050000);
        a = (CheckBoxPreference)findPreference("show_desktop_lyrics");
    }

    protected void onRestart()
    {
        super.onRestart();
        a.setChecked(MyApplication.e.f());
    }

    protected void onStart()
    {
        super.onStart();
        Log.i(getClass().getSimpleName(), "onStart");
        a(1);
    }

    protected void onStop()
    {
        Log.i(getClass().getSimpleName(), "onStop");
        a(2);
        super.onStop();
    }
}
