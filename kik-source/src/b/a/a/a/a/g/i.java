// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import b.a.a.a.a.b.j;
import b.a.a.a.a.f.a;
import b.a.a.a.d;
import b.a.a.a.l;
import b.a.a.a.o;
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
        Object obj2;
        obj2 = null;
        obj1 = null;
        d.c();
        Object obj = new File((new a(a)).a(), "com.crashlytics.settings.json");
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        obj = new FileInputStream(((File) (obj)));
        obj1 = obj;
        obj2 = new JSONObject(j.a(((java.io.InputStream) (obj))));
        obj1 = obj;
        obj = obj2;
_L4:
        j.a(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
        return ((JSONObject) (obj));
_L2:
        d.c();
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj = null;
_L8:
        obj1 = obj;
        d.c().b("Fabric", "Failed to fetch cached settings", ((Throwable) (obj2)));
        j.a(((java.io.Closeable) (obj)), "Error while closing settings cache file.");
        return null;
        Exception exception;
        exception;
        obj1 = obj2;
_L6:
        j.a(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(long l, JSONObject jsonobject)
    {
        Object obj;
        d.c();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = null;
        FileWriter filewriter;
        jsonobject.put("expires_at", l);
        filewriter = new FileWriter(new File((new a(a)).a(), "com.crashlytics.settings.json"));
        obj = filewriter;
        filewriter.write(jsonobject.toString());
        obj = filewriter;
        filewriter.flush();
        j.a(filewriter, "Failed to close settings writer.");
        return;
        Exception exception;
        exception;
        jsonobject = null;
_L4:
        obj = jsonobject;
        d.c().b("Fabric", "Failed to cache settings", exception);
        j.a(jsonobject, "Failed to close settings writer.");
        return;
        jsonobject;
_L2:
        j.a(((java.io.Closeable) (obj)), "Failed to close settings writer.");
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
