// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            VideoType

public interface Video
{

    public abstract String getBoxshotURL();

    public abstract VideoType getErrorType();

    public abstract String getHorzDispUrl();

    public abstract String getId();

    public abstract String getSquareUrl();

    public abstract String getTitle();

    public abstract String getTvCardUrl();

    public abstract VideoType getType();
}
