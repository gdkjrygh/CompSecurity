// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;

public interface dqz
    extends drf, dry
{

    public static final ImmutableList b = ImmutableList.a(Integer.valueOf(0x7f1100ed), Integer.valueOf(0x7f1100ee));

    public abstract PorcelainImage getImage();

    public abstract PorcelainNavigationLink getLongClickLink();

    public abstract int getMaxRows();

    public abstract drz getPlayable();

    public abstract Object getText();

}
