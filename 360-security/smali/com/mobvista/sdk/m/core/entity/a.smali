.class public final Lcom/mobvista/sdk/m/core/entity/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/mobvista/sdk/m/core/entity/a;->b:I

    .line 33
    return-void
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 64
    iput-wide p1, p0, Lcom/mobvista/sdk/m/core/entity/a;->f:J

    .line 65
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/a;->a:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/mobvista/sdk/m/core/entity/a;->b:I

    return v0
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 40
    iput p1, p0, Lcom/mobvista/sdk/m/core/entity/a;->c:I

    .line 41
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/mobvista/sdk/m/core/entity/a;->c:I

    return v0
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lcom/mobvista/sdk/m/core/entity/a;->d:I

    .line 49
    return-void
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/mobvista/sdk/m/core/entity/a;->d:I

    return v0
.end method

.method public final d(I)V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lcom/mobvista/sdk/m/core/entity/a;->e:I

    .line 57
    return-void
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/mobvista/sdk/m/core/entity/a;->e:I

    return v0
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 60
    iget-wide v0, p0, Lcom/mobvista/sdk/m/core/entity/a;->f:J

    return-wide v0
.end method
