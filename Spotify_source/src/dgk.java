// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.CardView;

public final class dgk
    implements dgj
{

    private CardView a;

    private dgk(CardView cardview)
    {
        a = cardview;
        super();
    }

    public dgk(CardView cardview, byte byte0)
    {
        this(cardview);
    }

    public final void a(int i, int j)
    {
        int j1;
        int k1;
        int l1;
        int i2;
        CardView cardview = a;
        int k;
        if (!cardview.e)
        {
            l1 = 0;
        } else
        {
            int l = CardView.a(cardview.b);
            j1 = CardView.a(cardview.c);
            l1 = cardview.d * 2 + (l * 3 + j1);
        }
        k = android.view.View.MeasureSpec.getSize(j);
        j1 = android.view.View.MeasureSpec.getSize(i);
        i2 = Math.max(k - l1, 0);
        k = Math.min(j1, i2);
        k1 = CardView.b(j1);
        i2 = CardView.b(i2);
        j1 = CardView.b(k);
        android.view.View.MeasureSpec.getMode(i);
        JVM INSTR lookupswitch 3: default 108
    //                   -2147483648: 434
    //                   0: 510
    //                   1073741824: 153;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException();
_L4:
        int i1;
        i = i2;
        i1 = k1;
        android.view.View.MeasureSpec.getMode(j);
        JVM INSTR lookupswitch 3: default 200
    //                   -2147483648: 208
    //                   0: 424
    //                   1073741824: 215;
           goto _L5 _L6 _L7 _L8
_L8:
        break; /* Loop/switch isn't completed */
_L5:
        throw new IllegalArgumentException();
_L6:
        i = j1;
        i1 = k1;
_L9:
        j = a.getPaddingLeft() + a.getPaddingRight();
        j1 = a.getPaddingTop() + a.getPaddingBottom();
        CardView.a(a).measure(CardView.a(i1, j), CardView.a(i, j1));
        i = CardView.a(a).getMeasuredWidth();
        i1 = CardView.a(a).getMeasuredHeight();
        if (CardView.b(a) != null)
        {
            CardView.b(a).measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000));
        }
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(i - CardView.c(a) * 2, 0x40000000);
        if (CardView.d(a))
        {
            CardView.e(a).measure(k1, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            CardView.f(a).measure(k1, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            CardView.g(a).measure(k1, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        CardView.a(a, i + j, l1 + i1 + j1);
        return;
_L7:
        i = k1;
        i1 = k1;
          goto _L9
_L2:
        switch (android.view.View.MeasureSpec.getMode(j))
        {
        default:
            throw new IllegalArgumentException();

        case 1073741824: 
            i1 = j1;
            i = i2;
            break;

        case -2147483648: 
            i = j1;
            i1 = j1;
            break;

        case 0: // '\0'
            i = k1;
            i1 = k1;
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
_L3:
        i = i2;
        i1 = k1;
        switch (android.view.View.MeasureSpec.getMode(j))
        {
        default:
            throw new IllegalArgumentException();

        case -2147483648: 
        case 1073741824: 
            i1 = i2;
            i = i2;
            break;

        case 0: // '\0'
            break;
        }
        if (true) goto _L9; else goto _L11
_L11:
    }

    public final void a(int i, int j, int k, int l)
    {
        int i1 = a.getPaddingLeft();
        int k1 = a.getPaddingTop();
        int j1 = k - i - a.getPaddingRight();
        i = a.getPaddingBottom();
        CardView.a(a).layout(i1, k1, j1, CardView.a(a).getMeasuredHeight() + k1);
        k1 += CardView.a(a).getMeasuredHeight();
        if (CardView.b(a) != null)
        {
            CardView.b(a).layout(j1 - CardView.b(a).getMeasuredWidth() - CardView.h(a), k1 - CardView.b(a).getMeasuredHeight() - CardView.h(a), j1 - CardView.h(a), k1 - CardView.h(a));
        }
        if (CardView.d(a))
        {
            k = i1 + CardView.c(a);
            i1 = k1 + CardView.c(a);
            j1 -= CardView.c(a);
            i = l - j - i - CardView.c(a);
            CardView.e(a).layout(k, i1, j1, CardView.e(a).getMeasuredHeight() + i1);
            j = i1 + CardView.e(a).getMeasuredHeight();
            CardView.f(a).layout(k, j, j1, CardView.f(a).getMeasuredHeight() + j);
            CardView.g(a).layout(k, i - CardView.g(a).getMeasuredHeight(), j1, i);
        }
    }
}
