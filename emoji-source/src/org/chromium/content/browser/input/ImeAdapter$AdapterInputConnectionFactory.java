// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.EditorInfo;

// Referenced classes of package org.chromium.content.browser.input:
//            ImeAdapter, AdapterInputConnection

public static class Q
{

    public AdapterInputConnection get(View view, ImeAdapter imeadapter, Editable editable, EditorInfo editorinfo)
    {
        return new AdapterInputConnection(view, imeadapter, editable, editorinfo);
    }

    public Q()
    {
    }
}
