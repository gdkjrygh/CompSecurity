.class final Lb/a/a/a/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/i;


# instance fields
.field final a:Ljava/util/concurrent/CountDownLatch;

.field final synthetic b:I

.field final synthetic c:Lb/a/a/a/d;


# direct methods
.method constructor <init>(Lb/a/a/a/d;I)V
    .locals 2

    .prologue
    .line 588
    iput-object p1, p0, Lb/a/a/a/f;->c:Lb/a/a/a/d;

    iput p2, p0, Lb/a/a/a/f;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 589
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    iget v1, p0, Lb/a/a/a/f;->b:I

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lb/a/a/a/f;->a:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 596
    iget-object v0, p0, Lb/a/a/a/f;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 597
    iget-object v0, p0, Lb/a/a/a/f;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 598
    iget-object v0, p0, Lb/a/a/a/f;->c:Lb/a/a/a/d;

    invoke-static {v0}, Lb/a/a/a/d;->a(Lb/a/a/a/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 599
    iget-object v0, p0, Lb/a/a/a/f;->c:Lb/a/a/a/d;

    invoke-static {v0}, Lb/a/a/a/d;->b(Lb/a/a/a/d;)Lb/a/a/a/i;

    move-result-object v0

    invoke-interface {v0}, Lb/a/a/a/i;->a()V

    .line 601
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 1

    .prologue
    .line 605
    iget-object v0, p0, Lb/a/a/a/f;->c:Lb/a/a/a/d;

    invoke-static {v0}, Lb/a/a/a/d;->b(Lb/a/a/a/d;)Lb/a/a/a/i;

    move-result-object v0

    invoke-interface {v0, p1}, Lb/a/a/a/i;->a(Ljava/lang/Exception;)V

    .line 606
    return-void
.end method
