// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.google.common.base.Optional;
import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            RendererClient, AnalyticsLogger, ActionController

public class AndroidRenderUtils
{

    private static final String TAG = com/google/wallet/wobl/renderer/android/AndroidRenderUtils.getSimpleName();

    public AndroidRenderUtils()
    {
    }

    static int calculateGravity(IntermediateRepresentation intermediaterepresentation)
    {
        int i = 0;
        static class _cls2
        {

            static final int $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$HorizontalAlign[];
            static final int $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign = new int[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.BOTTOM.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.CENTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.TOP.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$HorizontalAlign = new int[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.HorizontalAlign.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$HorizontalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.HorizontalAlign.LEFT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$HorizontalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.HorizontalAlign.RIGHT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$HorizontalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.HorizontalAlign.CENTER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.HorizontalAlign[intermediaterepresentation.getHorizontalAlignment().ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 78
    //                   2 83
    //                   3 88;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_88;
_L5:
        switch (_cls2..SwitchMap.com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign[intermediaterepresentation.getVerticalAlignment().ordinal()])
        {
        default:
            return i;

        case 1: // '\001'
            return i | 0x50;

        case 2: // '\002'
            return i | 0x10;

        case 3: // '\003'
            return i | 0x30;
        }
_L2:
        i = 3;
          goto _L5
_L3:
        i = 5;
          goto _L5
        i = 1;
          goto _L5
    }

    public static int displayUnitToPx(DisplayUnit displayunit, Context context)
    {
        return ((Integer)displayUnitToPx(Optional.of(displayunit), context).or(Integer.valueOf(0))).intValue();
    }

    static Optional displayUnitToPx(Optional optional, Context context)
    {
        if (!optional.isPresent())
        {
            return Optional.absent();
        }
        context = context.getResources().getDisplayMetrics();
        try
        {
            context = Optional.of(Integer.valueOf(((DisplayUnit)optional.get()).getPixelThrowIfWeight(((DisplayMetrics) (context)).density, ((DisplayMetrics) (context)).scaledDensity, ((DisplayMetrics) (context)).xdpi)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = TAG;
            optional = String.valueOf(optional);
            Log.e(context, (new StringBuilder(String.valueOf(optional).length() + 41)).append("Could not convert displayUnit to pixels: ").append(optional).toString());
            return Optional.absent();
        }
        return context;
    }

    public static android.view.View.OnClickListener getFirstResolvableClickListener(final List uris, final RendererClient rendererClient, final View view)
    {
        return new android.view.View.OnClickListener() {

            final RendererClient val$rendererClient;
            final List val$uris;
            final View val$view;

            public final void onClick(View view1)
            {
                Iterator iterator = uris.iterator();
_L2:
                URI uri;
                AnalyticsLogger analyticslogger;
                if (iterator.hasNext())
                {
                    uri = (URI)iterator.next();
                    ActionController actioncontroller = rendererClient.getActionControllerForUriPattern(uri.toString());
                    analyticslogger = rendererClient.getAnalyticsLogger();
                    if (actioncontroller == null)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    if (analyticslogger != null)
                    {
                        analyticslogger.logTapUri(uri);
                    }
                    actioncontroller.onAction(uri, view);
                }
_L3:
                return;
                if (!AndroidRenderUtils.intentToUri(view1.getContext(), rendererClient, uri)) goto _L2; else goto _L1
_L1:
                if (analyticslogger != null)
                {
                    analyticslogger.logTapUri(uri);
                    return;
                }
                  goto _L3
                if (true) goto _L2; else goto _L4
_L4:
            }

            
            {
                uris = list;
                rendererClient = rendererclient;
                view = view1;
                super();
            }
        };
    }

    public static boolean intentToUri(Context context, RendererClient rendererclient, URI uri)
    {
        rendererclient = rendererclient.createIntentFromUri(uri);
        rendererclient.setFlags(0x20000000);
        uri = context.getPackageManager().resolveActivity(rendererclient, 0x10000);
        if (uri != null && ((ResolveInfo) (uri)).activityInfo != null)
        {
            context.startActivity(rendererclient);
            return true;
        } else
        {
            return false;
        }
    }

}
