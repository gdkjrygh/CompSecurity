// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.registration;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.registration:
//            BaseRegistrationEvent

public class DeactivatedEvent extends BaseRegistrationEvent
{

    public static final String NAME = "deactivate";
    private static final String PROP_accountKey = "accountKey";
    private static final String PROP_current = "current";
    public static final String TYPE = "deactivated";
    private String accountKey;
    private boolean current;

    public DeactivatedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super("deactivated", jsonobject);
    }

    public String getAccountKey()
    {
        return accountKey;
    }

    public String getName()
    {
        return "deactivate";
    }

    public boolean isCurrent()
    {
        return current;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        accountKey = getString(jsonobject, "accountKey", null);
        current = getBoolean(jsonobject, "current", false);
    }
}
