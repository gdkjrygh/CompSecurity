.class Lorg/chromium/media/MediaCodecBridge$CodecInfo;
.super Ljava/lang/Object;
.source "MediaCodecBridge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/MediaCodecBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CodecInfo"
.end annotation


# instance fields
.field private final mCodecName:Ljava/lang/String;

.field private final mCodecType:Ljava/lang/String;

.field private final mDirection:I


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .param p1, "codecType"    # Ljava/lang/String;
    .param p2, "codecName"    # Ljava/lang/String;
    .param p3, "direction"    # I

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Lorg/chromium/media/MediaCodecBridge$CodecInfo;->mCodecType:Ljava/lang/String;

    .line 102
    iput-object p2, p0, Lorg/chromium/media/MediaCodecBridge$CodecInfo;->mCodecName:Ljava/lang/String;

    .line 103
    iput p3, p0, Lorg/chromium/media/MediaCodecBridge$CodecInfo;->mDirection:I

    .line 104
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILorg/chromium/media/MediaCodecBridge$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Ljava/lang/String;
    .param p3, "x2"    # I
    .param p4, "x3"    # Lorg/chromium/media/MediaCodecBridge$1;

    .prologue
    .line 94
    invoke-direct {p0, p1, p2, p3}, Lorg/chromium/media/MediaCodecBridge$CodecInfo;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private codecName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "CodecInfo"
    .end annotation

    .prologue
    .line 110
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge$CodecInfo;->mCodecName:Ljava/lang/String;

    return-object v0
.end method

.method private codecType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "CodecInfo"
    .end annotation

    .prologue
    .line 107
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge$CodecInfo;->mCodecType:Ljava/lang/String;

    return-object v0
.end method

.method private direction()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "CodecInfo"
    .end annotation

    .prologue
    .line 113
    iget v0, p0, Lorg/chromium/media/MediaCodecBridge$CodecInfo;->mDirection:I

    return v0
.end method
