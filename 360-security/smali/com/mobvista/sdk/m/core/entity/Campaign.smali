.class public Lcom/mobvista/sdk/m/core/entity/Campaign;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/util/NoProGuard;
.implements Ljava/io/Serializable;


# static fields
.field public static final TYPE_FB:I = 0x1

.field public static final TYPE_MV:I = 0x2

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public adCall:Ljava/lang/String;

.field private appDesc:Ljava/lang/String;

.field private appName:Ljava/lang/String;

.field private bgImage:Ljava/lang/String;

.field private iconUrl:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private size:Ljava/lang/String;

.field private timestamp:J

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->id:Ljava/lang/String;

    .line 27
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->packageName:Ljava/lang/String;

    .line 29
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->appName:Ljava/lang/String;

    .line 31
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->appDesc:Ljava/lang/String;

    .line 33
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->size:Ljava/lang/String;

    .line 35
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->iconUrl:Ljava/lang/String;

    .line 37
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->imageUrl:Ljava/lang/String;

    .line 39
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->timestamp:J

    .line 41
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->bgImage:Ljava/lang/String;

    .line 43
    const-string/jumbo v0, "INSTALL"

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->adCall:Ljava/lang/String;

    .line 45
    const/4 v0, 0x2

    iput v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->type:I

    return-void
.end method


# virtual methods
.method public getAdCall()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->adCall:Ljava/lang/String;

    return-object v0
.end method

.method public getAppDesc()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->appDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getBgImage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->bgImage:Ljava/lang/String;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getSize()Ljava/lang/String;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->size:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .prologue
    .line 115
    iget-wide v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->timestamp:J

    return-wide v0
.end method

.method public getType()I
    .locals 1

    .prologue
    .line 107
    iget v0, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->type:I

    return v0
.end method

.method public setAdCall(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 52
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    :goto_0
    return-void

    .line 55
    :cond_0
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->adCall:Ljava/lang/String;

    goto :goto_0
.end method

.method public setAppDesc(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->appDesc:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->appName:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setBgImage(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->bgImage:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->iconUrl:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->id:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->imageUrl:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->packageName:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setSize(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->size:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public setTimestamp(J)V
    .locals 1

    .prologue
    .line 119
    iput-wide p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->timestamp:J

    .line 120
    return-void
.end method

.method public setType(I)V
    .locals 0

    .prologue
    .line 111
    iput p1, p0, Lcom/mobvista/sdk/m/core/entity/Campaign;->type:I

    .line 112
    return-void
.end method
