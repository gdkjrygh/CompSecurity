// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            CollageRoot, JsonCollage

public static class 
    implements k
{

    public  deserialize(l l1, Type type, j j1)
        throws p
    {
        if (!l1.j())
        {
            return null;
        }
        type = l1.m();
        if (type.b("json"))
        {
            l1 = (JsonCollage)j1.a(type.c("json"), com/cardinalblue/android/piccollage/model/gson/JsonCollage);
        } else
        {
            l1 = null;
        }
        if (l1 == null && type.b("struct"))
        {
            l1 = (JsonCollage)j1.a(type.c("struct"), com/cardinalblue/android/piccollage/model/gson/JsonCollage);
        }
        if (l1 == null)
        {
            l1 = null;
        } else
        {
            l1 = new (l1);
        }
        return l1;
    }

    public volatile Object deserialize(l l1, Type type, j j1)
        throws p
    {
        return deserialize(l1, type, j1);
    }

    public ()
    {
    }
}
