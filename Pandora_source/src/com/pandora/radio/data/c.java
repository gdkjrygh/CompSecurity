// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.pandora.radio.util.i;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.pandora.radio.data:
//            aa, ac

public class c extends aa
{

    private long h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;

    public c(long l1, JSONObject jsonobject)
        throws JSONException
    {
        super(l1, jsonobject);
        i = jsonobject.optString("artistUid");
        String s = jsonobject.optString("artistMessageId");
        if (!com.pandora.radio.util.i.a(s))
        {
            h = Long.parseLong(s);
        }
        j = jsonobject.optString("artistMessageButtonText");
        k = jsonobject.optString("artistMessageButtonUrl");
        l = jsonobject.optString("artistMessageCoachmarkArtUrl");
        m = jsonobject.optString("artistMessageCaption");
        n = jsonobject.optString("artistMessageCaptionUrl");
        o = jsonobject.optBoolean("artistMessageUseExternalBrowser", false);
    }

    public c(Cursor cursor, Cursor cursor1)
    {
        boolean flag = true;
        super(cursor);
        h = cursor1.getLong(1);
        i = cursor1.getString(2);
        j = cursor1.getString(3);
        k = cursor1.getString(4);
        l = cursor1.getString(5);
        m = cursor1.getString(6);
        n = cursor1.getString(8);
        if (cursor1.getInt(7) == 0)
        {
            flag = false;
        }
        o = flag;
    }

    public ContentValues a()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("artistMessageId", Long.valueOf(h));
        contentvalues.put("artistMessageUID", i);
        contentvalues.put("artistMessageButtonText", j);
        contentvalues.put("artistMessageButtonUrl", k);
        contentvalues.put("artistMessageCoachmarkArtUrl", l);
        contentvalues.put("artistMessageText", m);
        contentvalues.put("artistMessageCaptionUrl", n);
        int i1;
        if (o)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("artistMessageUseExternalBrowser", Integer.valueOf(i1));
        return contentvalues;
    }

    public long b()
    {
        return h;
    }

    public String c()
    {
        return i;
    }

    public String d()
    {
        return j;
    }

    public String e()
    {
        return k;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (c)obj;
            if (h != ((c) (obj)).h)
            {
                return false;
            }
            if (i != null && !i.equals(((c) (obj)).i))
            {
                return false;
            }
            if (m != null && !m.equals(((c) (obj)).m))
            {
                return false;
            }
            if (n != null && !n.equals(((c) (obj)).n))
            {
                return false;
            }
            if (j != null && !j.equals(((c) (obj)).j))
            {
                return false;
            }
            if (k != null && !k.equals(((c) (obj)).k))
            {
                return false;
            }
            if (l != null && !l.equals(((c) (obj)).l))
            {
                return false;
            }
            if (o != o)
            {
                return false;
            }
        }
        return true;
    }

    public String f()
    {
        return l;
    }

    public String g()
    {
        return m;
    }

    public int hashCode()
    {
        int k2 = 0;
        int l2 = (int)((long)(super.hashCode() * 31) + h);
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (i != null)
        {
            i1 = i.hashCode();
        } else
        {
            i1 = 0;
        }
        if (m != null)
        {
            j1 = m.hashCode();
        } else
        {
            j1 = 0;
        }
        if (n != null)
        {
            k1 = n.hashCode();
        } else
        {
            k1 = 0;
        }
        if (j != null)
        {
            l1 = j.hashCode();
        } else
        {
            l1 = 0;
        }
        if (k != null)
        {
            i2 = k.hashCode();
        } else
        {
            i2 = 0;
        }
        if (l != null)
        {
            j2 = l.hashCode();
        } else
        {
            j2 = 0;
        }
        if (o)
        {
            k2 = 1;
        }
        return (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + l2 * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k2;
    }

    public boolean k()
    {
        return false;
    }

    public ac l()
    {
        return ac.c;
    }

    public boolean m()
    {
        return false;
    }

    public String q_()
    {
        return n;
    }

    public boolean r_()
    {
        return !com.pandora.radio.util.i.a(j) || !com.pandora.radio.util.i.a(k);
    }

    public boolean s_()
    {
        return o;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("TrackData{ artistMessageId='").append(h).append("', ");
        stringbuilder.append("artistUid='").append(i).append("', ");
        stringbuilder.append("isCTA='").append(r_()).append("', ");
        stringbuilder.append("creator='").append(b).append("',");
        stringbuilder.append("useExternarBrowser='").append(o).append("'}");
        return stringbuilder.toString();
    }
}
