// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Set;

final class btn extends AsyncTask
{

    private btl a;

    btn(btl btl1)
    {
        a = btl1;
        super();
    }

    private transient Exception a(btp abtp[])
    {
        String s;
        abtp = abtp[0];
        s = ((btp) (abtp)).a;
        if (isCancelled())
        {
            return null;
        }
        Object obj = new File(btl.c(a), ((btp) (abtp)).b);
        if (((File) (obj)).length() != 0L) goto _L2; else goto _L1
_L1:
        String s1;
        btl.b();
        s1 = String.valueOf(abtp.name());
        if (s1.length() == 0) goto _L4; else goto _L3
_L3:
        "Downloading: ".concat(s1);
_L8:
        String s2 = btl.a(a, ((btp) (abtp)).a);
        c.a(btl.d(a), "httpFetcher", null);
        btl.d(a).a(s2, ((File) (obj)));
        c.a(((File) (obj)).exists(), "file should exist");
        if (((File) (obj)).length() != 0L) goto _L2; else goto _L5
_L5:
        ((File) (obj)).delete();
        abtp = String.valueOf(((File) (obj)).getAbsolutePath());
        if (abtp.length() == 0) goto _L7; else goto _L6
_L6:
        abtp = "Downloaded file had length 0.".concat(abtp);
_L9:
        IOException ioexception;
        throw new IOException(abtp);
_L4:
        try
        {
            new String("Downloading: ");
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            abtp = btl.b();
            ioexception = String.valueOf(ioexception);
            Log.w(abtp, (new StringBuilder(String.valueOf(ioexception).length() + 30 + String.valueOf(s).length())).append(ioexception).append(" :Failed downloading UI asset ").append(s).toString());
            return null;
        }
          goto _L8
_L7:
        abtp = new String("Downloaded file had length 0.");
          goto _L9
_L2:
        synchronized (btl.e(a))
        {
            btl.b(a).add(abtp);
        }
        return null;
          goto _L8
        abtp;
        obj1;
        JVM INSTR monitorexit ;
        throw abtp;
          goto _L8
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((btp[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Exception)obj;
        a.c();
        if (obj != null)
        {
            Log.e(btl.b(), String.valueOf(((Exception) (obj)).toString()).concat(" happened when downloading UI assets. "));
        }
        btl.a(a, btl.a(a) - 1);
        if (btl.a(a) == 0)
        {
            btl.b();
            obj = String.valueOf(btl.b(a).toString());
            int i;
            if (((String) (obj)).length() != 0)
            {
                "UI assets in Cache: ".concat(((String) (obj)));
            } else
            {
                new String("UI assets in Cache: ");
            }
            btl.b();
            i = btl.b(a).size();
            (new StringBuilder(37)).append("Total UI assets in Cache: ").append(i);
            a.c.a(new bxg[] {
                bxg.r
            });
        }
    }
}
