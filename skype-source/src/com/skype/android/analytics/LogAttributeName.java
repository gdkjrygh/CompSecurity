// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


// Referenced classes of package com.skype.android.analytics:
//            EventAttribute

public final class LogAttributeName extends Enum
    implements EventAttribute
{

    public static final LogAttributeName A;
    public static final LogAttributeName B;
    public static final LogAttributeName C;
    public static final LogAttributeName D;
    public static final LogAttributeName E;
    public static final LogAttributeName F;
    public static final LogAttributeName G;
    public static final LogAttributeName H;
    public static final LogAttributeName I;
    public static final LogAttributeName J;
    public static final LogAttributeName K;
    public static final LogAttributeName L;
    public static final LogAttributeName M;
    public static final LogAttributeName N;
    public static final LogAttributeName O;
    public static final LogAttributeName P;
    public static final LogAttributeName Q;
    public static final LogAttributeName R;
    public static final LogAttributeName S;
    public static final LogAttributeName T;
    public static final LogAttributeName U;
    public static final LogAttributeName V;
    public static final LogAttributeName W;
    public static final LogAttributeName X;
    public static final LogAttributeName Y;
    public static final LogAttributeName Z;
    public static final LogAttributeName a;
    public static final LogAttributeName aa;
    public static final LogAttributeName ab;
    public static final LogAttributeName ac;
    public static final LogAttributeName ad;
    public static final LogAttributeName ae;
    public static final LogAttributeName af;
    public static final LogAttributeName ag;
    public static final LogAttributeName ah;
    public static final LogAttributeName ai;
    public static final LogAttributeName aj;
    public static final LogAttributeName ak;
    public static final LogAttributeName al;
    public static final LogAttributeName am;
    public static final LogAttributeName an;
    public static final LogAttributeName ao;
    private static final LogAttributeName ap[];
    public static final LogAttributeName b;
    public static final LogAttributeName c;
    public static final LogAttributeName d;
    public static final LogAttributeName e;
    public static final LogAttributeName f;
    public static final LogAttributeName g;
    public static final LogAttributeName h;
    public static final LogAttributeName i;
    public static final LogAttributeName j;
    public static final LogAttributeName k;
    public static final LogAttributeName l;
    public static final LogAttributeName m;
    public static final LogAttributeName n;
    public static final LogAttributeName o;
    public static final LogAttributeName p;
    public static final LogAttributeName q;
    public static final LogAttributeName r;
    public static final LogAttributeName s;
    public static final LogAttributeName t;
    public static final LogAttributeName u;
    public static final LogAttributeName v;
    public static final LogAttributeName w;
    public static final LogAttributeName x;
    public static final LogAttributeName y;
    public static final LogAttributeName z;

    private LogAttributeName(String s1, int i1)
    {
        super(s1, i1);
    }

    public static LogAttributeName valueOf(String s1)
    {
        return (LogAttributeName)Enum.valueOf(com/skype/android/analytics/LogAttributeName, s1);
    }

    public static LogAttributeName[] values()
    {
        return (LogAttributeName[])ap.clone();
    }

    static 
    {
        a = new LogAttributeName("Event_Value", 0);
        b = new LogAttributeName("Error_Type", 1);
        c = new LogAttributeName("Get_Office_App_Screen_Displayed", 2);
        d = new LogAttributeName("Go_To_Play_Store", 3);
        e = new LogAttributeName("Dont_Go_To_Play_Store", 4);
        f = new LogAttributeName("Changed", 5);
        g = new LogAttributeName("Conversation_Id", 6);
        h = new LogAttributeName("Enabled", 7);
        i = new LogAttributeName("From", 8);
        j = new LogAttributeName("Incoming", 9);
        k = new LogAttributeName("Me", 10);
        l = new LogAttributeName("Message_Id", 11);
        m = new LogAttributeName("Other", 12);
        n = new LogAttributeName("Status", 13);
        o = new LogAttributeName("Succeed", 14);
        p = new LogAttributeName("To", 15);
        q = new LogAttributeName("Account_Type", 16);
        r = new LogAttributeName("Auto_Redirect", 17);
        s = new LogAttributeName("Current_Screen", 18);
        t = new LogAttributeName("Error", 19);
        u = new LogAttributeName("Exception", 20);
        v = new LogAttributeName("Flow_Type", 21);
        w = new LogAttributeName("Is_Msa_Sdk_Used", 22);
        x = new LogAttributeName("Install_Id", 23);
        y = new LogAttributeName("Login_Id_Type", 24);
        z = new LogAttributeName("Logout_Reason", 25);
        A = new LogAttributeName("Is_App_Resumed", 26);
        B = new LogAttributeName("Network_Type", 27);
        C = new LogAttributeName("Ellapsed_Time", 28);
        D = new LogAttributeName("Number", 29);
        E = new LogAttributeName("Moji_Name", 30);
        F = new LogAttributeName("Moji_Item_Id", 31);
        G = new LogAttributeName("Moji_Source", 32);
        H = new LogAttributeName("Moji_Section", 33);
        I = new LogAttributeName("Moji_Tab_Name", 34);
        J = new LogAttributeName("Moji_Tab_Index", 35);
        K = new LogAttributeName("Moji_Forward_Source", 36);
        L = new LogAttributeName("Emo_Message_Id", 37);
        M = new LogAttributeName("Emo_Name", 38);
        N = new LogAttributeName("Emo_Shortcut", 39);
        O = new LogAttributeName("Emo_Source", 40);
        P = new LogAttributeName("Emo_Section", 41);
        Q = new LogAttributeName("Emo_Tab_Name", 42);
        R = new LogAttributeName("Emo_Tab_Index", 43);
        S = new LogAttributeName("Search_Keyword", 44);
        T = new LogAttributeName("Search_String_Source", 45);
        U = new LogAttributeName("Number_Of_Moji_Results", 46);
        V = new LogAttributeName("Number_Of_Emoticon_Results", 47);
        W = new LogAttributeName("Moji_Index", 48);
        X = new LogAttributeName("Emoticon_Index", 49);
        Y = new LogAttributeName("Emoticon_Name", 50);
        Z = new LogAttributeName("Action", 51);
        aa = new LogAttributeName("Number_Of_Previews", 52);
        ab = new LogAttributeName("Call_Effect_Name", 53);
        ac = new LogAttributeName("Call_Effect_Type", 54);
        ad = new LogAttributeName("Save_Success", 55);
        ae = new LogAttributeName("Video_Message_Direction", 56);
        af = new LogAttributeName("Snooze_Duration", 57);
        ag = new LogAttributeName("Button_Type", 58);
        ah = new LogAttributeName("Left_Conversation", 59);
        ai = new LogAttributeName("Capacity", 60);
        aj = new LogAttributeName("Drain", 61);
        ak = new LogAttributeName("DrainPerSecond", 62);
        al = new LogAttributeName("StartingPercentage", 63);
        am = new LogAttributeName("StaringChargingState", 64);
        an = new LogAttributeName("EndingChargingState", 65);
        ao = new LogAttributeName("Failure", 66);
        ap = (new LogAttributeName[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa, ab, ac, ad, ae, af, ag, ah, 
            ai, aj, ak, al, am, an, ao
        });
    }
}
