// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            RenderScript

public static final class b extends Enum
{

    public static final d a;
    private static d c;
    private static d d;
    private static final d e[];
    int b;

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(android/support/v8/renderscript/RenderScript$a, s);
    }

    public static b[] values()
    {
        return (b[])e.clone();
    }

    static 
    {
        a = new <init>("NORMAL", 0, 0);
        c = new <init>("DEBUG", 1, 1);
        d = new <init>("PROFILE", 2, 2);
        e = (new e[] {
            a, c, d
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        b = j;
    }
}
