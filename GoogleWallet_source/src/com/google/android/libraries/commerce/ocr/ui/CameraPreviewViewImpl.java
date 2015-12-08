// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            CameraPreviewView

public class CameraPreviewViewImpl extends ViewGroup
    implements CameraPreviewView
{

    private Point cameraPreviewSize;
    private final Point contentSize = new Point();
    private CameraPreviewView.Presenter presenter;
    private boolean previewAreaFinalized;
    private final SurfaceView previewView;

    public CameraPreviewViewImpl(Context context, CameraPreviewView.Presenter presenter1)
    {
        super(context);
        previewAreaFinalized = false;
        previewView = new SurfaceView(context);
        addView(previewView);
        setPresenter(presenter1);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        Rect rect;
        View view;
        if (getChildCount() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Preview view must have only one child view");
        view = getChildAt(0);
        k -= i;
        if (cameraPreviewSize != null)
        {
            i = cameraPreviewSize.x;
        } else
        {
            i = k;
        }
        if (cameraPreviewSize != null)
        {
            j = cameraPreviewSize.y;
        } else
        {
            j = l - j;
        }
        if (i == 0 && j == 0)
        {
            rect = new Rect(0, 0, 0, 0);
        } else
        {
            rect = new Rect(0, 0, k, (j * k) / i);
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (!previewAreaFinalized && cameraPreviewSize != null)
        {
            previewAreaFinalized = true;
            presenter.onPreviewLayoutFinalized(rect, contentSize);
        }
    }

    protected void onMeasure(int i, int j)
    {
        i = resolveSize(getSuggestedMinimumWidth(), i);
        j = resolveSize(getSuggestedMinimumHeight(), j);
        contentSize.set(i, j);
        setMeasuredDimension(i, j);
    }

    public void setPresenter(CameraPreviewView.Presenter presenter1)
    {
        presenter = presenter1;
        SurfaceHolder surfaceholder = previewView.getHolder();
        surfaceholder.addCallback(presenter1);
        surfaceholder.setType(3);
    }

    public void setPreviewPadding(int i, int j)
    {
        cameraPreviewSize = new Point(i, j);
        requestLayout();
        presenter.onPreviewLayoutFinalized(null, contentSize);
    }

    public final View toView()
    {
        return this;
    }
}
