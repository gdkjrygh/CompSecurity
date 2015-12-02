.class public Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/StorageDeviceUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StorageDevice"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;
    }
.end annotation


# instance fields
.field public freeSize:J

.field public path:Ljava/lang/String;

.field public totalSize:J

.field public type:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFormatFreeSize(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 305
    iget-wide v0, p0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->freeSize:J

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->getHumanReadableSizeMore(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFormatTotalSize(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 298
    iget-wide v0, p0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->getHumanReadableSizeMore(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 310
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "StorageDevice [type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->type:Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", totalSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->totalSize:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", freeSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->freeSize:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", path="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 311
    iget-object v1, p0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->path:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
