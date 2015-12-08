// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import com.roidapp.baselib.c.c;
import com.roidapp.baselib.d.a;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.template.d;
import com.roidapp.cloudlib.template.e;
import com.roidapp.cloudlib.template.f;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.release:
//            lo

public final class lm extends c
{

    private Context a;
    private lo b;
    private int c;

    public lm(Context context, lo lo1, int i)
    {
        a = context;
        b = lo1;
        c = i;
    }

    private static d a(Context context, int i, String s)
    {
        String s1 = com.roidapp.baselib.d.a.c(s);
        String s2 = (new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append("/.Template/content/").toString();
        try
        {
            String s3 = s.substring(0, s.indexOf("/"));
            s = s.substring(s.indexOf("/") + 1);
            if ("shape".equals(s3))
            {
                return a(al.g().a(context, s, i), (new StringBuilder()).append(s2).append(s1).append("/").toString());
            }
            "basic".equals(s3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return null;
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
        int i;
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
        i = ((ZipInputStream) (obj)).read(abyte1);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        inputstream = ((InputStream) (obj));
        ((FileOutputStream) (obj1)).write(abyte1, 0, i);
        inputstream = ((InputStream) (obj));
        ((FileOutputStream) (obj1)).flush();
        if (true) goto _L7; else goto _L6
        obj;
        s = inputstream;
        inputstream = ((InputStream) (obj));
_L16:
        byte abyte0[];
        StringBuilder stringbuilder;
        int j;
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
        j = ((BufferedInputStream) (obj)).read(abyte0);
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        inputstream = ((InputStream) (obj));
        stringbuilder.append(new String(abyte0, 0, j));
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
        s = a(stringbuilder.toString(), s);
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
        s = new JSONObject(s);
        String s2 = s.getString("templateName");
        float f1 = (float)s.getDouble("innerBorder");
        float f2 = (float)s.getDouble("outerBorder");
        float f3 = (float)s.getDouble("cornerRadius");
        float f4 = (float)s.getDouble("scale");
        Object obj3 = null;
        Object obj2 = null;
        Object obj1 = null;
        Object obj = null;
        Object obj4 = null;
        d d3 = null;
        int i;
        if (!s.isNull("grid"))
        {
            s = s.getJSONArray("grid");
        } else
        {
            s = null;
        }
        if (s == null || s.length() == 0)
        {
            i = 9;
            s1 = obj4;
            s = d3;
        } else
        {
            int k = s.length();
            obj3 = new ArrayList(k);
            obj2 = new ArrayList(k);
            obj1 = new ArrayList(k);
            ArrayList arraylist = new ArrayList(k);
            ArrayList arraylist2 = new ArrayList(k);
            ArrayList arraylist1 = new ArrayList(k);
            for (i = 0; i < k; i++)
            {
                JSONObject jsonobject = s.getJSONObject(i);
                double d1;
                ArrayList arraylist3;
                if (!jsonobject.isNull("mask"))
                {
                    obj = jsonobject.getString("mask");
                    double d2;
                    Object obj5;
                    Object obj6;
                    int j;
                    if (!((String) (obj)).trim().equals(""))
                    {
                        if ("null".equals(obj))
                        {
                            ((List) (obj3)).add(obj);
                        } else
                        {
                            ((List) (obj3)).add((new StringBuilder()).append(s1).append(((String) (obj))).toString());
                        }
                    }
                }
                d1 = jsonobject.optDouble("scale");
                if (Double.isNaN(d1))
                {
                    obj = null;
                } else
                {
                    obj = Float.valueOf((float)d1);
                }
                ((List) (obj1)).add(obj);
                d1 = jsonobject.optDouble("rotate");
                if (Double.isNaN(d1))
                {
                    obj = null;
                } else
                {
                    obj = Float.valueOf((float)d1);
                }
                arraylist.add(obj);
                arraylist3 = null;
                obj5 = jsonobject.optJSONArray("offset");
                obj = arraylist3;
                if (obj5 != null)
                {
                    obj = arraylist3;
                    if (((JSONArray) (obj5)).length() >= 2)
                    {
                        d1 = ((JSONArray) (obj5)).optDouble(0);
                        d2 = ((JSONArray) (obj5)).optDouble(1);
                        obj = arraylist3;
                        if (!Double.isNaN(d1))
                        {
                            obj = arraylist3;
                            if (!Double.isNaN(d2))
                            {
                                obj = new f();
                                obj.a = (float)d1;
                                obj.b = (float)d2;
                            }
                        }
                    }
                }
                arraylist2.add(obj);
                obj = jsonobject.getJSONArray("points");
                arraylist3 = new ArrayList();
                for (j = 0; j < ((JSONArray) (obj)).length(); j++)
                {
                    obj6 = ((JSONArray) (obj)).getJSONArray(j);
                    obj5 = ((JSONArray) (obj6)).getString(0);
                    obj6 = ((JSONArray) (obj6)).getString(1);
                    arraylist3.add((new StringBuilder()).append(((String) (obj5))).append("#").append(((String) (obj6))).toString());
                }

                ((List) (obj2)).add(arraylist3);
                arraylist3 = null;
                obj = arraylist3;
                if (!jsonobject.isNull("filter"))
                {
                    jsonobject = jsonobject.getJSONObject("filter");
                    obj = arraylist3;
                    if (jsonobject != null)
                    {
                        e e1 = new e();
                        if (!jsonobject.isNull("filter_name"))
                        {
                            e1.a = jsonobject.getString("filter_name");
                        }
                        if (!jsonobject.isNull("acv"))
                        {
                            e1.b = (new StringBuilder()).append(s1).append(jsonobject.getString("acv")).toString();
                        }
                        if (!jsonobject.isNull("material"))
                        {
                            e1.c = (new StringBuilder()).append(s1).append(jsonobject.getString("material")).toString();
                        }
                        obj = e1;
                        if (!jsonobject.isNull("screen"))
                        {
                            e1.d = (new StringBuilder()).append(s1).append(jsonobject.getString("screen")).toString();
                            obj = e1;
                        }
                    }
                }
                arraylist1.add(obj);
            }

            s = arraylist2;
            s1 = arraylist1;
            obj = arraylist;
            i = k;
        }
        d3 = new d();
        d3.a = s2;
        d3.l = ((List) (obj2));
        d3.m = ((List) (obj3));
        d3.c = i;
        d3.s = s;
        d3.r = ((List) (obj));
        d3.q = ((List) (obj1));
        d3.t = s1;
        d3.k = Math.abs(f4);
        d3.h = f1;
        d3.i = f2;
        d3.j = f3;
        return d3;
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (String[])aobj;
        return a(a, c, ((String) (aobj[0])));
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (d)obj;
        super.onPostExecute(obj);
        if (obj != null)
        {
            b.a(((d) (obj)));
            return;
        } else
        {
            b.b();
            return;
        }
    }
}
