.class public Lorg/chromium/media/MediaPlayerBridge;
.super Ljava/lang/Object;
.source "MediaPlayerBridge.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/media/MediaPlayerBridge$AllowedOperations;,
        Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;,
        Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "MediaPlayerBridge"

.field private static sResourceLoadFilter:Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;


# instance fields
.field private mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

.field private mNativeMediaPlayerBridge:J

.field private mPlayer:Landroid/media/MediaPlayer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    sput-object v0, Lorg/chromium/media/MediaPlayerBridge;->sResourceLoadFilter:Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    return-void
.end method

.method protected constructor <init>(J)V
    .locals 1
    .param p1, "nativeMediaPlayerBridge"    # J

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-wide p1, p0, Lorg/chromium/media/MediaPlayerBridge;->mNativeMediaPlayerBridge:J

    .line 66
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/media/MediaPlayerBridge;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/media/MediaPlayerBridge;

    .prologue
    .line 36
    iget-wide v0, p0, Lorg/chromium/media/MediaPlayerBridge;->mNativeMediaPlayerBridge:J

    return-wide v0
.end method

.method static synthetic access$100(Lorg/chromium/media/MediaPlayerBridge;JZ)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/MediaPlayerBridge;
    .param p1, "x1"    # J
    .param p3, "x2"    # Z

    .prologue
    .line 36
    invoke-direct {p0, p1, p2, p3}, Lorg/chromium/media/MediaPlayerBridge;->nativeOnDidSetDataUriDataSource(JZ)V

    return-void
.end method

.method private static create(J)Lorg/chromium/media/MediaPlayerBridge;
    .locals 2
    .param p0, "nativeMediaPlayerBridge"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 61
    new-instance v0, Lorg/chromium/media/MediaPlayerBridge;

    invoke-direct {v0, p0, p1}, Lorg/chromium/media/MediaPlayerBridge;-><init>(J)V

    return-object v0
.end method

.method private native nativeOnDidSetDataUriDataSource(JZ)V
.end method

.method public static setResourceLoadingFilter(Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;)V
    .locals 0
    .param p0, "filter"    # Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;

    .prologue
    .line 48
    sput-object p0, Lorg/chromium/media/MediaPlayerBridge;->sResourceLoadFilter:Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;

    .line 49
    return-void
.end method


# virtual methods
.method protected destroy()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 73
    iget-object v0, p0, Lorg/chromium/media/MediaPlayerBridge;->mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lorg/chromium/media/MediaPlayerBridge;->mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;->cancel(Z)Z

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/media/MediaPlayerBridge;->mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    .line 77
    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/media/MediaPlayerBridge;->mNativeMediaPlayerBridge:J

    .line 78
    return-void
.end method

.method protected getAllowedOperations()Lorg/chromium/media/MediaPlayerBridge$AllowedOperations;
    .locals 18
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 332
    invoke-virtual/range {p0 .. p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v10

    .line 333
    .local v10, "player":Landroid/media/MediaPlayer;
    const/4 v0, 0x1

    .line 334
    .local v0, "canPause":Z
    const/4 v2, 0x1

    .line 335
    .local v2, "canSeekForward":Z
    const/4 v1, 0x1

    .line 337
    .local v1, "canSeekBackward":Z
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    const-string v14, "getMetadata"

    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Class;

    const/16 v16, 0x0

    sget-object v17, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v17, v15, v16

    const/16 v16, 0x1

    sget-object v17, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v17, v15, v16

    invoke-virtual {v13, v14, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 339
    .local v6, "getMetadata":Ljava/lang/reflect/Method;
    const/4 v13, 0x1

    invoke-virtual {v6, v13}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 340
    const/4 v13, 0x2

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    aput-object v15, v13, v14

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-virtual {v6, v10, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 341
    .local v3, "data":Ljava/lang/Object;
    if-eqz v3, :cond_3

    .line 342
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    .line 343
    .local v8, "metadataClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v13, "has"

    const/4 v14, 0x1

    new-array v14, v14, [Ljava/lang/Class;

    const/4 v15, 0x0

    sget-object v16, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v16, v14, v15

    invoke-virtual {v8, v13, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 344
    .local v7, "hasMethod":Ljava/lang/reflect/Method;
    const-string v13, "getBoolean"

    const/4 v14, 0x1

    new-array v14, v14, [Ljava/lang/Class;

    const/4 v15, 0x0

    sget-object v16, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v16, v14, v15

    invoke-virtual {v8, v13, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 346
    .local v5, "getBooleanMethod":Ljava/lang/reflect/Method;
    const-string v13, "PAUSE_AVAILABLE"

    invoke-virtual {v8, v13}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 347
    .local v9, "pause":I
    const-string v13, "SEEK_FORWARD_AVAILABLE"

    invoke-virtual {v8, v13}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 349
    .local v12, "seekForward":I
    const-string v13, "SEEK_BACKWARD_AVAILABLE"

    invoke-virtual {v8, v13}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 351
    .local v11, "seekBackward":I
    const/4 v13, 0x1

    invoke-virtual {v7, v13}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 352
    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 353
    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-virtual {v7, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-virtual {v5, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_4

    :cond_0
    const/4 v0, 0x1

    .line 355
    :goto_0
    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-virtual {v7, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-virtual {v5, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_5

    :cond_1
    const/4 v2, 0x1

    .line 357
    :goto_1
    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-virtual {v7, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_2

    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-virtual {v5, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v13

    if-eqz v13, :cond_6

    :cond_2
    const/4 v1, 0x1

    .line 369
    .end local v3    # "data":Ljava/lang/Object;
    .end local v5    # "getBooleanMethod":Ljava/lang/reflect/Method;
    .end local v6    # "getMetadata":Ljava/lang/reflect/Method;
    .end local v7    # "hasMethod":Ljava/lang/reflect/Method;
    .end local v8    # "metadataClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v9    # "pause":I
    .end local v11    # "seekBackward":I
    .end local v12    # "seekForward":I
    :cond_3
    :goto_2
    new-instance v13, Lorg/chromium/media/MediaPlayerBridge$AllowedOperations;

    invoke-direct {v13, v0, v2, v1}, Lorg/chromium/media/MediaPlayerBridge$AllowedOperations;-><init>(ZZZ)V

    return-object v13

    .line 353
    .restart local v3    # "data":Ljava/lang/Object;
    .restart local v5    # "getBooleanMethod":Ljava/lang/reflect/Method;
    .restart local v6    # "getMetadata":Ljava/lang/reflect/Method;
    .restart local v7    # "hasMethod":Ljava/lang/reflect/Method;
    .restart local v8    # "metadataClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v9    # "pause":I
    .restart local v11    # "seekBackward":I
    .restart local v12    # "seekForward":I
    :cond_4
    const/4 v0, 0x0

    goto :goto_0

    .line 355
    :cond_5
    const/4 v2, 0x0

    goto :goto_1

    .line 357
    :cond_6
    const/4 v1, 0x0

    goto :goto_2

    .line 360
    .end local v3    # "data":Ljava/lang/Object;
    .end local v5    # "getBooleanMethod":Ljava/lang/reflect/Method;
    .end local v6    # "getMetadata":Ljava/lang/reflect/Method;
    .end local v7    # "hasMethod":Ljava/lang/reflect/Method;
    .end local v8    # "metadataClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v9    # "pause":I
    .end local v11    # "seekBackward":I
    .end local v12    # "seekForward":I
    :catch_0
    move-exception v4

    .line 361
    .local v4, "e":Ljava/lang/NoSuchMethodException;
    const-string v13, "MediaPlayerBridge"

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Cannot find getMetadata() method: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 362
    .end local v4    # "e":Ljava/lang/NoSuchMethodException;
    :catch_1
    move-exception v4

    .line 363
    .local v4, "e":Ljava/lang/reflect/InvocationTargetException;
    const-string v13, "MediaPlayerBridge"

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Cannot invoke MediaPlayer.getMetadata() method: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 364
    .end local v4    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_2
    move-exception v4

    .line 365
    .local v4, "e":Ljava/lang/IllegalAccessException;
    const-string v13, "MediaPlayerBridge"

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Cannot access metadata: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 366
    .end local v4    # "e":Ljava/lang/IllegalAccessException;
    :catch_3
    move-exception v4

    .line 367
    .local v4, "e":Ljava/lang/NoSuchFieldException;
    const-string v13, "MediaPlayerBridge"

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Cannot find matching fields in Metadata class: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2
.end method

.method protected getCurrentPosition()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 120
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    return v0
.end method

.method protected getDuration()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 125
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    return v0
.end method

.method protected getLocalPlayer()Landroid/media/MediaPlayer;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lorg/chromium/media/MediaPlayerBridge;->mPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 82
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lorg/chromium/media/MediaPlayerBridge;->mPlayer:Landroid/media/MediaPlayer;

    .line 84
    :cond_0
    iget-object v0, p0, Lorg/chromium/media/MediaPlayerBridge;->mPlayer:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method protected getVideoHeight()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 115
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v0

    return v0
.end method

.method protected getVideoWidth()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 110
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v0

    return v0
.end method

.method protected isPlaying()Z
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 105
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    return v0
.end method

.method protected pause()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 145
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 146
    return-void
.end method

.method protected prepareAsync()Z
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 95
    :try_start_0
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    const/4 v1, 0x1

    :goto_0
    return v1

    .line 96
    :catch_0
    move-exception v0

    .line 97
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "MediaPlayerBridge"

    const-string v2, "Unable to prepare MediaPlayer."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 98
    const/4 v1, 0x0

    goto :goto_0
.end method

.method protected release()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 130
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 131
    return-void
.end method

.method protected seekTo(I)V
    .locals 1
    .param p1, "msec"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 150
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 151
    return-void
.end method

.method protected setDataSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "cookies"    # Ljava/lang/String;
    .param p4, "userAgent"    # Ljava/lang/String;
    .param p5, "hideUrlLog"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 156
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 157
    .local v2, "uri":Landroid/net/Uri;
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 158
    .local v1, "headersMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p5, :cond_0

    const-string v4, "x-hide-urls-from-log"

    const-string v5, "true"

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "Cookie"

    invoke-virtual {v1, v4, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    :cond_1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "User-Agent"

    invoke-virtual {v1, v4, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    :cond_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-le v4, v5, :cond_3

    .line 165
    const-string v4, "allow-cross-domain-redirect"

    const-string v5, "false"

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    :cond_3
    :try_start_0
    sget-object v4, Lorg/chromium/media/MediaPlayerBridge;->sResourceLoadFilter:Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;

    if-eqz v4, :cond_4

    sget-object v4, Lorg/chromium/media/MediaPlayerBridge;->sResourceLoadFilter:Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;

    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v5

    invoke-virtual {v4, v5, p1, v2}, Lorg/chromium/media/MediaPlayerBridge$ResourceLoadingFilter;->shouldOverrideResourceLoading(Landroid/media/MediaPlayer;Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 176
    :goto_0
    return v3

    .line 173
    :cond_4
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v4

    invoke-virtual {v4, p1, v2, v1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 175
    :catch_0
    move-exception v0

    .line 176
    .local v0, "e":Ljava/lang/Exception;
    const/4 v3, 0x0

    goto :goto_0
.end method

.method protected setDataSourceFromFd(IJJ)Z
    .locals 8
    .param p1, "fd"    # I
    .param p2, "offset"    # J
    .param p4, "length"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 183
    :try_start_0
    invoke-static {p1}, Landroid/os/ParcelFileDescriptor;->adoptFd(I)Landroid/os/ParcelFileDescriptor;

    move-result-object v7

    .line 184
    .local v7, "parcelFd":Landroid/os/ParcelFileDescriptor;
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v7}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 185
    invoke-virtual {v7}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    const/4 v0, 0x1

    .line 189
    .end local v7    # "parcelFd":Landroid/os/ParcelFileDescriptor;
    :goto_0
    return v0

    .line 187
    :catch_0
    move-exception v6

    .line 188
    .local v6, "e":Ljava/io/IOException;
    const-string v0, "MediaPlayerBridge"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to set data source from file descriptor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected setDataUriDataSource(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 9
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 195
    iget-object v7, p0, Lorg/chromium/media/MediaPlayerBridge;->mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    if-eqz v7, :cond_0

    .line 196
    iget-object v7, p0, Lorg/chromium/media/MediaPlayerBridge;->mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    invoke-virtual {v7, v6}, Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;->cancel(Z)Z

    .line 197
    const/4 v7, 0x0

    iput-object v7, p0, Lorg/chromium/media/MediaPlayerBridge;->mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    .line 200
    :cond_0
    const-string v7, "data:"

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 213
    :cond_1
    :goto_0
    return v5

    .line 201
    :cond_2
    const/16 v7, 0x2c

    invoke-virtual {p2, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    .line 202
    .local v4, "headerStop":I
    const/4 v7, -0x1

    if-eq v4, v7, :cond_1

    .line 203
    invoke-virtual {p2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 204
    .local v1, "header":Ljava/lang/String;
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {p2, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 206
    .local v0, "data":Ljava/lang/String;
    const/4 v7, 0x5

    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 207
    .local v2, "headerContent":Ljava/lang/String;
    const-string v7, ";"

    invoke-virtual {v2, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 208
    .local v3, "headerInfo":[Ljava/lang/String;
    array-length v7, v3

    const/4 v8, 0x2

    if-ne v7, v8, :cond_1

    .line 209
    const-string v7, "base64"

    aget-object v8, v3, v6

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 211
    new-instance v7, Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    invoke-direct {v7, p0, p1, v0}, Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;-><init>(Lorg/chromium/media/MediaPlayerBridge;Landroid/content/Context;Ljava/lang/String;)V

    iput-object v7, p0, Lorg/chromium/media/MediaPlayerBridge;->mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    .line 212
    iget-object v7, p0, Lorg/chromium/media/MediaPlayerBridge;->mLoadDataUriTask:Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;

    new-array v5, v5, [Ljava/lang/Void;

    invoke-virtual {v7, v5}, Lorg/chromium/media/MediaPlayerBridge$LoadDataUriTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move v5, v6

    .line 213
    goto :goto_0
.end method

.method protected setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    .prologue
    .line 281
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    .line 282
    return-void
.end method

.method protected setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/media/MediaPlayer$OnCompletionListener;

    .prologue
    .line 285
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 286
    return-void
.end method

.method protected setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/media/MediaPlayer$OnErrorListener;

    .prologue
    .line 289
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 290
    return-void
.end method

.method protected setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/media/MediaPlayer$OnPreparedListener;

    .prologue
    .line 293
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 294
    return-void
.end method

.method protected setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/media/MediaPlayer$OnSeekCompleteListener;

    .prologue
    .line 297
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    .line 298
    return-void
.end method

.method protected setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    .prologue
    .line 301
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 302
    return-void
.end method

.method protected setSurface(Landroid/view/Surface;)V
    .locals 1
    .param p1, "surface"    # Landroid/view/Surface;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 89
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    .line 90
    return-void
.end method

.method protected setVolume(D)V
    .locals 3
    .param p1, "volume"    # D
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 135
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    double-to-float v1, p1

    double-to-float v2, p1

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 136
    return-void
.end method

.method protected start()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 140
    invoke-virtual {p0}, Lorg/chromium/media/MediaPlayerBridge;->getLocalPlayer()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 141
    return-void
.end method
