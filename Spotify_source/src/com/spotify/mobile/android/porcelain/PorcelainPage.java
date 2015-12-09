// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain;

import java.util.List;

public interface PorcelainPage
{

    public abstract PorcelainPage append(PorcelainPage porcelainpage);

    public abstract PorcelainPageHeader getHeader();

    public abstract List getSpaces();

    public abstract String getTitle();
}
