// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Br;
import DQ;
import DR;
import DS;
import DV;
import Iz;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.snapchat.android.database.DataType;
import java.util.Collection;
import java.util.LinkedList;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class ScreenshotDetectionSessionTable extends DbTable
{
    public static final class ViewingSessionSchema extends Enum
        implements tt
    {

        private static final ViewingSessionSchema $VALUES[];
        public static final ViewingSessionSchema END_TIME;
        public static final ViewingSessionSchema EXTRA;
        public static final ViewingSessionSchema SENDER;
        public static final ViewingSessionSchema START_TIME;
        public static final ViewingSessionSchema TYPE;
        private int a;
        private String b;
        private DataType c;

        static String a(ViewingSessionSchema viewingsessionschema)
        {
            return viewingsessionschema.b;
        }

        static DataType b(ViewingSessionSchema viewingsessionschema)
        {
            return viewingsessionschema.c;
        }

        public static ViewingSessionSchema valueOf(String s)
        {
            return (ViewingSessionSchema)Enum.valueOf(com/snapchat/android/database/table/ScreenshotDetectionSessionTable$ViewingSessionSchema, s);
        }

        public static ViewingSessionSchema[] values()
        {
            return (ViewingSessionSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return b;
        }

        public final int getColumnNumber()
        {
            return a;
        }

        public final String getConstraints()
        {
            return null;
        }

        public final DataType getDataType()
        {
            return c;
        }

        static 
        {
            SENDER = new ViewingSessionSchema("SENDER", 0, 1, "Sender", DataType.TEXT);
            START_TIME = new ViewingSessionSchema("START_TIME", 1, 2, "StartTime", DataType.INTEGER);
            END_TIME = new ViewingSessionSchema("END_TIME", 2, 3, "EndTime", DataType.INTEGER);
            TYPE = new ViewingSessionSchema("TYPE", 3, 4, "Type", DataType.TEXT);
            EXTRA = new ViewingSessionSchema("EXTRA", 4, 5, "Extra", DataType.TEXT);
            $VALUES = (new ViewingSessionSchema[] {
                SENDER, START_TIME, END_TIME, TYPE, EXTRA
            });
        }

        private ViewingSessionSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }
    }


    private static ScreenshotDetectionSessionTable a;
    private long b;

    private ScreenshotDetectionSessionTable()
    {
        b = 0L;
    }

    public static ScreenshotDetectionSessionTable a()
    {
        com/snapchat/android/database/table/ScreenshotDetectionSessionTable;
        JVM INSTR monitorenter ;
        ScreenshotDetectionSessionTable screenshotdetectionsessiontable;
        if (a == null)
        {
            a = new ScreenshotDetectionSessionTable();
        }
        screenshotdetectionsessiontable = a;
        com/snapchat/android/database/table/ScreenshotDetectionSessionTable;
        JVM INSTR monitorexit ;
        return screenshotdetectionsessiontable;
        Exception exception;
        exception;
        throw exception;
    }

    protected final ContentValues a(Object obj)
    {
        DR dr = (DR)obj;
        if (dr != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        tA ta;
        ta = new tA();
        if (!(dr instanceof DV))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = "SnapViewingSession";
_L4:
        ta.a(ViewingSessionSchema.SENDER, dr.a);
        ta.a(ViewingSessionSchema.START_TIME, dr.b);
        ta.a(ViewingSessionSchema.END_TIME, dr.c);
        ta.a(ViewingSessionSchema.TYPE, ((String) (obj)));
        ta.a(ViewingSessionSchema.EXTRA, dr.a());
        return ta.a;
        if (!(dr instanceof DQ)) goto _L1; else goto _L3
_L3:
        obj = "ChatViewingSession";
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected final Object a(Cursor cursor)
    {
        String s = cursor.getString(ViewingSessionSchema.SENDER.getColumnNumber());
        long l = cursor.getLong(ViewingSessionSchema.START_TIME.getColumnNumber());
        long l1 = cursor.getLong(ViewingSessionSchema.END_TIME.getColumnNumber());
        String s1 = cursor.getString(ViewingSessionSchema.TYPE.getColumnNumber());
        if (b <= 10000L + l1)
        {
            if (TextUtils.equals(s1, "SnapViewingSession"))
            {
                cursor = cursor.getString(ViewingSessionSchema.EXTRA.getColumnNumber());
                cursor = (DV.a)(new Iz()).a(cursor, DV$a, false);
                if (cursor == null)
                {
                    return new DV(s, l, l1);
                } else
                {
                    return new DV(((DV.a) (cursor)).c, ((DV.a) (cursor)).f, ((DV.a) (cursor)).e, l, l1, ((DV.a) (cursor)).a, ((DV.a) (cursor)).b, ((DV.a) (cursor)).d, ((DV.a) (cursor)).h, ((DV.a) (cursor)).g, null, null, 0);
                }
            }
            if (TextUtils.equals(s1, "ChatViewingSession"))
            {
                return new DQ(s, l, l1);
            }
        }
        return null;
    }

    protected final Collection a(Br br)
    {
        return DS.a().b();
    }

    public final void b(Br br)
    {
        b = System.currentTimeMillis();
        DS ds = DS.a();
        java.util.List list = a(null, null);
        synchronized (ds.b)
        {
            ds.b.clear();
            ds.b.addAll(list);
        }
        return;
        exception;
        br;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final tt[] b()
    {
        return ViewingSessionSchema.values();
    }

    public final String c()
    {
        return "ViewingSessions";
    }

    public final String d()
    {
        String s = "_id INTEGER PRIMARY KEY";
        ViewingSessionSchema aviewingsessionschema[] = ViewingSessionSchema.values();
        int j = aviewingsessionschema.length;
        for (int i = 0; i < j; i++)
        {
            ViewingSessionSchema viewingsessionschema = aviewingsessionschema[i];
            s = (new StringBuilder()).append(s).append(",").append(ViewingSessionSchema.a(viewingsessionschema)).append(" ").append(ViewingSessionSchema.b(viewingsessionschema).toString()).toString();
        }

        return s;
    }
}
