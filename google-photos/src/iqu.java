// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iqu
{

    final pex a;

    iqu(pex pex1)
    {
        if (pex1 == null)
        {
            throw new RuntimeException("Cannot wrap a null StoryElementRef");
        } else
        {
            a = pex1;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof iqu))
        {
            return false;
        } else
        {
            return qlw.a(a, ((iqu)obj).a);
        }
    }

    public final int hashCode()
    {
        int j = 17;
        if (a.b != null)
        {
            j = a.b.intValue() + 527;
        }
        int i = j;
        if (a.c != null)
        {
            i = j * 31 + a.c.intValue();
        }
        j = i;
        if (a.d != null)
        {
            j = i * 31 + a.d.a.hashCode();
        }
        i = j;
        if (a.e != null)
        {
            i = j * 31 + a.e.a.hashCode();
        }
        return i;
    }
}
