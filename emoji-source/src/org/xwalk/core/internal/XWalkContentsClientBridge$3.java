// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.net.Uri;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientBridge, XWalkViewInternal

class completed extends riCallback
{

    boolean completed;
    final XWalkContentsClientBridge this$0;
    final int val$modeFlags;
    final int val$processId;
    final int val$renderId;

    public void onReceiveValue(Uri uri)
    {
label0:
        {
            if (completed)
            {
                throw new IllegalStateException("Duplicate openFileChooser result");
            }
            if (uri == null && !syncCallFinished)
            {
                syncNullReceived = true;
                return;
            }
            completed = true;
            if (uri == null)
            {
                XWalkContentsClientBridge.access$500(XWalkContentsClientBridge.this, XWalkContentsClientBridge.access$200(XWalkContentsClientBridge.this), val$processId, val$renderId, val$modeFlags);
                return;
            }
            String s;
            Object obj;
            if ("file".equals(uri.getScheme()))
            {
                String s1 = uri.getSchemeSpecificPart();
                s = uri.getLastPathSegment();
                uri = s1;
            } else
            if ("content".equals(uri.getScheme()))
            {
                s = uri.toString();
                String s2 = resolveFileName(uri, XWalkContentsClientBridge.access$100(XWalkContentsClientBridge.this).getActivity().getContentResolver());
                uri = s;
                s = s2;
            } else
            {
                s = uri.getPath();
                String s3 = uri.getLastPathSegment();
                uri = s;
                s = s3;
            }
            if (s != null)
            {
                obj = s;
                if (!s.isEmpty())
                {
                    break label0;
                }
            }
            obj = uri;
        }
        XWalkContentsClientBridge.access$600(XWalkContentsClientBridge.this, XWalkContentsClientBridge.access$200(XWalkContentsClientBridge.this), val$processId, val$renderId, val$modeFlags, uri, ((String) (obj)));
    }

    public volatile void onReceiveValue(Object obj)
    {
        onReceiveValue((Uri)obj);
    }

    riCallback()
    {
        this$0 = final_xwalkcontentsclientbridge;
        val$processId = i;
        val$renderId = j;
        val$modeFlags = I.this;
        super(final_xwalkcontentsclientbridge);
        completed = false;
    }
}
