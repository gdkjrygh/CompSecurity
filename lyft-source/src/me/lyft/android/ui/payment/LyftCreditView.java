// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            CreditListItemView

public class LyftCreditView extends LinearLayout
{

    AppFlow appFlow;
    TextView creditHeader;
    LinearLayout creditRestrictions;
    final PaymentScreens.LyftCreditScreen params;
    Toolbar toolbar;

    public LyftCreditView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PaymentScreens.LyftCreditScreen)context.a();
    }

    private void addCreditRestrictions(List list)
    {
        creditRestrictions.removeAllViews();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                String s = (String)list.next();
                if (!Strings.isNullOrEmpty(s))
                {
                    creditRestrictions.addView((new CreditListItemView(getContext())).setCreditListItemText(s));
                }
            } while (true);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        creditHeader.setText(params.getCreditHeader());
        addCreditRestrictions(params.getCreditRestrictions());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.showTitle().setTitle(getContext().getString(0x7f0701ff));
    }
}
