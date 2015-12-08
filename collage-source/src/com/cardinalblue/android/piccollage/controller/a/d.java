// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.fragments.m;
import java.io.IOException;
import org.json.JSONException;

public class d extends AsyncTaskLoader
{

    private final m a;

    public d(Context context, m m1)
    {
        super(context);
        a = m1;
    }

    public CBCollagesResponse a()
    {
        CBCollagesResponse cbcollagesresponse;
        try
        {
            cbcollagesresponse = f.b(a.c(), a.d());
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return null;
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return null;
        }
        catch (com.cardinalblue.android.piccollage.controller.network.f.a a1)
        {
            a1.printStackTrace();
            return null;
        }
        return cbcollagesresponse;
    }

    public Object loadInBackground()
    {
        return a();
    }

    protected void onStartLoading()
    {
        forceLoad();
    }

    protected void onStopLoading()
    {
        cancelLoad();
    }
}
