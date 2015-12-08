// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            MediaTypeParameter, MediaTypeCaseClasses

public class SoundType extends MediaTypeParameter
{

    public static final SoundType AAC = new SoundType("AAC", "audio/aac", "aac");
    public static final SoundType MIDI = new SoundType("MIDI", "audio/midi", "mid");
    public static final SoundType MP3 = new SoundType("MP3", "audio/mp3", "mp3");
    public static final SoundType MPEG = new SoundType("MPEG", "audio/mpeg", "mpeg");
    public static final SoundType OGG = new SoundType("OGG", "audio/ogg", "ogg");
    public static final SoundType WAV = new SoundType("WAV", "audio/wav", "wav");
    private static final MediaTypeCaseClasses enums = new MediaTypeCaseClasses(ezvcard/parameter/SoundType);

    private SoundType(String s, String s1, String s2)
    {
        super(s, s1, s2);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static SoundType find(String s, String s1, String s2)
    {
        return (SoundType)enums.find(new String[] {
            s, s1, s2
        });
    }

    public static SoundType get(String s, String s1, String s2)
    {
        return (SoundType)enums.get(new String[] {
            s, s1, s2
        });
    }

}
