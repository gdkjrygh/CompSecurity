// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.ji;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.audience.widgets:
//            AudienceView

static final class <init> extends com.google.android.gms.internal.AudienceView.a
{

    private Audience TK;
    private TextView TL;

    public final void a(d d, d d1, ji ji)
    {
        TL = new TextView((Context)e.i(d));
    }

    public final void cT(int i)
    {
    }

    public final d getView()
    {
        return e.q(TL);
    }

    public final void onRestoreInstanceState(Bundle bundle)
    {
        setAudience((Audience)bundle.getParcelable("audience"));
    }

    public final Bundle onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("audience", TK);
        return bundle;
    }

    public final void setAudience(Audience audience)
    {
        TK = audience;
        if (TK == null)
        {
            TL.setText("");
            return;
        }
        Iterator iterator = audience.getAudienceMemberList().iterator();
        audience = null;
        while (iterator.hasNext()) 
        {
            AudienceMember audiencemember = (AudienceMember)iterator.next();
            StringBuilder stringbuilder = new StringBuilder();
            if (audience == null)
            {
                audience = "";
            } else
            {
                audience = (new StringBuilder()).append(audience).append(", ").toString();
            }
            audience = stringbuilder.append(audience).append(audiencemember.getDisplayName()).toString();
        }
        TL.setText(audience);
    }

    public final void setIsUnderageAccount(boolean flag)
    {
    }

    public final void setShowEmptyText(boolean flag)
    {
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
