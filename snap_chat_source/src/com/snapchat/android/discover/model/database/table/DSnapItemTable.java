// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import Br;
import UX;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.table.DbTable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.apache.http.util.TextUtils;
import tA;
import tt;
import vy;

public final class DSnapItemTable extends DbTable
{
    public static final class DSnapItemSchema extends Enum
        implements tt
    {

        private static final DSnapItemSchema $VALUES[];
        public static final DSnapItemSchema DOCKING;
        public static final DSnapItemSchema FORM;
        public static final DSnapItemSchema HASH;
        public static final DSnapItemSchema ID;
        public static final DSnapItemSchema MEDIA_TYPE;
        public static final DSnapItemSchema MODE;
        public static final DSnapItemSchema OVERLAY_DOCKING;
        public static final DSnapItemSchema OVERLAY_URI;
        public static final DSnapItemSchema URI;
        public static final DSnapItemSchema VIDEO_FIRST_FRAME_URI;
        public static final DSnapItemSchema VIDEO_ID;
        public static final DSnapItemSchema VIDEO_SHARE_FRAME_URI;
        private String a;
        private DataType b;
        private String c;

        static String a(DSnapItemSchema dsnapitemschema)
        {
            return dsnapitemschema.a;
        }

        static DataType b(DSnapItemSchema dsnapitemschema)
        {
            return dsnapitemschema.b;
        }

        public static DSnapItemSchema valueOf(String s)
        {
            return (DSnapItemSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/DSnapItemTable$DSnapItemSchema, s);
        }

        public static DSnapItemSchema[] values()
        {
            return (DSnapItemSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return a;
        }

        public final int getColumnNumber()
        {
            return ordinal();
        }

        public final String getConstraints()
        {
            return c;
        }

        public final DataType getDataType()
        {
            return b;
        }

        static 
        {
            ID = new DSnapItemSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            FORM = new DSnapItemSchema("FORM", 1, "form", DataType.TEXT);
            MEDIA_TYPE = new DSnapItemSchema("MEDIA_TYPE", 2, "media_type", DataType.TEXT);
            URI = new DSnapItemSchema("URI", 3, "uri", DataType.TEXT);
            VIDEO_ID = new DSnapItemSchema("VIDEO_ID", 4, "video_id", DataType.TEXT);
            DOCKING = new DSnapItemSchema("DOCKING", 5, "docking", DataType.TEXT);
            MODE = new DSnapItemSchema("MODE", 6, "mode", DataType.TEXT);
            VIDEO_FIRST_FRAME_URI = new DSnapItemSchema("VIDEO_FIRST_FRAME_URI", 7, "video_first_frame_uri", DataType.TEXT);
            VIDEO_SHARE_FRAME_URI = new DSnapItemSchema("VIDEO_SHARE_FRAME_URI", 8, "video_share_frame_uri", DataType.TEXT);
            OVERLAY_URI = new DSnapItemSchema("OVERLAY_URI", 9, "overlay_uri", DataType.TEXT);
            OVERLAY_DOCKING = new DSnapItemSchema("OVERLAY_DOCKING", 10, "overlay_docking", DataType.TEXT);
            HASH = new DSnapItemSchema("HASH", 11, "hash", DataType.TEXT);
            $VALUES = (new DSnapItemSchema[] {
                ID, FORM, MEDIA_TYPE, URI, VIDEO_ID, DOCKING, MODE, VIDEO_FIRST_FRAME_URI, VIDEO_SHARE_FRAME_URI, OVERLAY_URI, 
                OVERLAY_DOCKING, HASH
            });
        }

        private DSnapItemSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private DSnapItemSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


    private static String a[];
    private static HashMap b;
    private static DSnapItemTable c;

    protected DSnapItemTable()
    {
    }

    private static ContentValues a(UX ux)
    {
        if (ux == null || !ux.d() || ux.c().size() == 0 || !ux.b())
        {
            return null;
        }
        tA ta = new tA();
        ux = new vy(ux);
        com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype = ((vy) (ux)).a;
        if (mediatype != null && mediatype != com.snapchat.android.discover.model.DSnapPanel.MediaType.OVERLAY_ITEM)
        {
            ta.a(DSnapItemSchema.MEDIA_TYPE, ((vy) (ux)).a.name());
        }
        if (((vy) (ux)).j)
        {
            ta.a(DSnapItemSchema.OVERLAY_URI, ((vy) (ux)).b);
            ta.a(DSnapItemSchema.OVERLAY_DOCKING, ((vy) (ux)).c);
        }
        if (mediatype == com.snapchat.android.discover.model.DSnapPanel.MediaType.IMAGE || mediatype == com.snapchat.android.discover.model.DSnapPanel.MediaType.VIDEO || mediatype == com.snapchat.android.discover.model.DSnapPanel.MediaType.LOCAL_WEBPAGE)
        {
            ta.a(DSnapItemSchema.URI, ((vy) (ux)).d);
        }
        ta.a(DSnapItemSchema.VIDEO_FIRST_FRAME_URI, ((vy) (ux)).e).a(DSnapItemSchema.VIDEO_SHARE_FRAME_URI, ((vy) (ux)).f).a(DSnapItemSchema.VIDEO_ID, ((vy) (ux)).g).a(DSnapItemSchema.MODE, ((vy) (ux)).h).a(DSnapItemSchema.DOCKING, ((vy) (ux)).i);
        return ta.a;
    }

    public static DSnapItemTable a()
    {
        com/snapchat/android/discover/model/database/table/DSnapItemTable;
        JVM INSTR monitorenter ;
        DSnapItemTable dsnapitemtable;
        if (c == null)
        {
            c = new DSnapItemTable();
        }
        dsnapitemtable = c;
        com/snapchat/android/discover/model/database/table/DSnapItemTable;
        JVM INSTR monitorexit ;
        return dsnapitemtable;
        Exception exception;
        exception;
        throw exception;
    }

    protected static void a(SQLiteDatabase sqlitedatabase, String s, UX ux)
    {
        ContentValues contentvalues = a(ux);
        if (contentvalues != null && ux != null)
        {
            ux = com.snapchat.android.discover.model.DSnapPage.Form.valueOfIgnoreCase(ux.a());
            contentvalues.put(DSnapItemSchema.HASH.getColumnName(), s);
            contentvalues.put(DSnapItemSchema.FORM.getColumnName(), ux.name());
            contentvalues.put(DSnapItemSchema.ID.getColumnName(), (new StringBuilder()).append(s).append("-").append(ux.name()).toString());
            if (sqlitedatabase.insertWithOnConflict("DSnapItem", null, contentvalues, 5) == -1L)
            {
                throw new SQLiteException("Insertion in DB failed for DSnapItem");
            }
        }
    }

    protected final volatile ContentValues a(Object obj)
    {
        return a((UX)obj);
    }

    protected final Collection a(Br br)
    {
        return null;
    }

    public final void b(Br br)
    {
    }

    public final tt[] b()
    {
        return DSnapItemSchema.values();
    }

    public final String c()
    {
        return "DSnapItem";
    }

    public final void c(Br br)
    {
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        DSnapItemSchema adsnapitemschema[] = DSnapItemSchema.values();
        int j = adsnapitemschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = adsnapitemschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(DSnapItemSchema.a(((DSnapItemSchema) (obj)))).append(" ").append(DSnapItemSchema.b(((DSnapItemSchema) (obj))).toString()).toString());
            obj = ((DSnapItemSchema) (obj)).getConstraints();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }

    public final boolean l()
    {
        return false;
    }

    static 
    {
        DSnapItemSchema adsnapitemschema[] = DSnapItemSchema.values();
        int j = adsnapitemschema.length;
        a = new String[j];
        b = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            DSnapItemSchema dsnapitemschema = adsnapitemschema[i];
            a[i] = adsnapitemschema[i].getColumnName();
            b.put(dsnapitemschema.getColumnName(), dsnapitemschema.getColumnName());
        }

    }
}
