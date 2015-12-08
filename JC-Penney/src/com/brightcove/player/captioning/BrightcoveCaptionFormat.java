// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import android.media.MediaFormat;

// Referenced classes of package com.brightcove.player.captioning:
//            c

public abstract class BrightcoveCaptionFormat
{

    public BrightcoveCaptionFormat()
    {
    }

    public static Builder builder()
    {
        return new c();
    }

    public static MediaFormat convertCaptionFormat(BrightcoveCaptionFormat brightcovecaptionformat)
    {
        return MediaFormat.createSubtitleFormat(brightcovecaptionformat.type(), brightcovecaptionformat.language());
    }

    public static BrightcoveCaptionFormat createCaptionFormat(String s, String s1)
    {
        return builder().type(s).language(s1).build();
    }

    public abstract String language();

    public abstract String type();

    public void validate()
    {
        if (language().length() < 2)
        {
            throw new IllegalStateException("Language Code incorrect. ");
        } else
        {
            return;
        }
    }

    private class Builder
    {

        public abstract BrightcoveCaptionFormat build();

        public abstract Builder language(String s);

        public abstract Builder type(String s);
    }

}
