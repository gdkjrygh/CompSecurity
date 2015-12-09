// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.feature.FeatureService;
import com.spotify.mobile.android.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;

public final class dwz extends cn
{

    public dwz(Context context)
    {
        super(context);
    }

    private JSONArray s()
    {
        Object obj = ((giq)dmz.a(giq)).a(i());
        try
        {
            obj = ((gin) (obj)).a(FeatureService.b(), new JSONArray());
        }
        catch (JSONException jsonexception)
        {
            Logger.b(jsonexception, "Could not load key", new Object[0]);
            return new JSONArray();
        }
        return ((JSONArray) (obj));
    }

    public final Object d()
    {
        return s();
    }

    protected final void f()
    {
        n();
    }
}
