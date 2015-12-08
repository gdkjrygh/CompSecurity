// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqa
    implements dqg
{

    private final drs a;

    dqa(drs drs1)
    {
        a = (drs)ctz.a(drs1);
    }

    public final void a(drt drt)
    {
        a.a(drt);
    }

    public final boolean a(drz drz1)
    {
        while (drz1 == null || drz1.getContext() == null && drz1.getUri() == null || drz1.getContext() != null && !a.a(drz1.getContext()) || drz1.getUri() != null && !a.b(drz1.getUri())) 
        {
            return false;
        }
        return true;
    }
}
