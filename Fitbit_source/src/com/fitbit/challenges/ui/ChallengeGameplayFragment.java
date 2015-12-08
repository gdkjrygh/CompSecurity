// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.widget.TextView;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeStateSupportFragment, ChallengeGameplayFragment_

public class ChallengeGameplayFragment extends ChallengeStateSupportFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String e = "ChallengeOptionsFragment";
    protected String a;
    protected String b;
    protected String c;
    protected TextView d;
    private ServerCommunicationException f;

    public ChallengeGameplayFragment()
    {
    }

    public static ChallengeGameplayFragment a(String s, String s1, String s2)
    {
        if (!TextUtils.isEmpty(s))
        {
            return ChallengeGameplayFragment_.b().c(s).a();
        }
        if (s1 != null)
        {
            return ChallengeGameplayFragment_.b().b(s1).a();
        } else
        {
            return ChallengeGameplayFragment_.b().a(s2).a();
        }
    }

    static ServerCommunicationException a(ChallengeGameplayFragment challengegameplayfragment, ServerCommunicationException servercommunicationexception)
    {
        challengegameplayfragment.f = servercommunicationexception;
        return servercommunicationexception;
    }

    protected void a()
    {
        getLoaderManager().restartLoader(221, new Bundle(), this);
    }

    public void a(Loader loader, String s)
    {
        boolean flag = false;
        b(false);
        if (f != null)
        {
            b(f);
            return;
        }
        if (s == null)
        {
            flag = true;
        }
        if (!flag)
        {
            d.setText(s);
        }
        d(flag);
        c(true);
    }

    protected com.fitbit.savedstate.LoadSavedState.Status c()
    {
        if (f == null)
        {
            if (d.getText().length() > 0)
            {
                return com.fitbit.savedstate.LoadSavedState.Status.b;
            } else
            {
                return com.fitbit.savedstate.LoadSavedState.Status.a;
            }
        } else
        {
            return com.fitbit.savedstate.LoadSavedState.Status.c;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        c(false);
        d(false);
        getLoaderManager().restartLoader(0, null, this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        b(true);
        return new _cls1(getActivity());
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (String)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        c(false);
    }

    /* member class not found */
    class _cls1 {}

}
