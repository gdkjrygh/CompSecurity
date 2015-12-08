// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import com.jcp.e.ab;

// Referenced classes of package com.jcp.adapters:
//            CustomSavedItemAdapter

class an
    implements ab
{

    final CustomSavedItemAdapter a;

    an(CustomSavedItemAdapter customsaveditemadapter)
    {
        a = customsaveditemadapter;
        super();
    }

    public void a(int i)
    {
        a.b(CustomSavedItemAdapter.a(a), i);
    }
}
