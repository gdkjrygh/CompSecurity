// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import org.json.JSONObject;

class loopCount extends loopCount
{

    private static final String JSON_KEY_LOOP_COUNT = "loopCount";
    private final int cellCount;
    private int currentCell;
    private int currentLoop;
    private final int loopCount;

    int getCurrentCell()
    {
        return currentCell;
    }

    boolean incrementLoopCount()
    {
        currentLoop = Math.min(currentLoop + 1, loopCount);
        return isFinished();
    }

    boolean isFinished()
    {
        return loopCount > 0 && currentLoop >= loopCount;
    }

    void reset()
    {
        currentLoop = 0;
        currentCell = -1;
    }

    boolean update()
    {
        int i = currentCell + 1;
        currentCell = i;
        if (i >= cellCount)
        {
            if (incrementLoopCount())
            {
                currentCell = cellCount - 1;
            } else
            {
                currentCell = 0;
            }
        }
        return isFinished();
    }

    (int i, JSONObject jsonobject)
    {
        super(null);
        currentLoop = 0;
        cellCount = i;
        loopCount = jsonobject.optInt("loopCount", 1);
    }
}
