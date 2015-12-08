// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.CardView;

public final class dgi
    implements dgj
{

    private CardView a;

    private dgi(CardView cardview)
    {
        a = cardview;
        super();
    }

    public dgi(CardView cardview, byte byte0)
    {
        this(cardview);
    }

    public final void a(int i, int j)
    {
        int k = CardView.a(i, a.getPaddingLeft() + a.getPaddingRight());
        int l = CardView.a(j, a.getPaddingTop() + a.getPaddingBottom());
        if (android.view.View.MeasureSpec.getMode(k) == 0 || android.view.View.MeasureSpec.getMode(l) == 0)
        {
            throw new IllegalArgumentException("Horizontal CardView does not support UNSPECIFIED dimensions");
        }
        k = android.view.View.MeasureSpec.getSize(k);
        l = android.view.View.MeasureSpec.getSize(l);
        int i1 = CardView.b(l);
        int j1 = CardView.b(l);
        CardView.a(a).measure(i1, j1);
        if (CardView.b(a) != null)
        {
            CardView.b(a).measure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000));
        }
        CardView.e();
        l = CardView.c(a);
        i = android.view.View.MeasureSpec.getSize(i);
        k = android.view.View.MeasureSpec.makeMeasureSpec(k - l * 2, 0x40000000);
        CardView.e(a).measure(k, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        CardView.f(a).measure(k, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        CardView.g(a).measure(k, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        CardView.b(a, i, android.view.View.MeasureSpec.getSize(j));
    }

    public final void a(int i, int j, int k, int l)
    {
        int k1 = a.getPaddingLeft();
        int j1 = a.getPaddingTop();
        int i1 = a.getPaddingRight();
        j = l - j - a.getPaddingBottom();
        CardView.a(a).layout(k1, j1, CardView.a(a).getMeasuredWidth() + k1, CardView.a(a).getMeasuredHeight() + j1);
        l = k1 + CardView.a(a).getMeasuredWidth();
        if (CardView.b(a) != null)
        {
            CardView.b(a).layout(l - CardView.b(a).getMeasuredWidth() - CardView.h(a), j - CardView.b(a).getMeasuredHeight() - CardView.h(a), l - CardView.h(a), j - CardView.h(a));
        }
        l += CardView.c(a);
        j1 += CardView.c(a);
        i = k - i - i1 - CardView.c(a);
        j -= CardView.c(a);
        CardView.e(a).layout(l, j1, i, CardView.e(a).getMeasuredHeight() + j1);
        k = j1 + CardView.e(a).getMeasuredHeight();
        CardView.f(a).layout(l, k, i, CardView.f(a).getMeasuredHeight() + k);
        CardView.g(a).layout(l, j - CardView.g(a).getMeasuredHeight(), i, j);
    }
}
