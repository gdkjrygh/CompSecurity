// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.c.c;
import com.facebook.orca.camera.aa;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.orca.camera.a:
//            d, a, c

public abstract class b
    implements d
{

    private static final Class h = com/facebook/orca/camera/a/b;
    private static final Pattern j = Pattern.compile("(.*)/\\d+");
    protected ContentResolver a;
    protected int b;
    protected Uri c;
    protected Cursor d;
    protected String e;
    protected Uri f;
    protected boolean g;
    private final c i = new c(512);

    public b(ContentResolver contentresolver, Uri uri, int k, String s)
    {
        g = false;
        b = k;
        c = uri;
        e = s;
        a = contentresolver;
        d = d();
        if (d == null)
        {
            com.facebook.debug.log.b.d(h, "createCursor returns null.");
        }
        i.a();
    }

    private static String b(Uri uri)
    {
        uri = uri.getPath();
        Matcher matcher = j.matcher(uri);
        if (matcher.matches())
        {
            uri = matcher.group(1);
        }
        return uri;
    }

    private boolean c(Uri uri)
    {
        Uri uri1 = c;
        return aa.a(uri1.getScheme(), uri.getScheme()) && aa.a(uri1.getHost(), uri.getHost()) && aa.a(uri1.getAuthority(), uri.getAuthority()) && aa.a(uri1.getPath(), b(uri));
    }

    private Cursor g()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Cursor cursor;
        if (g)
        {
            d.requery();
            g = false;
        }
        cursor = d;
        this;
        JVM INSTR monitorexit ;
        return cursor;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Uri a(long l)
    {
        Uri uri;
        try
        {
            if (ContentUris.parseId(c) != l)
            {
                com.facebook.debug.log.b.e(h, "id mismatch");
            }
            uri = c;
        }
        catch (NumberFormatException numberformatexception)
        {
            return ContentUris.withAppendedId(c, l);
        }
        return uri;
    }

    protected abstract a a(Cursor cursor);

    public com.facebook.orca.camera.a.c a(int k)
    {
        Object obj;
label0:
        {
            a a1 = (a)i.a(Integer.valueOf(k));
            obj = a1;
            if (a1 == null)
            {
                obj = g();
                if (obj != null)
                {
                    break label0;
                }
                obj = null;
            }
            return ((com.facebook.orca.camera.a.c) (obj));
        }
        this;
        JVM INSTR monitorenter ;
        if (!((Cursor) (obj)).moveToPosition(k))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = a(((Cursor) (obj)));
_L1:
        i.a(Integer.valueOf(k), obj);
        this;
        JVM INSTR monitorexit ;
        return ((com.facebook.orca.camera.a.c) (obj));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L1
    }

    public com.facebook.orca.camera.a.c a(Uri uri)
    {
        if (c(uri)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        a a1;
        Cursor cursor;
        int k;
        long l;
        try
        {
            l = ContentUris.parseId(uri);
        }
        catch (NumberFormatException numberformatexception)
        {
            com.facebook.debug.log.b.c(h, (new StringBuilder()).append("fail to get id in: ").append(uri).toString(), numberformatexception);
            return null;
        }
        if ((cursor = g()) == null) goto _L1; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        cursor.moveToPosition(-1);
        k = 0;
_L5:
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (b(cursor) != l)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        a1 = (a)i.a(Integer.valueOf(k));
        uri = a1;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        uri = a(cursor);
        i.a(Integer.valueOf(k), uri);
        this;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        this;
        JVM INSTR monitorexit ;
        throw uri;
        k++;
        if (true) goto _L5; else goto _L4
_L4:
        this;
        JVM INSTR monitorexit ;
        return null;
    }

    public void a()
    {
        try
        {
            e();
        }
        catch (IllegalStateException illegalstateexception)
        {
            com.facebook.debug.log.b.e(h, "Caught exception while deactivating cursor.", illegalstateexception);
        }
        a = null;
        if (d != null)
        {
            d.close();
            d = null;
        }
    }

    public int b()
    {
        Cursor cursor;
        cursor = g();
        if (cursor == null)
        {
            return 0;
        }
        this;
        JVM INSTR monitorenter ;
        int k = cursor.getCount();
        this;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract long b(Cursor cursor);

    public boolean c()
    {
        return b() == 0;
    }

    protected abstract Cursor d();

    protected void e()
    {
        if (d == null)
        {
            return;
        } else
        {
            d.deactivate();
            g = true;
            return;
        }
    }

    protected String f()
    {
        String s;
        if (b == 1)
        {
            s = " ASC";
        } else
        {
            s = " DESC";
        }
        return (new StringBuilder()).append("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end").append(s).append(", _id").append(s).toString();
    }

}
