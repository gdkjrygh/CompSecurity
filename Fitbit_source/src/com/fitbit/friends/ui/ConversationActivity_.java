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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.friends.ui.views.TriangleView;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.friends.ui:
//            ConversationActivity

public final class ConversationActivity_ extends ConversationActivity
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
            b = new Intent(context, com/fitbit/friends/ui/ConversationActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/friends/ui/ConversationActivity_);
        }
    }


    private final c r = new c();

    public ConversationActivity_()
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
        c.a(this);
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        h = (TextView)a1.findViewById(0x7f1100c1);
        b = (ProgressBar)a1.findViewById(0x7f11006b);
        d = (LinearLayout)a1.findViewById(0x7f1100d2);
        i = (TextView)a1.findViewById(0x7f1102b5);
        a = (EditText)a1.findViewById(0x7f1100d1);
        e = (LinearLayout)a1.findViewById(0x7f1100ce);
        g = (TriangleView)a1.findViewById(0x7f110347);
        f = (LoadablePicassoImageView)a1.findViewById(0x7f1100be);
        j = a1.findViewById(0x7f1100d4);
        c = (TextView)a1.findViewById(0x7f1100d3);
        View view = a1.findViewById(0x7f1100cc);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final ConversationActivity_ a;

                public void onClick(View view1)
                {
                    a.d();
                }

            
            {
                a = ConversationActivity_.this;
                super();
            }
            });
        }
        a1 = a1.findViewById(0x7f1100ce);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final ConversationActivity_ a;

                public void onClick(View view1)
                {
                    a.e();
                }

            
            {
                a = ConversationActivity_.this;
                super();
            }
            });
        }
        c();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(r);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040016);
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
        r.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        r.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        r.a(this);
    }
}
