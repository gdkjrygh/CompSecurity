// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.friends.ui:
//            MessagesActivity

public final class MessagesActivity_ extends MessagesActivity
    implements org.androidannotations.a.c.a, b
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

        public a a(int i)
        {
            b.setFlags(i);
            return this;
        }

        public a a(String s)
        {
            b.putExtra("userId", s);
            return this;
        }

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int i)
        {
            if (c != null)
            {
                c.startActivityForResult(b, i);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, i);
                return;
            } else
            {
                a.startActivity(b);
                return;
            }
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/friends/ui/MessagesActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/friends/ui/MessagesActivity_);
        }
    }


    public static final String b = "userId";
    private final c c = new c();

    public MessagesActivity_()
    {
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        f();
        org.androidannotations.a.c.c.a(this);
    }

    public static a c(Context context)
    {
        return new a(context);
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("userId"))
        {
            a = bundle.getString("userId");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        c();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(c);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
        setContentView(0x7f040036);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        c.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        c.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        c.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
