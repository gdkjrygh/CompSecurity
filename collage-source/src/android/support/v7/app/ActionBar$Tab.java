// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBar

public static abstract class istener
{

    public static final int INVALID_POSITION = -1;

    public abstract CharSequence getContentDescription();

    public abstract View getCustomView();

    public abstract Drawable getIcon();

    public abstract int getPosition();

    public abstract Object getTag();

    public abstract CharSequence getText();

    public abstract void select();

    public abstract istener setContentDescription(int i);

    public abstract istener setContentDescription(CharSequence charsequence);

    public abstract istener setCustomView(int i);

    public abstract istener setCustomView(View view);

    public abstract istener setIcon(int i);

    public abstract istener setIcon(Drawable drawable);

    public abstract istener setTabListener(istener istener);

    public abstract istener setTag(Object obj);

    public abstract istener setText(int i);

    public abstract istener setText(CharSequence charsequence);

    public istener()
    {
    }
}
