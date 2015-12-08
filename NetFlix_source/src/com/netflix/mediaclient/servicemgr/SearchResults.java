// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.content.Context;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            Trackable

public interface SearchResults
    extends Trackable
{

    public abstract int getNumResults();

    public abstract int getNumResultsForSection(int i);

    public abstract int getNumSections();

    public abstract Object getResult(int i);

    public abstract CharSequence getSectionTitle(Context context, int i);

    public abstract boolean hasResults();
}
