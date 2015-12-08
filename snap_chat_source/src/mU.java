// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.api2.framework.HttpMethod;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import java.net.URI;
import java.util.Map;
import java.util.TreeMap;

public class mU extends oV
{
    public final class a extends pn
    {

        final mU this$0;

        public final boolean a()
        {
            return false;
        }

        public final Xz b()
        {
            mU.b(mU.this);
            byte abyte0[] = Ki.a(mU.a(mU.this));
            vB vb = (vB)((Mediabryo) (mU.a(mU.this))).mMediaExtras;
            abyte0 = (new CbcEncryptionAlgorithm(vb.a(), vb.b())).a(abyte0, "no dataId provided");
            return Xz.a(BYTE_STREAM_MEDIA_TYPE, abyte0);
        }

        public a()
        {
            this$0 = mU.this;
            super();
        }
    }


    private static final String GCS_HEADER_ONLY_PUT_IF_OBJECT_NOT_EXISTS = "x-goog-if-generation-match";
    private static final String TAG = "UploadMediaWithUrlTask";
    private final sL mCallback;
    private final Ki mSendSnapCacheWrapper = Ki.a();
    private final Bf mSnapWomb = Bf.a();
    private final AA mSnapbryo;
    private final URI mUrl;

    public mU(AA aa, sL sl)
    {
        mSnapbryo = aa;
        mUrl = aa.mUploadUrl.a();
        mCallback = sl;
        Timber.c("UploadMediaWithUrlTask", (new StringBuilder("Creating UploadMediaWithUrlTask for snap ")).append(((Mediabryo) (mSnapbryo)).mClientId).toString(), new Object[0]);
    }

    static AA a(mU mu)
    {
        return mu.mSnapbryo;
    }

    static Ki b(mU mu)
    {
        return mu.mSendSnapCacheWrapper;
    }

    public Map getHeaders(pn pn)
    {
        pn = new TreeMap();
        pn.put("x-goog-if-generation-match", "0");
        return pn;
    }

    public HttpMethod getMethod()
    {
        return HttpMethod.PUT;
    }

    public pn getRequestPayload()
    {
        return new a();
    }

    public String getUrl()
    {
        return mUrl.toString();
    }

    public void onResult(pi pi1)
    {
        if (pi1.c())
        {
            Timber.c("UploadMediaWithUrlTask", (new StringBuilder("Media upload succeeded for snap ")).append(((Mediabryo) (mSnapbryo)).mClientId).toString(), new Object[0]);
            mSnapWomb.a(mSnapbryo, com.snapchat.android.model.MediaMailingMetadata.UploadStatus.UPLOADED);
        } else
        {
            Timber.c("UploadMediaWithUrlTask", (new StringBuilder("Media upload failed for snap ")).append(((Mediabryo) (mSnapbryo)).mClientId).append(" with code ").append(pi1.mResponseCode).toString(), new Object[0]);
            mSnapWomb.a(mSnapbryo, com.snapchat.android.model.MediaMailingMetadata.UploadStatus.FAILED);
            mSnapbryo.mUploadUrl = null;
        }
        mCallback.c(mSnapbryo);
    }
}
