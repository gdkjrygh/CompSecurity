// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class mvz extends omp
{

    private mmr a;
    private TextView b;
    private String c;

    public mvz()
    {
    }

    static TextView a(mvz mvz1)
    {
        return mvz1.b;
    }

    static String a(mvz mvz1, boolean flag)
    {
        return mvz1.a(flag);
    }

    private String a(boolean flag)
    {
        if (flag)
        {
            Object obj = c;
            obj = Pattern.compile("(//([a-z0-9-]+)\\.[a-z0-9-]+\\.com).*?(,)").matcher(((CharSequence) (obj)));
            StringBuffer stringbuffer = new StringBuffer();
            String s;
            for (; ((Matcher) (obj)).find(); ((Matcher) (obj)).appendReplacement(stringbuffer, Matcher.quoteReplacement((new StringBuilder(String.valueOf(s).length() + 15)).append("//example.com/").append(s).append(",").toString())))
            {
                s = String.valueOf(Integer.toHexString(((Matcher) (obj)).group(0).hashCode()));
            }

            ((Matcher) (obj)).appendTail(stringbuffer);
            return stringbuffer.toString();
        } else
        {
            return c;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.Ev, viewgroup, false);
        viewgroup = super.q;
        if (viewgroup == null || viewgroup.getString("bundled_text_key") == null)
        {
            throw new IllegalStateException("This fragment must be called with a String argument.");
        } else
        {
            c = viewgroup.getString("bundled_text_key");
            b = (TextView)layoutinflater.findViewById(q.bw);
            b.setMovementMethod(new ScrollingMovementMethod());
            viewgroup = (CheckedTextView)layoutinflater.findViewById(q.bu);
            viewgroup.setOnClickListener(new mwa(this, viewgroup));
            b.setText(a(viewgroup.isChecked()));
            return layoutinflater;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        d(true);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        super.a(menu, menuinflater);
        menuinflater.inflate(b.Ez, menu);
    }

    public final boolean a_(MenuItem menuitem)
    {
        if (menuitem.getItemId() == q.bv)
        {
            Intent intent = new Intent("android.intent.action.SEND");
            menuitem = String.valueOf(a.g().b("account_name"));
            if (menuitem.length() != 0)
            {
                menuitem = "Application info dump:".concat(menuitem);
            } else
            {
                menuitem = new String("Application info dump:");
            }
            intent.putExtra("android.intent.extra.SUBJECT", menuitem);
            intent.putExtra("android.intent.extra.TEXT", b.getText());
            intent.setType("text/plain");
            a(intent);
            return true;
        } else
        {
            return false;
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (mmr)ae.a(mmr);
    }
}
