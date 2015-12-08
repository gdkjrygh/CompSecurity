// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DialogShow extends MdxMessage
{
    public static class DialogItem
    {

        public String data;
        public String name;

        public static DialogItem fromJson(JSONObject jsonobject)
            throws JSONException
        {
            return new DialogItem(jsonobject.getString(DialogShow.PROPERTY_name), jsonobject.getString(DialogShow.PROPERTY_data));
        }

        public JSONObject toJSon()
            throws JSONException
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put(DialogShow.PROPERTY_name, name);
            jsonobject.put(DialogShow.PROPERTY_data, data);
            return jsonobject;
        }

        public DialogItem(String s, String s1)
        {
            name = s;
            data = s1;
        }
    }


    private static String PROPERTY_data = "data";
    private static String PROPERTY_message = "message";
    private static String PROPERTY_name = "name";
    private static String PROPERTY_options = "options";
    private static String PROPERTY_title = "title";
    private static String PROPERTY_uid = "uid";
    private DialogItem mChoices[];
    private String mMessage;
    private String mTitle;
    private String mUid;

    public DialogShow(JSONObject jsonobject)
        throws JSONException
    {
        super("DIALOG_SHOW");
        mJson = jsonobject;
        mUid = jsonobject.getString(PROPERTY_uid);
        mTitle = jsonobject.getString(PROPERTY_title);
        mMessage = jsonobject.getString(PROPERTY_message);
        jsonobject = jsonobject.getJSONArray(PROPERTY_options);
        mChoices = new DialogItem[jsonobject.length()];
        for (int i = 0; i < jsonobject.length(); i++)
        {
            mChoices[i] = DialogItem.fromJson(jsonobject.getJSONObject(i));
        }

    }

    public DialogItem[] getChoices()
    {
        return mChoices;
    }

    public String getMessage()
    {
        return mMessage;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getUid()
    {
        return mUid;
    }



}
