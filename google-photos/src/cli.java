// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;

final class cli
    implements cla
{

    private String a;

    cli(String s)
    {
        a = s;
        super();
    }

    public final clb a(MediaFormat mediaformat)
    {
        String s = clc.e(mediaformat.getString("mime"));
        clb clb = clc.a(clc.g(s), a, s);
        mediaformat = clb;
        if (clb == null)
        {
            try
            {
                mediaformat = new clj(MediaCodec.createEncoderByType(s), s);
            }
            catch (IOException ioexception)
            {
                mediaformat = String.valueOf(s);
                if (mediaformat.length() != 0)
                {
                    mediaformat = "Unable to create codec for: ".concat(mediaformat);
                } else
                {
                    mediaformat = new String("Unable to create codec for: ");
                }
                throw new IllegalArgumentException(mediaformat, ioexception);
            }
        }
        return mediaformat;
    }
}
