.class Lcom/localytics/android/AmpConstants;
.super Lcom/localytics/android/Constants;
.source "AmpConstants.java"


# static fields
.field public static final ACTION_CLICK:Ljava/lang/String; = "click"

.field public static final ACTION_DISMISS:Ljava/lang/String; = "X"

.field public static final ADID_STRING:Ljava/lang/String; = "adid"

.field public static final AMPACTION_STRING:Ljava/lang/String; = "ampAction"

.field public static final AMP_AB_KEY:Ljava/lang/String; = "ampAB"

.field public static final AMP_ACTION_KEY:Ljava/lang/String; = "ampAction"

.field public static final AMP_CAMPAIGN_ID_KEY:Ljava/lang/String; = "ampCampaignId"

.field public static final AMP_CAMPAIGN_KEY:Ljava/lang/String; = "ampCampaign"

.field public static final AMP_DURATION_KEY:Ljava/lang/String; = "ampDuration"

.field public static final AMP_EVENT_NAME_KEY:Ljava/lang/String; = "ampView"

.field public static final AMP_FIRST_RUN_TRIGGER:Ljava/lang/String; = "AMP First Run"

.field public static final AMP_KEY:Ljava/lang/String; = "amp"

.field public static final AMP_START_TRIGGER:Ljava/lang/String; = "AMP Loaded"

.field public static final AMP_UPGRADE_TRIGGER:Ljava/lang/String; = "AMP upgrade"

.field public static final CONDITIONS_KEY:Ljava/lang/String; = "conditions"

.field public static final DEFAULT_HTML_PAGE:Ljava/lang/String; = "index.html"

.field public static final DEFAULT_ZIP_PAGE:Ljava/lang/String; = "amp_rule_%d.zip"

.field public static final DEVICE_BOTH:Ljava/lang/String; = "both"

.field public static final DEVICE_PHONE:Ljava/lang/String; = "phone"

.field public static final DEVICE_TABLET:Ljava/lang/String; = "tablet"

.field public static final DISMISS_BUTTON_SIDE:F = 40.0f

.field public static final DISPLAY_EVENTS_KEY:Ljava/lang/String; = "display_events"

.field public static final HEIGHT_KEY:Ljava/lang/String; = "height"

.field public static final KEY_BASE_PATH:Ljava/lang/String; = "base_path"

.field public static final KEY_DISPLAY_HEIGHT:Ljava/lang/String; = "display_height"

.field public static final KEY_DISPLAY_WIDTH:Ljava/lang/String; = "display_width"

.field public static final KEY_HTML_URL:Ljava/lang/String; = "html_url"

.field public static final LOCALYTICS_DIR:Ljava/lang/String; = ".localytics"

.field public static final OPEN_EXTERNAL:Ljava/lang/String; = "ampExternalOpen"

.field public static final PHONE_SIZE_KEY:Ljava/lang/String; = "phone_size"

.field public static final PROTOCOL_FILE:Ljava/lang/String; = "file"

.field public static final PROTOCOL_HTTP:Ljava/lang/String; = "http"

.field public static final PROTOCOL_HTTPS:Ljava/lang/String; = "https"

.field public static final TABLET_SIZE_KEY:Ljava/lang/String; = "tablet_size"

.field public static final TEST_MODE_UPDATE_DATA:Ljava/lang/String; = "Test Mode Update Data"

.field public static final USE_EXTERNAL_DIRECTORY:Z = false

.field public static final WIDTH_KEY:Ljava/lang/String; = "width"

.field private static final sTestModeEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 15
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/localytics/android/AmpConstants;->sTestModeEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 119
    invoke-direct {p0}, Lcom/localytics/android/Constants;-><init>()V

    .line 120
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static isTestModeEnabled()Z
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/localytics/android/AmpConstants;->sTestModeEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public static setTestModeEnabled(Z)V
    .locals 1
    .param p0, "enabled"    # Z

    .prologue
    .line 19
    sget-object v0, Lcom/localytics/android/AmpConstants;->sTestModeEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    return-void
.end method
