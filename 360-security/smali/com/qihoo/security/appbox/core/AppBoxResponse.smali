.class public Lcom/qihoo/security/appbox/core/AppBoxResponse;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ERROR_CODE_20103:I = 0x4e87

.field public static final ERROR_CODE_40101:I = 0x9ca5

.field public static final ERROR_CODE_40102:I = 0x9ca6


# instance fields
.field public appItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation
.end field

.field public end_state:I

.field public errno:I

.field public faceBookItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation
.end field

.field public lastRequestTime:J

.field public total:I

.field public updateTime:J


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput v0, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    .line 23
    iput v0, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->end_state:I

    .line 26
    iput v0, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->total:I

    .line 28
    iput-wide v2, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->faceBookItems:Ljava/util/ArrayList;

    .line 35
    iput-wide v2, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "errno = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " end_state = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->end_state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " total = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->total:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " updateTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
