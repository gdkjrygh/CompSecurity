// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils;

import android.text.style.URLSpan;
import android.view.View;

public final class UrlSpanUtils
{
    private static class SelfishUrlSpan extends URLSpan
    {

        public void onClick(View view)
        {
            getURL();
        }
    }

}
