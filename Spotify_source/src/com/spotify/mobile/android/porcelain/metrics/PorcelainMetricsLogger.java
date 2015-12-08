// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.metrics;

import drp;

public interface PorcelainMetricsLogger
{

    public static final PorcelainMetricsLogger a = new PorcelainMetricsLogger() {

        public final void a()
        {
        }

        public final void a(String s, InteractionType interactiontype, InteractionAction interactionaction, drp drp)
        {
        }

    };

    public abstract void a();

    public abstract void a(String s, InteractionType interactiontype, InteractionAction interactionaction, drp drp);

}
