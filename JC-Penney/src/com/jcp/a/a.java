// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.a;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.jcp.b.b;
import com.jcp.e.d;
import com.jcp.e.r;
import com.jcp.helper.u;
import com.jcp.helper.v;
import com.jcp.pojo.LocalAdProduct;
import com.jcp.productlistentity.ProductListProductEntity;
import com.jcp.util.aa;
import com.jcp.util.ae;
import com.jcp.util.ai;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.a:
//            b

public class a extends AsyncTask
{

    private static final String a = com/jcp/a/a.getSimpleName();
    private final Context b;
    private boolean c;
    private List d;
    private int e;
    private d f;
    private Map g;
    private r h;

    public a(Context context)
    {
        g = new HashMap();
        b = context;
    }

    private int a(int i, LocalAdProduct localadproduct)
    {
        String s1 = localadproduct.getFlyerId();
        String s = (new StringBuilder("fly")).append(s1).append(i).toString();
        String s2 = localadproduct.getCategory().trim();
        long l = (new v()).a(s1, s, s2);
        ae.d(a, (new StringBuilder()).append("Record Inserted Status :").append(l).toString());
        if (-1L != l)
        {
            g.put(s2, s);
            i++;
        } else
        {
            s = (String)g.get(s2);
        }
        ae.c(a, (new StringBuilder()).append("Category :").append(localadproduct.getCategory()).append(" CAT-ID :").append(s).append("").toString());
        localadproduct.setCategoryId(s);
        ai.a().a(localadproduct);
        return i;
    }

    private String a(String s)
    {
        Object obj = null;
        String s1 = s.replace("-", "");
        s = obj;
        if (s1 != null)
        {
            s = b(com.jcp.b.b.a(s1, b.i));
        }
        return s;
    }

    private void a()
    {
        if (b != null && (b instanceof Activity) && !((Activity)b).isFinishing())
        {
            com.jcp.b.a.i();
        }
    }

    private String b(String s)
    {
        try
        {
            s = (new u()).d(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.a(a, s.getMessage());
            return null;
        }
        return s;
    }

    protected transient com.jcp.a.b a(String as[])
    {
        Object obj;
        com.jcp.a.b b1;
        int k;
        k = 0;
        b1 = new com.jcp.a.b(this);
        obj = null;
        e;
        JVM INSTR tableswitch 75 76: default 40
    //                   75 185
    //                   76 42;
           goto _L1 _L2 _L3
_L1:
        return b1;
_L3:
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = d.iterator();
        as = ((String []) (obj));
_L10:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        if (!((String) (obj)).contains(",")) goto _L5; else goto _L4
_L4:
        int i;
        obj = ((String) (obj)).split(",");
        i = 0;
_L11:
        if (i >= obj.length) goto _L7; else goto _L6
_L6:
        as = a(obj[i]);
        if (TextUtils.isEmpty(as)) goto _L8; else goto _L7
_L7:
        if (!TextUtils.isEmpty(as))
        {
            arraylist.add((ProductListProductEntity)aa.a(as, com/jcp/productlistentity/ProductListProductEntity));
        }
        if (!isCancelled()) goto _L10; else goto _L9
_L9:
        com.jcp.a.b.a(b1, arraylist);
        return b1;
_L8:
        i++;
          goto _L11
_L5:
        as = a(((String) (obj)));
          goto _L7
_L2:
        as = as[0];
        String s = b(com.jcp.b.b.I(as));
        if (s != null)
        {
            LocalAdProduct alocaladproduct[] = (LocalAdProduct[])aa.a(s, [Lcom/jcp/pojo/LocalAdProduct;);
            int i1 = alocaladproduct.length;
            for (int j = 0; j < i1;)
            {
                LocalAdProduct localadproduct = alocaladproduct[j];
                int l = k;
                if (!TextUtils.isEmpty(localadproduct.getCategory()))
                {
                    l = k;
                    if (!TextUtils.isEmpty(localadproduct.getSku()))
                    {
                        l = a(k, localadproduct);
                    }
                }
                j++;
                k = l;
            }

            com.jcp.a.b.a(b1, as);
            return b1;
        }
        if (true) goto _L1; else goto _L12
_L12:
    }

    public void a(int i)
    {
        e = i;
    }

    protected void a(com.jcp.a.b b1)
    {
        a();
        e;
        JVM INSTR tableswitch 75 76: default 32
    //                   75 112
    //                   76 38;
           goto _L1 _L2 _L3
_L1:
        super.onPostExecute(b1);
        return;
_L3:
        if (h != null)
        {
            List list = com.jcp.a.b.a(b1);
            if (list != null && !list.isEmpty())
            {
                h.b(list);
            } else
            {
                h.d(b.getString(0x7f0702b7), 76);
            }
        } else
        {
            ae.a(a, "GET_FLYER_PRODUCTS_LIST - Call back Listener is not initialized");
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (f != null)
        {
            String s = com.jcp.a.b.b(b1);
            if (s != null)
            {
                f.b(s);
            } else
            {
                f.a(b.getString(0x7f0702b7), 75);
            }
        } else
        {
            ae.a(a, "GET_PUBLICATION_PROMOTIONS - Call back Listener is not initialized");
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(d d1)
    {
        f = d1;
    }

    public void a(r r1)
    {
        h = r1;
    }

    public void a(List list)
    {
        d = list;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((com.jcp.a.b)obj);
    }

    protected void onPreExecute()
    {
        if (b != null && !c && !((Activity)b).isFinishing())
        {
            com.jcp.b.a.b(b, b.getString(0x7f070317));
        }
        super.onPreExecute();
    }

}
