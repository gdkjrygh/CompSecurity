.class Lcom/localytics/android/SessionHandler;
.super Landroid/os/Handler;
.source "SessionHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/SessionHandler$17;
    }
.end annotation


# static fields
.field private static final CUSTOM_DIMENSION_KEYS:[Ljava/lang/String;

.field private static final EVENTS_SORT_ORDER:Ljava/lang/String;

.field private static final JOINER_ARG_UPLOAD_EVENTS_COLUMNS:[Ljava/lang/String;

.field public static final MESSAGE_AMP_TRIGGER:I = 0xd

.field public static final MESSAGE_CLOSE:I = 0x2

.field public static final MESSAGE_DELETE_AMP_RESOURCES:I = 0x13

.field public static final MESSAGE_DISABLE_PUSH:I = 0xe

.field public static final MESSAGE_HANDLE_PUSH_RECEIVED:I = 0x15

.field public static final MESSAGE_HANDLE_PUSH_REGISTRATION:I = 0x14

.field public static final MESSAGE_INIT:I = 0x0

.field public static final MESSAGE_OPEN:I = 0x1

.field public static final MESSAGE_OPT_OUT:I = 0x6

.field public static final MESSAGE_REGISTER_PUSH:I = 0x9

.field public static final MESSAGE_SET_CUSTOM_DIMENSION:I = 0xc

.field public static final MESSAGE_SET_IDENTIFIER:I = 0x8

.field public static final MESSAGE_SET_LOCATION:I = 0xb

.field public static final MESSAGE_SET_PROFILE_ATTRIBUTE:I = 0x10

.field public static final MESSAGE_SET_PUSH_REGID:I = 0xa

.field public static final MESSAGE_SHOW_AMP_TEST:I = 0xf

.field public static final MESSAGE_TAG_EVENT:I = 0x3

.field public static final MESSAGE_TAG_SCREEN:I = 0x7

.field public static final MESSAGE_UPLOAD:I = 0x4

.field public static final MESSAGE_UPLOAD_CALLBACK:I = 0x5

.field public static final MESSAGE_UPLOAD_PROFILE:I = 0x11

.field public static final MESSAGE_UPLOAD_PROFILE_CALLBACK:I = 0x12

.field private static final PROJECTION_FLOW_BLOBS:[Ljava/lang/String;

.field private static final PROJECTION_FLOW_EVENTS:[Ljava/lang/String;

.field private static final PROJECTION_GET_INSTALLATION_ID:[Ljava/lang/String;

.field private static final PROJECTION_GET_NUMBER_OF_SESSIONS:[Ljava/lang/String;

.field private static final PROJECTION_GET_OPEN_SESSION_ID_EVENT_COUNT:[Ljava/lang/String;

.field private static final PROJECTION_GET_OPEN_SESSION_ID_SESSION_ID:[Ljava/lang/String;

.field private static final PROJECTION_INIT_API_KEY:[Ljava/lang/String;

.field private static final PROJECTION_IS_OPTED_OUT:[Ljava/lang/String;

.field private static final PROJECTION_OPEN_BLOB_EVENTS:[Ljava/lang/String;

.field private static final PROJECTION_OPEN_CLOSED_SESSION:[Ljava/lang/String;

.field private static final PROJECTION_OPEN_DELETE_EMPTIES_EVENT_ID:[Ljava/lang/String;

.field private static final PROJECTION_OPEN_DELETE_EMPTIES_PROCESSED_IN_BLOB:[Ljava/lang/String;

.field private static final PROJECTION_OPEN_EVENT_ID:[Ljava/lang/String;

.field private static final PROJECTION_OPEN_SESSIONS:[Ljava/lang/String;

.field private static final PROJECTION_SET_CUSTOM_DIMENSION:[Ljava/lang/String;

.field private static final PROJECTION_SET_IDENTIFIER:[Ljava/lang/String;

.field private static final PROJECTION_TAG_EVENT:[Ljava/lang/String;

.field private static final PROJECTION_TAG_SCREEN:[Ljava/lang/String;

.field private static final PROJECTION_UPLOAD_BLOBS:[Ljava/lang/String;

.field private static final PROJECTION_UPLOAD_EVENTS:[Ljava/lang/String;

.field private static final SELECTION_ARGS_FLOW_EVENTS:[Ljava/lang/String;

.field private static final SELECTION_FLOW_EVENTS:Ljava/lang/String;

.field private static final SELECTION_GET_INSTALLATION_ID:Ljava/lang/String;

.field private static final SELECTION_GET_OPEN_SESSION_ID_EVENT_COUNT:Ljava/lang/String;

.field private static final SELECTION_INIT_API_KEY:Ljava/lang/String;

.field private static final SELECTION_IS_OPTED_OUT:Ljava/lang/String;

.field private static final SELECTION_OPEN:Ljava/lang/String;

.field private static final SELECTION_OPEN_CLOSED_SESSION:Ljava/lang/String;

.field private static final SELECTION_OPEN_CLOSED_SESSION_ATTRIBUTES:Ljava/lang/String;

.field private static final SELECTION_OPEN_DELETE_EMPTIES_EVENTS_SESSION_KEY_REF:Ljava/lang/String;

.field private static final SELECTION_OPEN_DELETE_EMPTIES_EVENT_HISTORY_SESSION_KEY_REF:Ljava/lang/String;

.field private static final SELECTION_OPEN_DELETE_EMPTIES_SESSIONS_ID:Ljava/lang/String;

.field private static final SELECTION_OPEN_DELETE_EMPTIES_UPLOAD_BLOBS_ID:Ljava/lang/String;

.field private static final SELECTION_OPEN_NEW_SESSION:Ljava/lang/String;

.field private static final SELECTION_OPT_IN_OUT:Ljava/lang/String;

.field private static final SELECTION_SET_CUSTOM_DIMENSION:Ljava/lang/String;

.field private static final SELECTION_SET_IDENTIFIER:Ljava/lang/String;

.field private static final SELECTION_TAG_EVENT:Ljava/lang/String;

.field private static final SELECTION_TAG_SCREEN:Ljava/lang/String;

.field private static final SELECTION_UPLOAD_NULL_BLOBS:Ljava/lang/String;

.field private static final SORT_ORDER_TAG_SCREEN:Ljava/lang/String;

.field private static final UPLOAD_BLOBS_EVENTS_SORT_ORDER:Ljava/lang/String;

.field protected static final sIsUploadingMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field protected static final sIsUploadingProfileMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static sLastLocation:Landroid/location/Location;

.field protected static final sProfileUploadHandlerThread:Landroid/os/HandlerThread;

.field protected static final sUploadHandlerThread:Landroid/os/HandlerThread;


# instance fields
.field protected final mApiKey:Ljava/lang/String;

.field private mApiKeyId:J

.field protected final mContext:Landroid/content/Context;

.field private mProfileUploadHandler:Lcom/localytics/android/UploadHandler;

.field protected mProvider:Lcom/localytics/android/LocalyticsProvider;

.field private mUploadHandler:Lcom/localytics/android/UploadHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 212
    const-string v0, "CAST(%s AS TEXT)"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "events_key_ref"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->UPLOAD_BLOBS_EVENTS_SORT_ORDER:Ljava/lang/String;

    .line 219
    const-string v0, "CAST(%s as TEXT)"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "_id"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->EVENTS_SORT_ORDER:Ljava/lang/String;

    .line 228
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/localytics/android/SessionHandler;->sIsUploadingMap:Ljava/util/Map;

    .line 237
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/localytics/android/SessionHandler;->sIsUploadingProfileMap:Ljava/util/Map;

    .line 247
    const-class v0, Lcom/localytics/android/UploadHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/localytics/android/SessionHandler;->getHandlerThread(Ljava/lang/String;)Landroid/os/HandlerThread;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->sUploadHandlerThread:Landroid/os/HandlerThread;

    .line 257
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/localytics/android/UploadHandler;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_profiles"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/localytics/android/SessionHandler;->getHandlerThread(Ljava/lang/String;)Landroid/os/HandlerThread;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->sProfileUploadHandlerThread:Landroid/os/HandlerThread;

    .line 302
    const/4 v0, 0x0

    sput-object v0, Lcom/localytics/android/SessionHandler;->sLastLocation:Landroid/location/Location;

    .line 1029
    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    const-string v1, "opt_out"

    aput-object v1, v0, v4

    const-string v1, "created_time"

    aput-object v1, v0, v5

    const-string v1, "uuid"

    aput-object v1, v0, v6

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_INIT_API_KEY:[Ljava/lang/String;

    .line 1039
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "api_key"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_INIT_API_KEY:Ljava/lang/String;

    .line 1152
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "_id"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPT_IN_OUT:Ljava/lang/String;

    .line 1208
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_GET_OPEN_SESSION_ID_SESSION_ID:[Ljava/lang/String;

    .line 1214
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_count"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_GET_OPEN_SESSION_ID_EVENT_COUNT:[Ljava/lang/String;

    .line 1220
    const-string v0, "%s = ? AND %s = ?"

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "session_key_ref"

    aput-object v2, v1, v3

    const-string v2, "event_name"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_GET_OPEN_SESSION_ID_EVENT_COUNT:Ljava/lang/String;

    .line 1297
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_EVENT_ID:[Ljava/lang/String;

    .line 1303
    const-string v0, "%s = ? AND %s >= ?"

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "event_name"

    aput-object v2, v1, v3

    const-string v2, "wall_time"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN:Ljava/lang/String;

    .line 1308
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "events_key_ref"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_BLOB_EVENTS:[Ljava/lang/String;

    .line 1314
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    const-string v1, "session_start_wall_time"

    aput-object v1, v0, v4

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_SESSIONS:[Ljava/lang/String;

    .line 1322
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "api_key"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_NEW_SESSION:Ljava/lang/String;

    .line 1327
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "session_key_ref"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_EVENT_HISTORY_SESSION_KEY_REF:Ljava/lang/String;

    .line 1332
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "session_key_ref"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_EVENTS_SESSION_KEY_REF:Ljava/lang/String;

    .line 1337
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_DELETE_EMPTIES_EVENT_ID:[Ljava/lang/String;

    .line 1343
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "processed_in_blob"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_DELETE_EMPTIES_PROCESSED_IN_BLOB:[Ljava/lang/String;

    .line 1349
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "_id"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_UPLOAD_BLOBS_ID:Ljava/lang/String;

    .line 1354
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "_id"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_SESSIONS_ID:Ljava/lang/String;

    .line 1720
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "uuid"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_GET_INSTALLATION_ID:[Ljava/lang/String;

    .line 1726
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "api_key"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_GET_INSTALLATION_ID:Ljava/lang/String;

    .line 1796
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "session_key_ref"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_CLOSED_SESSION:[Ljava/lang/String;

    .line 1802
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "_id"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_CLOSED_SESSION:Ljava/lang/String;

    .line 1807
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "events_key_ref"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_CLOSED_SESSION_ATTRIBUTES:Ljava/lang/String;

    .line 1857
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_GET_NUMBER_OF_SESSIONS:[Ljava/lang/String;

    .line 1916
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "session_start_wall_time"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_TAG_EVENT:[Ljava/lang/String;

    .line 1922
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "_id"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_TAG_EVENT:Ljava/lang/String;

    .line 2135
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "name"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_TAG_SCREEN:[Ljava/lang/String;

    .line 2141
    const-string v0, "%s = ? AND %s = ?"

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "type"

    aput-object v2, v1, v3

    const-string v2, "session_key_ref"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_TAG_SCREEN:Ljava/lang/String;

    .line 2146
    const-string v0, "%s DESC"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "_id"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SORT_ORDER_TAG_SCREEN:Ljava/lang/String;

    .line 2223
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "key"

    aput-object v1, v0, v3

    const-string v1, "value"

    aput-object v1, v0, v4

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_SET_IDENTIFIER:[Ljava/lang/String;

    .line 2228
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "key"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_SET_IDENTIFIER:Ljava/lang/String;

    .line 2280
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "custom_dimension_value"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_SET_CUSTOM_DIMENSION:[Ljava/lang/String;

    .line 2285
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "custom_dimension_key"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_SET_CUSTOM_DIMENSION:Ljava/lang/String;

    .line 2290
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_1:Ljava/lang/String;

    aput-object v1, v0, v3

    sget-object v1, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_2:Ljava/lang/String;

    aput-object v1, v0, v4

    sget-object v1, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_3:Ljava/lang/String;

    aput-object v1, v0, v5

    sget-object v1, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_4:Ljava/lang/String;

    aput-object v1, v0, v6

    sget-object v1, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_5:Ljava/lang/String;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_6:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_7:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_8:Ljava/lang/String;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_9:Ljava/lang/String;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$CustomDimensionsDbColumns;->CUSTOM_DIMENSION_10:Ljava/lang/String;

    aput-object v2, v0, v1

    sput-object v0, Lcom/localytics/android/SessionHandler;->CUSTOM_DIMENSION_KEYS:[Ljava/lang/String;

    .line 2440
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_FLOW_EVENTS:[Ljava/lang/String;

    .line 2446
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "event_name"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_FLOW_EVENTS:Ljava/lang/String;

    .line 2451
    new-array v0, v4, [Ljava/lang/String;

    sget-object v1, Lcom/localytics/android/Constants;->FLOW_EVENT:Ljava/lang/String;

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_ARGS_FLOW_EVENTS:[Ljava/lang/String;

    .line 2457
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "events_key_ref"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_FLOW_BLOBS:[Ljava/lang/String;

    .line 2521
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    const-string v1, "event_name"

    aput-object v1, v0, v4

    const-string v1, "wall_time"

    aput-object v1, v0, v5

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_UPLOAD_EVENTS:[Ljava/lang/String;

    .line 2530
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "events_key_ref"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_UPLOAD_BLOBS:[Ljava/lang/String;

    .line 2536
    const-string v0, "%s IS NULL"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "processed_in_blob"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_UPLOAD_NULL_BLOBS:Ljava/lang/String;

    .line 2541
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->JOINER_ARG_UPLOAD_EVENTS_COLUMNS:[Ljava/lang/String;

    .line 2747
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "opt_out"

    aput-object v1, v0, v3

    sput-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_IS_OPTED_OUT:[Ljava/lang/String;

    .line 2755
    const-string v0, "%s = ?"

    new-array v1, v4, [Ljava/lang/Object;

    const-string v2, "api_key"

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_IS_OPTED_OUT:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "looper"    # Landroid/os/Looper;

    .prologue
    .line 367
    invoke-direct {p0, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 371
    if-nez p1, :cond_0

    .line 373
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 375
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 377
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 381
    :cond_1
    iput-object p1, p0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    .line 382
    iput-object p2, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    .line 383
    return-void
.end method

.method static synthetic access$000(Lcom/localytics/android/SessionHandler;)Z
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/SessionHandler;

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/localytics/android/SessionHandler;->isPushDisabled()Z

    move-result v0

    return v0
.end method

.method static synthetic access$100()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    sget-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_SET_CUSTOM_DIMENSION:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    sget-object v0, Lcom/localytics/android/SessionHandler;->SELECTION_SET_CUSTOM_DIMENSION:Ljava/lang/String;

    return-object v0
.end method

.method private conditionallyAddFlowEvent()V
    .locals 13

    .prologue
    const/4 v12, 0x0

    .line 2470
    const/4 v8, 0x0

    .line 2472
    .local v8, "foundUnassociatedFlowEvent":Z
    const/4 v7, 0x0

    .line 2473
    .local v7, "eventsCursor":Landroid/database/Cursor;
    const/4 v6, 0x0

    .line 2476
    .local v6, "blob_eventsCursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "events"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_FLOW_EVENTS:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_FLOW_EVENTS:Ljava/lang/String;

    sget-object v4, Lcom/localytics/android/SessionHandler;->SELECTION_ARGS_FLOW_EVENTS:[Ljava/lang/String;

    sget-object v5, Lcom/localytics/android/SessionHandler;->EVENTS_SORT_ORDER:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 2478
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "upload_blob_events"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_FLOW_BLOBS:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lcom/localytics/android/SessionHandler;->UPLOAD_BLOBS_EVENTS_SORT_ORDER:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 2480
    new-instance v10, Landroid/database/CursorJoiner;

    sget-object v0, Lcom/localytics/android/SessionHandler;->PROJECTION_FLOW_EVENTS:[Ljava/lang/String;

    sget-object v1, Lcom/localytics/android/SessionHandler;->PROJECTION_FLOW_BLOBS:[Ljava/lang/String;

    invoke-direct {v10, v7, v0, v6, v1}, Landroid/database/CursorJoiner;-><init>(Landroid/database/Cursor;[Ljava/lang/String;Landroid/database/Cursor;[Ljava/lang/String;)V

    .line 2481
    .local v10, "joiner":Landroid/database/CursorJoiner;
    invoke-virtual {v10}, Landroid/database/CursorJoiner;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .local v9, "i$":Ljava/util/Iterator;
    :goto_0
    :pswitch_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/database/CursorJoiner$Result;

    .line 2483
    .local v11, "joinerResult":Landroid/database/CursorJoiner$Result;
    sget-object v0, Lcom/localytics/android/SessionHandler$17;->$SwitchMap$android$database$CursorJoiner$Result:[I

    invoke-virtual {v11}, Landroid/database/CursorJoiner$Result;->ordinal()I

    move-result v1

    aget v0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 2487
    :pswitch_1
    const/4 v8, 0x1

    .line 2488
    goto :goto_0

    .line 2499
    .end local v11    # "joinerResult":Landroid/database/CursorJoiner$Result;
    :cond_0
    if-eqz v7, :cond_1

    .line 2501
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 2502
    const/4 v7, 0x0

    .line 2505
    :cond_1
    if-eqz v6, :cond_2

    .line 2507
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2508
    const/4 v6, 0x0

    .line 2512
    :cond_2
    if-nez v8, :cond_3

    .line 2514
    sget-object v0, Lcom/localytics/android/Constants;->FLOW_EVENT:Ljava/lang/String;

    invoke-virtual {p0, v0, v12}, Lcom/localytics/android/SessionHandler;->tagEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 2516
    :cond_3
    return-void

    .line 2499
    .end local v9    # "i$":Ljava/util/Iterator;
    .end local v10    # "joiner":Landroid/database/CursorJoiner;
    :catchall_0
    move-exception v0

    if-eqz v7, :cond_4

    .line 2501
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 2502
    const/4 v7, 0x0

    .line 2505
    :cond_4
    if-eqz v6, :cond_5

    .line 2507
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2508
    const/4 v6, 0x0

    :cond_5
    throw v0

    .line 2483
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static getFBAttribution(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/String;
    .locals 8
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;

    .prologue
    const/4 v7, 0x0

    .line 1771
    const/4 v6, 0x0

    .line 1774
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "info"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1776
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1778
    const-string v0, "fb_attribution"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 1783
    if-eqz v6, :cond_0

    .line 1785
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1786
    const/4 v6, 0x0

    .line 1790
    :cond_0
    :goto_0
    return-object v0

    .line 1783
    :cond_1
    if-eqz v6, :cond_2

    .line 1785
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1786
    const/4 v6, 0x0

    :cond_2
    move-object v0, v7

    .line 1790
    goto :goto_0

    .line 1783
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    .line 1785
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1786
    const/4 v6, 0x0

    :cond_3
    throw v0
.end method

.method private static getHandlerThread(Ljava/lang/String;)Landroid/os/HandlerThread;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 267
    new-instance v0, Landroid/os/HandlerThread;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 269
    .local v0, "thread":Landroid/os/HandlerThread;
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 276
    return-object v0
.end method

.method static getInstallationId(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "apiKey"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 1733
    const/4 v6, 0x0

    .line 1736
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "api_keys"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_GET_INSTALLATION_ID:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_GET_INSTALLATION_ID:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1739
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1741
    const-string v0, "uuid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 1746
    if-eqz v6, :cond_0

    .line 1748
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1749
    const/4 v6, 0x0

    .line 1760
    :cond_0
    :goto_0
    return-object v0

    .line 1746
    :cond_1
    if-eqz v6, :cond_2

    .line 1748
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1749
    const/4 v6, 0x0

    .line 1756
    :cond_2
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_3

    .line 1758
    const-string v0, "Localytics"

    const-string v1, "Installation ID couldn\'t be found"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    move-object v0, v7

    .line 1760
    goto :goto_0

    .line 1746
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_4

    .line 1748
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1749
    const/4 v6, 0x0

    :cond_4
    throw v0
.end method

.method static getNumberOfSessions(Lcom/localytics/android/LocalyticsProvider;)J
    .locals 7
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;

    .prologue
    .line 1868
    const/4 v6, 0x0

    .line 1871
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "sessions"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_GET_NUMBER_OF_SESSIONS:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1873
    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    int-to-long v0, v0

    .line 1877
    if-eqz v6, :cond_0

    .line 1879
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1880
    const/4 v6, 0x0

    :cond_0
    return-wide v0

    .line 1877
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_1

    .line 1879
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1880
    const/4 v6, 0x0

    :cond_1
    throw v0
.end method

.method static getOpenSessionId(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/Long;
    .locals 10
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;

    .prologue
    const/4 v9, 0x0

    .line 1234
    const/4 v8, 0x0

    .line 1242
    .local v8, "sessionsCursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "sessions"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_GET_OPEN_SESSION_ID_SESSION_ID:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "_id"

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 1244
    invoke-interface {v8}, Landroid/database/Cursor;->moveToLast()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1246
    const-string v0, "_id"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 1255
    .local v7, "sessionId":Ljava/lang/Long;
    if-eqz v8, :cond_0

    .line 1257
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 1258
    const/4 v8, 0x0

    .line 1266
    :cond_0
    const/4 v6, 0x0

    .line 1269
    .local v6, "eventsCursor":Landroid/database/Cursor;
    :try_start_1
    const-string v1, "events"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_GET_OPEN_SESSION_ID_EVENT_COUNT:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_GET_OPEN_SESSION_ID_EVENT_COUNT:Ljava/lang/String;

    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {v7}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x1

    sget-object v5, Lcom/localytics/android/Constants;->CLOSE_EVENT:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1274
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1276
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-nez v0, :cond_5

    .line 1284
    if-eqz v6, :cond_1

    .line 1286
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1287
    const/4 v6, 0x0

    .line 1291
    .end local v6    # "eventsCursor":Landroid/database/Cursor;
    .end local v7    # "sessionId":Ljava/lang/Long;
    :cond_1
    :goto_0
    return-object v7

    .line 1255
    :cond_2
    if-eqz v8, :cond_3

    .line 1257
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 1258
    const/4 v8, 0x0

    :cond_3
    move-object v7, v9

    goto :goto_0

    .line 1255
    :catchall_0
    move-exception v0

    if-eqz v8, :cond_4

    .line 1257
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 1258
    const/4 v8, 0x0

    :cond_4
    throw v0

    .line 1284
    .restart local v6    # "eventsCursor":Landroid/database/Cursor;
    .restart local v7    # "sessionId":Ljava/lang/Long;
    :cond_5
    if-eqz v6, :cond_6

    .line 1286
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1287
    const/4 v6, 0x0

    :cond_6
    move-object v7, v9

    .line 1291
    goto :goto_0

    .line 1284
    :catchall_1
    move-exception v0

    if-eqz v6, :cond_7

    .line 1286
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1287
    const/4 v6, 0x0

    :cond_7
    throw v0
.end method

.method static isOptedOut(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Z
    .locals 9
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "apiKey"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 2769
    if-nez p0, :cond_0

    .line 2771
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "provider cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2774
    :cond_0
    if-nez p1, :cond_1

    .line 2776
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "apiKey cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2780
    :cond_1
    const/4 v6, 0x0

    .line 2783
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "api_keys"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_IS_OPTED_OUT:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_IS_OPTED_OUT:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 2786
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2788
    const-string v0, "opt_out"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    move v0, v7

    .line 2793
    :goto_0
    if-eqz v6, :cond_2

    .line 2795
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2796
    const/4 v6, 0x0

    .line 2800
    :cond_2
    :goto_1
    return v0

    :cond_3
    move v0, v8

    .line 2788
    goto :goto_0

    .line 2793
    :cond_4
    if-eqz v6, :cond_5

    .line 2795
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2796
    const/4 v6, 0x0

    :cond_5
    move v0, v8

    .line 2800
    goto :goto_1

    .line 2793
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_6

    .line 2795
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2796
    const/4 v6, 0x0

    :cond_6
    throw v0
.end method

.method private isPushDisabled()Z
    .locals 12

    .prologue
    const/4 v11, 0x0

    const/4 v10, 0x1

    .line 2409
    const/4 v7, 0x0

    .line 2410
    .local v7, "disabled":Z
    const/4 v6, 0x0

    .line 2413
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "info"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "push_disabled"

    aput-object v4, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 2414
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2416
    const-string v0, "push_disabled"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v9

    .line 2417
    .local v9, "disabledBit":I
    if-ne v9, v10, :cond_0

    move v7, v10

    .line 2418
    :goto_1
    goto :goto_0

    :cond_0
    move v7, v11

    .line 2417
    goto :goto_1

    .line 2422
    .end local v9    # "disabledBit":I
    :cond_1
    if-eqz v6, :cond_2

    .line 2423
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2424
    const/4 v6, 0x0

    :cond_2
    move v8, v7

    .line 2426
    .end local v7    # "disabled":Z
    .local v8, "disabled":I
    :goto_2
    return v8

    .line 2422
    .end local v8    # "disabled":I
    .restart local v7    # "disabled":Z
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    .line 2423
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2424
    const/4 v6, 0x0

    :cond_3
    move v8, v7

    .line 2426
    .restart local v8    # "disabled":I
    goto :goto_2
.end method

.method private openClosedSession(J)V
    .locals 7
    .param p1, "closeEventId"    # J

    .prologue
    .line 1817
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v0

    .line 1820
    .local v4, "selectionArgs":[Ljava/lang/String;
    const/4 v6, 0x0

    .line 1823
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "events"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_CLOSED_SESSION:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_CLOSED_SESSION:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1825
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1827
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "attributes"

    sget-object v2, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_CLOSED_SESSION_ATTRIBUTES:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v4}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1828
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "events"

    sget-object v2, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_CLOSED_SESSION:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v4}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1846
    :goto_0
    if-eqz v6, :cond_0

    .line 1848
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1849
    const/4 v6, 0x0

    .line 1852
    :cond_0
    return-void

    .line 1836
    :cond_1
    :try_start_1
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_2

    .line 1838
    const-string v0, "Localytics"

    const-string v1, "Event no longer exists"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1841
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/localytics/android/SessionHandler;->openNewSession(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1846
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    .line 1848
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1849
    const/4 v6, 0x0

    :cond_3
    throw v0
.end method

.method private openNewSession(Ljava/util/Map;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1589
    .local p1, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    const-string v3, "phone"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Landroid/telephony/TelephonyManager;

    .line 1591
    .local v16, "telephonyManager":Landroid/telephony/TelephonyManager;
    const/4 v8, 0x0

    .line 1592
    .local v8, "cursor":Landroid/database/Cursor;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 1593
    .local v14, "sessionStartTime":J
    const-wide/16 v10, 0x0

    .line 1596
    .local v10, "lastSessionStartTime":J
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "info"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 1598
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1600
    const-string v2, "last_session_open_time"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v10

    .line 1605
    :cond_0
    const-wide/16 v2, 0x0

    cmp-long v2, v10, v2

    if-nez v2, :cond_1

    .line 1607
    move-wide v10, v14

    .line 1610
    :cond_1
    if-eqz v8, :cond_2

    .line 1612
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 1613
    const/4 v8, 0x0

    .line 1616
    :cond_2
    new-instance v17, Landroid/content/ContentValues;

    invoke-direct/range {v17 .. v17}, Landroid/content/ContentValues;-><init>()V

    .line 1617
    .local v17, "values":Landroid/content/ContentValues;
    const-string v2, "api_key_ref"

    move-object/from16 v0, p0

    iget-wide v3, v0, Lcom/localytics/android/SessionHandler;->mApiKeyId:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1618
    const-string v2, "session_start_wall_time"

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1619
    const-string v2, "uuid"

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1620
    const-string v2, "app_version"

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/localytics/android/DatapointHelper;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1621
    const-string v2, "android_sdk"

    sget v3, Lcom/localytics/android/Constants;->CURRENT_API_LEVEL:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1622
    const-string v2, "android_version"

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1625
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/localytics/android/DatapointHelper;->getAndroidIdHashOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 1626
    .local v9, "deviceId":Ljava/lang/String;
    if-nez v9, :cond_3

    .line 1628
    const-string v9, ""

    .line 1631
    :cond_3
    const-string v2, "device_android_id_hash"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1632
    const-string v2, "device_android_id"

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/localytics/android/DatapointHelper;->getAndroidIdOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1633
    const-string v2, "device_advertising_id"

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/localytics/android/DatapointHelper;->getAdvertisingIdOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1634
    const-string v2, "device_country"

    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1635
    const-string v2, "device_manufacturer"

    invoke-static {}, Lcom/localytics/android/DatapointHelper;->getManufacturer()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1636
    const-string v2, "device_model"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1637
    const-string v2, "device_serial_number_hash"

    invoke-static {}, Lcom/localytics/android/DatapointHelper;->getSerialNumberHashOrNull()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1638
    const-string v2, "device_telephony_id"

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/localytics/android/DatapointHelper;->getTelephonyDeviceIdOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1639
    const-string v2, "device_telephony_id_hash"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    .line 1640
    const-string v2, "device_wifi_mac_hash"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    .line 1641
    const-string v2, "locale_country"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1642
    const-string v2, "locale_language"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1643
    const-string v2, "localytics_library_version"

    const-string v3, "androida_2.72"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1644
    const-string v2, "iu"

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/localytics/android/SessionHandler;->getInstallationId(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1646
    const-string v2, "latitude"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    .line 1647
    const-string v2, "longitude"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    .line 1648
    const-string v2, "network_carrier"

    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1649
    const-string v2, "network_country"

    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1650
    const-string v2, "network_type"

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    move-object/from16 v0, v16

    invoke-static {v3, v0}, Lcom/localytics/android/DatapointHelper;->getNetworkType(Landroid/content/Context;Landroid/telephony/TelephonyManager;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1652
    const-string v2, "elapsed"

    sub-long v3, v14, v10

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1654
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "sessions"

    move-object/from16 v0, v17

    invoke-virtual {v2, v3, v0}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v12

    .line 1655
    .local v12, "sessionId":J
    const-wide/16 v2, -0x1

    cmp-long v2, v12, v2

    if-nez v2, :cond_6

    .line 1657
    new-instance v2, Ljava/lang/AssertionError;

    const-string v3, "session insert failed"

    invoke-direct {v2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    .line 1605
    .end local v9    # "deviceId":Ljava/lang/String;
    .end local v12    # "sessionId":J
    .end local v17    # "values":Landroid/content/ContentValues;
    :catchall_0
    move-exception v2

    const-wide/16 v3, 0x0

    cmp-long v3, v10, v3

    if-nez v3, :cond_4

    .line 1607
    move-wide v10, v14

    .line 1610
    :cond_4
    if-eqz v8, :cond_5

    .line 1612
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 1613
    const/4 v8, 0x0

    :cond_5
    throw v2

    .line 1661
    .restart local v9    # "deviceId":Ljava/lang/String;
    .restart local v12    # "sessionId":J
    .restart local v17    # "values":Landroid/content/ContentValues;
    :cond_6
    invoke-virtual/range {v17 .. v17}, Landroid/content/ContentValues;->clear()V

    .line 1662
    const-string v2, "last_session_open_time"

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1663
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "info"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v2, v3, v0, v4, v5}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1665
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/localytics/android/DatapointHelper;->getAdvertisingIdOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/localytics/android/SessionHandler;->setFirstAdvertisingId(Ljava/lang/String;)V

    .line 1667
    sget-object v2, Lcom/localytics/android/Constants;->OPEN_EVENT:Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v2, v1}, Lcom/localytics/android/SessionHandler;->tagEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 1672
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/localytics/android/LocalyticsProvider;->deleteOldFiles(Landroid/content/Context;)V

    .line 1673
    return-void
.end method

.method static preUploadBuildBlobs(Lcom/localytics/android/LocalyticsProvider;)V
    .locals 17
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;

    .prologue
    .line 2562
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 2564
    .local v9, "eventIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Long;>;"
    const/4 v10, 0x0

    .line 2565
    .local v10, "eventsCursor":Landroid/database/Cursor;
    const/4 v8, 0x0

    .line 2568
    .local v8, "blob_eventsCursor":Landroid/database/Cursor;
    :try_start_0
    const-string v2, "events"

    sget-object v3, Lcom/localytics/android/SessionHandler;->PROJECTION_UPLOAD_EVENTS:[Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/localytics/android/SessionHandler;->EVENTS_SORT_ORDER:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 2570
    const-string v2, "upload_blob_events"

    sget-object v3, Lcom/localytics/android/SessionHandler;->PROJECTION_UPLOAD_BLOBS:[Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/localytics/android/SessionHandler;->UPLOAD_BLOBS_EVENTS_SORT_ORDER:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 2572
    const-string v1, "_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v12

    .line 2573
    .local v12, "idColumn":I
    new-instance v13, Landroid/database/CursorJoiner;

    sget-object v1, Lcom/localytics/android/SessionHandler;->JOINER_ARG_UPLOAD_EVENTS_COLUMNS:[Ljava/lang/String;

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_UPLOAD_BLOBS:[Ljava/lang/String;

    invoke-direct {v13, v10, v1, v8, v2}, Landroid/database/CursorJoiner;-><init>(Landroid/database/Cursor;[Ljava/lang/String;Landroid/database/Cursor;[Ljava/lang/String;)V

    .line 2574
    .local v13, "joiner":Landroid/database/CursorJoiner;
    invoke-virtual {v13}, Landroid/database/CursorJoiner;->iterator()Ljava/util/Iterator;

    move-result-object v11

    .local v11, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    :pswitch_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/database/CursorJoiner$Result;

    .line 2576
    .local v14, "joinerResult":Landroid/database/CursorJoiner$Result;
    sget-object v1, Lcom/localytics/android/SessionHandler$17;->$SwitchMap$android$database$CursorJoiner$Result:[I

    invoke-virtual {v14}, Landroid/database/CursorJoiner$Result;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 2580
    :pswitch_1
    sget-object v1, Lcom/localytics/android/Constants;->CLOSE_EVENT:Ljava/lang/String;

    const-string v2, "event_name"

    invoke-interface {v10, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v10, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2582
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-string v3, "wall_time"

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    sub-long/2addr v1, v3

    sget-wide v3, Lcom/localytics/android/Constants;->SESSION_EXPIRATION:J

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    .line 2587
    :cond_1
    invoke-interface {v10, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 2599
    .end local v11    # "i$":Ljava/util/Iterator;
    .end local v12    # "idColumn":I
    .end local v13    # "joiner":Landroid/database/CursorJoiner;
    .end local v14    # "joinerResult":Landroid/database/CursorJoiner$Result;
    :catchall_0
    move-exception v1

    if-eqz v10, :cond_2

    .line 2601
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 2602
    const/4 v10, 0x0

    .line 2605
    :cond_2
    if-eqz v8, :cond_3

    .line 2607
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 2608
    const/4 v8, 0x0

    :cond_3
    throw v1

    .line 2599
    .restart local v11    # "i$":Ljava/util/Iterator;
    .restart local v12    # "idColumn":I
    .restart local v13    # "joiner":Landroid/database/CursorJoiner;
    :cond_4
    if-eqz v10, :cond_5

    .line 2601
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 2602
    const/4 v10, 0x0

    .line 2605
    :cond_5
    if-eqz v8, :cond_6

    .line 2607
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 2608
    const/4 v8, 0x0

    .line 2612
    :cond_6
    invoke-interface {v9}, Ljava/util/Set;->size()I

    move-result v1

    if-lez v1, :cond_8

    .line 2615
    new-instance v15, Landroid/content/ContentValues;

    invoke-direct {v15}, Landroid/content/ContentValues;-><init>()V

    .line 2619
    .local v15, "values":Landroid/content/ContentValues;
    const-string v1, "uuid"

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2620
    const-string v1, "upload_blobs"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v15}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    .line 2621
    .local v7, "blobId":Ljava/lang/Long;
    invoke-virtual {v15}, Landroid/content/ContentValues;->clear()V

    .line 2624
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Long;

    .line 2626
    .local v16, "x":Ljava/lang/Long;
    const-string v1, "upload_blobs_key_ref"

    invoke-virtual {v15, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2627
    const-string v1, "events_key_ref"

    move-object/from16 v0, v16

    invoke-virtual {v15, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2629
    const-string v1, "upload_blob_events"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v15}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 2631
    invoke-virtual {v15}, Landroid/content/ContentValues;->clear()V

    goto :goto_1

    .line 2634
    .end local v16    # "x":Ljava/lang/Long;
    :cond_7
    const-string v1, "processed_in_blob"

    invoke-virtual {v15, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2635
    const-string v1, "event_history"

    sget-object v2, Lcom/localytics/android/SessionHandler;->SELECTION_UPLOAD_NULL_BLOBS:Ljava/lang/String;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v15, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 2636
    invoke-virtual {v15}, Landroid/content/ContentValues;->clear()V

    .line 2638
    .end local v7    # "blobId":Ljava/lang/Long;
    .end local v15    # "values":Landroid/content/ContentValues;
    :cond_8
    return-void

    .line 2576
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setFirstAdvertisingId(Ljava/lang/String;)V
    .locals 10
    .param p1, "advertisingId"    # Ljava/lang/String;

    .prologue
    const/4 v9, 0x0

    .line 1682
    const/4 v7, 0x0

    .line 1684
    .local v7, "firstAdvertisingId":Ljava/lang/String;
    const/4 v6, 0x0

    .line 1687
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "info"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1689
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1691
    const-string v0, "first_advertising_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 1696
    :cond_0
    if-eqz v6, :cond_1

    .line 1698
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1699
    const/4 v6, 0x0

    .line 1703
    :cond_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1705
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_2

    .line 1707
    const-string v0, "Localytics"

    const-string v1, "First advertising id has already been set before."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1715
    :cond_2
    :goto_0
    return-void

    .line 1696
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    .line 1698
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1699
    const/4 v6, 0x0

    :cond_3
    throw v0

    .line 1712
    :cond_4
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 1713
    .local v8, "values":Landroid/content/ContentValues;
    const-string v0, "first_advertising_id"

    invoke-virtual {v8, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1714
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "info"

    invoke-virtual {v0, v1, v8, v9, v9}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0
.end method


# virtual methods
.method close(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1901
    .local p1, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v0}, Lcom/localytics/android/SessionHandler;->getOpenSessionId(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1903
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 1905
    const-string v0, "Localytics"

    const-string v1, "Session was not open, so close is not possible."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1911
    :cond_0
    :goto_0
    return-void

    .line 1910
    :cond_1
    sget-object v0, Lcom/localytics/android/Constants;->CLOSE_EVENT:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/localytics/android/SessionHandler;->tagEvent(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method

.method protected createUploadHandler(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Landroid/os/Looper;)Lcom/localytics/android/UploadHandler;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "sessionHandler"    # Landroid/os/Handler;
    .param p3, "apiKey"    # Ljava/lang/String;
    .param p4, "installId"    # Ljava/lang/String;
    .param p5, "looper"    # Landroid/os/Looper;

    .prologue
    .line 331
    new-instance v0, Lcom/localytics/android/UploadHandler;

    move-object v1, p1

    move-object v2, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/localytics/android/UploadHandler;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Landroid/os/Looper;)V

    return-object v0
.end method

.method getCustomDimension(I)Ljava/lang/String;
    .locals 9
    .param p1, "dimension"    # I

    .prologue
    const/4 v8, 0x0

    .line 2369
    if-ltz p1, :cond_0

    const/16 v0, 0x9

    if-le p1, v0, :cond_1

    .line 2396
    :cond_0
    :goto_0
    return-object v8

    .line 2374
    :cond_1
    const/4 v8, 0x0

    .line 2375
    .local v8, "value":Ljava/lang/String;
    sget-object v0, Lcom/localytics/android/SessionHandler;->CUSTOM_DIMENSION_KEYS:[Ljava/lang/String;

    aget-object v7, v0, p1

    .line 2377
    .local v7, "key":Ljava/lang/String;
    const/4 v6, 0x0

    .line 2380
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "custom_dimensions"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_SET_CUSTOM_DIMENSION:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_SET_CUSTOM_DIMENSION:Ljava/lang/String;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v7, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 2382
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2384
    const-string v0, "custom_dimension_value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v8

    .line 2389
    :cond_2
    if-eqz v6, :cond_0

    .line 2391
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2392
    const/4 v6, 0x0

    goto :goto_0

    .line 2389
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    .line 2391
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2392
    const/4 v6, 0x0

    :cond_3
    throw v0
.end method

.method getProfileUploadHandler()Lcom/localytics/android/UploadHandler;
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProfileUploadHandler:Lcom/localytics/android/UploadHandler;

    return-object v0
.end method

.method getUploadHandler()Lcom/localytics/android/UploadHandler;
    .locals 1

    .prologue
    .line 341
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mUploadHandler:Lcom/localytics/android/UploadHandler;

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 25
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 390
    :try_start_0
    invoke-super/range {p0 .. p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 392
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_0

    .line 394
    const-string v21, "Localytics"

    const-string v22, "Handler received %s"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    aput-object p1, v23, v24

    invoke-static/range {v22 .. v23}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 397
    :cond_0
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->what:I

    move/from16 v21, v0

    packed-switch v21, :pswitch_data_0

    .line 1008
    :pswitch_0
    new-instance v21, Ljava/lang/RuntimeException;

    const-string v22, "Fell through switch statement"

    invoke-direct/range {v21 .. v22}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v21
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1012
    :catch_0
    move-exception v10

    .line 1014
    .local v10, "e":Ljava/lang/Exception;
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_1

    .line 1016
    const-string v21, "Localytics"

    const-string v22, "Localytics library threw an uncaught exception"

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-static {v0, v1, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1024
    .end local v10    # "e":Ljava/lang/Exception;
    :cond_1
    :goto_0
    return-void

    .line 401
    :pswitch_1
    :try_start_1
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_2

    .line 403
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_INIT"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 406
    :cond_2
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/String;

    .line 408
    .local v18, "referrerID":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->init(Ljava/lang/String;)V

    goto :goto_0

    .line 414
    .end local v18    # "referrerID":Ljava/lang/String;
    :pswitch_2
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_3

    .line 416
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_OPT_OUT"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 419
    :cond_3
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->arg1:I

    move/from16 v21, v0

    if-nez v21, :cond_4

    const/4 v13, 0x0

    .line 421
    .local v13, "isOptingOut":Z
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$1;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v13}, Lcom/localytics/android/SessionHandler$1;-><init>(Lcom/localytics/android/SessionHandler;Z)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 419
    .end local v13    # "isOptingOut":Z
    :cond_4
    const/4 v13, 0x1

    goto :goto_1

    .line 433
    :pswitch_3
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_5

    .line 435
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_OPEN"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 438
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$2;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/SessionHandler$2;-><init>(Lcom/localytics/android/SessionHandler;Landroid/os/Message;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 451
    :pswitch_4
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_6

    .line 453
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_CLOSE"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 456
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$3;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/SessionHandler$3;-><init>(Lcom/localytics/android/SessionHandler;Landroid/os/Message;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 469
    :pswitch_5
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_7

    .line 471
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_TAG_EVENT"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 474
    :cond_7
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, [Ljava/lang/Object;

    move-object/from16 v0, v21

    check-cast v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    .line 476
    .local v16, "params":[Ljava/lang/Object;
    const/16 v21, 0x0

    aget-object v11, v16, v21

    check-cast v11, Ljava/lang/String;

    .line 478
    .local v11, "event":Ljava/lang/String;
    const/16 v21, 0x1

    aget-object v5, v16, v21

    check-cast v5, Ljava/util/Map;

    .line 479
    .local v5, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/16 v21, 0x2

    aget-object v7, v16, v21

    check-cast v7, Ljava/lang/Long;

    .line 481
    .local v7, "clv":Ljava/lang/Long;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$4;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v11, v5, v7}, Lcom/localytics/android/SessionHandler$4;-><init>(Lcom/localytics/android/SessionHandler;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 568
    .end local v5    # "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v7    # "clv":Ljava/lang/Long;
    .end local v11    # "event":Ljava/lang/String;
    .end local v16    # "params":[Ljava/lang/Object;
    :pswitch_6
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_8

    .line 570
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_TAG_SCREEN"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 573
    :cond_8
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v19, v0

    check-cast v19, Ljava/lang/String;

    .line 575
    .local v19, "screen":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$5;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/SessionHandler$5;-><init>(Lcom/localytics/android/SessionHandler;Ljava/lang/String;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 587
    .end local v19    # "screen":Ljava/lang/String;
    :pswitch_7
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_9

    .line 589
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_SET_IDENTIFIER"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 592
    :cond_9
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, [Ljava/lang/Object;

    move-object/from16 v0, v21

    check-cast v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    .line 593
    .restart local v16    # "params":[Ljava/lang/Object;
    const/16 v21, 0x0

    aget-object v14, v16, v21

    check-cast v14, Ljava/lang/String;

    .line 594
    .local v14, "key":Ljava/lang/String;
    const/16 v21, 0x1

    aget-object v20, v16, v21

    check-cast v20, Ljava/lang/String;

    .line 596
    .local v20, "value":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$6;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v14, v2}, Lcom/localytics/android/SessionHandler$6;-><init>(Lcom/localytics/android/SessionHandler;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 608
    .end local v14    # "key":Ljava/lang/String;
    .end local v16    # "params":[Ljava/lang/Object;
    .end local v20    # "value":Ljava/lang/String;
    :pswitch_8
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_a

    .line 610
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_REGISTER_PUSH"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 613
    :cond_a
    move-object/from16 v0, p1

    iget-object v15, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    .line 615
    .local v15, "newSenderId":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$7;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v15}, Lcom/localytics/android/SessionHandler$7;-><init>(Lcom/localytics/android/SessionHandler;Ljava/lang/String;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 683
    .end local v15    # "newSenderId":Ljava/lang/String;
    :pswitch_9
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_b

    .line 685
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_DISABLE_PUSH"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 688
    :cond_b
    move-object/from16 v0, p1

    iget v9, v0, Landroid/os/Message;->arg1:I

    .line 690
    .local v9, "disabled":I
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$8;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v9}, Lcom/localytics/android/SessionHandler$8;-><init>(Lcom/localytics/android/SessionHandler;I)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 702
    .end local v9    # "disabled":I
    :pswitch_a
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_c

    .line 704
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_SET_PUSH_REGID"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 707
    :cond_c
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    .line 709
    .local v17, "pushRegId":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$9;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/SessionHandler$9;-><init>(Lcom/localytics/android/SessionHandler;Ljava/lang/String;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 721
    .end local v17    # "pushRegId":Ljava/lang/String;
    :pswitch_b
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_d

    .line 723
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_SET_LOCATION"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 726
    :cond_d
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, Landroid/location/Location;

    sput-object v21, Lcom/localytics/android/SessionHandler;->sLastLocation:Landroid/location/Location;

    goto/16 :goto_0

    .line 732
    :pswitch_c
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_e

    .line 734
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_SET_CUSTOM_DIMENSION"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 737
    :cond_e
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, [Ljava/lang/Object;

    move-object/from16 v0, v21

    check-cast v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    .line 738
    .restart local v16    # "params":[Ljava/lang/Object;
    const/16 v21, 0x0

    aget-object v21, v16, v21

    check-cast v21, Ljava/lang/Integer;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 739
    .local v8, "dimension":I
    const/16 v21, 0x1

    aget-object v20, v16, v21

    check-cast v20, Ljava/lang/String;

    .line 741
    .restart local v20    # "value":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$10;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v8, v2}, Lcom/localytics/android/SessionHandler$10;-><init>(Lcom/localytics/android/SessionHandler;ILjava/lang/String;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 753
    .end local v8    # "dimension":I
    .end local v16    # "params":[Ljava/lang/Object;
    .end local v20    # "value":Ljava/lang/String;
    :pswitch_d
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_f

    .line 755
    const-string v21, "Localytics"

    const-string v22, "SessionHandler received MESSAGE_UPLOAD"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 761
    :cond_f
    move-object/from16 v0, p1

    iget-object v6, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Runnable;

    .line 763
    .local v6, "callback":Ljava/lang/Runnable;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$11;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v6}, Lcom/localytics/android/SessionHandler$11;-><init>(Lcom/localytics/android/SessionHandler;Ljava/lang/Runnable;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 775
    .end local v6    # "callback":Ljava/lang/Runnable;
    :pswitch_e
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_10

    .line 777
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_UPLOAD_CALLBACK"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 780
    :cond_10
    sget-object v21, Lcom/localytics/android/SessionHandler;->sIsUploadingMap:Ljava/util/Map;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    move-object/from16 v22, v0

    sget-object v23, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface/range {v21 .. v23}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 786
    :pswitch_f
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_11

    .line 788
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_SET_PROFILE_ATTRIBUTE"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 791
    :cond_11
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, [Ljava/lang/Object;

    move-object/from16 v0, v21

    check-cast v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    .line 792
    .restart local v16    # "params":[Ljava/lang/Object;
    const/16 v21, 0x0

    aget-object v4, v16, v21

    check-cast v4, Lorg/json/JSONObject;

    .line 793
    .local v4, "attributeJSON":Lorg/json/JSONObject;
    const/16 v21, 0x1

    aget-object v21, v16, v21

    check-cast v21, Ljava/lang/Integer;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 795
    .local v3, "action":I
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$12;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v4, v3}, Lcom/localytics/android/SessionHandler$12;-><init>(Lcom/localytics/android/SessionHandler;Lorg/json/JSONObject;I)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 814
    .end local v3    # "action":I
    .end local v4    # "attributeJSON":Lorg/json/JSONObject;
    .end local v16    # "params":[Ljava/lang/Object;
    :pswitch_10
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_12

    .line 816
    const-string v21, "Localytics"

    const-string v22, "SessionHandler received MESSAGE_UPLOAD_PROFILE"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 822
    :cond_12
    move-object/from16 v0, p1

    iget-object v6, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Runnable;

    .line 824
    .restart local v6    # "callback":Ljava/lang/Runnable;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$13;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v6}, Lcom/localytics/android/SessionHandler$13;-><init>(Lcom/localytics/android/SessionHandler;Ljava/lang/Runnable;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 836
    .end local v6    # "callback":Ljava/lang/Runnable;
    :pswitch_11
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_13

    .line 838
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_UPLOAD_PROFILE_CALLBACK"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 841
    :cond_13
    sget-object v21, Lcom/localytics/android/SessionHandler;->sIsUploadingProfileMap:Ljava/util/Map;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    move-object/from16 v22, v0

    sget-object v23, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface/range {v21 .. v23}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 847
    :pswitch_12
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_14

    .line 849
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_HANDLE_PUSH_REGISTRATION"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 852
    :cond_14
    move-object/from16 v0, p1

    iget-object v12, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v12, Landroid/content/Intent;

    .line 854
    .local v12, "intent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$14;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v12}, Lcom/localytics/android/SessionHandler$14;-><init>(Lcom/localytics/android/SessionHandler;Landroid/content/Intent;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 905
    .end local v12    # "intent":Landroid/content/Intent;
    :pswitch_13
    sget-boolean v21, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v21, :cond_15

    .line 907
    const-string v21, "Localytics"

    const-string v22, "Handler received MESSAGE_HANDLE_PUSH_RECEIVED"

    invoke-static/range {v21 .. v22}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 910
    :cond_15
    move-object/from16 v0, p1

    iget-object v12, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v12, Landroid/content/Intent;

    .line 912
    .restart local v12    # "intent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v21, v0

    new-instance v22, Lcom/localytics/android/SessionHandler$15;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v12}, Lcom/localytics/android/SessionHandler$15;-><init>(Lcom/localytics/android/SessionHandler;Landroid/content/Intent;)V

    invoke-virtual/range {v21 .. v22}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_d
        :pswitch_e
        :pswitch_2
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_0
        :pswitch_12
        :pswitch_13
    .end packed-switch
.end method

.method init(Ljava/lang/String;)V
    .locals 12
    .param p1, "referrerID"    # Ljava/lang/String;

    .prologue
    const-wide/16 v9, 0x0

    .line 1053
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/localytics/android/LocalyticsProvider;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/localytics/android/LocalyticsProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    .line 1055
    const/4 v7, 0x0

    .line 1058
    .local v7, "cursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "api_keys"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_INIT_API_KEY:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_INIT_API_KEY:Ljava/lang/String;

    const/4 v5, 0x1

    new-array v4, v5, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v11, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    aput-object v11, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 1061
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1064
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 1066
    const-string v0, "Localytics"

    const-string v1, "Loading details for API key %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v5, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    aput-object v5, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1069
    :cond_0
    const-string v0, "_id"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/localytics/android/SessionHandler;->mApiKeyId:J

    .line 1071
    const-string v0, "created_time"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    cmp-long v0, v0, v9

    if-nez v0, :cond_1

    .line 1073
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 1074
    .local v8, "values":Landroid/content/ContentValues;
    const-string v0, "created_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1075
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "api_keys"

    sget-object v2, Lcom/localytics/android/SessionHandler;->SELECTION_INIT_API_KEY:Ljava/lang/String;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v9, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    aput-object v9, v3, v5

    invoke-virtual {v0, v1, v8, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1097
    .end local v8    # "values":Landroid/content/ContentValues;
    :cond_1
    :goto_0
    if-eqz v7, :cond_2

    .line 1099
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1100
    const/4 v7, 0x0

    .line 1104
    :cond_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1108
    :try_start_1
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "info"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v5, "play_attribution"

    aput-object v5, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 1110
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1112
    const-string v0, "play_attribution"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1113
    .local v6, "currentReferrerID":Ljava/lang/String;
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1115
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 1116
    .restart local v8    # "values":Landroid/content/ContentValues;
    const-string v0, "play_attribution"

    invoke-virtual {v8, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1117
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "info"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v8, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1123
    .end local v6    # "currentReferrerID":Ljava/lang/String;
    .end local v8    # "values":Landroid/content/ContentValues;
    :cond_3
    if-eqz v7, :cond_4

    .line 1125
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1126
    const/4 v7, 0x0

    .line 1131
    :cond_4
    sget-object v0, Lcom/localytics/android/SessionHandler;->sIsUploadingMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1133
    sget-object v0, Lcom/localytics/android/SessionHandler;->sIsUploadingMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1136
    :cond_5
    sget-object v0, Lcom/localytics/android/SessionHandler;->sIsUploadingProfileMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1138
    sget-object v0, Lcom/localytics/android/SessionHandler;->sIsUploadingProfileMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1144
    :cond_6
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/localytics/android/SessionHandler;->getInstallationId(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1145
    .local v4, "installationID":Ljava/lang/String;
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    sget-object v0, Lcom/localytics/android/SessionHandler;->sUploadHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v5

    move-object v0, p0

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/SessionHandler;->createUploadHandler(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Landroid/os/Looper;)Lcom/localytics/android/UploadHandler;

    move-result-object v0

    iput-object v0, p0, Lcom/localytics/android/SessionHandler;->mUploadHandler:Lcom/localytics/android/UploadHandler;

    .line 1146
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    sget-object v0, Lcom/localytics/android/SessionHandler;->sProfileUploadHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v5

    move-object v0, p0

    move-object v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/SessionHandler;->createUploadHandler(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Landroid/os/Looper;)Lcom/localytics/android/UploadHandler;

    move-result-object v0

    iput-object v0, p0, Lcom/localytics/android/SessionHandler;->mProfileUploadHandler:Lcom/localytics/android/UploadHandler;

    .line 1147
    return-void

    .line 1081
    .end local v4    # "installationID":Ljava/lang/String;
    :cond_7
    :try_start_2
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_8

    .line 1083
    const-string v0, "Localytics"

    const-string v1, "Performing first-time initialization for new API key %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v5, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    aput-object v5, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1086
    :cond_8
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 1087
    .restart local v8    # "values":Landroid/content/ContentValues;
    const-string v0, "api_key"

    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1088
    const-string v0, "uuid"

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1089
    const-string v0, "opt_out"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 1090
    const-string v2, "created_time"

    if-nez p1, :cond_a

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1092
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "api_keys"

    invoke-virtual {v0, v1, v8}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/localytics/android/SessionHandler;->mApiKeyId:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 1097
    .end local v8    # "values":Landroid/content/ContentValues;
    :catchall_0
    move-exception v0

    if-eqz v7, :cond_9

    .line 1099
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1100
    const/4 v7, 0x0

    :cond_9
    throw v0

    .restart local v8    # "values":Landroid/content/ContentValues;
    :cond_a
    move-wide v0, v9

    .line 1090
    goto :goto_1

    .line 1123
    .end local v8    # "values":Landroid/content/ContentValues;
    :catchall_1
    move-exception v0

    if-eqz v7, :cond_b

    .line 1125
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1126
    const/4 v7, 0x0

    :cond_b
    throw v0
.end method

.method open(ZLjava/util/Map;)V
    .locals 28
    .param p1, "ignoreLimits"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1372
    .local p2, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v2}, Lcom/localytics/android/SessionHandler;->getOpenSessionId(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1374
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 1376
    const-string v2, "Localytics"

    const-string v3, "Session was already open"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1579
    :cond_0
    :goto_0
    return-void

    .line 1382
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/localytics/android/SessionHandler;->isOptedOut(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1384
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 1386
    const-string v2, "Localytics"

    const-string v3, "Data collection is opted out"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1396
    :cond_2
    const-wide/16 v12, -0x1

    .line 1399
    .local v12, "closeEventId":J
    const/4 v15, 0x0

    .line 1400
    .local v15, "eventsCursor":Landroid/database/Cursor;
    const/4 v10, 0x0

    .line 1403
    .local v10, "blob_eventsCursor":Landroid/database/Cursor;
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "events"

    sget-object v4, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_EVENT_ID:[Ljava/lang/String;

    sget-object v5, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN:Ljava/lang/String;

    const/4 v7, 0x2

    new-array v6, v7, [Ljava/lang/String;

    const/4 v7, 0x0

    sget-object v24, Lcom/localytics/android/Constants;->CLOSE_EVENT:Ljava/lang/String;

    aput-object v24, v6, v7

    const/4 v7, 0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v24

    sget-wide v26, Lcom/localytics/android/Constants;->SESSION_EXPIRATION:J

    sub-long v24, v24, v26

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v24

    aput-object v24, v6, v7

    sget-object v7, Lcom/localytics/android/SessionHandler;->EVENTS_SORT_ORDER:Ljava/lang/String;

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v15

    .line 1407
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "upload_blob_events"

    sget-object v4, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_BLOB_EVENTS:[Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Lcom/localytics/android/SessionHandler;->UPLOAD_BLOBS_EVENTS_SORT_ORDER:Ljava/lang/String;

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 1409
    const-string v2, "_id"

    invoke-interface {v15, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v17

    .line 1410
    .local v17, "idColumn":I
    new-instance v18, Landroid/database/CursorJoiner;

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_EVENT_ID:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_BLOB_EVENTS:[Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-direct {v0, v15, v2, v10, v3}, Landroid/database/CursorJoiner;-><init>(Landroid/database/Cursor;[Ljava/lang/String;Landroid/database/Cursor;[Ljava/lang/String;)V

    .line 1412
    .local v18, "joiner":Landroid/database/CursorJoiner;
    invoke-virtual/range {v18 .. v18}, Landroid/database/CursorJoiner;->iterator()Ljava/util/Iterator;

    move-result-object v16

    .local v16, "i$":Ljava/util/Iterator;
    :cond_3
    :goto_1
    :pswitch_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroid/database/CursorJoiner$Result;

    .line 1414
    .local v19, "joinerResult":Landroid/database/CursorJoiner$Result;
    sget-object v2, Lcom/localytics/android/SessionHandler$17;->$SwitchMap$android$database$CursorJoiner$Result:[I

    invoke-virtual/range {v19 .. v19}, Landroid/database/CursorJoiner$Result;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 1419
    :pswitch_1
    const-wide/16 v2, -0x1

    cmp-long v2, v2, v12

    if-eqz v2, :cond_5

    .line 1424
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_4

    .line 1426
    const-string v2, "Localytics"

    const-string v3, "There were multiple close events within SESSION_EXPIRATION"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1429
    :cond_4
    const-string v2, "_id"

    invoke-interface {v15, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v15, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v20

    .line 1430
    .local v20, "newClose":J
    cmp-long v2, v20, v12

    if-lez v2, :cond_5

    .line 1432
    move-wide/from16 v12, v20

    .line 1436
    .end local v20    # "newClose":J
    :cond_5
    const-wide/16 v2, -0x1

    cmp-long v2, v2, v12

    if-nez v2, :cond_3

    .line 1438
    move/from16 v0, v17

    invoke-interface {v15, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v12

    goto :goto_1

    .line 1455
    .end local v19    # "joinerResult":Landroid/database/CursorJoiner$Result;
    :cond_6
    if-eqz v15, :cond_7

    .line 1457
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 1458
    const/4 v15, 0x0

    .line 1460
    :cond_7
    if-eqz v10, :cond_8

    .line 1462
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1463
    const/4 v10, 0x0

    .line 1468
    :cond_8
    const-wide/16 v2, -0x1

    cmp-long v2, v2, v12

    if-eqz v2, :cond_c

    .line 1470
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_9

    .line 1472
    const-string v2, "Localytics"

    const-string v3, "Opening old closed session and reconnecting"

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1475
    :cond_9
    move-object/from16 v0, p0

    invoke-direct {v0, v12, v13}, Lcom/localytics/android/SessionHandler;->openClosedSession(J)V

    goto/16 :goto_0

    .line 1455
    .end local v16    # "i$":Ljava/util/Iterator;
    .end local v17    # "idColumn":I
    .end local v18    # "joiner":Landroid/database/CursorJoiner;
    :catchall_0
    move-exception v2

    if-eqz v15, :cond_a

    .line 1457
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 1458
    const/4 v15, 0x0

    .line 1460
    :cond_a
    if-eqz v10, :cond_b

    .line 1462
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1463
    const/4 v10, 0x0

    :cond_b
    throw v2

    .line 1479
    .restart local v16    # "i$":Ljava/util/Iterator;
    .restart local v17    # "idColumn":I
    .restart local v18    # "joiner":Landroid/database/CursorJoiner;
    :cond_c
    const/16 v23, 0x0

    .line 1482
    .local v23, "sessionsCursor":Landroid/database/Cursor;
    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "sessions"

    sget-object v4, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_SESSIONS:[Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "_id"

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v23

    .line 1484
    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->moveToLast()Z

    move-result v2

    if-eqz v2, :cond_16

    .line 1486
    const-string v2, "session_start_wall_time"

    move-object/from16 v0, v23

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    move-object/from16 v0, v23

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v24, Lcom/localytics/android/Constants;->SESSION_EXPIRATION:J

    sub-long v4, v4, v24

    cmp-long v2, v2, v4

    if-ltz v2, :cond_e

    .line 1490
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_d

    .line 1492
    const-string v2, "Localytics"

    const-string v3, "Opening old unclosed session and reconnecting"

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 1552
    :cond_d
    if-eqz v23, :cond_0

    .line 1554
    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->close()V

    .line 1555
    const/16 v23, 0x0

    goto/16 :goto_0

    .line 1498
    :cond_e
    const/4 v15, 0x0

    .line 1501
    :try_start_2
    const-string v2, "_id"

    move-object/from16 v0, v23

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    move-object/from16 v0, v23

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v22

    .line 1502
    .local v22, "sessionId":Ljava/lang/String;
    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v22, v6, v2

    .line 1504
    .local v6, "sessionIdSelection":[Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "events"

    sget-object v4, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_DELETE_EMPTIES_EVENT_ID:[Ljava/lang/String;

    sget-object v5, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_EVENTS_SESSION_KEY_REF:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v15

    .line 1506
    invoke-interface {v15}, Landroid/database/Cursor;->getCount()I

    move-result v2

    if-nez v2, :cond_15

    .line 1508
    new-instance v11, Ljava/util/LinkedList;

    invoke-direct {v11}, Ljava/util/LinkedList;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1511
    .local v11, "blobsToDelete":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Long;>;"
    const/4 v14, 0x0

    .line 1514
    .local v14, "eventHistory":Landroid/database/Cursor;
    :try_start_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "event_history"

    sget-object v4, Lcom/localytics/android/SessionHandler;->PROJECTION_OPEN_DELETE_EMPTIES_PROCESSED_IN_BLOB:[Ljava/lang/String;

    sget-object v5, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_EVENT_HISTORY_SESSION_KEY_REF:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v14

    .line 1515
    :goto_2
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 1517
    const-string v2, "processed_in_blob"

    invoke-interface {v14, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v14, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v11, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    .line 1522
    :catchall_1
    move-exception v2

    if-eqz v14, :cond_f

    .line 1524
    :try_start_4
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 1525
    const/4 v14, 0x0

    :cond_f
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1542
    .end local v6    # "sessionIdSelection":[Ljava/lang/String;
    .end local v11    # "blobsToDelete":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Long;>;"
    .end local v14    # "eventHistory":Landroid/database/Cursor;
    .end local v22    # "sessionId":Ljava/lang/String;
    :catchall_2
    move-exception v2

    if-eqz v15, :cond_10

    .line 1544
    :try_start_5
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 1545
    const/4 v15, 0x0

    :cond_10
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1552
    :catchall_3
    move-exception v2

    if-eqz v23, :cond_11

    .line 1554
    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->close()V

    .line 1555
    const/16 v23, 0x0

    :cond_11
    throw v2

    .line 1522
    .restart local v6    # "sessionIdSelection":[Ljava/lang/String;
    .restart local v11    # "blobsToDelete":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Long;>;"
    .restart local v14    # "eventHistory":Landroid/database/Cursor;
    .restart local v22    # "sessionId":Ljava/lang/String;
    :cond_12
    if-eqz v14, :cond_13

    .line 1524
    :try_start_6
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 1525
    const/4 v14, 0x0

    .line 1529
    :cond_13
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "event_history"

    sget-object v4, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_EVENT_HISTORY_SESSION_KEY_REF:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v6}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1530
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 1532
    .local v8, "blobId":J
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "upload_blobs"

    sget-object v4, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_UPLOAD_BLOBS_ID:Ljava/lang/String;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v7, 0x0

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v24

    aput-object v24, v5, v7

    invoke-virtual {v2, v3, v4, v5}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_3

    .line 1537
    .end local v8    # "blobId":J
    :cond_14
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "sessions"

    sget-object v4, Lcom/localytics/android/SessionHandler;->SELECTION_OPEN_DELETE_EMPTIES_SESSIONS_ID:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v6}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1542
    .end local v11    # "blobsToDelete":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Long;>;"
    .end local v14    # "eventHistory":Landroid/database/Cursor;
    :cond_15
    if-eqz v15, :cond_16

    .line 1544
    :try_start_7
    invoke-interface {v15}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1545
    const/4 v15, 0x0

    .line 1552
    .end local v6    # "sessionIdSelection":[Ljava/lang/String;
    .end local v22    # "sessionId":Ljava/lang/String;
    :cond_16
    if-eqz v23, :cond_17

    .line 1554
    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->close()V

    .line 1555
    const/16 v23, 0x0

    .line 1562
    :cond_17
    if-nez p1, :cond_18

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v2}, Lcom/localytics/android/SessionHandler;->getNumberOfSessions(Lcom/localytics/android/LocalyticsProvider;)J

    move-result-wide v2

    const-wide/16 v4, 0xa

    cmp-long v2, v2, v4

    if-ltz v2, :cond_18

    .line 1564
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 1566
    const-string v2, "Localytics"

    const-string v3, "Maximum number of sessions are already on disk--not writing any new sessions until old sessions are cleared out.  Try calling upload() to store more sessions."

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 1571
    :cond_18
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_19

    .line 1573
    const-string v2, "Localytics"

    const-string v3, "Opening new session"

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1576
    :cond_19
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/localytics/android/SessionHandler;->openNewSession(Ljava/util/Map;)V

    goto/16 :goto_0

    .line 1414
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method optOut(Z)V
    .locals 8
    .param p1, "isOptingOut"    # Z

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 1174
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_0

    .line 1176
    const-string v1, "Localytics"

    const-string v2, "Requested opt-out state is %b"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1180
    :cond_0
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/localytics/android/SessionHandler;->isOptedOut(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Z

    move-result v1

    if-ne v1, p1, :cond_1

    .line 1203
    :goto_0
    return-void

    .line 1185
    :cond_1
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v1}, Lcom/localytics/android/SessionHandler;->getOpenSessionId(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_3

    .line 1190
    invoke-virtual {p0, v6, v5}, Lcom/localytics/android/SessionHandler;->open(ZLjava/util/Map;)V

    .line 1191
    if-eqz p1, :cond_2

    sget-object v1, Lcom/localytics/android/Constants;->OPT_OUT_EVENT:Ljava/lang/String;

    :goto_1
    invoke-virtual {p0, v1, v5}, Lcom/localytics/android/SessionHandler;->tagEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 1192
    invoke-virtual {p0, v5}, Lcom/localytics/android/SessionHandler;->close(Ljava/util/Map;)V

    .line 1199
    :goto_2
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 1200
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "opt_out"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 1201
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v2, "api_keys"

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_OPT_IN_OUT:Ljava/lang/String;

    new-array v4, v6, [Ljava/lang/String;

    iget-wide v5, p0, Lcom/localytics/android/SessionHandler;->mApiKeyId:J

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    .line 1191
    .end local v0    # "values":Landroid/content/ContentValues;
    :cond_2
    sget-object v1, Lcom/localytics/android/Constants;->OPT_IN_EVENT:Ljava/lang/String;

    goto :goto_1

    .line 1196
    :cond_3
    if-eqz p1, :cond_4

    sget-object v1, Lcom/localytics/android/Constants;->OPT_OUT_EVENT:Ljava/lang/String;

    :goto_3
    invoke-virtual {p0, v1, v5}, Lcom/localytics/android/SessionHandler;->tagEvent(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_2

    :cond_4
    sget-object v1, Lcom/localytics/android/Constants;->OPT_IN_EVENT:Ljava/lang/String;

    goto :goto_3
.end method

.method setCustomDimension(ILjava/lang/String;)V
    .locals 3
    .param p1, "dimension"    # I
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 2302
    if-ltz p1, :cond_0

    const/16 v1, 0x9

    if-le p1, v1, :cond_2

    .line 2304
    :cond_0
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_1

    .line 2306
    const-string v1, "Localytics"

    const-string v2, "Only valid dimensions are 0 - 9"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2359
    :cond_1
    :goto_0
    return-void

    .line 2311
    :cond_2
    sget-object v1, Lcom/localytics/android/SessionHandler;->CUSTOM_DIMENSION_KEYS:[Ljava/lang/String;

    aget-object v0, v1, p1

    .line 2313
    .local v0, "key":Ljava/lang/String;
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    new-instance v2, Lcom/localytics/android/SessionHandler$16;

    invoke-direct {v2, p0, v0, p2}, Lcom/localytics/android/SessionHandler$16;-><init>(Lcom/localytics/android/SessionHandler;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method setIdentifier(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 2232
    const/4 v7, 0x0

    .line 2235
    .local v7, "cursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "identifiers"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_SET_IDENTIFIER:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_SET_IDENTIFIER:Ljava/lang/String;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 2237
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2239
    if-nez p2, :cond_2

    .line 2241
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "identifiers"

    const-string v2, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "key"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "key"

    invoke-interface {v7, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v7, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2269
    :cond_0
    :goto_0
    if-eqz v7, :cond_1

    .line 2271
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 2272
    const/4 v7, 0x0

    .line 2275
    :cond_1
    return-void

    .line 2245
    :cond_2
    :try_start_1
    const-string v0, "value"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 2246
    .local v6, "currentValue":Ljava/lang/String;
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2248
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 2249
    .local v8, "values":Landroid/content/ContentValues;
    const-string v0, "key"

    invoke-virtual {v8, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2250
    const-string v0, "value"

    invoke-virtual {v8, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2251
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "identifiers"

    sget-object v2, Lcom/localytics/android/SessionHandler;->SELECTION_SET_IDENTIFIER:Ljava/lang/String;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v1, v8, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 2269
    .end local v6    # "currentValue":Ljava/lang/String;
    .end local v8    # "values":Landroid/content/ContentValues;
    :catchall_0
    move-exception v0

    if-eqz v7, :cond_3

    .line 2271
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 2272
    const/4 v7, 0x0

    :cond_3
    throw v0

    .line 2257
    :cond_4
    if-eqz p2, :cond_0

    .line 2259
    :try_start_2
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 2260
    .restart local v8    # "values":Landroid/content/ContentValues;
    const-string v0, "key"

    invoke-virtual {v8, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2261
    const-string v0, "value"

    invoke-virtual {v8, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2262
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "identifiers"

    invoke-virtual {v0, v1, v8}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method setPushDisabled(I)V
    .locals 4
    .param p1, "disabled"    # I

    .prologue
    const/4 v3, 0x0

    .line 2432
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 2433
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "push_disabled"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2434
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v2, "info"

    invoke-virtual {v1, v2, v0, v3, v3}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 2435
    return-void
.end method

.method setPushRegistrationId(Ljava/lang/String;)V
    .locals 4
    .param p1, "pushRegId"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 2401
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 2402
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "registration_id"

    if-nez p1, :cond_0

    const-string p1, ""

    .end local p1    # "pushRegId":Ljava/lang/String;
    :cond_0
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2403
    const-string v1, "registration_version"

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/localytics/android/DatapointHelper;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2404
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v2, "info"

    invoke-virtual {v1, v2, v0, v3, v3}, Lcom/localytics/android/LocalyticsProvider;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 2405
    return-void
.end method

.method tagEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1, "event"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1939
    .local p2, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/localytics/android/SessionHandler;->tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V

    .line 1940
    return-void
.end method

.method tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V
    .locals 28
    .param p1, "event"    # Ljava/lang/String;
    .param p3, "clv"    # Ljava/lang/Long;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1958
    .local p2, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v3}, Lcom/localytics/android/SessionHandler;->getOpenSessionId(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/Long;

    move-result-object v23

    .line 1959
    .local v23, "openSessionId":Ljava/lang/Long;
    if-nez v23, :cond_1

    .line 1961
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_0

    .line 1963
    const-string v3, "Localytics"

    const-string v4, "Event not written because a session is not open"

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2130
    :cond_0
    :goto_0
    return-void

    .line 1973
    :cond_1
    new-instance v26, Landroid/content/ContentValues;

    invoke-direct/range {v26 .. v26}, Landroid/content/ContentValues;-><init>()V

    .line 1974
    .local v26, "values":Landroid/content/ContentValues;
    const-string v3, "session_key_ref"

    move-object/from16 v0, v26

    move-object/from16 v1, v23

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1975
    const-string v3, "uuid"

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1976
    const-string v3, "event_name"

    move-object/from16 v0, v26

    move-object/from16 v1, p1

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1977
    const-string v3, "real_time"

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1978
    const-string v3, "wall_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1980
    if-eqz p3, :cond_5

    .line 1982
    const-string v3, "clv_increase"

    move-object/from16 v0, v26

    move-object/from16 v1, p3

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1989
    :goto_1
    sget-object v3, Lcom/localytics/android/SessionHandler;->sLastLocation:Landroid/location/Location;

    if-eqz v3, :cond_2

    .line 1991
    const-string v3, "event_lat"

    sget-object v4, Lcom/localytics/android/SessionHandler;->sLastLocation:Landroid/location/Location;

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 1992
    const-string v3, "event_lng"

    sget-object v4, Lcom/localytics/android/SessionHandler;->sLastLocation:Landroid/location/Location;

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 1998
    :cond_2
    sget-object v3, Lcom/localytics/android/Constants;->OPEN_EVENT:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 2000
    const/4 v11, 0x0

    .line 2003
    .local v11, "cursor":Landroid/database/Cursor;
    :try_start_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v4, "sessions"

    sget-object v5, Lcom/localytics/android/SessionHandler;->PROJECTION_TAG_EVENT:[Ljava/lang/String;

    sget-object v6, Lcom/localytics/android/SessionHandler;->SELECTION_TAG_EVENT:Ljava/lang/String;

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v27

    aput-object v27, v7, v8

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 2006
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 2008
    const-string v3, "wall_time"

    const-string v4, "session_start_wall_time"

    invoke-interface {v11, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v11, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2018
    if-eqz v11, :cond_3

    .line 2020
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 2021
    const/4 v11, 0x0

    .line 2026
    .end local v11    # "cursor":Landroid/database/Cursor;
    :cond_3
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-virtual {v3}, Lcom/localytics/android/LocalyticsProvider;->getUserIdAndType()Ljava/util/Map;

    move-result-object v19

    .line 2027
    .local v19, "id":Ljava/util/Map;
    const-string v3, "id"

    move-object/from16 v0, v19

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 2028
    .local v12, "customerID":Ljava/lang/String;
    const-string v3, "type"

    move-object/from16 v0, v19

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ljava/lang/String;

    .line 2029
    .local v24, "userType":Ljava/lang/String;
    const-string v3, "customer_id"

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2030
    const-string v3, "user_type"

    move-object/from16 v0, v26

    move-object/from16 v1, v24

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2033
    :try_start_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v3}, Lcom/localytics/android/UploadHandler;->getIdentifiers(Lcom/localytics/android/LocalyticsProvider;)Lorg/json/JSONObject;

    move-result-object v21

    .line 2034
    .local v21, "identifiers":Lorg/json/JSONObject;
    if-eqz v21, :cond_4

    .line 2036
    const-string v3, "ids"

    invoke-virtual/range {v21 .. v21}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 2046
    .end local v21    # "identifiers":Lorg/json/JSONObject;
    :cond_4
    :goto_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v4, "events"

    move-object/from16 v0, v26

    invoke-virtual {v3, v4, v0}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v15

    .line 2048
    .local v15, "eventId":J
    const-wide/16 v3, -0x1

    cmp-long v3, v3, v15

    if-nez v3, :cond_8

    .line 2050
    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Inserting event failed"

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 1986
    .end local v12    # "customerID":Ljava/lang/String;
    .end local v15    # "eventId":J
    .end local v19    # "id":Ljava/util/Map;
    .end local v24    # "userType":Ljava/lang/String;
    :cond_5
    const-string v3, "clv_increase"

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto/16 :goto_1

    .line 2013
    .restart local v11    # "cursor":Landroid/database/Cursor;
    :cond_6
    :try_start_2
    new-instance v3, Ljava/lang/AssertionError;

    const-string v4, "During tag of open event, session didn\'t exist"

    invoke-direct {v3, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2018
    :catchall_0
    move-exception v3

    if-eqz v11, :cond_7

    .line 2020
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 2021
    const/4 v11, 0x0

    :cond_7
    throw v3

    .line 2039
    .end local v11    # "cursor":Landroid/database/Cursor;
    .restart local v12    # "customerID":Ljava/lang/String;
    .restart local v19    # "id":Ljava/util/Map;
    .restart local v24    # "userType":Ljava/lang/String;
    :catch_0
    move-exception v13

    .line 2041
    .local v13, "e":Lorg/json/JSONException;
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_4

    .line 2043
    const-string v3, "Localytics"

    const-string v4, "Caught exception"

    invoke-static {v3, v4, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 2057
    .end local v13    # "e":Lorg/json/JSONException;
    .restart local v15    # "eventId":J
    :cond_8
    const/16 v17, 0x0

    .local v17, "i":I
    :goto_3
    const/16 v3, 0xa

    move/from16 v0, v17

    if-ge v0, v3, :cond_b

    .line 2059
    sget-object v3, Lcom/localytics/android/SessionHandler;->CUSTOM_DIMENSION_KEYS:[Ljava/lang/String;

    aget-object v22, v3, v17

    .line 2060
    .local v22, "key":Ljava/lang/String;
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->getCustomDimension(I)Ljava/lang/String;

    move-result-object v25

    .line 2061
    .local v25, "value":Ljava/lang/String;
    if-eqz v25, :cond_a

    .line 2063
    if-nez p2, :cond_9

    .line 2065
    new-instance p2, Ljava/util/TreeMap;

    .end local p2    # "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-direct/range {p2 .. p2}, Ljava/util/TreeMap;-><init>()V

    .line 2069
    .restart local p2    # "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_9
    move-object/from16 v0, p2

    move-object/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_a

    .line 2071
    move-object/from16 v0, p2

    move-object/from16 v1, v22

    move-object/from16 v2, v25

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2057
    :cond_a
    add-int/lit8 v17, v17, 0x1

    goto :goto_3

    .line 2079
    .end local v22    # "key":Ljava/lang/String;
    .end local v25    # "value":Ljava/lang/String;
    :cond_b
    if-eqz p2, :cond_f

    .line 2082
    new-instance v26, Landroid/content/ContentValues;

    .end local v26    # "values":Landroid/content/ContentValues;
    invoke-direct/range {v26 .. v26}, Landroid/content/ContentValues;-><init>()V

    .line 2084
    .restart local v26    # "values":Landroid/content/ContentValues;
    const-string v3, "%s:%s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-string v6, ""

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 2085
    .local v10, "applicationAttributePrefix":Ljava/lang/String;
    const/4 v9, 0x0

    .line 2087
    .local v9, "applicationAttributeCount":I
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v18

    .end local v19    # "id":Ljava/util/Map;
    .local v18, "i$":Ljava/util/Iterator;
    :cond_c
    :goto_4
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map$Entry;

    .line 2092
    .local v14, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 2094
    add-int/lit8 v9, v9, 0x1

    .line 2095
    const/16 v3, 0x32

    if-gt v9, v3, :cond_c

    .line 2101
    :cond_d
    const-string v3, "events_key_ref"

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2102
    const-string v4, "attribute_key"

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v0, v26

    invoke-virtual {v0, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2103
    const-string v4, "attribute_value"

    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v0, v26

    invoke-virtual {v0, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2105
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v4, "attributes"

    move-object/from16 v0, v26

    invoke-virtual {v3, v4, v0}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v19

    .line 2107
    .local v19, "id":J
    const-wide/16 v3, -0x1

    cmp-long v3, v3, v19

    if-nez v3, :cond_e

    .line 2109
    new-instance v3, Ljava/lang/AssertionError;

    const-string v4, "Inserting attribute failed"

    invoke-direct {v3, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3

    .line 2112
    :cond_e
    invoke-virtual/range {v26 .. v26}, Landroid/content/ContentValues;->clear()V

    goto :goto_4

    .line 2119
    .end local v9    # "applicationAttributeCount":I
    .end local v10    # "applicationAttributePrefix":Ljava/lang/String;
    .end local v14    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v18    # "i$":Ljava/util/Iterator;
    .end local v19    # "id":J
    :cond_f
    sget-object v3, Lcom/localytics/android/Constants;->OPEN_EVENT:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lcom/localytics/android/Constants;->CLOSE_EVENT:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lcom/localytics/android/Constants;->OPT_IN_EVENT:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lcom/localytics/android/Constants;->OPT_OUT_EVENT:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lcom/localytics/android/Constants;->FLOW_EVENT:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 2121
    new-instance v26, Landroid/content/ContentValues;

    .end local v26    # "values":Landroid/content/ContentValues;
    invoke-direct/range {v26 .. v26}, Landroid/content/ContentValues;-><init>()V

    .line 2122
    .restart local v26    # "values":Landroid/content/ContentValues;
    const-string v3, "name"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v5

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2123
    const-string v3, "type"

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v26

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2124
    const-string v3, "session_key_ref"

    move-object/from16 v0, v26

    move-object/from16 v1, v23

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2125
    const-string v3, "processed_in_blob"

    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    .line 2126
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v4, "event_history"

    move-object/from16 v0, v26

    invoke-virtual {v3, v4, v0}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 2128
    invoke-direct/range {p0 .. p0}, Lcom/localytics/android/SessionHandler;->conditionallyAddFlowEvent()V

    goto/16 :goto_0
.end method

.method tagScreen(Ljava/lang/String;)V
    .locals 11
    .param p1, "screen"    # Ljava/lang/String;

    .prologue
    const/4 v10, 0x1

    .line 2165
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v0}, Lcom/localytics/android/SessionHandler;->getOpenSessionId(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/Long;

    move-result-object v7

    .line 2166
    .local v7, "openSessionId":Ljava/lang/Long;
    if-nez v7, :cond_1

    .line 2168
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 2170
    const-string v0, "Localytics"

    const-string v1, "Tag not written because the session was not open"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2218
    :cond_0
    :goto_0
    return-void

    .line 2178
    :cond_1
    const/4 v6, 0x0

    .line 2181
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "event_history"

    sget-object v2, Lcom/localytics/android/SessionHandler;->PROJECTION_TAG_SCREEN:[Ljava/lang/String;

    sget-object v3, Lcom/localytics/android/SessionHandler;->SELECTION_TAG_SCREEN:Ljava/lang/String;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v9, 0x1

    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v5

    const/4 v5, 0x1

    invoke-virtual {v7}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v5

    sget-object v5, Lcom/localytics/android/SessionHandler;->SORT_ORDER_TAG_SCREEN:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 2186
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2188
    const-string v0, "name"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2190
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_2

    .line 2192
    const-string v0, "Localytics"

    const-string v1, "Suppressed duplicate screen %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2200
    :cond_2
    if-eqz v6, :cond_0

    .line 2202
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2203
    const/4 v6, 0x0

    goto :goto_0

    .line 2200
    :cond_3
    if-eqz v6, :cond_4

    .line 2202
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2203
    const/4 v6, 0x0

    .line 2210
    :cond_4
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 2211
    .local v8, "values":Landroid/content/ContentValues;
    const-string v0, "name"

    invoke-virtual {v8, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2212
    const-string v0, "type"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2213
    const-string v0, "session_key_ref"

    invoke-virtual {v8, v0, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 2214
    const-string v0, "processed_in_blob"

    invoke-virtual {v8, v0}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    .line 2215
    iget-object v0, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "event_history"

    invoke-virtual {v0, v1, v8}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 2217
    invoke-direct {p0}, Lcom/localytics/android/SessionHandler;->conditionallyAddFlowEvent()V

    goto/16 :goto_0

    .line 2200
    .end local v8    # "values":Landroid/content/ContentValues;
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_5

    .line 2202
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 2203
    const/4 v6, 0x0

    :cond_5
    throw v0
.end method

.method upload(Ljava/lang/Runnable;)V
    .locals 4
    .param p1, "callback"    # Ljava/lang/Runnable;

    .prologue
    .line 2654
    sget-object v1, Lcom/localytics/android/SessionHandler;->sIsUploadingMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2656
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_0

    .line 2658
    const-string v1, "Localytics"

    const-string v2, "Already uploading"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2661
    :cond_0
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mUploadHandler:Lcom/localytics/android/UploadHandler;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mUploadHandler:Lcom/localytics/android/UploadHandler;

    const/4 v3, 0x2

    invoke-virtual {v2, v3, p1}, Lcom/localytics/android/UploadHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/localytics/android/UploadHandler;->sendMessage(Landroid/os/Message;)Z

    .line 2691
    :cond_1
    :goto_0
    return-void

    .line 2667
    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v1}, Lcom/localytics/android/SessionHandler;->preUploadBuildBlobs(Lcom/localytics/android/LocalyticsProvider;)V

    .line 2669
    sget-object v1, Lcom/localytics/android/SessionHandler;->sIsUploadingMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2670
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mUploadHandler:Lcom/localytics/android/UploadHandler;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mUploadHandler:Lcom/localytics/android/UploadHandler;

    const/4 v3, 0x1

    invoke-virtual {v2, v3, p1}, Lcom/localytics/android/UploadHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/localytics/android/UploadHandler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2672
    :catch_0
    move-exception v0

    .line 2674
    .local v0, "e":Ljava/lang/Exception;
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_3

    .line 2676
    const-string v1, "Localytics"

    const-string v2, "Error occurred during upload"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2679
    :cond_3
    sget-object v1, Lcom/localytics/android/SessionHandler;->sIsUploadingMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2682
    if-eqz p1, :cond_1

    .line 2688
    new-instance v1, Ljava/lang/Thread;

    const-string v2, "upload_callback"

    invoke-direct {v1, p1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method uploadProfile(Ljava/lang/Runnable;)V
    .locals 4
    .param p1, "callback"    # Ljava/lang/Runnable;

    .prologue
    .line 2707
    sget-object v1, Lcom/localytics/android/SessionHandler;->sIsUploadingProfileMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2709
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_0

    .line 2711
    const-string v1, "Localytics"

    const-string v2, "Already uploading profile"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2714
    :cond_0
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProfileUploadHandler:Lcom/localytics/android/UploadHandler;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mProfileUploadHandler:Lcom/localytics/android/UploadHandler;

    const/4 v3, 0x4

    invoke-virtual {v2, v3, p1}, Lcom/localytics/android/UploadHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/localytics/android/UploadHandler;->sendMessage(Landroid/os/Message;)Z

    .line 2742
    :cond_1
    :goto_0
    return-void

    .line 2720
    :cond_2
    :try_start_0
    sget-object v1, Lcom/localytics/android/SessionHandler;->sIsUploadingProfileMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2721
    iget-object v1, p0, Lcom/localytics/android/SessionHandler;->mProfileUploadHandler:Lcom/localytics/android/UploadHandler;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mProfileUploadHandler:Lcom/localytics/android/UploadHandler;

    const/4 v3, 0x3

    invoke-virtual {v2, v3, p1}, Lcom/localytics/android/UploadHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/localytics/android/UploadHandler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2723
    :catch_0
    move-exception v0

    .line 2725
    .local v0, "e":Ljava/lang/Exception;
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_3

    .line 2727
    const-string v1, "Localytics"

    const-string v2, "Error occurred during profile upload"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2730
    :cond_3
    sget-object v1, Lcom/localytics/android/SessionHandler;->sIsUploadingProfileMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler;->mApiKey:Ljava/lang/String;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2733
    if-eqz p1, :cond_1

    .line 2739
    new-instance v1, Ljava/lang/Thread;

    const-string v2, "upload_profile_callback"

    invoke-direct {v1, p1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method
