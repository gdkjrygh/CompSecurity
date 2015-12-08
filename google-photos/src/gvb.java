// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import java.util.Iterator;
import java.util.Set;

abstract class gvb
{

    public final ContentValues a = new ContentValues();
    private final euv b;

    protected gvb(euv euv1)
    {
        b = euv1;
    }

    public static gvb a(euv euv1)
    {
        switch (gvc.a[euv1.ordinal()])
        {
        default:
            euv1 = String.valueOf(euv1);
            throw new UnsupportedOperationException((new StringBuilder(String.valueOf(euv1).length() + 20)).append("Unsupported AvType: ").append(euv1).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return new gvd();

        case 4: // '\004'
            return new gve();
        }
    }

    public abstract gvb a(double d1, double d2);

    public gvb a(int i)
    {
        String s = String.valueOf(b);
        throw new UnsupportedOperationException((new StringBuilder(String.valueOf(s).length() + 33)).append("setOrientation not supported for ").append(s).toString());
    }

    public gvb a(int i, int j)
    {
        a.put("width", Integer.valueOf(i));
        a.put("height", Integer.valueOf(j));
        return this;
    }

    public final gvb a(long l)
    {
        a.put("_size", Long.valueOf(l));
        return this;
    }

    public final gvb a(String s)
    {
        a.put("mime_type", s);
        return this;
    }

    public final gvb b(long l)
    {
        a.put("date_modified", Long.valueOf(l));
        return this;
    }

    public abstract gvb c(long l);

    public gvb d(long l)
    {
        String s = String.valueOf(b);
        throw new UnsupportedOperationException((new StringBuilder(String.valueOf(s).length() + 30)).append("setDuration not supported for ").append(s).toString());
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaStoreContentValuesBuilder {");
        String s;
        String s1;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append(s).append(": ").append(s1).append(", ").toString()))
        {
            s = (String)iterator.next();
            s1 = String.valueOf(a.get(s));
        }

        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
