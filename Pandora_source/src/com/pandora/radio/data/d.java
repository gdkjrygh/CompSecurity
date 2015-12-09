// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.pandora.radio.util.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;

// Referenced classes of package com.pandora.radio.data:
//            aa, a, ac

public class d extends aa
{

    private String h;
    private String i;
    private Vector j;
    private a k;

    public d(long l1, String s)
    {
        super(l1);
        h = s;
    }

    public d(Cursor cursor, Cursor cursor1)
    {
        super(cursor);
        h = cursor1.getString(1);
        i = cursor1.getString(2);
        j = a(cursor1.getBlob(3));
        k = (new a.b(cursor1)).a();
        if (com.pandora.radio.util.i.a(k.L()))
        {
            k = null;
        }
    }

    private static Vector a(byte abyte0[])
    {
        Object obj = null;
        abyte0 = new ObjectInputStream(new ByteArrayInputStream(abyte0));
        obj = (Vector)abyte0.readObject();
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return ((Vector) (obj));
            }
        }
        return ((Vector) (obj));
        abyte0;
        abyte0 = null;
_L4:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
        }
        return null;
        abyte0;
_L2:
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw abyte0;
        Exception exception1;
        exception1;
        obj = abyte0;
        abyte0 = exception1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static byte[] a(Vector vector)
    {
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        abyte0 = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(vector);
        vector = bytearrayoutputstream.toByteArray();
        abyte0 = vector;
        if (objectoutputstream != null)
        {
            try
            {
                objectoutputstream.close();
            }
            catch (IOException ioexception)
            {
                return vector;
            }
            abyte0 = vector;
        }
        return abyte0;
        vector;
        objectoutputstream = null;
_L4:
        if (objectoutputstream != null)
        {
            try
            {
                objectoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Vector vector)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_41;
        }
        vector;
        objectoutputstream = null;
_L2:
        if (objectoutputstream != null)
        {
            try
            {
                objectoutputstream.close();
            }
            catch (IOException ioexception1) { }
        }
        throw vector;
        vector;
        if (true) goto _L2; else goto _L1
_L1:
        vector;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ContentValues a()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("adToken", h);
        contentvalues.put("clickThroughUrl", i);
        contentvalues.put("adTrackingTokens", a(j));
        if (k != null)
        {
            contentvalues.putAll(k.J());
        }
        return contentvalues;
    }

    public void a(String s, String s1, String s2, String s3, JSONArray jsonarray, HashMap hashmap, String s4, 
            a a1)
    {
        a = s;
        b = s1;
        c = "";
        d = s2;
        i = s3;
        f = hashmap;
        if (jsonarray != null && jsonarray.length() > 0)
        {
            j = new Vector(jsonarray.length());
            for (int i1 = 0; i1 < jsonarray.length(); i1++)
            {
                j.addElement(jsonarray.optString(i1));
            }

        }
        e = s4;
        k = a1;
    }

    public boolean b()
    {
        return f != null && f.size() > 0;
    }

    public String c()
    {
        return h;
    }

    public String d()
    {
        return i;
    }

    public Vector e()
    {
        return j;
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
            obj = (d)obj;
            if (h == null ? ((d) (obj)).h != null : !h.equals(((d) (obj)).h))
            {
                return false;
            }
            if (i == null ? ((d) (obj)).i != null : !i.equals(((d) (obj)).i))
            {
                return false;
            }
        }
        return true;
    }

    public a f()
    {
        return k;
    }

    public boolean g()
    {
        if (D() == null || D().isEmpty())
        {
            return true;
        } else
        {
            return com.pandora.radio.util.i.a((String)((HashMap)D().values().iterator().next()).get("audioUrl"));
        }
    }

    public boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        int j1 = 0;
        int k1 = super.hashCode();
        int i1;
        if (h != null)
        {
            i1 = h.hashCode();
        } else
        {
            i1 = 0;
        }
        if (i != null)
        {
            j1 = i.hashCode();
        }
        return (i1 + k1 * 31) * 31 + j1;
    }

    public boolean i()
    {
        return false;
    }

    public boolean j()
    {
        return false;
    }

    public boolean k()
    {
        return false;
    }

    public ac l()
    {
        return ac.b;
    }

    public boolean m()
    {
        return false;
    }

    public boolean n()
    {
        return false;
    }

    public boolean o()
    {
        return false;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AudioAdTrackData{adToken='").append(h).append('\'').append(", clickThroughUrl='").append(i).append('\'').append(", adTrackingTokens=").append(j).append(", audioUrlMap=").append(f).append('}').toString();
    }
}
