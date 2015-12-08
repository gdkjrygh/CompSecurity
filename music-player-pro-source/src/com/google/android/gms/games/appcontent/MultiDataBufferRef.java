// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import java.util.ArrayList;

public abstract class MultiDataBufferRef extends d
{

    protected final ArrayList XX;

    protected MultiDataBufferRef(ArrayList arraylist, int i, int j)
    {
        super((DataHolder)arraylist.get(i), j);
        XX = arraylist;
    }
}
