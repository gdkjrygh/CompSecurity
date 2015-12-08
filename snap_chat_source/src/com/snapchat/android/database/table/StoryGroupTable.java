// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import AN;
import Bj;
import Br;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.snapchat.android.database.DataType;
import com.snapchat.android.model.StoryGroup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class StoryGroupTable extends DbTable
{
    public static final class StoryGroupSchema extends Enum
        implements tt
    {

        private static final StoryGroupSchema $VALUES[];
        public static final StoryGroupSchema CUSTOM_DESCRIPTION;
        public static final StoryGroupSchema DISPLAY_NAME;
        public static final StoryGroupSchema ID;
        public static final StoryGroupSchema SHOULD_FETCH_CUSTOM_DESCRIPTION;
        private int a;
        private String b;
        private DataType c;
        private String d;

        static String a(StoryGroupSchema storygroupschema)
        {
            return storygroupschema.b;
        }

        static DataType b(StoryGroupSchema storygroupschema)
        {
            return storygroupschema.c;
        }

        public static StoryGroupSchema valueOf(String s)
        {
            return (StoryGroupSchema)Enum.valueOf(com/snapchat/android/database/table/StoryGroupTable$StoryGroupSchema, s);
        }

        public static StoryGroupSchema[] values()
        {
            return (StoryGroupSchema[])$VALUES.clone();
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
            return d;
        }

        public final DataType getDataType()
        {
            return c;
        }

        static 
        {
            ID = new StoryGroupSchema("ID", "storyGroupId", DataType.TEXT, "PRIMARY KEY");
            DISPLAY_NAME = new StoryGroupSchema("DISPLAY_NAME", 1, 1, "displayName", DataType.TEXT);
            SHOULD_FETCH_CUSTOM_DESCRIPTION = new StoryGroupSchema("SHOULD_FETCH_CUSTOM_DESCRIPTION", 2, 2, "shouldFetchCustomDescription", DataType.BOOLEAN);
            CUSTOM_DESCRIPTION = new StoryGroupSchema("CUSTOM_DESCRIPTION", 3, 3, "customDescription", DataType.TEXT);
            $VALUES = (new StoryGroupSchema[] {
                ID, DISPLAY_NAME, SHOULD_FETCH_CUSTOM_DESCRIPTION, CUSTOM_DESCRIPTION
            });
        }

        private StoryGroupSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private StoryGroupSchema(String s, String s1, DataType datatype, String s2)
        {
            super(s, 0);
            a = 0;
            b = s1;
            c = datatype;
            d = s2;
        }
    }


    private static String a[];
    private static HashMap b;
    private static StoryGroupTable c;

    private StoryGroupTable()
    {
    }

    public static StoryGroupTable a()
    {
        com/snapchat/android/database/table/StoryGroupTable;
        JVM INSTR monitorenter ;
        StoryGroupTable storygrouptable;
        if (c == null)
        {
            c = new StoryGroupTable();
        }
        storygrouptable = c;
        com/snapchat/android/database/table/StoryGroupTable;
        JVM INSTR monitorexit ;
        return storygrouptable;
        Exception exception;
        exception;
        throw exception;
    }

    protected final ContentValues a(Object obj)
    {
        obj = (StoryGroup)obj;
        if (obj == null)
        {
            return null;
        }
        tA ta = new tA();
        ta.a(StoryGroupSchema.ID, ((StoryGroup) (obj)).c());
        ta.a(StoryGroupSchema.DISPLAY_NAME, ((StoryGroup) (obj)).d());
        StoryGroupSchema storygroupschema = StoryGroupSchema.SHOULD_FETCH_CUSTOM_DESCRIPTION;
        int i;
        if (((StoryGroup) (obj)).g())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(storygroupschema, i);
        ta.a(StoryGroupSchema.CUSTOM_DESCRIPTION, ((StoryGroup) (obj)).h());
        return ta.a;
    }

    protected final Object a(Cursor cursor)
    {
        Object obj = cursor.getString(StoryGroupSchema.ID.getColumnNumber());
        String s = cursor.getString(StoryGroupSchema.DISPLAY_NAME.getColumnNumber());
        boolean flag;
        if (cursor.getInt(StoryGroupSchema.SHOULD_FETCH_CUSTOM_DESCRIPTION.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cursor = cursor.getString(StoryGroupSchema.CUSTOM_DESCRIPTION.getColumnNumber());
        obj = new com.snapchat.android.model.StoryGroup.a(((String) (obj)));
        obj.mDisplayName = s;
        obj.mShouldFetchCustomDescription = flag;
        obj.mCustomDescription = cursor;
        return new StoryGroup(((com.snapchat.android.model.StoryGroup.a) (obj)), (byte)0);
    }

    protected final Collection a(Br br)
    {
        return Bj.a().l();
    }

    public final void b(Br br)
    {
        br = Bj.a();
        Object obj = a(null, null);
        ((Bj) (br)).mStories.clear();
        ((Bj) (br)).mStories.put("my_story_ads79sdf", AN.a());
        StoryGroup storygroup;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Bj) (br)).mStories.put(storygroup.c(), storygroup))
        {
            storygroup = (StoryGroup)((Iterator) (obj)).next();
        }

    }

    public final tt[] b()
    {
        return StoryGroupSchema.values();
    }

    public final String c()
    {
        return "StoryGroup";
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        StoryGroupSchema astorygroupschema[] = StoryGroupSchema.values();
        int j = astorygroupschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = astorygroupschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(StoryGroupSchema.a(((StoryGroupSchema) (obj)))).append(" ").append(StoryGroupSchema.b(((StoryGroupSchema) (obj))).toString()).toString());
            obj = ((StoryGroupSchema) (obj)).getConstraints();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }

    static 
    {
        boolean flag = false;
        StoryGroupSchema astorygroupschema[] = StoryGroupSchema.values();
        int k = astorygroupschema.length;
        a = new String[k];
        for (int i = 0; i < k; i++)
        {
            a[i] = astorygroupschema[i].getColumnName();
        }

        b = new HashMap();
        astorygroupschema = StoryGroupSchema.values();
        k = astorygroupschema.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            StoryGroupSchema storygroupschema = astorygroupschema[j];
            b.put(storygroupschema.getColumnName(), storygroupschema.getColumnName());
        }

    }
}
