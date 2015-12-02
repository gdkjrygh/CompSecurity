// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.fragment;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.ui.fragment:
//            BaseFragment

protected static final class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        if (a != null && a.get() != null && message != null)
        {
            ((BaseFragment)a.get()).a(message);
        }
    }

    public (BaseFragment basefragment)
    {
        a = new WeakReference(basefragment);
    }
}
