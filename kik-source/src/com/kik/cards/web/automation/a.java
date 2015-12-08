// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.automation;

import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.kik.cards.web.ap;
import com.kik.cards.web.bd;
import com.kik.cards.web.plugin.JavascriptGlue;
import com.kik.m.d;
import kik.android.chat.KikApplication;

// Referenced classes of package com.kik.cards.web.automation:
//            c, b

public final class a
    implements ap
{

    private final String a = "automation";
    private Activity b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private bd g;
    private String h;
    private ScrollView i;

    public a(Activity activity, Context context, bd bd1, String s)
    {
        b = activity;
        h = s;
        g = bd1;
        g.s().a(this);
        i = new ScrollView(context);
        i.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        i.setContentDescription("AUTOMATION_SCROLL_VIEW");
        activity = new LinearLayout(context);
        bd1 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        bd1.setMargins(KikApplication.a(100), 0, 0, 0);
        activity.setLayoutParams(bd1);
        activity.setOrientation(1);
        activity.setGravity(1);
        i.addView(activity);
        g.addView(i);
        c = new TextView(context);
        a(activity, c, "AUTOMATION_ASYNC_OUTPUT", 0xff0000ff);
        d = new TextView(context);
        a(activity, d, "AUTOMATION_SYNC_OUTPUT", 0xff00ff00);
        f = new EditText(context);
        a(activity, f, "AUTOMATION_INJECTION_TEXT_FIELD", 0xffff0000);
        f.setText("JSON.stringify(cards._.bridge('Browser').isDebugModeEnabled())");
        e = new TextView(context);
        a(activity, e, "AUTOMATION_CONSOLE_LOG", 0xff888888);
        context = new Button(context);
        com.kik.m.d.a(context, "CLEAR_INPUT");
        context.setText("Clear input");
        context.setOnClickListener(new c(this));
        activity.addView(context);
        g.addJavascriptInterface(this, "automation");
        f.setRawInputType(1);
        f.setImeOptions(2);
        f.setOnEditorActionListener(new b(this));
    }

    static String a(a a1)
    {
        if (a1.f.getText() != null)
        {
            return a1.f.getText().toString();
        } else
        {
            return null;
        }
    }

    private void a(LinearLayout linearlayout, TextView textview, String s, int j)
    {
        textview.setContentDescription((new StringBuilder()).append(h).append(s).toString());
        textview.setBackgroundColor(j);
        textview.setPadding(2, 20, 2, 20);
        linearlayout.addView(textview);
    }

    static bd b(a a1)
    {
        return a1.g;
    }

    static TextView c(a a1)
    {
        return a1.e;
    }

    static TextView d(a a1)
    {
        return a1.d;
    }

    static TextView e(a a1)
    {
        return a1.f;
    }

    static TextView f(a a1)
    {
        return a1.c;
    }

    public final String a()
    {
        return h;
    }

    public final void a(String s)
    {
        e.append((new StringBuilder()).append(s).append("\n").toString());
    }

    public final void b()
    {
        if (g != null)
        {
            g.removeView(i);
        }
    }

    public final void b(String s)
    {
        c.setText(s);
    }
}
