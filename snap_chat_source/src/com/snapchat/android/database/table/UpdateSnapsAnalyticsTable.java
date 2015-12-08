// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import BZ;
import Br;
import IJ;
import It;
import Jh;
import Ll;
import Ty;
import Tz;
import android.content.ContentValues;
import android.database.Cursor;
import com.google.gson.Gson;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.analytics.framework.UpdateSnapsAnalyticsPlatform;
import com.snapchat.android.database.DataType;
import ep;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class UpdateSnapsAnalyticsTable extends DbTable
{
    public static final class AnalyticsEventSchema extends Enum
        implements tt
    {

        private static final AnalyticsEventSchema $VALUES[];
        public static final AnalyticsEventSchema EVENT_LEVELS_BLOB;
        public static final AnalyticsEventSchema EVENT_NAME;
        public static final AnalyticsEventSchema EVENT_PARAMETERS;
        public static final AnalyticsEventSchema EVENT_TIMERS_BLOB;
        public static final AnalyticsEventSchema EVENT_TIMESTAMP;
        private int a;
        private String b;
        private DataType c;

        static String a(AnalyticsEventSchema analyticseventschema)
        {
            return analyticseventschema.b;
        }

        static DataType b(AnalyticsEventSchema analyticseventschema)
        {
            return analyticseventschema.c;
        }

        public static AnalyticsEventSchema valueOf(String s)
        {
            return (AnalyticsEventSchema)Enum.valueOf(com/snapchat/android/database/table/UpdateSnapsAnalyticsTable$AnalyticsEventSchema, s);
        }

        public static AnalyticsEventSchema[] values()
        {
            return (AnalyticsEventSchema[])$VALUES.clone();
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
            EVENT_NAME = new AnalyticsEventSchema("EVENT_NAME", 0, 1, "EventName", DataType.TEXT);
            EVENT_PARAMETERS = new AnalyticsEventSchema("EVENT_PARAMETERS", 1, 2, "EventParameters", DataType.TEXT);
            EVENT_TIMESTAMP = new AnalyticsEventSchema("EVENT_TIMESTAMP", 2, 3, "EventTimestamp", DataType.TEXT);
            EVENT_TIMERS_BLOB = new AnalyticsEventSchema("EVENT_TIMERS_BLOB", 3, 4, "EventTimersBlob", DataType.BLOB);
            EVENT_LEVELS_BLOB = new AnalyticsEventSchema("EVENT_LEVELS_BLOB", 4, 5, "EventLevelsBlob", DataType.BLOB);
            $VALUES = (new AnalyticsEventSchema[] {
                EVENT_NAME, EVENT_PARAMETERS, EVENT_TIMESTAMP, EVENT_TIMERS_BLOB, EVENT_LEVELS_BLOB
            });
        }

        private AnalyticsEventSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }
    }


    private static UpdateSnapsAnalyticsTable b;
    public UpdateSnapsAnalyticsPlatform a;

    private UpdateSnapsAnalyticsTable()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    public static UpdateSnapsAnalyticsTable a()
    {
        com/snapchat/android/database/table/UpdateSnapsAnalyticsTable;
        JVM INSTR monitorenter ;
        UpdateSnapsAnalyticsTable updatesnapsanalyticstable;
        if (b == null)
        {
            b = new UpdateSnapsAnalyticsTable();
        }
        updatesnapsanalyticstable = b;
        com/snapchat/android/database/table/UpdateSnapsAnalyticsTable;
        JVM INSTR monitorexit ;
        return updatesnapsanalyticstable;
        Exception exception;
        exception;
        throw exception;
    }

    private static byte[] a(Map map)
    {
        if (map == null)
        {
            return null;
        }
        if (map.isEmpty())
        {
            return new byte[0];
        }
        java.util.HashMap hashmap = ep.a();
        java.util.Map.Entry entry;
        List list;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey(), list.get(0)))
        {
            entry = (java.util.Map.Entry)map.next();
            list = (List)entry.getValue();
            if (list.size() != 1)
            {
                throw new IllegalStateException("Multi-element lists are not supported.");
            }
        }

        return Jh.b(hashmap);
    }

    protected final ContentValues a(Object obj)
    {
        Object obj1 = null;
        Ty ty = (Ty)obj;
        if (ty == null)
        {
            return null;
        }
        tA ta = new tA();
        ta.a(AnalyticsEventSchema.EVENT_NAME, ty.a());
        ta.a(AnalyticsEventSchema.EVENT_PARAMETERS, It.a().toJson(ty.b()));
        ta.a(AnalyticsEventSchema.EVENT_TIMESTAMP, Double.toString(IJ.a(ty.e())));
        AnalyticsEventSchema analyticseventschema = AnalyticsEventSchema.EVENT_TIMERS_BLOB;
        if (ty.d())
        {
            obj = a(ty.c().a());
        } else
        {
            obj = null;
        }
        ta.a(analyticseventschema, ((byte []) (obj)));
        analyticseventschema = AnalyticsEventSchema.EVENT_LEVELS_BLOB;
        obj = obj1;
        if (ty.d())
        {
            obj = a(ty.c().b());
        }
        ta.a(analyticseventschema, ((byte []) (obj)));
        return ta.a;
    }

    protected final Object a(Cursor cursor)
    {
        Object obj = cursor.getString(AnalyticsEventSchema.EVENT_NAME.getColumnNumber());
        String s = cursor.getString(AnalyticsEventSchema.EVENT_PARAMETERS.getColumnNumber());
        String s1 = cursor.getString(AnalyticsEventSchema.EVENT_TIMESTAMP.getColumnNumber());
        byte abyte1[] = cursor.getBlob(AnalyticsEventSchema.EVENT_TIMERS_BLOB.getColumnNumber());
        byte abyte0[] = cursor.getBlob(AnalyticsEventSchema.EVENT_LEVELS_BLOB.getColumnNumber());
        cursor = new BZ(((String) (obj)));
        obj = (new BZ._cls1(cursor)).getType();
        cursor.a((Map)It.a().fromJson(s, ((java.lang.reflect.Type) (obj))));
        cursor.mTimestamp = Double.valueOf(s1).doubleValue();
        if (abyte1 != null)
        {
            java.util.Map.Entry entry1;
            for (Iterator iterator1 = Jh.b(abyte1).entrySet().iterator(); iterator1.hasNext(); cursor.a((String)entry1.getKey(), (String)entry1.getValue()))
            {
                entry1 = (java.util.Map.Entry)iterator1.next();
            }

        }
        if (abyte0 != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = Jh.b(abyte0).entrySet().iterator(); iterator.hasNext(); cursor.b((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        return cursor.a();
    }

    protected final Collection a(Br br)
    {
        return a.b();
    }

    public final void b(Br br)
    {
        a.a(a(null, null));
    }

    public final tt[] b()
    {
        return AnalyticsEventSchema.values();
    }

    public final String c()
    {
        return "AnalyticsEvents";
    }

    public final String d()
    {
        String s = "_id INTEGER PRIMARY KEY";
        AnalyticsEventSchema aanalyticseventschema[] = AnalyticsEventSchema.values();
        int j = aanalyticseventschema.length;
        for (int i = 0; i < j; i++)
        {
            AnalyticsEventSchema analyticseventschema = aanalyticseventschema[i];
            s = (new StringBuilder()).append(s).append(",").append(AnalyticsEventSchema.a(analyticseventschema)).append(" ").append(AnalyticsEventSchema.b(analyticseventschema).toString()).toString();
        }

        return s;
    }
}
