// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.arsenal;

import android.os.Bundle;
import dkq;

public abstract class FeedbackMode extends Enum
{

    public static final FeedbackMode a;
    public static final FeedbackMode b;
    private static final FeedbackMode c[];

    private FeedbackMode(String s, int i)
    {
        super(s, i);
    }

    FeedbackMode(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static FeedbackMode a(int i)
    {
        return values()[i];
    }

    public static FeedbackMode a(Bundle bundle, String s)
    {
        int i = bundle.getInt(s, b.ordinal());
        return values()[i];
    }

    public static FeedbackMode valueOf(String s)
    {
        return (FeedbackMode)Enum.valueOf(com/spotify/mobile/android/arsenal/FeedbackMode, s);
    }

    public static FeedbackMode[] values()
    {
        return (FeedbackMode[])c.clone();
    }

    public abstract void a(dkq dkq);

    static 
    {
        a = new FeedbackMode("EXPLICIT") {

            public final void a(dkq dkq1)
            {
                dkq1.b();
            }

        };
        b = new FeedbackMode("SILENT") {

            public final void a(dkq dkq1)
            {
                dkq1.a();
            }

        };
        c = (new FeedbackMode[] {
            a, b
        });
    }
}
