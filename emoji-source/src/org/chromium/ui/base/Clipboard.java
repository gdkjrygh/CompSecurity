// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import org.chromium.base.ApiCompatibilityUtils;

public class Clipboard
{

    private final ClipboardManager mClipboardManager;
    private final Context mContext;

    public Clipboard(Context context)
    {
        mContext = context;
        mClipboardManager = (ClipboardManager)context.getSystemService("clipboard");
    }

    private static Clipboard create(Context context)
    {
        return new Clipboard(context);
    }

    private String getCoercedText()
    {
        Object obj = mClipboardManager.getPrimaryClip();
        if (obj != null && ((ClipData) (obj)).getItemCount() > 0)
        {
            obj = ((ClipData) (obj)).getItemAt(0).coerceToText(mContext);
            if (obj != null)
            {
                return ((CharSequence) (obj)).toString();
            }
        }
        return null;
    }

    private String getHTMLText()
    {
        if (isHTMLClipboardSupported())
        {
            ClipData clipdata = mClipboardManager.getPrimaryClip();
            if (clipdata != null && clipdata.getItemCount() > 0)
            {
                return clipdata.getItemAt(0).getHtmlText();
            }
        }
        return null;
    }

    private static boolean isHTMLClipboardSupported()
    {
        return ApiCompatibilityUtils.isHTMLClipboardSupported();
    }

    private void setPrimaryClipNoException(ClipData clipdata)
    {
        try
        {
            mClipboardManager.setPrimaryClip(clipdata);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ClipData clipdata)
        {
            clipdata = mContext.getString(org.chromium.ui.R.string.copy_to_clipboard_failure_message);
        }
        Toast.makeText(mContext, clipdata, 0).show();
    }

    public void setHTMLText(String s, String s1)
    {
        setHTMLText(s, null, s1);
    }

    public void setHTMLText(String s, String s1, String s2)
    {
        if (isHTMLClipboardSupported())
        {
            setPrimaryClipNoException(ClipData.newHtmlText(s1, s2, s));
        }
    }

    public void setText(String s)
    {
        setText(null, s);
    }

    public void setText(String s, String s1)
    {
        setPrimaryClipNoException(ClipData.newPlainText(s, s1));
    }
}
