// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


// Referenced classes of package com.addlive.service:
//            Device

public final class AudioOutputDevice extends Enum
{

    private static final AudioOutputDevice $VALUES[];
    public static final AudioOutputDevice LOUD_SPEAKER;
    public static final AudioOutputDevice PHONE_SPEAKER;
    private String friendlyName;

    private AudioOutputDevice(String s, int i, String s1)
    {
        super(s, i);
        friendlyName = s1;
    }

    public static Device[] asDeviceArray()
    {
        Device adevice[] = new Device[values().length];
        for (int i = 0; i < values().length; i++)
        {
            AudioOutputDevice audiooutputdevice = values()[i];
            adevice[i] = new Device(audiooutputdevice.name(), audiooutputdevice.getFriendlyName());
        }

        return adevice;
    }

    public static AudioOutputDevice fromStringId(String s)
    {
        for (int i = 0; i < values().length; i++)
        {
            AudioOutputDevice audiooutputdevice = values()[i];
            if (audiooutputdevice.name().equals(s))
            {
                return audiooutputdevice;
            }
        }

        throw new IllegalArgumentException("There is no device with id given");
    }

    public static AudioOutputDevice valueOf(String s)
    {
        return (AudioOutputDevice)Enum.valueOf(com/addlive/service/AudioOutputDevice, s);
    }

    public static AudioOutputDevice[] values()
    {
        return (AudioOutputDevice[])$VALUES.clone();
    }

    public final String getFriendlyName()
    {
        return friendlyName;
    }

    static 
    {
        LOUD_SPEAKER = new AudioOutputDevice("LOUD_SPEAKER", 0, "Loud Speaker");
        PHONE_SPEAKER = new AudioOutputDevice("PHONE_SPEAKER", 1, "Phone Speaker");
        $VALUES = (new AudioOutputDevice[] {
            LOUD_SPEAKER, PHONE_SPEAKER
        });
    }
}
