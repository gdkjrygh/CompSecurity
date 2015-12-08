.class public Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;
.super Ljava/lang/Object;
.source "XWalkMediaCodec.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "AudioCodecElement"
.end annotation


# instance fields
.field public codecName:Ljava/lang/String;

.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;Ljava/lang/String;)V
    .locals 0
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .line 38
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;->codecName:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .line 45
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;->codecName:Ljava/lang/String;

    check-cast p1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;

    .end local p1    # "obj":Ljava/lang/Object;
    iget-object v1, p1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;->codecName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;->codecName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
