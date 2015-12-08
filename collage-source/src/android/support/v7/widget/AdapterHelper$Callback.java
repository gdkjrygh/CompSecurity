// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            AdapterHelper

static interface 
{

    public abstract  findViewHolder(int i);

    public abstract void markViewHoldersUpdated(int i, int j, Object obj);

    public abstract void offsetPositionsForAdd(int i, int j);

    public abstract void offsetPositionsForMove(int i, int j);

    public abstract void offsetPositionsForRemovingInvisible(int i, int j);

    public abstract void offsetPositionsForRemovingLaidOutOrNewView(int i, int j);

    public abstract void onDispatchFirstPass( );

    public abstract void onDispatchSecondPass( );
}
