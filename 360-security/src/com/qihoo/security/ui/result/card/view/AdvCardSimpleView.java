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

public class AdvCardSimpleView extends AvdCardView
{

    private final LocaleTextView d;
    private final LocaleTextView e;
    private final LocaleTextView f;
    private final LocaleTextView g;
    private final AssertRemoteImageView h;
    private final RatingBar i;

    public AdvCardSimpleView(Context context)
    {
        this(context, null);
    }

    public AdvCardSimpleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AdvCardSimpleView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        View.inflate(c, 0x7f03002e, this);
        context = findViewById(0x7f0b007e);
        b = findViewById(0x7f0b0084);
        h = (AssertRemoteImageView)findViewById(0x7f0b007f);
        d = (LocaleTextView)findViewById(0x7f0b0080);
        e = (LocaleTextView)findViewById(0x7f0b0081);
        i = (RatingBar)findViewById(0x7f0b0082);
        f = (LocaleTextView)findViewById(0x7f0b0083);
        g = (LocaleTextView)findViewById(0x7f0b009a);
        context.setOnClickListener(this);
        f.setOnClickListener(this);
    }

    public List getAssertRemoteImageViews()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(h);
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
            a(h, a.icon);
            setTitleText(d);
            setDescriptionText(e);
            a(i);
            a(g, f);
            return;
        }
    }
}
