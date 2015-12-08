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
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.internal.widget:
//            m, k, o, n, 
//            l

public class j extends DataSetObservable
{

    private static final String c = android/support/v7/internal/widget/j.getSimpleName();
    private static final Object d = new Object();
    private static final Map e = new HashMap();
    final Object a;
    final List b;
    private final List f;
    private final Context g;
    private final String h;
    private Intent i;
    private l j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private n p;

    static Context a(j j1)
    {
        return j1.g;
    }

    static String b(j j1)
    {
        return j1.h;
    }

    static boolean c(j j1)
    {
        j1.l = true;
        return true;
    }

    static String e()
    {
        return c;
    }

    private boolean f()
    {
        if (j != null && i != null && !b.isEmpty() && !f.isEmpty())
        {
            Collections.unmodifiableList(f);
            return true;
        } else
        {
            return false;
        }
    }

    private void g()
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

    private void h()
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
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), "UTF-8");
        i1 = 0;
_L1:
        if (i1 == 1 || i1 == 2)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        i1 = ((XmlPullParser) (obj1)).next();
          goto _L1
        if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
          goto _L2
        obj1;
        (new StringBuilder("Error reading historical recrod file: ")).append(h);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_101;
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
        break MISSING_BLOCK_LABEL_192;
        obj1;
        (new StringBuilder("Error reading historical recrod file: ")).append(h);
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
        list.add(new m(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
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
        synchronized (a)
        {
            d();
            i1 = b.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int a(ResolveInfo resolveinfo)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        List list;
        int j1;
        d();
        list = b;
        j1 = list.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((k)list.get(i1)).a != resolveinfo)
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
        synchronized (a)
        {
            d();
            resolveinfo = ((k)b.get(i1)).a;
        }
        return resolveinfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final boolean a(m m1)
    {
        boolean flag = f.add(m1);
        if (flag)
        {
            n = true;
            g();
            if (!m)
            {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (n)
            {
                n = false;
                if (!TextUtils.isEmpty(h))
                {
                    m1 = new o(this);
                    Object aobj[] = new Object[2];
                    aobj[0] = new ArrayList(f);
                    aobj[1] = h;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        m1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
                    } else
                    {
                        m1.execute(aobj);
                    }
                }
            }
            f();
            notifyChanged();
        }
        return flag;
    }

    public final Intent b(int i1)
    {
label0:
        {
            synchronized (a)
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
        obj1 = (k)b.get(i1);
        obj1 = new ComponentName(((k) (obj1)).a.activityInfo.packageName, ((k) (obj1)).a.activityInfo.name);
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
        a(new m(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
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
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        d();
        if (b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resolveinfo = ((k)b.get(0)).a;
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

    public final int c()
    {
        int i1;
        synchronized (a)
        {
            d();
            i1 = f.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void d()
    {
        boolean flag1 = true;
        boolean flag;
        if (o && i != null)
        {
            o = false;
            b.clear();
            List list = g.getPackageManager().queryIntentActivities(i, 0);
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ResolveInfo resolveinfo = (ResolveInfo)list.get(i1);
                b.add(new k(this, resolveinfo));
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
            h();
        } else
        {
            flag1 = false;
        }
        g();
        if (flag | flag1)
        {
            f();
            notifyChanged();
        }
    }

}
