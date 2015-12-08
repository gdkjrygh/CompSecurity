// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.SimpleUiContainer;

public class DialogScreensContainer extends SimpleUiContainer
{

    public DialogScreensContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected Object getModule()
    {
        return new Module();
    }

    private class Module
    {

        public Module()
        {
        }
    }

}
