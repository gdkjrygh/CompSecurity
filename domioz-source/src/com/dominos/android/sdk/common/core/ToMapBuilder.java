// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import com.dominos.android.sdk.common.StringHelper;
import com.google.a.a.t;
import com.google.a.b.ar;
import com.google.a.b.av;
import com.google.a.b.aw;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            ToMap, Util, Seq

public class ToMapBuilder
{

    private static final t listObjFn = new _cls1();
    private final aw builder = av.h();

    public ToMapBuilder()
    {
    }

    private static Object transform(Object obj)
    {
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            if (obj instanceof String)
            {
                return transformString(obj);
            }
            obj1 = obj;
            if (!(obj instanceof Number))
            {
                obj1 = obj;
                if (!(obj instanceof Boolean))
                {
                    if (obj instanceof ToMap)
                    {
                        return transformToMap(obj);
                    }
                    if (obj instanceof List)
                    {
                        return transformList(obj);
                    }
                    if (obj instanceof Map)
                    {
                        return transformMap(obj);
                    } else
                    {
                        return obj.toString();
                    }
                }
            }
        }
        return obj1;
    }

    public static ar transformList(Object obj)
    {
        return Util.seq((Iterable)obj).transform(listObjFn).toImmutableList();
    }

    private static Object transformMap(Object obj)
    {
        Object obj1 = obj;
        if (((Map)obj).isEmpty())
        {
            obj1 = null;
        }
        return obj1;
    }

    private static Object transformString(Object obj)
    {
        if (StringHelper.isNotEmpty((String)obj))
        {
            return obj;
        } else
        {
            return null;
        }
    }

    private static Object transformToMap(Object obj)
    {
        return transformMap(((ToMap)obj).toMap());
    }

    public Map build()
    {
        return builder.a();
    }

    public ToMapBuilder put(String s, Object obj)
    {
        obj = transform(obj);
        if (obj != null)
        {
            builder.a(s, obj);
        }
        return this;
    }



    private class _cls1
        implements t
    {

        public final Object apply(Object obj)
        {
            return ToMapBuilder.transform(obj);
        }

        _cls1()
        {
        }
    }

}
