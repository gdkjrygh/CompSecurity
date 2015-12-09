// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.internal.widget:
//            r, n, p, q, 
//            o

public class m extends DataSetObservable
{

    private static final String a = android/support/v7/internal/widget/m.getSimpleName();
    private static final Object b = new Object();
    private static final Map c = new HashMap();
    private final Object d;
    private final List e;
    private final List f;
    private final Context g;
    private final String h;
    private Intent i;
    private o j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private q p;

    static Context a(m m1)
    {
        return m1.g;
    }

    private boolean a(p p1)
    {
        boolean flag = f.add(p1);
        if (flag)
        {
            n = true;
            f();
            if (!m)
            {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (n)
            {
                n = false;
                if (!TextUtils.isEmpty(h))
                {
                    p1 = new r(this, (byte)0);
                    Object aobj[] = new Object[2];
                    aobj[0] = f;
                    aobj[1] = h;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        p1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
                    } else
                    {
                        p1.execute(aobj);
                    }
                }
            }
            e();
            notifyChanged();
        }
        return flag;
    }

    static String b(m m1)
    {
        return m1.h;
    }

    static String c()
    {
        return a;
    }

    static boolean c(m m1)
    {
        m1.l = true;
        return true;
    }

    private void d()
    {
        boolean flag1 = true;
        boolean flag;
        if (o && i != null)
        {
            o = false;
            e.clear();
            List list = g.getPackageManager().queryIntentActivities(i, 0);
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ResolveInfo resolveinfo = (ResolveInfo)list.get(i1);
                e.add(new n(this, resolveinfo));
            }

            flag = true;
        } else
        {
            flag = false;
        }
        if (l && n && !TextUtils.isEmpty(h))
        {
            l = false;
            m = true;
            g();
        } else
        {
            flag1 = false;
        }
        f();
        if (flag | flag1)
        {
            e();
            notifyChanged();
        }
    }

    private boolean e()
    {
        if (j != null && i != null && !e.isEmpty() && !f.isEmpty())
        {
            Collections.unmodifiableList(f);
            return true;
        } else
        {
            return false;
        }
    }

    private void f()
    {
        int j1 = f.size() - k;
        if (j1 > 0)
        {
            n = true;
            int i1 = 0;
            while (i1 < j1) 
            {
                f.remove(0);
                i1++;
            }
        }
    }

    private void g()
    {
        Object obj;
        Object obj1;
        Exception exception;
        List list;
        int i1;
        try
        {
            obj = g.openFileInput(h);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return;
        }
        obj1 = Xml.newPullParser();
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), null);
        i1 = 0;
_L1:
        if (i1 == 1 || i1 == 2)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i1 = ((XmlPullParser) (obj1)).next();
          goto _L1
        if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
          goto _L2
        obj1;
        Log.e(a, (new StringBuilder("Error reading historical recrod file: ")).append(h).toString(), ((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((FileInputStream) (obj)).close();
_L6:
        return;
_L2:
        list = f;
        list.clear();
_L4:
        i1 = ((XmlPullParser) (obj1)).next();
        if (i1 == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 3 || i1 == 4) goto _L4; else goto _L3
_L3:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_211;
        obj1;
        Log.e(a, (new StringBuilder("Error reading historical recrod file: ")).append(h).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        list.add(new p(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L4
        exception;
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw exception;
        if (obj == null) goto _L6; else goto _L7
_L7:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            return;
        }
        ioexception;
    }

    public final int a()
    {
        int i1;
        synchronized (d)
        {
            d();
            i1 = e.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int a(ResolveInfo resolveinfo)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        List list;
        int j1;
        d();
        list = e;
        j1 = list.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((n)list.get(i1)).a != resolveinfo)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj;
        JVM INSTR monitorexit ;
        return i1;
        obj;
        JVM INSTR monitorexit ;
        return -1;
        resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        throw resolveinfo;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final ResolveInfo a(int i1)
    {
        ResolveInfo resolveinfo;
        synchronized (d)
        {
            d();
            resolveinfo = ((n)e.get(i1)).a;
        }
        return resolveinfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Intent b(int i1)
    {
label0:
        {
            synchronized (d)
            {
                if (i != null)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj1;
        Intent intent;
        d();
        obj1 = (n)e.get(i1);
        obj1 = new ComponentName(((n) (obj1)).a.activityInfo.packageName, ((n) (obj1)).a.activityInfo.name);
        intent = new Intent(i);
        intent.setComponent(((ComponentName) (obj1)));
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        new Intent(intent);
        if (!p.a())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        a(new p(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
        obj;
        JVM INSTR monitorexit ;
        return intent;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ResolveInfo b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        d();
        if (e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resolveinfo = ((n)e.get(0)).a;
        return resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(int i1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        n n1;
        n n2;
        d();
        n1 = (n)e.get(i1);
        n2 = (n)e.get(0);
        if (n2 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        float f1 = (n2.b - n1.b) + 5F;
_L1:
        a(new p(new ComponentName(n1.a.activityInfo.packageName, n1.a.activityInfo.name), System.currentTimeMillis(), f1));
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        f1 = 1.0F;
          goto _L1
    }

}
