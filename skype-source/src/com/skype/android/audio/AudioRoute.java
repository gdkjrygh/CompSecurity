// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.bluetooth.BluetoothAdapter;
import android.media.AudioManager;
import android.os.Build;
import com.skype.pcmhost.PcmHost;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.audio:
//            a, BluetoothReceiver, WiredHeadsetReceiver

public abstract class AudioRoute extends Enum
{

    public static final AudioRoute a;
    public static final AudioRoute b;
    public static final AudioRoute c;
    public static final AudioRoute d;
    public static final AudioRoute e;
    static final Logger f = Logger.getLogger("SkypeAudio");
    static volatile int g = 0;
    private static HashMap h;
    private static LinkedHashSet i;
    private static final AudioRoute j[];

    private AudioRoute(String s, int k)
    {
        super(s, k);
    }

    AudioRoute(String s, int k, byte byte0)
    {
        this(s, k);
    }

    public static AudioRoute a(AudioManager audiomanager, AudioRoute audioroute)
    {
        AudioRoute audioroute1;
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            AudioRoute audioroute2 = (AudioRoute)iterator.next();
            if (audioroute2.c(audiomanager).booleanValue())
            {
                return audioroute2;
            }
        }

        audioroute1 = audioroute;
        if (Build.PRODUCT.equalsIgnoreCase("BlackBerry"))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        audiomanager = com.skype.android.audio.a.a(audiomanager);
        audioroute1 = audioroute;
        if (audiomanager.contains(a.b))
        {
            audioroute1 = audioroute;
            try
            {
                if (!audiomanager.contains(a.a))
                {
                    audioroute1 = c;
                }
            }
            // Misplaced declaration of an exception variable
            catch (AudioManager audiomanager)
            {
                audiomanager.printStackTrace();
                audioroute1 = audioroute;
            }
        }
        if (audioroute1 == null)
        {
            return a;
        } else
        {
            return audioroute1;
        }
    }

    public static void a(String s, AudioManager audiomanager)
    {
        f.info((new StringBuilder("RouteCompleted ")).append(s).toString());
        if (s != null)
        {
            AudioRoute audioroute = (AudioRoute)h.get(s.toUpperCase(Locale.US));
            s = audioroute;
            if (audioroute == null)
            {
                s = a;
            }
            s.b(audiomanager);
        }
    }

    public static void d(AudioManager audiomanager)
    {
        for (int k = g; k > 0; k--)
        {
            audiomanager.stopBluetoothSco();
            g--;
        }

        if (audiomanager.isSpeakerphoneOn())
        {
            audiomanager.setSpeakerphoneOn(false);
        }
    }

    public static EnumSet e(AudioManager audiomanager)
    {
        EnumSet enumset = EnumSet.noneOf(com/skype/android/audio/AudioRoute);
        Iterator iterator = h.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AudioRoute audioroute = (AudioRoute)iterator.next();
            if (audioroute.c(audiomanager).booleanValue())
            {
                enumset.add(audioroute);
            }
        } while (true);
        return enumset;
    }

    public static AudioRoute valueOf(String s)
    {
        return (AudioRoute)Enum.valueOf(com/skype/android/audio/AudioRoute, s);
    }

    public static AudioRoute[] values()
    {
        return (AudioRoute[])j.clone();
    }

    protected abstract String a();

    protected abstract void a(AudioManager audiomanager);

    public final void a(AudioManager audiomanager, PcmHost pcmhost)
    {
        a(audiomanager);
        pcmhost.SetRoute(a());
        f.info((new StringBuilder("select ")).append(a()).toString());
    }

    public Boolean b()
    {
        return Boolean.valueOf(false);
    }

    protected abstract void b(AudioManager audiomanager);

    public abstract Boolean c(AudioManager audiomanager);

    static 
    {
        a = new AudioRoute("DEFAULT") {

            protected final String a()
            {
                return "EARPIECE";
            }

            protected final void a(AudioManager audiomanager)
            {
                if (audiomanager.isSpeakerphoneOn())
                {
                    audiomanager.setSpeakerphoneOn(false);
                }
                if (audiomanager.isBluetoothScoOn())
                {
                    audiomanager.setBluetoothScoOn(false);
                }
            }

            public final Boolean b()
            {
                return Boolean.valueOf(true);
            }

            protected final void b(AudioManager audiomanager)
            {
            }

            public final Boolean c(AudioManager audiomanager)
            {
                boolean flag;
                if (!audiomanager.isBluetoothA2dpOn())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

        };
        b = new AudioRoute("BLUETOOTH") {

            protected final String a()
            {
                return "BLUETOOTH";
            }

            protected final void a(AudioManager audiomanager)
            {
                if (audiomanager.isSpeakerphoneOn())
                {
                    audiomanager.setSpeakerphoneOn(false);
                }
            }

            protected final void b(AudioManager audiomanager)
            {
                if (audiomanager.isBluetoothScoOn())
                {
                    break MISSING_BLOCK_LABEL_24;
                }
                audiomanager.setBluetoothScoOn(true);
                audiomanager.startBluetoothSco();
                g++;
                return;
                audiomanager;
                f.log(Level.WARNING, String.format("NPE by AudioManager.startBluetoothSco() detected. Audio will not be routed to BT device.", new Object[0]), audiomanager);
                return;
            }

            public final Boolean c(AudioManager audiomanager)
            {
                boolean flag1 = true;
                boolean flag2 = audiomanager.isBluetoothScoAvailableOffCall();
                boolean flag3 = audiomanager.isBluetoothA2dpOn();
                audiomanager = BluetoothAdapter.getDefaultAdapter();
                boolean flag;
                boolean flag4;
                if (audiomanager != null && audiomanager.isEnabled())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag4 = BluetoothReceiver.a().booleanValue();
                if (!flag || !flag2 && !flag3 || !flag4)
                {
                    flag1 = false;
                }
                return Boolean.valueOf(flag1);
            }

        };
        c = new AudioRoute("SPEAKER") {

            protected final String a()
            {
                return "SPEAKER";
            }

            protected final void a(AudioManager audiomanager)
            {
                if (audiomanager.isBluetoothScoOn())
                {
                    audiomanager.setBluetoothScoOn(false);
                }
                if (!audiomanager.isSpeakerphoneOn())
                {
                    audiomanager.setSpeakerphoneOn(true);
                }
            }

            protected final void b(AudioManager audiomanager)
            {
            }

            public final Boolean c(AudioManager audiomanager)
            {
                return Boolean.valueOf(true);
            }

        };
        d = new AudioRoute("HEADSET_WITH_MIC") {

            protected final String a()
            {
                return "HEADSET_WITH_MIC";
            }

            protected final void a(AudioManager audiomanager)
            {
                if (audiomanager.isSpeakerphoneOn())
                {
                    audiomanager.setSpeakerphoneOn(false);
                }
                if (audiomanager.isBluetoothScoOn())
                {
                    audiomanager.setBluetoothScoOn(false);
                }
            }

            protected final void b(AudioManager audiomanager)
            {
            }

            public final Boolean c(AudioManager audiomanager)
            {
                boolean flag;
                if (WiredHeadsetReceiver.b() == WiredHeadsetReceiver.WiredHeadsetStatus.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
                audiomanager;
                audiomanager.printStackTrace();
                return Boolean.valueOf(false);
            }

        };
        e = new AudioRoute("HEADSET_WITHOUT_MIC") {

            protected final String a()
            {
                return "HEADSET_WITHOUT_MIC";
            }

            protected final void a(AudioManager audiomanager)
            {
                if (audiomanager.isSpeakerphoneOn())
                {
                    audiomanager.setSpeakerphoneOn(false);
                }
                if (audiomanager.isBluetoothScoOn())
                {
                    audiomanager.setBluetoothScoOn(false);
                }
            }

            protected final void b(AudioManager audiomanager)
            {
            }

            public final Boolean c(AudioManager audiomanager)
            {
                boolean flag;
                if (WiredHeadsetReceiver.b() == WiredHeadsetReceiver.WiredHeadsetStatus.b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
                audiomanager;
                audiomanager.printStackTrace();
                return Boolean.valueOf(false);
            }

        };
        j = (new AudioRoute[] {
            a, b, c, d, e
        });
        h = new HashMap();
        i = new LinkedHashSet();
        AudioRoute aaudioroute[] = values();
        int l = aaudioroute.length;
        for (int k = 0; k < l; k++)
        {
            AudioRoute audioroute = aaudioroute[k];
            h.put(audioroute.a(), audioroute);
        }

        i.add(e);
        i.add(d);
        i.add(b);
    }
}
