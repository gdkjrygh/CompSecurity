// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.api2.framework.HttpMethod;
import java.io.FileOutputStream;
import java.io.IOException;

public final class FL extends oV
{
    public static interface a
    {

        public abstract void a();
    }


    private final Context a = SnapchatApplication.get();
    private final FP b;
    private final a c;

    public FL(FP fp, a a1)
    {
        b = fp;
        c = a1;
    }

    public final HttpMethod getMethod()
    {
        return HttpMethod.GET;
    }

    public final pn getRequestPayload()
    {
        return null;
    }

    public final String getUrl()
    {
        return b.c;
    }

    public final void onResult(pi pi1)
    {
        FileOutputStream fileoutputstream;
        FileOutputStream fileoutputstream1;
        Object obj;
        Pb pb;
        super.onResult(pi1);
        pb = pi1.mBuffer;
        if (pb == null)
        {
            Timber.f("DownloadStickerIconTask", "[Stickers] Icon pack buffer was null", new Object[0]);
            return;
        }
        obj = b.a();
        fileoutputstream1 = null;
        fileoutputstream = null;
        obj = a.openFileOutput(((String) (obj)), 0);
        fileoutputstream = ((FileOutputStream) (obj));
        fileoutputstream1 = ((FileOutputStream) (obj));
        ((FileOutputStream) (obj)).write(pb.b(), 0, pi1.b());
        fileoutputstream = ((FileOutputStream) (obj));
        fileoutputstream1 = ((FileOutputStream) (obj));
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        fileoutputstream = ((FileOutputStream) (obj));
        fileoutputstream1 = ((FileOutputStream) (obj));
        c.a();
        Pf.a(((java.io.Closeable) (obj)));
        return;
        pi1;
        fileoutputstream1 = fileoutputstream;
        Timber.f("DownloadStickerIconTask", "[Stickers] Icon pack download failed: %s", new Object[] {
            pi1.getMessage()
        });
        Pf.a(fileoutputstream);
        return;
        pi1;
        Pf.a(fileoutputstream1);
        throw pi1;
    }
}
