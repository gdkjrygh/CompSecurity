// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            Session, AccessToken, SessionState, Response

class 
    implements llback
{

    final Session this$0;

    public void onCompleted(Response response)
    {
        rmissionsPair rmissionspair = Session.handlePermissionResponse(response);
        if (rmissionspair != null)
        {
            synchronized (Session.access$200(Session.this))
            {
                Session.access$302(Session.this, AccessToken.createFromTokenWithRefreshedPermissions(Session.access$300(Session.this), rmissionspair.getGrantedPermissions(), rmissionspair.getDeclinedPermissions()));
                postStateChange(Session.access$400(Session.this), SessionState.OPENED_TOKEN_UPDATED, null);
            }
            return;
        } else
        {
            return;
        }
        exception;
        response;
        JVM INSTR monitorexit ;
        throw exception;
    }

    te()
    {
        this$0 = Session.this;
        super();
    }
}
