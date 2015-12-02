.class public Lcom/facebook/push/mqtt/c;
.super Ljava/lang/Object;
.source "BackoffRetryStrategy.java"

# interfaces
.implements Lcom/facebook/push/mqtt/h;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/Random;

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput p1, p0, Lcom/facebook/push/mqtt/c;->a:I

    .line 22
    iput p2, p0, Lcom/facebook/push/mqtt/c;->b:I

    .line 23
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/facebook/push/mqtt/c;->c:Ljava/util/Random;

    .line 25
    invoke-direct {p0}, Lcom/facebook/push/mqtt/c;->c()V

    .line 26
    return-void
.end method

.method private c()V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/push/mqtt/c;->d:I

    .line 30
    iget v0, p0, Lcom/facebook/push/mqtt/c;->a:I

    iput v0, p0, Lcom/facebook/push/mqtt/c;->e:I

    .line 31
    return-void
.end method


# virtual methods
.method public a()I
    .locals 5

    .prologue
    .line 35
    iget v0, p0, Lcom/facebook/push/mqtt/c;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/push/mqtt/c;->d:I

    .line 38
    iget v0, p0, Lcom/facebook/push/mqtt/c;->e:I

    .line 39
    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/facebook/push/mqtt/c;->b:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 41
    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    iget-object v3, p0, Lcom/facebook/push/mqtt/c;->c:Ljava/util/Random;

    invoke-virtual {v3}, Ljava/util/Random;->nextFloat()F

    move-result v3

    float-to-double v3, v3

    add-double/2addr v1, v3

    int-to-double v3, v0

    mul-double v0, v1, v3

    double-to-int v0, v0

    .line 43
    iput v0, p0, Lcom/facebook/push/mqtt/c;->e:I

    .line 44
    iget v0, p0, Lcom/facebook/push/mqtt/c;->e:I

    return v0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 50
    iget v0, p0, Lcom/facebook/push/mqtt/c;->d:I

    const v1, 0x7fffffff

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 55
    const-string v0, "BackoffRetryStrategy: attempt:%d/Infinite, delay:%d seconds"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/facebook/push/mqtt/c;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/facebook/push/mqtt/c;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
