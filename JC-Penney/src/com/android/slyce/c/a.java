// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.c;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.b.a.n;
import com.android.b.a.o;
import com.android.b.a.r;
import com.android.b.f;
import com.android.b.q;
import com.android.b.t;
import com.android.b.w;
import com.android.b.x;
import com.android.slyce.k.h;
import com.android.slyce.k.i;
import com.moodstocks.android.MoodstocksError;
import com.moodstocks.android.Result;
import com.moodstocks.android.Scanner;
import com.moodstocks.android.advanced.ApiSearcher;
import com.moodstocks.android.advanced.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.c:
//            h, f, c, e, 
//            d, b, g

public class a
{

    public static a a;
    private static final String b = com/android/slyce/c/a.getSimpleName();
    private static Context d;
    private t c;

    private a(Context context)
    {
        d = context;
        c = c();
    }

    public static a a(Context context)
    {
        com/android/slyce/c/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new a(context);
        }
        context = a;
        com/android/slyce/c/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static String a()
    {
        return b;
    }

    static JSONObject a(a a1, String s)
    {
        return a1.a(s);
    }

    private JSONObject a(String s)
    {
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            h.b(b, "JSONException");
            return null;
        }
        return s;
    }

    private void a(q q1)
    {
        q1.a(false);
        q1.a(new f(15000, 0, 1.0F));
        c().a(q1);
    }

    static void a(a a1, String s, Bitmap bitmap, com.android.slyce.c.h h1)
    {
        a1.a(s, bitmap, h1);
    }

    static void a(a a1, JSONObject jsonobject, com.android.slyce.c.f f1)
    {
        a1.a(jsonobject, f1);
    }

    private void a(String s, Bitmap bitmap, com.android.slyce.c.h h1)
    {
        Object obj;
        byte abyte0[];
        int j;
        int k;
        try
        {
            obj = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, ((java.io.OutputStream) (obj)));
            bitmap = new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray());
            s = (HttpURLConnection)(new URL(s)).openConnection();
            s.setDoInput(true);
            s.setDoOutput(true);
            s.setUseCaches(false);
            s.setRequestMethod("POST");
            s.setRequestProperty("Connection", "Keep-Alive");
            s.setRequestProperty("Content-Type", (new StringBuilder()).append("multipart/form-data;boundary=").append("*****").toString());
            obj = new DataOutputStream(s.getOutputStream());
            ((DataOutputStream) (obj)).writeBytes((new StringBuilder()).append("--").append("*****").append("\r\n").toString());
            ((DataOutputStream) (obj)).writeBytes((new StringBuilder()).append("Content-Type: image/jpeg").append("\r\n").toString());
            ((DataOutputStream) (obj)).writeBytes((new StringBuilder()).append("Content-Disposition: form-data; name=\"img\";filename=\"image.png\"").append("\r\n").toString());
            ((DataOutputStream) (obj)).writeBytes("\r\n");
            j = Math.min(bitmap.available(), 0x100000);
            abyte0 = new byte[j];
            k = bitmap.read(abyte0, 0, j);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            h.b(b, "Upload Image Exception");
            return;
        }
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        ((DataOutputStream) (obj)).write(abyte0, 0, j);
        j = Math.min(bitmap.available(), 0x100000);
        k = bitmap.read(abyte0, 0, j);
        break MISSING_BLOCK_LABEL_232;
        ((DataOutputStream) (obj)).writeBytes("\r\n");
        ((DataOutputStream) (obj)).writeBytes((new StringBuilder()).append("--").append("*****").append("--").append("\r\n").toString());
        j = s.getResponseCode();
        s.getResponseMessage();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        h1.a(i.a(s));
        bitmap.close();
        ((DataOutputStream) (obj)).flush();
        ((DataOutputStream) (obj)).close();
        return;
    }

    private void a(String s, String s1, com.android.slyce.c.f f1)
    {
        f1.a(s, s1);
    }

    private void a(JSONObject jsonobject, com.android.slyce.c.f f1)
    {
        String s1 = "";
        String s = "";
        if (jsonobject != null)
        {
            s = jsonobject.optString("error");
            s1 = jsonobject.optString("id");
        }
        f1.a(s1, s);
    }

    static Context b()
    {
        return d;
    }

    private t c()
    {
        if (c == null)
        {
            c = r.a(d.getApplicationContext());
        }
        return c;
    }

    public void a(Context context, String s, com.android.slyce.c.f f1)
    {
        (new Thread(new c(this, context, s, f1))).start();
    }

    public void a(Bitmap bitmap, com.android.slyce.c.f f1)
    {
        Object obj;
        Result result;
        try
        {
            obj = Scanner.get();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            h.b(b, "Error at Scanner.get()");
            return;
        }
        bitmap = new Image(bitmap);
        result = ((Scanner) (obj)).search(bitmap, 0, 0);
        if (result == null) goto _L2; else goto _L1
_L1:
        h.c(b, (new StringBuilder()).append("[2D Local search] Result found: ").append(result.getValue()).toString());
        a(result.getValue(), "", f1);
_L4:
        return;
        bitmap;
_L6:
        h.a(b, "Fail to create Image object");
        return;
_L2:
        try
        {
            h.c(b, "[2D Local search] No result found");
        }
        catch (MoodstocksError moodstockserror)
        {
            h.a(b, "Failed on 2D local search");
        }
        obj = (new ApiSearcher(((Scanner) (obj)))).search(bitmap);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        try
        {
            h.c(b, (new StringBuilder()).append("[2D Server-side search] Result found: ").append(((Result) (obj)).getValue()).toString());
            a(((Result) (obj)).getValue(), "", f1);
        }
        // Misplaced declaration of an exception variable
        catch (com.android.slyce.c.f f1)
        {
            h.a(b, "Failed on 2D server search");
        }
_L5:
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        bitmap.release();
        return;
        h.c(b, "[2D Server-side search] No result found");
        a(((String) (null)), "No image found", f1);
          goto _L5
          goto _L4
        bitmap;
          goto _L6
    }

    public void a(Bitmap bitmap, com.android.slyce.c.h h1)
    {
        (new Thread(new e(this, bitmap, h1))).start();
    }

    public void a(String s, x x, w w)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("http://api.pounce.mobi/v2/").append("users/sdk?").append("cid").append("=").append(s);
        s = new o(stringbuilder.toString(), null, x, w);
        c().a(s);
    }

    public void a(String s, com.android.slyce.h.a a1, g g)
    {
        (new Thread(new d(this, s, a1, g))).start();
    }

    public void a(String s, String s1, x x)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("http://api.pounce.mobi/v2/").append("mapper/").append(s1).append("/upc/").append(s);
        a(((q) (new o(stringbuilder.toString(), x, new b(this, stringbuilder)))));
    }

    public void b(String s, x x, w w)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("http://api.pounce.mobi/v2/").append("products/").append(s);
        a(new n(stringbuilder.toString(), x, w));
    }

}
