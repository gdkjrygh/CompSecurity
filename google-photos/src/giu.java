// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class giu extends Enum
{

    private static giu a;
    private static giu b;
    private static giu c;
    private static giu d;
    private static final giu f[];
    private final Class e;

    private giu(String s, int i, Class class1)
    {
        super(s, i);
        e = class1;
    }

    public static giu valueOf(String s)
    {
        return (giu)Enum.valueOf(giu, s);
    }

    public static giu[] values()
    {
        return (giu[])f.clone();
    }

    public final am a()
    {
        am am1;
        try
        {
            am1 = (am)e.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            return null;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return null;
        }
        return am1;
    }

    static 
    {
        a = new giu("PINCH_ZOOM", 0, giy);
        b = new giu("SELECT", 1, gja);
        c = new giu("NAVIGATE", 2, giv);
        d = new giu("SEARCH", 3, giz);
        f = (new giu[] {
            a, b, c, d
        });
    }
}
