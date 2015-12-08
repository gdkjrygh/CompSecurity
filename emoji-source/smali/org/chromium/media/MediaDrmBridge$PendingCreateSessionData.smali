.class Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;
.super Ljava/lang/Object;
.source "MediaDrmBridge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/MediaDrmBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PendingCreateSessionData"
.end annotation


# instance fields
.field private final mInitData:[B

.field private final mMimeType:Ljava/lang/String;

.field private final mSessionId:I


# direct methods
.method private constructor <init>(I[BLjava/lang/String;)V
    .locals 0
    .param p1, "sessionId"    # I
    .param p2, "initData"    # [B
    .param p3, "mimeType"    # Ljava/lang/String;

    .prologue
    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    iput p1, p0, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->mSessionId:I

    .line 117
    iput-object p2, p0, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->mInitData:[B

    .line 118
    iput-object p3, p0, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->mMimeType:Ljava/lang/String;

    .line 119
    return-void
.end method

.method synthetic constructor <init>(I[BLjava/lang/String;Lorg/chromium/media/MediaDrmBridge$1;)V
    .locals 0
    .param p1, "x0"    # I
    .param p2, "x1"    # [B
    .param p3, "x2"    # Ljava/lang/String;
    .param p4, "x3"    # Lorg/chromium/media/MediaDrmBridge$1;

    .prologue
    .line 110
    invoke-direct {p0, p1, p2, p3}, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;-><init>(I[BLjava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;)I
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;

    .prologue
    .line 110
    invoke-direct {p0}, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->sessionId()I

    move-result v0

    return v0
.end method

.method static synthetic access$300(Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;)[B
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;

    .prologue
    .line 110
    invoke-direct {p0}, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->initData()[B

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400(Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;

    .prologue
    .line 110
    invoke-direct {p0}, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->mimeType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private initData()[B
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->mInitData:[B

    return-object v0
.end method

.method private mimeType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->mMimeType:Ljava/lang/String;

    return-object v0
.end method

.method private sessionId()I
    .locals 1

    .prologue
    .line 121
    iget v0, p0, Lorg/chromium/media/MediaDrmBridge$PendingCreateSessionData;->mSessionId:I

    return v0
.end method
