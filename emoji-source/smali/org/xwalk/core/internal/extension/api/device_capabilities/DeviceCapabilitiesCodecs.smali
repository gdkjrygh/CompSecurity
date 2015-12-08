.class Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;
.super Ljava/lang/Object;
.source "DeviceCapabilitiesCodecs.java"


# instance fields
.field private mediaCodec:Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)V
    .locals 1
    .param p1, "instance"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-static {p1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;->Create(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;->mediaCodec:Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;

    .line 14
    return-void
.end method


# virtual methods
.method public getInfo()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;->mediaCodec:Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;->getCodecsInfo()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
