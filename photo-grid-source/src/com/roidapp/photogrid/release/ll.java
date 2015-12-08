// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.util.SparseArray;
import com.roidapp.baselib.c.c;
import com.roidapp.cloudlib.al;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.release:
//            ln, lo

public final class ll extends c
{

    private Context a;
    private lo b;

    public ll(Context context, lo lo1)
    {
        a = context;
        b = lo1;
    }

    private static SparseArray a(String s)
    {
        SparseArray sparsearray = new SparseArray();
        JSONArray jsonarray = (new JSONObject(s)).getJSONArray("data");
        int i = 0;
_L2:
        s = sparsearray;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s = jsonarray.getJSONObject(i);
        sparsearray.put(s.optInt("id"), s.optString("templateName"));
        i++;
        if (true) goto _L2; else goto _L1
        s;
        s.printStackTrace();
        s = null;
_L1:
        return s;
    }

    private static String a(Context context, int i)
    {
        Object obj1 = new StringBuilder();
        Object obj = new BufferedReader(new InputStreamReader(al.g().a(context, i)));
_L2:
        context = ((Context) (obj));
        String s = ((BufferedReader) (obj)).readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj));
        ((StringBuilder) (obj1)).append(s);
        if (true) goto _L2; else goto _L1
        obj1;
_L6:
        context = ((Context) (obj));
        ((IOException) (obj1)).printStackTrace();
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
        }
        return null;
_L1:
        context = ((Context) (obj));
        obj1 = ((StringBuilder) (obj1)).toString();
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((String) (obj1));
        }
        return ((String) (obj1));
        obj;
        context = null;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (Integer[])aobj;
        return a(a(a, ((Integer) (aobj[0])).intValue()));
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (SparseArray)obj;
        super.onPostExecute(obj);
        if (obj != null)
        {
            ln.a().a(((SparseArray) (obj)));
            b.d();
            return;
        } else
        {
            b.e();
            return;
        }
    }
}
