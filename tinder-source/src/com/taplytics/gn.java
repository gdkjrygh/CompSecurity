// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, gs, cv, hk

public final class gn extends AsyncTask
{

    public gn()
    {
    }

    private static Void a(JSONObject ajsonobject[])
    {
        JSONObject jsonobject = ajsonobject[0];
        Iterator iterator = jsonobject.keys();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (String)iterator.next();
        ajsonobject = jsonobject.optJSONObject(((String) (obj))).optString("path");
        obj = jsonobject.optJSONObject(((String) (obj))).optString("filename");
        File file = new File(ci.b().u.getFilesDir(), ((String) (obj)));
        if (file.exists() || file.isDirectory()) goto _L4; else goto _L3
_L3:
        obj = (new URL(ajsonobject)).openStream();
        ajsonobject = new FileOutputStream(file);
        byte abyte0[] = new byte[2048];
_L7:
        int i = ((InputStream) (obj)).read(abyte0);
        if (i == -1) goto _L6; else goto _L5
_L5:
        ajsonobject.write(abyte0, 0, i);
          goto _L7
        Exception exception;
        exception;
_L13:
        if (obj == null) goto _L9; else goto _L8
_L8:
        ((InputStream) (obj)).close();
_L9:
        if (ajsonobject == null) goto _L4; else goto _L10
_L10:
        ajsonobject.close();
          goto _L4
        ajsonobject;
        gs.b("something terrible has occurred in our silly nested io catch", ajsonobject);
          goto _L4
        ajsonobject;
        gs.b("error saving image to disk in task", ajsonobject);
_L12:
        return null;
_L6:
        ((InputStream) (obj)).close();
        ajsonobject.close();
          goto _L4
_L2:
        if (ci.b().v == null || !ci.b().g || cv.a().j == null) goto _L12; else goto _L11
_L11:
        hk.c(cv.a().j);
        return null;
        ajsonobject;
        ajsonobject = null;
        obj = null;
          goto _L13
        ajsonobject;
        ajsonobject = null;
          goto _L13
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((JSONObject[])aobj);
    }
}
