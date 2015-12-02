// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.widget.ImageView.AssertRemoteImageView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.result.card.view:
//            AvdCardView

public class AdvCardComplexView extends AvdCardView
{

    private final LocaleTextView d;
    private final LocaleTextView e;
    private final LocaleTextView f;
    private final LocaleTextView g;
    private final AssertRemoteImageView h;
    private final AssertRemoteImageView i;
    private final RatingBar j;

    public AdvCardComplexView(Context context)
    {
        this(context, null);
    }

    public AdvCardComplexView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AdvCardComplexView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        View.inflate(c, 0x7f030032, this);
        context = findViewById(0x7f0b00a9);
        b = findViewById(0x7f0b0084);
        i = (AssertRemoteImageView)findViewById(0x7f0b0046);
        e = (LocaleTextView)findViewById(0x7f0b00ae);
        d = (LocaleTextView)findViewById(0x7f0b00ac);
        h = (AssertRemoteImageView)findViewById(0x7f0b00ab);
        j = (RatingBar)findViewById(0x7f0b00ad);
        f = (LocaleTextView)findViewById(0x7f0b00b0);
        g = (LocaleTextView)findViewById(0x7f0b00af);
        context.setOnClickListener(this);
        f.setOnClickListener(this);
    }

    public List getAssertRemoteImageViews()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(h);
        arraylist.add(i);
        return arraylist;
    }

    public void setADcontent(AdvData advdata)
    {
        if (advdata == null)
        {
            return;
        } else
        {
            a = advdata;
            a();
            setTitleText(d);
            a(h, a.creatives);
            a(i, a.icon);
            setDescriptionText(e);
            a(j);
            a(g, f);
            return;
        }
    }
}
