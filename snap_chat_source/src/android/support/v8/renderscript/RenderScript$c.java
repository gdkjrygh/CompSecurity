// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            RenderScript

public static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    int c;

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(android/support/v8/renderscript/RenderScript$c, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    static 
    {
        a = new <init>("LOW", 0, 15);
        b = new <init>("NORMAL", 1, -4);
        d = (new d[] {
            a, b
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        c = j;
    }
}
