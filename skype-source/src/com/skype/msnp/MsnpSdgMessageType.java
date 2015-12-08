// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.msnp;


public final class MsnpSdgMessageType extends Enum
{

    public static final MsnpSdgMessageType A;
    public static final MsnpSdgMessageType B;
    private static final MsnpSdgMessageType D[];
    public static final MsnpSdgMessageType a;
    public static final MsnpSdgMessageType b;
    public static final MsnpSdgMessageType c;
    public static final MsnpSdgMessageType d;
    public static final MsnpSdgMessageType e;
    public static final MsnpSdgMessageType f;
    public static final MsnpSdgMessageType g;
    public static final MsnpSdgMessageType h;
    public static final MsnpSdgMessageType i;
    public static final MsnpSdgMessageType j;
    public static final MsnpSdgMessageType k;
    public static final MsnpSdgMessageType l;
    public static final MsnpSdgMessageType m;
    public static final MsnpSdgMessageType n;
    public static final MsnpSdgMessageType o;
    public static final MsnpSdgMessageType p;
    public static final MsnpSdgMessageType q;
    public static final MsnpSdgMessageType r;
    public static final MsnpSdgMessageType s;
    public static final MsnpSdgMessageType t;
    public static final MsnpSdgMessageType u;
    public static final MsnpSdgMessageType v;
    public static final MsnpSdgMessageType w;
    public static final MsnpSdgMessageType x;
    public static final MsnpSdgMessageType y;
    public static final MsnpSdgMessageType z;
    private String C;

    private MsnpSdgMessageType(String s1, int i1, String s2)
    {
        super(s1, i1);
        C = s2;
    }

    public static MsnpSdgMessageType a(String s1)
    {
        MsnpSdgMessageType amsnpsdgmessagetype[] = values();
        int j1 = amsnpsdgmessagetype.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            MsnpSdgMessageType msnpsdgmessagetype = amsnpsdgmessagetype[i1];
            if (msnpsdgmessagetype.C.equalsIgnoreCase(s1))
            {
                return msnpsdgmessagetype;
            }
        }

        return a;
    }

    public static MsnpSdgMessageType valueOf(String s1)
    {
        return (MsnpSdgMessageType)Enum.valueOf(com/skype/msnp/MsnpSdgMessageType, s1);
    }

    public static MsnpSdgMessageType[] values()
    {
        return (MsnpSdgMessageType[])D.clone();
    }

    static 
    {
        a = new MsnpSdgMessageType("UNKNOWN", 0, "");
        b = new MsnpSdgMessageType("TEXT", 1, "Text");
        c = new MsnpSdgMessageType("RICH_TEXT", 2, "RichText");
        d = new MsnpSdgMessageType("TEXT_VIDEOMESSAGE", 3, "Text/VideoMessage");
        e = new MsnpSdgMessageType("EVENT_VIDEOMESSAGE", 4, "Event/SkypeVideoMessage");
        f = new MsnpSdgMessageType("CONTACTS", 5, "RichText/Contacts");
        g = new MsnpSdgMessageType("SMS", 6, "RichText/Sms");
        h = new MsnpSdgMessageType("FILES", 7, "RichText/Files");
        i = new MsnpSdgMessageType("LOCATION", 8, "RichText/Location");
        j = new MsnpSdgMessageType("ASYNC_SHARING", 9, "RichText/UriObject");
        k = new MsnpSdgMessageType("NUDGE", 10, "Nudge");
        l = new MsnpSdgMessageType("INK", 11, "Ink");
        m = new MsnpSdgMessageType("CUSTOMEMOTICON", 12, "CustomEmoticon");
        n = new MsnpSdgMessageType("WINK", 13, "Wink");
        o = new MsnpSdgMessageType("VOICE", 14, "Voice");
        p = new MsnpSdgMessageType("DATA", 15, "Data");
        q = new MsnpSdgMessageType("CONTROL_TYPING", 16, "Control/Typing");
        r = new MsnpSdgMessageType("CONTROL_INKING", 17, "Control/Inking");
        s = new MsnpSdgMessageType("SIGNAL_AUDIO", 18, "Signal/Audio");
        t = new MsnpSdgMessageType("SIGNAL_P2P", 19, "Signal/P2P");
        u = new MsnpSdgMessageType("SIGNAL_LOGOFFENDPOINT", 20, "Signal/LogoffEndpoint");
        v = new MsnpSdgMessageType("SIGNAL_CLOSEIMWINDOW", 21, "Signal/CloseIMWindow");
        w = new MsnpSdgMessageType("SIGNAL_FORCE_ABCH_SYNC", 22, "Signal/ForceAbchSync");
        x = new MsnpSdgMessageType("SIGNAL_CLOSE_RL_PROMPT", 23, "Signal/CloseRLPrompt");
        y = new MsnpSdgMessageType("SIGNAL_LOGOFF_ALL_ENDPOINTS", 24, "Signal/LogoffAllEndpoints");
        z = new MsnpSdgMessageType("SIGNAL_TURN", 25, "Signal/Turn");
        A = new MsnpSdgMessageType("SIGNAL_AUDIO_META", 26, "Signal/AudioMeta");
        B = new MsnpSdgMessageType("SIGNAL_AUDIO_TUNNEL", 27, "Signal/AudioTunnel");
        D = (new MsnpSdgMessageType[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B
        });
    }
}
