.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private b:J

.field private c:J

.field private d:Z

.field private e:Z

.field private final f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;

.field private g:J

.field private h:I

.field private i:J

.field private j:I


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;I)V
    .locals 6

    .prologue
    const-wide/16 v4, 0xc8

    const-wide/16 v2, 0x0

    const/16 v1, 0xf

    .line 2385
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2386
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;

    .line 2387
    iput p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->j:I

    .line 2388
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 2389
    const-wide/16 v0, 0x32

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->g:J

    .line 2390
    const/16 v0, 0x3c

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->h:I

    .line 2400
    :goto_0
    return-void

    .line 2391
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 2392
    iput-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->g:J

    .line 2393
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->h:I

    .line 2394
    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->i:J

    goto :goto_0

    .line 2396
    :cond_1
    iput-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->g:J

    .line 2397
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->h:I

    .line 2398
    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->i:J

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 2410
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->start()V

    .line 2411
    return-void
.end method

.method public a(J)V
    .locals 9

    .prologue
    .line 2442
    iput-wide p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c:J

    .line 2443
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c:J

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 2444
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b:J

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c:J

    .line 2446
    :cond_0
    new-instance v1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 2447
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c:J

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->i:J

    cmp-long v0, v2, v4

    if-ltz v0, :cond_1

    .line 2448
    const/4 v0, 0x1

    :goto_0
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->h:I

    if-gt v0, v2, :cond_2

    .line 2449
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b:J

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c:J

    iget-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b:J

    sub-long/2addr v4, v6

    int-to-long v6, v0

    mul-long/2addr v4, v6

    iget v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->h:I

    int-to-long v6, v6

    div-long/2addr v4, v6

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 2448
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2452
    :cond_1
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 2454
    :cond_2
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a:Ljava/util/Queue;

    .line 2455
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 2414
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->d:Z

    .line 2415
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 2418
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->e:Z

    .line 2419
    return-void
.end method

.method public d()V
    .locals 8

    .prologue
    const-wide/16 v6, 0xc8

    const-wide/16 v4, 0x0

    const/4 v2, 0x5

    .line 2422
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->j:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 2423
    const-wide/16 v0, 0x32

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->g:J

    .line 2424
    const/16 v0, 0x14

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->h:I

    .line 2434
    :goto_0
    return-void

    .line 2425
    :cond_0
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2426
    iput-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->g:J

    .line 2427
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->h:I

    .line 2428
    iput-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->i:J

    goto :goto_0

    .line 2430
    :cond_1
    iput-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->g:J

    .line 2431
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->h:I

    .line 2432
    iput-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->i:J

    goto :goto_0
.end method

.method public run()V
    .locals 6

    .prologue
    .line 2459
    const/4 v0, 0x0

    .line 2460
    :goto_0
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->d:Z

    if-nez v1, :cond_3

    .line 2461
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a:Ljava/util/Queue;

    if-eqz v1, :cond_0

    .line 2462
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 2464
    :cond_0
    if-eqz v0, :cond_2

    .line 2465
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b:J

    .line 2466
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;

    if-eqz v1, :cond_1

    .line 2467
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->g:J

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;->a(JJ)V

    .line 2476
    :cond_1
    :try_start_0
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->g:J

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2477
    :catch_0
    move-exception v1

    .line 2478
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 2469
    :cond_2
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->e:Z

    if-eqz v1, :cond_1

    .line 2470
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;

    if-eqz v0, :cond_3

    .line 2471
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;->a()V

    .line 2481
    :cond_3
    return-void
.end method
