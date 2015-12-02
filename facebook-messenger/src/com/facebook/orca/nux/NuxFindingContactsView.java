// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.contacts.upload.ContactsUploadState;
import com.facebook.debug.log.b;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.nux:
//            e, d

public class NuxFindingContactsView extends e
{

    private static final Class d = com/facebook/orca/nux/NuxFindingContactsView;
    private ContactsUploadState e;
    private LinearLayout f;
    private ProgressBar g;
    private TextView h;
    private TextView i;

    public NuxFindingContactsView(Context context)
    {
        super(context);
    }

    public NuxFindingContactsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NuxFindingContactsView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
    }

    private void b()
    {
        h.setText(o.orca_nux_finding_contacts_title);
        i.setText(o.orca_nux_finding_contacts_body);
        g.setVisibility(0);
        g.setIndeterminate(true);
    }

    private int getNumMatched()
    {
        if (e == null)
        {
            return 0;
        } else
        {
            return e.c();
        }
    }

    private void j()
    {
        h.setText(o.orca_nux_finding_contacts_title);
        l();
    }

    private void k()
    {
        int i1 = getNumMatched();
        if (i1 == 0)
        {
            h.setText(o.orca_nux_finding_contacts_title_done);
        } else
        if (i1 == 1)
        {
            h.setText(o.orca_nux_finding_contacts_title_done_one);
        } else
        {
            h.setText(getContext().getString(o.orca_nux_finding_contacts_title_done_many, new Object[] {
                Integer.valueOf(i1)
            }));
        }
        i.setText(o.orca_nux_finding_contacts_body);
        g.setVisibility(8);
    }

    private void l()
    {
        if (!e())
        {
            return;
        }
        g.setVisibility(0);
        int i1 = getNumMatched();
        if (i1 == 0)
        {
            i.setText(o.orca_nux_finding_contacts_body);
            g.setIndeterminate(true);
            return;
        }
        g.setIndeterminate(false);
        g.setProgress(e.b());
        g.setMax(e.d());
        if (i1 == 1)
        {
            i.setText(o.orca_nux_finding_contacts_body_one);
            return;
        } else
        {
            i.setText(getContext().getString(o.orca_nux_finding_contacts_body_many, new Object[] {
                Integer.valueOf(i1)
            }));
            return;
        }
    }

    protected void a()
    {
        setContentView(k.orca_nux_finding_contacts);
        f = (LinearLayout)getView(i.orca_nux_finding_contacts_layout);
        g = (ProgressBar)getView(i.orca_nux_finding_contacts_progress);
        h = (TextView)getView(i.orca_nux_finding_contacts_title);
        i = (TextView)getView(i.orca_nux_finding_contacts_body);
        h.setText(o.orca_nux_finding_contacts_title);
        l();
    }

    public void setContentOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d();
        f.setOnClickListener(onclicklistener);
    }

    public void setState(ContactsUploadState contactsuploadstate)
    {
        com.facebook.debug.log.b.b(d, (new StringBuilder()).append("State: ").append(e).append(" -> ").append(contactsuploadstate).toString());
        Preconditions.checkNotNull(contactsuploadstate);
        e = contactsuploadstate;
        if (e()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (d.a[e.a().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            break;

        case 2: // '\002'
            b();
            return;

        case 3: // '\003'
            j();
            return;

        case 4: // '\004'
            k();
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
