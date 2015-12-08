// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import com.skype.MediaDocument;
import com.skype.PROPKEY;
import java.text.Collator;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.skype.android.mediacontent:
//            MediaContent

public class PackInfo
{
    public static class ItemInfo
    {

        MediaContent a;
        String b;
        public int c;
        int d;

        public final int a()
        {
            return d;
        }

        public final String b()
        {
            return b;
        }

        public final MediaContent c()
        {
            return a;
        }

        public ItemInfo(MediaContent mediacontent, String s, int i1, int j1)
        {
            c = 0;
            d = 0;
            a = mediacontent;
            b = s;
            c = i1;
            d = j1;
        }
    }


    private static final String e = new String();
    public List a;
    public List b;
    public List c;
    public List d;
    private int f;
    private int g;
    private String h;
    private MediaDocument i;
    private boolean j;
    private boolean k;
    private String l;
    private Map m;

    public PackInfo(int i1, int j1, MediaDocument mediadocument)
    {
        boolean flag1 = true;
        super();
        f = i1;
        g = j1;
        a = new ArrayList();
        b = new ArrayList();
        d = new ArrayList();
        m = new TreeMap(Collator.getInstance());
        c = new AbstractList() {

            final PackInfo a;

            public final Object get(int k1)
            {
                int l1 = a.b.size();
                if (k1 < l1)
                {
                    return (MediaContent)a.b.get(k1);
                } else
                {
                    return (MediaContent)a.a.get(k1 - l1);
                }
            }

            public final int size()
            {
                return a.a.size() + a.b.size();
            }

            
            {
                a = PackInfo.this;
                super();
            }
        };
        i = mediadocument;
        j = true;
        k = false;
        if (mediadocument != null)
        {
            boolean flag;
            if (mediadocument.getIntProperty(PROPKEY.MEDIADOCUMENT_CONSUMPTION_STATUS) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = flag;
            l = mediadocument.getStrProperty(PROPKEY.MEDIADOCUMENT_TITLE);
            if (mediadocument.getMetadataIntValue("isHidden").m_value > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            k = flag;
        }
    }

    private void a(String s, List list)
    {
        int i1 = d.size();
        int j1 = list.size();
        ItemInfo iteminfo;
        for (list = list.iterator(); list.hasNext(); d.add(iteminfo))
        {
            iteminfo = new ItemInfo((MediaContent)list.next(), s, i1, j1);
        }

    }

    public final int a()
    {
        return c.size();
    }

    public final void a(MediaContent mediacontent)
    {
        if (!a.contains(mediacontent))
        {
            a.add(mediacontent);
        }
    }

    public final void a(String s)
    {
        h = s;
    }

    public final void a(boolean flag)
    {
        int j1 = a();
        int i1 = 0;
        while (i1 < j1) 
        {
            MediaContent mediacontent = (MediaContent)c.get(i1);
            String s;
            Object obj;
            List list;
            boolean flag1;
            if (mediacontent.n() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (a(i1))
            {
                continue;
            }
            if (flag1 && flag)
            {
                s = mediacontent.l().trim();
            } else
            {
                s = l;
            }
            list = (List)m.get(s);
            obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                m.put(s, obj);
            }
            ((List) (obj)).add(mediacontent);
            i1++;
        }
        if (!b.isEmpty())
        {
            a(e, b);
        }
        java.util.Map.Entry entry;
        for (Iterator iterator = m.entrySet().iterator(); iterator.hasNext(); a((String)entry.getKey(), (List)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public final boolean a(int i1)
    {
        return i1 < b.size();
    }

    public final String b()
    {
        return h;
    }

    public final int c()
    {
        return f;
    }

    public final int d()
    {
        return g;
    }

    public final com.skype.MediaDocument.DOCUMENT_TYPE e()
    {
        if (c.size() > 0)
        {
            return ((MediaContent)c.get(0)).n();
        } else
        {
            return com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_UNKNOWN;
        }
    }

    public final boolean f()
    {
        return a() == 0;
    }

    public final boolean g()
    {
        return j;
    }

    public final String h()
    {
        return l;
    }

    public final void i()
    {
        if (i != null)
        {
            i.consume();
        }
        j = true;
    }

    public final MediaDocument j()
    {
        return i;
    }

    public final boolean k()
    {
        return k;
    }

    public final boolean l()
    {
        return l.startsWith("FeaturedIn-");
    }

}
