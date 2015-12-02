// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import com.facebook.fbservice.service.OperationType;

public class d
{

    public static final OperationType a = new OperationType("sync_contacts_partial");
    public static final OperationType b = new OperationType("create_contact_claim");
    public static final OperationType c = new OperationType("delete_contact_claim");
    public static final OperationType d = new OperationType("fetch_contact");
    public static final OperationType e = new OperationType("block_contact");
    public static final OperationType f = new OperationType("bulk_contacts_delete");
    public static final OperationType g = new OperationType("sync_favorite_contacts");
    public static final OperationType h = new OperationType("update_favorite_contacts");
    public static final OperationType i = new OperationType("check_phone_number");
    public static final OperationType j = new OperationType("add_user_to_rolodex");
    public static final OperationType k = new OperationType("sync_mobile_app_data");
    public static final OperationType l = new OperationType("fetch_voip_info");
    public static final OperationType m = new OperationType("contacts_upload");
    public static final OperationType n = new OperationType("contacts_invite_all");
    public static final OperationType o = new OperationType("sync_top_last_active");
    public static final OperationType p = new OperationType("sync_chat_context");

    public d()
    {
    }

}
