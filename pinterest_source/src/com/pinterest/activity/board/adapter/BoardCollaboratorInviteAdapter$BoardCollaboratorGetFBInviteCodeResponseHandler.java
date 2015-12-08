// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class _userId extends ApiResponseHandler
{

    private String _userId;
    final BoardCollaboratorInviteAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(apiresponse.getMessage());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        try
        {
            Object obj = (PinterestJsonObject)apiresponse.getData();
            apiresponse = ((PinterestJsonObject) (obj)).a("url", "");
            obj = ((PinterestJsonObject) (obj)).a("invite_code", "");
            BoardCollaboratorInviteAdapter.access$1300(BoardCollaboratorInviteAdapter.this);
            BoardCollaboratorInviteAdapter.access$1400(BoardCollaboratorInviteAdapter.this, apiresponse, ((String) (obj)), _userId);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponse apiresponse)
        {
            CrashReporting.a(apiresponse);
        }
    }

    public y(String s)
    {
        this$0 = BoardCollaboratorInviteAdapter.this;
        super();
        _userId = s;
    }
}
