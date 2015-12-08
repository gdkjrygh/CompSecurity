// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputtools;

import android.content.Context;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package com.google.android.apps.translate.inputtools:
//            b, e, InputToolsInput

final class c extends k
{

    final String a;
    final InputToolsInput b;
    final Runnable c;

    c(String s, InputToolsInput inputtoolsinput, Runnable runnable)
    {
        a = s;
        b = inputtoolsinput;
        c = runnable;
        super();
    }

    private transient e a()
    {
        File file;
        String s = (String)com.google.android.apps.translate.inputtools.b.a().get(a);
        file = new File(Singleton.a().getCacheDir(), "inputtools");
        file.mkdirs();
        file = new File(file, s);
        d.a((new StringBuilder(String.valueOf(s).length() + 47)).append("https://ssl.gstatic.com/inputtools/js/kbd/1/").append(s).append(".js").toString(), file, com.google.android.apps.translate.inputtools.b.b());
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_110;
        }
        e e1 = com.google.android.apps.translate.inputtools.b.a(new FileInputStream(file));
        return e1;
        Object obj;
        obj;
_L2:
        return null;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (e)obj;
        if (obj != null)
        {
            com.google.android.apps.translate.inputtools.b.c().put(a, obj);
            b.b = (e)com.google.android.apps.translate.inputtools.b.c().get(a);
            c.run();
        }
    }
}
