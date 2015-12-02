.class public Lcom/qihoo/security/node/BaseItemInfo;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public checkStatus:I

.field public childLevel:I

.field public isExpand:I

.field public level:I

.field public lineType:I

.field public shadeType:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput v1, p0, Lcom/qihoo/security/node/BaseItemInfo;->level:I

    .line 22
    iput v1, p0, Lcom/qihoo/security/node/BaseItemInfo;->childLevel:I

    .line 25
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/node/BaseItemInfo;->checkStatus:I

    .line 33
    iput v1, p0, Lcom/qihoo/security/node/BaseItemInfo;->isExpand:I

    .line 41
    iput v1, p0, Lcom/qihoo/security/node/BaseItemInfo;->lineType:I

    .line 49
    iput v1, p0, Lcom/qihoo/security/node/BaseItemInfo;->shadeType:I

    return-void
.end method
