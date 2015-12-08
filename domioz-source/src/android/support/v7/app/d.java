// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

public final class d
{

    public int A;
    public boolean B;
    public boolean C[];
    public boolean D;
    public boolean E;
    public int F;
    public android.content.DialogInterface.OnMultiChoiceClickListener G;
    public Cursor H;
    public String I;
    public String J;
    public android.widget.AdapterView.OnItemSelectedListener K;
    public boolean L;
    public final Context a;
    public final LayoutInflater b;
    public int c;
    public Drawable d;
    public int e;
    public CharSequence f;
    public View g;
    public CharSequence h;
    public CharSequence i;
    public android.content.DialogInterface.OnClickListener j;
    public CharSequence k;
    public android.content.DialogInterface.OnClickListener l;
    public CharSequence m;
    public android.content.DialogInterface.OnClickListener n;
    public boolean o;
    public android.content.DialogInterface.OnCancelListener p;
    public android.content.DialogInterface.OnDismissListener q;
    public android.content.DialogInterface.OnKeyListener r;
    public CharSequence s[];
    public ListAdapter t;
    public android.content.DialogInterface.OnClickListener u;
    public int v;
    public View w;
    public int x;
    public int y;
    public int z;

    public d(Context context)
    {
        c = 0;
        e = 0;
        B = false;
        F = -1;
        L = true;
        a = context;
        o = true;
        b = (LayoutInflater)context.getSystemService("layout_inflater");
    }
}
