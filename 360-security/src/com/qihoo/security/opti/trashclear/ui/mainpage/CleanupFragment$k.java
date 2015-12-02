// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

private static class a extends Handler
{

    private final WeakReference a;
    private boolean b;

    public void a()
    {
        b = true;
    }

    public void handleMessage(Message message)
    {
        if (!b && a != null)
        {
            CleanupFragment cleanupfragment = (CleanupFragment)a.get();
            if (cleanupfragment != null)
            {
                switch (message.what)
                {
                default:
                    return;

                case 1: // '\001'
                    CleanupFragment.ab(cleanupfragment);
                    return;

                case 2: // '\002'
                    CleanupFragment.ac(cleanupfragment);
                    return;

                case 3: // '\003'
                    CleanupFragment.e(cleanupfragment, message.arg1);
                    break;
                }
                return;
            }
        }
    }

    public (CleanupFragment cleanupfragment)
    {
        a = new WeakReference(cleanupfragment);
    }
}
