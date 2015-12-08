// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.io.IOException;

final class clf
    implements cla
{

    clf()
    {
    }

    public final clb a(MediaFormat mediaformat)
    {
        b.a(mediaformat, "mediaFormat", null);
        mediaformat = clc.e(mediaformat.getString("mime"));
        clj clj1;
        try
        {
            clj1 = new clj(MediaCodec.createDecoderByType(mediaformat), mediaformat);
        }
        catch (IOException ioexception)
        {
            String s = clc.e();
            mediaformat = String.valueOf(mediaformat);
            if (mediaformat.length() != 0)
            {
                mediaformat = "Problem creating codec by type: ".concat(mediaformat);
            } else
            {
                mediaformat = new String("Problem creating codec by type: ");
            }
            Log.e(s, mediaformat, ioexception);
            return null;
        }
        return clj1;
    }
}
