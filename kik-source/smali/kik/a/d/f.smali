.class public final Lkik/a/d/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/d/f$a;
    }
.end annotation


# instance fields
.field private a:J

.field private b:Ljava/util/Vector;

.field private c:Ljava/util/HashSet;

.field private d:Ljava/lang/String;

.field private e:J

.field private f:Z

.field private g:J

.field private h:Z

.field private i:Z

.field private j:J

.field private final k:Lkik/a/d/e;

.field private final l:Ljava/lang/Object;

.field private volatile m:Lkik/a/d/f$a;

.field private volatile n:Ljava/lang/String;

.field private o:Ljava/util/Vector;

.field private p:Ljava/util/Vector;

.field private q:Z

.field private r:Z

.field private s:Ljava/util/List;

.field private t:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-wide/32 v0, 0xa4cb800

    iput-wide v0, p0, Lkik/a/d/f;->a:J

    .line 43
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lkik/a/d/f;->j:J

    .line 46
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/a/d/f;->l:Ljava/lang/Object;

    .line 47
    iput-object v3, p0, Lkik/a/d/f;->m:Lkik/a/d/f$a;

    .line 48
    iput-object v3, p0, Lkik/a/d/f;->n:Ljava/lang/String;

    .line 51
    iput-object v3, p0, Lkik/a/d/f;->o:Ljava/util/Vector;

    .line 52
    iput-object v3, p0, Lkik/a/d/f;->p:Ljava/util/Vector;

    .line 54
    iput-boolean v2, p0, Lkik/a/d/f;->q:Z

    .line 60
    iput-boolean v2, p0, Lkik/a/d/f;->r:Z

    .line 62
    iput-boolean v2, p0, Lkik/a/d/f;->t:Z

    .line 70
    iput-object p1, p0, Lkik/a/d/f;->d:Ljava/lang/String;

    .line 71
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    .line 72
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/a/d/f;->c:Ljava/util/HashSet;

    .line 73
    iput-boolean v2, p0, Lkik/a/d/f;->f:Z

    .line 74
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/a/d/f;->e:J

    .line 75
    iput-boolean v2, p0, Lkik/a/d/f;->h:Z

    .line 79
    iput-boolean v2, p0, Lkik/a/d/f;->i:Z

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/d/f;->s:Ljava/util/List;

    .line 81
    new-instance v0, Lkik/a/d/e;

    invoke-direct {v0, p1}, Lkik/a/d/e;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/a/d/f;->k:Lkik/a/d/e;

    .line 82
    return-void
.end method

.method static synthetic a(Lkik/a/d/f;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/a/d/f;->l:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lkik/a/d/f;)Lkik/a/d/f$a;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/a/d/f;->m:Lkik/a/d/f$a;

    return-object v0
.end method

.method static synthetic c(Lkik/a/d/f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/d/f;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lkik/a/d/f;)Lkik/a/d/f$a;
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/d/f;->m:Lkik/a/d/f$a;

    return-object v0
.end method

.method private declared-synchronized y()V
    .locals 1

    .prologue
    .line 544
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lkik/a/d/f;->o:Ljava/util/Vector;

    .line 545
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/d/f;->p:Ljava/util/Vector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 546
    monitor-exit p0

    return-void

    .line 544
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 110
    iget-wide v0, p0, Lkik/a/d/f;->e:J

    return-wide v0
.end method

.method public final a(Ljava/lang/String;)Lkik/a/d/s;
    .locals 5

    .prologue
    .line 506
    const/4 v1, 0x0

    .line 507
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_1

    .line 508
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 509
    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lkik/a/d/s;->d()Z

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 514
    :goto_1
    return-object v0

    .line 507
    :cond_0
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 635
    iput-wide p1, p0, Lkik/a/d/f;->g:J

    .line 636
    return-void
.end method

.method public final declared-synchronized a(Ljava/util/List;)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 145
    monitor-enter p0

    :try_start_0
    new-instance v5, Ljava/util/Vector;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/Vector;-><init>(I)V

    .line 147
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/a/d/f;->e:J

    .line 151
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v3, v4

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 152
    invoke-static {v0}, Lkik/a/d/a/g;->b(Lkik/a/d/s;)Z

    move-result v7

    .line 156
    const-class v1, Lkik/a/d/a/e;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/e;

    .line 158
    if-eqz v1, :cond_6

    .line 159
    invoke-virtual {v1}, Lkik/a/d/a/e;->b()Ljava/util/Vector;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x1

    .line 164
    :goto_1
    if-nez v7, :cond_0

    iget-wide v8, p0, Lkik/a/d/f;->e:J

    cmp-long v7, v8, v10

    if-nez v7, :cond_1

    :cond_0
    if-nez v1, :cond_1

    .line 165
    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v8

    iput-wide v8, p0, Lkik/a/d/f;->e:J

    .line 168
    :cond_1
    const-class v1, Lkik/a/d/a/b;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/b;

    .line 170
    if-eqz v1, :cond_4

    .line 171
    if-eqz v3, :cond_3

    .line 172
    invoke-virtual {v3}, Lkik/a/d/a/b;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Lkik/a/d/a/b;->a(I)V

    :goto_2
    move-object v3, v1

    .line 178
    goto :goto_0

    :cond_2
    move v1, v2

    .line 159
    goto :goto_1

    .line 175
    :cond_3
    invoke-virtual {v5, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 145
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 182
    :cond_4
    :try_start_1
    invoke-virtual {v5, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    move-object v3, v4

    .line 184
    goto :goto_0

    .line 186
    :cond_5
    iput-object v5, p0, Lkik/a/d/f;->b:Ljava/util/Vector;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    monitor-exit p0

    return-void

    :cond_6
    move v1, v2

    goto :goto_1
.end method

.method public final a(Lkik/a/d/g;)V
    .locals 4

    .prologue
    .line 702
    invoke-virtual {p1}, Lkik/a/d/g;->b()Z

    move-result v0

    invoke-virtual {p1}, Lkik/a/d/g;->c()J

    move-result-wide v2

    invoke-virtual {p0, v0, v2, v3}, Lkik/a/d/f;->a(ZJ)V

    .line 703
    invoke-virtual {p1}, Lkik/a/d/g;->d()Z

    move-result v0

    iput-boolean v0, p0, Lkik/a/d/f;->i:Z

    .line 704
    return-void
.end method

.method public final a(Lkik/a/d/s;ILkik/a/e/v;)V
    .locals 0

    .prologue
    .line 316
    invoke-virtual {p1, p2}, Lkik/a/d/s;->a(I)V

    .line 317
    invoke-interface {p3, p1}, Lkik/a/e/v;->c(Lkik/a/d/s;)Z

    .line 318
    invoke-direct {p0}, Lkik/a/d/f;->y()V

    .line 319
    return-void
.end method

.method public final a(Lkik/a/d/s;Lkik/a/e/v;)V
    .locals 3

    .prologue
    .line 276
    monitor-enter p0

    .line 277
    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z

    .line 278
    iget-object v0, p0, Lkik/a/d/f;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 279
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 280
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    iget-object v1, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Vector;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    .line 281
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 283
    invoke-static {v0}, Lkik/a/d/a/g;->b(Lkik/a/d/s;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 285
    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/a/d/f;->e:J

    .line 290
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    invoke-interface {p2, p1}, Lkik/a/e/v;->b(Lkik/a/d/s;)Z

    .line 292
    invoke-direct {p0}, Lkik/a/d/f;->y()V

    .line 293
    return-void

    .line 290
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 119
    iget-boolean v0, p0, Lkik/a/d/f;->r:Z

    if-eq v0, p1, :cond_0

    iget-boolean v0, p0, Lkik/a/d/f;->r:Z

    if-eqz v0, :cond_0

    .line 120
    invoke-direct {p0}, Lkik/a/d/f;->y()V

    .line 122
    :cond_0
    iput-boolean p1, p0, Lkik/a/d/f;->r:Z

    .line 123
    return-void
.end method

.method public final a(ZJ)V
    .locals 2

    .prologue
    .line 708
    iput-boolean p1, p0, Lkik/a/d/f;->h:Z

    .line 709
    iget-boolean v0, p0, Lkik/a/d/f;->h:Z

    if-eqz v0, :cond_0

    .line 710
    iput-wide p2, p0, Lkik/a/d/f;->j:J

    .line 715
    :goto_0
    return-void

    .line 713
    :cond_0
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lkik/a/d/f;->j:J

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;ILkik/a/e/v;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 297
    const/4 v2, 0x0

    .line 299
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_0
    if-ltz v3, :cond_3

    .line 300
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 301
    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0}, Lkik/a/d/s;->d()Z

    move-result v4

    if-ne v4, v1, :cond_1

    .line 307
    :goto_1
    if-eqz v0, :cond_0

    .line 308
    invoke-virtual {p0, v0, p2, p3}, Lkik/a/d/f;->a(Lkik/a/d/s;ILkik/a/e/v;)V

    .line 311
    :cond_0
    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    return v0

    .line 299
    :cond_1
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_0

    .line 311
    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    move-object v0, v2

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkik/a/e/v;)Z
    .locals 4

    .prologue
    .line 333
    const/4 v1, 0x0

    .line 335
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_0

    .line 336
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 337
    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v0

    .line 342
    :cond_0
    if-eqz v1, :cond_2

    .line 343
    const-class v0, Lkik/a/d/a/a;

    invoke-static {v1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 344
    invoke-virtual {v0, p2, p3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    invoke-interface {p4, v1}, Lkik/a/e/v;->c(Lkik/a/d/s;)Z

    .line 346
    invoke-direct {p0}, Lkik/a/d/f;->y()V

    .line 347
    const/4 v0, 0x1

    .line 350
    :goto_1
    return v0

    .line 335
    :cond_1
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    .line 350
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Lkik/a/h/m;Lkik/a/h/d;)Z
    .locals 3

    .prologue
    .line 562
    iget-object v1, p0, Lkik/a/d/f;->l:Ljava/lang/Object;

    monitor-enter v1

    .line 563
    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 564
    :goto_0
    new-instance v2, Lkik/a/d/f$a;

    invoke-direct {v2, p0, p3}, Lkik/a/d/f$a;-><init>(Lkik/a/d/f;Lkik/a/h/d;)V

    iput-object v2, p0, Lkik/a/d/f;->m:Lkik/a/d/f$a;

    .line 565
    iput-object p1, p0, Lkik/a/d/f;->n:Ljava/lang/String;

    .line 566
    iget-object v2, p0, Lkik/a/d/f;->m:Lkik/a/d/f$a;

    invoke-virtual {p2, v2}, Lkik/a/h/m;->a(Ljava/util/TimerTask;)Lkik/a/h/m$a;

    .line 567
    monitor-exit v1

    return v0

    .line 563
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 568
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lkik/a/d/s;Lkik/a/d/k;Lkik/a/e/v;Z)Z
    .locals 12

    .prologue
    .line 191
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 192
    invoke-interface {p3, p1}, Lkik/a/e/v;->d(Lkik/a/d/s;)Lkik/a/d/s;

    .line 193
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    .line 194
    const/4 v2, 0x0

    .line 196
    monitor-enter p0

    .line 197
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 198
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v3

    invoke-virtual {v0}, Lkik/a/d/s;->d()Z

    move-result v5

    if-ne v3, v5, :cond_0

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_1

    .line 199
    const/4 v0, 0x0

    monitor-exit p0

    .line 271
    :goto_2
    return v0

    .line 198
    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 197
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 202
    :cond_2
    iget-object v0, p0, Lkik/a/d/f;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 203
    const/4 v0, 0x0

    monitor-exit p0

    goto :goto_2

    .line 261
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 207
    :cond_3
    :try_start_1
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v3

    .line 208
    const/4 v0, 0x0

    move v1, v0

    :goto_3
    if-ge v1, v3, :cond_7

    .line 209
    if-nez p4, :cond_4

    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/16 v5, 0x258

    if-ge v0, v5, :cond_5

    :cond_4
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/16 v5, 0xc8

    if-lt v0, v5, :cond_6

    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v8

    sub-long v8, v6, v8

    iget-wide v10, p0, Lkik/a/d/f;->a:J

    cmp-long v0, v8, v10

    if-lez v0, :cond_6

    .line 210
    :cond_5
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Ljava/util/Vector;->removeElementAt(I)V

    .line 208
    :goto_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 213
    :cond_6
    if-eqz p4, :cond_7

    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/16 v5, 0x64

    if-lt v0, v5, :cond_7

    .line 214
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Ljava/util/Vector;->removeElementAt(I)V

    goto :goto_4

    .line 222
    :cond_7
    const/4 v0, 0x0

    .line 224
    iget-object v1, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_12

    .line 225
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->lastElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    move-object v3, v0

    .line 228
    :goto_5
    if-eqz v3, :cond_11

    .line 229
    const-class v0, Lkik/a/d/a/b;

    invoke-static {v3, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/b;

    .line 230
    const-class v1, Lkik/a/d/a/b;

    invoke-static {p1, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/b;

    .line 232
    if-eqz v0, :cond_11

    if-eqz v1, :cond_11

    .line 233
    invoke-virtual {v0}, Lkik/a/d/a/b;->a()I

    move-result v2

    invoke-virtual {v1}, Lkik/a/d/a/b;->a()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lkik/a/d/a/b;->a(I)V

    .line 234
    invoke-interface {p3, v3}, Lkik/a/e/v;->c(Lkik/a/d/s;)Z

    .line 235
    const/4 v0, 0x1

    move v3, v0

    .line 239
    :goto_6
    if-nez v3, :cond_8

    .line 240
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/d/f;->t:Z

    .line 241
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 244
    :cond_8
    invoke-static {p1}, Lkik/a/d/a/g;->b(Lkik/a/d/s;)Z

    move-result v0

    if-eqz v0, :cond_e

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lkik/a/d/k;->m()Z

    move-result v0

    if-nez v0, :cond_e

    :cond_9
    const/4 v0, 0x1

    move v2, v0

    .line 245
    :goto_7
    const/4 v1, 0x0

    .line 248
    const-class v0, Lkik/a/d/a/e;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/e;

    .line 250
    if-eqz v0, :cond_10

    .line 251
    invoke-virtual {v0}, Lkik/a/d/a/e;->b()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_f

    const/4 v0, 0x1

    .line 256
    :goto_8
    if-nez v2, :cond_a

    iget-wide v6, p0, Lkik/a/d/f;->e:J

    const-wide/16 v8, 0x0

    cmp-long v1, v6, v8

    if-nez v1, :cond_b

    :cond_a
    if-nez v0, :cond_b

    .line 257
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/a/d/f;->e:J

    .line 260
    :cond_b
    invoke-direct {p0}, Lkik/a/d/f;->y()V

    .line 261
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_c

    .line 264
    invoke-interface {p3, v4}, Lkik/a/e/v;->d(Ljava/util/List;)Z

    .line 267
    :cond_c
    if-nez v3, :cond_d

    .line 268
    invoke-interface {p3, p1}, Lkik/a/e/v;->a(Lkik/a/d/s;)Z

    .line 271
    :cond_d
    const/4 v0, 0x1

    goto/16 :goto_2

    .line 244
    :cond_e
    const/4 v0, 0x0

    move v2, v0

    goto :goto_7

    .line 251
    :cond_f
    const/4 v0, 0x0

    goto :goto_8

    :cond_10
    move v0, v1

    goto :goto_8

    :cond_11
    move v3, v2

    goto :goto_6

    :cond_12
    move-object v3, v0

    goto/16 :goto_5
.end method

.method public final a(Lkik/a/e/r;)Z
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 486
    invoke-virtual {p0, v3}, Lkik/a/d/f;->b(Z)Ljava/util/Vector;

    move-result-object v0

    .line 491
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object v2, v1

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 492
    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 493
    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v1

    .line 494
    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 496
    :goto_1
    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v3

    .line 501
    :goto_2
    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lkik/a/d/f;->r:Z

    if-nez v0, :cond_1

    move v0, v3

    :goto_3
    return v0

    :cond_0
    move-object v2, v1

    move-object v1, v0

    .line 500
    goto :goto_0

    :cond_1
    move v0, v4

    .line 501
    goto :goto_3

    :cond_2
    move-object v0, v1

    move-object v1, v2

    goto :goto_1

    :cond_3
    move v0, v4

    goto :goto_2
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lkik/a/d/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final declared-synchronized b(Z)Ljava/util/Vector;
    .locals 5

    .prologue
    .line 436
    monitor-enter p0

    :try_start_0
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 438
    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/a/d/f;->o:Ljava/util/Vector;

    if-eqz v0, :cond_0

    .line 439
    iget-object v0, p0, Lkik/a/d/f;->o:Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v1

    .line 473
    :goto_0
    monitor-exit p0

    return-object v0

    .line 442
    :cond_0
    if-nez p1, :cond_1

    :try_start_1
    iget-object v0, p0, Lkik/a/d/f;->p:Ljava/util/Vector;

    if-eqz v0, :cond_1

    .line 443
    iget-object v0, p0, Lkik/a/d/f;->p:Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    .line 444
    goto :goto_0

    .line 448
    :cond_1
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_1
    if-ltz v2, :cond_4

    .line 449
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 450
    invoke-virtual {v0}, Lkik/a/d/s;->d()Z

    move-result v3

    if-nez v3, :cond_3

    .line 451
    invoke-virtual {v0}, Lkik/a/d/s;->c()I

    move-result v3

    const/16 v4, 0x1f4

    if-ge v3, v4, :cond_4

    .line 452
    if-eqz p1, :cond_2

    invoke-static {v0}, Lkik/a/d/a/g;->b(Lkik/a/d/s;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 453
    :cond_2
    invoke-virtual {v1, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 448
    :cond_3
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    .line 464
    :cond_4
    if-eqz p1, :cond_5

    .line 465
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/a/d/f;->o:Ljava/util/Vector;

    .line 466
    iget-object v0, p0, Lkik/a/d/f;->o:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    :goto_2
    move-object v0, v1

    .line 473
    goto :goto_0

    .line 469
    :cond_5
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/a/d/f;->p:Ljava/util/Vector;

    .line 470
    iget-object v0, p0, Lkik/a/d/f;->p:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 436
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Ljava/lang/String;)Lkik/a/d/s;
    .locals 4

    .prologue
    .line 519
    const/4 v1, 0x0

    .line 520
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_1

    .line 521
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 522
    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 527
    :goto_1
    return-object v0

    .line 520
    :cond_0
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method public final b(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 756
    iput-object p1, p0, Lkik/a/d/f;->s:Ljava/util/List;

    .line 757
    return-void
.end method

.method public final declared-synchronized c()Ljava/util/Vector;
    .locals 1

    .prologue
    .line 140
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c(Z)V
    .locals 0

    .prologue
    .line 645
    iput-boolean p1, p0, Lkik/a/d/f;->f:Z

    .line 646
    return-void
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 577
    iget-object v1, p0, Lkik/a/d/f;->l:Ljava/lang/Object;

    monitor-enter v1

    .line 578
    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 579
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/d/f;->n:Ljava/lang/String;

    .line 580
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/d/f;->m:Lkik/a/d/f$a;

    .line 581
    const/4 v0, 0x1

    monitor-exit v1

    .line 583
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    .line 584
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final declared-synchronized d()Lkik/a/d/s;
    .locals 1

    .prologue
    .line 365
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 366
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->lastElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 369
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 365
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized e()Lkik/a/d/s;
    .locals 8

    .prologue
    .line 375
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v7, v0

    :goto_0
    if-ltz v7, :cond_3

    .line 376
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v7}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 377
    const-class v1, Lkik/a/d/a/h;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/h;

    .line 378
    const-class v2, Lkik/a/d/a/a;

    invoke-static {v0, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v2

    check-cast v2, Lkik/a/d/a/a;

    .line 379
    const-class v3, Lkik/a/d/a/l;

    invoke-static {v0, v3}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v3

    check-cast v3, Lkik/a/d/a/l;

    .line 380
    const-class v4, Lkik/a/d/a/m;

    invoke-static {v0, v4}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v4

    check-cast v4, Lkik/a/d/a/m;

    .line 381
    const-class v5, Lkik/a/d/a/d;

    invoke-static {v0, v5}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v5

    check-cast v5, Lkik/a/d/a/d;

    .line 382
    const-class v6, Lkik/a/d/a/b;

    invoke-static {v0, v6}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v6

    check-cast v6, Lkik/a/d/a/b;

    .line 383
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lkik/a/d/a/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 394
    :cond_0
    :goto_1
    monitor-exit p0

    return-object v0

    .line 386
    :cond_1
    if-nez v2, :cond_0

    if-nez v3, :cond_0

    if-nez v4, :cond_0

    if-nez v6, :cond_0

    .line 389
    if-eqz v5, :cond_2

    :try_start_1
    invoke-virtual {v5}, Lkik/a/d/a/d;->g()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v1

    if-nez v1, :cond_0

    .line 375
    :cond_2
    add-int/lit8 v0, v7, -0x1

    move v7, v0

    goto :goto_0

    .line 394
    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    .line 375
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 87
    if-nez p1, :cond_1

    .line 99
    :cond_0
    :goto_0
    return v0

    .line 91
    :cond_1
    instance-of v1, p1, Lkik/a/d/f;

    if-eqz v1, :cond_0

    .line 95
    if-ne p1, p0, :cond_2

    .line 96
    const/4 v0, 0x1

    goto :goto_0

    .line 99
    :cond_2
    check-cast p1, Lkik/a/d/f;

    iget-object v0, p1, Lkik/a/d/f;->d:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/d/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final declared-synchronized f()Lkik/a/d/s;
    .locals 3

    .prologue
    .line 398
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_1

    .line 399
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 400
    const-class v1, Lkik/a/d/a/d;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 401
    if-eqz v1, :cond_0

    .line 406
    :goto_1
    monitor-exit p0

    return-object v0

    .line 398
    :cond_0
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    .line 406
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 398
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized g()Z
    .locals 1

    .prologue
    .line 532
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 533
    iget-object v0, p0, Lkik/a/d/f;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->lastElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->d()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 535
    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 532
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 589
    iget-object v0, p0, Lkik/a/d/f;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 105
    const v0, 0x49ae78a9

    iget-object v1, p0, Lkik/a/d/f;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 594
    iget-boolean v0, p0, Lkik/a/d/f;->t:Z

    return v0
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 599
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/d/f;->t:Z

    .line 600
    return-void
.end method

.method public final k()J
    .locals 2

    .prologue
    .line 630
    iget-wide v0, p0, Lkik/a/d/f;->g:J

    return-wide v0
.end method

.method public final l()Z
    .locals 1

    .prologue
    .line 640
    iget-boolean v0, p0, Lkik/a/d/f;->f:Z

    return v0
.end method

.method public final m()V
    .locals 2

    .prologue
    .line 668
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/a/d/f;->e:J

    .line 669
    return-void
.end method

.method public final n()Z
    .locals 1

    .prologue
    .line 682
    iget-boolean v0, p0, Lkik/a/d/f;->h:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 687
    iget-boolean v0, p0, Lkik/a/d/f;->i:Z

    return v0
.end method

.method public final p()J
    .locals 2

    .prologue
    .line 692
    iget-wide v0, p0, Lkik/a/d/f;->j:J

    return-wide v0
.end method

.method public final q()Lkik/a/d/g;
    .locals 7

    .prologue
    .line 697
    new-instance v1, Lkik/a/d/g;

    iget-object v2, p0, Lkik/a/d/f;->d:Ljava/lang/String;

    iget-boolean v3, p0, Lkik/a/d/f;->h:Z

    iget-wide v4, p0, Lkik/a/d/f;->j:J

    iget-boolean v6, p0, Lkik/a/d/f;->i:Z

    invoke-direct/range {v1 .. v6}, Lkik/a/d/g;-><init>(Ljava/lang/String;ZJZ)V

    return-object v1
.end method

.method public final r()V
    .locals 1

    .prologue
    .line 724
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/d/f;->i:Z

    .line 725
    return-void
.end method

.method public final s()Ljava/lang/String;
    .locals 2

    .prologue
    .line 732
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KikPreferences."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/a/d/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final t()V
    .locals 1

    .prologue
    .line 737
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/d/f;->q:Z

    .line 738
    return-void
.end method

.method public final u()Z
    .locals 1

    .prologue
    .line 746
    iget-boolean v0, p0, Lkik/a/d/f;->q:Z

    return v0
.end method

.method public final v()V
    .locals 1

    .prologue
    .line 751
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/d/f;->q:Z

    .line 752
    return-void
.end method

.method public final w()Ljava/util/List;
    .locals 1

    .prologue
    .line 761
    iget-object v0, p0, Lkik/a/d/f;->s:Ljava/util/List;

    return-object v0
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 766
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/d/f;->s:Ljava/util/List;

    .line 767
    return-void
.end method
