// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.snapchat.android.Timber;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

public final class JT
    implements JP
{

    private static final String TAG = "EncryptedFileBitmapSource";
    private final KK mEncryptionAlgorithm;
    private final String mPath;

    public JT(String s, KK kk)
    {
        mPath = s;
        mEncryptionAlgorithm = kk;
    }

    public final JQ a(android.graphics.BitmapFactory.Options options)
    {
        Object obj;
        byte abyte0[];
        int i;
        obj = new File(mPath);
        long l = ((File) (obj)).length();
        if (l > 0x7fffffffL)
        {
            Timber.e("EncryptedFileBitmapSource", "Cannot read files larger than Integer.MAX_VALUE bytes", new Object[0]);
            return new JQ(null, false);
        }
        i = (int)l;
        abyte0 = new byte[i];
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(((File) (obj))));
        obj = bufferedinputstream;
        i = bufferedinputstream.read(abyte0, 0, i);
        Pf.a(bufferedinputstream);
_L1:
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        obj = mEncryptionAlgorithm.b(abyte0);
        boolean flag = false;
_L2:
        IOException ioexception;
        if (obj == null)
        {
            options = null;
        } else
        {
            options = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
        }
_L5:
        return new JQ(options, flag);
        ioexception;
        bufferedinputstream = null;
_L4:
        obj = bufferedinputstream;
        Timber.e("EncryptedFileBitmapSource", Log.getStackTraceString(ioexception), new Object[0]);
        Pf.a(bufferedinputstream);
        i = 0;
          goto _L1
        options;
        obj = null;
_L3:
        Pf.a(((java.io.Closeable) (obj)));
        throw options;
        obj;
        flag = true;
        obj = null;
          goto _L2
        options;
          goto _L3
        ioexception;
          goto _L4
        flag = false;
        options = null;
          goto _L5
    }

    public final void a(ContentResolver contentresolver, Resources resources)
    {
    }
}
