.class Lcom/localytics/android/Constants;
.super Ljava/lang/Object;
.source "Constants.java"


# static fields
.field public static ANALYTICS_URL:Ljava/lang/String; = null

.field static final CLOSE_EVENT:Ljava/lang/String;

.field static final CURRENT_API_LEVEL:I

.field static final EVENT_FORMAT:Ljava/lang/String; = "%s:%s"

.field static final FLOW_EVENT:Ljava/lang/String;

.field public static final IS_DEVICE_IDENTIFIER_UPLOADED:Z = true

.field public static final IS_EXCEPTION_SUPPRESSION_ENABLED:Z = true

.field public static IS_LOGGABLE:Z = false

.field public static final IS_PARAMETER_CHECKING_ENABLED:Z = true

.field public static final LOCALYTICS_CLIENT_LIBRARY_VERSION:Ljava/lang/String; = "androida_2.72"

.field public static final LOCALYTICS_METADATA_APP_KEY:Ljava/lang/String; = "LOCALYTICS_APP_KEY"

.field public static final LOCALYTICS_METADATA_NOTIFICATION_ICON:Ljava/lang/String; = "LOCALYTICS_NOTIFICATION_ICON"

.field public static final LOCALYTICS_METADATA_ROLLUP_KEY:Ljava/lang/String; = "LOCALYTICS_ROLLUP_KEY"

.field public static final LOCALYTICS_PACKAGE_NAME:Ljava/lang/String; = "com.localytics.android"

.field public static final LOG_TAG:Ljava/lang/String; = "Localytics"

.field public static final MAX_CUSTOM_DIMENSIONS:I = 0xa

.field public static final MAX_NAME_LENGTH:I = 0x80

.field public static final MAX_NUM_ATTRIBUTES:I = 0x32

.field public static final MAX_NUM_SESSIONS:I = 0xa

.field public static final MAX_VALUE_LENGTH:I = 0xff

.field static final OPEN_EVENT:Ljava/lang/String;

.field static final OPT_IN_EVENT:Ljava/lang/String;

.field static final OPT_OUT_EVENT:Ljava/lang/String;

.field public static PROFILES_URL:Ljava/lang/String;

.field public static SESSION_EXPIRATION:J

.field public static USE_HTTPS:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 105
    const-wide/16 v0, 0x3a98

    sput-wide v0, Lcom/localytics/android/Constants;->SESSION_EXPIRATION:J

    .line 118
    sput-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    .line 123
    sput-boolean v4, Lcom/localytics/android/Constants;->USE_HTTPS:Z

    .line 149
    invoke-static {}, Lcom/localytics/android/DatapointHelper;->getApiLevel()I

    move-result v0

    sput v0, Lcom/localytics/android/Constants;->CURRENT_API_LEVEL:I

    .line 154
    const-string v0, "analytics.localytics.com"

    sput-object v0, Lcom/localytics/android/Constants;->ANALYTICS_URL:Ljava/lang/String;

    .line 159
    const-string v0, "profile.localytics.com"

    sput-object v0, Lcom/localytics/android/Constants;->PROFILES_URL:Ljava/lang/String;

    .line 179
    const-string v0, "%s:%s"

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "com.localytics.android"

    aput-object v2, v1, v3

    const-string v2, "open"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/Constants;->OPEN_EVENT:Ljava/lang/String;

    .line 184
    const-string v0, "%s:%s"

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "com.localytics.android"

    aput-object v2, v1, v3

    const-string v2, "close"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/Constants;->CLOSE_EVENT:Ljava/lang/String;

    .line 189
    const-string v0, "%s:%s"

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "com.localytics.android"

    aput-object v2, v1, v3

    const-string v2, "opt_in"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/Constants;->OPT_IN_EVENT:Ljava/lang/String;

    .line 194
    const-string v0, "%s:%s"

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "com.localytics.android"

    aput-object v2, v1, v3

    const-string v2, "opt_out"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/Constants;->OPT_OUT_EVENT:Ljava/lang/String;

    .line 199
    const-string v0, "%s:%s"

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "com.localytics.android"

    aput-object v2, v1, v3

    const-string v2, "flow"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/Constants;->FLOW_EVENT:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    .prologue
    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
