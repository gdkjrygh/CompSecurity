// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchSuggestionAdapter, PlaySearchSuggestionModel, PlaySearchController, PlaySearchListener

final class val.model
    implements android.view.ggestionAdapter._cls1
{

    final PlaySearchSuggestionAdapter this$0;
    final PlaySearchSuggestionModel val$model;

    public final void onClick(View view)
    {
        if (mController != null)
        {
            view = mController;
            view.setQueryInternal(val$model.displayText, false);
            for (int i = ((PlaySearchController) (view)).mListeners.size() - 1; i >= 0; i--)
            {
                ((PlaySearchListener)((PlaySearchController) (view)).mListeners.get(i)).onSuggestionClicked$299d808f();
            }

        }
    }

    ()
    {
        this$0 = final_playsearchsuggestionadapter;
        val$model = PlaySearchSuggestionModel.this;
        super();
    }
}
