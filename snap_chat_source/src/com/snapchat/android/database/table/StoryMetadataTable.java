// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Bj;
import Br;
import EM;
import Iz;
import SV;
import Tw;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.model.StoryCollection;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class StoryMetadataTable extends DbTable
{
    public static final class StoryMetadataTableSchema extends Enum
        implements tt
    {

        private static final StoryMetadataTableSchema $VALUES[];
        public static final StoryMetadataTableSchema AD_INTERVAL_INDEX;
        public static final StoryMetadataTableSchema DISPLAY_NAME;
        public static final StoryMetadataTableSchema HAS_CUSTOM_DESCRIPTION;
        public static final StoryMetadataTableSchema ID;
        public static final StoryMetadataTableSchema IS_LIVE_AND_EXPLORER_ENABLED;
        public static final StoryMetadataTableSchema IS_LOCAL;
        public static final StoryMetadataTableSchema NEXT_AD_OPPORTUNITY_POSITION;
        public static final StoryMetadataTableSchema NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY;
        public static final StoryMetadataTableSchema SERIALIZED_AD_METADATA;
        public static final StoryMetadataTableSchema SHARED_ID;
        public static final StoryMetadataTableSchema THUMBNAILS;
        private int a;
        private String b;
        private DataType c;
        private String d;

        public static StoryMetadataTableSchema valueOf(String s)
        {
            return (StoryMetadataTableSchema)Enum.valueOf(com/snapchat/android/database/table/StoryMetadataTable$StoryMetadataTableSchema, s);
        }

        public static StoryMetadataTableSchema[] values()
        {
            return (StoryMetadataTableSchema[])$VALUES.clone();
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
            ID = new StoryMetadataTableSchema("ID", "username", DataType.TEXT, "PRIMARY KEY");
            SERIALIZED_AD_METADATA = new StoryMetadataTableSchema("SERIALIZED_AD_METADATA", 1, 1, "adMetadata", DataType.TEXT);
            AD_INTERVAL_INDEX = new StoryMetadataTableSchema("AD_INTERVAL_INDEX", 2, 2, "adIntervalIndex", DataType.INTEGER);
            THUMBNAILS = new StoryMetadataTableSchema("THUMBNAILS", 3, 3, "thumbnails", DataType.TEXT);
            NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY = new StoryMetadataTableSchema("NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY", 4, 4, "numSnapsSinceLastAdOpportunity", DataType.INTEGER);
            NEXT_AD_OPPORTUNITY_POSITION = new StoryMetadataTableSchema("NEXT_AD_OPPORTUNITY_POSITION", 5, 5, "nextAdOpportunityPosition", DataType.INTEGER);
            DISPLAY_NAME = new StoryMetadataTableSchema("DISPLAY_NAME", 6, 6, "display_name", DataType.TEXT);
            SHARED_ID = new StoryMetadataTableSchema("SHARED_ID", 7, 7, "shared_id", DataType.TEXT);
            IS_LOCAL = new StoryMetadataTableSchema("IS_LOCAL", 8, 8, "is_local", DataType.BOOLEAN);
            HAS_CUSTOM_DESCRIPTION = new StoryMetadataTableSchema("HAS_CUSTOM_DESCRIPTION", 9, 9, "has_custom_description", DataType.BOOLEAN);
            IS_LIVE_AND_EXPLORER_ENABLED = new StoryMetadataTableSchema("IS_LIVE_AND_EXPLORER_ENABLED", 10, 10, "is_live_and_explorer_enabled", DataType.BOOLEAN);
            $VALUES = (new StoryMetadataTableSchema[] {
                ID, SERIALIZED_AD_METADATA, AD_INTERVAL_INDEX, THUMBNAILS, NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY, NEXT_AD_OPPORTUNITY_POSITION, DISPLAY_NAME, SHARED_ID, IS_LOCAL, HAS_CUSTOM_DESCRIPTION, 
                IS_LIVE_AND_EXPLORER_ENABLED
            });
        }

        private StoryMetadataTableSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private StoryMetadataTableSchema(String s, String s1, DataType datatype, String s2)
        {
            super(s, 0);
            a = 0;
            b = s1;
            c = datatype;
            d = s2;
        }
    }


    public static String a[];
    private static final StoryMetadataTable b = new StoryMetadataTable();
    private final Bj c;
    private final Iz d;

    private StoryMetadataTable()
    {
        this(Bj.a(), new Iz());
    }

    private StoryMetadataTable(Bj bj, Iz iz)
    {
        c = bj;
        d = iz;
    }

    public static StoryMetadataTable a()
    {
        return b;
    }

    protected final ContentValues a(Object obj)
    {
        EM em = (EM)obj;
        if (em == null || em.g == null && em.h == null)
        {
            return null;
        }
        String s;
        tA ta;
        if (em.g != null)
        {
            obj = d.a(em.g, Tw);
        } else
        {
            obj = "";
        }
        if (em.h != null)
        {
            s = d.a(em.h, SV);
        } else
        {
            s = "";
        }
        ta = new tA();
        ta.a(StoryMetadataTableSchema.ID, em.a);
        ta.a(StoryMetadataTableSchema.SERIALIZED_AD_METADATA, ((String) (obj)));
        ta.a(StoryMetadataTableSchema.AD_INTERVAL_INDEX, em.i);
        ta.a(StoryMetadataTableSchema.THUMBNAILS, s);
        ta.a(StoryMetadataTableSchema.NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY, em.j);
        ta.a(StoryMetadataTableSchema.NEXT_AD_OPPORTUNITY_POSITION, em.k);
        ta.a(StoryMetadataTableSchema.DISPLAY_NAME, em.b);
        ta.a(StoryMetadataTableSchema.SHARED_ID, em.c);
        ta.a(StoryMetadataTableSchema.IS_LOCAL, em.d);
        ta.a(StoryMetadataTableSchema.HAS_CUSTOM_DESCRIPTION, em.e);
        ta.a(StoryMetadataTableSchema.IS_LIVE_AND_EXPLORER_ENABLED, em.f);
        return ta.a;
    }

    protected final Object a(Cursor cursor)
    {
        return b(cursor);
    }

    protected final Collection a(Br br)
    {
        br = new HashSet();
        Iterator iterator = c.n().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            StoryCollection storycollection = (StoryCollection)iterator.next();
            Tw tw = storycollection.mAdMetadata;
            int i = storycollection.mAdIntervalIndex;
            int j = storycollection.mNumSnapsSinceLastAdOpportunity;
            int k = storycollection.mNextAdOpportunityPosition;
            SV sv = storycollection.mThumbnails;
            String s = storycollection.h();
            String s1 = storycollection.mSharedId;
            boolean flag = storycollection.mIsLocal;
            boolean flag1 = storycollection.mHasCustomDescription;
            boolean flag2 = storycollection.mIsLiveAndExplorerEnabled;
            if (tw != null || sv != null)
            {
                br.add(new EM(storycollection.mUsername, tw, sv, i, j, k, s, s1, flag, flag1, flag2));
            }
        } while (true);
        return br;
    }

    public final EM b(Cursor cursor)
    {
        String s = cursor.getString(StoryMetadataTableSchema.ID.getColumnNumber());
        String s3 = cursor.getString(StoryMetadataTableSchema.SERIALIZED_AD_METADATA.getColumnNumber());
        int i = cursor.getInt(StoryMetadataTableSchema.AD_INTERVAL_INDEX.getColumnNumber());
        int j = cursor.getInt(StoryMetadataTableSchema.NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY.getColumnNumber());
        int k = cursor.getInt(StoryMetadataTableSchema.NEXT_AD_OPPORTUNITY_POSITION.getColumnNumber());
        Object obj = cursor.getString(StoryMetadataTableSchema.THUMBNAILS.getColumnNumber());
        String s1 = cursor.getString(StoryMetadataTableSchema.DISPLAY_NAME.getColumnNumber());
        String s2 = cursor.getString(StoryMetadataTableSchema.SHARED_ID.getColumnNumber());
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (cursor.getInt(StoryMetadataTableSchema.IS_LOCAL.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(StoryMetadataTableSchema.HAS_CUSTOM_DESCRIPTION.getColumnNumber()) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (cursor.getInt(StoryMetadataTableSchema.IS_LIVE_AND_EXPLORER_ENABLED.getColumnNumber()) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!TextUtils.isEmpty(s3))
        {
            cursor = (Tw)d.a(s3, Tw, true);
        } else
        {
            cursor = null;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = (SV)d.a(((String) (obj)), SV, true);
        } else
        {
            obj = null;
        }
        if (!TextUtils.isEmpty(s))
        {
            return new EM(s, cursor, ((SV) (obj)), i, j, k, s1, s2, flag, flag1, flag2);
        } else
        {
            return null;
        }
    }

    public final void b(Br br)
    {
        br = a(null, null);
        if (br != null)
        {
            br = br.iterator();
            do
            {
                if (!br.hasNext())
                {
                    break;
                }
                EM em = (EM)br.next();
                StoryCollection storycollection = c.c(em.a);
                if (storycollection != null)
                {
                    storycollection.mAdMetadata = em.g;
                    storycollection.mAdIntervalIndex = em.i;
                    storycollection.mThumbnails = em.h;
                    storycollection.mNumSnapsSinceLastAdOpportunity = em.j;
                    storycollection.mNextAdOpportunityPosition = em.k;
                    storycollection.mLiveDisplayName = em.b;
                    storycollection.mSharedId = em.c;
                    storycollection.mIsLocal = em.d;
                    storycollection.mHasCustomDescription = em.e;
                } else
                if (ReleaseManager.f())
                {
                    Timber.c("StoryMetadataTable", "Skipping application of ad metadata for %s since it could not be found.", new Object[] {
                        em.a
                    });
                }
            } while (true);
        }
    }

    public final tt[] b()
    {
        return StoryMetadataTableSchema.values();
    }

    public final String c()
    {
        return "StoryMetadata";
    }

    static 
    {
        StoryMetadataTableSchema astorymetadatatableschema[] = StoryMetadataTableSchema.values();
        a = new String[astorymetadatatableschema.length];
        for (int i = 0; i < astorymetadatatableschema.length; i++)
        {
            a[i] = astorymetadatatableschema[i].getColumnName();
        }

    }
}
