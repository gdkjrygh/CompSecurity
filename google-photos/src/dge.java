// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.photos.actionabletoast.ToastRootView;
import java.util.ArrayList;
import java.util.List;

public final class dge
{

    ToastRootView a;
    View b;
    int c;
    dgv d;
    int e;
    List f;
    private final dgk g;
    private final Context h;
    private TextView i;
    private Button j;

    dge(dgg dgg1)
    {
        g = dgg1.a;
        h = dgg1.b;
        f = new ArrayList();
        int k = dgg1.c.size();
        a = (ToastRootView)p.a((ToastRootView)((LayoutInflater)h.getSystemService("layout_inflater")).inflate(b.iI, null));
        b = a.findViewById(b.iE);
        if (j == null)
        {
            j = (Button)a.findViewById(b.iF);
        }
        i = (TextView)a.findViewById(b.iG);
        switch (k)
        {
        default:
            dgg1 = String.valueOf(String.valueOf(k));
            if (dgg1.length() != 0)
            {
                dgg1 = "Can only support up to 1: ".concat(dgg1);
            } else
            {
                dgg1 = new String("Can only support up to 1: ");
            }
            throw new IndexOutOfBoundsException(dgg1);

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_248;

        case 0: // '\0'
            j.setVisibility(8);
            break;
        }
        switch (k)
        {
        default:
            dgg1 = String.valueOf(String.valueOf(k));
            Button button;
            dgj dgj1;
            if (dgg1.length() != 0)
            {
                dgg1 = "Can only support up to 1: ".concat(dgg1);
            } else
            {
                dgg1 = new String("Can only support up to 1: ");
            }
            throw new IndexOutOfBoundsException(dgg1);

        case 1: // '\001'
            button = j;
            dgj1 = (dgj)dgg1.c.get(0);
            button.setText(dgj1.a);
            if (dgj1.b != 0)
            {
                button.setCompoundDrawablesWithIntrinsicBounds(0, 0, dgj1.b, 0);
            }
            button.setOnClickListener(new dgf(this, dgj1));
            break;

        case 0: // '\0'
            break;
        }
        break MISSING_BLOCK_LABEL_330;
        j.setVisibility(0);
        break MISSING_BLOCK_LABEL_193;
        if (dgg1.d == null)
        {
            i.setVisibility(8);
        } else
        {
            i.setText(dgg1.d);
        }
        c = dgg1.e;
        d = dgg1.f;
        e = dgg1.g;
        return;
    }

    public final int a()
    {
        return a.a.bottom + a.a.top;
    }

    public final void a(boolean flag)
    {
        j.setClickable(flag);
    }

    public final int b()
    {
        return a.getMeasuredHeight() - a();
    }

    public final void c()
    {
        g.a(this);
    }

    public final String toString()
    {
        ArrayList arraylist = new ArrayList();
        if (i != null)
        {
            arraylist.add(i.getText());
        }
        if (j != null)
        {
            arraylist.add(j.getText());
        }
        return TextUtils.join("\n", arraylist);
    }
}
