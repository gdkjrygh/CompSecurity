// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.c;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.d;
import com.roidapp.cloudlib.template.e;
import com.roidapp.cloudlib.template.f;
import com.roidapp.cloudlib.template.j;
import com.roidapp.cloudlib.template.m;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.template.b:
//            j, g, c, i, 
//            l

public final class h extends com.roidapp.cloudlib.template.b.j
{

    private WeakReference b;
    private WeakReference c;
    private Drawable d;
    private ProgressBar e;
    private TextView f;
    private HttpURLConnection g;
    private TemplateInfo h;
    private long i;

    public h(WeakReference weakreference, WeakReference weakreference1)
    {
        i = -1L;
        b = weakreference;
        c = weakreference1;
    }

    private static d a(InputStream inputstream, String s)
    {
        Object obj;
        (new File(s)).mkdirs();
        obj = new ZipInputStream(inputstream);
_L5:
        inputstream = ((InputStream) (obj));
        Object obj1 = ((ZipInputStream) (obj)).getNextEntry();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        inputstream = ((InputStream) (obj));
        String s1 = ((ZipEntry) (obj1)).getName();
        inputstream = ((InputStream) (obj));
        if (!((ZipEntry) (obj1)).isDirectory()) goto _L4; else goto _L3
_L3:
        inputstream = ((InputStream) (obj));
        (new File((new StringBuilder()).append(s).append(s1).toString())).mkdirs();
          goto _L5
        inputstream;
        s = ((String) (obj));
        obj = inputstream;
_L17:
        inputstream = s;
        ((Exception) (obj)).printStackTrace();
        byte abyte1[];
        int k;
        if (s != null)
        {
            try
            {
                s.closeEntry();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return null;
            }
        }
        return null;
_L4:
        inputstream = ((InputStream) (obj));
        obj1 = new FileOutputStream(new File((new StringBuilder()).append(s).append(s1).toString()));
        inputstream = ((InputStream) (obj));
        abyte1 = new byte[1024];
_L7:
        inputstream = ((InputStream) (obj));
        k = ((ZipInputStream) (obj)).read(abyte1);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        inputstream = ((InputStream) (obj));
        ((FileOutputStream) (obj1)).write(abyte1, 0, k);
        inputstream = ((InputStream) (obj));
        ((FileOutputStream) (obj1)).flush();
        if (true) goto _L7; else goto _L6
        obj;
        s = inputstream;
        inputstream = ((InputStream) (obj));
_L16:
        byte abyte0[];
        StringBuilder stringbuilder;
        int i1;
        if (s != null)
        {
            try
            {
                s.closeEntry();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw inputstream;
_L6:
        inputstream = ((InputStream) (obj));
        ((FileOutputStream) (obj1)).close();
          goto _L5
_L2:
        try
        {
            ((ZipInputStream) (obj)).closeEntry();
            ((ZipInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        obj = new BufferedInputStream(new FileInputStream((new StringBuilder()).append(s).append("/data").toString()));
        inputstream = ((InputStream) (obj));
        abyte0 = new byte[1024];
        inputstream = ((InputStream) (obj));
        stringbuilder = new StringBuilder();
_L9:
        inputstream = ((InputStream) (obj));
        i1 = ((BufferedInputStream) (obj)).read(abyte0);
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        inputstream = ((InputStream) (obj));
        stringbuilder.append(new String(abyte0, 0, i1));
        if (true) goto _L9; else goto _L8
        s;
_L15:
        inputstream = ((InputStream) (obj));
        s.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return null;
            }
            return null;
        }
        break MISSING_BLOCK_LABEL_107;
_L8:
        inputstream = ((InputStream) (obj));
        ((BufferedInputStream) (obj)).close();
        inputstream = ((InputStream) (obj));
        s = b(stringbuilder.toString(), s);
        try
        {
            ((BufferedInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return s;
        }
        return s;
        s;
        obj = null;
_L13:
        inputstream = ((InputStream) (obj));
        s.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_107;
        }
        s;
        inputstream = null;
_L11:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw s;
        s;
        if (true) goto _L11; else goto _L10
_L10:
        s;
        if (true) goto _L13; else goto _L12
_L12:
        s;
        obj = null;
        if (true) goto _L15; else goto _L14
_L14:
        inputstream;
        s = null;
          goto _L16
        obj;
        s = null;
          goto _L17
    }

    private static d a(String s, String s1)
    {
        Object obj1;
        (new File(s1)).mkdirs();
        obj1 = new ZipFile(s);
        Object obj = obj1;
        Enumeration enumeration = ((ZipFile) (obj1)).entries();
_L5:
        obj = obj1;
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        Object obj2 = (ZipEntry)enumeration.nextElement();
        obj = obj1;
        Object obj3 = ((ZipEntry) (obj2)).getName();
        obj = obj1;
        if (!((ZipEntry) (obj2)).isDirectory()) goto _L4; else goto _L3
_L3:
        obj = obj1;
        (new File((new StringBuilder()).append(s1).append(((String) (obj3))).toString())).mkdirs();
          goto _L5
        obj;
        s1 = ((String) (obj1));
        obj1 = obj;
_L17:
        obj = s1;
        com.roidapp.baselib.d.a.a(new File(s));
        obj = s1;
        ((Exception) (obj1)).printStackTrace();
        byte abyte0[];
        byte abyte1[];
        int k;
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
_L4:
        obj = obj1;
        obj3 = new FileOutputStream(new File((new StringBuilder()).append(s1).append(((String) (obj3))).toString()));
        obj = obj1;
        abyte1 = new byte[1024];
        obj = obj1;
        obj2 = ((ZipFile) (obj1)).getInputStream(((ZipEntry) (obj2)));
_L7:
        obj = obj1;
        k = ((InputStream) (obj2)).read(abyte1);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((FileOutputStream) (obj3)).write(abyte1, 0, k);
        obj = obj1;
        ((FileOutputStream) (obj3)).flush();
        if (true) goto _L7; else goto _L6
        s;
_L16:
        if (obj != null)
        {
            try
            {
                ((ZipFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
_L6:
        obj = obj1;
        ((FileOutputStream) (obj3)).close();
        obj = obj1;
        ((InputStream) (obj2)).close();
          goto _L5
_L2:
        try
        {
            ((ZipFile) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        obj1 = new BufferedInputStream(new FileInputStream((new StringBuilder()).append(s1).append("/data").toString()));
        obj = obj1;
        abyte0 = new byte[1024];
        obj = obj1;
        obj2 = new StringBuilder();
_L9:
        obj = obj1;
        k = ((BufferedInputStream) (obj1)).read(abyte0);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((StringBuilder) (obj2)).append(new String(abyte0, 0, k));
        if (true) goto _L9; else goto _L8
        s;
_L15:
        obj = obj1;
        s.printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((BufferedInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
_L8:
        obj = obj1;
        ((BufferedInputStream) (obj1)).close();
        obj = obj1;
        s1 = b(((StringBuilder) (obj2)).toString(), s1);
        try
        {
            ((BufferedInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s1;
        s1;
        obj1 = null;
_L13:
        obj = obj1;
        s1.printStackTrace();
        obj = obj1;
        com.roidapp.baselib.d.a.a(new File(s));
        if (obj1 != null)
        {
            try
            {
                ((BufferedInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        break MISSING_BLOCK_LABEL_378;
        s;
        obj = null;
_L11:
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        if (true) goto _L11; else goto _L10
_L10:
        s1;
        if (true) goto _L13; else goto _L12
_L12:
        s;
        obj1 = null;
        if (true) goto _L15; else goto _L14
_L14:
        s;
        obj = null;
          goto _L16
        obj1;
        s1 = null;
          goto _L17
    }

    private transient Object a(com.roidapp.cloudlib.template.b.l al1[])
    {
        Context context;
        com.roidapp.cloudlib.template.b.c c1;
        al1 = (g)al1[0];
        context = (Context)b.get();
        c1 = (com.roidapp.cloudlib.template.b.c)c.get();
        if (context != null && c1 != null && !c1.b() && al1 != null && ((g) (al1)).d != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        context;
        JVM INSTR monitorenter ;
        if (com.roidapp.cloudlib.common.c.a())
        {
            break MISSING_BLOCK_LABEL_82;
        }
        c1.sendEmptyMessage(4354);
        context;
        JVM INSTR monitorexit ;
        return null;
        al1;
        context;
        JVM INSTR monitorexit ;
        throw al1;
        if (b())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        c1.sendEmptyMessage(4353);
        context;
        JVM INSTR monitorexit ;
        return null;
        context;
        JVM INSTR monitorexit ;
        if (((g) (al1)).a)
        {
            al1 = ((g) (al1)).d;
            (new File((new StringBuilder()).append(a).append("/download/").append(com.roidapp.baselib.d.a.c(al1.g())).toString())).delete();
            a(((Handler) (c1)), 8995, al1);
            return null;
        }
        if (com.roidapp.baselib.d.a.b(new File(a)) >= 0xa00000L)
        {
            break; /* Loop/switch isn't completed */
        }
        a(((Handler) (c1)), 4352, null);
        if (((g) (al1)).c && !((g) (al1)).b)
        {
            h = ((g) (al1)).d;
            e = h.c();
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (((g) (al1)).c && !((g) (al1)).b)
        {
            a(context, ((Handler) (c1)), ((g) (al1)).d);
            return null;
        }
        if (!((g) (al1)).b) goto _L1; else goto _L4
_L4:
        TemplateInfo templateinfo;
        String s;
        String s1;
        String s2;
        long l1;
        templateinfo = ((g) (al1)).d;
        l1 = templateinfo.e();
        s1 = templateinfo.g();
        al1 = com.roidapp.baselib.d.a.c(s1);
        s2 = (new StringBuilder()).append(a).append("/download/").toString();
        s = (new StringBuilder()).append(a).append("/content/").toString();
        if (!com.roidapp.baselib.d.a.a((new StringBuilder()).append(s2).append(al1).toString(), false)) goto _L6; else goto _L5
_L5:
        Log.i("TemplateDownloadTask", (new StringBuilder("Zip file was existed! ")).append(s2).toString());
        al1 = a((new StringBuilder()).append(s2).append(al1).toString(), (new StringBuilder()).append(s).append(al1).append("/").toString());
_L7:
        if (al1 != null)
        {
            a(((Handler) (c1)), 8997, al1);
            return null;
        } else
        {
            a(((Handler) (c1)), 9000, ((Object) (new Object[] {
                context.getResources().getString(at.aW), templateinfo
            })));
            return null;
        }
_L6:
        if (!j.a(l1))
        {
            break MISSING_BLOCK_LABEL_513;
        }
        s1 = s1.substring(s1.lastIndexOf("/") + 1);
        al1 = a(al.g().c(context, s1), (new StringBuilder()).append(s).append(al1).append("/").toString());
          goto _L7
        al1;
        al1.printStackTrace();
        al1 = null;
          goto _L7
    }

    private void a(Context context, Handler handler, TemplateInfo templateinfo)
    {
        Object obj1;
        Object obj5;
        String s = templateinfo.g();
        obj5 = (new StringBuilder()).append(a).append("/download/").toString();
        obj1 = com.roidapp.baselib.d.a.c(s);
        h = templateinfo;
        e = templateinfo.c();
        i = templateinfo.e();
        if (e != null && e.getParent() != null)
        {
            f = (TextView)((RelativeLayout)e.getParent()).findViewById(ar.cC);
            d = e.getResources().getDrawable(aq.q);
            d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        }
        if (com.roidapp.baselib.d.a.a((new StringBuilder()).append(((String) (obj5))).append(((String) (obj1))).toString(), false))
        {
            a(handler, 8992, templateinfo);
        } else
        {
label0:
            {
                if (l.b(context))
                {
                    break label0;
                }
                a(handler, 9216, null);
            }
        }
_L5:
        publishProgress(new Integer[] {
            Integer.valueOf(100)
        });
        return;
        Object obj;
        byte abyte0[];
        Exception exception;
        Object obj2;
        Object obj3;
        Object obj4;
        File file;
        l.a();
        obj = null;
        obj3 = null;
        obj4 = null;
        exception = null;
        obj2 = null;
        file = new File((new StringBuilder()).append(((String) (obj5))).append(((String) (obj1))).toString());
        obj1 = obj4;
        abyte0 = ((byte []) (obj));
        obj5 = new File(((String) (obj5)));
        obj1 = obj4;
        abyte0 = ((byte []) (obj));
        if (((File) (obj5)).exists())
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj1 = obj4;
        abyte0 = ((byte []) (obj));
        ((File) (obj5)).mkdirs();
        obj1 = obj4;
        abyte0 = ((byte []) (obj));
        g = (HttpURLConnection)(new URL(templateinfo.g())).openConnection();
        obj1 = obj4;
        abyte0 = ((byte []) (obj));
        g.setConnectTimeout(60000);
        obj1 = obj4;
        abyte0 = ((byte []) (obj));
        g.setReadTimeout(60000);
        obj1 = obj4;
        abyte0 = ((byte []) (obj));
        g.setDoInput(true);
        obj1 = obj4;
        abyte0 = ((byte []) (obj));
        obj = new BufferedInputStream(g.getInputStream());
        obj1 = new BufferedOutputStream(new FileOutputStream(file));
        int k = 0;
        int i1;
        i1 = g.getContentLength();
        abyte0 = new byte[1024];
_L4:
        int j1 = ((BufferedInputStream) (obj)).read(abyte0);
        if (j1 == -1) goto _L2; else goto _L1
_L1:
        if (isCancelled()) goto _L2; else goto _L3
_L3:
        ((BufferedOutputStream) (obj1)).write(abyte0, 0, j1);
        k += j1;
        publishProgress(new Integer[] {
            Integer.valueOf((int)(((double)k / (double)i1) * 100D))
        });
          goto _L4
        exception;
        templateinfo = ((TemplateInfo) (obj));
        obj = obj1;
_L8:
        obj1 = obj;
        abyte0 = templateinfo;
        Log.e("TemplateDownloadTask", "Error in downloadTemplate - ");
        obj1 = obj;
        abyte0 = templateinfo;
        exception.printStackTrace();
        obj1 = obj;
        abyte0 = templateinfo;
        com.roidapp.baselib.d.a.a(file);
        obj1 = obj;
        abyte0 = templateinfo;
        if (isCancelled())
        {
            break MISSING_BLOCK_LABEL_600;
        }
        obj1 = obj;
        abyte0 = templateinfo;
        a(handler, 8993, context.getResources().getString(at.c));
        if (isCancelled())
        {
            com.roidapp.baselib.d.a.a(file);
        }
        if (g != null)
        {
            g.disconnect();
            g = null;
        }
        if (templateinfo != null)
        {
            try
            {
                templateinfo.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (obj != null)
        {
            try
            {
                ((BufferedOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
          goto _L5
_L2:
        ((BufferedOutputStream) (obj1)).flush();
        com.roidapp.baselib.c.b.f("Download/end", templateinfo.i());
        a(handler, 8992, templateinfo);
        if (isCancelled())
        {
            com.roidapp.baselib.d.a.a(file);
        }
        if (g != null)
        {
            g.disconnect();
            g = null;
        }
        try
        {
            ((BufferedInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            ((BufferedOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
          goto _L5
        context;
_L7:
        if (isCancelled())
        {
            com.roidapp.baselib.d.a.a(file);
        }
        if (g != null)
        {
            g.disconnect();
            g = null;
        }
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (Handler handler) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Handler handler) { }
        }
        throw context;
        context;
        obj1 = exception;
        abyte0 = ((byte []) (obj));
        continue; /* Loop/switch isn't completed */
        context;
        abyte0 = ((byte []) (obj));
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        obj = obj2;
        templateinfo = obj3;
          goto _L8
        exception;
        templateinfo = ((TemplateInfo) (obj));
        obj = obj2;
          goto _L8
    }

    public static boolean a(String s)
    {
        return com.roidapp.baselib.d.a.a((new StringBuilder()).append(a).append("/download/").append(com.roidapp.baselib.d.a.c(s)).toString(), false);
    }

    private static d b(String s, String s1)
    {
        Object obj3 = new JSONObject(s);
        String s2 = ((JSONObject) (obj3)).getString("templateName");
        s = null;
        int k = 0;
        if (!((JSONObject) (obj3)).isNull("background"))
        {
            JSONObject jsonobject = ((JSONObject) (obj3)).getJSONObject("background");
            s = (new StringBuilder()).append(s1).append(jsonobject.getString("name")).toString();
            k = jsonobject.getInt("repeat");
        }
        float f1;
        float f2;
        float f3;
        float f4;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        ArrayList arraylist4;
        ArrayList arraylist5;
        Object obj2;
        Object obj4;
        Object obj5;
        int i1;
        int j1;
        boolean flag;
        boolean flag1;
        if (!((JSONObject) (obj3)).isNull("toCameraPreview"))
        {
            flag = ((JSONObject) (obj3)).getBoolean("toCameraPreview");
        } else
        {
            flag = false;
        }
        f1 = (float)((JSONObject) (obj3)).getDouble("innerBorder");
        f2 = (float)((JSONObject) (obj3)).getDouble("outerBorder");
        f3 = (float)((JSONObject) (obj3)).getDouble("cornerRadius");
        f4 = (float)((JSONObject) (obj3)).getDouble("scale");
        flag1 = true;
        arraylist3 = null;
        arraylist2 = null;
        arraylist1 = null;
        arraylist = null;
        obj1 = null;
        arraylist4 = null;
        if (!((JSONObject) (obj3)).isNull("grid"))
        {
            obj = ((JSONObject) (obj3)).getJSONArray("grid");
        } else
        {
            obj = null;
        }
        if (obj == null || ((JSONArray) (obj)).length() == 0)
        {
            i1 = 15;
            obj = arraylist4;
            break MISSING_BLOCK_LABEL_210;
        }
        int k1 = ((JSONArray) (obj)).length();
        arraylist3 = new ArrayList(k1);
        arraylist2 = new ArrayList(k1);
        arraylist1 = new ArrayList(k1);
        arraylist = new ArrayList(k1);
        arraylist5 = new ArrayList(k1);
        arraylist4 = new ArrayList(k1);
        JSONObject jsonobject1;
        boolean flag2;
        for (i1 = 0; i1 < k1; i1++)
        {
            obj4 = ((JSONArray) (obj)).getJSONObject(i1);
            double d1;
            if (!((JSONObject) (obj4)).isNull("mask"))
            {
                obj1 = ((JSONObject) (obj4)).getString("mask");
                double d2;
                Object obj6;
                if (!((String) (obj1)).trim().equals(""))
                {
                    if ("null".equals(obj1))
                    {
                        arraylist3.add(obj1);
                    } else
                    {
                        arraylist3.add((new StringBuilder()).append(s1).append(((String) (obj1))).toString());
                    }
                }
            }
            d1 = ((JSONObject) (obj4)).optDouble("scale");
            if (Double.isNaN(d1))
            {
                obj1 = null;
            } else
            {
                obj1 = Float.valueOf((float)d1);
            }
            arraylist1.add(obj1);
            d1 = ((JSONObject) (obj4)).optDouble("rotate");
            if (Double.isNaN(d1))
            {
                obj1 = null;
            } else
            {
                obj1 = Float.valueOf((float)d1);
            }
            arraylist.add(obj1);
            obj2 = null;
            obj5 = ((JSONObject) (obj4)).optJSONArray("offset");
            obj1 = obj2;
            if (obj5 != null)
            {
                obj1 = obj2;
                if (((JSONArray) (obj5)).length() >= 2)
                {
                    d1 = ((JSONArray) (obj5)).optDouble(0);
                    d2 = ((JSONArray) (obj5)).optDouble(1);
                    obj1 = obj2;
                    if (!Double.isNaN(d1))
                    {
                        obj1 = obj2;
                        if (!Double.isNaN(d2))
                        {
                            obj1 = new f();
                            obj1.a = (float)d1;
                            obj1.b = (float)d2;
                        }
                    }
                }
            }
            arraylist5.add(obj1);
            obj1 = ((JSONObject) (obj4)).getJSONArray("points");
            obj2 = new ArrayList();
            for (j1 = 0; j1 < ((JSONArray) (obj1)).length(); j1++)
            {
                obj6 = ((JSONArray) (obj1)).getJSONArray(j1);
                obj5 = ((JSONArray) (obj6)).getString(0);
                obj6 = ((JSONArray) (obj6)).getString(1);
                ((List) (obj2)).add((new StringBuilder()).append(((String) (obj5))).append("#").append(((String) (obj6))).toString());
            }

            arraylist2.add(obj2);
            obj2 = null;
            obj1 = obj2;
            if (!((JSONObject) (obj4)).isNull("filter"))
            {
                obj4 = ((JSONObject) (obj4)).getJSONObject("filter");
                obj1 = obj2;
                if (obj4 != null)
                {
                    obj2 = new e();
                    if (!((JSONObject) (obj4)).isNull("filter_name"))
                    {
                        obj2.a = ((JSONObject) (obj4)).getString("filter_name");
                    }
                    if (!((JSONObject) (obj4)).isNull("acv"))
                    {
                        obj2.b = (new StringBuilder()).append(s1).append(((JSONObject) (obj4)).getString("acv")).toString();
                    }
                    if (!((JSONObject) (obj4)).isNull("material"))
                    {
                        obj2.c = (new StringBuilder()).append(s1).append(((JSONObject) (obj4)).getString("material")).toString();
                    }
                    obj1 = obj2;
                    if (!((JSONObject) (obj4)).isNull("screen"))
                    {
                        obj2.d = (new StringBuilder()).append(s1).append(((JSONObject) (obj4)).getString("screen")).toString();
                        obj1 = obj2;
                    }
                }
            }
            arraylist4.add(obj1);
        }

        obj = arraylist5;
        obj1 = arraylist4;
        flag1 = false;
        i1 = k1;
          goto _L1
_L3:
        arraylist5 = null;
        arraylist4 = null;
        if (!((JSONObject) (obj3)).isNull("sticker"))
        {
            obj2 = ((JSONObject) (obj3)).getJSONArray("sticker");
            arraylist5 = new ArrayList();
            arraylist4 = new ArrayList();
            for (j1 = 0; j1 < ((JSONArray) (obj2)).length(); j1++)
            {
                obj5 = ((JSONArray) (obj2)).getJSONObject(j1);
                arraylist5.add((new StringBuilder()).append(s1).append(((JSONObject) (obj5)).getString("name")).toString());
                obj4 = new HashMap();
                obj5 = ((JSONObject) (obj5)).getJSONObject("position");
                ((Map) (obj4)).put("x", Float.valueOf((float)((JSONObject) (obj5)).getDouble("x")));
                ((Map) (obj4)).put("y", Float.valueOf((float)((JSONObject) (obj5)).getDouble("y")));
                ((Map) (obj4)).put("scale", Float.valueOf((float)((JSONObject) (obj5)).getDouble("scale")));
                ((Map) (obj4)).put("angle", Float.valueOf((float)((JSONObject) (obj5)).getDouble("angle")));
                arraylist4.add(obj4);
            }

        }
        obj2 = null;
        if (!((JSONObject) (obj3)).isNull("text"))
        {
            obj3 = ((JSONObject) (obj3)).getJSONArray("text");
            obj2 = new ArrayList();
            k1 = ((JSONArray) (obj3)).length();
            j1 = 0;
            while (j1 < k1) 
            {
                obj4 = new m();
                obj5 = ((JSONArray) (obj3)).getJSONObject(j1);
                obj4.a = ((JSONObject) (obj5)).getString("content");
                obj4.f = ((JSONObject) (obj5)).getInt("fontIndex");
                obj4.g = Color.parseColor(((JSONObject) (obj5)).getString("textColor"));
                if (((JSONObject) (obj5)).getString("strokeColor").equals(""))
                {
                    obj4.h = -21;
                } else
                {
                    obj4.h = Color.parseColor(((JSONObject) (obj5)).getString("strokeColor"));
                }
                obj4.i = (float)((JSONObject) (obj5)).getDouble("strokeScale");
                obj4.j = ((JSONObject) (obj5)).getInt("textSize");
                obj4.k = ((JSONObject) (obj5)).getInt("alpha");
                obj4.o = ((JSONObject) (obj5)).getInt("alignType");
                obj4.p = ((JSONObject) (obj5)).getInt("fixedWidth");
                jsonobject1 = ((JSONObject) (obj5)).getJSONObject("position");
                if (jsonobject1.has("left"))
                {
                    if (jsonobject1.getInt("left") == 1)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    obj4.v = flag2;
                } else
                {
                    obj4.v = false;
                }
                obj4.b = (float)jsonobject1.getDouble("x");
                obj4.c = (float)jsonobject1.getDouble("y");
                obj4.d = (float)jsonobject1.getDouble("scale");
                obj4.e = (float)jsonobject1.getDouble("angle");
                jsonobject1 = ((JSONObject) (obj5)).getJSONObject("background");
                if (!jsonobject1.getString("bgName").equals(""))
                {
                    obj4.l = (new StringBuilder()).append(s1).append(jsonobject1.getString("bgName")).toString();
                } else
                {
                    obj4.l = "";
                }
                if (jsonobject1.getString("bgRepeat").equals(""))
                {
                    obj4.m = 0;
                } else
                {
                    obj4.m = jsonobject1.getInt("bgRepeat");
                }
                if (jsonobject1.getString("bgColor").equals(""))
                {
                    obj4.n = 1;
                } else
                {
                    obj4.n = Color.parseColor(jsonobject1.getString("bgColor"));
                }
                obj5 = ((JSONObject) (obj5)).getJSONObject("shadow");
                if (((JSONObject) (obj5)).getInt("sdShow") == 1)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                obj4.u = flag2;
                if (flag2)
                {
                    obj4.q = (float)((JSONObject) (obj5)).getDouble("sdRadius");
                    obj4.r = (float)((JSONObject) (obj5)).getDouble("sdDx");
                    obj4.s = (float)((JSONObject) (obj5)).getDouble("sdDy");
                    obj5 = ((JSONObject) (obj5)).getString("sdColor");
                    if (((String) (obj5)).equals(""))
                    {
                        obj4.t = 0xff000000;
                    } else
                    {
                        obj4.t = Color.parseColor(((String) (obj5)));
                    }
                }
                ((List) (obj2)).add(obj4);
                j1++;
            }
        }
        s1 = new d();
        s1.a = s2;
        s1.b = s;
        if (k == 0)
        {
            flag2 = false;
        } else
        {
            flag2 = true;
        }
        s1.e = flag2;
        s1.h = f1;
        s1.i = f2;
        s1.j = f3;
        if (f4 <= 0.0F)
        {
            flag2 = false;
        } else
        {
            flag2 = true;
        }
        s1.f = flag2;
        s1.g = flag1;
        s1.k = Math.abs(f4);
        s1.d = flag;
        s1.c = i1;
        s1.l = arraylist2;
        s1.m = arraylist3;
        s1.n = arraylist5;
        s1.o = arraylist4;
        s1.p = ((List) (obj2));
        s1.s = ((List) (obj));
        s1.r = arraylist;
        s1.q = arraylist1;
        s1.t = ((List) (obj1));
        return s1;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    final void a()
    {
        if (!isCancelled())
        {
            cancel(true);
        }
        if (g != null)
        {
            (new i(this, new WeakReference(g))).start();
        }
    }

    final void a(com.roidapp.cloudlib.template.b.l l1)
    {
label0:
        {
            if (l1 instanceof g)
            {
                if (!((g)l1).c)
                {
                    break label0;
                }
                executeOnExecutor(com.roidapp.baselib.c.c.SINGLE_EXECUTOR, new com.roidapp.cloudlib.template.b.l[] {
                    l1
                });
            }
            return;
        }
        executeOnExecutor(com.roidapp.baselib.c.c.THREAD_POOL_EXECUTOR, new com.roidapp.cloudlib.template.b.l[] {
            l1
        });
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((com.roidapp.cloudlib.template.b.l[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        cancel(true);
        if (h != null)
        {
            h.a(100);
            h = null;
        }
        if (e != null)
        {
            if (e.isShown() && e.getParent() != null)
            {
                ((RelativeLayout)e.getParent()).setVisibility(8);
            }
            e = null;
            f = null;
            d = null;
        }
    }

    protected final void onProgressUpdate(Object aobj[])
    {
label0:
        {
            int k = 1;
            aobj = (Integer[])aobj;
            if (h != null)
            {
                TemplateInfo templateinfo = h;
                if (((Integer) (aobj[0])).intValue() > 1)
                {
                    k = ((Integer) (aobj[0])).intValue();
                }
                templateinfo.a(k);
                if (h.a())
                {
                    e = h.c();
                    h.b();
                    if (e != null && e.getParent() != null)
                    {
                        f = (TextView)((RelativeLayout)e.getParent()).findViewById(ar.cC);
                        if (f != null)
                        {
                            f.setCompoundDrawables(d, null, null, null);
                        }
                    }
                }
                if (e != null && i == ((Long)e.getTag()).longValue())
                {
                    if (((Integer) (aobj[0])).intValue() >= 100)
                    {
                        break label0;
                    }
                    int i1 = ((Integer) (aobj[0])).intValue();
                    e.setProgress(i1);
                    if (f != null)
                    {
                        f.setText((new StringBuilder()).append(i1).append("%").toString());
                    }
                }
            }
            return;
        }
        h.a(100);
        ((RelativeLayout)e.getParent()).setVisibility(8);
    }
}
