.class public Lcom/facebook/push/mqtt/ao;
.super Ljava/lang/Object;
.source "MqttOperation.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/mqtt/b;

.field private final b:Lcom/facebook/mqtt/messages/k;

.field private final c:I

.field private final d:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final e:J

.field private f:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/messages/k;IJ)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ao;->d:Lcom/google/common/d/a/ab;

    .line 34
    iput-object p1, p0, Lcom/facebook/push/mqtt/ao;->a:Lcom/facebook/mqtt/b;

    .line 35
    iput-object p2, p0, Lcom/facebook/push/mqtt/ao;->b:Lcom/facebook/mqtt/messages/k;

    .line 36
    iput p3, p0, Lcom/facebook/push/mqtt/ao;->c:I

    .line 37
    iput-wide p4, p0, Lcom/facebook/push/mqtt/ao;->e:J

    .line 38
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/push/mqtt/ao;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/facebook/push/mqtt/ao;->f:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 80
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/b;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/push/mqtt/ao;->a:Lcom/facebook/mqtt/b;

    return-object v0
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 72
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ao;->g()V

    .line 73
    iget-object v0, p0, Lcom/facebook/push/mqtt/ao;->d:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Throwable;)Z

    .line 74
    return-void
.end method

.method public a(Ljava/util/concurrent/ScheduledFuture;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 57
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lcom/facebook/push/mqtt/ao;->f:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Timeout future can be set only once."

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 59
    iput-object p1, p0, Lcom/facebook/push/mqtt/ao;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 60
    return-void

    .line 58
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/mqtt/messages/k;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/push/mqtt/ao;->b:Lcom/facebook/mqtt/messages/k;

    return-object v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 49
    iget v0, p0, Lcom/facebook/push/mqtt/ao;->c:I

    return v0
.end method

.method public d()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/push/mqtt/ao;->d:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/facebook/push/mqtt/ao;->e:J

    return-wide v0
.end method

.method public f()V
    .locals 2

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ao;->g()V

    .line 68
    iget-object v0, p0, Lcom/facebook/push/mqtt/ao;->d:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 69
    return-void
.end method
