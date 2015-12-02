// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class wq
{

    public static final String a = String.format("select *,(case when unread_count>0 then 1 else 0 end) as un_count from message where %s = ? and %s = ? and %s=? order by un_count desc, %s desc limit ? offset ?", new Object[] {
        "owner_seq", "buyer_seq", "msg_source", "last_msg_time"
    });
    public static final String b = String.format("select count(*) as %s from message where %s = ? and %s = ? and %s=?", new Object[] {
        "msg_count", "owner_seq", "buyer_seq", "msg_source"
    });
    public static final String c = String.format("select count(*) as %s from message_detail where %s = ? and %s = ?", new Object[] {
        "msg_detail_count", "relation_id", "msg_source"
    });
    public static final String d = String.format("select * from message_detail where %s = ?  and %s = ? order by %s desc limit ? offset ?", new Object[] {
        "relation_id", "msg_source", "message_time"
    });
    public static final String e = String.format("%s = ? and %s = ?", new Object[] {
        "owner_seq", "relation_id"
    });
    public static final String f = String.format("%s = ?", new Object[] {
        "relation_id"
    });
    public static final String g = String.format("select * from message where %s = ? and %s=? and %s=?", new Object[] {
        "owner_seq", "seller_seq", "relation_id"
    });
    public static final String h = String.format("%s = ? and %s = ? and %s = ?", new Object[] {
        "owner_seq", "seller_seq", "relation_id"
    });
    public static final String i = String.format("select * from message_detail where %s=? and %s=?", new Object[] {
        "relation_id", "message_id"
    });
    public static final String j = String.format("%s=? and %s=?", new Object[] {
        "relation_id", "message_id"
    });
    public static final String k = String.format("select * from member where %s = ?", new Object[] {
        "member_seq"
    });
    public static final String l = String.format("%s = ?", new Object[] {
        "member_seq"
    });

}
