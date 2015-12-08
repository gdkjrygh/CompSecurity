// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class android.support.v7.media.a
{
    public static final class a
    {

        private final Bundle a;
        private ArrayList b;

        public a a(int i1)
        {
            a.putInt("playbackType", i1);
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

        public a a(Bundle bundle)
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

        public android.support.v7.media.a a()
        {
            if (b != null)
            {
                a.putParcelableArrayList("controlFilters", b);
            }
            return new android.support.v7.media.a(a, b);
        }

        public a b(int i1)
        {
            a.putInt("playbackStream", i1);
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

        public a c(int i1)
        {
            a.putInt("volume", i1);
            return this;
        }

        public a c(String s)
        {
            a.putString("status", s);
            return this;
        }

        public a d(int i1)
        {
            a.putInt("volumeMax", i1);
            return this;
        }

        public a e(int i1)
        {
            a.putInt("volumeHandling", i1);
            return this;
        }

        public a f(int i1)
        {
            a.putInt("presentationDisplayId", i1);
            return this;
        }

        public a(android.support.v7.media.a a1)
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

        public a(String s, String s1)
        {
            a = new Bundle();
            a(s);
            b(s1);
        }
    }


    private final Bundle a;
    private List b;

    private android.support.v7.media.a(Bundle bundle, List list)
    {
        a = bundle;
        b = list;
    }


    static Bundle a(android.support.v7.media.a a1)
    {
        return a1.a;
    }

    public static android.support.v7.media.a a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new android.support.v7.media.a(bundle, null);
        } else
        {
            return null;
        }
    }

    static void b(android.support.v7.media.a a1)
    {
        a1.p();
    }

    static List c(android.support.v7.media.a a1)
    {
        return a1.b;
    }

    private void p()
    {
        if (b == null)
        {
            b = a.getParcelableArrayList("controlFilters");
            if (b == null)
            {
                b = Collections.emptyList();
            }
        }
    }

    public String a()
    {
        return a.getString("id");
    }

    public String b()
    {
        return a.getString("name");
    }

    public String c()
    {
        return a.getString("status");
    }

    public boolean d()
    {
        return a.getBoolean("enabled", true);
    }

    public boolean e()
    {
        return a.getBoolean("connecting", false);
    }

    public List f()
    {
        p();
        return b;
    }

    public int g()
    {
        return a.getInt("playbackType", 1);
    }

    public int h()
    {
        return a.getInt("playbackStream", -1);
    }

    public int i()
    {
        return a.getInt("volume");
    }

    public int j()
    {
        return a.getInt("volumeMax");
    }

    public int k()
    {
        return a.getInt("volumeHandling", 0);
    }

    public int l()
    {
        return a.getInt("presentationDisplayId", -1);
    }

    public Bundle m()
    {
        return a.getBundle("extras");
    }

    public boolean n()
    {
        p();
        return !TextUtils.isEmpty(a()) && !TextUtils.isEmpty(b()) && !b.contains(null);
    }

    public Bundle o()
    {
        return a;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteDescriptor{ ");
        stringbuilder.append("id=").append(a());
        stringbuilder.append(", name=").append(b());
        stringbuilder.append(", description=").append(c());
        stringbuilder.append(", isEnabled=").append(d());
        stringbuilder.append(", isConnecting=").append(e());
        stringbuilder.append(", controlFilters=").append(Arrays.toString(f().toArray()));
        stringbuilder.append(", playbackType=").append(g());
        stringbuilder.append(", playbackStream=").append(h());
        stringbuilder.append(", volume=").append(i());
        stringbuilder.append(", volumeMax=").append(j());
        stringbuilder.append(", volumeHandling=").append(k());
        stringbuilder.append(", presentationDisplayId=").append(l());
        stringbuilder.append(", extras=").append(m());
        stringbuilder.append(", isValid=").append(n());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
