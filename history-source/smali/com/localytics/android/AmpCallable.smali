.class abstract Lcom/localytics/android/AmpCallable;
.super Ljava/lang/Object;
.source "AmpCallable.java"


# static fields
.field public static final ON_AMP_DESTROY:I = 0x1

.field public static final ON_AMP_JS_CLOSE_WINDOW:I = 0x4

.field public static final ON_AMP_JS_GET_ATTRIBUTES:I = 0x7

.field public static final ON_AMP_JS_GET_CUSTOM_DIMENSIONS:I = 0x6

.field public static final ON_AMP_JS_GET_IDENTIFIERS:I = 0x5

.field public static final ON_AMP_JS_SET_CUSTOM_DIMENSIONS:I = 0x8

.field public static final ON_AMP_JS_TAG_EVENT:I = 0x3

.field public static final ON_AMP_NAVIGATE:I = 0xf

.field public static final ON_AMP_TAG_ACTION:I = 0x2

.field public static final ON_AMP_TEST_CLOSE_CAMPAIGN_LIST:I = 0xa

.field public static final ON_AMP_TEST_COPY_INSTALL_ID:I = 0xe

.field public static final ON_AMP_TEST_COPY_PUSH_TOKEN:I = 0xd

.field public static final ON_AMP_TEST_POPUP_CAMPAIGN_LIST:I = 0x9

.field public static final ON_AMP_TEST_REFRESH_CAMPAIGN_LIST:I = 0xc

.field public static final ON_AMP_TEST_SHOW_CAMPAIGN:I = 0xb


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method abstract call([Ljava/lang/Object;)Ljava/lang/Object;
.end method
