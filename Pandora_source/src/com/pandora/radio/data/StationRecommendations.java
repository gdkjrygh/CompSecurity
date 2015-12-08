// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.radio.data:
//            StationRecommendation

public class StationRecommendations
    implements Parcelable, Iterable
{
    public static class a
        implements Iterable, Iterator
    {

        private List a;
        private int b;

        public StationRecommendation a()
            throws NoSuchElementException
        {
            if (hasNext())
            {
                List list = a;
                int i = b;
                b = i + 1;
                return (StationRecommendation)list.get(i);
            } else
            {
                throw new NoSuchElementException();
            }
        }

        public int b()
        {
            return a.size();
        }

        public boolean hasNext()
        {
            return b < a.size();
        }

        public Iterator iterator()
        {
            return this;
        }

        public Object next()
        {
            return a();
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        private a(List list)
        {
            b = 0;
            a = list;
        }

    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        private static final b h[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/pandora/radio/data/StationRecommendations$b, s);
        }

        public static b[] values()
        {
            return (b[])h.clone();
        }

        static 
        {
            a = new b("ARTIST_STATION", 0);
            b = new b("EXTRA_ARTIST_STATION", 1);
            c = new b("GENRE_STATION", 2);
            d = new b("EXTRA_GENRE_STATION", 3);
            e = new b("HEADER", 4);
            f = new b("PROMOTED_STATION", 5);
            g = new b("CONSOLIDATED_STATION", 6);
            h = (new b[] {
                a, b, c, d, e, f, g
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public StationRecommendations a(Parcel parcel)
        {
            return new StationRecommendations(parcel);
        }

        public StationRecommendations[] a(int i)
        {
            return new StationRecommendations[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final Map a;
    private final Set b;
    private final Set c;
    private final List d;
    private final List e;
    private StationRecommendation f;

    public StationRecommendations()
    {
        a = new LinkedHashMap();
        b = new LinkedHashSet();
        c = new LinkedHashSet();
        d = new LinkedList();
        e = new LinkedList();
    }

    StationRecommendations(Parcel parcel)
    {
        a = a(parcel, com/pandora/radio/data/StationRecommendation);
        b = new LinkedHashSet();
        b.addAll(Arrays.asList(parcel.createTypedArray(StationRecommendation.CREATOR)));
        c = new LinkedHashSet();
        c.addAll(Arrays.asList(parcel.createTypedArray(StationRecommendation.CREATOR)));
        d = new LinkedList();
        parcel.readTypedList(d, StationRecommendation.CREATOR);
        e = new LinkedList();
        parcel.readTypedList(e, StationRecommendation.CREATOR);
    }

    public StationRecommendations(c c1, Cursor cursor)
    {
        a = new LinkedHashMap();
        b = new LinkedHashSet();
        c = new LinkedHashSet();
        d = new LinkedList();
        e = new LinkedList();
        do
        {
            if (cursor.moveToNext())
            {
                StationRecommendation stationrecommendation = new StationRecommendation(cursor);
                static class _cls3
                {

                    static final int a[];

                    static 
                    {
                        a = new int[b.values().length];
                        try
                        {
                            a[com.pandora.radio.data.b.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[com.pandora.radio.data.b.c.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[b.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[b.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (com.pandora.radio.data._cls3.a[stationrecommendation.j().ordinal()])
                {
                default:
                    throw new InvalidParameterException((new StringBuilder()).append("Unknown StationRecommendation type: ").append(stationrecommendation.j()).toString());

                case 1: // '\001'
                    b.add(stationrecommendation);
                    break;

                case 2: // '\002'
                    c.add(stationrecommendation);
                    break;

                case 3: // '\003'
                    d.add(stationrecommendation);
                    break;

                case 4: // '\004'
                    e.add(stationrecommendation);
                    break;
                }
            } else
            {
                boolean flag;
                if (c1.a(p.dj.b.a.e) || c1.a(p.dj.b.a.f))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(flag);
                return;
            }
        } while (true);
    }

    public StationRecommendations(c c1, JSONObject jsonobject)
    {
        JSONArray jsonarray2 = jsonobject.optJSONArray("artists");
        JSONArray jsonarray1 = jsonobject.optJSONArray("genreStations");
        JSONArray jsonarray = jsonobject.optJSONArray("extraArtists");
        jsonobject = jsonobject.optJSONArray("extraGenreStations");
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (jsonarray2 == null)
        {
            i = 0;
        } else
        {
            i = jsonarray2.length();
        }
        if (jsonarray1 == null)
        {
            j = 0;
        } else
        {
            j = jsonarray1.length();
        }
        if (jsonarray == null)
        {
            l = 0;
        } else
        {
            l = jsonarray.length();
        }
        if (jsonobject == null)
        {
            k = 0;
        } else
        {
            k = jsonobject.length();
        }
        a = new LinkedHashMap();
        b = new LinkedHashSet();
        c = new LinkedHashSet();
        d = new LinkedList();
        e = new LinkedList();
        i1 = 0;
        while (i1 < i) 
        {
            try
            {
                b.add(new StationRecommendation(jsonarray2.getJSONObject(i1), com.pandora.radio.data.b.a));
            }
            catch (JSONException jsonexception3)
            {
                p.df.a.e("StationRecommendations", "Error parsing artist station JSON", jsonexception3);
            }
            i1++;
        }
        i1 = 0;
        while (i1 < j) 
        {
            try
            {
                c.add(new StationRecommendation(jsonarray1.getJSONObject(i1), com.pandora.radio.data.b.c));
            }
            catch (JSONException jsonexception2)
            {
                p.df.a.e("StationRecommendations", "Error parsing genre station JSON", jsonexception2);
            }
            i1++;
        }
        i1 = 0;
        while (i1 < l) 
        {
            try
            {
                d.add(new StationRecommendation(jsonarray.getJSONObject(i1), b.b));
            }
            catch (JSONException jsonexception1)
            {
                p.df.a.e("StationRecommendations", "Error parsing extra artist station JSON", jsonexception1);
            }
            i1++;
        }
        l = 0;
        while (l < k) 
        {
            try
            {
                e.add(new StationRecommendation(jsonobject.getJSONObject(l), b.d));
            }
            catch (JSONException jsonexception)
            {
                p.df.a.e("StationRecommendations", "Error parsing extra genre station JSON", jsonexception);
            }
            l++;
        }
        if (i == 0 && j == 0)
        {
            p.df.a.c("StationRecommendations", "Got StationRecommendations result but no recommendations were returned.");
        }
        boolean flag;
        if (c1.a(p.dj.b.a.e) || c1.a(p.dj.b.a.f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public static Map a(Parcel parcel, Class class1)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        if (parcel != null)
        {
            String as[] = parcel.createStringArray();
            parcel = parcel.readBundle(class1.getClassLoader());
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                linkedhashmap.put(s, class1.cast(parcel.getParcelable(s)));
            }

        }
        return linkedhashmap;
    }

    private void a(List list, List list1)
    {
        int i = 0;
        int j = 0;
        int k;
        do
        {
            k = j;
            if (j >= list.size())
            {
                break;
            }
            k = j;
            if (i >= list1.size())
            {
                break;
            }
            for (k = 0; k < 2 && j + k < list.size(); k++)
            {
                StationRecommendation stationrecommendation = (StationRecommendation)list.get(j + k);
                a.put(stationrecommendation.n(), stationrecommendation);
            }

            k = j + k;
            for (j = 0; j < 1 && i + j < list1.size(); j++)
            {
                StationRecommendation stationrecommendation1 = (StationRecommendation)list1.get(i + j);
                a.put(stationrecommendation1.n(), stationrecommendation1);
            }

            i += j;
            j = k;
        } while (true);
        do
        {
            j = i;
            if (k >= list.size())
            {
                break;
            }
            StationRecommendation stationrecommendation2 = (StationRecommendation)list.get(k);
            a.put(stationrecommendation2.n(), stationrecommendation2);
            k++;
        } while (true);
        for (; j < list1.size(); j++)
        {
            list = (StationRecommendation)list1.get(j);
            a.put(list.n(), list);
        }

    }

    public static void a(Map map, Parcel parcel)
    {
        if (map != null && map.size() > 0)
        {
            Set set = map.keySet();
            Bundle bundle = new Bundle();
            String s;
            for (Iterator iterator1 = set.iterator(); iterator1.hasNext(); bundle.putParcelable(s, (Parcelable)map.get(s)))
            {
                s = (String)iterator1.next();
            }

            parcel.writeStringArray((String[])set.toArray(new String[set.size()]));
            parcel.writeBundle(bundle);
            return;
        } else
        {
            parcel.writeStringArray(new String[0]);
            parcel.writeBundle(Bundle.EMPTY);
            return;
        }
    }

    private void h()
    {
        boolean flag1 = false;
        Object obj = new ArrayList(b);
        Object obj1 = new ArrayList(c);
        Object obj2;
        Object obj3;
        int i;
        if (((List) (obj)).size() == 0)
        {
            ((List) (obj)).addAll(((java.util.Collection) (obj1)));
        } else
        if (((List) (obj1)).size() > 0)
        {
            ((List) (obj)).add(1, ((List) (obj1)).remove(0));
            if (((List) (obj)).size() < 4)
            {
                ((List) (obj)).addAll(((java.util.Collection) (obj1)));
            }
        }
        obj3 = new ArrayList(4);
        obj2 = new ArrayList(4);
        obj1 = new ArrayList(4);
        i = 0;
        while (i < 4 && i < ((List) (obj)).size()) 
        {
            StationRecommendation stationrecommendation = (StationRecommendation)((List) (obj)).get(i);
            if (!TextUtils.isEmpty(stationrecommendation.m()))
            {
                ((List) (obj3)).add(stationrecommendation.l());
                ((List) (obj2)).add(stationrecommendation.n());
                ((List) (obj1)).add(stationrecommendation.m());
                ((List) (obj)).set(i, null);
            }
            i++;
        }
        for (int j = 0; ((List) (obj2)).size() < 4 && j < ((List) (obj)).size(); j++)
        {
            StationRecommendation stationrecommendation1 = (StationRecommendation)((List) (obj)).get(j);
            if (stationrecommendation1 != null)
            {
                ((List) (obj3)).add(stationrecommendation1.l());
                ((List) (obj2)).add(stationrecommendation1.n());
                ((List) (obj1)).add(stationrecommendation1.m());
            }
        }

        boolean flag = flag1;
        if (4 < b.size() + c.size())
        {
            flag = true;
        }
        obj3 = (new StringBuilder()).append(TextUtils.join(", ", ((Iterable) (obj3))));
        if (flag)
        {
            obj = "\u2026";
        } else
        {
            obj = "";
        }
        obj = ((StringBuilder) (obj3)).append(((String) (obj))).toString();
        obj2 = TextUtils.join("-", ((Iterable) (obj2)));
        obj1 = TextUtils.join("\n", ((Iterable) (obj1)));
        f = new StationRecommendation(b.g, null, ((String) (obj1)), ((String) (obj2)), ((String) (obj)));
    }

    public StationRecommendation a()
    {
        return f;
    }

    public void a(StationRecommendation stationrecommendation, boolean flag)
    {
        Object obj = stationrecommendation.j();
        if (obj != com.pandora.radio.data.b.a) goto _L2; else goto _L1
_L1:
        Set set;
        set = b;
        obj = d;
_L6:
        if (set.remove(stationrecommendation) && ((List) (obj)).size() > 0)
        {
            StationRecommendation stationrecommendation1 = (StationRecommendation)((List) (obj)).get(0);
            stationrecommendation1.k();
            set.add(stationrecommendation1);
            ((List) (obj)).remove(stationrecommendation1);
            a.put(stationrecommendation1.n(), stationrecommendation1);
        }
        a.remove(stationrecommendation.n());
        if (flag)
        {
            h();
        }
_L4:
        return;
_L2:
        if (obj != com.pandora.radio.data.b.c) goto _L4; else goto _L3
_L3:
        set = c;
        obj = e;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(boolean flag)
    {
        a.clear();
        a(((List) (new ArrayList(b))), ((List) (new ArrayList(c))));
        a(d, e);
        if (flag)
        {
            h();
        }
    }

    public List b()
    {
        return new ArrayList(a.values());
    }

    public a c()
    {
        return new a(new ArrayList(b));
    }

    public a d()
    {
        return new a(new ArrayList(c));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return b.size() == 0 && c.size() == 0;
    }

    public int f()
    {
        return b.size() + c.size();
    }

    public ContentValues[] g()
    {
        ContentValues acontentvalues[] = new ContentValues[b.size() + c.size() + d.size() + e.size()];
        Iterator iterator1 = b.iterator();
        int i;
        for (i = 0; iterator1.hasNext(); i++)
        {
            acontentvalues[i] = ((StationRecommendation)iterator1.next()).i();
        }

        for (Iterator iterator2 = c.iterator(); iterator2.hasNext();)
        {
            acontentvalues[i] = ((StationRecommendation)iterator2.next()).i();
            i++;
        }

        for (Iterator iterator3 = d.iterator(); iterator3.hasNext();)
        {
            acontentvalues[i] = ((StationRecommendation)iterator3.next()).i();
            i++;
        }

        for (Iterator iterator4 = e.iterator(); iterator4.hasNext();)
        {
            acontentvalues[i] = ((StationRecommendation)iterator4.next()).i();
            i++;
        }

        return acontentvalues;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            final StationRecommendations a;
            private a b;
            private a c;

            public StationRecommendation a()
            {
                if (b.hasNext())
                {
                    return b.a();
                } else
                {
                    return c.a();
                }
            }

            public boolean hasNext()
            {
                return b.hasNext() || c.hasNext();
            }

            public Object next()
            {
                return a();
            }

            public void remove()
            {
                throw new UnsupportedOperationException();
            }

            
            {
                a = StationRecommendations.this;
                super();
                b = a.c();
                c = a.d();
            }
        };
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (b.size() > 0)
        {
            stringbuffer.append("Artists: ");
            for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); stringbuffer.append(", "))
            {
                stringbuffer.append(((StationRecommendation)iterator1.next()).b());
            }

        }
        if (c.size() > 0)
        {
            stringbuffer.append("Genres: ");
            for (Iterator iterator2 = c.iterator(); iterator2.hasNext(); stringbuffer.append(", "))
            {
                stringbuffer.append(((StationRecommendation)iterator2.next()).b());
            }

        }
        if (d.size() > 0)
        {
            stringbuffer.append("Extra artists: ");
            for (Iterator iterator3 = d.iterator(); iterator3.hasNext(); stringbuffer.append(", "))
            {
                stringbuffer.append(((StationRecommendation)iterator3.next()).b());
            }

        }
        if (e.size() > 0)
        {
            stringbuffer.append("Extra genres: ");
            for (Iterator iterator4 = e.iterator(); iterator4.hasNext(); stringbuffer.append(", "))
            {
                stringbuffer.append(((StationRecommendation)iterator4.next()).b());
            }

        }
        return stringbuffer.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a(a, parcel);
        parcel.writeTypedArray((Parcelable[])b.toArray(new StationRecommendation[b.size()]), 0);
        parcel.writeTypedArray((Parcelable[])c.toArray(new StationRecommendation[c.size()]), 0);
        parcel.writeTypedList(d);
        parcel.writeTypedList(e);
    }

}
