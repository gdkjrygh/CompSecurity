.class public Lcom/mopub/common/MoPub;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final SDK_VERSION:Ljava/lang/String; = "3.7.0"

.field private static volatile a:Lcom/mopub/common/MoPub$LocationAwareness;

.field private static volatile b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->NORMAL:Lcom/mopub/common/MoPub$LocationAwareness;

    sput-object v0, Lcom/mopub/common/MoPub;->a:Lcom/mopub/common/MoPub$LocationAwareness;

    .line 17
    const/4 v0, 0x6

    sput v0, Lcom/mopub/common/MoPub;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    return-void
.end method

.method public static getLocationAwareness()Lcom/mopub/common/MoPub$LocationAwareness;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/mopub/common/MoPub;->a:Lcom/mopub/common/MoPub$LocationAwareness;

    return-object v0
.end method

.method public static getLocationPrecision()I
    .locals 1

    .prologue
    .line 28
    sget v0, Lcom/mopub/common/MoPub;->b:I

    return v0
.end method

.method public static hasRewardedVideo(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 96
    invoke-static {p0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->hasVideo(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static varargs initializeRewardedVideo(Landroid/app/Activity;[Lcom/mopub/common/MediationSettings;)V
    .locals 0

    .prologue
    .line 80
    invoke-static {p0, p1}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->init(Landroid/app/Activity;[Lcom/mopub/common/MediationSettings;)V

    .line 81
    return-void
.end method

.method public static varargs loadRewardedVideo(Ljava/lang/String;[Lcom/mopub/common/MediationSettings;)V
    .locals 0

    .prologue
    .line 92
    invoke-static {p0, p1}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->loadVideo(Ljava/lang/String;[Lcom/mopub/common/MediationSettings;)V

    .line 93
    return-void
.end method

.method public static onBackPressed(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 75
    invoke-static {p0}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/MoPubLifecycleManager;->onBackPressed(Landroid/app/Activity;)V

    .line 76
    return-void
.end method

.method public static onCreate(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 43
    invoke-static {p0}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/MoPubLifecycleManager;->onCreate(Landroid/app/Activity;)V

    .line 1084
    invoke-static {p0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->updateActivity(Landroid/app/Activity;)V

    .line 45
    return-void
.end method

.method public static onDestroy(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 71
    invoke-static {p0}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/MoPubLifecycleManager;->onDestroy(Landroid/app/Activity;)V

    .line 72
    return-void
.end method

.method public static onPause(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 53
    invoke-static {p0}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/MoPubLifecycleManager;->onPause(Landroid/app/Activity;)V

    .line 54
    return-void
.end method

.method public static onRestart(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 62
    invoke-static {p0}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/MoPubLifecycleManager;->onRestart(Landroid/app/Activity;)V

    .line 4084
    invoke-static {p0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->updateActivity(Landroid/app/Activity;)V

    .line 64
    return-void
.end method

.method public static onResume(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 57
    invoke-static {p0}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/MoPubLifecycleManager;->onResume(Landroid/app/Activity;)V

    .line 3084
    invoke-static {p0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->updateActivity(Landroid/app/Activity;)V

    .line 59
    return-void
.end method

.method public static onStart(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 48
    invoke-static {p0}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/MoPubLifecycleManager;->onStart(Landroid/app/Activity;)V

    .line 2084
    invoke-static {p0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->updateActivity(Landroid/app/Activity;)V

    .line 50
    return-void
.end method

.method public static onStop(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 67
    invoke-static {p0}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/MoPubLifecycleManager;->onStop(Landroid/app/Activity;)V

    .line 68
    return-void
.end method

.method public static setLocationAwareness(Lcom/mopub/common/MoPub$LocationAwareness;)V
    .locals 0

    .prologue
    .line 24
    sput-object p0, Lcom/mopub/common/MoPub;->a:Lcom/mopub/common/MoPub$LocationAwareness;

    .line 25
    return-void
.end method

.method public static setLocationPrecision(I)V
    .locals 2

    .prologue
    .line 36
    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sput v0, Lcom/mopub/common/MoPub;->b:I

    .line 37
    return-void
.end method

.method public static setRewardedVideoListener(Lcom/mopub/mobileads/MoPubRewardedVideoListener;)V
    .locals 0

    .prologue
    .line 88
    invoke-static {p0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->setVideoListener(Lcom/mopub/mobileads/MoPubRewardedVideoListener;)V

    .line 89
    return-void
.end method

.method public static showRewardedVideo(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 100
    invoke-static {p0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->showVideo(Ljava/lang/String;)V

    .line 101
    return-void
.end method
