// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.os.Bundle;
import android.view.View;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.result.card.a;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.share.c;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            BaseResultFragment

public class VirusResultFragment extends BaseResultFragment
{

    private static VirusResultFragment v = null;
    private boolean u;

    public VirusResultFragment()
    {
    }

    public static VirusResultFragment q()
    {
        com/qihoo/security/ui/result/view/VirusResultFragment;
        JVM INSTR monitorenter ;
        VirusResultFragment virusresultfragment;
        if (v == null)
        {
            v = new VirusResultFragment();
            Bundle bundle = new Bundle();
            v.setArguments(bundle);
        }
        virusresultfragment = v;
        com/qihoo/security/ui/result/view/VirusResultFragment;
        JVM INSTR monitorexit ;
        return virusresultfragment;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(a a1)
    {
        super.a(a1);
        if (a1 == null)
        {
            return;
        }
        switch (l())
        {
        default:
            return;

        case 5: // '\005'
            switch (a1.a)
            {
            default:
                return;

            case 8: // '\b'
                b.b(14304);
                break;
            }
            return;

        case 6: // '\006'
            int i = a1.a;
            return;
        }
    }

    public void a(Boolean boolean1)
    {
        u = boolean1.booleanValue();
    }

    protected void d()
    {
        int i = SharedPref.b(d, "repair_issue_number", 0);
        if (c.a(d, 0, 0L, i))
        {
            String s = String.format(f.a(0x7f0c00cb), new Object[] {
                Integer.valueOf(i)
            });
            android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
            if (fragmentactivity != null)
            {
                c.a(fragmentactivity, s, 2);
            }
        }
        SharedPref.a(d, "repair_issue_number", 0);
    }

    protected int l()
    {
        return !u ? 5 : 6;
    }

    protected void m()
    {
        n.setLocalText(0x7f0c0103);
        o.setLocalText(0x7f0c0128);
    }

    protected void n()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public void onClick(View view)
    {
        super.onClick(view);
        switch (view.getId())
        {
        default:
            return;

        case 2131427487: 
            if (u)
            {
                b.b(14328);
                return;
            } else
            {
                b.b(14327);
                return;
            }

        case 2131427574: 
            break;
        }
        if (u)
        {
            b.a(14326, 2L);
            return;
        } else
        {
            b.a(14325, 2L);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        com.qihoo.security.ui.b.b.a();
        super.onCreate(bundle);
    }

    public void onResume()
    {
        super.onResume();
        com.qihoo.security.ui.b.b.a(21);
        o();
        RecommendHelper.a().d(com.qihoo.security.recommend.RecommendHelper.RecommendType.Anitvirus);
    }

    protected int p()
    {
        return 22;
    }

}
