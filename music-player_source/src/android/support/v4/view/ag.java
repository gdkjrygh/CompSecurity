// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.widget.TextView;

// Referenced classes of package android.support.v4.view:
//            ae, ai

final class ag
    implements ae
{

    ag()
    {
    }

    public final void a(TextView textview)
    {
        textview.setTransformationMethod(new ai(textview.getContext()));
    }
}
