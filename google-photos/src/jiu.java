// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jiu extends Exception
{

    public jiu(jjh jjh, Throwable throwable, int i)
    {
        jjh = String.valueOf(jjh);
        super((new StringBuilder(String.valueOf(jjh).length() + 36)).append("Decoder init failed: [").append(i).append("], ").append(jjh).toString(), throwable);
        if (i < 0)
        {
            jjh = "neg_";
        } else
        {
            jjh = "";
        }
        i = Math.abs(i);
        (new StringBuilder(String.valueOf(jjh).length() + 64)).append("com.google.android.exoplayer.MediaCodecTrackRenderer_").append(jjh).append(i);
    }

    public jiu(jjh jjh, Throwable throwable, String s)
    {
        jjh = String.valueOf(jjh);
        super((new StringBuilder(String.valueOf(s).length() + 23 + String.valueOf(jjh).length())).append("Decoder init failed: ").append(s).append(", ").append(jjh).toString(), throwable);
        if (jno.a >= 21 && (throwable instanceof android.media.MediaCodec.CodecException))
        {
            ((android.media.MediaCodec.CodecException)throwable).getDiagnosticInfo();
        }
    }
}
