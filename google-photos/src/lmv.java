// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

public interface lmv
    extends IInterface
{

    public abstract void a(int i, Bundle bundle, Bundle bundle1);

    public abstract void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor);

    public abstract void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1);

    public abstract void a(int i, Bundle bundle, DataHolder dataholder);

    public abstract void a(int i, Bundle bundle, DataHolder adataholder[]);
}
