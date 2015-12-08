// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.vtable;

import Io;
import Jh;
import android.database.Cursor;
import android.text.TextUtils;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.vtable.DbVirtualTable;
import java.util.HashMap;
import ts;
import tt;
import vx;

public final class DSnapPageVirtualTable extends DbVirtualTable
{
    public static final class DSnapPageSchema extends Enum
        implements tt
    {

        private static final DSnapPageSchema $VALUES[];
        public static final DSnapPageSchema AD_KEY;
        public static final DSnapPageSchema AD_LINE_ITEM_ID;
        public static final DSnapPageSchema AD_PLACEMENT_ID;
        public static final DSnapPageSchema AD_POSITION;
        public static final DSnapPageSchema AD_TARGETING;
        public static final DSnapPageSchema AD_TYPE;
        public static final DSnapPageSchema AD_UNIT_ID;
        public static final DSnapPageSchema COLOR;
        public static final DSnapPageSchema EDITION_ID;
        public static final DSnapPageSchema HASH;
        public static final DSnapPageSchema ID;
        public static final DSnapPageSchema LONGFORM_MEDIA_TYPE;
        public static final DSnapPageSchema LONGFORM_URI;
        public static final DSnapPageSchema LONGFORM_VIDEO_ID;
        public static final DSnapPageSchema POSITION;
        public static final DSnapPageSchema PUBLISHER_NAME;
        public static final DSnapPageSchema SHAREABLE;
        public static final DSnapPageSchema TOP_SNAP_DOCKING;
        public static final DSnapPageSchema TOP_SNAP_MEDIA_TYPE;
        public static final DSnapPageSchema TOP_SNAP_MODE;
        public static final DSnapPageSchema TOP_SNAP_OVERLAY_DOCKING;
        public static final DSnapPageSchema TOP_SNAP_OVERLAY_URI;
        public static final DSnapPageSchema TOP_SNAP_URI;
        public static final DSnapPageSchema TOP_SNAP_VIDEO_FIRST_FRAME_URI;
        public static final DSnapPageSchema TOP_SNAP_VIDEO_SHARE_FRAME_URI;
        public static final DSnapPageSchema TYPE;
        public static final DSnapPageSchema URL;
        private String a;
        private DataType b;
        private String c;

        public static DSnapPageSchema valueOf(String s)
        {
            return (DSnapPageSchema)Enum.valueOf(com/snapchat/android/discover/model/database/vtable/DSnapPageVirtualTable$DSnapPageSchema, s);
        }

        public static DSnapPageSchema[] values()
        {
            return (DSnapPageSchema[])$VALUES.clone();
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
            ID = new DSnapPageSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            TYPE = new DSnapPageSchema("TYPE", 1, "type", DataType.TEXT);
            PUBLISHER_NAME = new DSnapPageSchema("PUBLISHER_NAME", 2, "publisher_name", DataType.TEXT);
            POSITION = new DSnapPageSchema("POSITION", 3, "position", DataType.INTEGER);
            EDITION_ID = new DSnapPageSchema("EDITION_ID", 4, "edition_id", DataType.TEXT);
            URL = new DSnapPageSchema("URL", 5, "url", DataType.TEXT);
            HASH = new DSnapPageSchema("HASH", 6, "hash", DataType.TEXT);
            AD_KEY = new DSnapPageSchema("AD_KEY", 7, "ad_key", DataType.TEXT);
            AD_PLACEMENT_ID = new DSnapPageSchema("AD_PLACEMENT_ID", 8, "ad_placement_id", DataType.TEXT);
            AD_LINE_ITEM_ID = new DSnapPageSchema("AD_LINE_ITEM_ID", 9, "ad_line_item_id", DataType.TEXT);
            COLOR = new DSnapPageSchema("COLOR", 10, "color", DataType.TEXT);
            AD_TYPE = new DSnapPageSchema("AD_TYPE", 11, "ad_type", DataType.INTEGER);
            AD_POSITION = new DSnapPageSchema("AD_POSITION", 12, "ad_position", DataType.INTEGER);
            SHAREABLE = new DSnapPageSchema("SHAREABLE", 13, "shareable", DataType.BOOLEAN);
            TOP_SNAP_URI = new DSnapPageSchema("TOP_SNAP_URI", 14, "top_snap_uri", DataType.TEXT);
            TOP_SNAP_MEDIA_TYPE = new DSnapPageSchema("TOP_SNAP_MEDIA_TYPE", 15, "top_snap_media_type", DataType.TEXT);
            TOP_SNAP_DOCKING = new DSnapPageSchema("TOP_SNAP_DOCKING", 16, "top_snap_docking", DataType.TEXT);
            TOP_SNAP_MODE = new DSnapPageSchema("TOP_SNAP_MODE", 17, "top_snap_mode", DataType.TEXT);
            TOP_SNAP_VIDEO_FIRST_FRAME_URI = new DSnapPageSchema("TOP_SNAP_VIDEO_FIRST_FRAME_URI", 18, "top_snap_video_first_frame_uri", DataType.TEXT);
            TOP_SNAP_VIDEO_SHARE_FRAME_URI = new DSnapPageSchema("TOP_SNAP_VIDEO_SHARE_FRAME_URI", 19, "top_snap_video_share_frame_uri", DataType.TEXT);
            TOP_SNAP_OVERLAY_URI = new DSnapPageSchema("TOP_SNAP_OVERLAY_URI", 20, "top_snap_overlay_uri", DataType.TEXT);
            TOP_SNAP_OVERLAY_DOCKING = new DSnapPageSchema("TOP_SNAP_OVERLAY_DOCKING", 21, "top_snap_overlay_docking", DataType.TEXT);
            LONGFORM_URI = new DSnapPageSchema("LONGFORM_URI", 22, "longform_uri", DataType.TEXT);
            LONGFORM_MEDIA_TYPE = new DSnapPageSchema("LONGFORM_MEDIA_TYPE", 23, "longform_media_type", DataType.TEXT);
            LONGFORM_VIDEO_ID = new DSnapPageSchema("LONGFORM_VIDEO_ID", 24, "longform_video_id", DataType.TEXT);
            AD_UNIT_ID = new DSnapPageSchema("AD_UNIT_ID", 25, "ad_unit_id", DataType.TEXT);
            AD_TARGETING = new DSnapPageSchema("AD_TARGETING", 26, "targeting_parameters", DataType.MAP);
            $VALUES = (new DSnapPageSchema[] {
                ID, TYPE, PUBLISHER_NAME, POSITION, EDITION_ID, URL, HASH, AD_KEY, AD_PLACEMENT_ID, AD_LINE_ITEM_ID, 
                COLOR, AD_TYPE, AD_POSITION, SHAREABLE, TOP_SNAP_URI, TOP_SNAP_MEDIA_TYPE, TOP_SNAP_DOCKING, TOP_SNAP_MODE, TOP_SNAP_VIDEO_FIRST_FRAME_URI, TOP_SNAP_VIDEO_SHARE_FRAME_URI, 
                TOP_SNAP_OVERLAY_URI, TOP_SNAP_OVERLAY_DOCKING, LONGFORM_URI, LONGFORM_MEDIA_TYPE, LONGFORM_VIDEO_ID, AD_UNIT_ID, AD_TARGETING
            });
        }

        private DSnapPageSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private DSnapPageSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


    public static final String a[];
    public static final HashMap b;
    private static final com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema c[];
    private static final String d[];
    private static DSnapPageVirtualTable e;
    private static final String f = e();

    private DSnapPageVirtualTable()
    {
        vx.a();
        this((byte)0);
    }

    private DSnapPageVirtualTable(byte byte0)
    {
    }

    public static com.snapchat.android.discover.model.DSnapPage.a a(Cursor cursor)
    {
label0:
        {
            String s = cursor.getString(DSnapPageSchema.ID.getColumnNumber());
            String s1 = cursor.getString(DSnapPageSchema.TYPE.getColumnNumber());
            int i = cursor.getInt(DSnapPageSchema.POSITION.getColumnNumber());
            String s2 = cursor.getString(DSnapPageSchema.EDITION_ID.getColumnNumber());
            String s3 = cursor.getString(DSnapPageSchema.PUBLISHER_NAME.getColumnNumber());
            String s4 = cursor.getString(DSnapPageSchema.URL.getColumnNumber());
            String s5 = cursor.getString(DSnapPageSchema.HASH.getColumnNumber());
            String s6 = cursor.getString(DSnapPageSchema.AD_KEY.getColumnNumber());
            String s7 = cursor.getString(DSnapPageSchema.AD_PLACEMENT_ID.getColumnNumber());
            String s8 = cursor.getString(DSnapPageSchema.AD_LINE_ITEM_ID.getColumnNumber());
            String s9 = cursor.getString(DSnapPageSchema.COLOR.getColumnNumber());
            int j = cursor.getInt(DSnapPageSchema.AD_TYPE.getColumnNumber());
            int k = cursor.getInt(DSnapPageSchema.AD_POSITION.getColumnNumber());
            String s10 = cursor.getString(DSnapPageSchema.AD_UNIT_ID.getColumnNumber());
            java.util.Map map = Jh.a(cursor.getString(DSnapPageSchema.AD_TARGETING.getColumnNumber()));
            Object obj;
            com.snapchat.android.discover.model.DSnapPage.a a1;
            String s11;
            String s12;
            String s13;
            String s14;
            String s15;
            String s16;
            String s17;
            String s18;
            boolean flag;
            if (cursor.getInt(DSnapPageSchema.SHAREABLE.getColumnNumber()) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s15 = cursor.getString(DSnapPageSchema.TOP_SNAP_URI.getColumnNumber());
            s16 = cursor.getString(DSnapPageSchema.TOP_SNAP_MEDIA_TYPE.getColumnNumber());
            s11 = cursor.getString(DSnapPageSchema.TOP_SNAP_DOCKING.getColumnNumber());
            s12 = cursor.getString(DSnapPageSchema.TOP_SNAP_MODE.getColumnNumber());
            s13 = cursor.getString(DSnapPageSchema.TOP_SNAP_VIDEO_FIRST_FRAME_URI.getColumnNumber());
            s14 = cursor.getString(DSnapPageSchema.TOP_SNAP_VIDEO_SHARE_FRAME_URI.getColumnNumber());
            s17 = cursor.getString(DSnapPageSchema.TOP_SNAP_OVERLAY_URI.getColumnNumber());
            s18 = cursor.getString(DSnapPageSchema.TOP_SNAP_OVERLAY_DOCKING.getColumnNumber());
            a1 = null;
            obj = a1;
            if (s15 != null)
            {
                obj = a1;
                if (s16 != null)
                {
                    obj = new com.snapchat.android.discover.model.DSnapPanel.a();
                    obj.a = s15;
                    obj.c = s17;
                    if (!TextUtils.isEmpty(s18))
                    {
                        obj.d = com.snapchat.android.discover.model.DSnapPanel.Docking.valueOfIgnoreCase(s18);
                    }
                    obj = ((com.snapchat.android.discover.model.DSnapPanel.a) (obj)).a(s16);
                    obj.h = s13;
                    obj.i = s14;
                    if (s11 != null)
                    {
                        obj.g = com.snapchat.android.discover.model.DSnapPanel.Docking.valueOfIgnoreCase(s11);
                    }
                    if (s12 != null)
                    {
                        obj.f = com.snapchat.android.discover.model.DSnapPanel.Mode.valueOfIgnoreCase(s12);
                    }
                    obj = ((com.snapchat.android.discover.model.DSnapPanel.a) (obj)).a();
                }
            }
            s11 = cursor.getString(DSnapPageSchema.LONGFORM_URI.getColumnNumber());
            s12 = cursor.getString(DSnapPageSchema.LONGFORM_MEDIA_TYPE.getColumnNumber());
            s13 = cursor.getString(DSnapPageSchema.LONGFORM_VIDEO_ID.getColumnNumber());
            a1 = null;
            cursor = a1;
            if (s12 == null)
            {
                break label0;
            }
            if (s11 == null)
            {
                cursor = a1;
                if (s13 == null)
                {
                    break label0;
                }
            }
            cursor = new com.snapchat.android.discover.model.DSnapPanel.a();
            cursor.a = s11;
            cursor = cursor.a(s12);
            cursor.b = s13;
            cursor = cursor.a();
        }
        a1 = new com.snapchat.android.discover.model.DSnapPage.a();
        a1.a = s;
        a1.b = s1;
        a1.c = Integer.valueOf(i + 1);
        a1.e = s2;
        a1.f = s3;
        a1.g = s4;
        a1.h = s5;
        a1.i = s6;
        a1.j = s7;
        a1.k = s8;
        a1.l = s9;
        a1.d = k;
        a1.s = flag;
        a1.n = Integer.valueOf(j);
        a1.q = s10;
        a1.r = map;
        if (obj != null)
        {
            a1.a(com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP.getKey(), ((com.snapchat.android.discover.model.DSnapPanel) (obj)));
        }
        if (cursor != null)
        {
            a1.a(com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM.getKey(), cursor);
        }
        return a1;
    }

    private static StringBuilder a(com.snapchat.android.discover.model.DSnapPage.Form form)
    {
        String s = Io.a(form);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("(SELECT ");
        com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema adsnapitemschema[] = c;
        for (int i = 0; i < 9; i++)
        {
            String s1 = adsnapitemschema[i].getColumnName();
            stringbuilder.append(s1).append(" AS ").append(s).append('_').append(s1).append(", ");
        }

        stringbuilder.append(com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.HASH.getColumnName()).append(" FROM DSnapItem WHERE ").append(com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.FORM.getColumnName()).append('=').append("'").append(form.name()).append("') AS ").append(s);
        return stringbuilder;
    }

    public static DSnapPageVirtualTable d()
    {
        if (e == null)
        {
            e = new DSnapPageVirtualTable();
        }
        return e;
    }

    private static String e()
    {
        boolean flag = false;
        StringBuilder stringbuilder = (new StringBuilder(" CREATE VIEW DSnapPage AS SELECT ")).append(ts.a("Edition", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME));
        Object aobj[] = com.snapchat.android.discover.model.database.table.DSnapTable.DSnapSchema.values();
        int l = aobj.length;
        for (int i = 0; i < l; i++)
        {
            com.snapchat.android.discover.model.database.table.DSnapTable.DSnapSchema dsnapschema = aobj[i];
            stringbuilder.append(',').append(ts.a("chunk_dsnap_items", dsnapschema));
        }

        aobj = com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.values();
        l = aobj.length;
        for (int j = 0; j < l; j++)
        {
            com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema editionchunkschema = aobj[j];
            if (editionchunkschema != com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.ID)
            {
                stringbuilder.append(',').append(ts.a("chunk_dsnap_items", editionchunkschema));
            }
        }

        stringbuilder.append(',').append("Edition.").append(com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME.getColumnName());
        aobj = d;
        l = aobj.length;
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            String s = aobj[k];
            stringbuilder.append(',').append("chunk_dsnap_items.").append(s);
        }

        return stringbuilder.append(" FROM Edition LEFT JOIN ").append((new StringBuilder("( SELECT * FROM EditionChunk LEFT JOIN ")).append((new StringBuilder("( SELECT * FROM DSnap LEFT JOIN ")).append((new StringBuilder("(SELECT * FROM ")).append(a(com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP)).append(" LEFT JOIN ").append(a(com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM)).append(" ON ").append(Io.a(com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP)).append('.').append(com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.HASH).append(" = ").append(Io.a(com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM)).append('.').append(com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.HASH.getColumnName()).append(')').append(" AS dsnap_items")).append(" ON ").append(ts.a("DSnap", com.snapchat.android.discover.model.database.table.DSnapTable.DSnapSchema.HASH)).append(" = ").append(ts.a("dsnap_items", com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.HASH)).append(')').append(" AS dsnap_and_dsnap_items")).append(" ON ").append(ts.a("EditionChunk", com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.HASH)).append(" = ").append(ts.a("dsnap_and_dsnap_items", com.snapchat.android.discover.model.database.table.DSnapTable.DSnapSchema.HASH)).append(')').append(" AS chunk_dsnap_items")).append(" ON ").append(ts.a("Edition", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.ID)).append(" = ").append(ts.a("chunk_dsnap_items", com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.EDITION_ID)).toString();
    }

    public final String a()
    {
        return "DSnapPage";
    }

    public final String b()
    {
        return f;
    }

    public final tt[] c()
    {
        return DSnapPageSchema.values();
    }

    static 
    {
        boolean flag = false;
        c = (new com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema[] {
            com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.VIDEO_FIRST_FRAME_URI, com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.VIDEO_SHARE_FRAME_URI, com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.URI, com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.MEDIA_TYPE, com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.DOCKING, com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.MODE, com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.VIDEO_ID, com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.OVERLAY_URI, com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema.OVERLAY_DOCKING
        });
        Object aobj[] = com.snapchat.android.discover.model.DSnapPage.Form.values();
        String as[] = new String[aobj.length * 9];
        int i1 = aobj.length;
        int k = 0;
        int i = 0;
        for (; k < i1; k++)
        {
            String s1 = Io.a(aobj[k]);
            com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema adsnapitemschema[] = c;
            for (int l = 0; l < 9;)
            {
                com.snapchat.android.discover.model.database.table.DSnapItemTable.DSnapItemSchema dsnapitemschema = adsnapitemschema[l];
                as[i] = (new StringBuilder()).append(s1).append("_").append(dsnapitemschema.getColumnName()).toString();
                l++;
                i++;
            }

        }

        d = as;
        aobj = DSnapPageSchema.values();
        k = aobj.length;
        a = new String[k];
        b = new HashMap(aobj.length);
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            String s = aobj[j].getColumnName();
            a[j] = s;
            b.put(s, s);
        }

    }
}
