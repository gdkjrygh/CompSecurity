// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

public interface ViewPropertyAnimatorListener
{

    public abstract void onAnimationCancel(View view);

    public abstract void onAnimationEnd(View view);

    public abstract void onAnimationStart(View view);
}
