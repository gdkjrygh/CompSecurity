// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.contacts;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class ContactInfoDTO
{

    JSONArray addresses;
    String birthday;
    HashMap desiredFieldsWithVals;
    String displayName;
    JSONArray emails;
    JSONArray ims;
    JSONObject name;
    String nickname;
    String note;
    JSONArray organizations;
    JSONArray phones;
    JSONArray photos;
    JSONArray websites;

    public ContactInfoDTO()
    {
        displayName = "";
        name = new JSONObject();
        organizations = new JSONArray();
        addresses = new JSONArray();
        phones = new JSONArray();
        emails = new JSONArray();
        ims = new JSONArray();
        websites = new JSONArray();
        photos = new JSONArray();
        note = "";
        nickname = "";
        desiredFieldsWithVals = new HashMap();
    }
}
