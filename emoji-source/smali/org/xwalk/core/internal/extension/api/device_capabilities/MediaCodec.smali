.class Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;
.super Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;
.source "MediaCodec.java"


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)V
    .locals 1
    .param p1, "instance"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    .prologue
    .line 14
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;-><init>()V

    .line 15
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->mAudioCodecsSet:Ljava/util/Set;

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->mVideoCodecsSet:Ljava/util/Set;

    .line 22
    invoke-virtual {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->getCodecsList()V

    .line 23
    return-void
.end method


# virtual methods
.method public getCodecsInfo()Lorg/json/JSONObject;
    .locals 9

    .prologue
    .line 27
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 28
    .local v5, "outputObject":Lorg/json/JSONObject;
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 29
    .local v0, "audioCodecsArray":Lorg/json/JSONArray;
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 32
    .local v6, "videoCodecsArray":Lorg/json/JSONArray;
    :try_start_0
    iget-object v7, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->mAudioCodecsSet:Ljava/util/Set;

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;

    .line 33
    .local v1, "codecToAdd":Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 34
    .local v2, "codecsObject":Lorg/json/JSONObject;
    const-string v7, "format"

    iget-object v8, v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;->codecName:Ljava/lang/String;

    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 47
    .end local v1    # "codecToAdd":Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;
    .end local v2    # "codecsObject":Lorg/json/JSONObject;
    .end local v4    # "i$":Ljava/util/Iterator;
    :catch_0
    move-exception v3

    .line 48
    .local v3, "e":Lorg/json/JSONException;
    iget-object v7, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v3}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->setErrorMessage(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 51
    .end local v3    # "e":Lorg/json/JSONException;
    .end local v5    # "outputObject":Lorg/json/JSONObject;
    :goto_1
    return-object v5

    .line 37
    .restart local v4    # "i$":Ljava/util/Iterator;
    .restart local v5    # "outputObject":Lorg/json/JSONObject;
    :cond_0
    :try_start_1
    iget-object v7, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->mVideoCodecsSet:Ljava/util/Set;

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;

    .line 38
    .local v1, "codecToAdd":Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 39
    .restart local v2    # "codecsObject":Lorg/json/JSONObject;
    const-string v7, "format"

    iget-object v8, v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->codecName:Ljava/lang/String;

    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    const-string v7, "encode"

    iget-boolean v8, v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->isEncoder:Z

    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 41
    const-string v7, "hwAccel"

    iget-boolean v8, v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;->hwAccel:Z

    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 42
    invoke-virtual {v6, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    .line 45
    .end local v1    # "codecToAdd":Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;
    .end local v2    # "codecsObject":Lorg/json/JSONObject;
    :cond_1
    const-string v7, "audioCodecs"

    invoke-virtual {v5, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    const-string v7, "videoCodecs"

    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public getCodecsList()V
    .locals 13

    .prologue
    .line 55
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v9

    .line 56
    .local v9, "numCodecs":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-ge v3, v9, :cond_5

    .line 57
    invoke-static {v3}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v1

    .line 59
    .local v1, "codecInfo":Landroid/media/MediaCodecInfo;
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    .line 60
    .local v7, "name":Ljava/lang/String;
    const/4 v2, 0x0

    .line 62
    .local v2, "hasAdded":Z
    sget-object v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->AUDIO_CODEC_NAMES:[Ljava/lang/String;

    .local v0, "arr$":[Ljava/lang/String;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_1
    if-ge v4, v6, :cond_0

    aget-object v8, v0, v4

    .line 63
    .local v8, "nameListElement":Ljava/lang/String;
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 64
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->mAudioCodecsSet:Ljava/util/Set;

    new-instance v11, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;

    invoke-direct {v11, p0, v8}, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$AudioCodecElement;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;Ljava/lang/String;)V

    invoke-interface {v10, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 65
    const/4 v2, 0x1

    .line 70
    .end local v8    # "nameListElement":Ljava/lang/String;
    :cond_0
    if-eqz v2, :cond_3

    .line 56
    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 62
    .restart local v8    # "nameListElement":Ljava/lang/String;
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 74
    .end local v8    # "nameListElement":Ljava/lang/String;
    :cond_3
    sget-object v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->VIDEO_CODEC_NAMES:[Ljava/lang/String;

    array-length v6, v0

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v6, :cond_1

    aget-object v8, v0, v4

    .line 75
    .restart local v8    # "nameListElement":Ljava/lang/String;
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 76
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v5

    .line 78
    .local v5, "isEncoder":Z
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/MediaCodec;->mVideoCodecsSet:Ljava/util/Set;

    new-instance v11, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;

    const/4 v12, 0x0

    invoke-direct {v11, p0, v8, v5, v12}, Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec$VideoCodecElement;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/XWalkMediaCodec;Ljava/lang/String;ZZ)V

    invoke-interface {v10, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 74
    .end local v5    # "isEncoder":Z
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 84
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v1    # "codecInfo":Landroid/media/MediaCodecInfo;
    .end local v2    # "hasAdded":Z
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    .end local v7    # "name":Ljava/lang/String;
    .end local v8    # "nameListElement":Ljava/lang/String;
    :cond_5
    return-void
.end method
