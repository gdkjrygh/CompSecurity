// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import java.io.IOException;

final class osr
    implements osq
{

    osr()
    {
    }

    public final ost a(String s, boolean flag)
    {
        osx osx1;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        try
        {
            osx1 = new osx(MediaCodec.createDecoderByType(s));
        }
        catch (IOException ioexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Failed to create media decoder for mime type: ".concat(s);
            } else
            {
                s = new String("Failed to create media decoder for mime type: ");
            }
            orw.a(s, ioexception);
            return null;
        }
        return osx1;
    }
}
