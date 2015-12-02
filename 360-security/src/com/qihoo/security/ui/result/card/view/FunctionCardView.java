// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.card.view;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.ui.result.card.a;
import com.qihoo.security.ui.result.card.c;
import com.qihoo.security.widget.CircleImageView;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.ui.result.card.view:
//            CardView

public class FunctionCardView extends CardView
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a(com.qihoo.security.ui.result.card.a a1);
    }


    private final CircleImageView a;
    private final LocaleTextView b;
    private final LocaleTextView d;
    private final LocaleTextView e;
    private final ViewStub f;
    private com.qihoo.security.ui.result.card.a g;
    private a h;

    public FunctionCardView(Context context)
    {
        this(context, null);
    }

    public FunctionCardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FunctionCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        View.inflate(c, 0x7f030056, this);
        a = (CircleImageView)findViewById(0x7f0b0046);
        b = (LocaleTextView)findViewById(0x7f0b004a);
        d = (LocaleTextView)findViewById(0x7f0b00ae);
        f = (ViewStub)findViewById(0x7f0b0130);
        e = (LocaleTextView)findViewById(0x7f0b0131);
        findViewById(0x7f0b012e).setOnClickListener(this);
    }

    private RemoteImageView a(View view, int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return (RemoteImageView)view.findViewById(0x7f0b0150);

        case 1: // '\001'
            return (RemoteImageView)view.findViewById(0x7f0b0154);

        case 2: // '\002'
            return (RemoteImageView)view.findViewById(0x7f0b0158);
        }
    }

    private void a(View view, ArrayList arraylist)
    {
        int i = 0;
        do
        {
            if (i < arraylist.size())
            {
                com.qihoo.security.ui.result.card.c.a a1 = (com.qihoo.security.ui.result.card.c.a)arraylist.get(i);
                Object obj = a(view, i);
                if (obj != null)
                {
                    if (a1.b != 0)
                    {
                        ((RemoteImageView) (obj)).setImageResource(a1.b);
                    } else
                    if (a1.d != null)
                    {
                        ((RemoteImageView) (obj)).setImageDrawable(a1.d);
                        ((RemoteImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                    }
                    if (a1.c != 0)
                    {
                        ((RemoteImageView) (obj)).setColorFilter(-1);
                        ((RemoteImageView) (obj)).setBackgroundResource(a1.c);
                    }
                    if (a1.g != null)
                    {
                        if (a1.h == 1)
                        {
                            ((RemoteImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                            ((RemoteImageView) (obj)).a(a1.g, 0x7f02015d);
                        } else
                        if (a1.h == 0)
                        {
                            ((RemoteImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                            ((RemoteImageView) (obj)).b(a1.g, 0x7f02015d);
                        }
                    }
                }
                obj = b(view, i);
                if (obj != null)
                {
                    if (a1.a != 0)
                    {
                        ((TextView) (obj)).setText(a1.a);
                    } else
                    if (a1.e != null)
                    {
                        ((TextView) (obj)).setText(a1.e);
                    }
                }
                obj = c(view, i);
                if (obj != null)
                {
                    if (a1.f != null)
                    {
                        ((TextView) (obj)).setText(a1.f);
                    } else
                    {
                        ((TextView) (obj)).setVisibility(8);
                    }
                }
                i++;
                continue;
            }
            return;
        } while (true);
    }

    private TextView b(View view, int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return (TextView)view.findViewById(0x7f0b0151);

        case 1: // '\001'
            return (TextView)view.findViewById(0x7f0b0155);

        case 2: // '\002'
            return (TextView)view.findViewById(0x7f0b0159);
        }
    }

    private TextView c(View view, int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return (TextView)view.findViewById(0x7f0b0152);

        case 1: // '\001'
            return (TextView)view.findViewById(0x7f0b0156);

        case 2: // '\002'
            return (TextView)view.findViewById(0x7f0b015a);
        }
    }

    public void onClick(View view)
    {
        if (h != null)
        {
            h.a(g);
        }
    }

    public void setBorderColor(int i)
    {
        a.setColorFilter(-1);
        a.setBorderColorResource(i);
    }

    public void setCardViewData(com.qihoo.security.ui.result.card.a a1)
    {
        if (a1 != null)
        {
            g = a1;
            if (a1.c > 0)
            {
                setImageResource(a1.c);
            }
            if (a1.b > 0)
            {
                setBorderColor(a1.b);
            }
            if (a1.f != null)
            {
                setTitleText(a1.f);
            }
            if (a1.g != null)
            {
                setDescriptionText(a1.g);
            } else
            {
                d.setVisibility(8);
            }
            if (a1 instanceof c)
            {
                ArrayList arraylist = ((c)a1).i;
                if (arraylist != null)
                {
                    a(f.inflate(), arraylist);
                }
            }
            if (a1.h != null)
            {
                setOperationText(a1.h);
            }
            setOnClickListener(this);
        }
    }

    public void setDescriptionText(Object obj)
    {
        if (obj instanceof SpannableString)
        {
            d.setText((SpannableString)obj);
            return;
        }
        if (obj instanceof Spanned)
        {
            d.setText((Spanned)obj);
            return;
        } else
        {
            d.setText(Html.fromHtml((String)obj));
            return;
        }
    }

    public void setImageResource(int i)
    {
        a.setImageResource(i);
    }

    public void setOnCardClickListener(a a1)
    {
        h = a1;
    }

    public void setOperationText(Object obj)
    {
        if (obj instanceof SpannableString)
        {
            e.setText((SpannableString)obj);
            return;
        }
        if (obj instanceof Spanned)
        {
            e.setText((Spanned)obj);
            return;
        } else
        {
            e.setText(Html.fromHtml(((String)obj).toUpperCase()));
            return;
        }
    }

    public void setTitleText(Object obj)
    {
        if (obj instanceof SpannableString)
        {
            b.setText((SpannableString)obj);
            return;
        }
        if (obj instanceof Spanned)
        {
            b.setText((Spanned)obj);
            return;
        } else
        {
            b.setText(Html.fromHtml((String)obj));
            return;
        }
    }
}
