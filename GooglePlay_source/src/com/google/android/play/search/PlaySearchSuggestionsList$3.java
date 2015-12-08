// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchSuggestionsList

final class val.inputManager
    implements android.view.SuggestionsList._cls3
{

    final PlaySearchSuggestionsList this$0;
    final InputMethodManager val$inputManager;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        val$inputManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        return false;
    }

    ()
    {
        this$0 = final_playsearchsuggestionslist;
        val$inputManager = InputMethodManager.this;
        super();
    }
}
