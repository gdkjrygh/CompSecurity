// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.ui.fragment;


// Referenced classes of package com.kik.ui.fragment:
//            FragmentBase

final class c
    implements Runnable
{

    final FragmentBase a;

    c(FragmentBase fragmentbase)
    {
        a = fragmentbase;
        super();
    }

    public final void run()
    {
        a.P();
    }
}
