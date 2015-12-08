// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ads;

import Br;
import android.content.ContentValues;
import android.database.Cursor;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.table.DbTable;
import ep;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kU;
import kZ;
import tA;
import tt;

public final class StoryAdStreamDataTable extends DbTable
{
    public static final class StoryAdStreamDataTableSchema extends Enum
        implements tt
    {

        private static final StoryAdStreamDataTableSchema $VALUES[];
        public static final StoryAdStreamDataTableSchema NEXT_UNVIEWED_POSITION;
        public static final StoryAdStreamDataTableSchema STREAM_KEY;
        private String mColumnName;
        private int mColumnNumber;
        private String mConstraints;
        private DataType mDataType;

        public static StoryAdStreamDataTableSchema valueOf(String s)
        {
            return (StoryAdStreamDataTableSchema)Enum.valueOf(com/snapchat/android/ads/StoryAdStreamDataTable$StoryAdStreamDataTableSchema, s);
        }

        public static StoryAdStreamDataTableSchema[] values()
        {
            return (StoryAdStreamDataTableSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return mColumnName;
        }

        public final int getColumnNumber()
        {
            return mColumnNumber;
        }

        public final String getConstraints()
        {
            return mConstraints;
        }

        public final DataType getDataType()
        {
            return mDataType;
        }

        static 
        {
            STREAM_KEY = new StoryAdStreamDataTableSchema("STREAM_KEY", 0, 0, "streamKey", DataType.TEXT, "PRIMARY KEY");
            NEXT_UNVIEWED_POSITION = new StoryAdStreamDataTableSchema("NEXT_UNVIEWED_POSITION", "nextUnviewedPosition", DataType.INTEGER);
            $VALUES = (new StoryAdStreamDataTableSchema[] {
                STREAM_KEY, NEXT_UNVIEWED_POSITION
            });
        }

        private StoryAdStreamDataTableSchema(String s, int i, int j, String s1, DataType datatype, String s2)
        {
            super(s, i);
            mColumnNumber = j;
            mColumnName = s1;
            mDataType = datatype;
            mConstraints = s2;
        }

        private StoryAdStreamDataTableSchema(String s, String s1, DataType datatype)
        {
            this(s, 1, 1, s1, datatype, null);
        }
    }

    public static final class a
    {

        public int nextUnviewedPosition;
        public String streamKey;

        public a(String s, int i)
        {
            streamKey = s;
            nextUnviewedPosition = i;
        }
    }


    private static final StoryAdStreamDataTable INSTANCE = new StoryAdStreamDataTable();
    private final String NAME;
    private final String TAG;
    private final kZ mAdStreamManager;

    private StoryAdStreamDataTable()
    {
        this(kZ.a());
    }

    private StoryAdStreamDataTable(kZ kz)
    {
        TAG = "StoryAdStreamDataTable";
        NAME = "StoryAdStreamData";
        mAdStreamManager = kz;
    }

    public static StoryAdStreamDataTable a()
    {
        return INSTANCE;
    }

    protected final ContentValues a(Object obj)
    {
        obj = (a)obj;
        if (obj == null)
        {
            return null;
        } else
        {
            tA ta = new tA();
            ta.a(StoryAdStreamDataTableSchema.STREAM_KEY, ((a) (obj)).streamKey);
            ta.a(StoryAdStreamDataTableSchema.NEXT_UNVIEWED_POSITION, ((a) (obj)).nextUnviewedPosition);
            return ta.a;
        }
    }

    protected final Object a(Cursor cursor)
    {
        return new a(cursor.getString(StoryAdStreamDataTableSchema.STREAM_KEY.getColumnNumber()), cursor.getInt(StoryAdStreamDataTableSchema.NEXT_UNVIEWED_POSITION.getColumnNumber()));
    }

    protected final Collection a(Br br)
    {
        br = new HashSet();
        Map map = mAdStreamManager.mStreams;
        if (map != null)
        {
            Iterator iterator = map.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                kU ku = (kU)map.get(s);
                if (ku != null)
                {
                    br.add(new a(s, ku.a()));
                }
            } while (true);
        }
        return br;
    }

    public final void b(Br br)
    {
        Object obj = a(null, null);
        br = ep.a();
        if (obj != null)
        {
            a a1;
            kU ku;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); br.put(a1.streamKey, ku))
            {
                a1 = (a)((Iterator) (obj)).next();
                ku = kU.a(a1.nextUnviewedPosition);
            }

        }
        mAdStreamManager.mStreams = br;
    }

    public final tt[] b()
    {
        return StoryAdStreamDataTableSchema.values();
    }

    public final String c()
    {
        return "StoryAdStreamData";
    }

}
