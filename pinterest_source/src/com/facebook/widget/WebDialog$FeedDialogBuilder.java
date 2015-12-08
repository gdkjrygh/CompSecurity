// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.os.Bundle;
import com.facebook.Session;

// Referenced classes of package com.facebook.widget:
//            WebDialog

public class  extends 
{

    private static final String CAPTION_PARAM = "caption";
    private static final String DESCRIPTION_PARAM = "description";
    private static final String FEED_DIALOG = "feed";
    private static final String FROM_PARAM = "from";
    private static final String LINK_PARAM = "link";
    private static final String NAME_PARAM = "name";
    private static final String PICTURE_PARAM = "picture";
    private static final String SOURCE_PARAM = "source";
    private static final String TO_PARAM = "to";

    public volatile WebDialog build()
    {
        return super.();
    }

    public  setCaption(String s)
    {
        getParameters().putString("caption", s);
        return this;
    }

    public getParameters setDescription(String s)
    {
        getParameters().putString("description", s);
        return this;
    }

    public getParameters setFrom(String s)
    {
        getParameters().putString("from", s);
        return this;
    }

    public getParameters setLink(String s)
    {
        getParameters().putString("link", s);
        return this;
    }

    public getParameters setName(String s)
    {
        getParameters().putString("name", s);
        return this;
    }

    public getParameters setPicture(String s)
    {
        getParameters().putString("picture", s);
        return this;
    }

    public getParameters setSource(String s)
    {
        getParameters().putString("source", s);
        return this;
    }

    public getParameters setTo(String s)
    {
        getParameters().putString("to", s);
        return this;
    }

    public (Context context)
    {
        super(context, "feed");
    }

    public (Context context, Session session)
    {
        super(context, session, "feed", null);
    }

    public (Context context, Session session, Bundle bundle)
    {
        super(context, session, "feed", bundle);
    }

    public (Context context, String s, Bundle bundle)
    {
        super(context, s, "feed", bundle);
    }
}
