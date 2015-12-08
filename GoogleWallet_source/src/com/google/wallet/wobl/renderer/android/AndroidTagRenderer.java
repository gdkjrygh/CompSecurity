// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.common.base.Optional;
import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.renderer.AbstractTagRenderer;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidRenderer, AndroidRenderUtils

public abstract class AndroidTagRenderer extends AbstractTagRenderer
{

    int androidVersion;

    public AndroidTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
        androidVersion = android.os.Build.VERSION.SDK_INT;
    }

    public static int convertAlphaToInt(float f)
    {
        return Math.round(255F * f);
    }

    public void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        Object obj = getContext().getResources();
        int i;
        if (intermediaterepresentation.getBackgroundColor().isPresent())
        {
            i = Color.parseColor((String)intermediaterepresentation.getBackgroundColor().get());
        } else
        {
            i = ((Resources) (obj)).getColor(0x106000d);
        }
        obj = new ColorDrawable(i);
        if (!intermediaterepresentation.getTapUris().isEmpty())
        {
            view.setOnClickListener(AndroidRenderUtils.getFirstResolvableClickListener(intermediaterepresentation.getTapUris(), ((AndroidRenderer)getRenderer()).getRendererClient(), view));
            applyOnClickColors(view, ((ColorDrawable) (obj)));
        } else
        {
            view.setBackgroundDrawable(((Drawable) (obj)));
        }
        view.setPadding(AndroidRenderUtils.displayUnitToPx(intermediaterepresentation.getLeftPadding(), getContext()), AndroidRenderUtils.displayUnitToPx(intermediaterepresentation.getTopPadding(), getContext()), AndroidRenderUtils.displayUnitToPx(intermediaterepresentation.getRightPadding(), getContext()), AndroidRenderUtils.displayUnitToPx(intermediaterepresentation.getBottomPadding(), getContext()));
        intermediaterepresentation = intermediaterepresentation.getZDepth();
        if (intermediaterepresentation != DisplayUnit.ZERO && androidVersion >= 21)
        {
            view.setElevation(AndroidRenderUtils.displayUnitToPx(intermediaterepresentation, getContext()));
        }
    }

    protected void applyOnClickColors(View view, ColorDrawable colordrawable)
    {
        view.setBackgroundDrawable(new LayerDrawable(new Drawable[] {
            colordrawable, getContext().getResources().getDrawable(R.drawable.wobl_bounded_rippleable)
        }));
    }

    public Context getContext()
    {
        return ((AndroidRenderer)getRenderer()).getContext();
    }

    public abstract View getViewInstance();

    public final View render(IntermediateRepresentation intermediaterepresentation)
    {
        View view = getViewInstance();
        applyIrToView(view, intermediaterepresentation);
        return view;
    }

    public volatile Object render(IntermediateRepresentation intermediaterepresentation)
    {
        return render(intermediaterepresentation);
    }
}
