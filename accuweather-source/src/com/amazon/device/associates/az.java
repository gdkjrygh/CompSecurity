// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.prompt.SimplePrompt;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.amazon.device.associates:
//            x

final class az extends SimplePrompt
{

    private static final String a = com/amazon/device/associates/az.getSimpleName();
    private static final Set b;
    private ContextManager c;
    private final PromptContent d;

    az(PromptContent promptcontent)
    {
        super(promptcontent);
        d = promptcontent;
    }

    protected void doAction()
    {
        x.b(a, "doAction");
        if (!"Amazon Appstore required".equalsIgnoreCase(d.getTitle()) && !b.contains(d.getTitle()))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Activity activity;
        Activity activity1;
        try
        {
            activity1 = c.getVisible();
        }
        catch (Exception exception)
        {
            x.b(a, (new StringBuilder()).append("Exception in PurchaseItemCommandTask.OnSuccess: ").append(exception).toString());
            return;
        }
        activity = activity1;
        if (activity1 != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        activity = c.getRoot();
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl")));
    }

    protected long getExpirationDurationInSeconds()
    {
        return 0x1e13380L;
    }

    public String toString()
    {
        return a;
    }

    static 
    {
        b = new HashSet();
        b.add("Amazon Appstore Update Required");
        b.add("Aktualisierung von Amazon App-Shop erforderlich");
        b.add("Es necesario actualizar Tienda Apps de Amazon");
        b.add("Mise \340 jour requise pour Amazon Appstore");
        b.add("La mise \340 jour de Amazon App-Shop est requise");
        b.add("Amazon App-Shop Aggiornamento necessario");
        b.add("Amazon \u30A2\u30D7\u30EA\u30B9\u30C8\u30A2 \u66F4\u65B0\u304C\u5FC5\u8981\u3067\u3059");
        b.add("Atualiza\347\343o da Loja de Apps da Amazon necess\341ria");
        b.add("\u5DF2\u8BF7\u6C42 \u4E9A\u9A6C\u900A\u5E94\u7528\u5546\u5E97 \u66F4\u65B0");
    }
}
