// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driverdocuments;

import java.io.File;
import me.lyft.android.domain.driverdocuments.Inspection;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.domain.driverdocuments.Registration;
import rx.Observable;

public interface IDriverDocumentsService
{

    public abstract Observable forceRefresh();

    public abstract boolean isDriverDocumentsEnabled();

    public abstract void refresh();

    public abstract Observable updateInspection(Inspection inspection, File file);

    public abstract Observable updateInsurance(Insurance insurance, File file);

    public abstract Observable updateRegistration(Registration registration, File file);
}
