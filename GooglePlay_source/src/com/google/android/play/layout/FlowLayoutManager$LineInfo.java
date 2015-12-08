// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;


// Referenced classes of package com.google.android.play.layout:
//            FlowLayoutManager

private static abstract class <init> extends Info
{

    public int mOffsetStart;

    public abstract void clearMeasuredInCurrentPass();

    abstract void debugPrint$241f81bd(StringBuilder stringbuilder);

    public abstract int getItemTopOffset(int i);

    public abstract void recycle();

    private Info()
    {
        super((byte)0);
    }

    Info(byte byte0)
    {
        this();
    }
}
