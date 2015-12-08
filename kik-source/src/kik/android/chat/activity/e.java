// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.os.Bundle;
import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.activity:
//            FragmentWrapperActivity

final class e extends r
{

    final FragmentWrapperActivity a;

    e(FragmentWrapperActivity fragmentwrapperactivity)
    {
        a = fragmentwrapperactivity;
        super();
    }

    public final void a()
    {
        super.a();
    }

    public final void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        if (FragmentWrapperActivity.d(a) != null)
        {
            FragmentWrapperActivity.d(a).a(obj);
        }
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        if (FragmentWrapperActivity.d(a) != null)
        {
            FragmentWrapperActivity.d(a).e();
        }
    }
}
