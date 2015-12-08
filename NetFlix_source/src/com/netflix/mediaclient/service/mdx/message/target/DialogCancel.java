// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public class DialogCancel extends MdxMessage
{

    private static String PROPERTY_uid = "uid";
    private String mUid;

    public DialogCancel(JSONObject jsonobject)
        throws JSONException
    {
        super("DIALOG_CANCEL");
        mJson = jsonobject;
        mUid = jsonobject.getString(PROPERTY_uid);
    }

    public String getUid()
    {
        return mUid;
    }

}
