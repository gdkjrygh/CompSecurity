.class public final Lcom/kik/d/b/a$p;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "p"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/d/b/a$p$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/kik/d/b/a$p;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:J

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7831
    new-instance v0, Lcom/kik/d/b/a$p;

    invoke-direct {v0}, Lcom/kik/d/b/a$p;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$p;->k:Lcom/kik/d/b/a$p;

    .line 7838
    new-instance v0, Lcom/kik/d/b/l;

    invoke-direct {v0}, Lcom/kik/d/b/l;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$p;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 7338
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 7464
    iput-byte v0, p0, Lcom/kik/d/b/a$p;->i:B

    .line 7493
    iput v0, p0, Lcom/kik/d/b/a$p;->j:I

    .line 7339
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$p;->g:Ljava/lang/Object;

    .line 7340
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/kik/d/b/a$p;->h:J

    .line 7341
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 7336
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 7464
    iput-byte v0, p0, Lcom/kik/d/b/a$p;->i:B

    .line 7493
    iput v0, p0, Lcom/kik/d/b/a$p;->j:I

    .line 7337
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 7330
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$p;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 7351
    invoke-direct {p0}, Lcom/kik/d/b/a$p;-><init>()V

    .line 7352
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 7356
    const/4 v0, 0x0

    .line 7357
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 7358
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 7359
    sparse-switch v3, :sswitch_data_0

    .line 7364
    invoke-virtual {p0, p1, v2, p2, v3}, Lcom/kik/d/b/a$p;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    .line 7366
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 7362
    goto :goto_0

    .line 7371
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v3

    .line 7372
    iget v4, p0, Lcom/kik/d/b/a$p;->f:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/kik/d/b/a$p;->f:I

    .line 7373
    iput-object v3, p0, Lcom/kik/d/b/a$p;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 7383
    :catch_0
    move-exception v0

    .line 7384
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7390
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$p;->e:Lcom/c/b/by;

    .line 7391
    invoke-virtual {p0}, Lcom/kik/d/b/a$p;->L()V

    throw v0

    .line 7377
    :sswitch_2
    :try_start_2
    iget v3, p0, Lcom/kik/d/b/a$p;->f:I

    or-int/lit8 v3, v3, 0x2

    iput v3, p0, Lcom/kik/d/b/a$p;->f:I

    .line 7378
    invoke-virtual {p1}, Lcom/c/b/g;->e()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/kik/d/b/a$p;->h:J
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 7385
    :catch_1
    move-exception v0

    .line 7386
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    .line 7388
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 7390
    :cond_1
    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$p;->e:Lcom/c/b/by;

    .line 7391
    invoke-virtual {p0}, Lcom/kik/d/b/a$p;->L()V

    .line 7392
    return-void

    .line 7359
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 7330
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$p;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/d/b/a$p;I)I
    .locals 0

    .prologue
    .line 7330
    iput p1, p0, Lcom/kik/d/b/a$p;->f:I

    return p1
.end method

.method static synthetic a(Lcom/kik/d/b/a$p;J)J
    .locals 1

    .prologue
    .line 7330
    iput-wide p1, p0, Lcom/kik/d/b/a$p;->h:J

    return-wide p1
.end method

.method static synthetic a(Lcom/kik/d/b/a$p;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 7330
    iget-object v0, p0, Lcom/kik/d/b/a$p;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/d/b/a$p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 7330
    iput-object p1, p0, Lcom/kik/d/b/a$p;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/kik/d/b/a$p;)Lcom/c/b/by;
    .locals 1

    .prologue
    .line 7330
    iget-object v0, p0, Lcom/kik/d/b/a$p;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public static k()Lcom/kik/d/b/a$p$a;
    .locals 1

    .prologue
    .line 7568
    sget-object v0, Lcom/kik/d/b/a$p;->k:Lcom/kik/d/b/a$p;

    invoke-direct {v0}, Lcom/kik/d/b/a$p;->o()Lcom/kik/d/b/a$p$a;

    move-result-object v0

    return-object v0
.end method

.method public static l()Lcom/kik/d/b/a$p;
    .locals 1

    .prologue
    .line 7835
    sget-object v0, Lcom/kik/d/b/a$p;->k:Lcom/kik/d/b/a$p;

    return-object v0
.end method

.method static synthetic m()Z
    .locals 1

    .prologue
    .line 7330
    sget-boolean v0, Lcom/kik/d/b/a$p;->d:Z

    return v0
.end method

.method private n()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 7437
    iget-object v0, p0, Lcom/kik/d/b/a$p;->g:Ljava/lang/Object;

    .line 7438
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7439
    check-cast v0, Ljava/lang/String;

    .line 7440
    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 7442
    iput-object v0, p0, Lcom/kik/d/b/a$p;->g:Ljava/lang/Object;

    .line 7445
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private o()Lcom/kik/d/b/a$p$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 7574
    sget-object v0, Lcom/kik/d/b/a$p;->k:Lcom/kik/d/b/a$p;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/d/b/a$p$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$p$a;-><init>(B)V

    .line 7575
    :goto_0
    return-object v0

    .line 7574
    :cond_0
    new-instance v0, Lcom/kik/d/b/a$p$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$p$a;-><init>(B)V

    .line 7575
    invoke-virtual {v0, p0}, Lcom/kik/d/b/a$p$a;->a(Lcom/kik/d/b/a$p;)Lcom/kik/d/b/a$p$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 7330
    new-instance v0, Lcom/kik/d/b/a$p$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/d/b/a$p$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 7484
    iget v0, p0, Lcom/kik/d/b/a$p;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 7485
    invoke-direct {p0}, Lcom/kik/d/b/a$p;->n()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 7487
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$p;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 7488
    iget-wide v0, p0, Lcom/kik/d/b/a$p;->h:J

    invoke-virtual {p1, v2, v0, v1}, Lcom/c/b/h;->b(IJ)V

    .line 7490
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$p;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 7491
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 7466
    iget-byte v2, p0, Lcom/kik/d/b/a$p;->i:B

    .line 7467
    if-ne v2, v0, :cond_0

    .line 7479
    :goto_0
    return v0

    .line 7468
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 7470
    :cond_1
    invoke-virtual {p0}, Lcom/kik/d/b/a$p;->h()Z

    move-result v2

    if-nez v2, :cond_2

    .line 7471
    iput-byte v1, p0, Lcom/kik/d/b/a$p;->i:B

    move v0, v1

    .line 7472
    goto :goto_0

    .line 7474
    :cond_2
    invoke-virtual {p0}, Lcom/kik/d/b/a$p;->i()Z

    move-result v2

    if-nez v2, :cond_3

    .line 7475
    iput-byte v1, p0, Lcom/kik/d/b/a$p;->i:B

    move v0, v1

    .line 7476
    goto :goto_0

    .line 7478
    :cond_3
    iput-byte v0, p0, Lcom/kik/d/b/a$p;->i:B

    goto :goto_0
.end method

.method public final b()I
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v2, 0x1

    .line 7495
    iget v0, p0, Lcom/kik/d/b/a$p;->j:I

    .line 7496
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 7509
    :goto_0
    return v0

    .line 7498
    :cond_0
    const/4 v0, 0x0

    .line 7499
    iget v1, p0, Lcom/kik/d/b/a$p;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 7501
    invoke-direct {p0}, Lcom/kik/d/b/a$p;->n()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 7503
    :cond_1
    iget v1, p0, Lcom/kik/d/b/a$p;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v4, :cond_2

    .line 7504
    iget-wide v2, p0, Lcom/kik/d/b/a$p;->h:J

    .line 7505
    invoke-static {v4, v2, v3}, Lcom/c/b/h;->e(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 7507
    :cond_2
    iget-object v1, p0, Lcom/kik/d/b/a$p;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 7508
    iput v0, p0, Lcom/kik/d/b/a$p;->j:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 7401
    invoke-static {}, Lcom/kik/d/b/a;->l()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$p;

    const-class v2, Lcom/kik/d/b/a$p$a;

    .line 7402
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 7346
    iget-object v0, p0, Lcom/kik/d/b/a$p;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 7413
    iget v1, p0, Lcom/kik/d/b/a$p;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Z
    .locals 2

    .prologue
    .line 7455
    iget v0, p0, Lcom/kik/d/b/a$p;->f:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final j()J
    .locals 2

    .prologue
    .line 7461
    iget-wide v0, p0, Lcom/kik/d/b/a$p;->h:J

    return-wide v0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 7863
    sget-object v0, Lcom/kik/d/b/a$p;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 7330
    sget-object v0, Lcom/kik/d/b/a$p;->k:Lcom/kik/d/b/a$p;

    invoke-direct {v0}, Lcom/kik/d/b/a$p;->o()Lcom/kik/d/b/a$p$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 7330
    invoke-direct {p0}, Lcom/kik/d/b/a$p;->o()Lcom/kik/d/b/a$p$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 7330
    sget-object v0, Lcom/kik/d/b/a$p;->k:Lcom/kik/d/b/a$p;

    return-object v0
.end method
