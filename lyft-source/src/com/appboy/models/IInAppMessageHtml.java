// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;


// Referenced classes of package com.appboy.models:
//            IInAppMessage

public interface IInAppMessageHtml
    extends IInAppMessage
{

    public abstract String getAssetsZipRemoteUrl();

    public abstract String getLocalAssetsDirectoryUrl();

    public abstract boolean logButtonClick(String s);

    public abstract void setAssetsZipRemoteUrl(String s);

    public abstract void setLocalAssetsDirectoryUrl(String s);
}
