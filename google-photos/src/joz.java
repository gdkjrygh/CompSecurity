// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;

public final class joz
{

    public final int a;
    public final android.view.ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public joz(kxu kxu1)
    {
        b = kxu1.getLayoutParams();
        android.view.ViewParent viewparent = kxu1.getParent();
        d = kxu1.e();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            c = (ViewGroup)viewparent;
            a = c.indexOfChild(kxu1.a());
            c.removeView(kxu1.a());
            kxu1.a(true);
            return;
        } else
        {
            throw new jox("Could not get the parent of the WebView for an overlay.");
        }
    }
}
