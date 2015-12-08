// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.f;

// Referenced classes of package kik.android.chat.fragment:
//            rh, SimpleFragmentWrapperActivity

final class ri
    implements Runnable
{

    final rh a;

    ri(rh rh1)
    {
        a = rh1;
        super();
    }

    public final void run()
    {
        SimpleFragmentWrapperActivity.a(a.a).a();
        a.a.finish();
    }
}
