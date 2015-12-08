// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class axc
    implements anj
{

    public static final anf a = anf.a("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.valueOf(false));
    private final anj b;
    private final aqp c;

    public axc(anj anj1, aqp aqp)
    {
        b = anj1;
        c = aqp;
    }

    private static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(16384);
        byte abyte0[] = new byte[16384];
_L1:
        int i = inputstream.read(abyte0);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                if (Log.isLoggable("StreamGifDecoder", 5))
                {
                    Log.w("StreamGifDecoder", "Error reading data from stream", inputstream);
                }
                return null;
            }
        }
          goto _L1
        bytearrayoutputstream.flush();
        return bytearrayoutputstream.toByteArray();
    }

    public final aqa a(Object obj, int i, int j, ani ani1)
    {
        obj = a((InputStream)obj);
        if (obj == null)
        {
            return null;
        } else
        {
            obj = ByteBuffer.wrap(((byte []) (obj)));
            return b.a(obj, i, j, ani1);
        }
    }

    public final boolean a(Object obj, ani ani1)
    {
        obj = (InputStream)obj;
        return !((Boolean)ani1.a(a)).booleanValue() && (new ImageHeaderParser(((InputStream) (obj)), c)).a() == com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.GIF;
    }

}
