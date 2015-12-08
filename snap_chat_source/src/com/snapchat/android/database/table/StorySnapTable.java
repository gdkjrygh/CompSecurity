// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Bk;
import Br;
import Bt;
import KF;
import KH;
import KO;
import KP;
import SW;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mL;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public abstract class StorySnapTable extends DbTable
{
    public static final class StorySnapSchema extends Enum
        implements tt
    {

        private static final StorySnapSchema $VALUES[];
        public static final StorySnapSchema AD_CAN_FOLLOW;
        public static final StorySnapSchema CAPTION_TEXT;
        public static final StorySnapSchema CLIENT_ID;
        public static final StorySnapSchema DISPLAY_TIME;
        public static final StorySnapSchema EXPIRATION_TIMESTAMP;
        public static final StorySnapSchema FILTER_ID;
        public static final StorySnapSchema IS_FAILED;
        public static final StorySnapSchema IS_SCREENSHOTTED;
        public static final StorySnapSchema IS_SHARED;
        public static final StorySnapSchema IS_SPONSORED;
        public static final StorySnapSchema IS_UPDATED;
        public static final StorySnapSchema IS_VIEWED;
        public static final StorySnapSchema IS_ZIPPED;
        public static final StorySnapSchema MEDIA_ID;
        public static final StorySnapSchema MEDIA_TYPE;
        public static final StorySnapSchema MEDIA_URL;
        public static final StorySnapSchema NEEDS_AUTH;
        public static final StorySnapSchema SPONSORED_SLUG_POS_AND_TEXT;
        public static final StorySnapSchema STATUS;
        public static final StorySnapSchema STORY_FILTER_ID;
        public static final StorySnapSchema STORY_ID;
        public static final StorySnapSchema STORY_SNAP_ID;
        public static final StorySnapSchema STORY_UNLOCKABLES;
        public static final StorySnapSchema THUMBNAIL_URL;
        public static final StorySnapSchema TIMESTAMP;
        public static final StorySnapSchema USERNAME;
        public static final StorySnapSchema VIEWED_TIMESTAMP;
        public static final StorySnapSchema WAS_404_RESPONSE_RECEIVED;
        private int a;
        private String b;
        private DataType c;

        static String a(StorySnapSchema storysnapschema)
        {
            return storysnapschema.b;
        }

        static DataType b(StorySnapSchema storysnapschema)
        {
            return storysnapschema.c;
        }

        public static StorySnapSchema valueOf(String s)
        {
            return (StorySnapSchema)Enum.valueOf(com/snapchat/android/database/table/StorySnapTable$StorySnapSchema, s);
        }

        public static StorySnapSchema[] values()
        {
            return (StorySnapSchema[])$VALUES.clone();
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
            STORY_SNAP_ID = new StorySnapSchema("STORY_SNAP_ID", 0, 1, "StorySnapId", DataType.TEXT);
            CLIENT_ID = new StorySnapSchema("CLIENT_ID", 1, 2, "ClientId", DataType.TEXT);
            MEDIA_ID = new StorySnapSchema("MEDIA_ID", 2, 3, "MediaId", DataType.TEXT);
            TIMESTAMP = new StorySnapSchema("TIMESTAMP", 3, 4, "Timestamp", DataType.INTEGER);
            MEDIA_TYPE = new StorySnapSchema("MEDIA_TYPE", 4, 5, "MediaType", DataType.INTEGER);
            MEDIA_URL = new StorySnapSchema("MEDIA_URL", 5, 6, "MediaUrl", DataType.TEXT);
            THUMBNAIL_URL = new StorySnapSchema("THUMBNAIL_URL", 6, 7, "ThumbnailUrl", DataType.TEXT);
            STATUS = new StorySnapSchema("STATUS", 7, 8, "Status", DataType.TEXT);
            USERNAME = new StorySnapSchema("USERNAME", 8, 9, "Username", DataType.TEXT);
            DISPLAY_TIME = new StorySnapSchema("DISPLAY_TIME", 9, 10, "DisplayTime", DataType.INTEGER);
            CAPTION_TEXT = new StorySnapSchema("CAPTION_TEXT", 10, 11, "CaptionText", DataType.TEXT);
            IS_VIEWED = new StorySnapSchema("IS_VIEWED", 11, 12, "IsViewed", DataType.BOOLEAN);
            IS_SCREENSHOTTED = new StorySnapSchema("IS_SCREENSHOTTED", 12, 13, "IsScreenshotted", DataType.BOOLEAN);
            VIEWED_TIMESTAMP = new StorySnapSchema("VIEWED_TIMESTAMP", 13, 14, "ViewedTimestamp", DataType.INTEGER);
            IS_UPDATED = new StorySnapSchema("IS_UPDATED", 14, 15, "IsUpdated", DataType.BOOLEAN);
            IS_FAILED = new StorySnapSchema("IS_FAILED", 15, 16, "IsFailed", DataType.BOOLEAN);
            IS_ZIPPED = new StorySnapSchema("IS_ZIPPED", 16, 17, "IsZipped", DataType.BOOLEAN);
            FILTER_ID = new StorySnapSchema("FILTER_ID", 17, 18, "FilterId", DataType.TEXT);
            WAS_404_RESPONSE_RECEIVED = new StorySnapSchema("WAS_404_RESPONSE_RECEIVED", 18, 19, "Was404ResponseReceived", DataType.BOOLEAN);
            STORY_ID = new StorySnapSchema("STORY_ID", 19, 20, "StoryId", DataType.TEXT);
            IS_SHARED = new StorySnapSchema("IS_SHARED", 20, 21, "IsShared", DataType.BOOLEAN);
            AD_CAN_FOLLOW = new StorySnapSchema("AD_CAN_FOLLOW", 21, 22, "AdCanFollow", DataType.BOOLEAN);
            NEEDS_AUTH = new StorySnapSchema("NEEDS_AUTH", 22, 23, "NeedsAuth", DataType.BOOLEAN);
            EXPIRATION_TIMESTAMP = new StorySnapSchema("EXPIRATION_TIMESTAMP", 23, 24, "ExpirationTimestamp", DataType.INTEGER);
            STORY_FILTER_ID = new StorySnapSchema("STORY_FILTER_ID", 24, 25, "StoryFilterId", DataType.TEXT);
            IS_SPONSORED = new StorySnapSchema("IS_SPONSORED", 25, 26, "IsSponsored", DataType.BOOLEAN);
            SPONSORED_SLUG_POS_AND_TEXT = new StorySnapSchema("SPONSORED_SLUG_POS_AND_TEXT", 26, 27, "SponsoredSlugPosAndText", DataType.TEXT);
            STORY_UNLOCKABLES = new StorySnapSchema("STORY_UNLOCKABLES", 27, 28, "StoryUnlockables", DataType.TEXT);
            $VALUES = (new StorySnapSchema[] {
                STORY_SNAP_ID, CLIENT_ID, MEDIA_ID, TIMESTAMP, MEDIA_TYPE, MEDIA_URL, THUMBNAIL_URL, STATUS, USERNAME, DISPLAY_TIME, 
                CAPTION_TEXT, IS_VIEWED, IS_SCREENSHOTTED, VIEWED_TIMESTAMP, IS_UPDATED, IS_FAILED, IS_ZIPPED, FILTER_ID, WAS_404_RESPONSE_RECEIVED, STORY_ID, 
                IS_SHARED, AD_CAN_FOLLOW, NEEDS_AUTH, EXPIRATION_TIMESTAMP, STORY_FILTER_ID, IS_SPONSORED, SPONSORED_SLUG_POS_AND_TEXT, STORY_UNLOCKABLES
            });
        }

        private StorySnapSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }
    }


    private final KH a;
    private final KP b;

    public StorySnapTable(KH kh, KP kp)
    {
        a = kh;
        b = kp;
    }

    public static ContentValues a(Bk bk)
    {
        boolean flag = true;
        if (bk == null)
        {
            return null;
        }
        tA ta = new tA();
        ta.a(StorySnapSchema.STORY_SNAP_ID, bk.d());
        ta.a(StorySnapSchema.CLIENT_ID, bk.mClientId);
        ta.a(StorySnapSchema.MEDIA_ID, bk.mMediaId);
        ta.a(StorySnapSchema.TIMESTAMP, bk.W());
        ta.a(StorySnapSchema.MEDIA_TYPE, bk.am());
        ta.a(StorySnapSchema.MEDIA_URL, bk.at());
        ta.a(StorySnapSchema.THUMBNAIL_URL, bk.aF());
        Object obj = bk.aj();
        Object obj1 = StorySnapSchema.STATUS;
        StorySnapSchema storysnapschema;
        int i;
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = ((com.snapchat.android.model.Snap.ClientSnapStatus) (obj)).name();
        }
        ta.a(((tt) (obj1)), ((String) (obj)));
        ta.a(StorySnapSchema.USERNAME, bk.mUsername);
        ta.a(StorySnapSchema.DISPLAY_TIME, bk.G());
        obj1 = bk.V();
        storysnapschema = StorySnapSchema.CAPTION_TEXT;
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        ta.a(storysnapschema, ((String) (obj)));
        obj = StorySnapSchema.IS_VIEWED;
        if (bk.D())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        obj = StorySnapSchema.IS_SCREENSHOTTED;
        if (bk.as())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        ta.a(StorySnapSchema.VIEWED_TIMESTAMP, bk.F());
        obj = Br.a();
        if (obj == null || bk.d() == null)
        {
            ta.a(StorySnapSchema.IS_UPDATED, 0);
        } else
        {
            if (((Br) (obj)).b().get(bk.d()) != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            obj = StorySnapSchema.IS_UPDATED;
            if (i != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            ta.a(((tt) (obj)), i);
        }
        obj = StorySnapSchema.IS_FAILED;
        if (bk.mFailed)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        obj = StorySnapSchema.IS_ZIPPED;
        if (bk.h())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        ta.a(StorySnapSchema.FILTER_ID, bk.H());
        obj = StorySnapSchema.WAS_404_RESPONSE_RECEIVED;
        if (bk.mWas404ResponseReceived)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        ta.a(StorySnapSchema.STORY_ID, bk.mPostedStoryId);
        obj = StorySnapSchema.IS_SHARED;
        if (bk.mIsShared)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        obj = StorySnapSchema.NEEDS_AUTH;
        if (bk.mNeedsAuth)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        ta.a(StorySnapSchema.AD_CAN_FOLLOW, bk.mCanAdFollow);
        ta.a(StorySnapSchema.EXPIRATION_TIMESTAMP, bk.mExpirationTimestamp);
        ta.a(StorySnapSchema.STORY_FILTER_ID, bk.mStoryFilterId);
        ta.a(StorySnapSchema.STORY_UNLOCKABLES, bk.mStoryUnlockables);
        obj = StorySnapSchema.IS_SPONSORED;
        if (bk.mIsSponsored)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        ta.a(StorySnapSchema.SPONSORED_SLUG_POS_AND_TEXT, bk.mSponsoredSlugPosAndText);
        return ta.a;
    }

    protected final volatile ContentValues a(Object obj)
    {
        return a((Bk)obj);
    }

    protected final Object a(Cursor cursor)
    {
        Object obj = cursor.getString(StorySnapSchema.STORY_SNAP_ID.getColumnNumber());
        Object obj1 = cursor.getString(StorySnapSchema.CLIENT_ID.getColumnNumber());
        String s = cursor.getString(StorySnapSchema.MEDIA_ID.getColumnNumber());
        long l = cursor.getLong(StorySnapSchema.TIMESTAMP.getColumnNumber());
        long l1 = cursor.getLong(StorySnapSchema.VIEWED_TIMESTAMP.getColumnNumber());
        int i = cursor.getInt(StorySnapSchema.MEDIA_TYPE.getColumnNumber());
        String s2 = cursor.getString(StorySnapSchema.MEDIA_URL.getColumnNumber());
        String s3 = cursor.getString(StorySnapSchema.THUMBNAIL_URL.getColumnNumber());
        com.snapchat.android.model.Snap.ClientSnapStatus clientsnapstatus = com.snapchat.android.model.Snap.ClientSnapStatus.fromString(cursor.getString(StorySnapSchema.STATUS.getColumnNumber()));
        String s4 = cursor.getString(StorySnapSchema.USERNAME.getColumnNumber());
        int k = cursor.getInt(StorySnapSchema.DISPLAY_TIME.getColumnNumber());
        String s5 = cursor.getString(StorySnapSchema.CAPTION_TEXT.getColumnNumber());
        String s6;
        String s7;
        String s8;
        long l2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        if (cursor.getInt(StorySnapSchema.IS_VIEWED.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(StorySnapSchema.IS_SCREENSHOTTED.getColumnNumber()) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (cursor.getInt(StorySnapSchema.IS_FAILED.getColumnNumber()) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (cursor.getInt(StorySnapSchema.IS_ZIPPED.getColumnNumber()) != 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        s6 = cursor.getString(StorySnapSchema.FILTER_ID.getColumnNumber());
        if (cursor.getInt(StorySnapSchema.WAS_404_RESPONSE_RECEIVED.getColumnNumber()) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (cursor.getInt(StorySnapSchema.IS_SHARED.getColumnNumber()) != 0)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (cursor.getInt(StorySnapSchema.NEEDS_AUTH.getColumnNumber()) != 0)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        if (cursor.getInt(StorySnapSchema.AD_CAN_FOLLOW.getColumnNumber()) != 0)
        {
            flag7 = true;
        } else
        {
            flag7 = false;
        }
        l2 = cursor.getLong(StorySnapSchema.EXPIRATION_TIMESTAMP.getColumnNumber());
        s7 = cursor.getString(StorySnapSchema.STORY_FILTER_ID.getColumnNumber());
        s8 = cursor.getString(StorySnapSchema.STORY_UNLOCKABLES.getColumnNumber());
        if (cursor.getInt(StorySnapSchema.IS_SPONSORED.getColumnNumber()) != 0)
        {
            flag8 = true;
        } else
        {
            flag8 = false;
        }
        obj = new Bk(((String) (obj)), ((String) (obj1)), s, l, l1, i, s2, s3, clientsnapstatus, s4, k, s5, flag, flag1, flag2, flag3, s6, flag4, flag5, flag6, flag7, l2, s7, s8, flag8, cursor.getString(StorySnapSchema.SPONSORED_SLUG_POS_AND_TEXT.getColumnNumber()));
        obj1 = Br.a();
        if (obj1 != null)
        {
            int j;
            if (cursor.getInt(StorySnapSchema.IS_UPDATED.getColumnNumber()) != 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                obj1 = ((Br) (obj1)).b();
                String s1 = ((Bk) (obj)).d();
                SW sw = (new SW()).a(((Bk) (obj)).d()).a(Long.valueOf(((Bk) (obj)).F()));
                if (((Bk) (obj)).as())
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                ((Map) (obj1)).put(s1, sw.a(Integer.valueOf(j)));
            }
        }
        cursor = cursor.getString(StorySnapSchema.STORY_ID.getColumnNumber());
        if (!TextUtils.isEmpty(cursor))
        {
            obj.mPostedStoryId = cursor;
        }
        return obj;
    }

    public abstract void a(List list);

    public final void b(Br br)
    {
        KP kp;
        byte abyte0[];
        br = a(null, null);
        KH kh = a;
        kp = b;
        abyte0 = kh.mSlightlySecurePreferences.b(kp);
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        Timber.e("CbcSlightlySecurePreferences", "Failed to get key %s from SSP.", new Object[] {
            kp
        });
        flag = false;
_L4:
        if (flag)
        {
            if (ReleaseManager.f())
            {
                Timber.c("StorySnapTable", "%s applying %d story snaps to in-memory models", new Object[] {
                    c(), Integer.valueOf(br.size())
                });
            }
            a(br);
            return;
        }
        break MISSING_BLOCK_LABEL_216;
_L2:
        Map map;
        map = KH.a(abyte0);
        if (map != null)
        {
            break; /* Loop/switch isn't completed */
        }
        Timber.e("CbcSlightlySecurePreferences", "Failed to parse key %s from SSP: \n%s", new Object[] {
            kp, abyte0
        });
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Iterator iterator = br.iterator();
        boolean flag1 = true;
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            Bk bk = (Bk)iterator.next();
            KF kf = (KF)map.get(bk.mMediaId);
            if (kf == null)
            {
                iterator.remove();
                flag1 = false;
            } else
            {
                bk.a(kf);
            }
        } while (true);
        if (true) goto _L4; else goto _L5
_L5:
        if (ReleaseManager.f())
        {
            Timber.d("StorySnapTable", "%s clearing all update checksum and trigger new sync all since keys and IVs failed to load", new Object[] {
                c()
            });
        }
        Bt.aN();
        (new mL()).execute();
        return;
    }

    public final tt[] b()
    {
        return StorySnapSchema.values();
    }

    public final String d()
    {
        String s = "_id INTEGER PRIMARY KEY";
        StorySnapSchema astorysnapschema[] = StorySnapSchema.values();
        int j = astorysnapschema.length;
        for (int i = 0; i < j; i++)
        {
            StorySnapSchema storysnapschema = astorysnapschema[i];
            s = (new StringBuilder()).append(s).append(",").append(StorySnapSchema.a(storysnapschema)).append(" ").append(StorySnapSchema.b(storysnapschema).toString()).toString();
        }

        return s;
    }
}
