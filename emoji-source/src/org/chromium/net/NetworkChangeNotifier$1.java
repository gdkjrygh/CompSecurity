// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifier

class this._cls0
    implements oDetect.Observer
{

    final NetworkChangeNotifier this$0;

    public void onConnectionTypeChanged(int i)
    {
        NetworkChangeNotifier.access$000(NetworkChangeNotifier.this, i);
    }

    oDetect.Observer()
    {
        this$0 = NetworkChangeNotifier.this;
        super();
    }
}
