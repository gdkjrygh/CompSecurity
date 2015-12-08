// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.people.model.Person;
import com.google.android.gms.people.model.PersonBuffer;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            ManageCirclesHelper

final class this._cls0
    implements ResultCallback
{

    final ManageCirclesHelper this$0;

    public final volatile void onResult(Result result)
    {
        Object obj;
        obj = (com.google.android.gms.people.)result;
        result = ManageCirclesHelper.this;
        Status status = ((com.google.android.gms.people.) (obj)).getStatus();
        obj = ((com.google.android.gms.people.) (obj)).getPeople();
        if (((ManageCirclesHelper) (result)).mCanceled)
        {
            GamesLog.d("ManageCirclesHelper", "onPeopleLoaded: Canceled! Ignoring this callback...");
            return;
        }
        if (!status.isSuccess())
        {
            GamesLog.w("ManageCirclesHelper", (new StringBuilder("onPeopleLoaded: error status: ")).append(status).toString());
            result.showManageCirclesFailure();
            return;
        }
        if (((ManageCirclesHelper) (result)).mCallback != null && !((ManageCirclesHelper) (result)).mCallback.canContinueProcessing())
        {
            GamesLog.w("ManageCirclesHelper", "onCirclesLoaded: processing halted at client's request");
            result.showManageCirclesFailure();
            return;
        }
        if (((PersonBuffer) (obj)).getCount() > 0)
        {
            result.mBelongingCircleIds = ((PersonBuffer) (obj)).get(0).getBelongingCircleIds();
        }
        ((PersonBuffer) (obj)).release();
        result.mHasLoadedBelongingCircleIds = true;
        result.computeBelongingCircles();
        return;
        result;
        ((PersonBuffer) (obj)).release();
        throw result;
    }

    ntinueProcessingCallback()
    {
        this$0 = ManageCirclesHelper.this;
        super();
    }
}
