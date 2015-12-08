// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.view.WindowManager;
import com.google.android.apps.translate.copydrop.views.PopoverView;

// Referenced classes of package com.google.android.apps.translate.copydrop:
//            TranslateCopyDropService

final class b
    implements android.content.ClipboardManager.OnPrimaryClipChangedListener
{

    final TranslateCopyDropService a;

    b(TranslateCopyDropService translatecopydropservice)
    {
        a = translatecopydropservice;
        super();
    }

    public final void onPrimaryClipChanged()
    {
        Object obj;
label0:
        {
            obj = TranslateCopyDropService.d(a).getPrimaryClipDescription();
            String s = String.valueOf(obj);
            (new StringBuilder(String.valueOf(s).length() + 17)).append("clipDescription: ").append(s);
            if (obj != null && (((ClipDescription) (obj)).getLabel() == null || !((ClipDescription) (obj)).getLabel().equals(TranslateCopyDropService.b())) && (((ClipDescription) (obj)).hasMimeType("text/plain") || ((ClipDescription) (obj)).hasMimeType("text/html")))
            {
                obj = TranslateCopyDropService.d(a).getPrimaryClip().getItemAt(0).getText().toString().trim();
                if (TranslateCopyDropService.e(a) == null || !TranslateCopyDropService.e(a).equals(obj))
                {
                    break label0;
                }
            }
            return;
        }
        TranslateCopyDropService.c(a).updateViewLayout(TranslateCopyDropService.f(a), TranslateCopyDropService.g(a));
        TranslateCopyDropService.f(a).setTextToBeTranslated(((String) (obj)));
        PopoverView popoverview = TranslateCopyDropService.f(a);
        popoverview.a();
        popoverview.setVisibility(0);
        TranslateCopyDropService.a(a, ((String) (obj)));
        TranslateCopyDropService.h(a);
    }
}
