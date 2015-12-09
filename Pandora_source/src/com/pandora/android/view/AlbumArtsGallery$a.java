// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.View;
import android.widget.SpinnerAdapter;
import com.pandora.radio.data.aa;

// Referenced classes of package com.pandora.android.view:
//            AlbumArtsGallery

public static interface 
    extends SpinnerAdapter
{

    public abstract void a(int i);

    public abstract void a(View view, int i);

    public abstract void a(View view, aa aa);
}
