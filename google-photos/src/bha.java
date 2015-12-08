// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.consumerphotoeditor.views.ActionBarView;

public final class bha
    implements android.view.View.OnClickListener
{

    private ActionBarView a;

    public bha(ActionBarView actionbarview)
    {
        a = actionbarview;
        super();
    }

    public final void onClick(View view)
    {
        if (ActionBarView.a(a) != null)
        {
            ActionBarView.a(a).w_();
        }
    }
}
