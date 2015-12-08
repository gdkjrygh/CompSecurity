// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import com.fitbit.data.domain.challenges.ChallengeType;
import java.util.ArrayList;
import java.util.Date;
import org.androidannotations.a.b;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.challenges.ui:
//            AddPlayersActivity

public final class AddPlayersActivity_ extends AddPlayersActivity
    implements org.androidannotations.a.c.a
{
    public static class a
    {

        private Context a;
        private final Intent b;
        private Fragment c;

        public Intent a()
        {
            return b;
        }

        public a a(int i1)
        {
            b.setFlags(i1);
            return this;
        }

        public a a(ChallengeType challengetype)
        {
            b.putExtra("challengeType", challengetype);
            return this;
        }

        public a a(String s)
        {
            b.putExtra("challengeId", s);
            return this;
        }

        public a a(ArrayList arraylist)
        {
            b.putExtra("participants", arraylist);
            return this;
        }

        public a a(Date date)
        {
            b.putExtra("startTime", date);
            return this;
        }

        public a b(ArrayList arraylist)
        {
            b.putExtra("invites", arraylist);
            return this;
        }

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int i1)
        {
            if (c != null)
            {
                c.startActivityForResult(b, i1);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, i1);
                return;
            } else
            {
                a.startActivity(b);
                return;
            }
        }

        public a c(int i1)
        {
            b.putExtra("maxPlayers", i1);
            return this;
        }

        public a d(int i1)
        {
            b.putExtra("minPlayers", i1);
            return this;
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/challenges/ui/AddPlayersActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/challenges/ui/AddPlayersActivity_);
        }
    }


    public static final String h = "maxPlayers";
    public static final String i = "challengeType";
    public static final String j = "startTime";
    public static final String k = "minPlayers";
    public static final String l = "challengeId";
    public static final String m = "participants";
    public static final String n = "invites";
    private final c o = new c();

    public AddPlayersActivity_()
    {
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        f();
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("maxPlayers"))
            {
                f = bundle.getInt("maxPlayers");
            }
            if (bundle.containsKey("challengeType"))
            {
                b = (ChallengeType)bundle.getSerializable("challengeType");
            }
            if (bundle.containsKey("startTime"))
            {
                g = (Date)bundle.getSerializable("startTime");
            }
            if (bundle.containsKey("minPlayers"))
            {
                e = bundle.getInt("minPlayers");
            }
            if (bundle.containsKey("challengeId"))
            {
                a = bundle.getString("challengeId");
            }
            if (bundle.containsKey("participants"))
            {
                d = bundle.getStringArrayList("participants");
            }
            if (bundle.containsKey("invites"))
            {
                c = bundle.getStringArrayList("invites");
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(o);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f04016c);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (b.a() < 5 && i1 == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i1, keyevent);
    }

    public void setContentView(int i1)
    {
        super.setContentView(i1);
        o.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        o.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        o.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
