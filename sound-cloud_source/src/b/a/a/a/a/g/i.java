// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import b.a.a.a.a.b.j;
import b.a.a.a.a.f.b;
import b.a.a.a.d;
import b.a.a.a.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

// Referenced classes of package b.a.a.a.a.g:
//            g

final class i
    implements g
{

    private final l a;

    public i(l l)
    {
        a = l;
    }

    public final JSONObject a()
    {
        Object obj1;
        JSONObject jsonobject;
        jsonobject = null;
        obj1 = null;
        d.a();
        Object obj = new File((new b(a)).a(), "com.crashlytics.settings.json");
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        obj = new FileInputStream(((File) (obj)));
        obj1 = obj;
        jsonobject = new JSONObject(j.a(((java.io.InputStream) (obj))));
        obj1 = obj;
        obj = jsonobject;
_L4:
        j.a(((java.io.Closeable) (obj1)));
        return ((JSONObject) (obj));
_L2:
        d.a();
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj = null;
_L8:
        obj1 = obj;
        d.a();
        j.a(((java.io.Closeable) (obj)));
        return null;
        Exception exception;
        exception;
        obj1 = jsonobject;
_L6:
        j.a(((java.io.Closeable) (obj1)));
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception1;
        exception1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(long l, JSONObject jsonobject)
    {
        Object obj;
        d.a();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj = null;
        FileWriter filewriter;
        jsonobject.put("expires_at", l);
        filewriter = new FileWriter(new File((new b(a)).a(), "com.crashlytics.settings.json"));
        obj = filewriter;
        filewriter.write(jsonobject.toString());
        obj = filewriter;
        filewriter.flush();
        j.a(filewriter);
        return;
        jsonobject;
        jsonobject = null;
_L4:
        obj = jsonobject;
        d.a();
        j.a(jsonobject);
        return;
        jsonobject;
_L2:
        j.a(((java.io.Closeable) (obj)));
        throw jsonobject;
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject;
        jsonobject = filewriter;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
