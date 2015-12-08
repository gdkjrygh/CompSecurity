// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterCompatHC, LayoutInflaterFactory

static class <init> extends <init>
    implements android.view.oryWrapper
{

    public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        return mDelegateFactory.onCreateView(view, s, context, attributeset);
    }

    (LayoutInflaterFactory layoutinflaterfactory)
    {
        super(layoutinflaterfactory);
    }
}
