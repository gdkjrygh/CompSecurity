// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.pandora.radio.data:
//            m

public class h extends m
    implements Serializable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/h$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("THUMBED_DOWN_HEADER", 0);
            b = new a("THUMBED_UP_HEADER", 1);
            c = new a("ROW", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private String a;
    private String b;
    private boolean c;
    private a d;

    public h(a a1)
    {
        d = a1;
    }

    public h(String s, JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        a = s;
        b = jsonobject.optString("feedbackId");
        c = jsonobject.optBoolean("isPositive");
        d = a.c;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return a;
    }

    public a c()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (h)obj;
            if (!super.equals(obj))
            {
                return false;
            }
            if (a == null ? ((h) (obj)).a != null : !a.equals(((h) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((h) (obj)).b != null : !b.equals(((h) (obj)).b))
            {
                return false;
            }
            if (c != ((h) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 0;
        int l = super.hashCode();
        int i;
        int j;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (c)
        {
            k = 1;
        }
        return (j + (i + l * 31) * 31) * 31 + k;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<").append(i());
        stringbuilder.append(", Artist:").append(f());
        if (i() == m.a.b)
        {
            stringbuilder.append(", SongName:").append(g());
        }
        stringbuilder.append(", FeedbackId:").append(b);
        stringbuilder.append(">");
        return stringbuilder.toString();
    }
}
