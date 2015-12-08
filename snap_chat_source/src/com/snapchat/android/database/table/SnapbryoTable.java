// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import AA;
import AM;
import AQ;
import Bd;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.snapchat.android.database.DataType;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public abstract class SnapbryoTable extends DbTable
{
    public static final class SnapbryoSchema extends Enum
        implements tt
    {

        private static final SnapbryoSchema $VALUES[];
        public static final SnapbryoSchema CAMERA_ORIENTATION_DEGREES;
        public static final SnapbryoSchema CAPTION_TEXT;
        public static final SnapbryoSchema CLIENT_ID;
        public static final SnapbryoSchema IS_DISCOVER_SNAP;
        public static final SnapbryoSchema IS_FLASH_ON;
        public static final SnapbryoSchema IS_FRONT_FACING;
        public static final SnapbryoSchema IS_MUTED;
        public static final SnapbryoSchema IS_ZIP_UPLOAD;
        public static final SnapbryoSchema POST_STATUS;
        public static final SnapbryoSchema RECIPIENTS;
        public static final SnapbryoSchema RETRIED;
        public static final SnapbryoSchema SEND_STATUS;
        public static final SnapbryoSchema SNAP_ORIENTAITION_DEGREES;
        public static final SnapbryoSchema STORY_GROUPS;
        public static final SnapbryoSchema TIME;
        public static final SnapbryoSchema TIMER_VALUE;
        public static final SnapbryoSchema TIME_OF_FIRST_ATTEMPT;
        public static final SnapbryoSchema TIME_OF_LAST_ATTEMPT;
        public static final SnapbryoSchema UPLOAD_STATUS;
        public static final SnapbryoSchema VIDEO_URI;
        private int a;
        private String b;
        private DataType c;

        static String a(SnapbryoSchema snapbryoschema)
        {
            return snapbryoschema.b;
        }

        static DataType b(SnapbryoSchema snapbryoschema)
        {
            return snapbryoschema.c;
        }

        public static SnapbryoSchema valueOf(String s)
        {
            return (SnapbryoSchema)Enum.valueOf(com/snapchat/android/database/table/SnapbryoTable$SnapbryoSchema, s);
        }

        public static SnapbryoSchema[] values()
        {
            return (SnapbryoSchema[])$VALUES.clone();
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
            CLIENT_ID = new SnapbryoSchema("CLIENT_ID", 0, 1, "ClientId", DataType.TEXT);
            TIME = new SnapbryoSchema("TIME", 1, 2, "Time", DataType.TEXT);
            VIDEO_URI = new SnapbryoSchema("VIDEO_URI", 2, 3, "VideoUri", DataType.TEXT);
            RECIPIENTS = new SnapbryoSchema("RECIPIENTS", 3, 4, "Recipients", DataType.TEXT);
            STORY_GROUPS = new SnapbryoSchema("STORY_GROUPS", 4, 5, "StoryGroups", DataType.TEXT);
            UPLOAD_STATUS = new SnapbryoSchema("UPLOAD_STATUS", 5, 6, "UploadStatus", DataType.INTEGER);
            SEND_STATUS = new SnapbryoSchema("SEND_STATUS", 6, 7, "SendStatus", DataType.INTEGER);
            POST_STATUS = new SnapbryoSchema("POST_STATUS", 7, 8, "PostStatus", DataType.INTEGER);
            IS_MUTED = new SnapbryoSchema("IS_MUTED", 8, 9, "IsMuted", DataType.BOOLEAN);
            IS_ZIP_UPLOAD = new SnapbryoSchema("IS_ZIP_UPLOAD", 9, 10, "HasBeenZipped", DataType.BOOLEAN);
            TIMER_VALUE = new SnapbryoSchema("TIMER_VALUE", 10, 11, "TimerValueOrDuration", DataType.REAL);
            CAPTION_TEXT = new SnapbryoSchema("CAPTION_TEXT", 11, 12, "CaptionText", DataType.TEXT);
            TIME_OF_FIRST_ATTEMPT = new SnapbryoSchema("TIME_OF_FIRST_ATTEMPT", 12, 13, "TimeOfFirstAttempt", DataType.TEXT);
            TIME_OF_LAST_ATTEMPT = new SnapbryoSchema("TIME_OF_LAST_ATTEMPT", 13, 14, "TimeOfLastAttempt", DataType.TEXT);
            RETRIED = new SnapbryoSchema("RETRIED", 14, 15, "Retried", DataType.BOOLEAN);
            IS_DISCOVER_SNAP = new SnapbryoSchema("IS_DISCOVER_SNAP", 15, 16, "IsDiscoverSnap", DataType.BOOLEAN);
            IS_FRONT_FACING = new SnapbryoSchema("IS_FRONT_FACING", 16, 17, "isFrontFacing", DataType.BOOLEAN);
            IS_FLASH_ON = new SnapbryoSchema("IS_FLASH_ON", 17, 18, "IsFlashOn", DataType.BOOLEAN);
            CAMERA_ORIENTATION_DEGREES = new SnapbryoSchema("CAMERA_ORIENTATION_DEGREES", 18, 19, "CameraOrientation", DataType.INTEGER);
            SNAP_ORIENTAITION_DEGREES = new SnapbryoSchema("SNAP_ORIENTAITION_DEGREES", 19, 20, "SnapOrientation", DataType.INTEGER);
            $VALUES = (new SnapbryoSchema[] {
                CLIENT_ID, TIME, VIDEO_URI, RECIPIENTS, STORY_GROUPS, UPLOAD_STATUS, SEND_STATUS, POST_STATUS, IS_MUTED, IS_ZIP_UPLOAD, 
                TIMER_VALUE, CAPTION_TEXT, TIME_OF_FIRST_ATTEMPT, TIME_OF_LAST_ATTEMPT, RETRIED, IS_DISCOVER_SNAP, IS_FRONT_FACING, IS_FLASH_ON, CAMERA_ORIENTATION_DEGREES, SNAP_ORIENTAITION_DEGREES
            });
        }

        private SnapbryoSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }
    }


    public SnapbryoTable()
    {
    }

    protected final ContentValues a(Object obj)
    {
        AA aa;
        tA ta;
        int i;
        Bd bd;
        boolean flag;
label0:
        {
            flag = true;
            aa = (AA)obj;
            if (aa == null)
            {
                return null;
            }
            ta = new tA();
            if (((Mediabryo) (aa)).mSnapType != com.snapchat.android.model.Mediabryo.SnapType.SNAP)
            {
                break MISSING_BLOCK_LABEL_491;
            }
            Object obj1;
            StringBuilder stringbuilder;
            Iterator iterator;
            if (((Mediabryo) (aa)).mVideoUri == null)
            {
                obj = "";
            } else
            {
                obj = ((Mediabryo) (aa)).mVideoUri.toString();
            }
            ta.a(SnapbryoSchema.CLIENT_ID, ((Mediabryo) (aa)).mClientId);
            ta.a(SnapbryoSchema.TIME, DateFormat.getDateTimeInstance().format(((Mediabryo) (aa)).mTime));
            ta.a(SnapbryoSchema.VIDEO_URI, ((String) (obj)));
            bd = (Bd)((Mediabryo) (aa)).mMediaMailingMetadata;
            ta.a(SnapbryoSchema.RECIPIENTS, bd.e());
            obj1 = SnapbryoSchema.STORY_GROUPS;
            stringbuilder = new StringBuilder();
            iterator = bd.mPostToStories.iterator();
            for (obj = ""; iterator.hasNext(); obj = ", ")
            {
                AQ aq = (AQ)iterator.next();
                stringbuilder.append(((String) (obj)));
                stringbuilder.append(aq.mStoryId);
            }

            ta.a(((tt) (obj1)), stringbuilder.toString());
            obj1 = ((MediaMailingMetadata) (bd)).mUploadStatus;
            if (obj1 != com.snapchat.android.model.MediaMailingMetadata.UploadStatus.UPLOADING)
            {
                obj = obj1;
                if (obj1 != com.snapchat.android.model.MediaMailingMetadata.UploadStatus.WILL_UPLOAD_AFTER_SAVE)
                {
                    break label0;
                }
            }
            obj = com.snapchat.android.model.MediaMailingMetadata.UploadStatus.FAILED;
        }
        ta.a(SnapbryoSchema.UPLOAD_STATUS, ((com.snapchat.android.model.MediaMailingMetadata.UploadStatus) (obj)).ordinal());
        ta.a(SnapbryoSchema.SEND_STATUS, ((MediaMailingMetadata) (bd)).mSendStatus.ordinal());
        ta.a(SnapbryoSchema.POST_STATUS, ((MediaMailingMetadata) (bd)).mPostStatus.ordinal());
        obj = SnapbryoSchema.IS_MUTED;
        if (aa.n())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        obj = SnapbryoSchema.IS_ZIP_UPLOAD;
        if (((Mediabryo) (aa)).mIsZipUpload)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        ta.a(SnapbryoSchema.TIMER_VALUE, ((Mediabryo) (aa)).mTimerValueOrDuration);
        ta.a(SnapbryoSchema.CAPTION_TEXT, aa.mCaptionText);
        ta.a(SnapbryoSchema.TIME_OF_FIRST_ATTEMPT, ((MediaMailingMetadata) (bd)).mTimeOfFirstAttempt);
        ta.a(SnapbryoSchema.TIME_OF_LAST_ATTEMPT, ((MediaMailingMetadata) (bd)).mTimeOfLastAttempt);
        ta.a(SnapbryoSchema.RETRIED, ((MediaMailingMetadata) (bd)).mRetried);
        ta.a(SnapbryoSchema.IS_DISCOVER_SNAP, false);
_L1:
        obj = SnapbryoSchema.IS_FRONT_FACING;
        com.snapchat.android.model.MediaMailingMetadata.UploadStatus uploadstatus;
        Bd bd1;
        if (((Mediabryo) (aa)).mIsFrontFacingSnap)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        obj = SnapbryoSchema.IS_FLASH_ON;
        if (((Mediabryo) (aa)).mIsFlashOn)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        ta.a(((tt) (obj)), i);
        ta.a(SnapbryoSchema.CAMERA_ORIENTATION_DEGREES, ((Mediabryo) (aa)).mCameraOrientation);
        ta.a(SnapbryoSchema.SNAP_ORIENTAITION_DEGREES, ((Mediabryo) (aa)).mSnapOrientation);
        return ta.a;
        if (((Mediabryo) (aa)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER || ((Mediabryo) (aa)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)
        {
label1:
            {
                ta.a(SnapbryoSchema.CLIENT_ID, ((Mediabryo) (aa)).mClientId);
                ta.a(SnapbryoSchema.TIME, DateFormat.getDateTimeInstance().format(((Mediabryo) (aa)).mTime));
                bd1 = (Bd)((Mediabryo) (aa)).mMediaMailingMetadata;
                ta.a(SnapbryoSchema.RECIPIENTS, bd1.e());
                uploadstatus = ((MediaMailingMetadata) (bd1)).mUploadStatus;
                if (uploadstatus != com.snapchat.android.model.MediaMailingMetadata.UploadStatus.UPLOADING)
                {
                    obj = uploadstatus;
                    if (uploadstatus != com.snapchat.android.model.MediaMailingMetadata.UploadStatus.WILL_UPLOAD_AFTER_SAVE)
                    {
                        break label1;
                    }
                }
                obj = com.snapchat.android.model.MediaMailingMetadata.UploadStatus.FAILED;
            }
            ta.a(SnapbryoSchema.UPLOAD_STATUS, ((com.snapchat.android.model.MediaMailingMetadata.UploadStatus) (obj)).ordinal());
            ta.a(SnapbryoSchema.SEND_STATUS, ((MediaMailingMetadata) (bd1)).mSendStatus.ordinal());
            ta.a(SnapbryoSchema.TIMER_VALUE, ((Mediabryo) (aa)).mTimerValueOrDuration);
            ta.a(SnapbryoSchema.CAPTION_TEXT, aa.mCaptionText);
            ta.a(SnapbryoSchema.TIME_OF_FIRST_ATTEMPT, ((MediaMailingMetadata) (bd1)).mTimeOfFirstAttempt);
            ta.a(SnapbryoSchema.TIME_OF_LAST_ATTEMPT, ((MediaMailingMetadata) (bd1)).mTimeOfLastAttempt);
            ta.a(SnapbryoSchema.RETRIED, ((MediaMailingMetadata) (bd1)).mRetried);
            obj = SnapbryoSchema.IS_MUTED;
            if (aa.n())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            ta.a(((tt) (obj)), i);
            if (((Mediabryo) (aa)).mVideoUri == null)
            {
                obj = "";
            } else
            {
                obj = ((Mediabryo) (aa)).mVideoUri.toString();
            }
            ta.a(SnapbryoSchema.VIDEO_URI, ((String) (obj)));
            if (((Mediabryo) (aa)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
            {
                ta.a(SnapbryoSchema.IS_DISCOVER_SNAP, true);
            } else
            if (((Mediabryo) (aa)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)
            {
                ta.a(SnapbryoSchema.IS_DISCOVER_SNAP, false);
            }
        }
          goto _L1
    }

    protected final Object a(Cursor cursor)
    {
        boolean flag4 = true;
        boolean flag3 = true;
        Object obj;
        boolean flag;
        if (!TextUtils.isEmpty(cursor.getString(SnapbryoSchema.VIDEO_URI.getColumnNumber())))
        {
            obj = new Bw.a();
        } else
        {
            obj = new Bc.a();
        }
        if (cursor.getInt(SnapbryoSchema.IS_DISCOVER_SNAP.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            Bd bd = new Bd();
            bd.a(cursor.getString(SnapbryoSchema.RECIPIENTS.getColumnNumber()));
            Object obj1 = cursor.getString(SnapbryoSchema.STORY_GROUPS.getColumnNumber());
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                for (obj1 = (new ArrayList(Arrays.asList(((String) (obj1)).split("\\s*,\\s*")))).iterator(); ((Iterator) (obj1)).hasNext();)
                {
                    String s = (String)((Iterator) (obj1)).next();
                    if (TextUtils.equals(s, "my_story_ads79sdf"))
                    {
                        bd.mPostToStories.add(AM.c());
                    } else
                    {
                        bd.mPostToStories.add(new AQ(s, s));
                    }
                }

            }
            bd.a(cursor.getInt(SnapbryoSchema.UPLOAD_STATUS.getColumnNumber()));
            bd.b(cursor.getInt(SnapbryoSchema.SEND_STATUS.getColumnNumber()));
            int i = cursor.getInt(SnapbryoSchema.POST_STATUS.getColumnNumber());
            bd.mPostStatus = com.snapchat.android.model.MediaMailingMetadata.PostStatus.values()[i];
            bd.b(cursor.getString(SnapbryoSchema.TIME_OF_FIRST_ATTEMPT.getColumnNumber()));
            bd.c(cursor.getString(SnapbryoSchema.TIME_OF_LAST_ATTEMPT.getColumnNumber()));
            boolean flag1;
            if (cursor.getInt(SnapbryoSchema.RETRIED.getColumnNumber()) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            bd.mRetried = flag1;
            obj = ((AA.a) (obj)).a(com.snapchat.android.model.Mediabryo.SnapType.SNAP);
            obj.mCaptionText = cursor.getString(SnapbryoSchema.CAPTION_TEXT.getColumnNumber());
            obj = (AA.a)((AA.a)((AA.a)((AA.a) (obj)).a(cursor.getString(SnapbryoSchema.CLIENT_ID.getColumnNumber()))).b(cursor.getString(SnapbryoSchema.TIME.getColumnNumber()))).c(cursor.getString(SnapbryoSchema.VIDEO_URI.getColumnNumber()));
            if (cursor.getInt(SnapbryoSchema.IS_MUTED.getColumnNumber()) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj.mMuted = flag1;
            obj = (AA.a)obj;
            if (cursor.getInt(SnapbryoSchema.IS_ZIP_UPLOAD.getColumnNumber()) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj.mIsZipUpload = flag1;
            obj = (AA.a)obj;
            obj.mTimerValueOrDuration = cursor.getDouble(SnapbryoSchema.TIMER_VALUE.getColumnNumber());
            obj = (AA.a)obj;
            obj.mMediaMailingMetadata = bd;
            obj = (AA.a)obj;
            if (cursor.getInt(SnapbryoSchema.IS_FRONT_FACING.getColumnNumber()) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj.mIsFrontFacingSnap = flag1;
            obj = (AA.a)obj;
            if (cursor.getInt(SnapbryoSchema.IS_FLASH_ON.getColumnNumber()) != 0)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            obj.mIsFlashOn = flag1;
            obj = (AA.a)obj;
            obj.mCameraOrientation = cursor.getInt(SnapbryoSchema.CAMERA_ORIENTATION_DEGREES.getColumnNumber());
            obj = (AA.a)obj;
            obj.mSnapOrientation = cursor.getInt(SnapbryoSchema.SNAP_ORIENTAITION_DEGREES.getColumnNumber());
            return ((AA.a)obj).b();
        }
        Bd bd1 = new Bd();
        bd1.a(cursor.getString(SnapbryoSchema.RECIPIENTS.getColumnNumber()));
        bd1.a(cursor.getInt(SnapbryoSchema.UPLOAD_STATUS.getColumnNumber()));
        bd1.b(cursor.getInt(SnapbryoSchema.SEND_STATUS.getColumnNumber()));
        bd1.b(cursor.getString(SnapbryoSchema.TIME_OF_FIRST_ATTEMPT.getColumnNumber()));
        bd1.c(cursor.getString(SnapbryoSchema.TIME_OF_LAST_ATTEMPT.getColumnNumber()));
        boolean flag2;
        if (cursor.getInt(SnapbryoSchema.RETRIED.getColumnNumber()) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        bd1.mRetried = flag2;
        obj = ((AA.a) (obj)).a(com.snapchat.android.model.Mediabryo.SnapType.DISCOVER);
        obj.mCaptionText = cursor.getString(SnapbryoSchema.CAPTION_TEXT.getColumnNumber());
        obj = (AA.a)((AA.a)((AA.a) (obj)).a(cursor.getString(SnapbryoSchema.CLIENT_ID.getColumnNumber()))).c(cursor.getString(SnapbryoSchema.VIDEO_URI.getColumnNumber()));
        if (cursor.getInt(SnapbryoSchema.IS_MUTED.getColumnNumber()) != 0)
        {
            flag2 = flag4;
        } else
        {
            flag2 = false;
        }
        obj.mMuted = flag2;
        obj = (AA.a)((AA.a)obj).b(cursor.getString(SnapbryoSchema.TIME.getColumnNumber()));
        obj.mTimerValueOrDuration = cursor.getDouble(SnapbryoSchema.TIMER_VALUE.getColumnNumber());
        cursor = (AA.a)obj;
        cursor.mMediaMailingMetadata = bd1;
        return ((AA.a)cursor).b();
    }

    public final tt[] b()
    {
        return SnapbryoSchema.values();
    }

    public final String d()
    {
        String s = "_id INTEGER PRIMARY KEY";
        SnapbryoSchema asnapbryoschema[] = SnapbryoSchema.values();
        int j = asnapbryoschema.length;
        for (int i = 0; i < j; i++)
        {
            SnapbryoSchema snapbryoschema = asnapbryoschema[i];
            s = (new StringBuilder()).append(s).append(",").append(SnapbryoSchema.a(snapbryoschema)).append(" ").append(SnapbryoSchema.b(snapbryoschema).toString()).toString();
        }

        return s;
    }
}
