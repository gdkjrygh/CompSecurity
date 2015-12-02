// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.base.database;

import android.net.Uri;
import android.provider.BaseColumns;

public class DatabaseConstants
{
    public static interface ClientSettingColumns
        extends BaseColumns
    {

        public static final String GMT_MODIFIED = "gmt_modified";
        public static final String NAME = "name";
        public static final String TYPE = "type";
        public static final String VALUE = "value";
        public static final String VERSION = "version";
    }

    public static interface MemberColumns
        extends BaseColumns
    {

        public static final String ADMIN_SEQ = "admin_seq";
        public static final String FULL_PORTRAIT_PATH = "full_portrait_path";
        public static final String IS_ADMIN = "is_admin";
        public static final String LOGIN_ID = "login_id";
        public static final String MEMBER_MODIFY_TIME = "member_modify_time";
        public static final String MEMBER_NAME = "member_name";
        public static final String MEMBER_SEQ = "member_seq";
        public static final String MEMBER_SEX = "member_sex";
    }

    public static interface MessageColumns
        extends BaseColumns
    {

        public static final String BUYER_SEQ = "buyer_seq";
        public static final String CONVERSATION_ID = "conversation_id";
        public static final String LAST_MSG_CONTENT = "last_msg_content";
        public static final String LAST_MSG_ID = "last_msg_id";
        public static final String LAST_MSG_IS_OWN = "last_msg_is_own";
        public static final String LAST_MSG_TIME = "last_msg_time";
        public static final String MSG_SOURCE = "msg_source";
        public static final String ORDER_ID = "order_id";
        public static final String OWNER_SEQ = "owner_seq";
        public static final String RELATION_ID = "relation_id";
        public static final String SELLER_ADMIN_SEQ = "seller_admin_seq";
        public static final String SELLER_NAME = "seller_name";
        public static final String SELLER_SEQ = "seller_seq";
        public static final String UNREAD_COUNT = "unread_count";
    }

    public static interface MessageDetailColumns
        extends BaseColumns
    {

        public static final String CONTENT = "content";
        public static final String CONVERSATION_ID = "conversation_id";
        public static final String HAVE_FILE = "have_file";
        public static final String IMAGE_FILE_PATH = "image_file_path";
        public static final String IMAGE_FS2_PATH = "image_fs2_path";
        public static final String IMAGE_LOCAL_PATH = "image_local_path";
        public static final String IS_FIRST_UNREAD = "is_first_unread";
        public static final String IS_READ = "is_read";
        public static final String LARGE_IMAGE = "large_image";
        public static final String MESSAGE_ID = "message_id";
        public static final String MESSAGE_TIME = "message_time";
        public static final String MESSAGE_TYPE = "message_type";
        public static final String MSG_SOURCE = "msg_source";
        public static final String ORDER_ID = "order_id";
        public static final String ORIGINAL_IMAGE = "original_image";
        public static final String PRODUCT_ID = "product_id";
        public static final String PRODUCT_IMAGE_URL = "product_image_url";
        public static final String PRODUCT_NAME = "product_name";
        public static final String RECEIVER_NAME = "receiver_name";
        public static final String RECEIVER_SEQ = "receiver_seq";
        public static final String RELATION_ID = "relation_id";
        public static final String SENDER_NAME = "sender_name";
        public static final String SENDER_SEQ = "sender_seq";
        public static final String SEND_STATUS = "send_status";
        public static final String SMALL_IMAGE = "small_image";
    }

    public static interface MsgColumns
        extends BaseColumns
    {

        public static final String BUYER_SEQ = "buyer_seq";
        public static final String CONTENT = "content";
        public static final String CONVERSATION_ID = "conversation_id";
        public static final String MSG_ID = "msg_id";
        public static final String ORDER_ID = "order_id";
        public static final String PRE_MSG_ID = "pre_msg_id";
        public static final String PRODUCT_ID = "product_id";
        public static final String PRODUCT_IMG = "product_img";
        public static final String PRODUCT_NAME = "product_name";
        public static final String SELLER_SEQ = "seller_seq";
        public static final String SEND_STATUS = "status";
        public static final String SEND_TIME = "send_time";
    }

    public static interface NotificationColumns
        extends BaseColumns
    {

        public static final String ADMIN_SEQ = "admin_seq";
        public static final String ARGS = "args";
        public static final String CLICKABLE = "clickable";
        public static final String DETAIL = "detail";
        public static final String FORMAT_DATE = "format_date";
        public static final String GMT_CREATEED = "gmt_created";
        public static final String PROMOTION_ID = "promotion_id";
        public static final String STATUS = "status";
        public static final String SUBJECT = "subject";
        public static final String TYPE = "type";
        public static final String URL = "url";
    }

    public static interface Tables
    {

        public static final String CLIENT_SETTING = "client_setting";
        public static final String MEMBER = "member";
        public static final String MESSAGE = "message";
        public static final String MESSAGE_DETAIL = "message_detail";
        public static final String MSG = "msg";
        public static final String NOTIFICATION = "notification";
    }


    public static final String DATABASE_NAME = "AliexpressHD.db";
    public static final int DATABASE_VERSION = 5;
    public static final Uri NOTIFICATION = Uri.parse("content://com.alibaba.aliexpresshd.provider.NotificationsProvider/notification");
    public static final Uri NOTIFICATION_BY_PAGE = Uri.parse("content://com.alibaba.aliexpresshd.provider.NotificationsProvider/notification/page");

    public DatabaseConstants()
    {
    }

}
