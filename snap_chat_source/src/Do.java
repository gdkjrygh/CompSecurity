// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.snapchat.android.SnapchatApplication;
import java.util.List;

public final class Do extends Fk
{
    public static interface a
    {

        public abstract void a(AQ aq, boolean flag);

        public abstract boolean a(AQ aq);
    }


    protected tp a;
    private Context b;
    private LayoutInflater c;
    private a d;

    public Do(Context context, List list, a a1)
    {
        super(context, 0x7f0400af, list);
        SnapchatApplication.getDIComponent().a(this);
        c = (LayoutInflater)context.getSystemService("layout_inflater");
        b = context;
        d = a1;
    }

    static Context a(Do do1)
    {
        return do1.b;
    }

    static void a(Do do1, View view, AQ aq)
    {
        do1.a(view, aq);
    }

    private void a(View view, AQ aq)
    {
        if (!(aq instanceof AM))
        {
            view.setBackgroundColor(getContext().getResources().getColor(0x7f0c0062));
            return;
        }
        if (d.a(aq))
        {
            view.setBackgroundColor(getContext().getResources().getColor(0x7f0c0061));
            return;
        } else
        {
            view.setBackgroundDrawable(null);
            return;
        }
    }

    static a b(Do do1)
    {
        return do1.d;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = false;
        View view1 = view;
        if (view == null)
        {
            view1 = c.inflate(0x7f0400af, viewgroup, false);
        }
        view = (AQ)getItem(i);
        if (view != null)
        {
            viewgroup = (TextView)view1.findViewById(0x7f0d01bd);
            viewgroup.setText(((AQ) (view)).mDisplayName);
            i = ((flag) ? 1 : 0);
            if (d.a(view))
            {
                i = 1;
            }
            viewgroup.setTypeface(null, i);
            viewgroup = (CheckBox)view1.findViewById(0x7f0d01f1);
            viewgroup.setOnCheckedChangeListener(null);
            viewgroup.setChecked(d.a(view));
            viewgroup.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(view, viewgroup, view1) {

                final CheckBox a;
                private AQ b;
                private View c;
                private Do d;

                public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
                {
                    if (flag1 && !(b instanceof AM) && !(b instanceof En) && !d.a.a(b.mStoryId))
                    {
                        (new Ga(Do.a(d), b, d.a, new Ga.a(this) {

                            private _cls1 a;

                            public final void a(boolean flag)
                            {
                                a.a.setChecked(flag);
                            }

            
            {
                a = _pcls1;
                super();
            }
                        })).show();
                    }
                    Do.b(d).a(b, flag1);
                    Do.a(d, c, b);
                }

            
            {
                d = Do.this;
                b = aq;
                a = checkbox;
                c = view;
                super();
            }
            });
            view1.setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

                private CheckBox a;

                public final void onClick(View view2)
                {
                    view2 = a;
                    boolean flag1;
                    if (!a.isChecked())
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    view2.setChecked(flag1);
                }

            
            {
                a = checkbox;
                super();
            }
            });
            a(view1, view);
        }
        return view1;
    }
}
