// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            ActivityCompat21

public static abstract class 
{

    public abstract Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf);

    public abstract View onCreateSnapshotView(Context context, Parcelable parcelable);

    public abstract void onSharedElementStart$70d861b8(List list);

    public ()
    {
    }
}
