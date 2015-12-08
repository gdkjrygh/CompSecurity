// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.util.Util;
import java.util.UUID;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Payload

public abstract class ConversationItem extends Payload
{

    protected static final String KEY_CLIENT_CREATED_AT = "client_created_at";
    protected static final String KEY_CLIENT_CREATED_AT_UTC_OFFSET = "client_created_at_utc_offset";
    protected static final String KEY_NONCE = "nonce";

    protected ConversationItem()
    {
        setNonce(UUID.randomUUID().toString());
        double d = Util.currentTimeSeconds();
        int i = Util.getUtcOffset();
        setClientCreatedAt(Double.valueOf(d));
        setClientCreatedAtUtcOffset(i);
    }

    protected ConversationItem(String s)
        throws JSONException
    {
        super(s);
    }

    public Double getClientCreatedAt()
    {
        double d;
        try
        {
            d = getDouble("client_created_at");
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return Double.valueOf(d);
    }

    public String getNonce()
    {
        String s;
        if (isNull("nonce"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("nonce");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public void setClientCreatedAt(Double double1)
    {
        try
        {
            put("client_created_at", double1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Double double1)
        {
            Log.e("Exception setting ConversationItem's %s field.", double1, new Object[] {
                "client_created_at"
            });
        }
    }

    public void setClientCreatedAtUtcOffset(int i)
    {
        try
        {
            put("client_created_at_utc_offset", i);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("Exception setting ConversationItem's %s field.", jsonexception, new Object[] {
                "client_created_at_utc_offset"
            });
        }
    }

    public void setNonce(String s)
    {
        try
        {
            put("nonce", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Exception setting ConversationItem's %s field.", s, new Object[] {
                "nonce"
            });
        }
    }
}
