// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.snapchat.android.SnapchatApplication;

public final class HX extends HT
{

    public TextView l;
    public final CheckBox m;
    private final View n;

    public HX(View view)
    {
        super(null, view);
        m = (CheckBox)view.findViewById(0x7f0d0433);
        n = view.findViewById(0x7f0d02d3);
        l = (TextView)view.findViewById(0x7f0d0432);
    }

    public final void a(Context context)
    {
        super.t();
        a.setOnClickListener(null);
        c(0xff000000);
        d(context.getResources().getColor(0x7f0c0038));
        m.setOnCheckedChangeListener(null);
        m.setVisibility(8);
        m.setScaleX(1.0F);
        m.setScaleY(1.0F);
        u();
        v();
    }

    public final void d(int i)
    {
        n.setBackgroundColor(i);
    }

    public final void t()
    {
        a(SnapchatApplication.get());
    }

    // Unreferenced inner class HX$1

/* anonymous class */
    public final class _cls1
        implements android.widget.CompoundButton.OnCheckedChangeListener
    {

        private yj.a a;
        private yn b;

        public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            a.a(b, flag);
        }

            public 
            {
                a = a1;
                b = yn;
                super();
            }
    }

}
