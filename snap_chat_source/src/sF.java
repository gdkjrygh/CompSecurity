// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import java.util.HashMap;

public final class sF extends sH
{

    private final Ki a;

    public sF()
    {
        Bf bf = Bf.a();
        Ki ki = Ki.a();
        Bt.a();
        this(bf, ki);
    }

    private sF(Bf bf, Ki ki)
    {
        super(bf);
        a = ki;
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
            (new uE(aa, this, new HashMap())).execute();
            return;

        case 2: // '\002'
            (new uF(aa, this)).execute();
            return;

        case 3: // '\003'
        case 4: // '\004'
            mediamailingmetadata.c();
            break;
        }
    }

    public final void b(AA aa)
    {
        super.b(aa);
        a.b(aa);
    }
}
