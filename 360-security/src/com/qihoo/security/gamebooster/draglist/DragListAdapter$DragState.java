// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster.draglist;


// Referenced classes of package com.qihoo.security.gamebooster.draglist:
//            DragListAdapter

public static final class  extends Enum
{

    public static final UnInstall Delete;
    public static final UnInstall In;
    public static final UnInstall Out;
    public static final UnInstall Release;
    public static final UnInstall StartDrag;
    public static final UnInstall UnInstall;
    private static final UnInstall a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/gamebooster/draglist/DragListAdapter$DragState, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        StartDrag = new <init>("StartDrag", 0);
        In = new <init>("In", 1);
        Out = new <init>("Out", 2);
        Release = new <init>("Release", 3);
        Delete = new <init>("Delete", 4);
        UnInstall = new <init>("UnInstall", 5);
        a = (new a[] {
            StartDrag, In, Out, Release, Delete, UnInstall
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
