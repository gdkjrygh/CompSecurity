// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PromotedSCDContactsInfo extends JSONObject
{

    private static final String CONTACTS_NAME = "contacts";
    private static final String DISPLAY_PROMOTED_CONTACTS_NAME = "showSuggestions";
    private static final String SEEN_NAME = "seen";
    private static final String TIMESTAMP_NAME = "timestamp";

    public PromotedSCDContactsInfo(long l, Set set)
    {
        this(l, set, true);
    }

    public PromotedSCDContactsInfo(long l, Set set, boolean flag)
    {
        try
        {
            put("timestamp", l);
            putContactsIdentities(set);
            put("showSuggestions", flag);
            put("seen", true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            throw new IllegalArgumentException("Wrong timestamp or array of identities");
        }
    }

    public PromotedSCDContactsInfo(String s)
        throws JSONException
    {
        super(s);
    }

    private Set getIdentitiesForProperty(String s)
    {
        JSONArray jsonarray = optJSONArray(s);
        if (jsonarray != null)
        {
            HashSet hashset = new HashSet(jsonarray.length());
            int i = 0;
            do
            {
                s = hashset;
                if (i >= jsonarray.length())
                {
                    break;
                }
                hashset.add(jsonarray.optString(i));
                i++;
            } while (true);
        } else
        {
            s = new HashSet();
        }
        return s;
    }

    private JSONArray getJsonArrayForIdentities(Set set)
    {
        JSONArray jsonarray = new JSONArray();
        for (set = set.iterator(); set.hasNext(); jsonarray.put((String)set.next())) { }
        return jsonarray;
    }

    public static PromotedSCDContactsInfo newInstanceFromString(String s)
    {
        try
        {
            s = new PromotedSCDContactsInfo(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Wrong format");
        }
        return s;
    }

    private void putIdentitiesForProperty(String s, Set set)
    {
        try
        {
            put(s, getJsonArrayForIdentities(set));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Wrong array of identities");
        }
    }

    private void updateSeenStatus(boolean flag)
    {
        try
        {
            put("seen", flag);
            return;
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException(jsonexception);
        }
    }

    public boolean areContactsSeen()
    {
        return optBoolean("seen");
    }

    public Set getContactIdentities()
    {
        return getIdentitiesForProperty("contacts");
    }

    public long getTimestamp()
    {
        return optLong("timestamp");
    }

    public void markContactsAsSeen()
    {
        updateSeenStatus(true);
    }

    public void markContactsAsUnseen()
    {
        updateSeenStatus(false);
    }

    public void putContactsIdentities(Set set)
    {
        putIdentitiesForProperty("contacts", set);
    }

    public boolean shouldDisplayPromotedSCDContacts()
    {
        return optBoolean("showSuggestions");
    }
}
