.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/enginehelper/clean/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

.field private b:Z

.field private final c:[B


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 1

    .prologue
    .line 582
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 584
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->c:[B

    return-void
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 11

    .prologue
    .line 587
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/d;)Lcom/qihoo/security/opti/trashclear/d;

    .line 589
    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/e$a;->b()J

    move-result-wide v0

    .line 590
    iget-object v2, p1, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/e$a;->c()J

    move-result-wide v2

    .line 591
    iget-object v4, p1, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    iget-wide v4, v4, Lcom/qihoo/security/opti/trashclear/e$a;->c:J

    .line 592
    iget-object v6, p1, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v6}, Lcom/qihoo/security/opti/trashclear/e$a;->e()J

    move-result-wide v6

    .line 594
    long-to-float v8, v6

    invoke-static {v8}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(F)I

    move-result v8

    mul-int/lit16 v8, v8, 0x3e8

    div-int/lit8 v8, v8, 0x64

    .line 596
    iget-boolean v9, p1, Lcom/qihoo/security/opti/trashclear/d;->c:Z

    if-eqz v9, :cond_5

    .line 597
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->c:[B

    monitor-enter v9

    .line 598
    :try_start_0
    iget-object v10, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v10}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    move-result-object v10

    if-eqz v10, :cond_0

    .line 599
    iget-object v10, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v10}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    move-result-object v10

    invoke-virtual {v10}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a()V

    .line 600
    iget-object v10, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v10}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    move-result-object v10

    invoke-virtual {v10}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->d()V

    .line 602
    :cond_0
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 603
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    if-eqz v9, :cond_1

    .line 604
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    invoke-virtual {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->d()V

    .line 606
    :cond_1
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    if-eqz v9, :cond_2

    .line 607
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    invoke-virtual {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->d()V

    .line 609
    :cond_2
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    if-eqz v9, :cond_3

    .line 610
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    invoke-virtual {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->d()V

    .line 612
    :cond_3
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    if-eqz v9, :cond_4

    .line 613
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    invoke-virtual {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->d()V

    .line 615
    :cond_4
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 616
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    invoke-virtual {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->d()V

    .line 619
    :cond_5
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    if-eqz v9, :cond_6

    .line 620
    iget-object v9, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v9}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v9

    invoke-virtual {v9, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a(J)V

    .line 622
    :cond_6
    iget-object v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v6

    if-eqz v6, :cond_7

    .line 623
    iget-object v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v6

    invoke-virtual {v6, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a(J)V

    .line 625
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 626
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a(J)V

    .line 628
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 629
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a(J)V

    .line 631
    :cond_9
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 632
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    int-to-long v2, v8

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a(J)V

    .line 634
    :cond_a
    return-void

    .line 602
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 0

    .prologue
    .line 582
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a(Lcom/qihoo/security/opti/trashclear/d;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;Z)Z
    .locals 0

    .prologue
    .line 582
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->b:Z

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)[B
    .locals 1

    .prologue
    .line 582
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->c:[B

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)Z
    .locals 1

    .prologue
    .line 582
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->b:Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 641
    iput-boolean v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->b:Z

    .line 642
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 855
    :cond_0
    :goto_0
    return-void

    .line 646
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)V

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;I)V

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    .line 674
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a()V

    .line 676
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)V

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;I)V

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    .line 709
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a()V

    .line 711
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)V

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;I)V

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    .line 745
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a()V

    .line 747
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$4;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$4;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)V

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;I)V

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    .line 781
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a()V

    .line 783
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)V

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;I)V

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    .line 835
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->a()V

    .line 836
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_has_clear_memory"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 837
    invoke-static {}, Lcom/qihoo/security/service/ProcessClearService;->d()V

    .line 842
    :cond_2
    new-instance v0, Lcom/qihoo/security/opti/trashclear/d;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/d;-><init>()V

    .line 843
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/e$a;->n:J

    .line 844
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$6;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$6;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;Lcom/qihoo/security/opti/trashclear/d;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto/16 :goto_0
.end method

.method public a(ILjava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 859
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {p1, p2}, Lcom/qihoo/security/opti/trashclear/e;->a(ILjava/util/Map;)Lcom/qihoo/security/opti/trashclear/d;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/d;)Lcom/qihoo/security/opti/trashclear/d;

    move-result-object v0

    .line 860
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/e$a;->n:J

    .line 861
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v1

    if-nez v1, :cond_1

    .line 862
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    .line 876
    :goto_0
    return-void

    .line 865
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;Lcom/qihoo/security/opti/trashclear/d;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 882
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 959
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)[B

    move-result-object v1

    monitor-enter v1

    .line 960
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 961
    monitor-exit v1

    .line 962
    return-void

    .line 961
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(ILjava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v8, 0x465d

    .line 886
    invoke-static {p1, p2}, Lcom/qihoo/security/opti/trashclear/e;->a(ILjava/util/Map;)Lcom/qihoo/security/opti/trashclear/d;

    move-result-object v0

    .line 887
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/e$a;->n:J

    .line 888
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/qihoo/security/opti/trashclear/d;->c:Z

    .line 891
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/d;)V

    .line 893
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$8;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$8;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;Lcom/qihoo/security/opti/trashclear/d;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 904
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->K(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    .line 906
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 912
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 925
    :goto_0
    return-void

    .line 915
    :cond_0
    const/16 v1, 0x465c

    iget-object v4, v0, Lcom/qihoo/security/opti/trashclear/d;->j:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v4}, Lcom/qihoo/security/opti/trashclear/e$a;->e()J

    move-result-wide v4

    invoke-static {v1, v4, v5}, Lcom/qihoo/security/support/b;->b(IJ)V

    .line 917
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v4, "sp_key_has_clear_memory"

    const/4 v5, 0x0

    invoke-static {v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-lez v1, :cond_1

    .line 918
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/e$a;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v0, v1}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 924
    :goto_1
    const/16 v0, 0x478c

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v1, v2

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->c(II)V

    goto :goto_0

    .line 921
    :cond_1
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/e$a;->e()J

    move-result-wide v0

    invoke-static {v8, v0, v1}, Lcom/qihoo/security/support/b;->b(IJ)V

    goto :goto_1
.end method

.method public c()V
    .locals 3

    .prologue
    .line 929
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 930
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->b()V

    .line 933
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 934
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a()V

    .line 936
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    .line 937
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$9;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$9;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 947
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->K(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    .line 948
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)[B

    move-result-object v1

    monitor-enter v1

    .line 949
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 950
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->b:Z

    .line 951
    monitor-exit v1

    .line 952
    return-void

    .line 951
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
