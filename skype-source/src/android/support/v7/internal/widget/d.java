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
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class android.support.v7.internal.widget.d extends DataSetObservable
{
    public final class a
        implements Comparable
    {

        public final ResolveInfo a;
        public float b;
        final android.support.v7.internal.widget.d c;

        public final int compareTo(Object obj)
        {
            return Float.floatToIntBits(((a)obj).b) - Float.floatToIntBits(b);
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (a)obj;
                if (Float.floatToIntBits(b) != Float.floatToIntBits(((a) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Float.floatToIntBits(b) + 31;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append("resolveInfo:").append(a.toString());
            stringbuilder.append("; weight:").append(new BigDecimal(b));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public a(ResolveInfo resolveinfo)
        {
            c = android.support.v7.internal.widget.d.this;
            super();
            a = resolveinfo;
        }
    }

    public static interface b
    {

        public abstract void a(List list, List list1);
    }

    private final class c
        implements b
    {

        final android.support.v7.internal.widget.d a;
        private final Map b;

        public final void a(List list, List list1)
        {
            Map map = b;
            map.clear();
            int k1 = list.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                a a1 = (a)list.get(i1);
                a1.b = 0.0F;
                map.put(new ComponentName(a1.a.activityInfo.packageName, a1.a.activityInfo.name), a1);
            }

            int j1 = list1.size();
            float f1 = 1.0F;
            for (j1--; j1 >= 0;)
            {
                d d1 = (d)list1.get(j1);
                a a2 = (a)map.get(d1.a);
                float f2 = f1;
                if (a2 != null)
                {
                    a2.b = a2.b + d1.c * f1;
                    f2 = f1 * 0.95F;
                }
                j1--;
                f1 = f2;
            }

            Collections.sort(list);
        }

        private c()
        {
            a = android.support.v7.internal.widget.d.this;
            super();
            b = new HashMap();
        }

        c(byte byte0)
        {
            this();
        }
    }

    public static final class d
    {

        public final ComponentName a;
        public final long b;
        public final float c;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (d)obj;
                if (a == null)
                {
                    if (((d) (obj)).a != null)
                    {
                        return false;
                    }
                } else
                if (!a.equals(((d) (obj)).a))
                {
                    return false;
                }
                if (b != ((d) (obj)).b)
                {
                    return false;
                }
                if (Float.floatToIntBits(c) != Float.floatToIntBits(((d) (obj)).c))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int i1;
            if (a == null)
            {
                i1 = 0;
            } else
            {
                i1 = a.hashCode();
            }
            return ((i1 + 31) * 31 + (int)(b ^ b >>> 32)) * 31 + Float.floatToIntBits(c);
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append("; activity:").append(a);
            stringbuilder.append("; time:").append(b);
            stringbuilder.append("; weight:").append(new BigDecimal(c));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public d(ComponentName componentname, long l1, float f1)
        {
            a = componentname;
            b = l1;
            c = f1;
        }

        public d(String s, long l1, float f1)
        {
            this(ComponentName.unflattenFromString(s), l1, f1);
        }
    }

    public static interface e
    {

        public abstract boolean a();
    }

    private final class f extends AsyncTask
    {

        final android.support.v7.internal.widget.d a;

        private transient Void a(Object aobj[])
        {
            Object obj1;
            List list = (List)aobj[0];
            obj1 = (String)aobj[1];
            d d1;
            int i1;
            int j1;
            try
            {
                aobj = android.support.v7.internal.widget.d.a(a).openFileOutput(((String) (obj1)), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                Log.e(android.support.v7.internal.widget.d.d(), (new StringBuilder("Error writing historical recrod file: ")).append(((String) (obj1))).toString(), ((Throwable) (aobj)));
                return null;
            }
            obj1 = Xml.newSerializer();
            ((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), null);
            ((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
            ((XmlSerializer) (obj1)).startTag(null, "historical-records");
            j1 = list.size();
            i1 = 0;
_L2:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            d1 = (d)list.remove(0);
            ((XmlSerializer) (obj1)).startTag(null, "historical-record");
            ((XmlSerializer) (obj1)).attribute(null, "activity", d1.a.flattenToString());
            ((XmlSerializer) (obj1)).attribute(null, "time", String.valueOf(d1.b));
            ((XmlSerializer) (obj1)).attribute(null, "weight", String.valueOf(d1.c));
            ((XmlSerializer) (obj1)).endTag(null, "historical-record");
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
            ((XmlSerializer) (obj1)).endTag(null, "historical-records");
            ((XmlSerializer) (obj1)).endDocument();
            android.support.v7.internal.widget.d.c(a);
            Object obj;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            return null;
            obj;
            Log.e(android.support.v7.internal.widget.d.d(), (new StringBuilder("Error writing historical recrod file: ")).append(android.support.v7.internal.widget.d.b(a)).toString(), ((Throwable) (obj)));
            android.support.v7.internal.widget.d.c(a);
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            continue; /* Loop/switch isn't completed */
            obj;
            Log.e(android.support.v7.internal.widget.d.d(), (new StringBuilder("Error writing historical recrod file: ")).append(android.support.v7.internal.widget.d.b(a)).toString(), ((Throwable) (obj)));
            android.support.v7.internal.widget.d.c(a);
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            continue; /* Loop/switch isn't completed */
            obj;
            Log.e(android.support.v7.internal.widget.d.d(), (new StringBuilder("Error writing historical recrod file: ")).append(android.support.v7.internal.widget.d.b(a)).toString(), ((Throwable) (obj)));
            android.support.v7.internal.widget.d.c(a);
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            if (true) goto _L4; else goto _L3
_L3:
            break MISSING_BLOCK_LABEL_396;
_L4:
            break MISSING_BLOCK_LABEL_233;
            obj;
            android.support.v7.internal.widget.d.c(a);
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            throw obj;
        }

        public final Object doInBackground(Object aobj[])
        {
            return a(aobj);
        }

        private f()
        {
            a = android.support.v7.internal.widget.d.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }


    private static final String a = android/support/v7/internal/widget/d.getSimpleName();
    private static final Object b = new Object();
    private static final Map c = new HashMap();
    private final Object d = new Object();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final Context g;
    private final String h;
    private Intent i;
    private b j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private e p;

    private android.support.v7.internal.widget.d(Context context, String s)
    {
        j = new c((byte)0);
        k = 50;
        l = true;
        m = false;
        n = true;
        o = false;
        g = context.getApplicationContext();
        if (!TextUtils.isEmpty(s) && !s.endsWith(".xml"))
        {
            h = (new StringBuilder()).append(s).append(".xml").toString();
            return;
        } else
        {
            h = s;
            return;
        }
    }

    static Context a(android.support.v7.internal.widget.d d1)
    {
        return d1.g;
    }

    public static android.support.v7.internal.widget.d a(Context context, String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        android.support.v7.internal.widget.d d2 = (android.support.v7.internal.widget.d)c.get(s);
        android.support.v7.internal.widget.d d1;
        d1 = d2;
        if (d2 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        d1 = new android.support.v7.internal.widget.d(context, s);
        c.put(s, d1);
        obj;
        JVM INSTR monitorexit ;
        return d1;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private boolean a(d d1)
    {
        boolean flag = f.add(d1);
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
                    d1 = new f((byte)0);
                    Object aobj[] = new Object[2];
                    aobj[0] = new ArrayList(f);
                    aobj[1] = h;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        d1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
                    } else
                    {
                        d1.execute(aobj);
                    }
                }
            }
            f();
            notifyChanged();
        }
        return flag;
    }

    static String b(android.support.v7.internal.widget.d d1)
    {
        return d1.h;
    }

    static boolean c(android.support.v7.internal.widget.d d1)
    {
        d1.l = true;
        return true;
    }

    static String d()
    {
        return a;
    }

    private void e()
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
                e.add(new a(resolveinfo));
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

    private boolean f()
    {
        if (j != null && i != null && !e.isEmpty() && !f.isEmpty())
        {
            j.a(e, Collections.unmodifiableList(f));
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
        Log.e(a, (new StringBuilder("Error reading historical recrod file: ")).append(h).toString(), ((Throwable) (obj1)));
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
        break MISSING_BLOCK_LABEL_218;
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
        list.add(new d(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
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
            e();
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
        e();
        list = e;
        j1 = list.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((a)list.get(i1)).a != resolveinfo)
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
            e();
            resolveinfo = ((a)e.get(i1)).a;
        }
        return resolveinfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Intent intent)
    {
label0:
        {
            synchronized (d)
            {
                if (i != intent)
                {
                    break label0;
                }
            }
            return;
        }
        i = intent;
        o = true;
        e();
        obj;
        JVM INSTR monitorexit ;
        return;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
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
        e();
        obj1 = (a)e.get(i1);
        obj1 = new ComponentName(((a) (obj1)).a.activityInfo.packageName, ((a) (obj1)).a.activityInfo.name);
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
        a(new d(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
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
        e();
        if (e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resolveinfo = ((a)e.get(0)).a;
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
        synchronized (d)
        {
            e();
            i1 = f.size();
        }
        return i1;
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
        a a1;
        a a2;
        e();
        a1 = (a)e.get(i1);
        a2 = (a)e.get(0);
        if (a2 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        float f1 = (a2.b - a1.b) + 5F;
_L1:
        a(new d(new ComponentName(a1.a.activityInfo.packageName, a1.a.activityInfo.name), System.currentTimeMillis(), f1));
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
