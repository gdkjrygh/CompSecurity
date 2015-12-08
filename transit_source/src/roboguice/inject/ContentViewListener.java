// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Activity;
import android.content.Context;
import roboguice.activity.event.OnCreateEvent;

// Referenced classes of package roboguice.inject:
//            ContentView

public class ContentViewListener
{

    protected Activity activity;

    public ContentViewListener()
    {
    }

    public void optionallySetContentView(OnCreateEvent oncreateevent)
    {
        oncreateevent = activity.getClass();
        do
        {
label0:
            {
                if (oncreateevent != android/content/Context)
                {
                    ContentView contentview = (ContentView)oncreateevent.getAnnotation(roboguice/inject/ContentView);
                    if (contentview == null)
                    {
                        break label0;
                    }
                    activity.setContentView(contentview.value());
                }
                return;
            }
            oncreateevent = oncreateevent.getSuperclass();
        } while (true);
    }
}
