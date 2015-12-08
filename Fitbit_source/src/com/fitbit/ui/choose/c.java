// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.text.TextUtils;
import com.fitbit.data.bl.exceptions.SearchEntityException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import com.fitbit.util.av;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

public abstract class c extends AsyncTaskLoader
{
    public static class a extends av
    {

        private List a;

        public List a()
        {
            return a;
        }

        public void a(List list)
        {
            a = list;
        }

        public a()
        {
            a = Collections.emptyList();
        }
    }


    private final String a;

    public c(Context context, String s)
    {
        super(context);
        a = s;
    }

    private a c()
    {
        a a1 = new a();
        try
        {
            a1.a(a(a));
        }
        catch (ServerCommunicationException servercommunicationexception)
        {
            com.fitbit.e.a.a(b(), servercommunicationexception.toString(), new Object[0]);
            a1.a(-3);
            return a1;
        }
        catch (JSONException jsonexception)
        {
            com.fitbit.e.a.a(b(), jsonexception.toString(), new Object[0]);
            a1.a(-3);
            return a1;
        }
        catch (SearchEntityException searchentityexception)
        {
            com.fitbit.e.a.a(b(), searchentityexception.toString(), new Object[0]);
            a1.a(Collections.emptyList());
            return a1;
        }
        return a1;
    }

    public a a()
    {
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a.trim()))
        {
            return new a();
        } else
        {
            return c();
        }
    }

    protected abstract List a(String s)
        throws ServerCommunicationException, JSONException, SearchEntityException;

    protected abstract String b();

    public Object loadInBackground()
    {
        return a();
    }

    protected void onStartLoading()
    {
        forceLoad();
    }
}
