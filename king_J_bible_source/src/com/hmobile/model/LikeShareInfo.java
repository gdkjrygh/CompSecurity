// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class LikeShareInfo
{
    public static interface LikeShareDelegate
    {

        public abstract void Failed();

        public abstract void SuccessFully();
    }


    public String book;
    public String chapter;
    public int id;
    public int likes;
    public String packagename;
    public int shares;
    public String verse;
    public String verseinfo;

    public LikeShareInfo()
    {
        id = 0;
        book = "";
        chapter = "";
        verse = "";
        verseinfo = "";
        packagename = "";
        likes = 0;
        shares = 0;
    }

    public static ArrayList parse(String s)
    {
        ArrayList arraylist = new ArrayList();
        LikeShareInfo likeshareinfo;
        JSONObject jsonobject;
        String as[];
        int i;
        try
        {
            s = (new JSONObject(s)).getJSONArray("TaskList");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return arraylist;
        }
        i = 0;
        if (i >= s.length())
        {
            return arraylist;
        }
        jsonobject = s.getJSONObject(i);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        likeshareinfo = new LikeShareInfo();
        jsonobject = jsonobject.getJSONObject("task");
        as = jsonobject.getString("BibleInfo").split("_");
        likeshareinfo.book = as[0];
        likeshareinfo.chapter = as[1];
        likeshareinfo.verse = as[2];
        likeshareinfo.id = jsonobject.getInt("BibleLikeId");
        likeshareinfo.likes = jsonobject.optInt("LikeCount");
        likeshareinfo.shares = jsonobject.optInt("ShareCount");
        likeshareinfo.verseinfo = jsonobject.optString("Verse");
        arraylist.add(likeshareinfo);
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_25;
        }
    }
}
