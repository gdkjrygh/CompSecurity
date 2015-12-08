// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.os.Handler;

public interface SmartClipProvider
{

    public abstract void extractSmartClipData(int i, int j, int k, int l);

    public abstract void setSmartClipResultHandler(Handler handler);
}
