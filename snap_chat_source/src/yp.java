// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.model.chat.ChatConversation;

public final class yp extends Fk
{
    final class a
    {

        TextView a;
        TextView b;
        ImageView c;
        ProgressBar d;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private final Context a;
    private final LayoutInflater b;
    private final IB c;

    private yp(Context context, IB ib)
    {
        super(context, 0x7f040048, ib);
        a = context;
        b = (LayoutInflater)context.getSystemService("layout_inflater");
        c = ib;
    }

    static Context a(yp yp1)
    {
        return yp1.a;
    }

    public static yp a(Context context, IB ib)
    {
        context = new yp(context, ib);
        ib.mAdapter = context;
        return context;
    }

    static void a(yp yp1, a a1, ChatConversation chatconversation)
    {
        chatconversation.mBeingCleared = true;
        yp1.a(true, a1, chatconversation);
        AnalyticsEvents.d(chatconversation.mTheirUsername);
        AnalyticsEvents.n();
        (new ow(chatconversation)).execute();
    }

    private void a(boolean flag, a a1, ChatConversation chatconversation)
    {
        if (flag)
        {
            a1.b.setText(0x7f080262);
            a1.c.setVisibility(8);
            a1.d.setVisibility(0);
            return;
        }
        long l = chatconversation.E();
        if (l > 0L)
        {
            a1.b.setText(Ii.b(getContext(), l));
        } else
        {
            a1.b.setText("");
        }
        a1.c.setVisibility(0);
        a1.d.setVisibility(8);
    }

    static LayoutInflater b(yp yp1)
    {
        return yp1.b;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        ChatConversation chatconversation;
        if (view == null)
        {
            a a1 = new a((byte)0);
            view = b.inflate(0x7f040048, viewgroup, false);
            a1.a = (TextView)view.findViewById(0x7f0d01c6);
            a1.b = (TextView)view.findViewById(0x7f0d01c7);
            a1.c = (ImageView)view.findViewById(0x7f0d01c8);
            a1.d = (ProgressBar)view.findViewById(0x7f0d01c9);
            view.setTag(a1);
            viewgroup = a1;
        } else
        {
            viewgroup = (a)view.getTag();
        }
        chatconversation = (ChatConversation)c.get(i);
        ((a) (viewgroup)).a.setText(sz.a(chatconversation));
        a(chatconversation.mBeingCleared, viewgroup, chatconversation);
        ((a) (viewgroup)).c.setOnClickListener(new android.view.View.OnClickListener(viewgroup, chatconversation) {

            final a a;
            final ChatConversation b;
            final yp c;

            public final void onClick(View view1)
            {
                if (Bt.ai())
                {
                    view1 = new android.app.AlertDialog.Builder(yp.a(c));
                    View view2 = yp.b(c).inflate(0x7f040046, null);
                    if (view2 == null)
                    {
                        throw new NullPointerException();
                    } else
                    {
                        CheckBox checkbox = (CheckBox)view2.findViewById(0x7f0d01bf);
                        checkbox.setText(0x7f080324);
                        view1.setView(view2).setTitle(0x7f08025d).setPositiveButton(0x7f0801bc, new android.content.DialogInterface.OnClickListener(this, checkbox) {

                            private CheckBox a;
                            private _cls1 b;

                            public final void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (a.isChecked())
                                {
                                    Bt.aj();
                                }
                                yp.a(b.c, b.a, b.b);
                            }

            
            {
                b = _pcls1;
                a = checkbox;
                super();
            }
                        }).setNegativeButton(0x7f08007f, null);
                        view1.create().show();
                        return;
                    }
                } else
                {
                    yp.a(c, a, b);
                    return;
                }
            }

            
            {
                c = yp.this;
                a = a1;
                b = chatconversation;
                super();
            }
        });
        return view;
    }
}
