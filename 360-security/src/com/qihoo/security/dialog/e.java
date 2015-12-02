// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import com.qihoo.security.locale.widget.LocaleButton;

public interface e
{

    public abstract LocaleButton[] getShownButtons();

    public transient abstract void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[]);

    public transient abstract void setButtonText(int ai[]);

    public transient abstract void setButtonText(CharSequence acharsequence[]);
}
