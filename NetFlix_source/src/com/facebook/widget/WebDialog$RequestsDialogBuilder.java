// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.os.Bundle;
import com.facebook.Session;

// Referenced classes of package com.facebook.widget:
//            WebDialog

public static class _cls9 extends _cls9
{

    private static final String APPREQUESTS_DIALOG = "apprequests";
    private static final String DATA_PARAM = "data";
    private static final String MESSAGE_PARAM = "message";
    private static final String TITLE_PARAM = "title";
    private static final String TO_PARAM = "to";

    public volatile WebDialog build()
    {
        return super._mth9();
    }

    public _cls9 setData(String s)
    {
        getParameters().putString("data", s);
        return this;
    }

    public getParameters setMessage(String s)
    {
        getParameters().putString("message", s);
        return this;
    }

    public getParameters setTitle(String s)
    {
        getParameters().putString("title", s);
        return this;
    }

    public getParameters setTo(String s)
    {
        getParameters().putString("to", s);
        return this;
    }

    public _cls9(Context context, Session session)
    {
        super(context, session, "apprequests", null);
    }

    public _cls9(Context context, Session session, Bundle bundle)
    {
        super(context, session, "apprequests", bundle);
    }
}
