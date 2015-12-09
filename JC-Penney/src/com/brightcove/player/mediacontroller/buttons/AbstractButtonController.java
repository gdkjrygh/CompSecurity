// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            ButtonController, a, ButtonState

public abstract class AbstractButtonController extends AbstractComponent
    implements ButtonController
{

    private static final String d = com/brightcove/player/mediacontroller/buttons/AbstractButtonController.getSimpleName();
    protected final Map a = new HashMap();
    protected final List b = new ArrayList();
    protected final BaseVideoView c;
    private final Context e;
    private Button f;
    private final int g;

    public AbstractButtonController(Context context, BaseVideoView basevideoview, View view, int i, Typeface typeface)
    {
        super(basevideoview.getEventEmitter());
        e = context;
        c = basevideoview;
        g = i;
        f = (Button)view.findViewById(i);
        if (f != null)
        {
            f.setOnClickListener(new a(this));
            if (typeface != null)
            {
                f.setTypeface(typeface);
            }
        }
    }

    public Button getButton()
    {
        return f;
    }

    public EventEmitter getEventEmitter()
    {
        return F;
    }

    public int getId()
    {
        return g;
    }

    public Map getProperties()
    {
        return a;
    }

    public List getStateList()
    {
        return b;
    }

    public int getVisibilityState()
    {
        return 0;
    }

    public void syncStates()
    {
        int i = getManagedState();
        if (b.size() < i)
        {
            Log.wtf(d, String.format("There is no, or insufficient, state information for the button with text: %s.", new Object[] {
                f.getText()
            }));
        } else
        if (b.size() > 0)
        {
            Log.v(d, String.format("Start of sync update: text = %s; description = %s.", new Object[] {
                f.getText(), f.getContentDescription()
            }));
            ButtonState buttonstate = (ButtonState)b.get(i);
            f.setContentDescription(buttonstate.getContentDescription());
            f.setText(buttonstate.getText());
            Log.v(d, String.format("End of sync update: text = %s; description = %s.", new Object[] {
                f.getText(), f.getContentDescription()
            }));
            return;
        }
    }

}
