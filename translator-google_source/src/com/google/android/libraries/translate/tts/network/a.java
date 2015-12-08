// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.d.f;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.google.android.libraries.translate.tts.network:
//            j, b

public final class a
{

    final j a;
    File b;
    private final Context c;
    private f d;

    public a(Context context)
    {
        c = context;
        a = new j(c);
    }

    private void b()
    {
        File afile[];
        int i;
        int k;
        b = new File(c.getCacheDir(), "ttsCache");
        b.mkdirs();
        d = new com.google.android.libraries.translate.tts.network.b(this);
        afile = b.listFiles();
        k = afile.length;
        i = 0;
_L10:
        if (i >= k) goto _L2; else goto _L1
_L1:
        File file = afile[i];
        if (!file.isFile()) goto _L4; else goto _L3
_L3:
        String s;
        boolean flag;
        Object obj = a;
        String s1 = file.getName();
        SharedPreferences sharedpreferences = ((j) (obj)).a;
        s = String.valueOf("text_");
        String s3 = String.valueOf(s1);
        if (s3.length() != 0)
        {
            s = s.concat(s3);
        } else
        {
            s = new String(s);
        }
        s = sharedpreferences.getString(s, null);
        if (s == null) goto _L6; else goto _L5
_L5:
        obj = ((j) (obj)).a;
        String s2 = String.valueOf("name_");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s2.concat(s);
        } else
        {
            s = new String(s2);
        }
        if (!s1.equals(((SharedPreferences) (obj)).getString(s, null))) goto _L6; else goto _L7
_L7:
        flag = true;
_L8:
        if (flag)
        {
            d.a(file.getName(), file);
        }
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L6:
        flag = false;
        if (true) goto _L8; else goto _L2
_L2:
        a.a(d.a().keySet());
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final File a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (d == null)
        {
            b();
        }
        obj = a.a("s2s_unknownlang:unknowntext");
        obj = (File)d.a(obj);
        this;
        JVM INSTR monitorexit ;
        return ((File) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public final File a(String s, Language language)
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            b();
        }
        j j1 = a;
        language = language.getShortName();
        s = j1.a((new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(s).length())).append(language).append(":").append(s).toString());
        s = (File)d.a(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        s.getAbsolutePath();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final File a(String s, Language language, String s1, int i, int k)
    {
        File file = a(s, language);
        Object obj;
        int l;
        if (file.exists() && file.length() > 0L)
        {
            obj = Event.TTS_CACHE;
        } else
        {
            long l1 = System.currentTimeMillis();
            obj = language.getShortName();
            Object obj1 = new android.net.Uri.Builder();
            android.net.Uri.Builder builder = ((android.net.Uri.Builder) (obj1)).scheme("https").authority(com.google.android.libraries.translate.core.b.e(Singleton.a())).path("/translate_tts").encodedQuery("ie=utf-8").appendQueryParameter("client", Singleton.c()).appendQueryParameter("iid", o.b()).appendQueryParameter("q", s).appendQueryParameter("tl", ((String) (obj))).appendQueryParameter("total", Integer.toString(i)).appendQueryParameter("idx", Integer.toString(k));
            if (s == null)
            {
                obj = "0";
            } else
            {
                obj = Integer.toString(s.length());
            }
            builder.appendQueryParameter("textlen", ((String) (obj))).appendQueryParameter("prev", s1);
            obj = ((android.net.Uri.Builder) (obj1)).build().toString();
            try
            {
                obj = com.google.android.libraries.translate.e.d.b().execute(new HttpGet(((String) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new LongTextNetworkTts.TtsDownloadException(s);
            }
            b.mkdirs();
            obj1 = new FileOutputStream(file, false);
            com.google.android.libraries.translate.e.d.a(com.google.android.libraries.translate.e.d.a(((org.apache.http.HttpResponse) (obj))), ((java.io.OutputStream) (obj1)));
            Singleton.b().a(Event.TWS_TTS_DOWNLOAD, l1, language.getShortName(), null, null, s.length());
            obj = Event.TTS_TWS;
        }
        Singleton.b().b(s1);
        s1 = Singleton.b();
        language = language.getShortName();
        if (s == null)
        {
            l = 0;
        } else
        {
            l = s.length();
        }
        s1.a(((Event) (obj)), language, null, l, (new LogParams()).addParam("total", Integer.toString(i)).addParam("idx", Integer.toString(k)));
        return file;
    }
}
