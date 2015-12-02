// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.AudioManager;
import android.os.SystemClock;
import android.view.KeyEvent;

public class bf
{

    private final AudioManager a;
    private int b;
    private long c;

    public bf(AudioManager audiomanager)
    {
        b = 0x80000000;
        a = audiomanager;
    }

    private void b(KeyEvent keyevent)
    {
        int i = keyevent.getKeyCode();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   24: 41
    //                   25: 41
    //                   164: 71;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        keyevent = a;
        if (i == 24)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        keyevent.adjustSuggestedStreamVolume(i, b, 17);
        return;
_L3:
        if (keyevent.getRepeatCount() == 0)
        {
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void c(KeyEvent keyevent)
    {
        switch (keyevent.getKeyCode())
        {
        default:
            return;

        case 24: // '\030'
        case 25: // '\031'
            a.adjustSuggestedStreamVolume(0, b, 4);
            break;
        }
        c = SystemClock.uptimeMillis();
    }

    public void a(int i)
    {
        b = i;
    }

    public boolean a(KeyEvent keyevent)
    {
        boolean flag = false;
        int i = keyevent.getKeyCode();
        if (i != 25 && i != 24 && i != 164 && c + 300L > SystemClock.uptimeMillis())
        {
            a.adjustSuggestedStreamVolume(0, b, 8);
        }
        if (i == 25 || i == 24)
        {
            if (keyevent.getAction() == 0)
            {
                b(keyevent);
            } else
            {
                c(keyevent);
            }
            flag = true;
        }
        return flag;
    }
}
