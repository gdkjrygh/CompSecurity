// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;


// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

public static final class hasDivider
{

    private final boolean hasDivider;
    private final com.google.wallet.proto.api.Node node;

    public final com.google.wallet.proto.api.Node getNode()
    {
        return node;
    }

    public final boolean hasDivider()
    {
        return hasDivider;
    }


    public (com.google.wallet.proto.api.Node node1, boolean flag)
    {
        node = node1;
        hasDivider = flag;
    }
}
