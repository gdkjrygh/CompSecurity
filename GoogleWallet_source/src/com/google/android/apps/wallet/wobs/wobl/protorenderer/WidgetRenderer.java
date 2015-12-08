// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.renderer.android.AndroidRenderUtils;
import com.google.wallet.wobl.renderer.android.RendererClient;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            ProtoWoblRenderer, ProtoWoblRenderUtils

abstract class WidgetRenderer
{

    private static final String TAG = com/google/android/apps/wallet/wobs/wobl/protorenderer/WidgetRenderer.getSimpleName();
    private View view;
    protected final ProtoWoblRenderer woblRenderer;

    protected WidgetRenderer(ProtoWoblRenderer protowoblrenderer)
    {
        woblRenderer = protowoblrenderer;
    }

    private com.google.wallet.proto.NanoCompiledWobl.TapUri[] getTapUris()
    {
        if (getWidgetAttributes() != null && getWidgetAttributes().tapUri != null && getWidgetAttributes().tapUri.length > 0)
        {
            return getWidgetAttributes().tapUri;
        } else
        {
            return null;
        }
    }

    final void applyWobl()
    {
        Preconditions.checkNotNull(view, "a View must be created with render() or set with setView()");
        try
        {
            unsafeApplyWobl();
            view.setVisibility(0);
            return;
        }
        catch (Exception exception)
        {
            view.setVisibility(8);
            WLog.e(TAG, "Failed to apply wobl", exception);
            return;
        }
    }

    protected abstract View createView();

    protected final Context getContext()
    {
        return woblRenderer.getContext();
    }

    protected final RendererClient getRendererClient()
    {
        return woblRenderer.getRendererClient();
    }

    protected final Resources getResources()
    {
        return getContext().getResources();
    }

    protected final View getView()
    {
        return view;
    }

    protected abstract com.google.wallet.proto.NanoCompiledWobl.WidgetAttributes getWidgetAttributes();

    protected final View render()
    {
        view = createView();
        applyWobl();
        return view;
    }

    protected final void setBackground(Drawable drawable)
    {
        view.setBackgroundDrawable(drawable);
    }

    protected void setBackgroundAsClickable(Drawable drawable)
    {
        setBackground(new LayerDrawable(new Drawable[] {
            drawable, ResourcesCompat.getDrawable(getResources(), com.google.android.apps.walletnfcrel.R.drawable.bounded_rippleable, getContext().getTheme())
        }));
    }

    protected final void setView(View view1)
    {
        view = view1;
    }

    protected abstract void setViewGravity(Integer integer, Integer integer1);

    protected void unsafeApplyWobl()
        throws Exception
    {
        if (getWidgetAttributes() != null)
        {
            Object obj;
            int i;
            if (getWidgetAttributes().backgroundColor != null)
            {
                i = ProtoWoblRenderUtils.toAndroidColor(getWidgetAttributes().backgroundColor);
            } else
            {
                i = getContext().getResources().getColor(0x106000d);
            }
            obj = new ColorDrawable(i);
            if (getTapUris() != null)
            {
                setBackgroundAsClickable(((Drawable) (obj)));
            } else
            {
                setBackground(((Drawable) (obj)));
            }
            if (getWidgetAttributes().padding != null)
            {
                obj = ProtoWoblRenderUtils.toIntArray(getContext(), getWidgetAttributes().padding);
                view.setPadding(obj[0], obj[1], obj[2], obj[3]);
            }
            if (getTapUris() != null)
            {
                obj = Lists.transform(Arrays.asList(getTapUris()), ProtoWoblRenderUtils.TO_URI);
                view.setOnClickListener(AndroidRenderUtils.getFirstResolvableClickListener(((java.util.List) (obj)), getRendererClient(), view));
            }
            obj = getWidgetAttributes().zDepthInDps;
            if (android.os.Build.VERSION.SDK_INT >= 21 && obj != null && ((Float) (obj)).floatValue() > 0.0F)
            {
                obj = DisplayUnit.of(((Float) (obj)).floatValue(), com.google.wallet.wobl.common.DisplayUnit.Unit.DP);
                view.setElevation(AndroidRenderUtils.displayUnitToPx(((DisplayUnit) (obj)), getContext()));
            }
            setViewGravity(getWidgetAttributes().horizontalAlign, getWidgetAttributes().verticalAlign);
        }
    }

}
