// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.profile.ui;

import android.content.Context;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Profile;
import com.fitbit.util.bf;
import org.json.JSONException;

public final class a extends bf
{

    private final boolean a;

    public a(Context context, boolean flag)
    {
        super(context);
        a = flag;
    }

    public Profile a()
    {
        if (a)
        {
            try
            {
                dg.d().b(false, null);
                dg.d().r(false, null);
            }
            catch (ServerCommunicationException servercommunicationexception) { }
            catch (JSONException jsonexception) { }
        }
        return an.a().b();
    }

    public Object f_()
    {
        return a();
    }
}
