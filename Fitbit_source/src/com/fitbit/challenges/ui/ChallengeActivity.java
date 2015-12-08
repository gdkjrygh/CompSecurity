// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBar;
import android.util.Pair;
import com.fitbit.analytics.core.a;
import com.fitbit.data.bl.exceptions.JsonException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.i;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.PushNotificationsController;
import com.fitbit.util.bf;
import org.json.JSONException;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeFragment, AchievementFragment

public class ChallengeActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String f = "challengeId";
    private static final String g = "openOnStart";
    private static final String h = "fragment";
    private static final String i = "achievement";
    String a;
    boolean b;
    Handler c;
    ChallengeFragment d;
    boolean e;
    private Challenge j;
    private ServerCommunicationException k;

    public ChallengeActivity()
    {
    }

    public static final Intent a(Context context, String s, boolean flag)
    {
        context = new Intent(context, com/fitbit/challenges/ui/ChallengeActivity);
        context.putExtra("challengeId", s);
        context.putExtra("openOnStart", flag);
        return context;
    }

    public void a(Loader loader, Pair pair)
    {
        j = (Challenge)pair.first;
        k = (ServerCommunicationException)pair.second;
        c.post(new Runnable() {

            final ChallengeActivity a;

            public void run()
            {
                a.c();
            }

            
            {
                a = ChallengeActivity.this;
                super();
            }
        });
    }

    public void c()
    {
        if (j != null || k != null)
        {
            FragmentManager fragmentmanager = getSupportFragmentManager();
            d = (ChallengeFragment)fragmentmanager.findFragmentByTag("fragment");
            if (d == null && !e)
            {
                d = com.fitbit.challenges.ui.ChallengeFragment.a(a, j, k, b);
                fragmentmanager.beginTransaction().add(0x7f110415, d, "fragment").setTransition(4099).commit();
                getSupportActionBar().show();
            }
            if (P())
            {
                PushNotificationsController pushnotificationscontroller = T();
                if (pushnotificationscontroller != null)
                {
                    pushnotificationscontroller.a(d);
                }
            }
            SharedPreferences sharedpreferences = getPreferences(0);
            if (j != null && j.a() != null && sharedpreferences.getBoolean(a, true) && fragmentmanager.findFragmentByTag("achievement") == null && !e)
            {
                sharedpreferences.edit().putBoolean(a, false).apply();
                fragmentmanager.beginTransaction().addToBackStack("achievement_stack").replace(0x7f110415, com.fitbit.challenges.ui.AchievementFragment.a(j.a(), j.w())).setTransition(4099).commit();
                getSupportFragmentManager().addOnBackStackChangedListener(new android.support.v4.app.FragmentManager.OnBackStackChangedListener() {

                    final ChallengeActivity a;

                    public void onBackStackChanged()
                    {
                        if (a.getSupportFragmentManager().getBackStackEntryCount() > 0)
                        {
                            a.getSupportActionBar().hide();
                            return;
                        } else
                        {
                            a.getSupportActionBar().show();
                            a.getSupportFragmentManager().removeOnBackStackChangedListener(this);
                            return;
                        }
                    }

            
            {
                a = ChallengeActivity.this;
                super();
            }
                });
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = new Handler();
        setContentView(0x7f04016c);
        a = getIntent().getStringExtra("challengeId");
        b = getIntent().getBooleanExtra("openOnStart", false);
        getSupportLoaderManager().initLoader(0x7f110327, null, this);
    }

    public Loader onCreateLoader(int l, Bundle bundle)
    {
        bundle = a;
        getSupportActionBar().hide();
        return new bf(this, bundle) {

            final String a;
            final ChallengeActivity b;

            protected Pair a()
            {
                Object obj = null;
                Challenge challenge;
                try
                {
                    challenge = com.fitbit.data.bl.i.a().a(a);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    challenge = null;
                }
                catch (JSONException jsonexception)
                {
                    jsonexception = new JsonException(jsonexception);
                    challenge = null;
                }
                return Pair.create(challenge, obj);
            }

            protected Object f_()
            {
                return a();
            }

            
            {
                b = ChallengeActivity.this;
                a = s;
                super(context);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onPause()
    {
        PushNotificationsController pushnotificationscontroller = T();
        if (pushnotificationscontroller != null)
        {
            pushnotificationscontroller.a(null);
        }
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        e = false;
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        PushNotificationsController pushnotificationscontroller = T();
        if (pushnotificationscontroller != null)
        {
            pushnotificationscontroller.a(d);
        }
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.x);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        e = true;
        super.onSaveInstanceState(bundle);
    }
}
