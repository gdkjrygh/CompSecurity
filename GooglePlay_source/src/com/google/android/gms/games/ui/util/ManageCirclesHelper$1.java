// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.people.model.Circle;
import com.google.android.gms.people.model.CircleBuffer;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            ManageCirclesHelper

final class this._cls0
    implements ResultCallback
{

    final ManageCirclesHelper this$0;

    public final volatile void onResult(Result result)
    {
        Object obj;
        obj = (com.google.android.gms.people.t)result;
        result = ManageCirclesHelper.this;
        Status status = ((com.google.android.gms.people.t) (obj)).getStatus();
        obj = ((com.google.android.gms.people.t) (obj)).getCircles();
        if (((ManageCirclesHelper) (result)).mCanceled)
        {
            GamesLog.d("ManageCirclesHelper", "onCirclesLoaded: Canceled! Ignoring this callback...");
            return;
        }
        if (!status.isSuccess())
        {
            GamesLog.w("ManageCirclesHelper", (new StringBuilder("onCirclesLoaded: error status: ")).append(status).toString());
            result.showManageCirclesFailure();
            return;
        }
        if (((ManageCirclesHelper) (result)).mCallback != null && !((ManageCirclesHelper) (result)).mCallback.canContinueProcessing())
        {
            GamesLog.w("ManageCirclesHelper", "onCirclesLoaded: processing halted at client's request");
            result.showManageCirclesFailure();
            return;
        }
        if (((ManageCirclesHelper) (result)).mPlayerCircles != null) goto _L2; else goto _L1
_L1:
        result.mPlayerCircles = new ArrayList();
_L4:
        Object obj1;
        for (Iterator iterator = ((CircleBuffer) (obj)).iterator(); iterator.hasNext(); ((ManageCirclesHelper) (result)).mPlayerCircles.add(obj1))
        {
            obj1 = (Circle)iterator.next();
            obj1 = AudienceMember.forCircle(((Circle) (obj1)).getCircleId(), ((Circle) (obj1)).getCircleName());
        }

        break MISSING_BLOCK_LABEL_195;
        result;
        ((CircleBuffer) (obj)).release();
        throw result;
_L2:
        ((ManageCirclesHelper) (result)).mPlayerCircles.clear();
        if (true) goto _L4; else goto _L3
_L3:
        ((CircleBuffer) (obj)).release();
        result.mHasLoadedCircles = true;
        result.computeBelongingCircles();
        return;
    }

    ntinueProcessingCallback()
    {
        this$0 = ManageCirclesHelper.this;
        super();
    }
}
