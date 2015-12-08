// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;

public final class lx
{

    public lx()
    {
    }

    public static void a(AA aa, String s)
    {
        String s1;
        MediaMailingMetadata mediamailingmetadata;
        if (aa instanceof Bw)
        {
            s1 = String.format("Transcoding Status: %s", new Object[] {
                ((Bw)aa).mTranscodingState.c()
            });
        } else
        {
            s1 = "";
        }
        mediamailingmetadata = ((Mediabryo) (aa)).mMediaMailingMetadata;
        s1 = String.format("Upload Status: %s | Send Status: %s | Post Status: %s | %s", new Object[] {
            mediamailingmetadata.mUploadStatus, mediamailingmetadata.mSendStatus, mediamailingmetadata.mPostStatus, s1
        });
        Timber.c("SNAP_BAD_MEDIA", "Client Id: %s | Reason: %s | %s", new Object[] {
            ((Mediabryo) (aa)).mClientId, s, s1
        });
        (new EasyMetric("SNAP_BAD_MEDIA")).a("clientId", ((Mediabryo) (aa)).mClientId).a("mediaType", Integer.valueOf(aa.i())).a("reason", s).a("status_code", s1).a(false);
    }
}
