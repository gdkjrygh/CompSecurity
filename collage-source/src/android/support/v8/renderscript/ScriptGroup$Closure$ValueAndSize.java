// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup, Allocation, RenderScript

private static final class size
{

    public int size;
    public long value;

    public (RenderScript renderscript, Object obj)
    {
        if (obj instanceof Allocation)
        {
            value = ((Allocation)obj).getID(renderscript);
            size = -1;
        } else
        {
            if (obj instanceof Boolean)
            {
                long l;
                if (((Boolean)obj).booleanValue())
                {
                    l = 1L;
                } else
                {
                    l = 0L;
                }
                value = l;
                size = 4;
                return;
            }
            if (obj instanceof Integer)
            {
                value = ((Integer)obj).longValue();
                size = 4;
                return;
            }
            if (obj instanceof Long)
            {
                value = ((Long)obj).longValue();
                size = 8;
                return;
            }
            if (obj instanceof Float)
            {
                value = ((Float)obj).longValue();
                size = 4;
                return;
            }
            if (obj instanceof Double)
            {
                value = ((Double)obj).longValue();
                size = 8;
                return;
            }
        }
    }
}
