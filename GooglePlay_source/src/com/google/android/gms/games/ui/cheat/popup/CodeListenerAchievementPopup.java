// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.cheat.popup;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.games.ui.cheat.popup:
//            CodeListenerBasePopup

public final class CodeListenerAchievementPopup extends CodeListenerBasePopup
{

    private final Bundle mBundle;

    private CodeListenerAchievementPopup(Context context, CodeListenerPopupManager.CodeListenerPopupLocationInfo codelistenerpopuplocationinfo, Bundle bundle)
    {
        super(context, codelistenerpopuplocationinfo);
        mBundle = (Bundle)Preconditions.checkNotNull(bundle);
    }

    public static void show(Context context, CodeListenerPopupManager.CodeListenerPopupLocationInfo codelistenerpopuplocationinfo, Bundle bundle)
    {
        context = new CodeListenerAchievementPopup(context, codelistenerpopuplocationinfo, bundle);
        sHandler.sendMessage(sHandler.obtainMessage(0, context));
    }

    protected final void bindViewData()
    {
        Object obj = (TextView)mPopupView.findViewById(0x7f0d0142);
        ((TextView) (obj)).setSingleLine(false);
        ((TextView) (obj)).setMaxLines(2);
        ((TextView) (obj)).setText(mBundle.getString("com.google.android.gms.games.extra.name"));
        ((TextView)mPopupView.findViewById(0x7f0d0141)).setText(0x7f100096);
        obj = (ImageView)mPopupView.findViewById(0x7f0d0140);
        android.graphics.Bitmap bitmap = BitmapFactory.decodeResource(mContext.getResources(), 0x7f020196);
        ((ImageView) (obj)).setImageDrawable(new BitmapDrawable(mContext.getResources(), bitmap));
    }
}
