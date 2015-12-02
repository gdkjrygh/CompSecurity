// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.common.w.o;
import com.facebook.i;
import com.facebook.k;
import com.facebook.p;
import com.facebook.widget.HorizontalOrVerticalViewGroup;
import com.facebook.widget.h;
import com.facebook.widget.text.CustomUrlLikeSpan;

// Referenced classes of package com.facebook.orca.nux:
//            e

public class NuxFindingContactsIntroView extends e
{

    private TextView d;
    private HorizontalOrVerticalViewGroup e;
    private Button f;
    private Button g;
    private TextView h;

    public NuxFindingContactsIntroView(Context context)
    {
        super(context);
    }

    public NuxFindingContactsIntroView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NuxFindingContactsIntroView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    protected void a()
    {
        setContentView(k.orca_nux_finding_contacts_intro);
        d = (TextView)getView(i.orca_nux_finding_contacts_title);
        e = (HorizontalOrVerticalViewGroup)getView(i.orca_nux_finding_contacts_button_group);
        f = (Button)getView(i.orca_nux_finding_contacts_intro_find_contacts_button);
        g = (Button)getView(i.orca_nux_finding_contacts_intro_skip_button);
        h = (TextView)getView(i.orca_nux_finding_contacts_intro_body);
    }

    public void b()
    {
        d();
        h.setMovementMethod(LinkMovementMethod.getInstance());
    }

    protected void onMeasure(int j, int l)
    {
        super.onMeasure(j, l);
        if (e.getMode() == h.HORIZONTAL)
        {
            j = p.OrcaNuxTitle;
        } else
        {
            j = p.NuxFindingContactsIntroTitleSmall;
        }
        d.setTextAppearance(getContext(), j);
    }

    public void setBodyText(CharSequence charsequence)
    {
        d();
        h.setText(charsequence);
    }

    public void setLearnMoreLinkSpan(CustomUrlLikeSpan customurllikespan)
    {
        Resources resources = getResources();
        o o1 = new o(resources);
        o1.a(resources.getString(com.facebook.o.orca_nux_finding_contacts_intro_body));
        o1.a("[[learn_more_link]]", resources.getString(com.facebook.o.orca_nux_finding_contacts_intro_learn_more_link), customurllikespan, 33);
        b();
        setBodyText(o1.b());
    }

    public void setOnFindContactsClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d();
        f.setOnClickListener(onclicklistener);
    }

    public void setOnSkipClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d();
        g.setOnClickListener(onclicklistener);
    }
}
