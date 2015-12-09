// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

private static class <init>
{

    public int fromX;
    public int fromY;
    public toY newHolder;
    public toY oldHolder;
    public int toX;
    public int toY;

    public String toString()
    {
        return (new StringBuilder()).append("ChangeInfo{oldHolder=").append(oldHolder).append(", newHolder=").append(newHolder).append(", fromX=").append(fromX).append(", fromY=").append(fromY).append(", toX=").append(toX).append(", toY=").append(toY).append('}').toString();
    }

    private ( ,  1)
    {
        oldHolder = ;
        newHolder = 1;
    }

    private newHolder(newHolder newholder, newHolder newholder1, int i, int j, int k, int l)
    {
        this(newholder, newholder1);
        fromX = i;
        fromY = j;
        toX = k;
        toY = l;
    }

    toY(toY toy, toY toy1, int i, int j, int k, int l, toY toy2)
    {
        this(toy, toy1, i, j, k, l);
    }
}
