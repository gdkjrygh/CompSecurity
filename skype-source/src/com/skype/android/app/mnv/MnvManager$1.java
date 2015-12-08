// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager, MnvStateData

final class this._cls0
    implements Runnable
{

    final MnvManager this$0;

    public final void run()
    {
        try
        {
            MnvStateData mnvstatedata = getStateDataChange().getStateData();
            ates ates = request(ates.HTTP_DISCONNECT);
            if (mnvstatedata.getCurrentState() == ates.NOT_INITIALIZED)
            {
                ates = ates.ADD_FRIENDS;
            }
            mnvstatedata.setNextState(ates);
            mnvstatedata.setErrorState(esErrors.ErrorState.TIMEOUT_EXCEPTION);
            MnvManager.access$102(MnvManager.this, new <init>(mnvstatedata, a.ASYNC));
            MnvManager.access$200(MnvManager.this);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    a()
    {
        this$0 = MnvManager.this;
        super();
    }
}
