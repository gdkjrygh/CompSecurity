// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import rx.Observable;

public interface IDestinyService
{

    public abstract Observable exitDestiny();

    public abstract Observable exitSetDestiny();

    public abstract Observable setDestiny(Location location);

    public abstract Observable switchToDestiny();
}
