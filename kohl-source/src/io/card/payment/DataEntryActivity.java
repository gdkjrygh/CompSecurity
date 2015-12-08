// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package io.card.payment:
//            CreditCard, ab, am, CardIOActivity, 
//            l, CardType, ac, f, 
//            an, m, U, ao, 
//            af, Y, Z, O

public final class DataEntryActivity extends Activity
    implements TextWatcher
{

    private int a;
    private int b;
    private TextView c;
    private EditText d;
    private am e;
    private EditText f;
    private am g;
    private EditText h;
    private am i;
    private EditText j;
    private am k;
    private ImageView l;
    private Button m;
    private Button n;
    private CreditCard o;
    private boolean p;
    private String q;
    private final String r = getClass().getName();
    private boolean s;

    public DataEntryActivity()
    {
        a = 1;
        b = 100;
    }

    private void a()
    {
        if (o == null)
        {
            o = new CreditCard();
        }
        if (f != null)
        {
            o.expiryMonth = ((ab)g).a;
            o.expiryYear = ((ab)g).b;
        }
        CreditCard creditcard = new CreditCard(e.b(), o.expiryMonth, o.expiryYear, i.b(), k.b());
        Intent intent = new Intent();
        intent.putExtra("io.card.payment.scanResult", creditcard);
        setResult(CardIOActivity.RESULT_CARD_INFO, intent);
        finish();
    }

    static void a(DataEntryActivity dataentryactivity)
    {
        dataentryactivity.a();
    }

    private EditText b()
    {
        int i1 = 100;
        do
        {
            EditText edittext = (EditText)findViewById(i1);
            if (edittext != null)
            {
                if (edittext.getText().length() == 0 && edittext.requestFocus())
                {
                    return edittext;
                }
            } else
            {
                return null;
            }
            i1++;
        } while (true);
    }

    private void c()
    {
        Button button = m;
        boolean flag;
        if (e.a() && g.a() && i.a() && k.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
        if (p && e.a() && g.a() && i.a() && k.a())
        {
            a();
        }
    }

    public final void afterTextChanged(Editable editable)
    {
        if (d == null || editable != d.getText()) goto _L2; else goto _L1
_L1:
        if (e.c())
        {
            if (!e.a())
            {
                d.setTextColor(l.d);
            } else
            {
                b();
            }
        } else
        {
            d.setTextColor(0xff444444);
        }
        if (h != null)
        {
            editable = CardType.fromCardNumber(e.b().toString());
            Object obj = (ac)i;
            int i1 = editable.cvvLength();
            obj.a = i1;
            obj = h;
            if (i1 == 4)
            {
                editable = "1234";
            } else
            {
                editable = "123";
            }
            ((EditText) (obj)).setHint(editable);
        }
_L4:
        c();
        return;
_L2:
        if (f != null && editable == f.getText())
        {
            if (g.c())
            {
                if (!g.a())
                {
                    f.setTextColor(l.d);
                } else
                {
                    b();
                }
            } else
            {
                f.setTextColor(0xff444444);
            }
        } else
        if (h != null && editable == h.getText())
        {
            if (i.c())
            {
                if (!i.a())
                {
                    h.setTextColor(l.d);
                } else
                {
                    b();
                }
            } else
            {
                h.setTextColor(0xff444444);
            }
        } else
        if (j != null && editable == j.getText())
        {
            if (k.c())
            {
                if (!k.a())
                {
                    j.setTextColor(l.d);
                } else
                {
                    b();
                }
            } else
            {
                j.setTextColor(0xff444444);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        Object obj = r;
        if (io.card.payment.f.d())
        {
            setTheme(0x103006e);
        } else
        {
            setTheme(0x103000c);
        }
        if (io.card.payment.f.d())
        {
            obj = "12dip";
        } else
        {
            obj = "2dip";
        }
        q = ((String) (obj));
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        if (bundle == null)
        {
            throw new IllegalStateException("Didn't find any extras!");
        }
        an.a(getIntent());
        s = bundle.getBoolean("io.card.payment.intentSenderIsPayPal");
        int k1 = io.card.payment.m.a("4dip", this);
        RelativeLayout relativelayout = new RelativeLayout(this);
        relativelayout.setBackgroundColor(l.c);
        obj = new ScrollView(this);
        int i1 = a;
        a = i1 + 1;
        ((ScrollView) (obj)).setId(i1);
        Object obj3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(10);
        relativelayout.addView(((android.view.View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj3)));
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setOrientation(1);
        ((ScrollView) (obj)).addView(linearlayout, -1, -1);
        LinearLayout linearlayout1 = new LinearLayout(this);
        linearlayout1.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        o = (CreditCard)bundle.getParcelable("io.card.payment.scanResult");
        p = bundle.getBoolean("debug_autoAcceptResult");
        LinearLayout linearlayout2;
        android.widget.LinearLayout.LayoutParams layoutparams2;
        boolean flag;
        boolean flag1;
        if (o != null)
        {
            e = new U(o.cardNumber);
            l = new ImageView(this);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            l.setPadding(0, 0, 0, k1);
            layoutparams.weight = 1.0F;
            l.setImageBitmap(CardIOActivity.a);
            linearlayout1.addView(l, layoutparams);
            io.card.payment.m.b(l, null, null, null, "8dip");
        } else
        {
            c = new TextView(this);
            c.setTextSize(24F);
            c.setTextColor(l.a);
            linearlayout1.addView(c);
            io.card.payment.m.a(c, null, null, null, "8dip");
            io.card.payment.m.a(c, -2, -2);
            obj2 = new LinearLayout(this);
            ((LinearLayout) (obj2)).setOrientation(1);
            io.card.payment.m.a(((android.view.View) (obj2)), null, "4dip", null, "4dip");
            Object obj4 = new TextView(this);
            io.card.payment.m.a(((android.view.View) (obj4)), q, null, null, null);
            ((TextView) (obj4)).setText(an.a(ao.r));
            ((TextView) (obj4)).setTextColor(l.e);
            ((LinearLayout) (obj2)).addView(((android.view.View) (obj4)), -2, -2);
            d = new EditText(this);
            obj4 = d;
            i1 = b;
            b = i1 + 1;
            ((EditText) (obj4)).setId(i1);
            d.setMaxLines(1);
            d.setImeOptions(6);
            d.setTextAppearance(getApplicationContext(), 0x1010040);
            d.setInputType(3);
            d.setHint("1234 5678 1234 5678");
            e = new U();
            d.addTextChangedListener(e);
            d.addTextChangedListener(this);
            d.setFilters(new InputFilter[] {
                new DigitsKeyListener(), e
            });
            ((LinearLayout) (obj2)).addView(d, -1, -2);
            linearlayout1.addView(((android.view.View) (obj2)), -1, -1);
        }
        linearlayout2 = new LinearLayout(this);
        layoutparams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        io.card.payment.m.a(linearlayout2, null, "4dip", null, null);
        linearlayout2.setOrientation(0);
        flag = bundle.getBoolean("io.card.payment.requireExpiry");
        flag1 = bundle.getBoolean("io.card.payment.requireCVV");
        if (bundle.getBoolean("io.card.payment.requireZip") || bundle.getBoolean("io.card.payment.requirePostalCode"))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag)
        {
            Object obj1 = new LinearLayout(this);
            bundle = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            ((LinearLayout) (obj1)).setOrientation(1);
            Object obj5 = new TextView(this);
            ((TextView) (obj5)).setTextColor(l.e);
            ((TextView) (obj5)).setText(an.a(ao.k));
            io.card.payment.m.a(((android.view.View) (obj5)), q, null, null, null);
            ((LinearLayout) (obj1)).addView(((android.view.View) (obj5)), -2, -2);
            f = new EditText(this);
            obj5 = f;
            int j1 = b;
            b = j1 + 1;
            ((EditText) (obj5)).setId(j1);
            f.setMaxLines(1);
            f.setImeOptions(6);
            f.setTextAppearance(getApplicationContext(), 0x1010040);
            f.setInputType(3);
            f.setHint(an.a(ao.n));
            if (o != null)
            {
                g = new ab(o.expiryMonth, o.expiryYear);
            } else
            {
                g = new ab();
            }
            if (g.c())
            {
                f.setText(g.b());
                if (!g.a())
                {
                    f.setTextColor(l.d);
                }
            }
            f.addTextChangedListener(g);
            f.addTextChangedListener(this);
            f.setFilters(new InputFilter[] {
                new DateKeyListener(), g
            });
            ((LinearLayout) (obj1)).addView(f, -1, -2);
            linearlayout2.addView(((android.view.View) (obj1)), bundle);
            if (flag1 || i1 != 0)
            {
                bundle = "4dip";
            } else
            {
                bundle = null;
            }
            io.card.payment.m.b(((android.view.View) (obj1)), null, null, bundle, null);
        } else
        {
            g = new O();
        }
        if (flag1)
        {
            obj5 = new LinearLayout(this);
            bundle = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            ((LinearLayout) (obj5)).setOrientation(1);
            obj1 = new TextView(this);
            ((TextView) (obj1)).setTextColor(l.e);
            io.card.payment.m.a(((android.view.View) (obj1)), q, null, null, null);
            ((TextView) (obj1)).setText(an.a(ao.i));
            ((LinearLayout) (obj5)).addView(((android.view.View) (obj1)), -2, -2);
            h = new EditText(this);
            obj1 = h;
            j1 = b;
            b = j1 + 1;
            ((EditText) (obj1)).setId(j1);
            h.setMaxLines(1);
            h.setImeOptions(6);
            h.setTextAppearance(getApplicationContext(), 0x1010040);
            h.setInputType(3);
            h.setHint("123");
            j1 = 4;
            if (o != null)
            {
                j1 = CardType.fromCardNumber(e.b()).cvvLength();
            }
            i = new ac(j1);
            h.setFilters(new InputFilter[] {
                new DigitsKeyListener(), i
            });
            h.addTextChangedListener(i);
            h.addTextChangedListener(this);
            ((LinearLayout) (obj5)).addView(h, -1, -2);
            linearlayout2.addView(((android.view.View) (obj5)), bundle);
            Object obj2;
            if (flag)
            {
                bundle = "4dip";
            } else
            {
                bundle = null;
            }
            if (i1 != 0)
            {
                obj2 = "4dip";
            } else
            {
                obj2 = null;
            }
            io.card.payment.m.b(((android.view.View) (obj5)), bundle, null, ((String) (obj2)), null);
        } else
        {
            i = new O();
        }
        if (i1 != 0)
        {
            obj2 = new LinearLayout(this);
            bundle = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            ((LinearLayout) (obj2)).setOrientation(1);
            obj5 = new TextView(this);
            ((TextView) (obj5)).setTextColor(l.e);
            io.card.payment.m.a(((android.view.View) (obj5)), q, null, null, null);
            ((TextView) (obj5)).setText(an.a(ao.j));
            ((LinearLayout) (obj2)).addView(((android.view.View) (obj5)), -2, -2);
            j = new EditText(this);
            obj5 = j;
            i1 = b;
            b = i1 + 1;
            ((EditText) (obj5)).setId(i1);
            j.setMaxLines(1);
            j.setImeOptions(6);
            j.setTextAppearance(getApplicationContext(), 0x1010040);
            j.setInputType(1);
            k = new af(20);
            j.addTextChangedListener(k);
            j.addTextChangedListener(this);
            ((LinearLayout) (obj2)).addView(j, -1, -2);
            linearlayout2.addView(((android.view.View) (obj2)), bundle);
            if (flag || flag1)
            {
                bundle = "4dip";
            } else
            {
                bundle = null;
            }
            io.card.payment.m.b(((android.view.View) (obj2)), bundle, null, null, null);
        } else
        {
            k = new O();
        }
        linearlayout1.addView(linearlayout2, layoutparams2);
        linearlayout.addView(linearlayout1, layoutparams1);
        io.card.payment.m.b(linearlayout1, "16dip", "20dip", "16dip", "20dip");
        bundle = new LinearLayout(this);
        i1 = a;
        a = i1 + 1;
        bundle.setId(i1);
        obj2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
        bundle.setPadding(0, k1, 0, 0);
        bundle.setBackgroundColor(0);
        ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(2, bundle.getId());
        m = new Button(this);
        obj3 = new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F);
        m.setText(an.a(ao.h));
        m.setOnClickListener(new Y(this));
        m.setEnabled(false);
        bundle.addView(m, ((android.view.ViewGroup.LayoutParams) (obj3)));
        io.card.payment.m.a(m, true, this);
        io.card.payment.m.a(m, "5dip", null, "5dip", null);
        io.card.payment.m.b(m, "8dip", "8dip", "4dip", "8dip");
        m.setTextSize(16F);
        n = new Button(this);
        obj3 = new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F);
        n.setText(an.a(ao.b));
        n.setOnClickListener(new Z(this));
        bundle.addView(n, ((android.view.ViewGroup.LayoutParams) (obj3)));
        io.card.payment.m.a(n, false, this);
        io.card.payment.m.a(n, "5dip", null, "5dip", null);
        io.card.payment.m.b(n, "4dip", "8dip", "8dip", "8dip");
        n.setTextSize(16F);
        relativelayout.addView(bundle, ((android.view.ViewGroup.LayoutParams) (obj2)));
        if (io.card.payment.f.c())
        {
            requestWindowFeature(8);
        }
        setContentView(relativelayout);
        bundle = null;
        if (s)
        {
            bundle = io.card.payment.m.a("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoTWFjaW50b3NoKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpCNDMzRTRFQ0M2MjQxMUUzOURBQ0E3QTY0NjU3OUI5QiIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpCNDMzRTRFREM2MjQxMUUzOURBQ0E3QTY0NjU3OUI5QiI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkI0MzNFNEVBQzYyNDExRTM5REFDQTdBNjQ2NTc5QjlCIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkI0MzNFNEVCQzYyNDExRTM5REFDQTdBNjQ2NTc5QjlCIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+Eyd0MQAABoFJREFUeNrMWl1M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", this, 240);
            bundle = new BitmapDrawable(getResources(), bundle);
        }
        io.card.payment.f.a(this, c, an.a(ao.s), "card.io - ", bundle);
    }

    protected final void onResume()
    {
        super.onResume();
        String s1 = r;
        getWindow().setFlags(0, 1024);
        c();
        if (d == null && f != null && !g.a())
        {
            f.requestFocus();
        } else
        {
            b();
        }
        if (d != null || f != null || h != null || j != null)
        {
            getWindow().setSoftInputMode(5);
        }
        s1 = r;
    }

    public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }
}
