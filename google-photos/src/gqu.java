// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class gqu extends omn
    implements nug
{

    private static final int ad;
    private static final String ae;
    private static final ekk ai = (new ekm()).a(hpg).b(elt).b(gej).a();
    private TextView aj;
    private mtj ak;
    private grg al;

    public gqu()
    {
    }

    private static SpannableStringBuilder a(ekp ekp1)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        Object obj = (elt)ekp1.b(elt);
        if (obj != null)
        {
            obj = ((elt) (obj)).e();
            a(spannablestringbuilder, "Primary MediaModel:\n");
            a(spannablestringbuilder, ((gap) (obj)).g());
            if (((gap) (obj)).h() != null)
            {
                a(spannablestringbuilder, "Secondary MediaModel:\n");
                a(spannablestringbuilder, ((gap) (obj)).h());
            }
        }
        obj = (hpg)ekp1.a(hpg);
        int j = 1;
        Iterator iterator = ((hpg) (obj)).a.iterator();
        while (iterator.hasNext()) 
        {
            obj = (hpk)iterator.next();
            a(spannablestringbuilder, (new StringBuilder(28)).append("ResolvedMedia ").append(j).append(": \n").toString());
            if (((hpk) (obj)).e())
            {
                spannablestringbuilder.append("  local_uri: ").append(((hpk) (obj)).a).append('\n');
            }
            if (((hpk) (obj)).a())
            {
                spannablestringbuilder.append("  media_key: ").append(((hpk) (obj)).c).append('\n');
            }
            if (((hpk) (obj)).f())
            {
                SpannableStringBuilder spannablestringbuilder2 = spannablestringbuilder.append("  dedup_key: ");
                if (((hpk) (obj)).e != null)
                {
                    obj = ((hpk) (obj)).e;
                } else
                {
                    obj = "null";
                }
                spannablestringbuilder2.append(((CharSequence) (obj))).append('\n');
            }
            j++;
        }
        obj = (gej)ekp1.b(gej);
        if (obj != null)
        {
            a(spannablestringbuilder, "RemoteSourceFeature:\n");
            SpannableStringBuilder spannablestringbuilder1 = spannablestringbuilder.append("  isFromDrive: ");
            if (((gej) (obj)).n())
            {
                ekp1 = "true";
            } else
            {
                ekp1 = "false";
            }
            spannablestringbuilder1.append(ekp1).append('\n');
            spannablestringbuilder1 = spannablestringbuilder.append("  isShared: ");
            if (((gej) (obj)).o())
            {
                ekp1 = "true";
            } else
            {
                ekp1 = "false";
            }
            spannablestringbuilder1.append(ekp1).append('\n');
        }
        return spannablestringbuilder;
    }

    private static void a(SpannableStringBuilder spannablestringbuilder, gap gap1)
    {
        if (gap1.a() == null) goto _L2; else goto _L1
_L1:
        spannablestringbuilder.append("  url: ").append(gap1.a()).append('\n');
_L4:
        if (gap1.c() != null)
        {
            spannablestringbuilder.append("  signature: ").append(gap1.c().toString()).append('\n');
        }
        return;
_L2:
        if (gap1.b() != null)
        {
            spannablestringbuilder.append("  uri: ").append(gap1.b().toString()).append('\n');
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(SpannableStringBuilder spannablestringbuilder, String s)
    {
        int j = spannablestringbuilder.length();
        spannablestringbuilder.append(s);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(0xff000000), j, spannablestringbuilder.length(), 33);
        spannablestringbuilder.setSpan(new StyleSpan(1), j, spannablestringbuilder.length(), 33);
    }

    static void a(gqu gqu1, mue mue1)
    {
label0:
        {
            if (gqu1.aj != null)
            {
                if (mue1 != null)
                {
                    break label0;
                }
                gqu1.aj.setText("Could not load media, null result");
            }
            return;
        }
        if (mue1.c())
        {
            gqu1 = gqu1.aj;
            mue1 = String.valueOf(mue1.c);
            gqu1.setText((new StringBuilder(String.valueOf(mue1).length() + 29)).append("Could not load media, error: ").append(mue1).toString());
            return;
        } else
        {
            mue1 = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
            gqu1.aj.setText(a((ekp)mue1.get(0)));
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aj = (TextView)layoutinflater.inflate(b.tK, null);
        return aj;
    }

    public final void ak_()
    {
        super.ak_();
        aj = null;
    }

    public final void b_(Object obj)
    {
        ak.a(new eld(Collections.singletonList(al.h), ai, ad));
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        al = (grg)ag.a(grg);
        ak = ((mtj)ag.a(mtj)).a(ae, new gqv(this));
    }

    public final void l()
    {
        super.l();
        al.a.a(this, true);
    }

    public final void m()
    {
        super.m();
        al.a.a(this);
    }

    static 
    {
        int j = b.tJ;
        ad = j;
        ae = eld.a(j);
    }
}
