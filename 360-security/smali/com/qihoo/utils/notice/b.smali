.class public Lcom/qihoo/utils/notice/b;
.super Lcom/qihoo/security/base/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/utils/notice/b$a;
    }
.end annotation


# instance fields
.field private final c:Lcom/qihoo/security/service/a;

.field private final d:Lcom/qihoo/utils/notice/b$a;

.field private final e:Lcom/qihoo/security/app/a;

.field private f:Z

.field private g:I

.field private h:I

.field private i:Ljava/lang/String;

.field private j:J

.field private k:I

.field private final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final m:Lcom/qihoo/security/app/a$b;

.field private final n:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lcom/qihoo/security/service/c$a;

.field private final p:Lcom/qihoo/security/service/b$a;

.field private q:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 83
    invoke-direct {p0, p1}, Lcom/qihoo/security/base/a;-><init>(Landroid/content/Context;)V

    .line 80
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/utils/notice/b;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 104
    new-instance v0, Lcom/qihoo/utils/notice/b$1;

    invoke-direct {v0, p0}, Lcom/qihoo/utils/notice/b$1;-><init>(Lcom/qihoo/utils/notice/b;)V

    iput-object v0, p0, Lcom/qihoo/utils/notice/b;->m:Lcom/qihoo/security/app/a$b;

    .line 141
    new-instance v0, Lcom/qihoo/utils/notice/b$2;

    invoke-direct {v0, p0}, Lcom/qihoo/utils/notice/b$2;-><init>(Lcom/qihoo/utils/notice/b;)V

    iput-object v0, p0, Lcom/qihoo/utils/notice/b;->n:Ljava/util/Comparator;

    .line 154
    new-instance v0, Lcom/qihoo/utils/notice/b$3;

    invoke-direct {v0, p0}, Lcom/qihoo/utils/notice/b$3;-><init>(Lcom/qihoo/utils/notice/b;)V

    iput-object v0, p0, Lcom/qihoo/utils/notice/b;->o:Lcom/qihoo/security/service/c$a;

    .line 247
    new-instance v0, Lcom/qihoo/utils/notice/b$4;

    invoke-direct {v0, p0}, Lcom/qihoo/utils/notice/b$4;-><init>(Lcom/qihoo/utils/notice/b;)V

    iput-object v0, p0, Lcom/qihoo/utils/notice/b;->p:Lcom/qihoo/security/service/b$a;

    .line 416
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/utils/notice/b;->q:J

    .line 84
    iput-object p2, p0, Lcom/qihoo/utils/notice/b;->c:Lcom/qihoo/security/service/a;

    .line 87
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->c:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->o:Lcom/qihoo/security/service/c$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/c;)V

    .line 88
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->c:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->p:Lcom/qihoo/security/service/b$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :goto_0
    new-instance v0, Lcom/qihoo/utils/notice/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/utils/notice/b$a;-><init>(Lcom/qihoo/utils/notice/b;Lcom/qihoo/utils/notice/b$1;)V

    iput-object v0, p0, Lcom/qihoo/utils/notice/b;->d:Lcom/qihoo/utils/notice/b$a;

    .line 96
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->d:Lcom/qihoo/utils/notice/b$a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/b$a;->a(Landroid/content/Context;)V

    .line 98
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/app/a;->a(Landroid/content/Context;)Lcom/qihoo/security/app/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/utils/notice/b;->e:Lcom/qihoo/security/app/a;

    .line 99
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->e:Lcom/qihoo/security/app/a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->m:Lcom/qihoo/security/app/a$b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/app/a;->a(Lcom/qihoo/security/app/a$b;)V

    .line 100
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 101
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->e:Lcom/qihoo/security/app/a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/app/a;->a(Z)V

    .line 102
    return-void

    .line 89
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic A(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/utils/notice/b;I)I
    .locals 0

    .prologue
    .line 45
    iput p1, p0, Lcom/qihoo/utils/notice/b;->k:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/utils/notice/b;J)J
    .locals 1

    .prologue
    .line 45
    iput-wide p1, p0, Lcom/qihoo/utils/notice/b;->j:J

    return-wide p1
.end method

.method static synthetic a(Lcom/qihoo/utils/notice/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/qihoo/utils/notice/b;->i:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/utils/notice/b;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/utils/notice/b;Z)Z
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/qihoo/utils/notice/b;->f:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/utils/notice/b;I)I
    .locals 0

    .prologue
    .line 45
    iput p1, p0, Lcom/qihoo/utils/notice/b;->h:I

    return p1
.end method

.method static synthetic b(Lcom/qihoo/utils/notice/b;J)J
    .locals 3

    .prologue
    .line 45
    iget-wide v0, p0, Lcom/qihoo/utils/notice/b;->j:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/qihoo/utils/notice/b;->j:J

    return-wide v0
.end method

.method static synthetic b(Lcom/qihoo/utils/notice/b;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/qihoo/utils/notice/b;->f()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/utils/notice/b;I)I
    .locals 0

    .prologue
    .line 45
    iput p1, p0, Lcom/qihoo/utils/notice/b;->g:I

    return p1
.end method

.method static synthetic c(Lcom/qihoo/utils/notice/b;)Ljava/util/Comparator;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->n:Ljava/util/Comparator;

    return-object v0
.end method

.method private d()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 4

    .prologue
    .line 409
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v0

    .line 410
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v2

    .line 411
    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/b/s;->a(JJ)I

    move-result v0

    .line 412
    invoke-static {v0}, Lcom/qihoo/security/booster/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/utils/notice/b;)Z
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/qihoo/utils/notice/b;->e()Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/app/a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->e:Lcom/qihoo/security/app/a;

    return-object v0
.end method

.method private e()Z
    .locals 4

    .prologue
    .line 424
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 425
    iget-wide v2, p0, Lcom/qihoo/utils/notice/b;->q:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic f(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 429
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/utils/notice/b;->q:J

    .line 430
    return-void
.end method

.method static synthetic g(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/utils/notice/b;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/qihoo/utils/notice/b;->h:I

    return v0
.end method

.method static synthetic i(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/utils/notice/b;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/qihoo/utils/notice/b;->g:I

    return v0
.end method

.method static synthetic m(Lcom/qihoo/utils/notice/b;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/qihoo/utils/notice/b;->f:Z

    return v0
.end method

.method static synthetic n(Lcom/qihoo/utils/notice/b;)J
    .locals 2

    .prologue
    .line 45
    iget-wide v0, p0, Lcom/qihoo/utils/notice/b;->j:J

    return-wide v0
.end method

.method static synthetic o(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic p(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic q(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic r(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic s(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic t(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic u(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic v(Lcom/qihoo/utils/notice/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic w(Lcom/qihoo/utils/notice/b;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->i:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic x(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic y(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method

.method static synthetic z(Lcom/qihoo/utils/notice/b;)Lcom/qihoo/security/base/a$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 351
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->c:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->o:Lcom/qihoo/security/service/c$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->b(Lcom/qihoo/security/service/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 359
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->c:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->p:Lcom/qihoo/security/service/b$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->b(Lcom/qihoo/security/service/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 366
    :goto_1
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->d:Lcom/qihoo/utils/notice/b$a;

    if-eqz v0, :cond_0

    .line 367
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->d:Lcom/qihoo/utils/notice/b$a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/b$a;->b(Landroid/content/Context;)V

    .line 370
    :cond_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->m:Lcom/qihoo/security/app/a$b;

    if-eqz v0, :cond_1

    .line 371
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->e:Lcom/qihoo/security/app/a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->m:Lcom/qihoo/security/app/a$b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/app/a;->b(Lcom/qihoo/security/app/a$b;)V

    .line 373
    :cond_1
    invoke-super {p0}, Lcom/qihoo/security/base/a;->a()V

    .line 374
    return-void

    .line 360
    :catch_0
    move-exception v0

    goto :goto_1

    .line 352
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected a(Landroid/os/Message;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 378
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 406
    :cond_0
    :goto_0
    return-void

    .line 380
    :sswitch_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v0

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 381
    iget v2, p0, Lcom/qihoo/utils/notice/b;->g:I

    iget-wide v4, p0, Lcom/qihoo/utils/notice/b;->j:J

    invoke-static {v2, v0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/b/s;->a(IJJ)[Ljava/lang/String;

    move-result-object v0

    .line 383
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v4, v0, v6

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    aget-object v0, v0, v7

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/utils/notice/a;->b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/String;)V

    goto :goto_0

    .line 387
    :sswitch_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v0

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 388
    iget v2, p0, Lcom/qihoo/utils/notice/b;->g:I

    iget-wide v4, p0, Lcom/qihoo/utils/notice/b;->j:J

    invoke-static {v2, v0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/b/s;->a(IJJ)[Ljava/lang/String;

    move-result-object v0

    .line 389
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v1

    invoke-direct {p0}, Lcom/qihoo/utils/notice/b;->d()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v4, v0, v6

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    aget-object v0, v0, v7

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/utils/notice/a;->c(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/String;)V

    goto :goto_0

    .line 393
    :sswitch_2
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/qihoo/utils/notice/b;->d()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/utils/notice/b;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/utils/notice/a;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/String;)V

    goto :goto_0

    .line 396
    :sswitch_3
    iget v0, p0, Lcom/qihoo/utils/notice/b;->k:I

    if-lez v0, :cond_0

    .line 397
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/qihoo/utils/notice/b;->d()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/utils/notice/b;->k:I

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;I)V

    goto/16 :goto_0

    .line 401
    :sswitch_4
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/qihoo/utils/notice/b;->d()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    goto/16 :goto_0

    .line 378
    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0xc8 -> :sswitch_1
        0x12c -> :sswitch_2
        0x190 -> :sswitch_3
        0x1f4 -> :sswitch_4
    .end sparse-switch
.end method

.method public b()V
    .locals 4

    .prologue
    const/16 v3, 0x1f4

    .line 263
    const/16 v0, 0x8

    const/16 v1, 0x17

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/s;->a(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 289
    :cond_0
    :goto_0
    return-void

    .line 267
    :cond_1
    const/4 v0, 0x0

    .line 269
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->c:Lcom/qihoo/security/service/a;

    invoke-interface {v1}, Lcom/qihoo/security/service/a;->c()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 276
    :goto_1
    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->a:Landroid/content/Context;

    const/16 v2, 0x1008

    invoke-static {v1, v2}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 281
    const/16 v1, 0x55

    if-le v0, v1, :cond_0

    .line 282
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/base/a$a;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 283
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    iget-object v1, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/base/a$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/base/a$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 285
    :cond_2
    iget-object v0, p0, Lcom/qihoo/utils/notice/b;->b:Lcom/qihoo/security/base/a$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/base/a$a;->removeMessages(I)V

    goto :goto_0

    .line 270
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public c()V
    .locals 0

    .prologue
    .line 295
    return-void
.end method
