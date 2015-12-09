// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.fitbit.data.bl.cs;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.g;

public class ScanNetworkOperationBinder extends g
{
    public static final class WhatsScanning extends Enum
    {

        public static final WhatsScanning a;
        public static final WhatsScanning b;
        public static final WhatsScanning c;
        public static final WhatsScanning d;
        private static final WhatsScanning e[];

        public static WhatsScanning a(Intent intent, String s, WhatsScanning whatsscanning)
        {
            int i = intent.getIntExtra(s, whatsscanning.ordinal());
            if (i < 0 || i >= values().length)
            {
                return whatsscanning;
            } else
            {
                return values()[i];
            }
        }

        public static WhatsScanning valueOf(String s)
        {
            return (WhatsScanning)Enum.valueOf(com/fitbit/friends/ui/ScanNetworkOperationBinder$WhatsScanning, s);
        }

        public static WhatsScanning[] values()
        {
            return (WhatsScanning[])e.clone();
        }

        static 
        {
            a = new WhatsScanning("NOTHING", 0);
            b = new WhatsScanning("BOTH", 1);
            c = new WhatsScanning("CONTACTS", 2);
            d = new WhatsScanning("FACEBOOK", 3);
            e = (new WhatsScanning[] {
                a, b, c, d
            });
        }

        private WhatsScanning(String s, int i)
        {
            super(s, i);
        }
    }


    private WhatsScanning a;
    private WaitForFacebook b;
    private FindFriendsFragment.ShowProgress c;

    public ScanNetworkOperationBinder(FragmentActivity fragmentactivity, int i)
    {
        super(fragmentactivity, i);
    /* block-local class not found */
    class WaitForFacebook {}

        b = WaitForFacebook.a;
        c = FindFriendsFragment.ShowProgress.a;
    }

    public ScanNetworkOperationBinder(FragmentActivity fragmentactivity, int i, f f1)
    {
        super(fragmentactivity, i, f1);
        b = WaitForFacebook.a;
        c = FindFriendsFragment.ShowProgress.a;
    }

    public ScanNetworkOperationBinder a(FindFriendsFragment.ShowProgress showprogress)
    {
        c = showprogress;
        return this;
    }

    public ScanNetworkOperationBinder a(WaitForFacebook waitforfacebook)
    {
        b = waitforfacebook;
        return this;
    }

    public ScanNetworkOperationBinder a(WhatsScanning whatsscanning)
    {
        a = whatsscanning;
        return this;
    }

    public WhatsScanning c()
    {
        return a;
    }

    public WaitForFacebook d()
    {
        return b;
    }

    public FindFriendsFragment.ShowProgress e()
    {
        return c;
    }

    public void f()
    {
        super.a(cs.a(m(), true, a, b.a()));
    }
}
