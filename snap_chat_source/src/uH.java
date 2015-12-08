// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.notification.AndroidNotificationManager;
import java.util.HashMap;

public final class uH extends uJ
{

    private static final String TAG = "SendDSnapWithMediaTask";
    private Kc mDiscoverShareCacheWrapper;
    private final wH mDiscoverSharingUtils;

    public uH(AA aa, uI.a a1)
    {
        this(aa, a1, Kc.a.a(), Bf.a(), AndroidNotificationManager.a(), new wH());
    }

    private uH(AA aa, uI.a a1, Kc kc, Bf bf, AndroidNotificationManager androidnotificationmanager, wH wh)
    {
        super(aa, a1, bf, androidnotificationmanager);
        mDiscoverShareCacheWrapper = kc;
        mDiscoverSharingUtils = wh;
    }

    protected final void a()
    {
        mSnapWomb.a(mSnapbryo, com.snapchat.android.model.MediaMailingMetadata.UploadStatus.UPLOADED);
        Timber.c("SendDSnapWithMediaTask", "Execute SendDSnapTask from SendDSnapWithMediaTask for recipients %s.", new Object[] {
            ((Mediabryo) (mSnapbryo)).mMediaMailingMetadata.e()
        });
        (new uG(mSnapbryo, mSendSnapCallback, new HashMap())).execute();
    }

    protected final void b()
    {
        mSendSnapCallback.d(mSnapbryo);
        mNotificationManager.a(mContext, false);
        if (mUser != null)
        {
            mUser.a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                com.snapchat.android.database.table.DbTable.DatabaseTable.DISCOVER_SHARE_FILES, com.snapchat.android.database.table.DbTable.DatabaseTable.FAILED_SEND_DSNAPBRYOS, com.snapchat.android.database.table.DbTable.DatabaseTable.CONVERSATION
            });
        }
    }

    public final pi executeSynchronously()
    {
        mData = mDiscoverShareCacheWrapper.a(mSnapbryo);
        if (mData == null)
        {
            Bf.a().a(mSnapbryo);
            Timber.e("SendDSnapWithMediaTask", "Snap media is no longer accessible :(", new Object[0]);
            wH.a(false, ((Mediabryo) (mSnapbryo)).mClientId);
            pi.a a1 = new pi.a(getUrl(), Pg.b());
            a1.mCaughtException = new Exception("Snap media is no longer accessible");
            return a1.a();
        } else
        {
            return super.executeSynchronously();
        }
    }
}
