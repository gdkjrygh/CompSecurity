// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.util.AttributeSet;
import c;
import daw;
import dbb;
import dce;
import dcg;
import dcj;
import dcl;
import dco;
import dcq;

public class StoryboardStripView extends daw
{

    public StoryboardStripView(Context context)
    {
        super(context);
    }

    public StoryboardStripView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public StoryboardStripView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final dbb[] a()
    {
        return (new dbb[] {
            new dcl(this, c.P), new dcq(this), new dco(this), new dce(this), new dcg(this), new dcj(this)
        });
    }
}
