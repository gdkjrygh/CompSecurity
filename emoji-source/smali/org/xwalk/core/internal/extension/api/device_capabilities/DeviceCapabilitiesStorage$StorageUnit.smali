.class Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;
.super Ljava/lang/Object;
.source "DeviceCapabilitiesStorage.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "StorageUnit"
.end annotation


# instance fields
.field private mAvailCapacity:J

.field private mCapacity:J

.field private mId:I

.field private mName:Ljava/lang/String;

.field private mPath:Ljava/lang/String;

.field private mType:Ljava/lang/String;

.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;ILjava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p2, "id"    # I
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "type"    # Ljava/lang/String;

    .prologue
    const-wide/16 v2, 0x0

    .line 47
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mId:I

    .line 49
    iput-object p3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mName:Ljava/lang/String;

    .line 50
    iput-object p4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mType:Ljava/lang/String;

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mPath:Ljava/lang/String;

    .line 52
    iput-wide v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mCapacity:J

    .line 53
    iput-wide v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mAvailCapacity:J

    .line 54
    return-void
.end method


# virtual methods
.method public convertToJSON()Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 106
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 109
    .local v1, "out":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "id"

    iget v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mId:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    const-string v2, "name"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mName:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    const-string v2, "type"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mType:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    const-string v2, "capacity"

    iget-wide v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mCapacity:J

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 113
    const-string v2, "availCapacity"

    iget-wide v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mAvailCapacity:J

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .end local v1    # "out":Lorg/json/JSONObject;
    :goto_0
    return-object v1

    .line 114
    .restart local v1    # "out":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 115
    .local v0, "e":Lorg/json/JSONException;
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    # getter for: Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;
    invoke-static {v2}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->access$000(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;)Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    move-result-object v2

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->setErrorMessage(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0
.end method

.method public getAvailCapacity()J
    .locals 2

    .prologue
    .line 61
    iget-wide v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mAvailCapacity:J

    return-wide v0
.end method

.method public getCapacity()J
    .locals 2

    .prologue
    .line 60
    iget-wide v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mCapacity:J

    return-wide v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mId:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mPath:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mType:Ljava/lang/String;

    return-object v0
.end method

.method public isSame(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;)Z
    .locals 2
    .param p1, "unit"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;

    .prologue
    .line 70
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mPath:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->getPath()Ljava/lang/String;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isValid()Z
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 74
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mPath:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mPath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 75
    :cond_0
    iput-wide v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mCapacity:J

    .line 76
    iput-wide v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mAvailCapacity:J

    .line 77
    const/4 v1, 0x0

    .line 81
    :goto_0
    return v1

    .line 80
    :cond_1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mPath:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 81
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v1

    goto :goto_0
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 65
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mPath:Ljava/lang/String;

    .line 66
    invoke-virtual {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->updateCapacity()V

    .line 67
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 63
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mType:Ljava/lang/String;

    return-void
.end method

.method public updateCapacity()V
    .locals 6

    .prologue
    .line 86
    invoke-virtual {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->isValid()Z

    move-result v3

    if-nez v3, :cond_0

    .line 103
    :goto_0
    return-void

    .line 90
    :cond_0
    new-instance v2, Landroid/os/StatFs;

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mPath:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 94
    .local v2, "stat":Landroid/os/StatFs;
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x12

    if-lt v3, v4, :cond_1

    .line 95
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v0

    .line 96
    .local v0, "blockSize":J
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v4

    mul-long/2addr v4, v0

    iput-wide v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mCapacity:J

    .line 97
    invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v4

    mul-long/2addr v4, v0

    iput-wide v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mAvailCapacity:J

    goto :goto_0

    .line 99
    .end local v0    # "blockSize":J
    :cond_1
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    int-to-long v0, v3

    .line 100
    .restart local v0    # "blockSize":J
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCount()I

    move-result v3

    int-to-long v4, v3

    mul-long/2addr v4, v0

    iput-wide v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mCapacity:J

    .line 101
    invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v3

    int-to-long v4, v3

    mul-long/2addr v4, v0

    iput-wide v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$StorageUnit;->mAvailCapacity:J

    goto :goto_0
.end method
