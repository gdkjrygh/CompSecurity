// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;

public interface f
{

    public abstract void a(ExerciseSession exercisesession);

    public abstract void a(ExerciseSession exercisesession, ExerciseSegment exercisesegment);

    public abstract void a(ExerciseSession exercisesession, b b1);

    public abstract void b(ExerciseSession exercisesession, ExerciseSegment exercisesegment);
}
