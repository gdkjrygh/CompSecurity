// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

public static final class  extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(kik/android/chat/fragment/KikChatFragment$e, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        a = new <init>("HIDDEN", 0);
        b = new <init>("SIMPLE", 1);
        c = new <init>("ADVANCED", 2);
        d = new <init>("ENTERING_SIMPLE", 3);
        e = new <init>("ENTERING_ADVANCED", 4);
        f = new <init>("BEGAN_SCROLLING", 5);
        g = new <init>("FINISHED_SCROLLING", 6);
        h = new <init>("CHANGING_ORIENTATION", 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
