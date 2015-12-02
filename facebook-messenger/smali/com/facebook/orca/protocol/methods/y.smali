.class public Lcom/facebook/orca/protocol/methods/y;
.super Ljava/lang/Object;
.source "OrcaGateKeeperSetProvider.java"

# interfaces
.implements Lcom/facebook/f/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 13
    const-string v0, "messaging"

    const-string v1, "messenger_mqtt_android"

    const-string v2, "messenger_pref_show_sms_notif_android"

    const-string v3, "messenger_pref_show_sms_enable_android"

    const-string v4, "messenger_phone_verification_android"

    const-string v5, "messenger_client_analytics_android"

    const/16 v6, 0x42

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    const-string v8, "messenger_client_core_analytics_android"

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-string v8, "messenger_contact_events_upload_android"

    aput-object v8, v6, v7

    const/4 v7, 0x2

    const-string v8, "messenger_contacts_upload_android"

    aput-object v8, v6, v7

    const/4 v7, 0x3

    const-string v8, "contacts_upload_divebar_nux_android"

    aput-object v8, v6, v7

    const/4 v7, 0x4

    const-string v8, "messenger_contacts_invite_all_android"

    aput-object v8, v6, v7

    const/4 v7, 0x5

    const-string v8, "messenger_internal_prefs_android"

    aput-object v8, v6, v7

    const/4 v7, 0x6

    const-string v8, "messenger_nux_android"

    aput-object v8, v6, v7

    const/4 v7, 0x7

    const-string v8, "messenger_incall_android"

    aput-object v8, v6, v7

    const/16 v7, 0x8

    const-string v8, "messenger_client_sms_android"

    aput-object v8, v6, v7

    const/16 v7, 0x9

    const-string v8, "messenger_sms_read_android"

    aput-object v8, v6, v7

    const/16 v7, 0xa

    const-string v8, "messenger_sms_receive_android"

    aput-object v8, v6, v7

    const/16 v7, 0xb

    const-string v8, "messenger_sms_send_android"

    aput-object v8, v6, v7

    const/16 v7, 0xc

    const-string v8, "messenger_mms_read_android"

    aput-object v8, v6, v7

    const/16 v7, 0xd

    const-string v8, "messenger_mms_receive_android"

    aput-object v8, v6, v7

    const/16 v7, 0xe

    const-string v8, "messenger_mms_send_android"

    aput-object v8, v6, v7

    const/16 v7, 0xf

    const-string v8, "messenger_divebar_more_mobile_friends_android"

    aput-object v8, v6, v7

    const/16 v7, 0x10

    const-string v8, "messenger_divebar_more_mobile_friends_2_android"

    aput-object v8, v6, v7

    const/16 v7, 0x11

    const-string v8, "messenger_divebar_show_groups_android"

    aput-object v8, v6, v7

    const/16 v7, 0x12

    const-string v8, "messenger_merge_threads_android"

    aput-object v8, v6, v7

    const/16 v7, 0x13

    const-string v8, "messenger_has_contacts_list_android"

    aput-object v8, v6, v7

    const/16 v7, 0x14

    const-string v8, "messenger_auth_expire_session_android"

    aput-object v8, v6, v7

    const/16 v7, 0x15

    const-string v8, "messenger_switch_user_text_android"

    aput-object v8, v6, v7

    const/16 v7, 0x16

    const-string v8, "messenger_logout_notify_android"

    aput-object v8, v6, v7

    const/16 v7, 0x17

    const-string v8, "messenger_audio_player_android"

    aput-object v8, v6, v7

    const/16 v7, 0x18

    const-string v8, "messenger_audio_recorder_android"

    aput-object v8, v6, v7

    const/16 v7, 0x19

    const-string v8, "messenger_emoji_composer_android"

    aput-object v8, v6, v7

    const/16 v7, 0x1a

    const-string v8, "messenger_tester_logging_android"

    aput-object v8, v6, v7

    const/16 v7, 0x1b

    const-string v8, "android_persistent_mqtt_service"

    aput-object v8, v6, v7

    const/16 v7, 0x1c

    const-string v8, "messenger_android_device_push_persistence"

    aput-object v8, v6, v7

    const/16 v7, 0x1d

    const-string v8, "messenger_zero_rating"

    aput-object v8, v6, v7

    const/16 v7, 0x1e

    const-string v8, "messenger_chat_heads_android"

    aput-object v8, v6, v7

    const/16 v7, 0x1f

    const-string v8, "messenger_vvm_enable_sms_reporting"

    aput-object v8, v6, v7

    const/16 v7, 0x20

    const-string v8, "messenger_vvm_enable_sms_detailed_reporting"

    aput-object v8, v6, v7

    const/16 v7, 0x21

    const-string v8, "messenger_user_presence_active_android"

    aput-object v8, v6, v7

    const/16 v7, 0x22

    const-string v8, "messenger_threadlist_user_presence_active_android"

    aput-object v8, v6, v7

    const/16 v7, 0x23

    const-string v8, "messenger_threadlist_show_mobile_presence_android"

    aput-object v8, v6, v7

    const/16 v7, 0x24

    const-string v8, "messenger_threadview_show_divebar_button_android"

    aput-object v8, v6, v7

    const/16 v7, 0x25

    const-string v8, "messenger_bug_reporter_android"

    aput-object v8, v6, v7

    const/16 v7, 0x26

    const-string v8, "messenger_voip_android"

    aput-object v8, v6, v7

    const/16 v7, 0x27

    const-string v8, "fb4a_voip_android"

    aput-object v8, v6, v7

    const/16 v7, 0x28

    const-string v8, "messenger_voip_p2p_disabled"

    aput-object v8, v6, v7

    const/16 v7, 0x29

    const-string v8, "messenger_partial_upgrade_android"

    aput-object v8, v6, v7

    const/16 v7, 0x2a

    const-string v8, "messenger_invite_by_phone_android"

    aput-object v8, v6, v7

    const/16 v7, 0x2b

    const-string v8, "messenger_sms_force_android"

    aput-object v8, v6, v7

    const/16 v7, 0x2c

    const-string v8, "show_groups_section_in_divebar"

    aput-object v8, v6, v7

    const/16 v7, 0x2d

    const-string v8, "voip_show_free_call_disclaimer"

    aput-object v8, v6, v7

    const/16 v7, 0x2e

    const-string v8, "voip_wifi_calling_only"

    aput-object v8, v6, v7

    const/16 v7, 0x2f

    const-string v8, "voip_send_ice_after_answer"

    aput-object v8, v6, v7

    const/16 v7, 0x30

    const-string v8, "messenger_sms_nux_send_cliff_android"

    aput-object v8, v6, v7

    const/16 v7, 0x31

    const-string v8, "messenger_new_message_show_suggestions_android"

    aput-object v8, v6, v7

    const/16 v7, 0x32

    const-string v8, "messenger_show_presence_info_in_contact_picker"

    aput-object v8, v6, v7

    const/16 v7, 0x33

    const-string v8, "messenger_send_retry_graph_android"

    aput-object v8, v6, v7

    const/16 v7, 0x34

    const-string v8, "messenger_send_retry_mqtt_android"

    aput-object v8, v6, v7

    const/16 v7, 0x35

    const-string v8, "messenger_empty_compose_like_android"

    aput-object v8, v6, v7

    const/16 v7, 0x36

    const-string v8, "messenger_stickers_android"

    aput-object v8, v6, v7

    const/16 v7, 0x37

    const-string v8, "messages_divebar_chat_context"

    aput-object v8, v6, v7

    const/16 v7, 0x38

    const-string v8, "messenger_broadcast_android"

    aput-object v8, v6, v7

    const/16 v7, 0x39

    const-string v8, "show_third_button_in_thread_list_android"

    aput-object v8, v6, v7

    const/16 v7, 0x3a

    const-string v8, "fbandroid_install_messenger_chat_head_promo"

    aput-object v8, v6, v7

    const/16 v7, 0x3b

    const-string v8, "android_text_only_presence"

    aput-object v8, v6, v7

    const/16 v7, 0x3c

    const-string v8, "debug_logs_defaulted_on_android"

    aput-object v8, v6, v7

    const/16 v7, 0x3d

    const-string v8, "messenger_green_on_music_android"

    aput-object v8, v6, v7

    const/16 v7, 0x3e

    const-string v8, "messenger_groups_megaphone_android"

    aput-object v8, v6, v7

    const/16 v7, 0x3f

    const-string v8, "messenger_new_photo_upload_android"

    aput-object v8, v6, v7

    const/16 v7, 0x40

    const-string v8, "messenger_new_photo_upload_native_resize_android"

    aput-object v8, v6, v7

    const/16 v7, 0x41

    const-string v8, "messenger_app_icon_badging"

    aput-object v8, v6, v7

    invoke-static/range {v0 .. v6}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
