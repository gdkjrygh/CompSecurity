// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.google.android.gms.maps.model.CameraPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

public class mListeners
    implements com.google.android.gms.maps.raChangedListener
{

    List mListeners;
    final MapFragment this$0;

    public void addListener(com.google.android.gms.maps.raChangedListener rachangedlistener)
    {
        mListeners.add(rachangedlistener);
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((com.google.android.gms.maps.raChangedListener.mListeners)iterator.next()).raChange(cameraposition)) { }
    }

    public ()
    {
        this$0 = MapFragment.this;
        super();
        mListeners = new ArrayList();
    }
}
