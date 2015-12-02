.class Lcom/facebook/push/mqtt/r;
.super Ljava/lang/Object;
.source "KeepaliveManager.java"


# instance fields
.field private final a:Ljava/lang/Runnable;

.field private final b:J

.field private volatile c:I


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;J)V
    .locals 1

    .prologue
    .line 356
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 354
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/push/mqtt/r;->c:I

    .line 357
    iput-object p1, p0, Lcom/facebook/push/mqtt/r;->a:Ljava/lang/Runnable;

    .line 358
    iput-wide p2, p0, Lcom/facebook/push/mqtt/r;->b:J

    .line 359
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Lcom/facebook/push/mqtt/r;->a:Ljava/lang/Runnable;

    return-object v0
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 374
    if-ltz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 375
    iput p1, p0, Lcom/facebook/push/mqtt/r;->c:I

    .line 376
    return-void

    .line 374
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 366
    iget-wide v0, p0, Lcom/facebook/push/mqtt/r;->b:J

    return-wide v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 370
    iget v0, p0, Lcom/facebook/push/mqtt/r;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 379
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/r;->a()Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
