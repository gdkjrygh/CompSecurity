// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import AA;
import Bt;
import IJ;
import KL;
import Qm;
import RL;
import RP;
import android.net.Uri;
import com.snapchat.android.Timber;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import java.util.Date;

// Referenced classes of package com.snapchat.android.model.chat:
//            Chat

public class ChatMedia extends Chat
{
    public static final class MediaType extends Enum
    {

        private static final MediaType $VALUES[];
        public static final MediaType IMAGE;
        public static final MediaType VIDEO;
        public static final MediaType VIDEO_NO_SOUND;

        public static MediaType fromSnapMediaType(int i)
        {
            switch (i)
            {
            default:
                throw new IllegalArgumentException("Unsupported type.");

            case 0: // '\0'
                return IMAGE;

            case 1: // '\001'
                return VIDEO;

            case 2: // '\002'
                return VIDEO_NO_SOUND;
            }
        }

        public static MediaType valueOf(String s)
        {
            return (MediaType)Enum.valueOf(com/snapchat/android/model/chat/ChatMedia$MediaType, s);
        }

        public static MediaType[] values()
        {
            return (MediaType[])$VALUES.clone();
        }

        static 
        {
            IMAGE = new MediaType("IMAGE", 0);
            VIDEO = new MediaType("VIDEO", 1);
            VIDEO_NO_SOUND = new MediaType("VIDEO_NO_SOUND", 2);
            $VALUES = (new MediaType[] {
                IMAGE, VIDEO, VIDEO_NO_SOUND
            });
        }

        private MediaType(String s, int i)
        {
            super(s, i);
        }
    }

    public static class a extends Chat.a
    {

        public int height;
        public boolean isZipped;
        String iv;
        String key;
        public String mediaId;
        MediaType mediaType;
        public int width;

        public final a a(String s)
        {
            mediaType = MediaType.valueOf(s);
            return this;
        }

        public ChatMedia a()
        {
            return new ChatMedia(this);
        }

        public a(String s, String s1)
        {
            super(s, s1);
        }
    }


    public static final String CHAT_MEDIA_PATH = "/bq/chat_media";
    private static final String TAG = "ChatMedia";
    public static final String TYPE = "media";
    public boolean mHasBeenShown;
    protected int mHeight;
    public boolean mIsRetriedByUser;
    public boolean mIsZipped;
    protected String mIv;
    protected String mKey;
    protected String mMediaId;
    public MediaType mMediaType;
    public Uri mVideoUri;
    protected int mWidth;

    public ChatMedia(AA aa1)
    {
        super(Bt.q(), ((Mediabryo) (aa1)).mMediaMailingMetadata.e(), Long.valueOf(((Mediabryo) (aa1)).mTime.getTime()));
        mHasBeenShown = false;
        mId = ((Mediabryo) (aa1)).mClientId;
        mKey = KL.a();
        mIv = KL.b();
        mWidth = ((Mediabryo) (aa1)).mWidth;
        mHeight = ((Mediabryo) (aa1)).mHeight;
        mMediaType = MediaType.fromSnapMediaType(aa1.i());
    }

    public ChatMedia(AA aa1, String s)
    {
        super(Bt.q(), s, Long.valueOf(((Mediabryo) (aa1)).mTime.getTime()));
        mHasBeenShown = false;
        mId = ((Mediabryo) (aa1)).mClientId;
        mKey = KL.a();
        mIv = KL.b();
        mWidth = ((Mediabryo) (aa1)).mWidth;
        mHeight = ((Mediabryo) (aa1)).mHeight;
        mMediaType = MediaType.fromSnapMediaType(aa1.i());
    }

    public ChatMedia(Qm qm)
    {
        super(qm);
        mHasBeenShown = false;
        if (qm.b() && qm.a().b())
        {
            RL rl = qm.a().a();
            mMediaId = rl.a();
            mKey = rl.f();
            mIv = rl.g();
            mWidth = IJ.a(rl.h());
            mHeight = IJ.a(rl.i());
        }
        if (qm.b() && qm.a().b() && qm.a().a().c())
        {
            mMediaType = MediaType.valueOf(qm.a().a().b());
            return;
        } else
        {
            mMediaType = MediaType.IMAGE;
            return;
        }
    }

    public ChatMedia(a a1)
    {
        super(a1);
        mHasBeenShown = false;
        mMediaId = a1.mediaId;
        mKey = a1.key;
        mIv = a1.iv;
        mMediaType = a1.mediaType;
        mWidth = a1.width;
        mHeight = a1.height;
        mIsZipped = a1.isZipped;
    }

    public final String F()
    {
        return mMediaId;
    }

    public final MediaType G()
    {
        return mMediaType;
    }

    public final String H()
    {
        return mKey;
    }

    public final String I()
    {
        return mIv;
    }

    public final int J()
    {
        return mWidth;
    }

    public final int K()
    {
        return mHeight;
    }

    public final void L()
    {
        mIsRetriedByUser = true;
        if (this != null)
        {
            long l = W();
            c(l);
            Timber.f("ChatGroup", "[GroupId] Assigned group id %d to chat media %s.", new Object[] {
                Long.valueOf(l), d()
            });
        }
    }

    public Uri M()
    {
        return mVideoUri;
    }

    public String N()
    {
        return null;
    }

    public boolean O()
    {
        return false;
    }

    public boolean P()
    {
        return false;
    }

    public float U()
    {
        return 0.0F;
    }

    public float V()
    {
        return 0.0F;
    }

    public float X()
    {
        return 0.0F;
    }

    public float Z()
    {
        return 0.0F;
    }

    public final void a(Uri uri)
    {
        mVideoUri = uri;
        setChanged();
        notifyObservers();
    }

    public final void a(ChatMedia chatmedia)
    {
        if (mKey == null)
        {
            mKey = chatmedia.mKey;
        }
        if (mIv == null)
        {
            mIv = chatmedia.mIv;
        }
    }

    public boolean aa()
    {
        return false;
    }

    public boolean ab()
    {
        return mIsZipped;
    }

    public boolean ak()
    {
        return mMediaType == MediaType.VIDEO || mMediaType == MediaType.VIDEO_NO_SOUND;
    }

    public final void e(String s)
    {
        mMediaId = s;
    }

    public final void f(String s)
    {
        mKey = s;
    }

    public final void g(String s)
    {
        mIv = s;
    }

    public final boolean g(long l)
    {
        return i() && super.g(l);
    }

    public String h()
    {
        return "media";
    }

    public String toString()
    {
        return (new StringBuilder("ChatMedia{mMediaType=")).append(mMediaType).append(", mMediaId='").append(mMediaId).append('\'').append(", mKey='").append(mKey).append('\'').append(", mIv='").append(mIv).append('\'').append(", mIsLoaded='").append(i()).append('\'').append(", mWidth=").append(mWidth).append(", mHeight=").append(mHeight).append(", mIsSavedBySender=").append(mIsSavedBySender).append(", mIsSavedByRecipient=").append(mIsSavedByRecipient).append(", mIsReleasedByRecipient=").append(mIsReleasedByRecipient).append(", mIsPreserved=").append(mIsPreserved).append(", mTimestamp=").append(mTimestamp).append(", mReleasedTimestamp=").append(mReleasedTimestamp).append(", mIsDisplayedToRecipient=").append(mIsDisplayedToRecipient).append(", mSeqNum=").append(mSeqNum).append('}').toString();
    }
}
