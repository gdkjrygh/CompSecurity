// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import java.util.HashMap;

public final class uF extends uJ
{

    private static final String TAG = "SendChatMediaWithMediaTask";

    public uF(AA aa, uI.a a1)
    {
        this(aa, a1, Bf.a(), AndroidNotificationManager.a());
    }

    private uF(AA aa, uI.a a1, Bf bf, AndroidNotificationManager androidnotificationmanager)
    {
        super(aa, a1, bf, androidnotificationmanager);
    }

    protected final void a()
    {
        mSnapWomb.a(mSnapbryo, com.snapchat.android.model.MediaMailingMetadata.UploadStatus.UPLOADED);
        (new uE(mSnapbryo, mSendSnapCallback, new HashMap())).execute();
    }

    protected final void b()
    {
        mSendSnapCallback.d(mSnapbryo);
        mNotificationManager.a(mContext, false);
        if (mUser != null)
        {
            mUser.a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                com.snapchat.android.database.table.DbTable.DatabaseTable.CHAT_MEDIA_FILES, com.snapchat.android.database.table.DbTable.DatabaseTable.FAILED_CHAT_MEDIA_SNAPBRYOS, com.snapchat.android.database.table.DbTable.DatabaseTable.CONVERSATION
            });
        }
    }

    public final pi executeSynchronously()
    {
        Ki.a();
        mData = Ki.a(mSnapbryo);
        if (mData == null)
        {
            Bf.a().a(mSnapbryo);
            Timber.e("SendChatMediaWithMediaTask", "Snap media is no longer accessible :(", new Object[0]);
            pi.a a1 = new pi.a(getUrl(), Pg.b());
            a1.mCaughtException = new Exception("Snap media is no longer accessible");
            return a1.a();
        } else
        {
            vB vb = (vB)((Mediabryo) (mSnapbryo)).mMediaExtras;
            mData = (new CbcEncryptionAlgorithm(vb.a(), vb.b())).a(mData, "no dataId provided");
            return super.executeSynchronously();
        }
    }
}
