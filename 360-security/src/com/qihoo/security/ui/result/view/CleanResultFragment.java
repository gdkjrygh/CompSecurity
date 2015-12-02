// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.opti.b.d;
import com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo.security.ui.result.card.a;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.share.c;
import java.io.Serializable;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            BaseResultFragment

public class CleanResultFragment extends BaseResultFragment
{
    public static class CleanData
        implements Serializable
    {

        public String cleanSize;
        public boolean isCancel;
        public boolean isDeepClean;

        public CleanData()
        {
        }
    }


    private CleanData u;

    public CleanResultFragment()
    {
    }

    public static CleanResultFragment a(CleanData cleandata)
    {
        CleanResultFragment cleanresultfragment = new CleanResultFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ms_fragment_data", cleandata);
        cleanresultfragment.setArguments(bundle);
        return cleanresultfragment;
    }

    public void a(a a1)
    {
        super.a(a1);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        l();
        JVM INSTR tableswitch 3 4: default 36
    //                   3 132
    //                   4 96;
           goto _L3 _L4 _L5
_L3:
        continue; /* Loop/switch isn't completed */
_L7:
        if (a1 != null && a1.a == 6)
        {
            a1 = g();
            boolean flag;
            if (u != null && u.isCancel)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1 = ClearListActivity.a(true, a1, flag);
            a1.putBoolean("deepClean", true);
            b(FragmentAction.RESULT_ACTION_SKIP_SUB_MODULE, a1);
            return;
        }
          goto _L1
_L5:
        switch (a1.a)
        {
        case 4: // '\004'
            b.b(18531);
            break;
        }
        if (true) goto _L7; else goto _L6
_L6:
_L4:
        switch (a1.a)
        {
        case 4: // '\004'
            b.b(18308);
            break;

        case 6: // '\006'
            b.b(18307);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected void d()
    {
        long l1 = SharedPref.b(d, "clean_trash_number", 0L);
        if (c.a(d, 0, l1, 0))
        {
            String s = com.qihoo.security.opti.b.d.a(d, l1, false);
            s = String.format(f.a(0x7f0c00ca), new Object[] {
                s
            });
            android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
            if (fragmentactivity != null)
            {
                c.a(fragmentactivity, s, 1);
            }
        }
        SharedPref.a(d, "clean_trash_number", 0L);
    }

    protected int l()
    {
        byte byte1 = 3;
        byte byte0 = byte1;
        if (u != null)
        {
            byte0 = byte1;
            if (u.isDeepClean)
            {
                byte0 = 4;
            }
        }
        return byte0;
    }

    protected void m()
    {
        if (u != null && !TextUtils.isEmpty(u.cleanSize))
        {
            n.setLocalText(u.cleanSize);
            o.setLocalText(0x7f0c0055);
            return;
        } else
        {
            n.setVisibility(4);
            o.setLocalText(0x7f0c004c);
            return;
        }
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
            if (u != null && u.isDeepClean)
            {
                b.b(18534);
                return;
            } else
            {
                b.c(18314);
                return;
            }

        case 2131427574: 
            break;
        }
        if (u != null && u.isDeepClean)
        {
            b.a(18533, 2L);
            return;
        } else
        {
            b.a(18313, 2L);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        u = (CleanData)g;
        bundle = new Bundle();
        bundle.putSerializable("color", com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT);
        e.a(FragmentAction.CLEAN_ACTION_UPDATE_COLOR, bundle);
    }

    public void onResume()
    {
        super.onResume();
        com.qihoo.security.ui.b.b.a(11);
        o();
        RecommendHelper.a().d(com.qihoo.security.recommend.RecommendHelper.RecommendType.Clean);
    }

    protected int p()
    {
        return 12;
    }
}
