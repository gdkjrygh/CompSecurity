// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.text.TextUtils;
import com.cleanmaster.ui.app.market.c;
import com.cleanmaster.ui.app.market.loader.AsyncTaskEx;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.cleanmaster.util:
//            e, j, h, f, 
//            g

public class d extends AsyncTaskEx
{

    private g a;
    private List b;

    public d()
    {
    }

    private String a()
    {
        if (!PicksMob.getInstance().isDebug()) goto _L2; else goto _L1
_L1:
        String s = PicksMob.getInstance().getTestReportIp();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L3
_L3:
        if (!com.cleanmaster.ui.app.market.d.a()) goto _L5; else goto _L4
_L4:
        s = (new StringBuilder("http://")).append(s).append("/rp/").toString();
_L7:
        return s;
_L5:
        return (new StringBuilder("https://")).append(s).append("/rp/").toString();
_L2:
        if (PicksMob.getInstance().getmAdResourceRp() == 1)
        {
            if (com.cleanmaster.ui.app.market.d.a())
            {
                return "http://rcv.mobad.ijinshan.com/rp/";
            }
            String s1 = c.e();
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                return "https://ssdk.adkmob.com/rp/";
            }
        } else
        if (com.cleanmaster.ui.app.market.d.a())
        {
            return "http://unrcv.mobad.ijinshan.com/rp/";
        } else
        {
            return "http://unrcv.adkmob.com/rp/";
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return;
        } else
        {
            a(a(), (new StringBuilder()).append(s).append(s1).toString(), ((h) (new e(this))));
            return;
        }
    }

    private void a(String s, String s1, h h1)
    {
        PicksMob.getInstance().getContext();
        if (!TextUtils.isEmpty(s1))
        {
            boolean flag = j.a;
            Object obj = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), b());
            HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), b());
            obj = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)));
            try
            {
                s = new HttpPost(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                s = null;
            }
            if (s != null)
            {
                try
                {
                    s.setEntity(new StringEntity(s1));
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                }
                try
                {
                    s = ((HttpClient) (obj)).execute(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    s = null;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    s = null;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    s = null;
                }
                if (s != null && h1 != null)
                {
                    s = s.getEntity();
                    try
                    {
                        s = s.getContent();
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        s.printStackTrace();
                        s = null;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        s.printStackTrace();
                        s = null;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        s.printStackTrace();
                        s = null;
                    }
                    if (h1 != null)
                    {
                        h1.a(s);
                    }
                    if (s != null)
                    {
                        try
                        {
                            s.close();
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            s.printStackTrace();
                        }
                        return;
                    }
                }
            }
        }
    }

    private static int b()
    {
        int i = c.b();
        if (i > 0)
        {
            return i;
        } else
        {
            return 10000;
        }
    }

    private String g()
    {
        if (b == null || b.size() == 0)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("&attach=[");
        Iterator iterator = b.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            f f1 = (f)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(f1.a());
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    protected volatile Object a(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected transient Void a(Void avoid[])
    {
        if (a == null)
        {
            return null;
        } else
        {
            a(a.a(), g());
            return null;
        }
    }

    public void a(f f1, g g1)
    {
        a = g1;
        b = new ArrayList();
        b.add(f1);
    }
}
