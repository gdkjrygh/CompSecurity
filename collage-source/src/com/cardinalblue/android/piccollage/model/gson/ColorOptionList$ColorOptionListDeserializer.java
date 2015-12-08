// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.piccollage.a.e;
import com.google.b.c.a;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.p;
import java.lang.reflect.Type;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            ColorOptionList

public static class _cls1
    implements k
{

    private static final Type sToken = (new a() {

    }).getType();

    public ColorOptionList deserialize(l l1, Type type, j j1)
        throws p
    {
        type = new ColorOptionList();
        type.colorOptions = (List)j1.a(e.b(l1.m(), "Base Colors"), sToken);
        return type;
    }

    public volatile Object deserialize(l l1, Type type, j j1)
        throws p
    {
        return deserialize(l1, type, j1);
    }


    public _cls1()
    {
    }
}
