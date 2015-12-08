// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import android.widget.ToggleButton;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.lang.ref.WeakReference;

public final class ToggleFollowSubscriber extends DefaultSubscriber
{

    private final WeakReference toggleButtonRef;

    public ToggleFollowSubscriber(ToggleButton togglebutton)
    {
        toggleButtonRef = new WeakReference(togglebutton);
    }

    public final void onNext(Boolean boolean1)
    {
        ToggleButton togglebutton = (ToggleButton)toggleButtonRef.get();
        if (togglebutton != null)
        {
            togglebutton.setChecked(boolean1.booleanValue());
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((Boolean)obj);
    }
}
