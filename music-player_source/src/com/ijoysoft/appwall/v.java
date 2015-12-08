// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

// Referenced classes of package com.ijoysoft.appwall:
//            u, s, t, w

public final class v extends AsyncTask
{

    private w a;

    public v(w w1)
    {
        a = w1;
    }

    private static transient ArrayList a(String as[])
    {
        InputStream inputstream;
        Object obj1;
        inputstream = u.a(as[0]);
        obj1 = new s();
        if (inputstream == null) goto _L2; else goto _L1
_L1:
        as = SAXParserFactory.newInstance().newSAXParser();
        obj1 = new t(((s) (obj1)), (byte)0);
        as.parse(inputstream, ((org.xml.sax.helpers.DefaultHandler) (obj1)));
        as = ((t) (obj1)).a;
_L4:
        inputstream.close();
        return as;
_L2:
        as = null;
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        as = null;
_L8:
        ((IOException) (obj)).printStackTrace();
        return as;
        obj;
        as = null;
_L6:
        ((Exception) (obj)).printStackTrace();
        return as;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final transient Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (ArrayList)obj;
        a.a(((ArrayList) (obj)));
    }
}
