// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.list;

import com.google.android.apps.wallet.util.proto.Protos;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LayoutMatcher
{

    public static final List WOBS_ENTRY_POINT_NAMES;
    private final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters deviceContextParameters;

    public LayoutMatcher(com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters)
    {
        deviceContextParameters = layoutcontextparameters;
    }

    public final transient com.google.wallet.proto.NanoWalletWobl.Layout getLayoutForEntrypoint(com.google.wallet.proto.NanoWalletWobl.RenderOutput renderoutput, String as[])
    {
        if (renderoutput != null) goto _L2; else goto _L1
_L1:
        com.google.wallet.proto.NanoWalletWobl.Layout layout = null;
_L4:
        return layout;
_L2:
        layout = null;
        int j = Protos.valueWithDefault(deviceContextParameters.woblVersion, 0);
        int k = Protos.valueWithDefault(deviceContextParameters.minimumDimension, 0);
        int l = Protos.valueWithDefault(deviceContextParameters.orientation, 0);
        com.google.wallet.proto.NanoWalletWobl.Layout alayout[] = renderoutput.layouts;
        int i1 = alayout.length;
        int i = 0;
        com.google.wallet.proto.NanoWalletWobl.RenderOutput renderoutput1;
        for (renderoutput = layout; i < i1; renderoutput = renderoutput1)
        {
            layout = alayout[i];
            com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters = layout.contextParameters;
            int j1 = Protos.valueWithDefault(layoutcontextparameters.woblVersion, 0);
            int l1 = Protos.valueWithDefault(layoutcontextparameters.minimumDimension, 0);
            renderoutput1 = renderoutput;
            if (!Collections.disjoint(Arrays.asList(layout.entrypointNames), Arrays.asList(as)))
            {
                renderoutput1 = renderoutput;
                if (j1 <= j)
                {
                    renderoutput1 = renderoutput;
                    if (l1 <= k)
                    {
                        int k1 = Protos.valueWithDefault(layoutcontextparameters.orientation, 0);
                        if (k1 == 0)
                        {
                            renderoutput = layout;
                        }
                        if (k1 == l)
                        {
                            continue; /* Loop/switch isn't completed */
                        }
                        renderoutput1 = renderoutput;
                    }
                }
            }
            i++;
        }

        return renderoutput;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final com.google.wallet.proto.NanoWalletWobl.Layout getLayoutForListView(com.google.wallet.proto.NanoWalletWobl.RenderOutput renderoutput)
    {
        return getLayoutForEntrypoint(renderoutput, new String[] {
            Entrypoint.LIST.toString()
        });
    }

    public final com.google.wallet.proto.NanoWalletWobl.Layout getLayoutForPiece(com.google.wallet.proto.NanoWalletWobl.RenderOutput renderoutput, String s)
    {
        if (renderoutput != null) goto _L2; else goto _L1
_L1:
        com.google.wallet.proto.NanoWalletWobl.Layout layout = null;
_L4:
        return layout;
_L2:
        layout = null;
        int j = Protos.valueWithDefault(deviceContextParameters.woblVersion, 0);
        int k = Protos.valueWithDefault(deviceContextParameters.minimumDimension, 0);
        int l = Protos.valueWithDefault(deviceContextParameters.orientation, 0);
        com.google.wallet.proto.NanoWalletWobl.Layout alayout[] = renderoutput.layouts;
        int i1 = alayout.length;
        int i = 0;
        com.google.wallet.proto.NanoWalletWobl.RenderOutput renderoutput1;
        for (renderoutput = layout; i < i1; renderoutput = renderoutput1)
        {
            layout = alayout[i];
            com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters = layout.contextParameters;
            int j1 = Protos.valueWithDefault(layoutcontextparameters.woblVersion, 0);
            int l1 = Protos.valueWithDefault(layoutcontextparameters.minimumDimension, 0);
            renderoutput1 = renderoutput;
            if (layout.pieceName != null)
            {
                renderoutput1 = renderoutput;
                if (layout.pieceName.equals(s))
                {
                    renderoutput1 = renderoutput;
                    if (j1 <= j)
                    {
                        renderoutput1 = renderoutput;
                        if (l1 <= k)
                        {
                            int k1 = Protos.valueWithDefault(layoutcontextparameters.orientation, 0);
                            if (k1 == 0)
                            {
                                renderoutput = layout;
                            }
                            if (k1 == l)
                            {
                                continue; /* Loop/switch isn't completed */
                            }
                            renderoutput1 = renderoutput;
                        }
                    }
                }
            }
            i++;
        }

        return renderoutput;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        WOBS_ENTRY_POINT_NAMES = ImmutableList.of(Entrypoint.LIST.toString(), Entrypoint.EXPANDED.toString());
    }
}
