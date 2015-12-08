// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            GifSearchFragment

final class ax
    implements android.view.View.OnClickListener
{

    final GifSearchFragment a;

    ax(GifSearchFragment gifsearchfragment)
    {
        a = gifsearchfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.cancelSearchText();
    }
}
