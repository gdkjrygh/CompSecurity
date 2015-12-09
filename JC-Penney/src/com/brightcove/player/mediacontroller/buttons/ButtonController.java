// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.Button;
import com.brightcove.player.event.EventEmitter;
import java.util.List;
import java.util.Map;

public interface ButtonController
{

    public abstract Button getButton();

    public abstract EventEmitter getEventEmitter();

    public abstract int getId();

    public abstract int getManagedState();

    public abstract Map getProperties();

    public abstract List getStateList();

    public abstract int getVisibilityState();

    public abstract void removeListeners();

    public abstract void syncStates();
}
