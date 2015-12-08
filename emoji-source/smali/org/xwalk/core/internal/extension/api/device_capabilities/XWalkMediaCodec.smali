.class abstract Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
.super Ljava/lang/Object;
.source "XWalkMediaCodec.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;,
        Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;
    }
.end annotation


# static fields
.field protected static final AUDIO_CODEC_NAMES:[Ljava/lang/String;

.field private static final TAG:Ljava/lang/String; = "XWalkMediaCodec"

.field protected static final VIDEO_CODEC_NAMES:[Ljava/lang/String;


# instance fields
.field protected mAudioCodecsSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;",
            ">;"
        }
    .end annotation
.end field

.field protected mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

.field protected mVideoCodecsSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 25
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "ALAC"

    aput-object v1, v0, v3

    const-string v1, "MP3"

    aput-object v1, v0, v4

    const-string v1, "AMRNB"

    aput-object v1, v0, v5

    const-string v1, "AMRWB"

    aput-object v1, v0, v6

    const-string v1, "AAC"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "G711"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "VORBIS"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "WMA"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "FLAC"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "OPUS"

    aput-object v2, v0, v1

    sput-object v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;->AUDIO_CODEC_NAMES:[Ljava/lang/String;

    .line 27
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "H263"

    aput-object v1, v0, v3

    const-string v1, "H264"

    aput-object v1, v0, v4

    const-string v1, "MPEG4"

    aput-object v1, v0, v5

    const-string v1, "AVC"

    aput-object v1, v0, v6

    const-string v1, "WMV"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "VP8"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "Theora"

    aput-object v2, v0, v1

    sput-object v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;->VIDEO_CODEC_NAMES:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method

.method public static Create(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
    .locals 3
    .param p0, "instance"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    .prologue
    .line 79
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    .line 80
    new-instance v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)V

    .line 84
    .local v0, "codec":Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
    :goto_0
    return-object v0

    .line 82
    .end local v0    # "codec":Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
    :cond_0
    new-instance v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodecNull;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodecNull;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)V

    .restart local v0    # "codec":Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
    goto :goto_0
.end method


# virtual methods
.method public abstract getCodecsInfo()Lorg/json/JSONObject;
.end method
