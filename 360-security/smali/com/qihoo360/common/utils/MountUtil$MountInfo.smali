.class public Lcom/qihoo360/common/utils/MountUtil$MountInfo;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/MountUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MountInfo"
.end annotation


# instance fields
.field public dev:Ljava/lang/String;

.field public flags:Ljava/lang/String;

.field public fstype:Ljava/lang/String;

.field public mountPoint:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
