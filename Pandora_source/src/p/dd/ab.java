// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;

import android.util.Pair;
import p.cw.c;
import p.df.a;

public class ab
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dd/ab$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("STATION_TOKEN", 0);
            b = new a("BOOKMARK_TYPE", 1);
            c = new a("SONG_RATING", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final String a;
    public final int b;
    private final Pair c;

    public ab(int i)
    {
        this(null, i, null);
    }

    public ab(String s, int i, Pair pair)
    {
        a = s;
        b = i;
        c = pair;
    }

    private void a(a a1, Object obj, String s, Object obj1, ClassCastException classcastexception)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Key ");
        stringbuilder.append(a1);
        stringbuilder.append(" expected ");
        stringbuilder.append(s);
        stringbuilder.append(" but value was a ");
        stringbuilder.append(obj.getClass().getName());
        stringbuilder.append(".  The default value ");
        stringbuilder.append(obj1);
        stringbuilder.append(" was returned.");
        p.df.a.c("PandoraLinkApiErrorRadioEvent", (new StringBuilder()).append("Attempt to cast generated internal exception: ").append(stringbuilder.toString()).toString(), classcastexception);
    }

    public int a(a a1, int i)
    {
        if (c.first != a1)
        {
            return i;
        }
        int j;
        try
        {
            j = ((Integer)c.second).intValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(a1, c.second, "Integer", Integer.valueOf(i), classcastexception);
            return i;
        }
        return j;
    }

    public String a(a a1, String s, c c1)
    {
        if (c.first != a1)
        {
            return s;
        }
        try
        {
            c1 = (String)c.second;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            a(a1, c.second, "String", s, ((ClassCastException) (c1)));
            return s;
        }
        return c1;
    }
}
