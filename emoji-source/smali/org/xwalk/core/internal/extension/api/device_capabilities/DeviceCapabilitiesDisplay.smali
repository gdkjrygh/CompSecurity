.class Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;
.super Ljava/lang/Object;
.source "DeviceCapabilitiesDisplay.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "DeviceCapabilitiesDisplay"


# instance fields
.field private mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

.field private final mDisplayList:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/view/Display;",
            ">;"
        }
    .end annotation
.end field

.field private final mDisplayListener:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

.field private mDisplayManager:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;Landroid/content/Context;)V
    .locals 1
    .param p1, "instance"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    .line 28
    new-instance v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay$1;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay$1;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayListener:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    .line 56
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    .line 57
    invoke-static {p2}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->getInstance(Landroid/content/Context;)Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayManager:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    .line 60
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->initDisplayList()V

    .line 61
    return-void
.end method

.method static synthetic access$000(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;)Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    .prologue
    .line 19
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayManager:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    return-object v0
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;Landroid/view/Display;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;
    .param p1, "x1"    # Landroid/view/Display;

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->notifyAndSaveConnectedDisplay(Landroid/view/Display;)V

    return-void
.end method

.method static synthetic access$200(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;)Landroid/util/SparseArray;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    .prologue
    .line 19
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    return-object v0
.end method

.method static synthetic access$300(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;Landroid/view/Display;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;
    .param p1, "x1"    # Landroid/view/Display;

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->notifyAndRemoveDisconnectedDisplay(Landroid/view/Display;)V

    return-void
.end method

.method private initDisplayList()V
    .locals 7

    .prologue
    .line 112
    iget-object v5, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayManager:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    invoke-virtual {v5}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v2

    .line 114
    .local v2, "displays":[Landroid/view/Display;
    move-object v0, v2

    .local v0, "arr$":[Landroid/view/Display;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_0

    aget-object v1, v0, v3

    .line 115
    .local v1, "disp":Landroid/view/Display;
    iget-object v5, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/view/Display;->getDisplayId()I

    move-result v6

    invoke-virtual {v5, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 114
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 117
    .end local v1    # "disp":Landroid/view/Display;
    :cond_0
    return-void
.end method

.method private notifyAndRemoveDisconnectedDisplay(Landroid/view/Display;)V
    .locals 4
    .param p1, "disp"    # Landroid/view/Display;

    .prologue
    .line 138
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 140
    .local v1, "out":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "reply"

    const-string v3, "disconnectDisplay"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    const-string v2, "eventName"

    const-string v3, "displaydisconnect"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    const-string v2, "data"

    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->convertDisplayToJSON(Landroid/view/Display;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 144
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->broadcastMessage(Ljava/lang/String;)V

    .line 145
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->remove(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    :goto_0
    return-void

    .line 146
    :catch_0
    move-exception v0

    .line 147
    .local v0, "e":Lorg/json/JSONException;
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v2, v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->printErrorMessage(Lorg/json/JSONException;)V

    goto :goto_0
.end method

.method private notifyAndSaveConnectedDisplay(Landroid/view/Display;)V
    .locals 4
    .param p1, "disp"    # Landroid/view/Display;

    .prologue
    .line 120
    if-nez p1, :cond_0

    .line 135
    :goto_0
    return-void

    .line 124
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 126
    .local v1, "out":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "reply"

    const-string v3, "connectDisplay"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 127
    const-string v2, "eventName"

    const-string v3, "displayconnect"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 128
    const-string v2, "data"

    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->convertDisplayToJSON(Landroid/view/Display;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 130
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->broadcastMessage(Ljava/lang/String;)V

    .line 131
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result v3

    invoke-virtual {v2, v3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 132
    :catch_0
    move-exception v0

    .line 133
    .local v0, "e":Lorg/json/JSONException;
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v2, v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->printErrorMessage(Lorg/json/JSONException;)V

    goto :goto_0
.end method


# virtual methods
.method public convertDisplayToJSON(Landroid/view/Display;)Lorg/json/JSONObject;
    .locals 9
    .param p1, "disp"    # Landroid/view/Display;

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 80
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 81
    .local v1, "displayMetrics":Landroid/util/DisplayMetrics;
    invoke-virtual {p1, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 83
    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    .line 84
    .local v4, "realSize":Landroid/graphics/Point;
    invoke-virtual {p1, v4}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 86
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 87
    .local v0, "availSize":Landroid/graphics/Point;
    invoke-virtual {p1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 89
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 91
    .local v3, "out":Lorg/json/JSONObject;
    :try_start_0
    const-string v7, "id"

    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    const-string v7, "name"

    invoke-virtual {p1}, Landroid/view/Display;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    const-string v8, "primary"

    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result v7

    if-nez v7, :cond_0

    move v7, v5

    :goto_0
    invoke-virtual {v3, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 94
    const-string v7, "external"

    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result v8

    if-eqz v8, :cond_1

    :goto_1
    invoke-virtual {v3, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 95
    const-string v5, "deviceXDPI"

    iget v6, v1, Landroid/util/DisplayMetrics;->xdpi:F

    float-to-int v6, v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 96
    const-string v5, "deviceYDPI"

    iget v6, v1, Landroid/util/DisplayMetrics;->ydpi:F

    float-to-int v6, v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 97
    const-string v5, "width"

    iget v6, v4, Landroid/graphics/Point;->x:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 98
    const-string v5, "height"

    iget v6, v4, Landroid/graphics/Point;->y:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 99
    const-string v5, "availWidth"

    iget v6, v0, Landroid/graphics/Point;->x:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 100
    const-string v5, "availHeight"

    iget v6, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 103
    const-string v5, "colorDepth"

    const/16 v6, 0x18

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 104
    const-string v5, "pixelDepth"

    const/16 v6, 0x18

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .end local v3    # "out":Lorg/json/JSONObject;
    :goto_2
    return-object v3

    .restart local v3    # "out":Lorg/json/JSONObject;
    :cond_0
    move v7, v6

    .line 93
    goto :goto_0

    :cond_1
    move v5, v6

    .line 94
    goto :goto_1

    .line 105
    :catch_0
    move-exception v2

    .line 106
    .local v2, "e":Lorg/json/JSONException;
    iget-object v5, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v2}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->setErrorMessage(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    goto :goto_2
.end method

.method public getInfo()Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 64
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 65
    .local v3, "out":Lorg/json/JSONObject;
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 68
    .local v0, "arr":Lorg/json/JSONArray;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    :try_start_0
    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v2, v4, :cond_0

    .line 69
    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/Display;

    invoke-virtual {p0, v4}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->convertDisplayToJSON(Landroid/view/Display;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 68
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 71
    :cond_0
    const-string v4, "displays"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .end local v3    # "out":Lorg/json/JSONObject;
    :goto_1
    return-object v3

    .line 72
    .restart local v3    # "out":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 73
    .local v1, "e":Lorg/json/JSONException;
    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->setErrorMessage(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 200
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 196
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayManager:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayListener:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->unregisterDisplayListener(Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;)V

    .line 197
    return-void
.end method

.method public onResume()V
    .locals 10

    .prologue
    .line 152
    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayManager:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    invoke-virtual {v8}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v2

    .line 157
    .local v2, "displays":[Landroid/view/Display;
    move-object v0, v2

    .local v0, "arr$":[Landroid/view/Display;
    array-length v7, v0

    .local v7, "len$":I
    const/4 v6, 0x0

    .local v6, "i$":I
    :goto_0
    if-ge v6, v7, :cond_1

    aget-object v1, v0, v6

    .line 158
    .local v1, "disp":Landroid/view/Display;
    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/view/Display;->getDisplayId()I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/Display;

    .line 159
    .local v4, "foundDisplay":Landroid/view/Display;
    if-nez v4, :cond_0

    .line 160
    invoke-direct {p0, v1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->notifyAndSaveConnectedDisplay(Landroid/view/Display;)V

    .line 157
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 162
    :cond_0
    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/view/Display;->getDisplayId()I

    move-result v9

    invoke-virtual {v8, v9, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    .line 167
    .end local v1    # "disp":Landroid/view/Display;
    .end local v4    # "foundDisplay":Landroid/view/Display;
    :cond_1
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_2
    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v8

    if-ge v5, v8, :cond_5

    .line 168
    const/4 v3, 0x0

    .line 169
    .local v3, "found":Z
    move-object v0, v2

    array-length v7, v0

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v7, :cond_2

    aget-object v1, v0, v6

    .line 170
    .restart local v1    # "disp":Landroid/view/Display;
    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/Display;

    invoke-virtual {v8}, Landroid/view/Display;->getDisplayId()I

    move-result v8

    invoke-virtual {v1}, Landroid/view/Display;->getDisplayId()I

    move-result v9

    if-ne v8, v9, :cond_4

    .line 171
    const/4 v3, 0x1

    .line 176
    .end local v1    # "disp":Landroid/view/Display;
    :cond_2
    if-nez v3, :cond_3

    .line 177
    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;

    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/Display;

    invoke-direct {p0, v8}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->notifyAndRemoveDisconnectedDisplay(Landroid/view/Display;)V

    .line 167
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 169
    .restart local v1    # "disp":Landroid/view/Display;
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 192
    .end local v1    # "disp":Landroid/view/Display;
    .end local v3    # "found":Z
    :cond_5
    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayManager:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    iget-object v9, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayListener:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    invoke-virtual {v8, v9}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->registerDisplayListener(Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;)V

    .line 193
    return-void
.end method
