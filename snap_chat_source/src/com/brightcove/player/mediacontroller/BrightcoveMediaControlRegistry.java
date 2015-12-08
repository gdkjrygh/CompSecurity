// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.view.View;
import com.brightcove.player.mediacontroller.buttons.ButtonController;
import java.util.List;

public interface BrightcoveMediaControlRegistry
{

    public abstract void clear();

    public abstract ButtonController getButtonController(int i);

    public abstract List getButtonControllers();

    public abstract int getId(View view);

    public abstract int getManagedState(int i);

    public abstract List getStateList(int i);

    public abstract View getView(int i);

    public abstract View getView(String s);

    public abstract void register(View view);

    public abstract void register(ButtonController buttoncontroller);
}
