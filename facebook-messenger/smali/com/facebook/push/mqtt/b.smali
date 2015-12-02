.class public Lcom/facebook/push/mqtt/b;
.super Ljava/lang/Object;
.source "BackToBackRetryStrategy.java"

# interfaces
.implements Lcom/facebook/push/mqtt/h;


# instance fields
.field private final a:I

.field private final b:I

.field private c:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Lcom/facebook/push/mqtt/b;->a:I

    .line 30
    iput p2, p0, Lcom/facebook/push/mqtt/b;->b:I

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/push/mqtt/b;->c:I

    .line 32
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    iget v0, p0, Lcom/facebook/push/mqtt/b;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/push/mqtt/b;->c:I

    .line 38
    iget v0, p0, Lcom/facebook/push/mqtt/b;->b:I

    .line 41
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 46
    iget v0, p0, Lcom/facebook/push/mqtt/b;->c:I

    iget v1, p0, Lcom/facebook/push/mqtt/b;->a:I

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
    .line 51
    const-string v0, "BackToBackRetryStrategy: attempt:%d/%d, delay:%d seconds"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/facebook/push/mqtt/b;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/facebook/push/mqtt/b;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/facebook/push/mqtt/b;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
