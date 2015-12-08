.class public Lorg/chromium/ui/base/LocalizationUtils;
.super Ljava/lang/Object;
.source "LocalizationUtils.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "l10n_util"
.end annotation


# static fields
.field public static final LEFT_TO_RIGHT:I = 0x2

.field public static final RIGHT_TO_LEFT:I = 0x1

.field public static final UNKNOWN_DIRECTION:I

.field private static sIsLayoutRtl:Ljava/lang/Boolean;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDefaultLocale()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 40
    invoke-static {}, Lorg/chromium/base/LocaleUtils;->getDefaultLocale()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getDisplayNameForLocale(Ljava/util/Locale;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1
    .param p0, "locale"    # Ljava/util/Locale;
    .param p1, "displayLocale"    # Ljava/util/Locale;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 50
    invoke-virtual {p0, p1}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDurationString(J)Ljava/lang/String;
    .locals 2
    .param p0, "timeInMillis"    # J

    .prologue
    .line 91
    invoke-static {p0, p1}, Lorg/chromium/ui/base/LocalizationUtils;->nativeGetDurationString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getFirstStrongCharacterDirection(Ljava/lang/String;)I
    .locals 1
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    .line 81
    invoke-static {p0}, Lorg/chromium/ui/base/LocalizationUtils;->nativeGetFirstStrongCharacterDirection(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private static getJavaLocale(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Locale;
    .locals 1
    .param p0, "language"    # Ljava/lang/String;
    .param p1, "country"    # Ljava/lang/String;
    .param p2, "variant"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 45
    new-instance v0, Ljava/util/Locale;

    invoke-direct {v0, p0, p1, p2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static isLayoutRtl()Z
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 64
    sget-object v2, Lorg/chromium/ui/base/LocalizationUtils;->sIsLayoutRtl:Ljava/lang/Boolean;

    if-nez v2, :cond_0

    .line 65
    invoke-static {}, Lorg/chromium/base/ApplicationStatus;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 67
    .local v0, "configuration":Landroid/content/res/Configuration;
    invoke-static {v0}, Lorg/chromium/base/ApiCompatibilityUtils;->getLayoutDirection(Landroid/content/res/Configuration;)I

    move-result v2

    if-ne v2, v1, :cond_1

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lorg/chromium/ui/base/LocalizationUtils;->sIsLayoutRtl:Ljava/lang/Boolean;

    .line 72
    :cond_0
    sget-object v1, Lorg/chromium/ui/base/LocalizationUtils;->sIsLayoutRtl:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    return v1

    .line 67
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private static native nativeGetDurationString(J)Ljava/lang/String;
.end method

.method private static native nativeGetFirstStrongCharacterDirection(Ljava/lang/String;)I
.end method
