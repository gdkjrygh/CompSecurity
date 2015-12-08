// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import java.net.URISyntaxException;

// Referenced classes of package org.chromium.content.browser:
//            SelectActionModeCallback, ContentVideoViewClient

public class ContentViewClient
{

    private static final String TAG = "ContentViewClient";

    public ContentViewClient()
    {
    }

    public static boolean shouldPropagateKey(int i)
    {
        return i != 82 && i != 3 && i != 4 && i != 5 && i != 6 && i != 26 && i != 79 && i != 27 && i != 80 && i != 25 && i != 164 && i != 24;
    }

    public boolean doesPerformWebSearch()
    {
        return false;
    }

    public ContentVideoViewClient getContentVideoViewClient()
    {
        return null;
    }

    public android.view.ActionMode.Callback getSelectActionModeCallback(Context context, SelectActionModeCallback.ActionHandler actionhandler, boolean flag)
    {
        return new SelectActionModeCallback(context, actionhandler, flag);
    }

    public void onBackgroundColorChanged(int i)
    {
    }

    public void onContextualActionBarHidden()
    {
    }

    public void onContextualActionBarShown()
    {
    }

    public void onImeEvent()
    {
    }

    public void onImeStateChangeRequested(boolean flag)
    {
    }

    public void onOffsetsForFullscreenChanged(float f, float f1, float f2)
    {
    }

    public void onSelectionChanged(String s)
    {
    }

    public void onSelectionEvent(int i)
    {
    }

    public void onSelectionEvent(int i, float f, float f1)
    {
        onSelectionEvent(i);
    }

    public void onStartContentIntent(Context context, String s)
    {
        Intent intent;
        try
        {
            intent = Intent.parseUri(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("ContentViewClient", (new StringBuilder()).append("Bad URI ").append(s).append(": ").append(context.getMessage()).toString());
            return;
        }
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("ContentViewClient", (new StringBuilder()).append("No application can handle ").append(s).toString());
        }
    }

    public void onUpdateTitle(String s)
    {
    }

    public void performWebSearch(String s)
    {
    }

    public boolean shouldBlockMediaRequest(String s)
    {
        return false;
    }

    public boolean shouldOverrideKeyEvent(KeyEvent keyevent)
    {
        for (int i = keyevent.getKeyCode(); !shouldPropagateKey(i) || keyevent.isCtrlPressed() && (i == 61 || i == 51 || i == 134);)
        {
            return true;
        }

        return false;
    }
}
