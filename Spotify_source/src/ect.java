// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ect
{

    public final String a;
    public final String b;
    public final fnu c;
    public final fnu d;
    public final boolean e;
    public fnu f;
    private fnu g;
    private fnu h;

    public ect(String s, String s1, String s2, String s3, boolean flag)
    {
        f = fnv.a;
        g = fnv.a;
        h = fnv.a;
        a = (String)ctz.a(s);
        b = (String)ctz.a(s1);
        c = fnu.b(s2);
        d = fnu.b(s3);
        e = flag;
    }

    public final ecu a()
    {
        if (!g.b())
        {
            g = fnu.a(new ecu(this));
        }
        return (ecu)g.a();
    }

    public final ecs b()
    {
        if (!h.b())
        {
            h = fnu.a(new ecs(this));
        }
        return (ecs)h.a();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ect)obj;
            if (!c.equals(((ect) (obj)).c))
            {
                return false;
            }
            if (!d.equals(((ect) (obj)).d))
            {
                return false;
            }
            if (!b.equals(((ect) (obj)).b))
            {
                return false;
            }
            if (!a.equals(((ect) (obj)).a))
            {
                return false;
            }
            if (e != ((ect) (obj)).e)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = a.hashCode();
        int k = b.hashCode();
        int l = c.hashCode();
        int i1 = d.hashCode();
        int i;
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + (((j * 31 + k) * 31 + l) * 31 + i1) * 31;
    }

    public final String toString()
    {
        return (new StringBuilder("TrackInfo{name='")).append(b).append('\'').append(", album=").append(c).append(", artist=").append(d).append(", forceIsInCollection=").append(e).append('}').toString();
    }
}
