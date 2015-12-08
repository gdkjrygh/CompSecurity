// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.io.IOException;

final class clh
    implements cla
{

    private int a;
    private String b[];

    clh(String as[])
    {
        b = as;
        super();
    }

    public final clb a(MediaFormat mediaformat)
    {
        String s1 = clc.e(mediaformat.getString("mime"));
        Object obj = clc.a(clc.f(s1), b[a], s1);
        if (obj == null)
        {
            try
            {
                mediaformat = new clj(MediaCodec.createDecoderByType(s1), s1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                String s = clc.e();
                mediaformat = String.valueOf(s1);
                if (mediaformat.length() != 0)
                {
                    mediaformat = "Problem creating codec by type: ".concat(mediaformat);
                } else
                {
                    mediaformat = new String("Problem creating codec by type: ");
                }
                Log.e(s, mediaformat, ((Throwable) (obj)));
                return null;
            }
        } else
        {
            a = a + 1;
            mediaformat = ((MediaFormat) (obj));
            if (a == b.length)
            {
                a = 0;
                return ((clb) (obj));
            }
        }
        return mediaformat;
    }
}
