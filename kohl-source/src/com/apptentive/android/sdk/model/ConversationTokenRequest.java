// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Device, Person, Sdk

public class ConversationTokenRequest extends JSONObject
{

    public ConversationTokenRequest()
    {
    }

    public void setDevice(Device device)
    {
        try
        {
            put("device", device);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Device device)
        {
            Log.e("Error adding %s to ConversationTokenRequest", new Object[] {
                "device"
            });
        }
    }

    public void setPerson(Person person)
    {
        try
        {
            put("person", person);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Person person)
        {
            Log.e("Error adding %s to ConversationTokenRequest", new Object[] {
                "person"
            });
        }
    }

    public void setSdk(Sdk sdk)
    {
        try
        {
            put("sdk", sdk);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Sdk sdk)
        {
            Log.e("Error adding %s to ConversationTokenRequest", new Object[] {
                "sdk"
            });
        }
    }
}
