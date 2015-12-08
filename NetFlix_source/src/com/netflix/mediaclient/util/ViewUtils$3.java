// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.netflix.mediaclient.util:
//            ViewUtils

static final class val.desc
    implements android.view.lickListener
{

    final CharSequence val$desc;
    final View val$root;

    public boolean onLongClick(View view)
    {
        Toast.makeText(val$root.getContext(), val$desc, 0).show();
        return true;
    }

    (View view, CharSequence charsequence)
    {
        val$root = view;
        val$desc = charsequence;
        super();
    }
}
