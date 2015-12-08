// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget;


// Referenced classes of package com.google.android.gms.games.ui.widget:
//            MetagameAvatarView

private static final class outlineSize
{

    public final int height;
    public final int imageSize;
    public final int outlineSize;
    public final int width;

    public (int i, int j, int k, int l)
    {
        outlineSize = Math.min(j - l, i);
        width = outlineSize;
        height = outlineSize + l;
        imageSize = outlineSize - k * 2;
    }
}
