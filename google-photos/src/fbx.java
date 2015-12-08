// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fbx extends Enum
{

    public static final fbx a;
    public static final fbx b;
    public static final fbx c;
    private static final fbx d[];

    private fbx(String s, int i)
    {
        super(s, i);
    }

    public static fbx valueOf(String s)
    {
        return (fbx)Enum.valueOf(fbx, s);
    }

    public static fbx[] values()
    {
        return (fbx[])d.clone();
    }

    static 
    {
        a = new fbx("IDLE", 0);
        b = new fbx("DELETING", 1);
        c = new fbx("COMPLETED", 2);
        d = (new fbx[] {
            a, b, c
        });
    }
}
