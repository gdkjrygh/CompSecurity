// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            af, ai

final class ah extends af
    implements android.view.LayoutInflater.Factory2
{

    ah(ai ai1)
    {
        super(ai1);
    }

    public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        return a.a(view, s, context, attributeset);
    }
}
