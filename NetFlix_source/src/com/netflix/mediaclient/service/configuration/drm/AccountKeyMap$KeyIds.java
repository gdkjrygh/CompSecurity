// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import com.netflix.mediaclient.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.configuration.drm:
//            AccountKeyMap

class mKchKeyId
{

    private String mKceKeyId;
    private String mKchKeyId;
    private String mKeySetId;
    final AccountKeyMap this$0;

    public String getKceKeyId()
    {
        return mKceKeyId;
    }

    public String getKchKeyId()
    {
        return mKchKeyId;
    }

    public String getKeySetId()
    {
        return mKeySetId;
    }

    JSONObject toJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.putOpt("keySetId", mKeySetId).putOpt("kceKeyId", mKceKeyId).putOpt("kchKeyId", mKchKeyId);
        }
        catch (JSONException jsonexception)
        {
            Log.w(AccountKeyMap.access$000(), (new StringBuilder()).append("can't turn KeyIds toJSON").append(jsonexception).toString());
            return jsonobject;
        }
        return jsonobject;
    }

    (String s)
    {
        this$0 = AccountKeyMap.this;
        super();
        if (Log.isLoggable(AccountKeyMap.access$000(), 3))
        {
            Log.d(AccountKeyMap.access$000(), (new StringBuilder()).append("KeyIds from JSON ").append(s).toString());
        }
        try
        {
            accountkeymap = new JSONObject(s);
            mKeySetId = optString("keySetId");
            mKceKeyId = optString("kceKeyId");
            mKchKeyId = optString("kchKeyId");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AccountKeyMap accountkeymap)
        {
            Log.w(AccountKeyMap.access$000(), (new StringBuilder()).append("can't turn JSON to KeyIds ").append(AccountKeyMap.this).toString());
        }
    }

    _cls000(String s, String s1, String s2)
    {
        this$0 = AccountKeyMap.this;
        super();
        mKeySetId = s;
        mKceKeyId = s1;
        mKchKeyId = s2;
    }
}
