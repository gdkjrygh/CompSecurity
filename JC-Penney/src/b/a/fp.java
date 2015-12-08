// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            oe, nw, nx, ny, 
//            nz, oc, od, oj, 
//            on, oo, op, fy, 
//            oq

final class fp
{

    static oq a(Object obj)
    {
        if (obj == null)
        {
            return oe.a;
        }
        if (obj instanceof Boolean)
        {
            return nw.a(((Boolean)obj).booleanValue());
        }
        if (obj instanceof Byte)
        {
            return nx.a(((Byte)obj).byteValue());
        }
        if (obj instanceof Character)
        {
            return ny.a(((Character)obj).charValue());
        }
        if (obj instanceof Double)
        {
            return nz.a(Double.doubleToLongBits(((Double)obj).doubleValue()));
        }
        if (obj instanceof Float)
        {
            return oc.a(Float.floatToIntBits(((Float)obj).floatValue()));
        }
        if (obj instanceof Integer)
        {
            return od.a(((Integer)obj).intValue());
        }
        if (obj instanceof Long)
        {
            return oj.a(((Long)obj).longValue());
        }
        if (obj instanceof Short)
        {
            return on.a(((Short)obj).shortValue());
        }
        if (obj instanceof String)
        {
            return new oo((String)obj);
        }
        if (obj instanceof Class)
        {
            return new op(fy.a((Class)obj).m);
        }
        if (obj instanceof fy)
        {
            return new op(((fy)obj).m);
        } else
        {
            throw new UnsupportedOperationException((new StringBuilder("Not a constant: ")).append(obj).toString());
        }
    }
}
