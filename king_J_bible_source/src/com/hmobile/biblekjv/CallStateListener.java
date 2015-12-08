// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.telephony.PhoneStateListener;
import com.hmobile.common.NotificationCenter;

class CallStateListener extends PhoneStateListener
{

    CallStateListener()
    {
    }

    public void onCallStateChanged(int i, String s)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            NotificationCenter.Instance().postNotification("stoptts");
            break;
        }
    }
}
