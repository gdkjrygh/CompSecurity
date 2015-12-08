// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;


// Referenced classes of package org.chromium.content.browser.input:
//            AdapterInputConnection

static class compositionEnd
{

    public final int compositionEnd;
    public final int compositionStart;
    public final int selectionEnd;
    public final int selectionStart;
    public final String text;

    public (String s, int i, int j, int k, int l)
    {
        text = s;
        selectionStart = i;
        selectionEnd = j;
        compositionStart = k;
        compositionEnd = l;
    }
}
