// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters;

import android.graphics.Bitmap;
import com.aviary.android.feather.headless.moa.MoaResult;
import com.aviary.android.feather.headless.moa.d;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.headless.filters:
//            IFilter

public interface INativeFilter
    extends IFilter
{

    public abstract MoaResult a(Bitmap bitmap, Bitmap bitmap1, int i, int j)
        throws JSONException;

    public abstract d a();
}
