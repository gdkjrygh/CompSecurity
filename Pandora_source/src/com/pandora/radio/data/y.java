// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.pandora.radio.util.i;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.pandora.radio.data:
//            g, w, h, i

public class y
    implements Serializable
{

    private static final SimpleDateFormat a = new SimpleDateFormat("MMM d, yyyy", Locale.getDefault());
    private g A;
    private boolean B;
    private long b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private String s;
    private String t;
    private boolean u;
    private boolean v;
    private long w;
    private long x;
    private List y;
    private com.pandora.radio.data.i z;

    public y(Cursor cursor)
    {
        this(cursor, null);
    }

    public y(Cursor cursor, Cursor cursor1)
    {
        boolean flag1 = true;
        super();
        t = null;
        u = false;
        v = false;
        y = null;
        z = null;
        A = null;
        B = false;
        b = cursor.getLong(0);
        c = cursor.getString(1);
        d = cursor.getString(14);
        e = cursor.getString(2);
        f = cursor.getString(20);
        g = cursor.getString(22);
        boolean flag;
        if (cursor.getInt(3) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (cursor.getInt(4) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (cursor.getInt(5) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (cursor.getInt(6) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        if (cursor.getInt(7) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        if (cursor.getInt(8) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        if (cursor.getInt(9) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q = flag;
        if (cursor.getInt(10) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = flag;
        h = cursor.getLong(11);
        s = cursor.getString(12);
        t = cursor.getString(13);
        if (cursor.getInt(15) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u = flag;
        if (cursor.getInt(16) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v = flag;
        w = cursor.getLong(17);
        x = cursor.getLong(18);
        if (cursor.getInt(19) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        B = flag;
        if (cursor.getInt(24) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        if (cursor.getInt(23) == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o = flag;
        y = a(cursor1);
        A = new g(cursor);
        if (b <= 0L)
        {
            throw new UnsupportedOperationException("invalid station id");
        } else
        {
            return;
        }
    }

    public y(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag1 = true;
        super();
        t = null;
        u = false;
        v = false;
        y = null;
        z = null;
        A = null;
        B = false;
        b = -1L;
        c = jsonobject.getString("stationToken");
        d = jsonobject.getString("stationId");
        e = jsonobject.getString("stationName");
        f = jsonobject.optString("stationDescription");
        g = jsonobject.optString("stationNameWithTwitterHandle", null);
        JSONObject jsonobject1;
        boolean flag;
        if (jsonobject.has("requiresCleanAds") && jsonobject.getBoolean("requiresCleanAds"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        if (jsonobject.has("suppressVideoAds") && jsonobject.getBoolean("suppressVideoAds"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q = flag;
        jsonobject1 = jsonobject.optJSONObject("adAttributes");
        if (jsonobject1 != null && jsonobject1.has("supportImpressionTargeting") && jsonobject1.getBoolean("supportImpressionTargeting"))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        r = flag;
        h = jsonobject.getJSONObject("dateCreated").getLong("time");
        i = jsonobject.getBoolean("isQuickMix");
        j = jsonobject.getBoolean("isShared");
        k = jsonobject.getBoolean("allowAddMusic");
        l = jsonobject.getBoolean("allowRename");
        m = jsonobject.getBoolean("allowDelete");
        s = jsonobject.optString("artUrl");
        if (s())
        {
            t = a(jsonobject.getJSONArray("quickMixStationIds"));
        } else
        {
            t = a(jsonobject);
        }
        B = jsonobject.optBoolean("advertiserStation");
        u = jsonobject.optBoolean("onePlaylist", false);
        v = jsonobject.optBoolean("unlimitedSkips", false);
        w = jsonobject.optLong("expireTimeMillis", 0L);
        x = jsonobject.optLong("expireWarnBeforeMillis", (int)(w - System.currentTimeMillis()));
        if (jsonobject.has("stationDescr") && B)
        {
            t = jsonobject.getString("stationDescr");
        }
        y = c(jsonobject);
        A = new g(jsonobject, c);
        z = d(jsonobject);
        n = jsonobject.has("enableArtistAudioMessages");
        o = jsonobject.optBoolean("enableArtistAudioMessages", false);
    }

    public static String a(JSONArray jsonarray)
        throws JSONException
    {
        int j1 = jsonarray.length();
        StringBuilder stringbuilder = new StringBuilder();
        for (int i1 = 0; i1 < j1; i1++)
        {
            stringbuilder.append((String)jsonarray.get(i1));
            if (i1 + 1 < j1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.toString();
    }

    static String a(JSONObject jsonobject)
        throws JSONException
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (jsonobject.has("music"))
        {
            jsonobject = jsonobject.getJSONObject("music");
            if (jsonobject.has("artists"))
            {
                jsonobject = jsonobject.getJSONArray("artists");
                for (int i1 = 0; i1 < jsonobject.length(); i1++)
                {
                    Object obj = jsonobject.get(i1);
                    if (!(obj instanceof JSONObject))
                    {
                        continue;
                    }
                    stringbuffer.append(((JSONObject)obj).getString("artistName"));
                    if (i1 + 1 < jsonobject.length())
                    {
                        stringbuffer.append(", ");
                    }
                }

            }
        }
        return stringbuffer.toString();
    }

    private List a(Cursor cursor)
    {
        if (cursor == null || cursor.getCount() == 0)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList(cursor.getCount());
        cursor.moveToFirst();
        do
        {
            arraylist.add(new w(cursor));
        } while (cursor.moveToNext());
        return arraylist;
    }

    private void a(JSONArray jsonarray, List list)
        throws JSONException
    {
        int j1 = jsonarray.length();
        for (int i1 = 0; i1 < j1; i1++)
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i1);
            list.add(new w(c, jsonobject));
        }

    }

    private h[] b(JSONArray jsonarray)
        throws JSONException
    {
        int j1 = jsonarray.length();
        h ah[] = new h[j1];
        for (int i1 = 0; i1 < j1; i1++)
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i1);
            ah[i1] = new h(c, jsonobject);
        }

        return ah;
    }

    private List c(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.has("music"))
        {
            jsonobject = jsonobject.optJSONObject("music");
            ArrayList arraylist = new ArrayList();
            a(jsonobject.optJSONArray("artists"), arraylist);
            a(jsonobject.optJSONArray("songs"), arraylist);
            return arraylist;
        } else
        {
            return null;
        }
    }

    private com.pandora.radio.data.i d(JSONObject jsonobject)
        throws JSONException
    {
        com.pandora.radio.data.i i1 = null;
        if (jsonobject.has("feedback"))
        {
            jsonobject = jsonobject.optJSONObject("feedback");
            i1 = new com.pandora.radio.data.i(b(jsonobject.optJSONArray("thumbsDown")), b(jsonobject.optJSONArray("thumbsUp")));
        }
        return i1;
    }

    public boolean A()
    {
        return B || u;
    }

    public List B()
    {
        return y;
    }

    public com.pandora.radio.data.i C()
    {
        return z;
    }

    public boolean D()
    {
        return z != null;
    }

    public g E()
    {
        return A;
    }

    public int F()
    {
        return A.b();
    }

    public int G()
    {
        return A.c();
    }

    public int H()
    {
        return A.d();
    }

    public boolean I()
    {
        return n;
    }

    public boolean J()
    {
        return o;
    }

    public ContentValues a()
    {
        boolean flag = true;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("stationToken", c);
        contentvalues.put("stationId", d);
        contentvalues.put("stationName", e);
        contentvalues.put("stationDescription", f);
        contentvalues.put("requiresCleanAds", Boolean.valueOf(p));
        contentvalues.put("suppressVideoAds", Boolean.valueOf(q));
        int i1;
        if (r)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("supportImpressionTargeting", Integer.valueOf(i1));
        contentvalues.put("dateCreated", Long.valueOf(h));
        contentvalues.put("isQuickMix", Boolean.valueOf(i));
        contentvalues.put("isShared", Boolean.valueOf(j));
        contentvalues.put("allowAddMusic", Boolean.valueOf(k));
        contentvalues.put("allowRename", Boolean.valueOf(l));
        contentvalues.put("allowDelete", Boolean.valueOf(m));
        contentvalues.put("artUrl", s);
        contentvalues.put("seeds", t);
        contentvalues.put("onePlaylist", Boolean.valueOf(u));
        contentvalues.put("unlimitedSkips", Boolean.valueOf(v));
        contentvalues.put("expireTimeMillis", Long.valueOf(w));
        contentvalues.put("expireWarnBeforeMillis", Long.valueOf(x));
        if (B)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("isAdvertiser", Integer.valueOf(i1));
        contentvalues.put("isPendingDelete", Boolean.valueOf(false));
        contentvalues.put("stationNameWithTwitterHandle", g);
        if (o)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("enableArtistAudioMessages", Integer.valueOf(i1));
        if (n)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        contentvalues.put("supportsArtistAudioMessages", Integer.valueOf(i1));
        return contentvalues;
    }

    public void a(long l1)
    {
        b = l1;
    }

    public void a(String s1)
    {
        t = s1;
    }

    public void a(boolean flag)
    {
        o = flag;
    }

    public long b()
    {
        return b;
    }

    public void b(JSONObject jsonobject)
        throws JSONException
    {
        A = new g(jsonobject, c);
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return e;
    }

    public String e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (y)obj;
            if (k != ((y) (obj)).k)
            {
                return false;
            }
            if (m != ((y) (obj)).m)
            {
                return false;
            }
            if (p != ((y) (obj)).p)
            {
                return false;
            }
            if (q != ((y) (obj)).q)
            {
                return false;
            }
            if (r != ((y) (obj)).r)
            {
                return false;
            }
            if (l != ((y) (obj)).l)
            {
                return false;
            }
            if (i != ((y) (obj)).i)
            {
                return false;
            }
            if (j != ((y) (obj)).j)
            {
                return false;
            }
            if (h != ((y) (obj)).h)
            {
                return false;
            }
            if (e == null ? ((y) (obj)).e != null : !e.equals(((y) (obj)).e))
            {
                return false;
            }
            if (c == null ? ((y) (obj)).c != null : !c.equals(((y) (obj)).c))
            {
                return false;
            }
            if (u != ((y) (obj)).u)
            {
                return false;
            }
            if (v != ((y) (obj)).v)
            {
                return false;
            }
            if (n != ((y) (obj)).n)
            {
                return false;
            }
            if (o != ((y) (obj)).o)
            {
                return false;
            }
            if (B != ((y) (obj)).B)
            {
                return false;
            }
            if (f == null ? ((y) (obj)).f != null : !f.equals(((y) (obj)).f))
            {
                return false;
            }
            if (g == null ? ((y) (obj)).g != null : !g.equals(((y) (obj)).g))
            {
                return false;
            }
            if (A != null)
            {
                if (A.b() != ((y) (obj)).F())
                {
                    return false;
                }
                if (A.c() != ((y) (obj)).G())
                {
                    return false;
                }
                if (A.d() != ((y) (obj)).H())
                {
                    return false;
                }
            }
        }
        return true;
    }

    public String f()
    {
        return g;
    }

    public boolean g()
    {
        return !com.pandora.radio.util.i.a(g);
    }

    public String h()
    {
        return d;
    }

    public int hashCode()
    {
        int i5 = 1;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int j5;
        if (c != null)
        {
            i1 = c.hashCode();
        } else
        {
            i1 = 0;
        }
        if (e != null)
        {
            j1 = e.hashCode();
        } else
        {
            j1 = 0;
        }
        if (f != null)
        {
            k1 = f.hashCode();
        } else
        {
            k1 = 0;
        }
        if (g != null)
        {
            l1 = g.hashCode();
        } else
        {
            l1 = 0;
        }
        j5 = (int)(h ^ h >>> 32);
        if (i)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (j)
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        if (k)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        if (l)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        if (m)
        {
            i3 = 1;
        } else
        {
            i3 = 0;
        }
        if (p)
        {
            j3 = 1;
        } else
        {
            j3 = 0;
        }
        if (q)
        {
            k3 = 1;
        } else
        {
            k3 = 0;
        }
        if (r)
        {
            l3 = 1;
        } else
        {
            l3 = 0;
        }
        if (u)
        {
            i4 = 1;
        } else
        {
            i4 = 0;
        }
        if (v)
        {
            j4 = 1;
        } else
        {
            j4 = 0;
        }
        if (B)
        {
            k4 = 1;
        } else
        {
            k4 = 0;
        }
        if (n)
        {
            l4 = 1;
        } else
        {
            l4 = 0;
        }
        if (!o)
        {
            i5 = 0;
        }
        return ((((l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + ((l1 + (k1 + (j1 + i1 * 31) * 31) * 31) * 31 + j5) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i5) * 31 + A.b()) * 31 + A.c()) * 31 + A.d();
    }

    public long i()
    {
        return h;
    }

    public boolean j()
    {
        return i;
    }

    public boolean k()
    {
        return j;
    }

    public boolean l()
    {
        return k;
    }

    public boolean m()
    {
        return l;
    }

    public boolean n()
    {
        return m;
    }

    public String o()
    {
        return s;
    }

    public String p()
    {
        return t;
    }

    public boolean q()
    {
        return q;
    }

    public boolean r()
    {
        return r;
    }

    public boolean s()
    {
        return !j && i;
    }

    public boolean t()
    {
        return u;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("StationData{stationToken='").append(c).append('\'').append(", stationId='").append(d).append('\'').append(", stationName='").append(e).append('\'').append(", dateCreated='").append(h).append('\'').append(", isQuickMix=").append(i).append(", isShared=").append(j).append(", allowAddMusic=").append(k).append(", allowRename=").append(l).append(", allowDelete=").append(m).append(", requiresCleanAds=").append(p).append(", suppressVideoAds=").append(q).append(", advertiserStation=").append(B).append(", suppportImpressionTargeting=").append(r).append(", seeds = '").append(t).append("', ");
        String s1;
        if (u)
        {
            s1 = String.format("onePlaylist=%s, unlimitedSkips=%s, expireTimeMillis=%s, expireWarnBeforeMs=%s", new Object[] {
                Boolean.valueOf(u), Boolean.valueOf(v), Long.valueOf(w), Long.valueOf(x)
            });
        } else
        {
            s1 = "";
        }
        return stringbuilder.append(s1).append(", personalizationPercent=").append(A.b()).append(", artistAudioMessagesSupported=").append(n).append(", artistAudioMessagesEnabled=").append(o).append("}").toString();
    }

    public boolean u()
    {
        return v;
    }

    public boolean v()
    {
        return A() && w != 0L;
    }

    public boolean w()
    {
        return v() && w < System.currentTimeMillis();
    }

    public long x()
    {
        return w;
    }

    public String y()
    {
        return a.format(new Date(w));
    }

    public long z()
    {
        return x;
    }

}
