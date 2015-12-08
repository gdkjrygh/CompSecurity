// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


public final class AdClick
{

    private final String _id;
    private final String _title;
    private final String _url;

    public AdClick(String s, String s1, String s2)
    {
        _id = s;
        _title = s1;
        _url = s2;
    }

    public static AdClick newInstance(AdClick adclick)
    {
        return new AdClick(adclick._id, adclick._title, adclick._url);
    }

    public String getId()
    {
        return _id;
    }

    public String getTitle()
    {
        return _title;
    }

    public String getUrl()
    {
        return _url;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append(" Object {");
        stringbuilder.append(" url=").append(_url);
        stringbuilder.append(" ,title=").append(_title);
        stringbuilder.append(" ,id=").append(_id);
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
