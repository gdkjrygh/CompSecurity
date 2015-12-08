// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.brightcove.player.event.EventEmitter;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            ButtonController, ButtonState

class a
    implements android.view.View.OnClickListener
{

    private static final String a = com/brightcove/player/mediacontroller/buttons/a.getSimpleName();
    private ButtonController b;

    a(ButtonController buttoncontroller)
    {
        b = buttoncontroller;
    }

    private void a(int i, int j, String s)
    {
        if (b.getManagedState() == j)
        {
            Log.v(a, String.format("Emitting event: %s", new Object[] {
                s
            }));
            java.util.Map map = b.getProperties();
            b.getEventEmitter().emit(s, map);
            return;
        } else
        {
            Log.wtf(a, "The button glyph and video view states are out of sync!  A re-sync will be attempted.");
            b.syncStates();
            return;
        }
    }

    private void a(int i, ButtonState buttonstate, int j, View view)
    {
        Log.d(a, "processButtonState...");
        int k = b.getManagedState();
        if (k == j)
        {
            String s = buttonstate.getEventType();
            if (s != null)
            {
                a(i, k, s);
                return;
            }
            buttonstate = buttonstate.getHandler();
            if (buttonstate != null)
            {
                buttonstate.onClick(view);
                return;
            } else
            {
                Log.wtf(a, String.format("No handler to invoke or event type to emit for button with id: %d.", new Object[] {
                    Integer.valueOf(i)
                }));
                return;
            }
        } else
        {
            Log.w(a, String.format("The managed state (%d) is out of sync with the button state for the button with id: %d.", new Object[] {
                Integer.valueOf(k), Integer.valueOf(i)
            }));
            b.syncStates();
            return;
        }
    }

    public void onClick(View view)
    {
        Log.d(a, "Processing a media controls button click...");
        if (!(view instanceof Button)) goto _L2; else goto _L1
_L1:
        Button button;
        int j;
        b.getEventEmitter().emit("showMediaControls");
        button = (Button)view;
        j = b.getId();
        if (j == -1) goto _L2; else goto _L3
_L3:
        Iterator iterator;
        int i;
        iterator = b.getStateList().iterator();
        i = 0;
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L4
_L4:
        ButtonState buttonstate = (ButtonState)iterator.next();
        if (!buttonstate.getText().equals(button.getText())) goto _L6; else goto _L5
_L5:
        a(j, buttonstate, i, view);
_L2:
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
