// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import com.facebook.fbservice.service.OperationType;

public class aq
{

    public static final OperationType A = new OperationType("get_device_location");
    public static final OperationType B = new OperationType("image_search");
    public static final OperationType C = new OperationType("ping_ack");
    public static final OperationType D = new OperationType("request_sms_confirmation_code");
    public static final OperationType E = new OperationType("update_user_settings");
    public static final OperationType F = new OperationType("push_trace_confirmation");
    public static final OperationType G = new OperationType("verify_phone_number");
    public static final OperationType H = new OperationType("verify_phone_number_manual");
    public static final OperationType I = new OperationType("fetch_sticker_packs");
    public static final OperationType J = new OperationType("add_sticker_pack");
    public static final OperationType K = new OperationType("update_recent_stickers");
    public static final OperationType L = new OperationType("photo_upload");
    public static final OperationType a = new OperationType("get_wildfire_gks");
    public static final OperationType b = new OperationType("verify_reg_data");
    public static final OperationType c = new OperationType("register_partial_acct");
    public static final OperationType d = new OperationType("user_lookup");
    public static final OperationType e = new OperationType("create_thread");
    public static final OperationType f = new OperationType("broadcast_message");
    public static final OperationType g = new OperationType("delete_thread");
    public static final OperationType h = new OperationType("delete_messages");
    public static final OperationType i = new OperationType("fetch_thread_list");
    public static final OperationType j = new OperationType("fetch_more_threads");
    public static final OperationType k = new OperationType("fetch_thread");
    public static final OperationType l = new OperationType("fetch_multiple_threads");
    public static final OperationType m = new OperationType("fetch_group_threads");
    public static final OperationType n = new OperationType("add_members");
    public static final OperationType o = new OperationType("remove_member");
    public static final OperationType p = new OperationType("mark_thread");
    public static final OperationType q = new OperationType("read_receipt");
    public static final OperationType r = new OperationType("delivered_receipt");
    public static final OperationType s = new OperationType("mark_folder_seen");
    public static final OperationType t = new OperationType("save_draft");
    public static final OperationType u = new OperationType("fetch_more_messages");
    public static final OperationType v = new OperationType("modify_thread");
    public static final OperationType w = new OperationType("send");
    public static final OperationType x = new OperationType("queue_message");
    public static final OperationType y = new OperationType("pushed_message");
    public static final OperationType z = new OperationType("webrtc_send");

    public aq()
    {
    }

}
