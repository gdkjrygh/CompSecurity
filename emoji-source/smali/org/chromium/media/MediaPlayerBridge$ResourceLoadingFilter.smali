.class public Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;
.super Ljava/lang/Object;
.source "MediaPlayerBridge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/MediaPlayerBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ResourceLoadingFilter"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideResourceLoading(Landroid/media/MediaPlayer;Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 1
    .param p1, "mediaPlayer"    # Landroid/media/MediaPlayer;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "uri"    # Landroid/net/Uri;

    .prologue
    .line 41
    const/4 v0, 0x0

    return v0
.end method
