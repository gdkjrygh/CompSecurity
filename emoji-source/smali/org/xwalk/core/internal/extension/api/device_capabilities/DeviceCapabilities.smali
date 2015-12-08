.class public Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;
.super Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;
.source "DeviceCapabilities.java"


# static fields
.field public static final JS_API_PATH:Ljava/lang/String; = "jsapi/device_capabilities_api.js"

.field private static final NAME:Ljava/lang/String; = "xwalk.experimental.system"

.field private static final TAG:Ljava/lang/String; = "DeviceCapabilities"


# instance fields
.field private mCPU:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCPU;

.field private mCodecs:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;

.field private mDisplay:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

.field private mMemory:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;

.field private mStorage:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 2
    .param p1, "jsApiContent"    # Ljava/lang/String;
    .param p2, "activity"    # Landroid/app/Activity;

    .prologue
    .line 31
    const-string v1, "xwalk.experimental.system"

    invoke-direct {p0, v1, p1, p2}, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    .line 33
    invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 35
    .local v0, "context":Landroid/content/Context;
    new-instance v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCPU;

    invoke-direct {v1, p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCPU;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)V

    iput-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mCPU:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCPU;

    .line 36
    new-instance v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;

    invoke-direct {v1, p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;)V

    iput-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mCodecs:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;

    .line 37
    new-instance v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    invoke-direct {v1, p0, v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;Landroid/content/Context;)V

    iput-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mDisplay:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    .line 38
    new-instance v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;

    invoke-direct {v1, p0, v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;Landroid/content/Context;)V

    iput-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mMemory:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;

    .line 39
    new-instance v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    invoke-direct {v1, p0, p2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;Landroid/app/Activity;)V

    iput-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mStorage:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    .line 40
    return-void
.end method

.method private handleAddEventListener(Ljava/lang/String;)V
    .locals 1
    .param p1, "eventName"    # Ljava/lang/String;

    .prologue
    .line 81
    const-string v0, "storageattach"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "storagedetach"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mStorage:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->registerListener()V

    .line 84
    :cond_1
    return-void
.end method

.method private handleGetDeviceInfo(ILjava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "instanceID"    # I
    .param p2, "asyncCallId"    # Ljava/lang/String;
    .param p3, "cmd"    # Ljava/lang/String;

    .prologue
    .line 61
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 62
    .local v1, "jsonOutput":Lorg/json/JSONObject;
    const-string v2, "getCPUInfo"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 63
    const-string v2, "data"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mCPU:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCPU;

    invoke-virtual {v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCPU;->getInfo()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    :cond_0
    :goto_0
    const-string v2, "asyncCallId"

    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->postMessage(ILjava/lang/String;)V

    .line 78
    .end local v1    # "jsonOutput":Lorg/json/JSONObject;
    :goto_1
    return-void

    .line 64
    .restart local v1    # "jsonOutput":Lorg/json/JSONObject;
    :cond_1
    const-string v2, "getCodecsInfo"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 65
    const-string v2, "data"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mCodecs:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;

    invoke-virtual {v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesCodecs;->getInfo()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 75
    .end local v1    # "jsonOutput":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 76
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->printErrorMessage(Lorg/json/JSONException;)V

    goto :goto_1

    .line 66
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v1    # "jsonOutput":Lorg/json/JSONObject;
    :cond_2
    :try_start_1
    const-string v2, "getDisplayInfo"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 67
    const-string v2, "data"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mDisplay:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    invoke-virtual {v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->getInfo()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 68
    :cond_3
    const-string v2, "getMemoryInfo"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 69
    const-string v2, "data"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mMemory:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;

    invoke-virtual {v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->getInfo()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 70
    :cond_4
    const-string v2, "getStorageInfo"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 71
    const-string v2, "data"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mStorage:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    invoke-virtual {v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->getInfo()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method private handleMessage(ILjava/lang/String;)V
    .locals 6
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 44
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 45
    .local v4, "jsonInput":Lorg/json/JSONObject;
    const-string v5, "cmd"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 47
    .local v1, "cmd":Ljava/lang/String;
    const-string v5, "addEventListener"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 48
    const-string v5, "eventName"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 49
    .local v3, "eventName":Ljava/lang/String;
    invoke-direct {p0, v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->handleAddEventListener(Ljava/lang/String;)V

    .line 57
    .end local v1    # "cmd":Ljava/lang/String;
    .end local v3    # "eventName":Ljava/lang/String;
    .end local v4    # "jsonInput":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 51
    .restart local v1    # "cmd":Ljava/lang/String;
    .restart local v4    # "jsonInput":Lorg/json/JSONObject;
    :cond_0
    const-string v5, "asyncCallId"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 52
    .local v0, "asyncCallId":Ljava/lang/String;
    invoke-direct {p0, p1, v0, v1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->handleGetDeviceInfo(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 54
    .end local v0    # "asyncCallId":Ljava/lang/String;
    .end local v1    # "cmd":Ljava/lang/String;
    .end local v4    # "jsonInput":Lorg/json/JSONObject;
    :catch_0
    move-exception v2

    .line 55
    .local v2, "e":Lorg/json/JSONException;
    invoke-virtual {p0, v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->printErrorMessage(Lorg/json/JSONException;)V

    goto :goto_0
.end method


# virtual methods
.method public onActivityStateChange(Landroid/app/Activity;I)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "newState"    # I

    .prologue
    .line 111
    packed-switch p2, :pswitch_data_0

    .line 127
    :goto_0
    :pswitch_0
    return-void

    .line 113
    :pswitch_1
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mDisplay:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->onResume()V

    .line 114
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mStorage:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->onResume()V

    goto :goto_0

    .line 117
    :pswitch_2
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mDisplay:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->onPause()V

    .line 118
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mStorage:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->onPause()V

    goto :goto_0

    .line 121
    :pswitch_3
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mDisplay:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->onDestroy()V

    .line 122
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->mStorage:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->onDestroy()V

    goto :goto_0

    .line 111
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public onMessage(ILjava/lang/String;)V
    .locals 1
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 104
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->handleMessage(ILjava/lang/String;)V

    .line 107
    :cond_0
    return-void
.end method

.method public onSyncMessage(ILjava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 131
    const/4 v0, 0x0

    return-object v0
.end method

.method protected printErrorMessage(Lorg/json/JSONException;)V
    .locals 2
    .param p1, "e"    # Lorg/json/JSONException;

    .prologue
    .line 87
    const-string v0, "DeviceCapabilities"

    invoke-virtual {p1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    return-void
.end method

.method protected setErrorMessage(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 5
    .param p1, "error"    # Ljava/lang/String;

    .prologue
    .line 91
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 92
    .local v2, "out":Lorg/json/JSONObject;
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 94
    .local v1, "errorMessage":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "message"

    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    const-string v3, "error"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    :goto_0
    return-object v2

    .line 96
    :catch_0
    move-exception v0

    .line 97
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "DeviceCapabilities"

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
