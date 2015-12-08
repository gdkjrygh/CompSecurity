.class Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodecNull;
.super Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
.source "MediaCodecNull.java"


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)V
    .locals 0
    .param p1, "instance"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    .prologue
    .line 10
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;-><init>()V

    .line 11
    return-void
.end method


# virtual methods
.method public getCodecsInfo()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 15
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    return-object v0
.end method
