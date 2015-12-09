// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import com.squareup.a.m;

// Referenced classes of package com.jcp.adapters:
//            MultipleVideoItemAdapter

class bl
    implements m
{

    final MultipleVideoItemAdapter.ViewHolder a;
    final MultipleVideoItemAdapter b;

    bl(MultipleVideoItemAdapter multiplevideoitemadapter, MultipleVideoItemAdapter.ViewHolder viewholder)
    {
        b = multiplevideoitemadapter;
        a = viewholder;
        super();
    }

    public void a()
    {
        MultipleVideoItemAdapter.a(b, a);
    }

    public void b()
    {
        MultipleVideoItemAdapter.a(b, a);
    }
}
