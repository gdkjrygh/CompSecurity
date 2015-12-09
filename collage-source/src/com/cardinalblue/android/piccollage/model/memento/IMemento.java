// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.memento;

import android.os.Bundle;
import android.os.Parcelable;

public interface IMemento
    extends Parcelable
{

    public abstract Bundle a();

    public abstract void a(Bundle bundle);
}
