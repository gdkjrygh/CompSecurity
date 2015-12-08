// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import bF;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment, StoriesScrollBar

final class <init> extends bF
    implements android.support.v7.widget.esFragment.a
{

    private StoriesFragment n;

    private void h()
    {
        if (StoriesFragment.a(n))
        {
            StoriesFragment.b(n).setVisibility(8);
        }
    }

    public final void a()
    {
        if (StoriesFragment.a(n) && !n.h)
        {
            StoriesFragment.b(n).a();
            StoriesFragment.b(n).setVisibility(0);
        }
    }

    public final void f()
    {
        if (!a(this))
        {
            a();
        }
    }

    public final void g()
    {
        if (!a(this))
        {
            a();
        }
    }

    public final void h(android.support.v7.widget.esFragment.a a1)
    {
        super.h(a1);
        h();
    }

    public final void i(android.support.v7.widget.esFragment.a a1)
    {
        super.i(a1);
        h();
    }

    private (StoriesFragment storiesfragment)
    {
        n = storiesfragment;
        super();
    }

    n(StoriesFragment storiesfragment, byte byte0)
    {
        this(storiesfragment);
    }
}
