// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class hgp
{

    public hgp()
    {
    }

    public long a(hgo hgo, long l)
    {
        if (hgo instanceof frj)
        {
            return l;
        }
        if ((hgo instanceof hjh) || (hgo instanceof hjd) || (hgo instanceof hjf))
        {
            return -l;
        } else
        {
            throw new IllegalStateException("Unexpected AdapterItem type.");
        }
    }
}
