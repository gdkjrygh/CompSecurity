// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.FollowSimilarBoardToast;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
import java.util.List;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowSimilarBoardsLayout

class this._cls0
    implements com.pinterest.base.BoardsLayout._cls3
{

    final FollowSimilarBoardsLayout this$0;

    public void onEventMainThread(lowSimilarBoardSuccessEvent lowsimilarboardsuccessevent)
    {
        int i = lowsimilarboardsuccessevent.getViewPositionIndex();
        lowsimilarboardsuccessevent = (Board)_currentlyDisplayedBoardSuggestions.get(i - 2);
        Events.post(new ToastEvent(new FollowSimilarBoardToast(lowsimilarboardsuccessevent)));
        replaceBoardRecommendation(lowsimilarboardsuccessevent);
    }

    lowSimilarBoardSuccessEvent()
    {
        this$0 = FollowSimilarBoardsLayout.this;
        super();
    }
}
