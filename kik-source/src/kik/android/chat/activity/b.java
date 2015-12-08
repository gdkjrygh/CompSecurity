// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.g.f;

// Referenced classes of package kik.android.chat.activity:
//            a, FragmentWrapperActivity

final class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        FragmentWrapperActivity.a(a.a).a();
        a.a.finish();
    }
}
