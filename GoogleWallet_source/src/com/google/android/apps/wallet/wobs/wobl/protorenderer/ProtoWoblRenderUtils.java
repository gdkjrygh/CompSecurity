// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Function;
import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.renderer.android.AndroidRenderUtils;
import java.net.URI;

final class ProtoWoblRenderUtils
{

    static final Function TO_DISPLAY_UNIT = new Function() {

        private static DisplayUnit apply(com.google.wallet.proto.NanoCompiledWobl.Length length)
        {
            return ProtoWoblRenderUtils.toDisplayUnit(length);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((com.google.wallet.proto.NanoCompiledWobl.Length)obj);
        }

    };
    static final Function TO_URI = new Function() {

        private static URI apply(com.google.wallet.proto.NanoCompiledWobl.TapUri tapuri)
        {
            return URI.create(tapuri.tapUri);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((com.google.wallet.proto.NanoCompiledWobl.TapUri)obj);
        }

    };

    static int toAndroidColor(com.google.wallet.proto.NanoCompiledWobl.Color color)
    {
        return Color.rgb(color.red.intValue(), color.green.intValue(), color.blue.intValue());
    }

    static com.google.wallet.wobl.renderer.android.views.ColumnLayout.LayoutParams toColumnLayoutParams(com.google.wallet.proto.NanoCompiledWobl.ColumnLayoutAttributes columnlayoutattributes)
    {
        return new com.google.wallet.wobl.renderer.android.views.ColumnLayout.LayoutParams(Protos.valueWithDefault(columnlayoutattributes.column, 0), Protos.valueWithDefault(columnlayoutattributes.row, 0), Protos.valueWithDefault(columnlayoutattributes.columnSpan, 1), Protos.valueWithDefault(columnlayoutattributes.rowSpan, 1));
    }

    static DisplayUnit toDisplayUnit(com.google.wallet.proto.NanoCompiledWobl.Length length)
    {
        if (length.weight != null)
        {
            return DisplayUnit.of(length.weight.floatValue(), com.google.wallet.wobl.common.DisplayUnit.Unit.WEIGHT);
        }
        if (length.sps != null)
        {
            return DisplayUnit.of(length.sps.floatValue(), com.google.wallet.wobl.common.DisplayUnit.Unit.SP);
        }
        if (length.dps != null)
        {
            return DisplayUnit.of(length.dps.floatValue(), com.google.wallet.wobl.common.DisplayUnit.Unit.DP);
        }
        if (length.inches != null)
        {
            return DisplayUnit.of(length.inches.floatValue(), com.google.wallet.wobl.common.DisplayUnit.Unit.IN);
        }
        if (length.points != null)
        {
            return DisplayUnit.of(length.points.floatValue(), com.google.wallet.wobl.common.DisplayUnit.Unit.PT);
        }
        if (length.millimeters != null)
        {
            return DisplayUnit.of(length.millimeters.floatValue(), com.google.wallet.wobl.common.DisplayUnit.Unit.MM);
        } else
        {
            throw new IllegalArgumentException("Unrecognized length unit");
        }
    }

    static int toGravity(Integer integer, Integer integer1)
    {
        int i;
        boolean flag;
        flag = false;
        i = ((flag) ? 1 : 0);
        if (integer == null) goto _L2; else goto _L1
_L1:
        integer.intValue();
        JVM INSTR tableswitch 1 5: default 48
    //                   1 86
    //                   2 92
    //                   3 97
    //                   4 86
    //                   5 97;
           goto _L3 _L4 _L5 _L6 _L4 _L6
_L3:
        i = ((flag) ? 1 : 0);
_L2:
        if (integer1 == null) goto _L8; else goto _L7
_L7:
        integer1.intValue();
        JVM INSTR tableswitch 1 3: default 84
    //                   1 103
    //                   2 108
    //                   3 113;
           goto _L8 _L9 _L10 _L11
_L8:
        return i;
_L4:
        i = 0x800003;
          goto _L2
_L5:
        i = 1;
          goto _L2
_L6:
        i = 0x800005;
          goto _L2
_L9:
        return i | 0x30;
_L10:
        return i | 0x10;
_L11:
        return i | 0x50;
    }

    static int[] toIntArray(Context context, com.google.wallet.proto.NanoCompiledWobl.WidgetAttributes.Padding padding)
    {
        return (new int[] {
            toPx(context, padding.left), toPx(context, padding.top), toPx(context, padding.right), toPx(context, padding.bottom)
        });
    }

    static int toPx(Context context, com.google.wallet.proto.NanoCompiledWobl.Length length)
    {
        if (length == null)
        {
            return 0;
        } else
        {
            return AndroidRenderUtils.displayUnitToPx(toDisplayUnit(length), context);
        }
    }

}
