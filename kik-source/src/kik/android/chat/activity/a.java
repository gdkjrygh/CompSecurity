// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import com.kik.g.i;

// Referenced classes of package kik.android.chat.activity:
//            b, FragmentWrapperActivity

final class a extends i
{

    final FragmentWrapperActivity a;

    a(FragmentWrapperActivity fragmentwrapperactivity)
    {
        a = fragmentwrapperactivity;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        a.runOnUiThread(new b(this));
    }
}
