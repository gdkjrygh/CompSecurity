.class public Lcom/qihoo/security/c/b/a;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)[J
    .locals 14

    .prologue
    const-wide/16 v0, 0x0

    .line 28
    const/4 v2, 0x2

    new-array v6, v2, [J

    fill-array-data v6, :array_0

    .line 29
    invoke-static {p0}, Lcom/qihoo360/common/utils/Utils;->getInternalAndExternalSDPath(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gtz v3, :cond_1

    :cond_0
    move-object v0, v6

    .line 53
    :goto_0
    return-object v0

    .line 37
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-wide v2, v0

    move-wide v4, v0

    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 38
    const/4 v7, 0x0

    .line 40
    :try_start_0
    new-instance v1, Landroid/os/StatFs;

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 43
    :goto_2
    if-eqz v0, :cond_2

    .line 46
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v1

    int-to-long v10, v1

    .line 47
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v1

    int-to-long v12, v1

    mul-long/2addr v12, v10

    add-long/2addr v4, v12

    .line 48
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    mul-long/2addr v0, v10

    add-long/2addr v0, v2

    move-wide v2, v0

    .line 49
    goto :goto_1

    .line 41
    :catch_0
    move-exception v0

    move-object v0, v7

    goto :goto_2

    .line 50
    :cond_3
    const/4 v0, 0x0

    aput-wide v4, v6, v0

    .line 51
    const/4 v0, 0x1

    aput-wide v2, v6, v0

    move-object v0, v6

    .line 53
    goto :goto_0

    .line 28
    nop

    :array_0
    .array-data 8
        0x0
        0x0
    .end array-data
.end method
