// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity.base;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;
import com.arist.activity.MyApplication;
import com.arist.c.f;
import com.arist.service.DeskLrcService;
import java.util.List;

public abstract class BaseActivity extends Activity
{

    protected MyApplication f;

    public BaseActivity()
    {
    }

    private void b(int i)
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

    protected void a(int i)
    {
        Toast.makeText(this, i, 0).show();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f = (MyApplication)getApplication();
        f.b.add(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        f.b.remove(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        switch (i)
        {
        default:
            return super.onKeyDown(i, keyevent);

        case 24: // '\030'
        case 25: // '\031'
            keyevent = (AudioManager)getSystemService("audio");
            break;
        }
        if (i == 24)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        keyevent.adjustSuggestedStreamVolume(i, 3, 1);
        return true;
    }

    protected void onStart()
    {
        super.onStart();
        Log.i(getClass().getSimpleName(), "onStart");
        b(1);
    }

    protected void onStop()
    {
        Log.i(getClass().getSimpleName(), "onStop");
        b(2);
        super.onStop();
    }
}
