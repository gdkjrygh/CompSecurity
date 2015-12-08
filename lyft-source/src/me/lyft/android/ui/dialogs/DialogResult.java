// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;


public class DialogResult
{

    private int buttonId;
    private boolean isCancelled;
    private int selectedIndex;
    private String tag;

    public DialogResult()
    {
    }

    public int getButtonId()
    {
        return buttonId;
    }

    public int getSelectedIndex()
    {
        return selectedIndex;
    }

    public String getTag()
    {
        return tag;
    }

    public boolean isCancelled()
    {
        return isCancelled;
    }

    public void setButtonId(int i)
    {
        buttonId = i;
    }

    public void setCancelled(boolean flag)
    {
        isCancelled = flag;
    }

    public void setSelectedIndex(int i)
    {
        selectedIndex = i;
    }

    public void setTag(String s)
    {
        tag = s;
    }
}
