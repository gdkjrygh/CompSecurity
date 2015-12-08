// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nxc
{

    nxe a;
    Object b;

    public nxc(nxe nxe, Object obj)
    {
        a = nxe;
        b = obj;
    }

    public final boolean a(nxe nxe, Object obj)
    {
        if (a == nxe)
        {
            if (b == null)
            {
                if (obj == null)
                {
                    return true;
                }
            } else
            {
                return b.equals(obj);
            }
        }
        return false;
    }
}
