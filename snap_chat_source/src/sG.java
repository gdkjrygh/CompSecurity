// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.database.OnboardingTooltip;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.util.cache.DiscoverShareCache;
import java.util.HashMap;

public final class sG extends sH
{

    private final Kn a;
    private final Kc b;

    public sG()
    {
        Bf bf = Bf.a();
        Kn kn = Kn.a();
        Kc kc = Kc.a.a();
        new wH();
        Bt.a();
        this(bf, kn, kc);
    }

    private sG(Bf bf, Kn kn, Kc kc)
    {
        super(bf);
        a = kn;
        b = kc;
    }

    protected final void a(AA aa)
    {
        MediaMailingMetadata mediamailingmetadata = ((Mediabryo) (aa)).mMediaMailingMetadata;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.snapchat.android.model.MediaMailingMetadata.UploadStatus.values().length];
                try
                {
                    a[com.snapchat.android.model.MediaMailingMetadata.UploadStatus.UPLOADED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.snapchat.android.model.MediaMailingMetadata.UploadStatus.FAILED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.snapchat.android.model.MediaMailingMetadata.UploadStatus.UPLOADING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.snapchat.android.model.MediaMailingMetadata.UploadStatus.WILL_UPLOAD_AFTER_SAVE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[mediamailingmetadata.mUploadStatus.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Timber.c("SendDSnapController", "DSnap uploaded successfully. Start SendDSnapTask for recipients %s.", new Object[] {
                mediamailingmetadata.e()
            });
            (new uG(aa, this, new HashMap())).execute();
            return;

        case 2: // '\002'
            Timber.c("SendDSnapController", "DSnap failed to upload. Start SendDSnapWithMediaTask for recipients %s.", new Object[] {
                mediamailingmetadata.e()
            });
            (new uH(aa, this)).execute();
            return;

        case 3: // '\003'
        case 4: // '\004'
            Timber.c("SendDSnapController", "DSnap is uploading. Will send snap after upload for recipients %s.", new Object[] {
                mediamailingmetadata.e()
            });
            break;
        }
        mediamailingmetadata.c();
    }

    public final void b(AA aa)
    {
        super.b(aa);
        wH.a(true, ((Mediabryo) (aa)).mClientId);
        if (!Bt.ba())
        {
            Bt.a(OnboardingTooltip.SHARE_DISCOVER);
        }
        SharedPreferenceKey.HAS_SHARED_DISCOVER_SNAP.putBoolean(true);
        if (aa instanceof Bw)
        {
            a.b(((Mediabryo) (aa)).mClientId);
        }
        c(aa);
    }

    public final void c(AA aa)
    {
        Kc kc = b;
        aa = ((Mediabryo) (aa)).mClientId;
        kc.mCache.e(aa);
        kc.mCache.a(true);
    }

    public final void d(AA aa)
    {
        if (aa == null)
        {
            return;
        } else
        {
            super.d(aa);
            wH.a(false, ((Mediabryo) (aa)).mClientId);
            return;
        }
    }
}
