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

public class android.support.v7.internal.widget.b extends DataSetObservable
{
    public final class a
        implements Comparable
    {

        public final ResolveInfo a;
        public float b;
        final android.support.v7.internal.widget.b c;

        public int a(a a1)
        {
            return Float.floatToIntBits(a1.b) - Float.floatToIntBits(b);
        }

        public int compareTo(Object obj)
        {
            return a((a)obj);
        }

        public boolean equals(Object obj)
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

        public int hashCode()
        {
            return Float.floatToIntBits(b) + 31;
        }

        public String toString()
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
            c = android.support.v7.internal.widget.b.this;
            super();
            a = resolveinfo;
        }
    }

    public static interface b
    {

        public abstract void a(Intent intent, List list, List list1);
    }

    public static final class c
    {

        public final ComponentName a;
        public final long b;
        public final float c;

        public boolean equals(Object obj)
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
                obj = (c)obj;
                if (a == null)
                {
                    if (((c) (obj)).a != null)
                    {
                        return false;
                    }
                } else
                if (!a.equals(((c) (obj)).a))
                {
                    return false;
                }
                if (b != ((c) (obj)).b)
                {
                    return false;
                }
                if (Float.floatToIntBits(c) != Float.floatToIntBits(((c) (obj)).c))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
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

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append("; activity:").append(a);
            stringbuilder.append("; time:").append(b);
            stringbuilder.append("; weight:").append(new BigDecimal(c));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public c(ComponentName componentname, long l1, float f1)
        {
            a = componentname;
            b = l1;
            c = f1;
        }

        public c(String s, long l1, float f1)
        {
            this(ComponentName.unflattenFromString(s), l1, f1);
        }
    }

    public static interface d
    {

        public abstract boolean a(android.support.v7.internal.widget.b b1, Intent intent);
    }

    private final class e extends AsyncTask
    {

        final android.support.v7.internal.widget.b a;

        public transient Void a(Object aobj[])
        {
            List list;
            Object obj1;
            int i1;
            i1 = 0;
            list = (List)aobj[0];
            obj1 = (String)aobj[1];
            aobj = android.support.v7.internal.widget.b.a(a).openFileOutput(((String) (obj1)), 0);
            obj1 = Xml.newSerializer();
            int j1;
            ((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), null);
            ((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
            ((XmlSerializer) (obj1)).startTag(null, "historical-records");
            j1 = list.size();
_L2:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            c c1 = (c)list.remove(0);
            ((XmlSerializer) (obj1)).startTag(null, "historical-record");
            ((XmlSerializer) (obj1)).attribute(null, "activity", c1.a.flattenToString());
            ((XmlSerializer) (obj1)).attribute(null, "time", String.valueOf(c1.b));
            ((XmlSerializer) (obj1)).attribute(null, "weight", String.valueOf(c1.c));
            ((XmlSerializer) (obj1)).endTag(null, "historical-record");
            i1++;
            if (true) goto _L2; else goto _L1
            aobj;
            Log.e(android.support.v7.internal.widget.b.d(), (new StringBuilder()).append("Error writing historical recrod file: ").append(((String) (obj1))).toString(), ((Throwable) (aobj)));
_L3:
            return null;
_L1:
            ((XmlSerializer) (obj1)).endTag(null, "historical-records");
            ((XmlSerializer) (obj1)).endDocument();
            android.support.v7.internal.widget.b.a(a, true);
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    return null;
                }
                return null;
            }
              goto _L3
            Object obj;
            obj;
            Log.e(android.support.v7.internal.widget.b.d(), (new StringBuilder()).append("Error writing historical recrod file: ").append(android.support.v7.internal.widget.b.b(a)).toString(), ((Throwable) (obj)));
            android.support.v7.internal.widget.b.a(a, true);
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    return null;
                }
                return null;
            }
              goto _L3
            obj;
            Log.e(android.support.v7.internal.widget.b.d(), (new StringBuilder()).append("Error writing historical recrod file: ").append(android.support.v7.internal.widget.b.b(a)).toString(), ((Throwable) (obj)));
            android.support.v7.internal.widget.b.a(a, true);
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    return null;
                }
                return null;
            }
              goto _L3
            obj;
            Log.e(android.support.v7.internal.widget.b.d(), (new StringBuilder()).append("Error writing historical recrod file: ").append(android.support.v7.internal.widget.b.b(a)).toString(), ((Throwable) (obj)));
            android.support.v7.internal.widget.b.a(a, true);
            if (aobj == null) goto _L3; else goto _L4
_L4:
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            return null;
            obj;
            android.support.v7.internal.widget.b.a(a, true);
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

        public Object doInBackground(Object aobj[])
        {
            return a(aobj);
        }

        private e()
        {
            a = android.support.v7.internal.widget.b.this;
            super();
        }

    }


    private static final String a = android/support/v7/internal/widget/b.getSimpleName();
    private static final Object b = new Object();
    private static final Map c = new HashMap();
    private final Object d;
    private final List e;
    private final List f;
    private final Context g;
    private final String h;
    private Intent i;
    private b j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private d p;

    static Context a(android.support.v7.internal.widget.b b1)
    {
        return b1.g;
    }

    private boolean a(c c1)
    {
        boolean flag = f.add(c1);
        if (flag)
        {
            n = true;
            l();
            e();
            i();
            notifyChanged();
        }
        return flag;
    }

    static boolean a(android.support.v7.internal.widget.b b1, boolean flag)
    {
        b1.l = flag;
        return flag;
    }

    static String b(android.support.v7.internal.widget.b b1)
    {
        return b1.h;
    }

    static String d()
    {
        return a;
    }

    private void e()
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
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    g();
                    return;
                } else
                {
                    f();
                    return;
                }
            }
        }
    }

    private void f()
    {
        (new e()).execute(new Object[] {
            new ArrayList(f), h
        });
    }

    private void g()
    {
        (new e()).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Object[] {
            new ArrayList(f), h
        });
    }

    private void h()
    {
        boolean flag = j();
        boolean flag1 = k();
        l();
        if (flag | flag1)
        {
            i();
            notifyChanged();
        }
    }

    private boolean i()
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

    private boolean j()
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
                    e.add(new a(resolveinfo));
                }

                flag = true;
            }
        }
        return flag;
    }

    private boolean k()
    {
        if (l && n && !TextUtils.isEmpty(h))
        {
            l = false;
            m = true;
            m();
            return true;
        } else
        {
            return false;
        }
    }

    private void l()
    {
        int j1 = f.size() - k;
        if (j1 > 0)
        {
            n = true;
            int i1 = 0;
            while (i1 < j1) 
            {
                c c1 = (c)f.remove(0);
                i1++;
            }
        }
    }

    private void m()
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
        Log.e(a, (new StringBuilder()).append("Error reading historical recrod file: ").append(h).toString(), ((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_113;
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
        break MISSING_BLOCK_LABEL_230;
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
        list.add(new c(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
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
            h();
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
        h();
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

    public ResolveInfo a(int i1)
    {
        ResolveInfo resolveinfo;
        synchronized (d)
        {
            h();
            resolveinfo = ((a)e.get(i1)).a;
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
        h();
        obj1 = (a)e.get(i1);
        obj1 = new ComponentName(((a) (obj1)).a.activityInfo.packageName, ((a) (obj1)).a.activityInfo.name);
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
        a(new c(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
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
        h();
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

    public int c()
    {
        int i1;
        synchronized (d)
        {
            h();
            i1 = f.size();
        }
        return i1;
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
        a a1;
        a a2;
        h();
        a1 = (a)e.get(i1);
        a2 = (a)e.get(0);
        if (a2 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        float f1 = (a2.b - a1.b) + 5F;
_L1:
        a(new c(new ComponentName(a1.a.activityInfo.packageName, a1.a.activityInfo.name), System.currentTimeMillis(), f1));
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
