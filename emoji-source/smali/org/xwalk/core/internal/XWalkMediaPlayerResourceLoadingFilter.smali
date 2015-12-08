.class Lorg/xwalk/core/internal/XWalkMediaPlayerResourceLoadingFilter;
.super Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;
.source "XWalkMediaPlayerResourceLoadingFilter.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideResourceLoading(Landroid/media/MediaPlayer;Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 10
    .param p1, "mediaPlayer"    # Landroid/media/MediaPlayer;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "uri"    # Landroid/net/Uri;

    .prologue
    const/4 v9, 0x0

    .line 28
    invoke-virtual {p3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "app"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    invoke-static {p3}, Lorg/xwalk/core/internal/AndroidProtocolHandler;->appUriToFileUri(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p3

    .line 32
    :cond_0
    invoke-virtual {p3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v8

    .line 34
    .local v8, "scheme":Ljava/lang/String;
    const-string v0, "file"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v9

    .line 44
    :goto_0
    return v0

    .line 37
    :cond_1
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-static {p3}, Lorg/xwalk/core/internal/AndroidProtocolHandler;->getAssetPath(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v6

    .line 39
    .local v6, "afd":Landroid/content/res/AssetFileDescriptor;
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    const/4 v0, 0x1

    goto :goto_0

    .line 43
    .end local v6    # "afd":Landroid/content/res/AssetFileDescriptor;
    :catch_0
    move-exception v7

    .local v7, "e":Ljava/lang/Exception;
    move v0, v9

    .line 44
    goto :goto_0
.end method
