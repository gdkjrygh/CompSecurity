// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


class Revision
{

    private boolean equal;

    public Revision()
    {
        equal = true;
    }

    public boolean compare(Object obj, Object obj1)
    {
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        equal = obj1.equals(obj);
_L4:
        return equal;
_L2:
        if (obj != null)
        {
            equal = obj.equals(Double.valueOf(1.0D));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public double getDefault()
    {
        return 1.0D;
    }

    public boolean isEqual()
    {
        return equal;
    }
}
