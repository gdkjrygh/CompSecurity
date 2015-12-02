.class public final enum Lcom/facebook/selfupdate/p;
.super Ljava/lang/Enum;
.source "SelfUpdateLogger.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/selfupdate/p;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/selfupdate/p;

.field public static final enum ALARM_NEXT_TIME:Lcom/facebook/selfupdate/p;

.field public static final enum BACK_BUTTON_PRESS_CANCEL:Lcom/facebook/selfupdate/p;

.field public static final enum BUILD_TAG:Lcom/facebook/selfupdate/p;

.field public static final enum BUTTON_PRESS_INSTALL:Lcom/facebook/selfupdate/p;

.field public static final enum BUTTON_PRESS_REMIND:Lcom/facebook/selfupdate/p;

.field public static final enum CLEAN_UPDATE_INFO:Lcom/facebook/selfupdate/p;

.field public static final enum CREATE_NOTIFICATION:Lcom/facebook/selfupdate/p;

.field public static final enum DOWNLOAD_AT_EXTERNAL_DESTINATION:Lcom/facebook/selfupdate/p;

.field public static final enum DOWNLOAD_SUCCESS_FILE_URI:Lcom/facebook/selfupdate/p;

.field public static final enum FORCE_UPDATE_CHECK_NOW:Lcom/facebook/selfupdate/p;

.field public static final enum NO_CANCEL_CHANGED_TO_FALSE:Lcom/facebook/selfupdate/p;

.field public static final enum NO_CANCEL_FROM_INTENT:Lcom/facebook/selfupdate/p;

.field public static final enum NO_FREE_SPACE_TO_DOWNLOAD:Lcom/facebook/selfupdate/p;

.field public static final enum ON_ACTIVITY_CREATE:Lcom/facebook/selfupdate/p;

.field public static final enum ON_CREATE:Lcom/facebook/selfupdate/p;

.field public static final enum ON_HANDLE_INTENT:Lcom/facebook/selfupdate/p;

.field public static final enum PENDING_DOWNLOAD_COMPLETE:Lcom/facebook/selfupdate/p;

.field public static final enum PENDING_DOWNLOAD_OLD_VERSION:Lcom/facebook/selfupdate/p;

.field public static final enum QUEUE_DOWNLOAD:Lcom/facebook/selfupdate/p;

.field public static final enum SCHEDULE_SERVICE:Lcom/facebook/selfupdate/p;

.field public static final enum SHOULD_SCHEDULE_SERVICE_FALSE:Lcom/facebook/selfupdate/p;

.field public static final enum UNKNOWN_SOURCES_NOT_CHECKED:Lcom/facebook/selfupdate/p;

.field public static final enum UPDATE_CHECK_NOW:Lcom/facebook/selfupdate/p;


# instance fields
.field private mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 30
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "SCHEDULE_SERVICE"

    const-string v2, "schedule_service"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->SCHEDULE_SERVICE:Lcom/facebook/selfupdate/p;

    .line 31
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "SHOULD_SCHEDULE_SERVICE_FALSE"

    const-string v2, "should_schedule_service_false"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->SHOULD_SCHEDULE_SERVICE_FALSE:Lcom/facebook/selfupdate/p;

    .line 32
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "PENDING_DOWNLOAD_OLD_VERSION"

    const-string v2, "pending_download_old_version"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->PENDING_DOWNLOAD_OLD_VERSION:Lcom/facebook/selfupdate/p;

    .line 33
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "PENDING_DOWNLOAD_COMPLETE"

    const-string v2, "pending_download_complete"

    invoke-direct {v0, v1, v7, v2}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->PENDING_DOWNLOAD_COMPLETE:Lcom/facebook/selfupdate/p;

    .line 34
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "UPDATE_CHECK_NOW"

    const-string v2, "update_check_now"

    invoke-direct {v0, v1, v8, v2}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->UPDATE_CHECK_NOW:Lcom/facebook/selfupdate/p;

    .line 35
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "FORCE_UPDATE_CHECK_NOW"

    const/4 v2, 0x5

    const-string v3, "force_update_check_now"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->FORCE_UPDATE_CHECK_NOW:Lcom/facebook/selfupdate/p;

    .line 36
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "BUILD_TAG"

    const/4 v2, 0x6

    const-string v3, "build_tag"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->BUILD_TAG:Lcom/facebook/selfupdate/p;

    .line 37
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "DOWNLOAD_SUCCESS_FILE_URI"

    const/4 v2, 0x7

    const-string v3, "download_success_file_uri"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->DOWNLOAD_SUCCESS_FILE_URI:Lcom/facebook/selfupdate/p;

    .line 38
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "CREATE_NOTIFICATION"

    const/16 v2, 0x8

    const-string v3, "create_notification"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->CREATE_NOTIFICATION:Lcom/facebook/selfupdate/p;

    .line 39
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "CLEAN_UPDATE_INFO"

    const/16 v2, 0x9

    const-string v3, "clean_update_info"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->CLEAN_UPDATE_INFO:Lcom/facebook/selfupdate/p;

    .line 40
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "ON_CREATE"

    const/16 v2, 0xa

    const-string v3, "on_create"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->ON_CREATE:Lcom/facebook/selfupdate/p;

    .line 41
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "ON_HANDLE_INTENT"

    const/16 v2, 0xb

    const-string v3, "on_handle_intent"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->ON_HANDLE_INTENT:Lcom/facebook/selfupdate/p;

    .line 42
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "DOWNLOAD_AT_EXTERNAL_DESTINATION"

    const/16 v2, 0xc

    const-string v3, "download_at_external_destination"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->DOWNLOAD_AT_EXTERNAL_DESTINATION:Lcom/facebook/selfupdate/p;

    .line 43
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "NO_FREE_SPACE_TO_DOWNLOAD"

    const/16 v2, 0xd

    const-string v3, "no_free_space_to_download"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->NO_FREE_SPACE_TO_DOWNLOAD:Lcom/facebook/selfupdate/p;

    .line 44
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "QUEUE_DOWNLOAD"

    const/16 v2, 0xe

    const-string v3, "queue_download"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->QUEUE_DOWNLOAD:Lcom/facebook/selfupdate/p;

    .line 45
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "ALARM_NEXT_TIME"

    const/16 v2, 0xf

    const-string v3, "alarm_next_time"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->ALARM_NEXT_TIME:Lcom/facebook/selfupdate/p;

    .line 46
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "ON_ACTIVITY_CREATE"

    const/16 v2, 0x10

    const-string v3, "on_activity_create"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->ON_ACTIVITY_CREATE:Lcom/facebook/selfupdate/p;

    .line 47
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "NO_CANCEL_FROM_INTENT"

    const/16 v2, 0x11

    const-string v3, "no_cancel_from_intent"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->NO_CANCEL_FROM_INTENT:Lcom/facebook/selfupdate/p;

    .line 48
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "NO_CANCEL_CHANGED_TO_FALSE"

    const/16 v2, 0x12

    const-string v3, "no_cancel_changed_to_false"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->NO_CANCEL_CHANGED_TO_FALSE:Lcom/facebook/selfupdate/p;

    .line 49
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "UNKNOWN_SOURCES_NOT_CHECKED"

    const/16 v2, 0x13

    const-string v3, "unknown_sources_not_checked"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->UNKNOWN_SOURCES_NOT_CHECKED:Lcom/facebook/selfupdate/p;

    .line 50
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "BUTTON_PRESS_INSTALL"

    const/16 v2, 0x14

    const-string v3, "button_press_install"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->BUTTON_PRESS_INSTALL:Lcom/facebook/selfupdate/p;

    .line 51
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "BUTTON_PRESS_REMIND"

    const/16 v2, 0x15

    const-string v3, "button_press_remind"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->BUTTON_PRESS_REMIND:Lcom/facebook/selfupdate/p;

    .line 52
    new-instance v0, Lcom/facebook/selfupdate/p;

    const-string v1, "BACK_BUTTON_PRESS_CANCEL"

    const/16 v2, 0x16

    const-string v3, "back_button_press_cancel"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/selfupdate/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/selfupdate/p;->BACK_BUTTON_PRESS_CANCEL:Lcom/facebook/selfupdate/p;

    .line 28
    const/16 v0, 0x17

    new-array v0, v0, [Lcom/facebook/selfupdate/p;

    sget-object v1, Lcom/facebook/selfupdate/p;->SCHEDULE_SERVICE:Lcom/facebook/selfupdate/p;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/selfupdate/p;->SHOULD_SCHEDULE_SERVICE_FALSE:Lcom/facebook/selfupdate/p;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/selfupdate/p;->PENDING_DOWNLOAD_OLD_VERSION:Lcom/facebook/selfupdate/p;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/selfupdate/p;->PENDING_DOWNLOAD_COMPLETE:Lcom/facebook/selfupdate/p;

    aput-object v1, v0, v7

    sget-object v1, Lcom/facebook/selfupdate/p;->UPDATE_CHECK_NOW:Lcom/facebook/selfupdate/p;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/selfupdate/p;->FORCE_UPDATE_CHECK_NOW:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/selfupdate/p;->BUILD_TAG:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/selfupdate/p;->DOWNLOAD_SUCCESS_FILE_URI:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/selfupdate/p;->CREATE_NOTIFICATION:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/facebook/selfupdate/p;->CLEAN_UPDATE_INFO:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/facebook/selfupdate/p;->ON_CREATE:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/facebook/selfupdate/p;->ON_HANDLE_INTENT:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/facebook/selfupdate/p;->DOWNLOAD_AT_EXTERNAL_DESTINATION:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/facebook/selfupdate/p;->NO_FREE_SPACE_TO_DOWNLOAD:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/facebook/selfupdate/p;->QUEUE_DOWNLOAD:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/facebook/selfupdate/p;->ALARM_NEXT_TIME:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/facebook/selfupdate/p;->ON_ACTIVITY_CREATE:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/facebook/selfupdate/p;->NO_CANCEL_FROM_INTENT:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/facebook/selfupdate/p;->NO_CANCEL_CHANGED_TO_FALSE:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/facebook/selfupdate/p;->UNKNOWN_SOURCES_NOT_CHECKED:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lcom/facebook/selfupdate/p;->BUTTON_PRESS_INSTALL:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lcom/facebook/selfupdate/p;->BUTTON_PRESS_REMIND:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lcom/facebook/selfupdate/p;->BACK_BUTTON_PRESS_CANCEL:Lcom/facebook/selfupdate/p;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/selfupdate/p;->$VALUES:[Lcom/facebook/selfupdate/p;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 56
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    iput-object p3, p0, Lcom/facebook/selfupdate/p;->mName:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/selfupdate/p;
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/selfupdate/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/p;

    return-object v0
.end method

.method public static values()[Lcom/facebook/selfupdate/p;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/facebook/selfupdate/p;->$VALUES:[Lcom/facebook/selfupdate/p;

    invoke-virtual {v0}, [Lcom/facebook/selfupdate/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/selfupdate/p;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/selfupdate/p;->mName:Ljava/lang/String;

    return-object v0
.end method
