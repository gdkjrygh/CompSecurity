// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.widget.FacebookDialog;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public abstract class arw
{

    public Activity a;
    public final String b;
    public final com.facebook.widget.FacebookDialog.PendingCall c = new com.facebook.widget.FacebookDialog.PendingCall();
    protected HashMap d;
    protected HashMap e;

    public arw(Activity activity)
    {
        d = new HashMap();
        e = new HashMap();
        ars.a(activity, "activity");
        a = activity;
        b = arp.a(activity);
    }

    public abstract EnumSet a();

    public abstract Bundle b();

    // Unreferenced inner class arw$1

/* anonymous class */
    public final class _cls1
        implements arz
    {

        private arw a;

        public final void a(Context context)
        {
            if (a.d != null && a.d.size() > 0)
            {
                FacebookDialog.b();
                java.util.UUID uuid = a.c.a;
                HashMap hashmap = a.d;
                ars.a(context, "context");
                ars.a(uuid, "callId");
                ars.a(hashmap.values(), "imageAttachments");
                ars.b(hashmap.keySet(), "imageAttachments");
                aoj.a(context, uuid, hashmap, new aoj._cls1());
            }
            if (a.e != null && a.e.size() > 0)
            {
                FacebookDialog.b();
                java.util.UUID uuid1 = a.c.a;
                HashMap hashmap1 = a.e;
                ars.a(context, "context");
                ars.a(uuid1, "callId");
                ars.a(hashmap1.values(), "imageAttachmentFiles");
                ars.b(hashmap1.keySet(), "imageAttachmentFiles");
                aoj.a(context, uuid1, hashmap1, new aoj._cls2());
            }
        }

            public 
            {
                a = arw.this;
                super();
            }
    }

}
