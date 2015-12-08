// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package com.arist.MusicPlayer:
//            MyApplication

public class SettingScreen extends PreferenceActivity
{

    public SettingScreen()
    {
    }

    private void resetSettings()
    {
        android.content.SharedPreferences.Editor editor = MyApplication.getDefaultSharedPreferences().edit();
        editor.putBoolean("volume_fade", false).commit();
        editor.putBoolean("switch_playing_interface", true).commit();
        editor.putString("sleep_mode", "1").commit();
        editor.putBoolean("play_music", false).commit();
        editor.putBoolean("show_desktop_lyrics", false).commit();
        editor.putBoolean("shake_to_change_song", true).commit();
        editor.putBoolean("headset_out_stop", true).commit();
        editor.putBoolean("headset_in_play", false).commit();
        editor.putBoolean("headset_control_allow", true).commit();
        startActivity(new Intent(this, com/arist/MusicPlayer/SettingScreen));
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050000);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(1, 1, 1, 0x7f08004f);
        menu.add(1, 2, 1, 0x7f080051);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 1 2: default 28
    //                   1 34
    //                   2 87;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        (new android.app.AlertDialog.Builder(this)).setTitle(0x7f080050).setCancelable(true).setPositiveButton(getString(0x7f080052), new android.content.DialogInterface.OnClickListener() {

            final SettingScreen this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                resetSettings();
            }

            
            {
                this$0 = SettingScreen.this;
                super();
            }
        }).setNegativeButton(getString(0x7f080051), null).create().show();
        continue; /* Loop/switch isn't completed */
_L3:
        closeOptionsMenu();
        if (true) goto _L1; else goto _L4
_L4:
    }

}
