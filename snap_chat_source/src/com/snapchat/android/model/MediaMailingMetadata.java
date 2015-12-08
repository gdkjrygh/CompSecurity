// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import PB;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, Friend

public abstract class MediaMailingMetadata
{
    public static final class CacheSaveStatus extends Enum
    {

        private static final CacheSaveStatus $VALUES[];
        public static final CacheSaveStatus NOT_SAVED;
        public static final CacheSaveStatus SAVED;

        public static CacheSaveStatus valueOf(String s)
        {
            return (CacheSaveStatus)Enum.valueOf(com/snapchat/android/model/MediaMailingMetadata$CacheSaveStatus, s);
        }

        public static CacheSaveStatus[] values()
        {
            return (CacheSaveStatus[])$VALUES.clone();
        }

        static 
        {
            NOT_SAVED = new CacheSaveStatus("NOT_SAVED", 0);
            SAVED = new CacheSaveStatus("SAVED", 1);
            $VALUES = (new CacheSaveStatus[] {
                NOT_SAVED, SAVED
            });
        }

        private CacheSaveStatus(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class PostStatus extends Enum
    {

        private static final PostStatus $VALUES[];
        public static final PostStatus FAILED;
        public static final PostStatus NOT_POSTED;
        public static final PostStatus POSTED;
        public static final PostStatus POSTING;
        public static final PostStatus POSTING_ON_UPLOAD;
        public static final PostStatus WILL_POST_AFTER_SAVE;

        public static PostStatus valueOf(String s)
        {
            return (PostStatus)Enum.valueOf(com/snapchat/android/model/MediaMailingMetadata$PostStatus, s);
        }

        public static PostStatus[] values()
        {
            return (PostStatus[])$VALUES.clone();
        }

        static 
        {
            NOT_POSTED = new PostStatus("NOT_POSTED", 0);
            POSTING = new PostStatus("POSTING", 1);
            WILL_POST_AFTER_SAVE = new PostStatus("WILL_POST_AFTER_SAVE", 2);
            POSTING_ON_UPLOAD = new PostStatus("POSTING_ON_UPLOAD", 3);
            POSTED = new PostStatus("POSTED", 4);
            FAILED = new PostStatus("FAILED", 5);
            $VALUES = (new PostStatus[] {
                NOT_POSTED, POSTING, WILL_POST_AFTER_SAVE, POSTING_ON_UPLOAD, POSTED, FAILED
            });
        }

        private PostStatus(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class SendStatus extends Enum
    {

        private static final SendStatus $VALUES[];
        public static final SendStatus FAILED;
        public static final SendStatus PENDING;
        public static final SendStatus SENDING;
        public static final SendStatus SENDING_ON_UPLOAD;
        public static final SendStatus SENT;
        public static final SendStatus UNSENT;

        public static SendStatus valueOf(String s)
        {
            return (SendStatus)Enum.valueOf(com/snapchat/android/model/MediaMailingMetadata$SendStatus, s);
        }

        public static SendStatus[] values()
        {
            return (SendStatus[])$VALUES.clone();
        }

        static 
        {
            UNSENT = new SendStatus("UNSENT", 0);
            SENDING = new SendStatus("SENDING", 1);
            SENDING_ON_UPLOAD = new SendStatus("SENDING_ON_UPLOAD", 2);
            SENT = new SendStatus("SENT", 3);
            FAILED = new SendStatus("FAILED", 4);
            PENDING = new SendStatus("PENDING", 5);
            $VALUES = (new SendStatus[] {
                UNSENT, SENDING, SENDING_ON_UPLOAD, SENT, FAILED, PENDING
            });
        }

        private SendStatus(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class UploadStatus extends Enum
    {

        private static final UploadStatus $VALUES[];
        public static final UploadStatus FAILED;
        public static final UploadStatus NOT_UPLOADED;
        public static final UploadStatus UPLOADED;
        public static final UploadStatus UPLOADING;
        public static final UploadStatus WILL_UPLOAD_AFTER_SAVE;

        public static UploadStatus valueOf(String s)
        {
            return (UploadStatus)Enum.valueOf(com/snapchat/android/model/MediaMailingMetadata$UploadStatus, s);
        }

        public static UploadStatus[] values()
        {
            return (UploadStatus[])$VALUES.clone();
        }

        static 
        {
            NOT_UPLOADED = new UploadStatus("NOT_UPLOADED", 0);
            UPLOADING = new UploadStatus("UPLOADING", 1);
            WILL_UPLOAD_AFTER_SAVE = new UploadStatus("WILL_UPLOAD_AFTER_SAVE", 2);
            UPLOADED = new UploadStatus("UPLOADED", 3);
            FAILED = new UploadStatus("FAILED", 4);
            $VALUES = (new UploadStatus[] {
                NOT_UPLOADED, UPLOADING, WILL_UPLOAD_AFTER_SAVE, UPLOADED, FAILED
            });
        }

        private UploadStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "MediaMailingMetadata";
    public CacheSaveStatus mCacheSaveStatus;
    protected PB mClock;
    public boolean mDeleteCacheAfterSent;
    protected final FriendManager mFriendManager;
    public PostStatus mPostStatus;
    protected LinkedHashSet mRecipients;
    public boolean mRetried;
    public boolean mSavedInGallery;
    public SendStatus mSendStatus;
    protected boolean mShouldExecuteSendSnapTaskAfterUpload;
    public long mTimeOfFirstAttempt;
    public long mTimeOfLastAttempt;
    private double mTimerValueOrDuration;
    public UploadStatus mUploadStatus;

    public MediaMailingMetadata()
    {
        this(FriendManager.e());
    }

    private MediaMailingMetadata(FriendManager friendmanager)
    {
        mRetried = false;
        mSavedInGallery = false;
        mRecipients = new LinkedHashSet();
        mUploadStatus = UploadStatus.NOT_UPLOADED;
        mSendStatus = SendStatus.UNSENT;
        mPostStatus = PostStatus.NOT_POSTED;
        mCacheSaveStatus = CacheSaveStatus.NOT_SAVED;
        mDeleteCacheAfterSent = false;
        mShouldExecuteSendSnapTaskAfterUpload = false;
        mClock = new PB();
        mFriendManager = friendmanager;
    }

    private void h()
    {
        Iterator iterator = mRecipients.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(((Friend)iterator.next()).g())) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (flag)
        {
            String s = (new StringBuilder("recipients should not contain any empty string! mRecipients=[")).append(TextUtils.join(",", Arrays.asList(new LinkedHashSet[] {
                mRecipients
            }))).append("]").toString();
            if (ReleaseManager.a().c())
            {
                throw new Error(s);
            }
            Timber.e("MediaMailingMetadata", s, new Object[0]);
        }
        return;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public abstract MediaMailingMetadata a();

    public final void a(int i)
    {
        mUploadStatus = UploadStatus.values()[i];
    }

    public final void a(PostStatus poststatus)
    {
        mPostStatus = poststatus;
        if (poststatus == PostStatus.POSTING || poststatus == PostStatus.POSTING_ON_UPLOAD || poststatus == PostStatus.WILL_POST_AFTER_SAVE)
        {
            if (mTimeOfFirstAttempt <= 0L)
            {
                mTimeOfFirstAttempt = System.currentTimeMillis();
            }
            mTimeOfLastAttempt = System.currentTimeMillis();
        }
    }

    public final void a(MediaMailingMetadata mediamailingmetadata)
    {
        mediamailingmetadata.mRecipients = new LinkedHashSet(mRecipients);
        mediamailingmetadata.mTimeOfFirstAttempt = mTimeOfFirstAttempt;
        mediamailingmetadata.mTimeOfLastAttempt = mTimeOfLastAttempt;
        mediamailingmetadata.mPostStatus = mPostStatus;
        mediamailingmetadata.mSendStatus = mSendStatus;
        mediamailingmetadata.mUploadStatus = mUploadStatus;
        mediamailingmetadata.mRetried = mRetried;
        mediamailingmetadata.mSavedInGallery = mSavedInGallery;
        mediamailingmetadata.mTimerValueOrDuration = mTimerValueOrDuration;
        mediamailingmetadata.mShouldExecuteSendSnapTaskAfterUpload = mShouldExecuteSendSnapTaskAfterUpload;
        mediamailingmetadata.mDeleteCacheAfterSent = mDeleteCacheAfterSent;
    }

    public final void a(String s)
    {
        if (s == null)
        {
            return;
        }
        Object obj;
        for (s = (new ArrayList(Arrays.asList(s.split("\\s*,\\s*")))).iterator(); s.hasNext(); mRecipients.add(obj))
        {
            obj = (String)s.next();
            obj = mFriendManager.i(((String) (obj)));
        }

        h();
    }

    public final void a(LinkedHashSet linkedhashset)
    {
        mRecipients = linkedhashset;
        h();
    }

    public final void a(List list)
    {
        mRecipients = new LinkedHashSet();
        Object obj;
        for (list = list.iterator(); list.hasNext(); mRecipients.add(obj))
        {
            obj = (String)list.next();
            obj = mFriendManager.i(((String) (obj)));
        }

        h();
    }

    public final void b(int i)
    {
        mSendStatus = SendStatus.values()[i];
    }

    public final void b(String s)
    {
        mTimeOfFirstAttempt = Long.parseLong(s);
    }

    public final boolean b()
    {
        return mShouldExecuteSendSnapTaskAfterUpload;
    }

    public final void c()
    {
        mShouldExecuteSendSnapTaskAfterUpload = true;
    }

    public final void c(String s)
    {
        mTimeOfLastAttempt = Long.parseLong(s);
    }

    public final LinkedHashSet d()
    {
        return mRecipients;
    }

    public final String e()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = mRecipients.iterator();
        for (String s = ""; iterator.hasNext(); s = ", ")
        {
            Friend friend = (Friend)iterator.next();
            stringbuilder.append(s);
            stringbuilder.append(friend.g());
        }

        h();
        return stringbuilder.toString();
    }

    public final String[] f()
    {
        String as[] = new String[mRecipients.size()];
        Iterator iterator = mRecipients.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            as[i] = ((Friend)iterator.next()).g();
        }

        Timber.c("MediaMailingMetadata", (new StringBuilder("getRecipientsArray() - mRecipients=[")).append(TextUtils.join(",", Arrays.asList(new LinkedHashSet[] {
            mRecipients
        }))).append("]").toString(), new Object[0]);
        h();
        return as;
    }

    public final List g()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mRecipients.iterator(); iterator.hasNext();)
        {
            String s = ((Friend)iterator.next()).mUserId;
            if (!TextUtils.isEmpty(s))
            {
                arraylist.add(s);
            } else
            {
                arraylist.add("");
            }
        }

        return arraylist;
    }
}
