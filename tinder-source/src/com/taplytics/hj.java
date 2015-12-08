// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, hh

final class hj extends AsyncTask
{

    private JSONObject a;
    private JSONArray b;
    private Object c;
    private String d;
    private File e;
    private final hh f;
    private Exception g;

    public hj(Object obj, String s, File file, hh hh1)
    {
        g = null;
        if (!(obj instanceof JSONObject)) goto _L2; else goto _L1
_L1:
        a = (JSONObject)obj;
_L4:
        d = s;
        e = file;
        f = hh1;
        return;
_L2:
        if (obj instanceof JSONArray)
        {
            b = (JSONArray)obj;
        } else
        if (obj instanceof Serializable)
        {
            c = obj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private transient Void a()
    {
        if ((a != null || b != null || c != null) && d != null && f != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        gs.c("Missing json, fileName, or listener to write JSON to disk");
        return null;
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new FileOutputStream(new File(e, d)));
        Date date = new Date();
        if (c == null) goto _L2; else goto _L1
_L1:
        Object obj = c;
_L10:
        objectoutputstream.writeObject(obj);
        objectoutputstream.close();
        if (!gs.b()) goto _L4; else goto _L3
_L3:
        gs.a("Wrote JSON to Disk", date);
        return null;
_L7:
        if (!(obj instanceof Exception)) goto _L6; else goto _L5
_L5:
        obj = (Exception)obj;
_L8:
        gs.b("RW err", ((Exception) (obj)));
        objectoutputstream.close();
        return null;
_L2:
        if (a != null)
        {
            obj = a.toString();
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj = b.toString();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            g = ((Exception) (obj));
            return null;
        }
          goto _L7
_L6:
        obj = null;
          goto _L8
_L4:
        return null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        f.a(g);
    }
}
