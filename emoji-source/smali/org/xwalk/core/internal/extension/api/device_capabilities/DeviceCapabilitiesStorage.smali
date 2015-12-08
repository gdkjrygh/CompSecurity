.class Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;
.super Ljava/lang/Object;
.source "DeviceCapabilitiesStorage.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "DeviceCapabilitiesStorage"

.field private static mStorageCount:I


# instance fields
.field private mActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

.field private mIntentFilter:Landroid/content/IntentFilter;

.field private mIsListening:Z

.field private final mStorageList:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;",
            ">;"
        }
    .end annotation
.end field

.field private final mStorageListener:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    sput v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    return-void
.end method

.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;Landroid/app/Activity;)V
    .locals 1
    .param p1, "instance"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;
    .param p2, "activity"    # Landroid/app/Activity;

    .prologue
    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIsListening:Z

    .line 37
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    .line 122
    new-instance v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$1;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$1;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageListener:Landroid/content/BroadcastReceiver;

    .line 140
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    .line 141
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mActivity:Ljava/lang/ref/WeakReference;

    .line 143
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->registerIntentFilter()V

    .line 146
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->initStorageList()V

    .line 147
    return-void
.end method

.method static synthetic access$000(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;)Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    .prologue
    .line 26
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    return-object v0
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    .prologue
    .line 26
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->notifyAndSaveAttachedStorage()V

    return-void
.end method

.method static synthetic access$200(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    .prologue
    .line 26
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->notifyAndRemoveDetachedStorage()V

    return-void
.end method

.method private attemptAddExternalStorage()Z
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 201
    sget v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    add-int/lit8 v1, v3, -0x1

    .line 202
    .local v1, "sdcardNum":I
    new-instance v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    sget v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    new-instance v5, Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "sdcard"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    const-string v6, "removable"

    invoke-direct {v2, p0, v3, v5, v6}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;ILjava/lang/String;Ljava/lang/String;)V

    .line 203
    .local v2, "unit":Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "/storage/sdcard"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->setPath(Ljava/lang/String;)V

    .line 205
    invoke-virtual {v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->isValid()Z

    move-result v3

    if-nez v3, :cond_0

    move v3, v4

    .line 217
    :goto_0
    return v3

    .line 209
    :cond_0
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 210
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->isSame(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v4

    .line 211
    goto :goto_0

    .line 209
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 215
    :cond_2
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    sget v4, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 216
    sget v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    add-int/lit8 v3, v3, 0x1

    sput v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    .line 217
    const/4 v3, 0x1

    goto :goto_0
.end method

.method private initStorageList()V
    .locals 6

    .prologue
    .line 165
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    .line 166
    const/4 v2, 0x0

    sput v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    .line 168
    new-instance v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    sget v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    const-string v3, "Internal"

    const-string v4, "fixed"

    invoke-direct {v1, p0, v2, v3, v4}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;ILjava/lang/String;Ljava/lang/String;)V

    .line 169
    .local v1, "unit":Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->setPath(Ljava/lang/String;)V

    .line 170
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    sget v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 171
    sget v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    .line 174
    sget v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    add-int/lit8 v0, v2, -0x1

    .line 175
    .local v0, "sdcardNum":I
    new-instance v1, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    .end local v1    # "unit":Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
    sget v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    new-instance v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sdcard"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    const-string v4, "fixed"

    invoke-direct {v1, p0, v2, v3, v4}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;-><init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;ILjava/lang/String;Ljava/lang/String;)V

    .line 176
    .restart local v1    # "unit":Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
    invoke-static {}, Landroid/os/Environment;->isExternalStorageRemovable()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 177
    const-string v2, "removable"

    invoke-virtual {v1, v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->setType(Ljava/lang/String;)V

    .line 179
    :cond_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->setPath(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->isValid()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 182
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    sget v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 183
    sget v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    .line 187
    :cond_1
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->attemptAddExternalStorage()Z

    .line 188
    return-void
.end method

.method private notifyAndRemoveDetachedStorage()V
    .locals 5

    .prologue
    .line 260
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    .line 262
    .local v2, "unit":Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
    invoke-virtual {v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "removable"

    if-eq v3, v4, :cond_0

    .line 278
    :goto_0
    return-void

    .line 266
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 268
    .local v1, "out":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "reply"

    const-string v4, "detachStorage"

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 269
    const-string v3, "eventName"

    const-string v4, "storagedetach"

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 270
    const-string v3, "data"

    invoke-virtual {v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->convertToJSON()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 272
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->broadcastMessage(Ljava/lang/String;)V

    .line 273
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->getId()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->remove(I)V

    .line 274
    sget v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I

    add-int/lit8 v3, v3, -0x1

    sput v3, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageCount:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 275
    :catch_0
    move-exception v0

    .line 276
    .local v0, "e":Lorg/json/JSONException;
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v3, v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->printErrorMessage(Lorg/json/JSONException;)V

    goto :goto_0
.end method

.method private notifyAndSaveAttachedStorage()V
    .locals 5

    .prologue
    .line 241
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->attemptAddExternalStorage()Z

    move-result v3

    if-nez v3, :cond_0

    .line 257
    :goto_0
    return-void

    .line 245
    :cond_0
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    .line 246
    .local v2, "unit":Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 248
    .local v1, "out":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "reply"

    const-string v4, "attachStorage"

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 249
    const-string v3, "eventName"

    const-string v4, "storageattach"

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 250
    const-string v3, "data"

    invoke-virtual {v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->convertToJSON()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 252
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->broadcastMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 253
    :catch_0
    move-exception v0

    .line 254
    .local v0, "e":Lorg/json/JSONException;
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v3, v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->printErrorMessage(Lorg/json/JSONException;)V

    goto :goto_0
.end method

.method private registerIntentFilter()V
    .locals 2

    .prologue
    .line 191
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.MEDIA_BAD_REMOVAL"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.MEDIA_MOUNTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.MEDIA_REMOVED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 194
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.MEDIA_SCANNER_FINISHED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.MEDIA_SCANNER_STARTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 196
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.MEDIA_UNMOUNTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "file"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 198
    return-void
.end method


# virtual methods
.method public getInfo()Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 150
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 151
    .local v3, "out":Lorg/json/JSONObject;
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 153
    .local v0, "arr":Lorg/json/JSONArray;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    :try_start_0
    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v2, v4, :cond_0

    .line 154
    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    invoke-virtual {v4}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->convertToJSON()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 153
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 156
    :cond_0
    const-string v4, "storages"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .end local v3    # "out":Lorg/json/JSONObject;
    :goto_1
    return-object v3

    .line 157
    .restart local v3    # "out":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 158
    .local v1, "e":Lorg/json/JSONException;
    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->setErrorMessage(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 299
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 295
    invoke-virtual {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->unregisterListener()V

    .line 296
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 283
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageList:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    .line 284
    .local v0, "lastUnit":Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->isValid()Z

    move-result v1

    if-nez v1, :cond_0

    .line 285
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->notifyAndRemoveDetachedStorage()V

    .line 289
    :cond_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->notifyAndSaveAttachedStorage()V

    .line 291
    invoke-virtual {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->registerListener()V

    .line 292
    return-void
.end method

.method public registerListener()V
    .locals 3

    .prologue
    .line 221
    iget-boolean v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIsListening:Z

    if-eqz v1, :cond_1

    .line 228
    :cond_0
    :goto_0
    return-void

    .line 225
    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIsListening:Z

    .line 226
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 227
    .local v0, "activity":Landroid/app/Activity;
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageListener:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIntentFilter:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_0
.end method

.method public unregisterListener()V
    .locals 2

    .prologue
    .line 231
    iget-boolean v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIsListening:Z

    if-nez v1, :cond_1

    .line 238
    :cond_0
    :goto_0
    return-void

    .line 235
    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mIsListening:Z

    .line 236
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 237
    .local v0, "activity":Landroid/app/Activity;
    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mStorageListener:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_0
.end method
