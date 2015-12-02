// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

// Referenced classes of package com.qihoo.antivirus.update:
//            d, af, x, s, 
//            UpdateService, r, ad, g, 
//            ab

public class v extends AsyncTask
    implements x.a
{

    public final d a;
    private final ArrayList b;
    private long c;
    private long d;
    private long e;

    public v(d d1)
    {
        c = 0L;
        d = 0L;
        e = 0L;
        a = d1;
        b = d1.d();
        c = d1.c();
    }

    protected transient ab a(String as[])
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        Object obj2;
        Iterator iterator;
        boolean flag1 = af.a(a.e());
        char c1 = '\0';
        if (flag1)
        {
            c1 = '\u2710';
        }
        obj2 = x.a(x.e(a.e()), c1);
        iterator = b.iterator();
_L8:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!isCancelled())
        {
            break; /* Loop/switch isn't completed */
        }
        as = null;
_L6:
        return as;
_L4:
        Object obj;
        Object obj1;
        long l;
        obj1 = (s)iterator.next();
        if (UpdateService.f)
        {
            return null;
        }
        if (isCancelled())
        {
            return null;
        }
        if (((s) (obj1)).c() != null)
        {
            as = ((s) (obj1)).c();
            obj = ((s) (obj1)).d();
            l = ((s) (obj1)).e();
            obj1 = (new StringBuilder(String.valueOf(((s) (obj1)).b()))).append(".patch").toString();
        } else
        {
            as = ((s) (obj1)).f();
            obj = ((s) (obj1)).g();
            l = ((s) (obj1)).h();
            obj1 = ((s) (obj1)).b();
        }
        obj1 = a.c(((String) (obj1)));
        if (((File) (obj1)).exists())
        {
            String s1 = af.a(((File) (obj1)).getAbsolutePath());
            if (!TextUtils.isEmpty(s1) && s1.equals(obj))
            {
                d = d + l;
                publishProgress(new Long[] {
                    Long.valueOf(d), Long.valueOf(c)
                });
                continue; /* Loop/switch isn't completed */
            }
            ((File) (obj1)).delete();
        }
        a.d(((File) (obj1)).getAbsolutePath());
        obj = new r(a.e(), as, ((File) (obj1)).getAbsolutePath(), this, l, ((String) (obj)));
        as = ((String []) (obj));
        if (!((r) (obj)).a(((org.apache.http.client.HttpClient) (obj2)))) goto _L6; else goto _L5
_L5:
        d = d + l;
        a.e(((File) (obj1)).getAbsolutePath());
        if (true) goto _L8; else goto _L7
_L7:
        obj1 = a.e().getFilesDir().getAbsolutePath();
        try
        {
            l = Long.parseLong(a.g().a("serverTime"));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            l = System.currentTimeMillis() / 1000L;
        }
        obj2 = new ArrayList();
        iterator = b.iterator();
_L14:
        if (iterator.hasNext()) goto _L10; else goto _L9
_L9:
        as = ((ArrayList) (obj2)).iterator();
_L17:
        if (as.hasNext()) goto _L12; else goto _L11
_L11:
        ((ArrayList) (obj2)).clear();
_L2:
        return null;
_L10:
        Object obj3;
        int i;
        boolean flag;
        obj3 = (s)iterator.next();
        obj = ((s) (obj3)).b();
        File file;
        if (((s) (obj3)).c() != null)
        {
            as = (new StringBuilder(String.valueOf(obj))).append(".patch").toString();
        } else
        {
            as = ((String []) (obj));
        }
        as = a.c(as);
        if (as == null) goto _L14; else goto _L13
_L13:
        obj = a.b(((String) (obj)));
        if (obj == null) goto _L16; else goto _L15
_L15:
        if (((s) (obj3)).c() != null)
        {
            i = Integer.valueOf(((s) (obj3)).i()).intValue();
            if (i > 1000)
            {
                file = new File(a.e().getFilesDir(), as.getName());
                if (af.a(as, file))
                {
                    a.a(((File) (obj)), file, ((s) (obj3)).j(), ((s) (obj3)).a(), i, 0);
                    i = 1;
                    flag = false;
                } else
                {
                    flag = true;
                    i = 1;
                }
            } else
            {
                if (g.a(a.e(), ((File) (obj)), as, i, ((s) (obj3)).j()))
                {
                    break MISSING_BLOCK_LABEL_844;
                }
                flag = true;
                i = 0;
            }
        } else
        if ((((s) (obj3)).a() & 0x10) > 0)
        {
            File file1 = new File(a.e().getFilesDir(), (new StringBuilder(String.valueOf(((File) (obj)).getName()))).append(".tmp").toString());
            if (af.a(as, file1))
            {
                a.a(((File) (obj)), file1, ((s) (obj3)).j(), ((s) (obj3)).a(), 0, 1);
                i = 1;
                flag = false;
            } else
            {
                flag = true;
                i = 1;
            }
        } else
        {
            if (af.a(as, ((File) (obj))))
            {
                break MISSING_BLOCK_LABEL_844;
            }
            flag = true;
            i = 0;
        }
_L18:
        if (((File) (obj)).getAbsolutePath().startsWith(((String) (obj1))))
        {
            obj3 = ((File) (obj)).getName();
            af.a(a.e(), ((String) (obj3)), l);
        }
        if (flag)
        {
            a.a(((File) (obj)), true);
        } else
        if (i == 0)
        {
            a.a(((File) (obj)), false);
        }
_L16:
        ((ArrayList) (obj2)).add(as);
          goto _L14
_L12:
        ((File)as.next()).delete();
          goto _L17
        i = 0;
        flag = false;
          goto _L18
    }

    public void a(int i, String s1)
    {
    }

    public void a(long l, long l1)
        throws InterruptedException
    {
        publishProgress(new Long[] {
            Long.valueOf(d + l), Long.valueOf(c)
        });
        if (isCancelled())
        {
            throw new InterruptedException();
        } else
        {
            return;
        }
    }

    protected void a(ab ab1)
    {
        if (ab1 == null)
        {
            a.a(true);
            return;
        } else
        {
            a.a(ab1);
            return;
        }
    }

    public void a(HttpResponse httpresponse)
    {
        Object obj = null;
        Object obj1 = httpresponse.getFirstHeader("Date");
        httpresponse = ((HttpResponse) (obj));
        if (obj1 != null)
        {
            obj1 = ((Header) (obj1)).getValue();
            httpresponse = ((HttpResponse) (obj));
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                Log.d("FileUpdateTask", (new StringBuilder("Server time: ")).append(((String) (obj1))).toString());
                try
                {
                    httpresponse = (new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.US)).parse(((String) (obj1)));
                }
                // Misplaced declaration of an exception variable
                catch (HttpResponse httpresponse)
                {
                    httpresponse = ((HttpResponse) (obj));
                }
            }
        }
        obj = httpresponse;
        if (httpresponse == null)
        {
            obj = new Date();
        }
        httpresponse = String.valueOf(((Date) (obj)).getTime() / 1000L);
        a.a("serverTime", httpresponse);
        obj = (new SimpleDateFormat("yyyyMMdd")).format(((Date) (obj)));
        a.a("timestamp", ((String) (obj)));
        Log.i("FileUpdateTask", (new StringBuilder("Server timestamp:")).append(httpresponse).append("(").append(((String) (obj))).append(")").toString());
    }

    protected transient void a(Long along[])
    {
        long l = System.currentTimeMillis();
        if (l - e > 1000L)
        {
            e = l;
            a.a(along[0].longValue(), along[1].longValue());
        }
    }

    protected transient Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ab)obj);
    }

    protected transient void onProgressUpdate(Object aobj[])
    {
        a((Long[])aobj);
    }
}
