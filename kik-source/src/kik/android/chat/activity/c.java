// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.g.f;
import com.kik.g.i;

// Referenced classes of package kik.android.chat.activity:
//            FragmentWrapperActivity

final class c extends i
{

    final FragmentWrapperActivity a;

    c(FragmentWrapperActivity fragmentwrapperactivity)
    {
        a = fragmentwrapperactivity;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        if (FragmentWrapperActivity.b(a) != null && obj != null && FragmentWrapperActivity.b(a).equals(obj))
        {
            FragmentWrapperActivity.a(a).a();
            a.finish();
        }
    }
}
