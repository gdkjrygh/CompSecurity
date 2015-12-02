// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.api.base.pojo.Amount;
import com.alibaba.api.common.pojo.ReceiveSellerCouponResult;

public class g extends g
{

    public ViewGroup c;
    public ProgressBar d;
    public Amount e;
    public String f;
    public TextView g;
    final ow h;

    public >(ow ow1, long l, ReceiveSellerCouponResult receivesellercouponresult, Amount amount, ViewGroup viewgroup, ProgressBar progressbar, 
            TextView textview, String s)
    {
        h = ow1;
        super(l);
        c = viewgroup;
        d = progressbar;
        e = amount;
        f = s;
        g = textview;
    }
}
