.class public Lorg/xwalk/core/internal/XWalkSettings;
.super Ljava/lang/Object;
.source "XWalkSettings.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkSettings$EventHandler;,
        Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final MAXIMUM_FONT_SIZE:I = 0x48

.field private static final MINIMUM_FONT_SIZE:I = 0x1

.field private static final TAG:Ljava/lang/String; = "XWalkSettings"

.field private static sAppCachePathIsSet:Z

.field private static final sGlobalContentSettingsLock:Ljava/lang/Object;


# instance fields
.field private mAllowContentUrlAccess:Z

.field private mAllowFileAccessFromFileURLs:Z

.field private mAllowFileUrlAccess:Z

.field private mAllowScriptsToCloseWindows:Z

.field private mAllowUniversalAccessFromFileURLs:Z

.field private mAppCacheEnabled:Z

.field private mBlockNetworkLoads:Z

.field private mCacheMode:I

.field private final mContext:Landroid/content/Context;

.field private mDatabaseEnabled:Z

.field private mDefaultVideoPosterURL:Ljava/lang/String;

.field private mDomStorageEnabled:Z

.field private final mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

.field private mGeolocationEnabled:Z

.field private mImagesEnabled:Z

.field private mIsUpdateWebkitPrefsMessagePending:Z

.field private mJavaScriptCanOpenWindowsAutomatically:Z

.field private mJavaScriptEnabled:Z

.field private mLoadsImagesAutomatically:Z

.field private mMediaPlaybackRequiresUserGesture:Z

.field private mNativeXWalkSettings:J

.field private mShouldFocusFirstNode:Z

.field private mSupportMultipleWindows:Z

.field private mUseWideViewport:Z

.field private mUserAgent:Ljava/lang/String;

.field private final mXWalkSettingsLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 22
    const-class v0, Lorg/xwalk/core/internal/XWalkSettings;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/xwalk/core/internal/XWalkSettings;->$assertionsDisabled:Z

    .line 61
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lorg/xwalk/core/internal/XWalkSettings;->sGlobalContentSettingsLock:Ljava/lang/Object;

    .line 65
    sput-boolean v1, Lorg/xwalk/core/internal/XWalkSettings;->sAppCachePathIsSet:Z

    return-void

    :cond_0
    move v0, v1

    .line 22
    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;JZ)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "nativeWebContents"    # J
    .param p4, "isAccessFromFileURLsGrantedByDefault"    # Z

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    .line 36
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowScriptsToCloseWindows:Z

    .line 37
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mLoadsImagesAutomatically:Z

    .line 38
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mImagesEnabled:Z

    .line 39
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mJavaScriptEnabled:Z

    .line 40
    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowUniversalAccessFromFileURLs:Z

    .line 41
    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileAccessFromFileURLs:Z

    .line 42
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mJavaScriptCanOpenWindowsAutomatically:Z

    .line 43
    const/4 v2, -0x1

    iput v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mCacheMode:I

    .line 44
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mSupportMultipleWindows:Z

    .line 45
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAppCacheEnabled:Z

    .line 46
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDomStorageEnabled:Z

    .line 47
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDatabaseEnabled:Z

    .line 48
    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUseWideViewport:Z

    .line 49
    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mMediaPlaybackRequiresUserGesture:Z

    .line 54
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowContentUrlAccess:Z

    .line 55
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileUrlAccess:Z

    .line 56
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mShouldFocusFirstNode:Z

    .line 57
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mGeolocationEnabled:Z

    .line 68
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    .line 71
    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mIsUpdateWebkitPrefsMessagePending:Z

    .line 142
    invoke-static {}, Lorg/chromium/base/ThreadUtils;->assertOnUiThread()V

    .line 143
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mContext:Landroid/content/Context;

    .line 144
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mContext:Landroid/content/Context;

    const-string v3, "android.permission.INTERNET"

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v4

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    :cond_0
    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mBlockNetworkLoads:Z

    .line 149
    if-eqz p4, :cond_1

    .line 150
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowUniversalAccessFromFileURLs:Z

    .line 151
    iput-boolean v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileAccessFromFileURLs:Z

    .line 154
    :cond_1
    # getter for: Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;->sInstance:Ljava/lang/String;
    invoke-static {}, Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;->access$500()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUserAgent:Ljava/lang/String;

    .line 156
    new-instance v0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;-><init>(Lorg/xwalk/core/internal/XWalkSettings;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    .line 158
    invoke-virtual {p0, p2, p3}, Lorg/xwalk/core/internal/XWalkSettings;->setWebContents(J)V

    .line 159
    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    invoke-static {}, Lorg/xwalk/core/internal/XWalkSettings;->nativeGetDefaultUserAgent()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/XWalkSettings;)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkSettings;

    .prologue
    .line 23
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$200(Lorg/xwalk/core/internal/XWalkSettings;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkSettings;

    .prologue
    .line 23
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkSettings;->updateWebkitPreferencesOnUiThread()V

    return-void
.end method

.method static synthetic access$300(Lorg/xwalk/core/internal/XWalkSettings;)Z
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkSettings;

    .prologue
    .line 23
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mIsUpdateWebkitPrefsMessagePending:Z

    return v0
.end method

.method static synthetic access$302(Lorg/xwalk/core/internal/XWalkSettings;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkSettings;
    .param p1, "x1"    # Z

    .prologue
    .line 23
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mIsUpdateWebkitPrefsMessagePending:Z

    return p1
.end method

.method static synthetic access$400(Lorg/xwalk/core/internal/XWalkSettings;)J
    .locals 2
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkSettings;

    .prologue
    .line 23
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    return-wide v0
.end method

.method static synthetic access$700(Lorg/xwalk/core/internal/XWalkSettings;J)V
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkSettings;
    .param p1, "x1"    # J

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkSettings;->nativeUpdateUserAgent(J)V

    return-void
.end method

.method private getAppCacheEnabled()Z
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 511
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAppCacheEnabled:Z

    return v0
.end method

.method public static getDefaultUserAgent()Ljava/lang/String;
    .locals 1

    .prologue
    .line 595
    # getter for: Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;->sInstance:Ljava/lang/String;
    invoke-static {}, Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;->access$500()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getUserAgentLocked()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 633
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUserAgent:Ljava/lang/String;

    return-object v0
.end method

.method private native nativeDestroy(J)V
.end method

.method private static native nativeGetDefaultUserAgent()Ljava/lang/String;
.end method

.method private native nativeInit(J)J
.end method

.method private native nativeUpdateEverythingLocked(J)V
.end method

.method private native nativeUpdateUserAgent(J)V
.end method

.method private native nativeUpdateWebkitPreferences(J)V
.end method

.method private nativeXWalkSettingsGone(J)V
    .locals 5
    .param p1, "nativeXWalkSettings"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const-wide/16 v2, 0x0

    .line 177
    sget-boolean v0, Lorg/xwalk/core/internal/XWalkSettings;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 178
    :cond_1
    iput-wide v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    .line 179
    return-void
.end method

.method private updateEverything()V
    .locals 4
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 647
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 648
    :try_start_0
    iget-wide v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    invoke-direct {p0, v2, v3}, Lorg/xwalk/core/internal/XWalkSettings;->nativeUpdateEverythingLocked(J)V

    .line 649
    monitor-exit v1

    .line 650
    return-void

    .line 649
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private updateWebkitPreferencesOnUiThread()V
    .locals 4

    .prologue
    .line 653
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 654
    invoke-static {}, Lorg/chromium/base/ThreadUtils;->assertOnUiThread()V

    .line 655
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    invoke-direct {p0, v0, v1}, Lorg/xwalk/core/internal/XWalkSettings;->nativeUpdateWebkitPreferences(J)V

    .line 657
    :cond_0
    return-void
.end method


# virtual methods
.method public getAllowContentAccess()Z
    .locals 2

    .prologue
    .line 275
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 276
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowContentUrlAccess:Z

    monitor-exit v1

    return v0

    .line 277
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getAllowFileAccess()Z
    .locals 2

    .prologue
    .line 255
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 256
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileUrlAccess:Z

    monitor-exit v1

    return v0

    .line 257
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getAllowFileAccessFromFileURLs()Z
    .locals 2

    .prologue
    .line 400
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 401
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileAccessFromFileURLs:Z

    monitor-exit v1

    return v0

    .line 402
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getAllowScriptsToCloseWindows()Z
    .locals 2

    .prologue
    .line 190
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 191
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowScriptsToCloseWindows:Z

    monitor-exit v1

    return v0

    .line 192
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getAllowUniversalAccessFromFileURLs()Z
    .locals 2

    .prologue
    .line 391
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 392
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowUniversalAccessFromFileURLs:Z

    monitor-exit v1

    return v0

    .line 393
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getBlockNetworkLoads()Z
    .locals 2

    .prologue
    .line 235
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 236
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mBlockNetworkLoads:Z

    monitor-exit v1

    return v0

    .line 237
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getCacheMode()I
    .locals 2

    .prologue
    .line 210
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 211
    :try_start_0
    iget v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mCacheMode:I

    monitor-exit v1

    return v0

    .line 212
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getDatabaseEnabled()Z
    .locals 2

    .prologue
    .line 551
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 552
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDatabaseEnabled:Z

    monitor-exit v1

    return v0

    .line 553
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getDefaultVideoPosterURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 640
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 641
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDefaultVideoPosterURL:Ljava/lang/String;

    monitor-exit v1

    return-object v0

    .line 642
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getDomStorageEnabled()Z
    .locals 2

    .prologue
    .line 530
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 531
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDomStorageEnabled:Z

    monitor-exit v1

    return v0

    .line 532
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method getGeolocationEnabled()Z
    .locals 2

    .prologue
    .line 295
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 296
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mGeolocationEnabled:Z

    monitor-exit v1

    return v0

    .line 297
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getImagesEnabled()Z
    .locals 2

    .prologue
    .line 373
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 374
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mImagesEnabled:Z

    monitor-exit v1

    return v0

    .line 375
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getJavaScriptCanOpenWindowsAutomatically()Z
    .locals 2

    .prologue
    .line 421
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 422
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mJavaScriptCanOpenWindowsAutomatically:Z

    monitor-exit v1

    return v0

    .line 423
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getJavaScriptEnabled()Z
    .locals 2

    .prologue
    .line 382
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 383
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mJavaScriptEnabled:Z

    monitor-exit v1

    return v0

    .line 384
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getLoadsImagesAutomatically()Z
    .locals 2

    .prologue
    .line 352
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 353
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mLoadsImagesAutomatically:Z

    monitor-exit v1

    return v0

    .line 354
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getMediaPlaybackRequiresUserGesture()Z
    .locals 2

    .prologue
    .line 572
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 573
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mMediaPlaybackRequiresUserGesture:Z

    monitor-exit v1

    return v0

    .line 574
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getUseWideViewPort()Z
    .locals 2

    .prologue
    .line 463
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 464
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUseWideViewport:Z

    monitor-exit v1

    return v0

    .line 465
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getUserAgentString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 626
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 627
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUserAgent:Ljava/lang/String;

    monitor-exit v1

    return-object v0

    .line 628
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAllowContentAccess(Z)V
    .locals 2
    .param p1, "allow"    # Z

    .prologue
    .line 264
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 265
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowContentUrlAccess:Z

    if-eq v0, p1, :cond_0

    .line 266
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowContentUrlAccess:Z

    .line 268
    :cond_0
    monitor-exit v1

    .line 269
    return-void

    .line 268
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAllowFileAccess(Z)V
    .locals 2
    .param p1, "allow"    # Z

    .prologue
    .line 244
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 245
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileUrlAccess:Z

    if-eq v0, p1, :cond_0

    .line 246
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileUrlAccess:Z

    .line 248
    :cond_0
    monitor-exit v1

    .line 249
    return-void

    .line 248
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAllowFileAccessFromFileURLs(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 328
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 329
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileAccessFromFileURLs:Z

    if-eq v0, p1, :cond_0

    .line 330
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowFileAccessFromFileURLs:Z

    .line 331
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 333
    :cond_0
    monitor-exit v1

    .line 334
    return-void

    .line 333
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAllowScriptsToCloseWindows(Z)V
    .locals 2
    .param p1, "allow"    # Z

    .prologue
    .line 182
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 183
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowScriptsToCloseWindows:Z

    if-eq v0, p1, :cond_0

    .line 184
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowScriptsToCloseWindows:Z

    .line 186
    :cond_0
    monitor-exit v1

    .line 187
    return-void

    .line 186
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAllowUniversalAccessFromFileURLs(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 316
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 317
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowUniversalAccessFromFileURLs:Z

    if-eq v0, p1, :cond_0

    .line 318
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAllowUniversalAccessFromFileURLs:Z

    .line 319
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 321
    :cond_0
    monitor-exit v1

    .line 322
    return-void

    .line 321
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAppCacheEnabled(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 472
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 473
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAppCacheEnabled:Z

    if-eq v0, p1, :cond_0

    .line 474
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mAppCacheEnabled:Z

    .line 475
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 477
    :cond_0
    monitor-exit v1

    .line 478
    return-void

    .line 477
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAppCachePath(Ljava/lang/String;)V
    .locals 3
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 484
    const/4 v0, 0x0

    .line 485
    .local v0, "needToSync":Z
    sget-object v2, Lorg/xwalk/core/internal/XWalkSettings;->sGlobalContentSettingsLock:Ljava/lang/Object;

    monitor-enter v2

    .line 487
    :try_start_0
    sget-boolean v1, Lorg/xwalk/core/internal/XWalkSettings;->sAppCachePathIsSet:Z

    if-nez v1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 488
    const/4 v1, 0x1

    sput-boolean v1, Lorg/xwalk/core/internal/XWalkSettings;->sAppCachePathIsSet:Z

    .line 489
    const/4 v0, 0x1

    .line 491
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 495
    if-eqz v0, :cond_1

    .line 496
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v2

    .line 497
    :try_start_1
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 498
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 500
    :cond_1
    return-void

    .line 491
    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 498
    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public setBlockNetworkLoads(Z)V
    .locals 5
    .param p1, "flag"    # Z

    .prologue
    .line 219
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 220
    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mContext:Landroid/content/Context;

    const-string v2, "android.permission.INTERNET"

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v4

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    new-instance v0, Ljava/lang/SecurityException;

    const-string v2, "Permission denied - application missing INTERNET permission"

    invoke-direct {v0, v2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 228
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 227
    :cond_0
    :try_start_1
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mBlockNetworkLoads:Z

    .line 228
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 229
    return-void
.end method

.method public setCacheMode(I)V
    .locals 2
    .param p1, "mode"    # I

    .prologue
    .line 199
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 200
    :try_start_0
    iget v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mCacheMode:I

    if-eq v0, p1, :cond_0

    .line 201
    iput p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mCacheMode:I

    .line 203
    :cond_0
    monitor-exit v1

    .line 204
    return-void

    .line 203
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setDatabaseEnabled(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 539
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 540
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDatabaseEnabled:Z

    if-eq v0, p1, :cond_0

    .line 541
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDatabaseEnabled:Z

    .line 542
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 544
    :cond_0
    monitor-exit v1

    .line 545
    return-void

    .line 544
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setDefaultVideoPosterURL(Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 581
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 582
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDefaultVideoPosterURL:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDefaultVideoPosterURL:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDefaultVideoPosterURL:Ljava/lang/String;

    if-nez v0, :cond_2

    if-eqz p1, :cond_2

    .line 584
    :cond_1
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDefaultVideoPosterURL:Ljava/lang/String;

    .line 585
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 587
    :cond_2
    monitor-exit v1

    .line 588
    return-void

    .line 587
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setDomStorageEnabled(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 518
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 519
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDomStorageEnabled:Z

    if-eq v0, p1, :cond_0

    .line 520
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mDomStorageEnabled:Z

    .line 521
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 523
    :cond_0
    monitor-exit v1

    .line 524
    return-void

    .line 523
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setGeolocationEnabled(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 284
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 285
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mGeolocationEnabled:Z

    if-eq v0, p1, :cond_0

    .line 286
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mGeolocationEnabled:Z

    .line 288
    :cond_0
    monitor-exit v1

    .line 289
    return-void

    .line 288
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setImagesEnabled(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 361
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 362
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mImagesEnabled:Z

    if-eq v0, p1, :cond_0

    .line 363
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mImagesEnabled:Z

    .line 364
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 366
    :cond_0
    monitor-exit v1

    .line 367
    return-void

    .line 366
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setJavaScriptCanOpenWindowsAutomatically(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 409
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 410
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mJavaScriptCanOpenWindowsAutomatically:Z

    if-eq v0, p1, :cond_0

    .line 411
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mJavaScriptCanOpenWindowsAutomatically:Z

    .line 412
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 414
    :cond_0
    monitor-exit v1

    .line 415
    return-void

    .line 414
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setJavaScriptEnabled(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 304
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 305
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mJavaScriptEnabled:Z

    if-eq v0, p1, :cond_0

    .line 306
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mJavaScriptEnabled:Z

    .line 307
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 309
    :cond_0
    monitor-exit v1

    .line 310
    return-void

    .line 309
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setLoadsImagesAutomatically(Z)V
    .locals 2
    .param p1, "flag"    # Z

    .prologue
    .line 340
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 341
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mLoadsImagesAutomatically:Z

    if-eq v0, p1, :cond_0

    .line 342
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mLoadsImagesAutomatically:Z

    .line 343
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 345
    :cond_0
    monitor-exit v1

    .line 346
    return-void

    .line 345
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setMediaPlaybackRequiresUserGesture(Z)V
    .locals 2
    .param p1, "require"    # Z

    .prologue
    .line 560
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 561
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mMediaPlaybackRequiresUserGesture:Z

    if-eq v0, p1, :cond_0

    .line 562
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mMediaPlaybackRequiresUserGesture:Z

    .line 563
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 565
    :cond_0
    monitor-exit v1

    .line 566
    return-void

    .line 565
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setSupportMultipleWindows(Z)V
    .locals 2
    .param p1, "support"    # Z

    .prologue
    .line 430
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 431
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mSupportMultipleWindows:Z

    if-eq v0, p1, :cond_0

    .line 432
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mSupportMultipleWindows:Z

    .line 433
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 435
    :cond_0
    monitor-exit v1

    .line 436
    return-void

    .line 435
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setUseWideViewPort(Z)V
    .locals 2
    .param p1, "use"    # Z

    .prologue
    .line 451
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 452
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUseWideViewport:Z

    if-eq v0, p1, :cond_0

    .line 453
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUseWideViewport:Z

    .line 454
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->updateWebkitPreferencesLocked()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->access$600(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;)V

    .line 456
    :cond_0
    monitor-exit v1

    .line 457
    return-void

    .line 456
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setUserAgentString(Ljava/lang/String;)V
    .locals 4
    .param p1, "ua"    # Ljava/lang/String;

    .prologue
    .line 602
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v2

    .line 603
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUserAgent:Ljava/lang/String;

    .line 604
    .local v0, "oldUserAgent":Ljava/lang/String;
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    .line 605
    :cond_0
    # getter for: Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;->sInstance:Ljava/lang/String;
    invoke-static {}, Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;->access$500()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUserAgent:Ljava/lang/String;

    .line 609
    :goto_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUserAgent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 610
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    new-instance v3, Lorg/xwalk/core/internal/XWalkSettings$1;

    invoke-direct {v3, p0}, Lorg/xwalk/core/internal/XWalkSettings$1;-><init>(Lorg/xwalk/core/internal/XWalkSettings;)V

    invoke-virtual {v1, v3}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->maybeRunOnUiThreadBlocking(Ljava/lang/Runnable;)V

    .line 619
    :cond_1
    monitor-exit v2

    .line 620
    return-void

    .line 607
    :cond_2
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mUserAgent:Ljava/lang/String;

    goto :goto_0

    .line 619
    .end local v0    # "oldUserAgent":Ljava/lang/String;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method setWebContents(J)V
    .locals 7
    .param p1, "nativeWebContents"    # J

    .prologue
    const-wide/16 v4, 0x0

    .line 162
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 163
    :try_start_0
    iget-wide v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    .line 164
    iget-wide v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    invoke-direct {p0, v2, v3}, Lorg/xwalk/core/internal/XWalkSettings;->nativeDestroy(J)V

    .line 165
    sget-boolean v0, Lorg/xwalk/core/internal/XWalkSettings;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-wide v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 172
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 167
    :cond_0
    cmp-long v0, p1, v4

    if-eqz v0, :cond_1

    .line 168
    :try_start_1
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mEventHandler:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->bindUiThread()V

    .line 169
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkSettings;->nativeInit(J)J

    move-result-wide v2

    iput-wide v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    .line 170
    iget-wide v2, p0, Lorg/xwalk/core/internal/XWalkSettings;->mNativeXWalkSettings:J

    invoke-direct {p0, v2, v3}, Lorg/xwalk/core/internal/XWalkSettings;->nativeUpdateEverythingLocked(J)V

    .line 172
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    return-void
.end method

.method public supportMultipleWindows()Z
    .locals 2

    .prologue
    .line 442
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;

    monitor-enter v1

    .line 443
    :try_start_0
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkSettings;->mSupportMultipleWindows:Z

    monitor-exit v1

    return v0

    .line 444
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
