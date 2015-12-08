// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.msnp;


public final class MsnpHeader extends Enum
{

    public static final MsnpHeader a;
    public static final MsnpHeader b;
    public static final MsnpHeader c;
    public static final MsnpHeader d;
    public static final MsnpHeader e;
    public static final MsnpHeader f;
    public static final MsnpHeader g;
    public static final MsnpHeader h;
    public static final MsnpHeader i;
    public static final MsnpHeader j;
    public static final MsnpHeader k;
    public static final MsnpHeader l;
    public static final MsnpHeader m;
    public static final MsnpHeader n;
    public static final MsnpHeader o;
    public static final MsnpHeader p;
    public static final MsnpHeader q;
    public static final MsnpHeader r;
    public static final MsnpHeader s;
    private static final MsnpHeader u[];
    private String t;

    private MsnpHeader(String s1, int i1, String s2)
    {
        super(s1, i1);
        t = s2;
    }

    public static MsnpHeader valueOf(String s1)
    {
        return (MsnpHeader)Enum.valueOf(com/skype/msnp/MsnpHeader, s1);
    }

    public static MsnpHeader[] values()
    {
        return (MsnpHeader[])u.clone();
    }

    public final String a()
    {
        return t;
    }

    static 
    {
        a = new MsnpHeader("ACK_ID", 0, "Ack-Id");
        b = new MsnpHeader("SESSION_ID", 1, "Session-Id");
        c = new MsnpHeader("TO", 2, "To");
        d = new MsnpHeader("FROM", 3, "From");
        e = new MsnpHeader("VIA", 4, "Via");
        f = new MsnpHeader("CONTENT_TYPE", 5, "Content-Type");
        g = new MsnpHeader("CONTENT_LENGTH", 6, "Content-Length");
        h = new MsnpHeader("SERVICE_CHANNEL", 7, "Service-Channel");
        i = new MsnpHeader("MESSAGE_ID", 8, "Message-ID");
        j = new MsnpHeader("CLIENT_MESSAGE_ID", 9, "Client-Message-ID");
        k = new MsnpHeader("MESSAGE_TYPE", 10, "Message-Type");
        l = new MsnpHeader("IM_DISPLAY_NAME", 11, "IM-Display-Name");
        m = new MsnpHeader("THREAD_TOPIC", 12, "Thread-Topic");
        n = new MsnpHeader("ORIGINAL_ARRIVAL_TIME", 13, "Original-Arrival-Time");
        o = new MsnpHeader("IS_ACTIVE", 14, "Is-Active");
        p = new MsnpHeader("SKYPE_EDITED_ID", 15, "Skype-EditedId");
        q = new MsnpHeader("SKYPE_EMOTE_OFFSET", 16, "Skype-EmoteOffset");
        r = new MsnpHeader("SKYPE_TYPING_STATUS", 17, "Skype-TypingStatus");
        s = new MsnpHeader("SKYPE_IGNORE", 18, "Skype-Ignore");
        u = (new MsnpHeader[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s
        });
    }
}
