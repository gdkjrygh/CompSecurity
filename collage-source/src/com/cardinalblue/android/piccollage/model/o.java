// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import com.google.b.j;
import com.google.b.l;
import com.google.b.p;
import com.google.b.r;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            p

public abstract class o extends com.cardinalblue.android.piccollage.model.p
{

    public o(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum versionenum)
    {
        super(versionenum);
    }

    public Object deserialize(l l, Type type, j j)
        throws p
    {
        com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum versionenum = (com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum)getVersion();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.values().length];
                try
                {
                    a[com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A2.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.V5.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[versionenum.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown version support => ").append(versionenum.name()).toString());

        case 1: // '\001'
            return fromA2(l, type, j);

        case 2: // '\002'
            return fromA3(l, type, j);

        case 3: // '\003'
            return fromV5(l, type, j);
        }
    }

    protected abstract Object fromA2(l l, Type type, j j);

    protected abstract Object fromA3(l l, Type type, j j);

    protected abstract Object fromV5(l l, Type type, j j);

    public l serialize(Object obj, Type type, r r)
    {
        com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum versionenum = (com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum)getVersion();
        switch (_cls1.a[versionenum.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown version support => ").append(versionenum.name()).toString());

        case 2: // '\002'
            return toA3(obj, type, r);

        case 3: // '\003'
            return toV5(obj, type, r);
        }
    }

    protected abstract l toA3(Object obj, Type type, r r);

    protected abstract l toV5(Object obj, Type type, r r);
}
