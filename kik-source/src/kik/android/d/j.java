// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.d;

import com.a.a.a;

// Referenced classes of package kik.android.d:
//            i

final class j
    implements Runnable
{

    final i a;

    j(i i)
    {
        a = i;
        super();
    }

    public final void run()
    {
        com.a.a.a.a("Crashed from La Forge. Testing crashlytics logs.");
        throw new RuntimeException("Avada Kedavra");
    }
}
