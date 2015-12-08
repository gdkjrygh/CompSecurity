.class public Lorg/chromium/content/browser/ContentSettings;
.super Ljava/lang/Object;
.source "ContentSettings.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "ContentSettings"


# instance fields
.field private mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

.field private mNativeContentSettings:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lorg/chromium/content/browser/ContentSettings;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ContentSettings;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore;J)V
    .locals 4
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "nativeContentView"    # J

    .prologue
    const-wide/16 v2, 0x0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-wide v2, p0, Lorg/chromium/content/browser/ContentSettings;->mNativeContentSettings:J

    .line 31
    invoke-static {}, Lorg/chromium/base/ThreadUtils;->assertOnUiThread()V

    .line 32
    iput-object p1, p0, Lorg/chromium/content/browser/ContentSettings;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 33
    invoke-direct {p0, p2, p3}, Lorg/chromium/content/browser/ContentSettings;->nativeInit(J)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/content/browser/ContentSettings;->mNativeContentSettings:J

    .line 34
    sget-boolean v0, Lorg/chromium/content/browser/ContentSettings;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/ContentSettings;->mNativeContentSettings:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 35
    :cond_0
    return-void
.end method

.method private native nativeGetJavaScriptEnabled(J)Z
.end method

.method private native nativeInit(J)J
.end method

.method private onNativeContentSettingsDestroyed(J)V
    .locals 3
    .param p1, "nativeContentSettings"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 43
    sget-boolean v0, Lorg/chromium/content/browser/ContentSettings;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/ContentSettings;->mNativeContentSettings:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 44
    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/ContentSettings;->mNativeContentSettings:J

    .line 45
    return-void
.end method


# virtual methods
.method public getJavaScriptEnabled()Z
    .locals 4

    .prologue
    .line 53
    invoke-static {}, Lorg/chromium/base/ThreadUtils;->assertOnUiThread()V

    .line 54
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentSettings;->mNativeContentSettings:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/ContentSettings;->mNativeContentSettings:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentSettings;->nativeGetJavaScriptEnabled(J)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
