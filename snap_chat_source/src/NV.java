// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.util.eventbus.SnapCaptureContext;

public final class NV
{

    public final SnapCaptureContext mCaptureContext;
    public final View mLastView;
    public final AA mMediabryo;

    public NV(AA aa, SnapCaptureContext snapcapturecontext)
    {
        this(aa, snapcapturecontext, null);
    }

    public NV(AA aa, SnapCaptureContext snapcapturecontext, View view)
    {
        mMediabryo = (AA)dv.a(aa);
        mCaptureContext = (SnapCaptureContext)dv.a(snapcapturecontext);
        mLastView = view;
    }
}
