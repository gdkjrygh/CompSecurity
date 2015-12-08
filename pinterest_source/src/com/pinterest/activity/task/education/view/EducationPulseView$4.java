// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.view.MotionEvent;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.experiences.EducationAction;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationPulseView

class _hasPostedEvent extends android.view.eOnGestureListener
{

    private float _currScrollDistance;
    private boolean _hasPostedEvent;
    final EducationPulseView this$0;
    final EducationAction val$action;
    final int val$direction;
    final float val$finalScrollDistance;

    private boolean hasHitScrollDestination()
    {
        if (val$finalScrollDistance >= 0.0F) goto _L2; else goto _L1
_L1:
        if (_currScrollDistance > val$finalScrollDistance) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (_currScrollDistance < val$finalScrollDistance)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        val$direction;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 129
    //                   2 155;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_155;
_L4:
        PLog.info("onScroll %f", new Object[] {
            Float.valueOf(f1)
        });
        if (Math.abs(val$finalScrollDistance - _currScrollDistance) > Math.abs(val$finalScrollDistance))
        {
            _currScrollDistance = 0.0F;
        } else
        if (Math.abs(_currScrollDistance) > Math.abs(val$finalScrollDistance))
        {
            _currScrollDistance = val$finalScrollDistance;
        }
        if (hasHitScrollDestination() && !_hasPostedEvent)
        {
            com.pinterest.activity.task.education.event.e e;
            if (val$action == EducationAction.TAP)
            {
                e = com.pinterest.activity.task.education.event.USPEND;
            } else
            {
                e = com.pinterest.activity.task.education.event.EXT;
            }
            Events.post(new EducationEvent(e));
            _hasPostedEvent = true;
        }
        return super.onScroll(motionevent, motionevent1, f, f1);
_L2:
        if (Math.abs(f) > Math.abs(f1))
        {
            _currScrollDistance = _currScrollDistance + f;
        }
          goto _L4
        if (Math.abs(f1) > Math.abs(f))
        {
            _currScrollDistance = _currScrollDistance + f1;
        }
          goto _L4
    }

    ()
    {
        this$0 = final_educationpulseview;
        val$direction = i;
        val$finalScrollDistance = f;
        val$action = EducationAction.this;
        super();
        _currScrollDistance = 0.0F;
        _hasPostedEvent = false;
    }
}
