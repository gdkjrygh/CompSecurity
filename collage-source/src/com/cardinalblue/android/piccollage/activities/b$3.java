// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            b

class a
    implements android.view..OnClickListener
{

    final b a;

    public void onClick(View view)
    {
        a.getActivity().onOptionsItemSelected(b.g(a));
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
