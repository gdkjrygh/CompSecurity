// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            a

public static final class b
{

    private final Bundle a;
    private ArrayList b;

    public b a(int i)
    {
        a.putInt("playbackType", i);
        return this;
    }

    public a a(IntentFilter intentfilter)
    {
        if (intentfilter == null)
        {
            throw new IllegalArgumentException("filter must not be null");
        }
        if (b == null)
        {
            b = new ArrayList();
        }
        if (!b.contains(intentfilter))
        {
            b.add(intentfilter);
        }
        return this;
    }

    public b a(Bundle bundle)
    {
        a.putBundle("extras", bundle);
        return this;
    }

    public a a(String s)
    {
        a.putString("id", s);
        return this;
    }

    public a a(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); a((IntentFilter)collection.next())) { }
        }
        return this;
    }

    public a a(boolean flag)
    {
        a.putBoolean("enabled", flag);
        return this;
    }

    public a a()
    {
        if (b != null)
        {
            a.putParcelableArrayList("controlFilters", b);
        }
        return new a(a, b, null);
    }

    public b b(int i)
    {
        a.putInt("playbackStream", i);
        return this;
    }

    public a b(String s)
    {
        a.putString("name", s);
        return this;
    }

    public a b(boolean flag)
    {
        a.putBoolean("connecting", flag);
        return this;
    }

    public a c(int i)
    {
        a.putInt("volume", i);
        return this;
    }

    public a c(String s)
    {
        a.putString("status", s);
        return this;
    }

    public a d(int i)
    {
        a.putInt("volumeMax", i);
        return this;
    }

    public a e(int i)
    {
        a.putInt("volumeHandling", i);
        return this;
    }

    public a f(int i)
    {
        a.putInt("presentationDisplayId", i);
        return this;
    }

    public ption(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        a = new Bundle(android.support.v7.media.a.a(a1));
        android.support.v7.media.a.b(a1);
        if (!android.support.v7.media.a.c(a1).isEmpty())
        {
            b = new ArrayList(android.support.v7.media.a.c(a1));
        }
    }

    public b(String s, String s1)
    {
        a = new Bundle();
        a(s);
        b(s1);
    }
}
