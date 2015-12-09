// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.wire.WireType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.ByteString;

public final class gxn
{

    public Map a;

    gxn()
    {
    }

    public gxn(gxn gxn1)
    {
        if (gxn1.a != null)
        {
            a().putAll(gxn1.a);
        }
    }

    static void a(Map map, int i, Object obj, WireType wiretype)
    {
        Object obj1;
        obj1 = (List)map.get(Integer.valueOf(i));
        if (obj1 == null)
        {
            obj1 = new ArrayList();
            map.put(Integer.valueOf(i), obj1);
        }
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[WireType.values().length];
                try
                {
                    a[WireType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[WireType.f.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[WireType.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[WireType.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[wiretype.ordinal()];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 104
    //                   2 157
    //                   3 172
    //                   4 187;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_187;
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unsupported wireType = ")).append(wiretype).toString());
_L2:
        map = new gxs((Long)obj);
_L6:
        if (((List) (obj1)).size() > 0 && ((gxo)((List) (obj1)).get(0)).a != ((gxo) (map)).a)
        {
            throw new IllegalStateException("Wire type differs from previous type for tag");
        } else
        {
            ((List) (obj1)).add(map);
            return;
        }
_L3:
        map = new gxp((Integer)obj);
          goto _L6
_L4:
        map = new gxq((Long)obj);
          goto _L6
        map = new gxr((ByteString)obj);
          goto _L6
    }

    final Map a()
    {
        if (a == null)
        {
            a = new TreeMap();
        }
        return a;
    }
}
