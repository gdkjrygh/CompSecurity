// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;
import com.google.android.libraries.translate.e.o;

public final class v
    implements android.view.View.OnLongClickListener
{

    public v()
    {
    }

    public final boolean onLongClick(View view)
    {
        CharSequence charsequence = view.getContentDescription();
        if (TextUtils.isEmpty(charsequence))
        {
            return false;
        }
        int ai[] = new int[2];
        Rect rect = new Rect();
        view.getLocationOnScreen(ai);
        view.getWindowVisibleDisplayFrame(rect);
        Context context = view.getContext();
        int j = view.getWidth();
        int k = view.getHeight();
        int i = ai[1];
        int i1 = k / 2;
        int l = context.getResources().getDisplayMetrics().widthPixels;
        view = Toast.makeText(context, charsequence, 0);
        if (i + i1 < rect.height())
        {
            byte byte0;
            if (o.d())
            {
                byte0 = 3;
            } else
            {
                byte0 = 5;
            }
            view.setGravity(byte0 | 0x30, l - ai[0] - j / 2, k);
        } else
        {
            view.setGravity(81, 0, k);
        }
        view.show();
        return true;
    }
}
