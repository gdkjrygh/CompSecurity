// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            e, k, ai

public final class d
{

    TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int E;
    int F;
    int G;
    public int H;
    public int I;
    public int J;
    public int K;
    int L;
    Handler M;
    final android.view.View.OnClickListener N = new e(this);
    public final Context a;
    final ai b;
    final Window c;
    CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    Button n;
    CharSequence o;
    Message p;
    Button q;
    CharSequence r;
    Message s;
    Button t;
    CharSequence u;
    Message v;
    ScrollView w;
    public int x;
    public Drawable y;
    public ImageView z;

    public d(Context context, ai ai, Window window)
    {
        m = false;
        x = 0;
        E = -1;
        L = 0;
        a = context;
        b = ai;
        c = window;
        M = new k(ai);
        context = context.obtainStyledAttributes(null, l.AlertDialog, b.alertDialogStyle, 0);
        F = context.getResourceId(l.AlertDialog_android_layout, 0);
        G = context.getResourceId(l.AlertDialog_buttonPanelSideLayout, 0);
        H = context.getResourceId(l.AlertDialog_listLayout, 0);
        I = context.getResourceId(l.AlertDialog_multiChoiceItemLayout, 0);
        J = context.getResourceId(l.AlertDialog_singleChoiceItemLayout, 0);
        K = context.getResourceId(l.AlertDialog_listItemLayout, 0);
        context.recycle();
    }

    static void a(Button button)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
        layoutparams.gravity = 1;
        layoutparams.weight = 0.5F;
        button.setLayoutParams(layoutparams);
    }

    static boolean a(View view)
    {
        if (view.onCheckIsTextEditor())
        {
            return true;
        }
        if (!(view instanceof ViewGroup))
        {
            return false;
        }
        view = (ViewGroup)view;
        for (int i1 = view.getChildCount(); i1 > 0;)
        {
            int j1 = i1 - 1;
            i1 = j1;
            if (a(view.getChildAt(j1)))
            {
                return true;
            }
        }

        return false;
    }

    public final void a(int i1)
    {
label0:
        {
            y = null;
            x = i1;
            if (z != null)
            {
                if (i1 == 0)
                {
                    break label0;
                }
                z.setImageResource(x);
            }
            return;
        }
        z.setVisibility(8);
    }

    public final void a(int i1, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message)
    {
        if (onclicklistener != null)
        {
            message = M.obtainMessage(i1, onclicklistener);
        }
        switch (i1)
        {
        default:
            throw new IllegalArgumentException("Button does not exist");

        case -1: 
            o = charsequence;
            p = message;
            return;

        case -2: 
            r = charsequence;
            s = message;
            return;

        case -3: 
            u = charsequence;
            v = message;
            return;
        }
    }

    public final void a(CharSequence charsequence)
    {
        d = charsequence;
        if (A != null)
        {
            A.setText(charsequence);
        }
    }
}
