// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.widget.Toast;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class k
    implements Runnable
{

    final String a;

    k(String s)
    {
        a = s;
        super();
    }

    public final void run()
    {
        Toast.makeText(KikApplication.q(), a, 1).show();
    }
}
