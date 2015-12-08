// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import ch;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            ButtonController, ButtonState

public abstract class AbstractButtonController extends AbstractComponent
    implements ButtonController
{

    private static final String d = com/brightcove/player/mediacontroller/buttons/AbstractButtonController.getSimpleName();
    protected final Map a = new HashMap();
    protected final List b = new ArrayList();
    protected final BaseVideoView c;
    private Button e;
    private final int f;
    private final Typeface g;

    public AbstractButtonController(Context context, BaseVideoView basevideoview, View view, int i, Typeface typeface)
    {
        super(basevideoview.getEventEmitter());
        c = basevideoview;
        f = i;
        g = typeface;
        e = (Button)view.findViewById(i);
        if (e != null)
        {
            e.setOnClickListener(new ch(this));
            if (typeface != null)
            {
                e.setTypeface(typeface);
            }
        }
    }

    public Button getButton()
    {
        return e;
    }

    public EventEmitter getEventEmitter()
    {
        return eventEmitter;
    }

    public Typeface getFont()
    {
        return g;
    }

    public int getId()
    {
        return f;
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
                e.getText()
            }));
        } else
        if (b.size() > 0)
        {
            String.format("Start of sync update: text = %s; description = %s.", new Object[] {
                e.getText(), e.getContentDescription()
            });
            ButtonState buttonstate = (ButtonState)b.get(i);
            e.setContentDescription(buttonstate.getContentDescription());
            android.graphics.drawable.Drawable drawable = buttonstate.getImage();
            if (drawable != null)
            {
                e.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
                e.setText("");
            } else
            {
                e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                e.setText(buttonstate.getText());
            }
            String.format("End of sync update: text = %s; description = %s.", new Object[] {
                e.getText(), e.getContentDescription()
            });
            return;
        }
    }

}
