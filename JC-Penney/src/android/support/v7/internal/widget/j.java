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
import android.support.v4.d.a;
import android.text.TextUtils;
import android.util.Log;
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
//            p, m, l, n, 
//            o

public class j extends DataSetObservable
{

    private static final String a = android/support/v7/internal/widget/j.getSimpleName();
    private static final Object b = new Object();
    private static final Map c = new HashMap();
    private final Object d;
    private final List e;
    private final List f;
    private final Context g;
    private final String h;
    private Intent i;
    private m j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private o p;

    static Context a(j j1)
    {
        return j1.g;
    }

    static boolean a(j j1, boolean flag)
    {
        j1.l = flag;
        return flag;
    }

    private boolean a(n n1)
    {
        boolean flag = f.add(n1);
        if (flag)
        {
            n = true;
            i();
            d();
            f();
            notifyChanged();
        }
        return flag;
    }

    static String b(j j1)
    {
        return j1.h;
    }

    static String c()
    {
        return a;
    }

    private void d()
    {
        if (!m)
        {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (n)
        {
            n = false;
            if (!TextUtils.isEmpty(h))
            {
                android.support.v4.d.a.a(new p(this, null), new Object[] {
                    new ArrayList(f), h
                });
                return;
            }
        }
    }

    private void e()
    {
        boolean flag = g();
        boolean flag1 = h();
        i();
        if (flag | flag1)
        {
            f();
            notifyChanged();
        }
    }

    private boolean f()
    {
        if (j != null && i != null && !e.isEmpty() && !f.isEmpty())
        {
            j.a(i, e, Collections.unmodifiableList(f));
            return true;
        } else
        {
            return false;
        }
    }

    private boolean g()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (o)
        {
            flag = flag1;
            if (i != null)
            {
                o = false;
                e.clear();
                List list = g.getPackageManager().queryIntentActivities(i, 0);
                int j1 = list.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    ResolveInfo resolveinfo = (ResolveInfo)list.get(i1);
                    e.add(new l(this, resolveinfo));
                }

                flag = true;
            }
        }
        return flag;
    }

    private boolean h()
    {
        if (l && n && !TextUtils.isEmpty(h))
        {
            l = false;
            m = true;
            j();
            return true;
        } else
        {
            return false;
        }
    }

    private void i()
    {
        int j1 = f.size() - k;
        if (j1 > 0)
        {
            n = true;
            int i1 = 0;
            while (i1 < j1) 
            {
                n n1 = (n)f.remove(0);
                i1++;
            }
        }
    }

    private void j()
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
        Log.e(a, (new StringBuilder()).append("Error reading historical recrod file: ").append(h).toString(), ((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        ((FileInputStream) (obj)).close();
_L6:
        return;
_L2:
        list = f;
        list.clear();
_L8:
        i1 = ((XmlPullParser) (obj1)).next();
        if (i1 != 1) goto _L4; else goto _L3
_L3:
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
_L4:
        if (i1 == 3 || i1 == 4) goto _L8; else goto _L7
_L7:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_229;
        obj1;
        Log.e(a, (new StringBuilder()).append("Error reading historical recrod file: ").append(h).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L6; else goto _L9
_L9:
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
        list.add(new n(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L8
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
        ioexception;
    }

    public int a()
    {
        int i1;
        synchronized (d)
        {
            e();
            i1 = e.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int a(ResolveInfo resolveinfo)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        List list;
        int j1;
        e();
        list = e;
        j1 = list.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((l)list.get(i1)).a != resolveinfo)
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

    public ResolveInfo a(int i1)
    {
        ResolveInfo resolveinfo;
        synchronized (d)
        {
            e();
            resolveinfo = ((l)e.get(i1)).a;
        }
        return resolveinfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Intent b(int i1)
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
        e();
        obj1 = (l)e.get(i1);
        obj1 = new ComponentName(((l) (obj1)).a.activityInfo.packageName, ((l) (obj1)).a.activityInfo.name);
        intent = new Intent(i);
        intent.setComponent(((ComponentName) (obj1)));
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Intent intent1 = new Intent(intent);
        if (!p.a(this, intent1))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        a(new n(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
        obj;
        JVM INSTR monitorexit ;
        return intent;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ResolveInfo b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        e();
        if (e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resolveinfo = ((l)e.get(0)).a;
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

    public void c(int i1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        l l1;
        l l2;
        e();
        l1 = (l)e.get(i1);
        l2 = (l)e.get(0);
        if (l2 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        float f1 = (l2.b - l1.b) + 5F;
_L1:
        a(new n(new ComponentName(l1.a.activityInfo.packageName, l1.a.activityInfo.name), System.currentTimeMillis(), f1));
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
