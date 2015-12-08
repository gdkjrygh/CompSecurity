// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;


// Referenced classes of package com.auditude.ads.model:
//            IAsset

public interface IClick
{

    public abstract String getAltText();

    public abstract IAsset getAsset();

    public abstract String getID();

    public abstract String getTarget();

    public abstract String getTitle();

    public abstract String getUrl();
}
