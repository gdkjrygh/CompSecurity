// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import com.pandora.android.util.s;
import com.pandora.android.util.t;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;
import p.df.a;

public class InboxNotification
    implements Parcelable
{
    public static class a
    {

        private final long a;
        private CharSequence b;
        private CharSequence c;
        private Uri d;
        private Uri e;
        private Uri f;
        private CharSequence g;
        private Integer h;
        private boolean i;
        private Boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private long n;
        private long o;
        private Long p;

        public a a(long l1)
        {
            n = l1;
            return this;
        }

        public a a(Uri uri)
        {
            d = uri;
            return this;
        }

        public a a(Integer integer)
        {
            h = integer;
            return this;
        }

        public a a(Long long1)
        {
            p = long1;
            return this;
        }

        public a a(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Html.fromHtml(s1);
            }
            b = s1;
            return this;
        }

        public a a(boolean flag)
        {
            i = flag;
            return this;
        }

        public InboxNotification a()
        {
            long l2 = a;
            CharSequence charsequence = b;
            CharSequence charsequence1 = c;
            Uri uri = d;
            Uri uri1 = e;
            Uri uri2 = f;
            CharSequence charsequence2 = g;
            Integer integer = h;
            boolean flag = i;
            Boolean boolean1 = j;
            boolean flag1 = k;
            boolean flag2 = l;
            boolean flag3 = m;
            long l3 = n;
            long l4 = o;
            long l1;
            if (p == null)
            {
                l1 = n;
            } else
            {
                l1 = p.longValue();
            }
            return new InboxNotification(l2, charsequence, charsequence1, uri, uri1, uri2, charsequence2, integer, flag, boolean1, flag1, flag2, flag3, l3, l4, Long.valueOf(l1));
        }

        public a b(long l1)
        {
            o = l1;
            return this;
        }

        public a b(Uri uri)
        {
            e = uri;
            return this;
        }

        public a b(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Html.fromHtml(s1);
            }
            c = s1;
            return this;
        }

        public a b(boolean flag)
        {
            j = Boolean.valueOf(flag);
            return this;
        }

        public a c(Uri uri)
        {
            f = uri;
            return this;
        }

        public a c(String s1)
        {
            if (s.a(s1))
            {
                s1 = null;
            } else
            {
                s1 = Uri.parse(s1);
            }
            return a(s1);
        }

        public a c(boolean flag)
        {
            k = flag;
            return this;
        }

        public a d(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Uri.parse(s1);
            }
            return b(s1);
        }

        public a d(boolean flag)
        {
            l = flag;
            return this;
        }

        public a e(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Uri.parse(s1);
            }
            return c(s1);
        }

        public a e(boolean flag)
        {
            m = flag;
            return this;
        }

        public a f(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Html.fromHtml(s1);
            }
            g = s1;
            return this;
        }

        public a(long l1)
        {
            a = l1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public InboxNotification a(Parcel parcel)
        {
            return new InboxNotification(parcel);
        }

        public InboxNotification[] a(int i1)
        {
            return new InboxNotification[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final Uri d;
    public final Uri e;
    public final Uri f;
    public final CharSequence g;
    public final Integer h;
    public final boolean i;
    public final Boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final long o;
    public final long p;

    protected InboxNotification(long l1, CharSequence charsequence, CharSequence charsequence1, Uri uri, Uri uri1, Uri uri2, 
            CharSequence charsequence2, Integer integer, boolean flag, Boolean boolean1, boolean flag1, boolean flag2, boolean flag3, 
            long l2, long l3, Long long1)
    {
        a = l1;
        b = charsequence;
        c = charsequence1;
        d = uri;
        e = uri1;
        f = uri2;
        g = charsequence2;
        h = integer;
        i = flag;
        j = boolean1;
        k = flag1;
        l = flag2;
        m = flag3;
        n = l2;
        o = l3;
        p = long1.longValue();
    }

    protected InboxNotification(Parcel parcel)
    {
        a = parcel.readLong();
        b = t.b(parcel);
        c = t.b(parcel);
        d = (Uri)t.c(parcel);
        e = (Uri)t.c(parcel);
        f = (Uri)t.c(parcel);
        g = t.b(parcel);
        h = (Integer)parcel.readValue(java/lang/Integer.getClassLoader());
        i = t.d(parcel);
        j = (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader());
        k = t.d(parcel);
        l = t.d(parcel);
        m = t.d(parcel);
        n = parcel.readLong();
        o = parcel.readLong();
        p = parcel.readLong();
    }

    public static InboxNotification a(Cursor cursor)
    {
        boolean flag1 = true;
        a a1 = new a(cursor.getLong(cursor.getColumnIndex("_id")));
        a1.a(cursor.getString(cursor.getColumnIndex("title")));
        a1.b(cursor.getString(cursor.getColumnIndex("text")));
        a1.c(cursor.getString(cursor.getColumnIndex("action")));
        a1.d(cursor.getString(cursor.getColumnIndex("icon")));
        a1.e(cursor.getString(cursor.getColumnIndex("image")));
        a1.f(cursor.getString(cursor.getColumnIndex("caption")));
        Integer integer;
        int i1;
        boolean flag;
        if (cursor.isNull(cursor.getColumnIndex("bgColor")))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("bgColor")));
        }
        a1.a(integer);
        if (cursor.getInt(cursor.getColumnIndex("showPlay")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.a(flag);
        i1 = cursor.getColumnIndex("isSeen");
        if (!cursor.isNull(i1) && cursor.getInt(i1) == p.cx.x.d.c.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.b(flag);
        if (cursor.getInt(cursor.getColumnIndex("dismissOnClick")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.c(flag);
        if (cursor.getInt(cursor.getColumnIndex("neverSetSeen")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.d(flag);
        if (cursor.getInt(cursor.getColumnIndex("omitDate")) == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a1.e(flag);
        a1.a(cursor.getLong(cursor.getColumnIndex("createTimestamp")));
        a1.b(cursor.getLong(cursor.getColumnIndex("expireTimestamp")));
        a1.a(Long.valueOf(cursor.getLong(cursor.getColumnIndex("sortKey"))));
        return a1.a();
    }

    public static InboxNotification a(JSONObject jsonobject)
    {
        return a(jsonobject, false);
    }

    public static InboxNotification a(JSONObject jsonobject, boolean flag)
    {
        a a1;
        a1 = new a(jsonobject.getLong("messageId"));
        a1.a(jsonobject.getLong("createTimestamp"));
        a1.b(jsonobject.getLong("expireTimestamp"));
        if (!jsonobject.has("sortKey"))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        a1.a(Long.valueOf(jsonobject.getLong("sortKey")));
_L1:
        if (!jsonobject.has("status"))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (jsonobject.getInt("status") == p.cx.x.d.d.a())
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_114;
        try
        {
            a1.a(Long.valueOf(jsonobject.getLong("createTimestamp")));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            p.df.a.e("InboxNotification", "Unable to parse InboxNotification", jsonobject);
            return null;
        }
          goto _L1
        String s;
        UnsupportedEncodingException unsupportedencodingexception;
        int i1;
        int j1;
        boolean flag1;
        if (jsonobject.getInt("status") == p.cx.x.d.c.a())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a1.b(flag1);
        jsonobject = jsonobject.getJSONObject("payload");
        if (!jsonobject.has("title")) goto _L3; else goto _L2
_L2:
        s = jsonobject.getString("title");
        if (!flag) goto _L5; else goto _L4
_L4:
        a1.a(URLDecoder.decode(s, "UTF-8"));
_L3:
        if (!jsonobject.has("text")) goto _L7; else goto _L6
_L6:
        s = jsonobject.getString("text");
        if (!flag) goto _L9; else goto _L8
_L8:
        a1.b(URLDecoder.decode(s, "UTF-8"));
_L7:
        if (jsonobject.has("action"))
        {
            a1.c(jsonobject.getString("action"));
        }
        if (jsonobject.has("icon"))
        {
            a1.d(jsonobject.getString("icon"));
        }
        if (jsonobject.has("image"))
        {
            a1.e(jsonobject.getString("image"));
        }
        if (!jsonobject.has("caption")) goto _L11; else goto _L10
_L10:
        s = jsonobject.getString("caption");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_486;
        }
        a1.f(URLDecoder.decode(s, "UTF-8"));
_L11:
        if (jsonobject.has("dismissOnClick"))
        {
            a1.c(jsonobject.getBoolean("dismissOnClick"));
        }
        if (jsonobject.has("neverSetSeen"))
        {
            a1.d(jsonobject.getBoolean("neverSetSeen"));
        }
        if (jsonobject.has("omitDate"))
        {
            a1.e(jsonobject.getBoolean("omitDate"));
        }
        if (!jsonobject.has("bgColor")) goto _L13; else goto _L12
_L12:
        j1 = jsonobject.getInt("bgColor");
        i1 = j1;
        if (Color.alpha(j1) == 0)
        {
            i1 = j1 | 0xff000000;
        }
        a1.a(Integer.valueOf(i1));
_L13:
        if (jsonobject.has("showPlay"))
        {
            a1.a(jsonobject.getBoolean("showPlay"));
        }
        return a1.a();
        unsupportedencodingexception;
        a1.a(s);
          goto _L3
_L5:
        a1.a(s);
          goto _L3
        unsupportedencodingexception;
        a1.b(s);
          goto _L7
_L9:
        a1.b(s);
          goto _L7
        unsupportedencodingexception;
        a1.f(s);
          goto _L11
        a1.f(s);
          goto _L11
    }

    public ContentValues a()
    {
        boolean flag = true;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("_id", Long.valueOf(a));
        String s;
        int i1;
        if (b != null)
        {
            if (b instanceof Spanned)
            {
                s = Html.toHtml((Spanned)b);
            } else
            {
                s = b.toString();
            }
            contentvalues.put("title", s);
        }
        if (c != null)
        {
            if (c instanceof Spanned)
            {
                s = Html.toHtml((Spanned)c);
            } else
            {
                s = c.toString();
            }
            contentvalues.put("text", s);
        }
        if (d != null)
        {
            contentvalues.put("action", d.toString());
        }
        if (e != null)
        {
            contentvalues.put("icon", e.toString());
        }
        if (f != null)
        {
            contentvalues.put("image", f.toString());
        }
        if (g != null)
        {
            if (g instanceof Spanned)
            {
                s = Html.toHtml((Spanned)g);
            } else
            {
                s = g.toString();
            }
            contentvalues.put("caption", s);
        }
        if (h != null)
        {
            contentvalues.put("bgColor", h);
        }
        if (j != null)
        {
            if (j.booleanValue())
            {
                i1 = p.cx.x.d.c.a();
            } else
            {
                i1 = p.cx.x.d.b.a();
            }
            contentvalues.put("isSeen", Integer.valueOf(i1));
        }
        if (k)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("dismissOnClick", Integer.valueOf(i1));
        if (l)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("neverSetSeen", Integer.valueOf(i1));
        if (m)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("omitDate", Integer.valueOf(i1));
        if (i)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        contentvalues.put("showPlay", Integer.valueOf(i1));
        contentvalues.put("createTimestamp", Long.valueOf(n));
        contentvalues.put("expireTimestamp", Long.valueOf(o));
        contentvalues.put("sortKey", Long.valueOf(p));
        return contentvalues;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (InboxNotification)obj;
        if (d == null)
        {
            if (((InboxNotification) (obj)).d != null)
            {
                return false;
            }
        } else
        if (!d.equals(((InboxNotification) (obj)).d))
        {
            return false;
        }
        if (g == null)
        {
            if (((InboxNotification) (obj)).g != null)
            {
                return false;
            }
        } else
        if (!g.toString().trim().equals(((InboxNotification) (obj)).g.toString().trim()))
        {
            return false;
        }
        if (n != ((InboxNotification) (obj)).n)
        {
            return false;
        }
        if (o != ((InboxNotification) (obj)).o)
        {
            return false;
        }
        if (p != ((InboxNotification) (obj)).p)
        {
            return false;
        }
        if (e == null)
        {
            if (((InboxNotification) (obj)).e != null)
            {
                return false;
            }
        } else
        if (!e.equals(((InboxNotification) (obj)).e))
        {
            return false;
        }
        if (a != ((InboxNotification) (obj)).a)
        {
            return false;
        }
        if (h == null)
        {
            if (((InboxNotification) (obj)).h != null)
            {
                return false;
            }
        } else
        if (!h.equals(((InboxNotification) (obj)).h))
        {
            return false;
        }
        if (f == null)
        {
            if (((InboxNotification) (obj)).f != null)
            {
                return false;
            }
        } else
        if (!f.equals(((InboxNotification) (obj)).f))
        {
            return false;
        }
        if (j == null)
        {
            if (((InboxNotification) (obj)).j != null)
            {
                return false;
            }
        } else
        if (!j.equals(((InboxNotification) (obj)).j))
        {
            return false;
        }
        if (k != ((InboxNotification) (obj)).k)
        {
            return false;
        }
        if (l != ((InboxNotification) (obj)).l)
        {
            return false;
        }
        if (m != ((InboxNotification) (obj)).m)
        {
            return false;
        }
        if (i != ((InboxNotification) (obj)).i)
        {
            return false;
        }
        if (c == null)
        {
            if (((InboxNotification) (obj)).c != null)
            {
                return false;
            }
        } else
        if (!c.toString().trim().equals(((InboxNotification) (obj)).c.toString().trim()))
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((InboxNotification) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.toString().trim().equals(((InboxNotification) (obj)).b.toString().trim())) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        char c4 = '\u04CF';
        int l2 = 0;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        char c1;
        char c2;
        char c3;
        int k2;
        int i3;
        int j3;
        int k3;
        int l3;
        if (d == null)
        {
            i1 = 0;
        } else
        {
            i1 = d.hashCode();
        }
        if (g == null)
        {
            j1 = 0;
        } else
        {
            j1 = g.hashCode();
        }
        i3 = (int)(n ^ n >>> 32);
        j3 = (int)(o ^ o >>> 32);
        k3 = (int)(p ^ p >>> 32);
        if (e == null)
        {
            k1 = 0;
        } else
        {
            k1 = e.hashCode();
        }
        l3 = (int)(a ^ a >>> 32);
        if (f == null)
        {
            l1 = 0;
        } else
        {
            l1 = f.hashCode();
        }
        if (h == null)
        {
            i2 = 0;
        } else
        {
            i2 = h.intValue();
        }
        if (j == null)
        {
            j2 = 0;
        } else
        {
            j2 = j.hashCode();
        }
        if (k)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (l)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (m)
        {
            c3 = '\u04CF';
        } else
        {
            c3 = '\u04D5';
        }
        if (!i)
        {
            c4 = '\u04D5';
        }
        if (c == null)
        {
            k2 = 0;
        } else
        {
            k2 = c.hashCode();
        }
        if (b != null)
        {
            l2 = b.hashCode();
        }
        return (k2 + ((c3 + (c2 + (c1 + (j2 + (i2 + (l1 + ((k1 + ((((j1 + (i1 + 31) * 31) * 31 + i3) * 31 + j3) * 31 + k3) * 31) * 31 + l3) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + c4) * 31) * 31 + l2;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeLong(a);
        t.a(parcel, b, i1);
        t.a(parcel, c, i1);
        t.a(parcel, d, 0);
        t.a(parcel, e, 0);
        t.a(parcel, f, 0);
        t.a(parcel, g, i1);
        parcel.writeValue(h);
        t.a(parcel, i);
        parcel.writeValue(j);
        t.a(parcel, k);
        t.a(parcel, l);
        t.a(parcel, m);
        parcel.writeLong(n);
        parcel.writeLong(o);
        parcel.writeLong(p);
    }

}
