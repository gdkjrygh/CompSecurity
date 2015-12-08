// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteException;

public final class nsx extends CursorWrapper
{

    private static final String a = ntn.a(nsx);

    public nsx(Cursor cursor)
    {
        super(cursor);
    }

    private oyp o()
    {
        byte abyte0[] = getBlob(getColumnIndex("collapsed_info"));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        oyp oyp1;
        oyp1 = new oyp();
        qlw.a(oyp1, abyte0);
        return oyp1;
        Object obj;
        obj;
        ntn.b(a, "Malformed CollapsedInfo data for notification.", ((Throwable) (obj)));
_L2:
        return null;
        obj;
        ntn.b(a, "CollapsedInfo not in db", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a()
    {
        return getString(getColumnIndex("key"));
    }

    public final long b()
    {
        long l1;
        try
        {
            l1 = getLong(getColumnIndex("last_modified_version"));
        }
        catch (Exception exception)
        {
            return 0L;
        }
        return l1;
    }

    public final long c()
    {
        long l1;
        try
        {
            l1 = getLong(getColumnIndex("system_tray_version"));
        }
        catch (Exception exception)
        {
            return 0L;
        }
        return l1;
    }

    public final ozd d()
    {
        oyp oyp1 = o();
        if (oyp1 != null)
        {
            return oyp1.a;
        } else
        {
            return null;
        }
    }

    public final oyv e()
    {
        byte abyte0[] = getBlob(getColumnIndex("expanded_info"));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        oyv oyv1;
        oyv1 = new oyv();
        qlw.a(oyv1, abyte0);
        return oyv1;
        Object obj;
        obj;
        ntn.b(a, "Malformed ExpandedInfo data for notification.", ((Throwable) (obj)));
_L2:
        return null;
        obj;
        ntn.b(a, "ExpandedInfo not in db", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int f()
    {
        int i1;
        try
        {
            i1 = getInt(getColumnIndex("read_state"));
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i1;
    }

    public final int g()
    {
        oym oym1 = n();
        if (oym1 == null) goto _L2; else goto _L1
_L1:
        b.a(Integer.valueOf(oym1.b));
        JVM INSTR tableswitch 0 4: default 52
    //                   0 52
    //                   1 54
    //                   2 56
    //                   3 58
    //                   4 60;
           goto _L2 _L2 _L3 _L4 _L5 _L6
_L2:
        return 0;
_L3:
        return 1;
_L4:
        return -1;
_L5:
        return 2;
_L6:
        return -2;
    }

    public final Long h()
    {
        oyp oyp1 = o();
        if (oyp1 != null && oyp1.b != null)
        {
            return Long.valueOf(oyp1.b.longValue() / 1000L);
        } else
        {
            return Long.valueOf(0L);
        }
    }

    public final oyo i()
    {
        byte abyte0[] = getBlob(getColumnIndex("payload"));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        oyo oyo1 = (oyo)qlw.a(new oyo(), abyte0);
        return oyo1;
        Exception exception;
        exception;
        ntn.b(a, "Exception trying to parse payload protocol buffer.", exception);
        return null;
    }

    public final oyb j()
    {
        byte abyte0[];
        Object obj;
        try
        {
            abyte0 = getBlob(getColumnIndex("analytics_data"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ntn.b(a, "Malformed analytics data for notification.", ((Throwable) (obj)));
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ntn.b(a, "AnalyticsData not in db.", ((Throwable) (obj)));
            return null;
        }
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        obj = (oyb)qlw.a(new oyb(), abyte0);
_L4:
        return ((oyb) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String k()
    {
        oyp oyp1 = o();
        if (oyp1 != null && oyp1.c != null)
        {
            return oyp1.c.a;
        } else
        {
            return null;
        }
    }

    public final String l()
    {
        oym oym1 = n();
        if (oym1 != null)
        {
            return oym1.a;
        } else
        {
            return null;
        }
    }

    public final boolean m()
    {
        oym oym1 = n();
        return oym1 != null && oym1.c.booleanValue();
    }

    public oym n()
    {
        byte abyte0[] = getBlob(getColumnIndex("android_render_info"));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        oym oym1;
        oym1 = new oym();
        qlw.a(oym1, abyte0);
        return oym1;
        Object obj;
        obj;
        ntn.b(a, "Malformed AndroidRenderInfo data for notification.", ((Throwable) (obj)));
_L2:
        return null;
        obj;
        ntn.b(a, "AndroidRenderInfo not in db", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

}
