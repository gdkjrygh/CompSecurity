// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.wobl.view.EllipsizingTextView;
import com.google.wallet.wobl.intermediaterepresentation.DateIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.renderer.android.AndroidRenderer;
import com.google.wallet.wobl.renderer.android.AndroidTextTagRenderer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl:
//            DateTagRenderer

public final class EllipsizingTextTagRenderer extends AndroidTextTagRenderer
{

    DateTagRenderer dateTagRenderer;

    public EllipsizingTextTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
        dateTagRenderer = new DateTagRenderer(androidrenderer.getContext());
    }

    public final volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((TextView)view, (TextIr)intermediaterepresentation);
    }

    public final void applyIrToView(TextView textview, TextIr textir)
    {
        Iterator iterator = textir.getChildComponents().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TextIr textir1 = (TextIr)iterator.next();
            if (textir1 instanceof DateIr)
            {
                dateTagRenderer.render((DateIr)textir1);
            }
        } while (true);
        super.applyIrToView(textview, textir);
        if (!textir.getTapUris().isEmpty())
        {
            Views.setLinkContentDescription(textview);
        }
    }

    public final volatile View getViewInstance()
    {
        return getViewInstance();
    }

    public final TextView getViewInstance()
    {
        return new EllipsizingTextView(getContext());
    }
}
