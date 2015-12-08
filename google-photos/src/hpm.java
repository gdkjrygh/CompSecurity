// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hpm
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public hpm()
    {
    }

    public final hpk a()
    {
        boolean flag;
        if (a != null || b != null || d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "One of dedupKey, localContentUri or remoteMediaKey should not null");
        return new hpk(this);
    }

    public final hpm a(long l)
    {
        c = String.valueOf(l);
        return this;
    }
}
