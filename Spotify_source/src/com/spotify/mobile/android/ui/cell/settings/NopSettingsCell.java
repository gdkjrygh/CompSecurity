// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            AbstractSettingsCell

public class NopSettingsCell extends AbstractSettingsCell
{

    public NopSettingsCell(Context context)
    {
        super(context);
    }

    public NopSettingsCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NopSettingsCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static NopSettingsCell a(Context context, ViewGroup viewgroup)
    {
        return (NopSettingsCell)LayoutInflater.from(context).inflate(0x7f03012b, viewgroup, false);
    }

    protected final void a(ContentValues contentvalues)
    {
    }

    public final void a(Cursor cursor)
    {
    }
}
