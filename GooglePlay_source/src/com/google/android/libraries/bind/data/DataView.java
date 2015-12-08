// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;


// Referenced classes of package com.google.android.libraries.bind.data:
//            DataList, Data

public interface DataView
{

    public abstract DataList getDataRow();

    public abstract void onDataUpdated(Data data);

    public abstract void setDataRow(DataList datalist);
}
