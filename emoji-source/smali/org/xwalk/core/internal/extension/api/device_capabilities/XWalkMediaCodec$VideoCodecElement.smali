.class public Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;
.super Ljava/lang/Object;
.source "XWalkMediaCodec.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "VideoCodecElement"
.end annotation


# instance fields
.field public codecName:Ljava/lang/String;

.field public hwAccel:Z

.field public isEncoder:Z

.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;Ljava/lang/String;ZZ)V
    .locals 0
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "encoder"    # Z
    .param p4, "hardware"    # Z

    .prologue
    .line 58
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->codecName:Ljava/lang/String;

    .line 60
    iput-boolean p3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->isEncoder:Z

    .line 61
    iput-boolean p4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->hwAccel:Z

    .line 62
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .line 67
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->codecName:Ljava/lang/String;

    move-object v0, p1

    check-cast v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;

    iget-object v0, v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->codecName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->isEncoder:Z

    move-object v0, p1

    check-cast v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;

    iget-boolean v0, v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->isEncoder:Z

    if-ne v1, v0, :cond_0

    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->hwAccel:Z

    check-cast p1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;

    .end local p1    # "obj":Ljava/lang/Object;
    iget-boolean v1, p1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->hwAccel:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->codecName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
