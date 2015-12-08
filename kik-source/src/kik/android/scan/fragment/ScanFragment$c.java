// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kik.android.util.bx;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

private static final class a extends Handler
{

    private final WeakReference a;

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        ScanFragment scanfragment = (ScanFragment)a.get();
        if (scanfragment == null)
        {
            bx.d(new IllegalAccessException("Unable to post to fragment! Reference cleaned up!"));
            return;
        }
        removeMessages(1);
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            ScanFragment.o(scanfragment);
            ScanFragment.p(scanfragment);
            return;

        case 2: // '\002'
            ScanFragment.q(scanfragment);
            break;
        }
    }

    public (ScanFragment scanfragment)
    {
        a = new WeakReference(scanfragment);
    }
}
