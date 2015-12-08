// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.Collections;

final class fep
{

    final fem a;
    final fek b;
    final Looper c;
    final Handler d;
    private final File e;

    fep(fem fem1, File file, fek fek, Looper looper)
    {
        a = fem1;
        b = fek;
        e = file;
        c = looper;
        d = new Handler(looper, new fer(this));
    }

    void a()
    {
        File afile[] = e.listFiles(new feq(this));
        if (afile == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = afile.length;
        i = 0;
_L3:
        String s;
        Object obj;
        fem fem1;
        Object obj1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = afile[i];
        fem1 = a;
        obj = ((File) (obj1)).getName();
        s = ((String) (obj));
        if (((String) (obj)).endsWith(".tmp"))
        {
            s = ((String) (obj)).substring(0, ((String) (obj)).length() - 4);
        }
        obj = fem1.g.a(s);
        ((fed) (obj)).b();
        if (!((File) (obj1)).delete() && fem.b)
        {
            obj1 = String.valueOf(obj1);
            Log.w("DiskCache", (new StringBuilder(String.valueOf(obj1).length() + 37)).append("Failed to cleanup in progress write: ").append(((String) (obj1))).toString());
        }
        fem1.a(Collections.singletonList(s));
        ((fed) (obj)).c();
        i++;
        if (true) goto _L3; else goto _L2
        Exception exception;
        exception;
        ((fed) (obj)).c();
        throw exception;
_L2:
    }
}
