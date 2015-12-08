// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.g;

import a.a.a.a.a.b.l;
import a.a.a.a.a.f.b;
import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

// Referenced classes of package a.a.a.a.a.g:
//            g

final class i
    implements g
{

    private final p a;

    public i(p p)
    {
        a = p;
    }

    public final JSONObject a()
    {
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        f.d();
        Object obj = new File((new b(a)).a(), "com.crashlytics.settings.json");
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        obj = new FileInputStream(((File) (obj)));
        obj1 = obj;
        obj2 = new JSONObject(l.a(((java.io.InputStream) (obj))));
        obj1 = obj;
        obj = obj2;
_L4:
        l.a(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
        return ((JSONObject) (obj));
_L2:
        f.d();
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj = null;
_L8:
        obj1 = obj;
        f.d().b("Fabric", "Failed to fetch cached settings", ((Throwable) (obj2)));
        l.a(((java.io.Closeable) (obj)), "Error while closing settings cache file.");
        return null;
        Exception exception;
        exception;
        obj1 = obj2;
_L6:
        l.a(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(long l1, JSONObject jsonobject)
    {
        Object obj;
        f.d();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = null;
        FileWriter filewriter;
        jsonobject.put("expires_at", l1);
        filewriter = new FileWriter(new File((new b(a)).a(), "com.crashlytics.settings.json"));
        obj = filewriter;
        filewriter.write(jsonobject.toString());
        obj = filewriter;
        filewriter.flush();
        l.a(filewriter, "Failed to close settings writer.");
        return;
        Exception exception;
        exception;
        jsonobject = null;
_L4:
        obj = jsonobject;
        f.d().b("Fabric", "Failed to cache settings", exception);
        l.a(jsonobject, "Failed to close settings writer.");
        return;
        jsonobject;
_L2:
        l.a(((java.io.Closeable) (obj)), "Failed to close settings writer.");
        throw jsonobject;
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        jsonobject = filewriter;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
