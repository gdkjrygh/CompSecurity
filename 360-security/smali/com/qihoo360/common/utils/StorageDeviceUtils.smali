.class public Lcom/qihoo360/common/utils/StorageDeviceUtils;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDataPartitionFreeSize()J
    .locals 4

    .prologue
    .line 499
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    .line 500
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 501
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    .line 503
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    .line 504
    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static getDataPartitionTotalSize()J
    .locals 4

    .prologue
    .line 489
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    .line 490
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 491
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    .line 492
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v0, v0

    .line 494
    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static getFreeStorageSize(Landroid/content/Context;)J
    .locals 10

    .prologue
    .line 345
    invoke-static {p0}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getValidExternalStorageDevicePath(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v4

    .line 346
    const-wide/16 v2, 0x0

    .line 347
    invoke-static {}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getDataPartitionFreeSize()J

    move-result-wide v6

    .line 349
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 350
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v5, :cond_0

    .line 355
    add-long v0, v2, v6

    .line 356
    return-wide v0

    .line 352
    :cond_0
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Ljava/lang/String;)Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;

    move-result-object v0

    .line 353
    iget-wide v8, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->freeSize:J

    add-long/2addr v2, v8

    .line 350
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public static getSDPathBySDKApi()Ljava/lang/String;
    .locals 2

    .prologue
    .line 510
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 511
    if-eqz v0, :cond_0

    .line 512
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    .line 516
    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 514
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getStorageDevice(Ljava/lang/String;)Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;
    .locals 8

    .prologue
    .line 241
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    const/4 v0, 0x0

    .line 259
    :goto_0
    return-object v0

    .line 244
    :cond_0
    new-instance v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;

    invoke-direct {v0}, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;-><init>()V

    .line 247
    :try_start_0
    new-instance v1, Landroid/os/StatFs;

    invoke-direct {v1, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 248
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v2

    int-to-long v2, v2

    .line 249
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v4

    int-to-long v4, v4

    .line 250
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v1

    int-to-long v6, v1

    .line 252
    iput-object p0, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->path:Ljava/lang/String;

    .line 253
    mul-long/2addr v4, v2

    iput-wide v4, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    .line 254
    mul-long/2addr v2, v6

    iput-wide v2, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->freeSize:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 255
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static getStorageDevice(Landroid/content/Context;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 127
    .line 131
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 135
    :try_start_0
    const-class v0, Landroid/os/Environment;

    const-string/jumbo v3, "isExternalStorageRemovable"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 136
    const-class v3, Landroid/os/Environment;

    .line 137
    const/4 v5, 0x0

    .line 136
    invoke-virtual {v0, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 144
    :goto_0
    :try_start_1
    invoke-static {p0}, Lcom/qihoo360/common/utils/Utils;->getInternalAndExternalSDPath(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    .line 148
    if-nez v1, :cond_1

    .line 232
    :cond_0
    :goto_1
    return-object v2

    .line 138
    :catch_0
    move-exception v0

    move v3, v1

    goto :goto_0

    .line 154
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 156
    const/4 v5, 0x2

    if-ne v0, v5, :cond_7

    .line 157
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 158
    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 160
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz v3, :cond_6

    .line 177
    :goto_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 179
    invoke-static {v1}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Ljava/lang/String;)Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 180
    :try_start_2
    sget-object v3, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;->INTERNAL:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;

    iput-object v3, v1, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->type:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;

    .line 183
    :goto_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 185
    invoke-static {v0}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Ljava/lang/String;)Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    .line 186
    :try_start_3
    sget-object v3, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;->EXTERNAL:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;

    iput-object v3, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->type:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 198
    :goto_4
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Ljava/lang/String;)Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;

    move-result-object v3

    .line 199
    sget-object v4, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;->SYSTEM:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;

    iput-object v4, v3, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->type:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;

    .line 204
    if-eqz v1, :cond_2

    if-eqz v3, :cond_2

    .line 205
    iget-wide v4, v1, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    iget-wide v6, v3, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    cmp-long v4, v4, v6

    if-nez v4, :cond_2

    .line 206
    iget-wide v4, v1, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->freeSize:J

    iget-wide v6, v3, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->freeSize:J

    cmp-long v4, v4, v6

    if-nez v4, :cond_2

    move-object v1, v2

    .line 211
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 212
    if-eqz v3, :cond_3

    .line 213
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    :cond_3
    if-eqz v1, :cond_4

    .line 216
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    :cond_4
    if-eqz v0, :cond_5

    .line 219
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    :cond_5
    if-nez v0, :cond_0

    if-eqz v1, :cond_0

    .line 224
    invoke-static {}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->haveSdCard()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    sget-object v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;->EXTERNAL:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;

    iput-object v0, v1, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->type:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;

    goto/16 :goto_1

    :cond_6
    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    .line 168
    goto :goto_2

    :cond_7
    if-ne v0, v6, :cond_b

    .line 169
    const/4 v0, 0x0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 170
    if-eqz v3, :cond_8

    move-object v1, v2

    .line 172
    goto :goto_2

    :cond_8
    move-object v1, v0

    move-object v0, v2

    .line 173
    goto :goto_2

    .line 192
    :catch_1
    move-exception v0

    move-object v0, v2

    move-object v1, v2

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v0, v2

    goto :goto_4

    :catch_3
    move-exception v3

    goto :goto_4

    :cond_9
    move-object v0, v2

    goto :goto_4

    :cond_a
    move-object v1, v2

    goto :goto_3

    :cond_b
    move-object v0, v2

    move-object v1, v2

    goto/16 :goto_2
.end method

.method public static getStorageUsedPercent(Landroid/content/Context;)F
    .locals 14

    .prologue
    const-wide/16 v2, 0x0

    .line 367
    .line 369
    invoke-static {}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getDataPartitionTotalSize()J

    move-result-wide v6

    .line 370
    invoke-static {}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getDataPartitionFreeSize()J

    move-result-wide v8

    .line 372
    invoke-static {p0}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getValidExternalStorageDevicePath(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v10

    .line 374
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v11

    .line 375
    const/4 v0, 0x0

    move v1, v0

    move-wide v4, v2

    :goto_0
    if-lt v1, v11, :cond_0

    .line 381
    add-long v0, v4, v6

    .line 382
    add-long v4, v8, v8

    .line 384
    sub-long v2, v0, v2

    .line 386
    div-long v0, v2, v0

    long-to-float v0, v0

    return v0

    .line 377
    :cond_0
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Ljava/lang/String;)Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;

    move-result-object v0

    .line 378
    iget-wide v12, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    add-long/2addr v4, v12

    .line 379
    iget-wide v12, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->freeSize:J

    add-long/2addr v2, v12

    .line 375
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public static getTotalStorageSize(Landroid/content/Context;)J
    .locals 10

    .prologue
    .line 323
    invoke-static {p0}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getValidExternalStorageDevicePath(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v4

    .line 324
    const-wide/16 v2, 0x0

    .line 325
    invoke-static {}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getDataPartitionTotalSize()J

    move-result-wide v6

    .line 327
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 328
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v5, :cond_0

    .line 333
    add-long v0, v2, v6

    .line 334
    return-wide v0

    .line 330
    :cond_0
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Ljava/lang/String;)Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;

    move-result-object v0

    .line 331
    iget-wide v8, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    add-long/2addr v2, v8

    .line 328
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public static getUsedStorage(Landroid/content/Context;)J
    .locals 12

    .prologue
    const-wide/16 v4, 0x0

    .line 29
    invoke-static {p0}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-wide v2, v4

    move-wide v6, v4

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 38
    :goto_1
    sub-long v0, v6, v2

    .line 39
    cmp-long v2, v0, v4

    if-lez v2, :cond_0

    move-wide v4, v0

    .line 42
    :cond_0
    return-wide v4

    .line 33
    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;

    .line 34
    iget-wide v10, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    add-long/2addr v6, v10

    .line 35
    iget-wide v0, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->freeSize:J

    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_0

    :cond_2
    move-wide v2, v4

    move-wide v6, v4

    goto :goto_1
.end method

.method public static getValidExternalStorageDevicePath(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 398
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 400
    invoke-static {}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getDataPartitionTotalSize()J

    move-result-wide v4

    .line 401
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_5

    .line 403
    :try_start_0
    const-string/jumbo v0, "storage"

    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/Utils;->getSystemService(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 404
    if-eqz v6, :cond_0

    .line 405
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string/jumbo v1, "getVolumeList"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 406
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string/jumbo v2, "getVolumeState"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    const-class v9, Ljava/lang/String;

    aput-object v9, v7, v8

    invoke-virtual {v1, v2, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 407
    if-eqz v0, :cond_0

    .line 408
    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    .line 409
    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    .line 410
    const/4 v1, 0x0

    aget-object v1, v0, v1

    .line 411
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string/jumbo v8, "isEmulated"

    const/4 v9, 0x0

    invoke-virtual {v2, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    .line 412
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string/jumbo v2, "getPath"

    const/4 v9, 0x0

    invoke-virtual {v1, v2, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    .line 415
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v1, v0

    if-lt v2, v1, :cond_1

    .line 431
    const/4 v1, 0x0

    move v2, v1

    :goto_1
    array-length v1, v0

    if-lt v2, v1, :cond_3

    .line 484
    :cond_0
    :goto_2
    return-object v3

    .line 416
    :cond_1
    aget-object v10, v0, v2

    .line 417
    const/4 v1, 0x0

    invoke-virtual {v8, v10, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 418
    const/4 v1, 0x0

    invoke-virtual {v9, v10, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 419
    const-string/jumbo v10, "mounted"

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    .line 420
    aput-object v1, v11, v12

    .line 419
    invoke-virtual {v7, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    .line 420
    if-eqz v10, :cond_2

    .line 422
    invoke-static {v1}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Ljava/lang/String;)Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;

    move-result-object v10

    .line 423
    if-eqz v10, :cond_2

    iget-wide v10, v10, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    const-wide/16 v12, 0x2

    mul-long/2addr v12, v4

    cmp-long v10, v10, v12

    if-ltz v10, :cond_2

    .line 424
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    :cond_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 432
    :cond_3
    aget-object v4, v0, v2

    .line 433
    const/4 v1, 0x0

    invoke-virtual {v8, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_4

    .line 434
    const/4 v1, 0x0

    invoke-virtual {v9, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 435
    const-string/jumbo v4, "mounted"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v10, 0x0

    .line 436
    aput-object v1, v5, v10

    .line 435
    invoke-virtual {v7, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 436
    if-eqz v4, :cond_4

    .line 437
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 431
    :cond_4
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 450
    :cond_5
    :try_start_1
    invoke-static {}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getSDPathBySDKApi()Ljava/lang/String;

    move-result-object v0

    .line 451
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 453
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    :cond_6
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/io/FileInputStream;

    new-instance v4, Ljava/io/File;

    .line 457
    const-string/jumbo v5, "/proc/mounts"

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 456
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 459
    :cond_7
    :goto_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    if-nez v1, :cond_8

    .line 476
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_2

    .line 477
    :catch_0
    move-exception v0

    goto/16 :goto_2

    .line 460
    :cond_8
    :try_start_3
    const-string/jumbo v2, "uid=1000"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string/jumbo v2, "gid=1015"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string/jumbo v2, "asec"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 465
    const-string/jumbo v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 466
    array-length v2, v1

    const/4 v4, 0x4

    if-lt v2, v4, :cond_7

    .line 467
    const/4 v2, 0x1

    aget-object v1, v1, v2

    .line 469
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 470
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    .line 479
    :catch_1
    move-exception v0

    goto/16 :goto_2

    .line 444
    :catch_2
    move-exception v0

    goto/16 :goto_2
.end method

.method public static haveSdCard()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 69
    :try_start_0
    new-instance v2, Ljava/io/File;

    const-string/jumbo v3, "/sys/class/mmc_host/mmc0"

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 72
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    move v2, v1

    .line 73
    :goto_0
    array-length v4, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-lt v2, v4, :cond_3

    .line 87
    :cond_0
    :goto_1
    :try_start_1
    new-instance v2, Ljava/io/File;

    const-string/jumbo v3, "/sys/class/mmc_host/mmc1"

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    move v2, v1

    .line 91
    :goto_2
    array-length v4, v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-lt v2, v4, :cond_5

    .line 105
    :cond_1
    :goto_3
    :try_start_2
    new-instance v2, Ljava/io/File;

    const-string/jumbo v3, "/sys/class/mmc_host/mmc2"

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 108
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    move v2, v1

    .line 109
    :goto_4
    array-length v4, v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-lt v2, v4, :cond_7

    :cond_2
    :goto_5
    move v0, v1

    .line 122
    :goto_6
    return v0

    .line 74
    :cond_3
    :try_start_3
    aget-object v4, v3, v2

    invoke-virtual {v4}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "mmc0:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 75
    aget-object v2, v3, v2

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    .line 76
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "/type"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->readFileLine(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 77
    if-eqz v2, :cond_0

    const-string/jumbo v3, "SD"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_6

    .line 73
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 92
    :cond_5
    :try_start_4
    aget-object v4, v3, v2

    invoke-virtual {v4}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "mmc1:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 93
    aget-object v2, v3, v2

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "/type"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->readFileLine(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 95
    if-eqz v2, :cond_1

    const-string/jumbo v3, "SD"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_6

    .line 91
    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    .line 110
    :cond_7
    :try_start_5
    aget-object v4, v3, v2

    invoke-virtual {v4}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "mmc2:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 111
    aget-object v2, v3, v2

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    .line 112
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "/type"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->readFileLine(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 113
    if-eqz v2, :cond_2

    const-string/jumbo v3, "SD"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_6

    .line 109
    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_4

    .line 119
    :catch_0
    move-exception v0

    goto/16 :goto_5

    .line 101
    :catch_1
    move-exception v2

    goto/16 :goto_3

    .line 83
    :catch_2
    move-exception v2

    goto/16 :goto_1
.end method

.method public static readFileLine(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 47
    .line 50
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/FileReader;

    invoke-direct {v1, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 56
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 62
    :goto_0
    return-object v0

    .line 52
    :catch_0
    move-exception v1

    move-object v2, v0

    .line 53
    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 56
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 57
    :catch_1
    move-exception v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 54
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    .line 56
    :goto_2
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 60
    :goto_3
    throw v0

    .line 57
    :catch_2
    move-exception v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    .line 57
    :catch_3
    move-exception v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 54
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 52
    :catch_4
    move-exception v1

    goto :goto_1
.end method
