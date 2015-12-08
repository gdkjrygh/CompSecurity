.class Lcom/jirbo/adcolony/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/jirbo/adcolony/c;

.field b:Lcom/jirbo/adcolony/b;

.field c:Lcom/jirbo/adcolony/o;

.field d:Lcom/jirbo/adcolony/u;

.field e:Lcom/jirbo/adcolony/v;

.field f:Lcom/jirbo/adcolony/ADCStorage;

.field g:Lcom/jirbo/adcolony/ah;

.field h:Lcom/jirbo/adcolony/t;

.field i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/j;",
            ">;"
        }
    .end annotation
.end field

.field j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/j;",
            ">;"
        }
    .end annotation
.end field

.field volatile k:Z

.field l:Z

.field m:Z

.field n:Lcom/jirbo/adcolony/ab$a;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lcom/jirbo/adcolony/c;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/c;-><init>(Lcom/jirbo/adcolony/d;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    .line 21
    new-instance v0, Lcom/jirbo/adcolony/b;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/b;-><init>(Lcom/jirbo/adcolony/d;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    .line 22
    new-instance v0, Lcom/jirbo/adcolony/o;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/o;-><init>(Lcom/jirbo/adcolony/d;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    .line 23
    new-instance v0, Lcom/jirbo/adcolony/u;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/u;-><init>(Lcom/jirbo/adcolony/d;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    .line 24
    new-instance v0, Lcom/jirbo/adcolony/v;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/v;-><init>(Lcom/jirbo/adcolony/d;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    .line 25
    new-instance v0, Lcom/jirbo/adcolony/ADCStorage;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/ADCStorage;-><init>(Lcom/jirbo/adcolony/d;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->f:Lcom/jirbo/adcolony/ADCStorage;

    .line 26
    new-instance v0, Lcom/jirbo/adcolony/ah;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/ah;-><init>(Lcom/jirbo/adcolony/d;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->g:Lcom/jirbo/adcolony/ah;

    .line 27
    new-instance v0, Lcom/jirbo/adcolony/t;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/t;-><init>(Lcom/jirbo/adcolony/d;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->i:Ljava/util/ArrayList;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->j:Ljava/util/ArrayList;

    .line 37
    new-instance v0, Lcom/jirbo/adcolony/ab$a;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ab$a;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/d;->n:Lcom/jirbo/adcolony/ab$a;

    return-void
.end method


# virtual methods
.method declared-synchronized a(Ljava/lang/String;)D
    .locals 2

    .prologue
    .line 232
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->i:Lcom/jirbo/adcolony/ADCData$g;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    .line 237
    :goto_0
    monitor-exit p0

    return-wide v0

    .line 236
    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    const-wide/16 v0, 0x0

    goto :goto_0

    .line 232
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 53
    iget-boolean v0, p0, Lcom/jirbo/adcolony/d;->l:Z

    if-eqz v0, :cond_1

    .line 78
    :cond_0
    :goto_0
    return-void

    .line 54
    :cond_1
    invoke-static {}, Lcom/jirbo/adcolony/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    :goto_1
    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/d;->l:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/jirbo/adcolony/d;->k:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 60
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/d;->l:Z

    .line 61
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->j:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 62
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    move v1, v2

    .line 63
    :goto_2
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 65
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/j;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/j;->a()V

    .line 63
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 67
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 71
    :catch_0
    move-exception v0

    .line 73
    iput-boolean v2, p0, Lcom/jirbo/adcolony/d;->l:Z

    .line 74
    iget-object v1, p0, Lcom/jirbo/adcolony/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 75
    iget-object v1, p0, Lcom/jirbo/adcolony/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 76
    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V

    goto :goto_0

    .line 69
    :cond_5
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/jirbo/adcolony/d;->l:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method a(DLcom/jirbo/adcolony/AdColonyAd;)V
    .locals 7

    .prologue
    .line 142
    new-instance v1, Lcom/jirbo/adcolony/d$5;

    move-object v2, p0

    move-object v3, p0

    move-wide v4, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/jirbo/adcolony/d$5;-><init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;DLcom/jirbo/adcolony/AdColonyAd;)V

    .line 149
    return-void
.end method

.method a(I)V
    .locals 0

    .prologue
    .line 508
    invoke-static {p1}, Lcom/jirbo/adcolony/a;->a(I)V

    .line 509
    return-void
.end method

.method declared-synchronized a(Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 4

    .prologue
    .line 119
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/jirbo/adcolony/c;->n:D

    .line 120
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Tracking ad event - start"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 123
    iget-object v0, p1, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v1, v0, Lcom/jirbo/adcolony/ag;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/jirbo/adcolony/ag;->d:I

    .line 125
    invoke-virtual {p1}, Lcom/jirbo/adcolony/AdColonyAd;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    iget-object v0, p1, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$ab;->k()V

    .line 128
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    iget-object v1, p1, Lcom/jirbo/adcolony/AdColonyAd;->g:Ljava/lang/String;

    iget-object v2, p1, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget v2, v2, Lcom/jirbo/adcolony/n$a;->d:I

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/t;->a(Ljava/lang/String;I)V

    .line 130
    :cond_0
    new-instance v0, Lcom/jirbo/adcolony/d$4;

    invoke-direct {v0, p0, p0, p1}, Lcom/jirbo/adcolony/d$4;-><init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/AdColonyAd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    monitor-exit p0

    return-void

    .line 119
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/jirbo/adcolony/AdColonyInterstitialAd;)V
    .locals 2

    .prologue
    .line 348
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v1, p1, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/c;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    monitor-exit p0

    return-void

    .line 348
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/jirbo/adcolony/AdColonyV4VCAd;)V
    .locals 2

    .prologue
    .line 404
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v1, p1, Lcom/jirbo/adcolony/AdColonyV4VCAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/c;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 405
    monitor-exit p0

    return-void

    .line 404
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/jirbo/adcolony/AdColonyVideoAd;)V
    .locals 2

    .prologue
    .line 343
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v1, p1, Lcom/jirbo/adcolony/AdColonyVideoAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/c;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 344
    monitor-exit p0

    return-void

    .line 343
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Lcom/jirbo/adcolony/j;)V
    .locals 2

    .prologue
    .line 41
    iget-object v1, p0, Lcom/jirbo/adcolony/d;->i:Ljava/util/ArrayList;

    monitor-enter v1

    .line 44
    :try_start_0
    invoke-static {}, Lcom/jirbo/adcolony/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    monitor-exit v1

    .line 48
    :goto_0
    return-void

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    iget-boolean v0, p0, Lcom/jirbo/adcolony/d;->k:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/jirbo/adcolony/d;->g()V

    .line 48
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 298
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v0, p1, p2}, Lcom/jirbo/adcolony/t;->b(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    monitor-exit p0

    return-void

    .line 298
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 208
    new-instance v0, Lcom/jirbo/adcolony/d$7;

    invoke-direct {v0, p0, p0, p1, p2}, Lcom/jirbo/adcolony/d$7;-><init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    return-void
.end method

.method a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 6

    .prologue
    .line 219
    new-instance v0, Lcom/jirbo/adcolony/d$8;

    move-object v1, p0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/jirbo/adcolony/d$8;-><init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 226
    return-void
.end method

.method declared-synchronized a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 458
    monitor-enter p0

    :try_start_0
    sget v0, Lcom/jirbo/adcolony/a;->n:I

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/d;->a(I)V

    .line 460
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "==== Configuring AdColony "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v1, v1, Lcom/jirbo/adcolony/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v1, " ===="

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 462
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "package name: "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-static {}, Lcom/jirbo/adcolony/ab;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 464
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iput-object p2, v0, Lcom/jirbo/adcolony/c;->j:Ljava/lang/String;

    .line 465
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iput-object p3, v0, Lcom/jirbo/adcolony/c;->k:[Ljava/lang/String;

    .line 466
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/c;->a(Ljava/lang/String;)V

    .line 467
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->n:Lcom/jirbo/adcolony/ab$a;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ab$a;->a()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 473
    :goto_0
    monitor-exit p0

    return-void

    .line 471
    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 458
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(ZLcom/jirbo/adcolony/AdColonyAd;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 158
    monitor-enter p0

    if-nez p2, :cond_1

    .line 204
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 159
    :cond_1
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    :try_start_0
    invoke-virtual {p0, v4, v5, p2}, Lcom/jirbo/adcolony/d;->a(DLcom/jirbo/adcolony/AdColonyAd;)V

    .line 161
    if-nez p1, :cond_0

    .line 163
    invoke-virtual {p2}, Lcom/jirbo/adcolony/AdColonyAd;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p2, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$ab;->k()V

    .line 166
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    iget-object v3, p2, Lcom/jirbo/adcolony/AdColonyAd;->g:Ljava/lang/String;

    iget-object v4, p2, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget v4, v4, Lcom/jirbo/adcolony/n$a;->d:I

    invoke-virtual {v0, v3, v4}, Lcom/jirbo/adcolony/t;->a(Ljava/lang/String;I)V

    .line 167
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    check-cast v0, Lcom/jirbo/adcolony/AdColonyV4VCAd;

    .line 169
    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getRewardName()Ljava/lang/String;

    move-result-object v3

    .line 170
    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getRewardAmount()I

    move-result v4

    .line 174
    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getViewsPerReward()I

    move-result v6

    .line 175
    if-le v6, v1, :cond_2

    .line 177
    iget-object v5, p0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getRewardName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/jirbo/adcolony/t;->c(Ljava/lang/String;)I

    move-result v5

    .line 178
    add-int/lit8 v5, v5, 0x1

    .line 179
    if-lt v5, v6, :cond_4

    .line 181
    :goto_1
    iget-object v5, p0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getRewardName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v2}, Lcom/jirbo/adcolony/t;->b(Ljava/lang/String;I)V

    .line 184
    :cond_2
    if-eqz v1, :cond_0

    .line 186
    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/n$ad;->e:Z

    if-eqz v0, :cond_3

    .line 188
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v3, v4}, Lcom/jirbo/adcolony/d;->a(ZLjava/lang/String;I)V

    .line 191
    :cond_3
    new-instance v0, Lcom/jirbo/adcolony/d$6;

    move-object v1, p0

    move-object v2, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/jirbo/adcolony/d$6;-><init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;Ljava/lang/String;ILcom/jirbo/adcolony/AdColonyAd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 158
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_4
    move v1, v2

    move v2, v5

    .line 180
    goto :goto_1
.end method

.method declared-synchronized a(ZLjava/lang/String;I)V
    .locals 1

    .prologue
    .line 153
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/jirbo/adcolony/a;->N:Lcom/jirbo/adcolony/a$b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/jirbo/adcolony/a$b;->a(ZLjava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    monitor-exit p0

    return-void

    .line 153
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;ZZ)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 308
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/jirbo/adcolony/a;->d()Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 316
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 309
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    invoke-virtual {v1, p1, p2}, Lcom/jirbo/adcolony/b;->b(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 310
    iget-object v1, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v1, v1, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v1, v1, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v1, p1}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v1

    .line 311
    invoke-virtual {v1, p3}, Lcom/jirbo/adcolony/n$ab;->b(Z)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    .line 315
    :catch_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 308
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 245
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->i:Lcom/jirbo/adcolony/ADCData$g;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 250
    :goto_0
    monitor-exit p0

    return v0

    .line 249
    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 250
    const/4 v0, 0x0

    goto :goto_0

    .line 245
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method b()V
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/d;->k:Z

    .line 84
    new-instance v0, Lcom/jirbo/adcolony/d$1;

    invoke-direct {v0, p0, p0}, Lcom/jirbo/adcolony/d$1;-><init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;)V

    .line 91
    return-void
.end method

.method declared-synchronized b(Lcom/jirbo/adcolony/AdColonyAd;)Z
    .locals 3

    .prologue
    .line 430
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->l:Lcom/jirbo/adcolony/n$ab;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$ab;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 432
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    const/4 v1, 0x3

    iput v1, v0, Lcom/jirbo/adcolony/AdColonyAd;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 433
    const/4 v0, 0x0

    .line 451
    :goto_0
    monitor-exit p0

    return v0

    .line 436
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/d;->a(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 438
    invoke-static {}, Lcom/jirbo/adcolony/ADCVideo;->a()V

    .line 439
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-eqz v0, :cond_1

    .line 441
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Launching AdColonyOverlay"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 442
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v1

    const-class v2, Lcom/jirbo/adcolony/AdColonyOverlay;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 443
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 451
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 447
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Launching AdColonyFullscreen"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 448
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v1

    const-class v2, Lcom/jirbo/adcolony/AdColonyFullscreen;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 449
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 430
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Lcom/jirbo/adcolony/AdColonyInterstitialAd;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 378
    monitor-enter p0

    :try_start_0
    sput-object p1, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    .line 380
    iget-object v1, p1, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    .line 382
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/d;->f(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    .line 393
    :goto_0
    monitor-exit p0

    return v0

    .line 384
    :cond_0
    :try_start_1
    sget-object v2, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v3, "Showing ad for zone "

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 386
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/d;->a(Lcom/jirbo/adcolony/AdColonyInterstitialAd;)V

    .line 388
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/d;->b(Lcom/jirbo/adcolony/AdColonyAd;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    .line 392
    :catch_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 378
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Lcom/jirbo/adcolony/AdColonyV4VCAd;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 411
    monitor-enter p0

    :try_start_0
    sput-object p1, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    .line 412
    iget-object v1, p1, Lcom/jirbo/adcolony/AdColonyV4VCAd;->g:Ljava/lang/String;

    .line 414
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/d;->g(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    .line 424
    :goto_0
    monitor-exit p0

    return v0

    .line 416
    :cond_0
    :try_start_1
    sget-object v2, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v3, "Showing v4vc for zone "

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 418
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/d;->a(Lcom/jirbo/adcolony/AdColonyV4VCAd;)V

    .line 419
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/d;->b(Lcom/jirbo/adcolony/AdColonyAd;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    .line 423
    :catch_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 411
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Lcom/jirbo/adcolony/AdColonyVideoAd;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 355
    monitor-enter p0

    :try_start_0
    sput-object p1, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    .line 357
    iget-object v1, p1, Lcom/jirbo/adcolony/AdColonyVideoAd;->g:Ljava/lang/String;

    .line 359
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/d;->f(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    .line 370
    :goto_0
    monitor-exit p0

    return v0

    .line 361
    :cond_0
    :try_start_1
    sget-object v2, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v3, "Showing ad for zone "

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 363
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/d;->a(Lcom/jirbo/adcolony/AdColonyVideoAd;)V

    .line 365
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/d;->b(Lcom/jirbo/adcolony/AdColonyAd;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    .line 369
    :catch_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 355
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Ljava/lang/String;ZZ)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 328
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/jirbo/adcolony/a;->d()Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 337
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 330
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    invoke-virtual {v1, p1, p2}, Lcom/jirbo/adcolony/b;->b(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 331
    iget-object v1, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v1, v1, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v1, v1, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v1, p1}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v1

    .line 332
    invoke-virtual {v1, p3}, Lcom/jirbo/adcolony/n$ab;->c(Z)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    .line 336
    :catch_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 328
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method c()V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/d;->k:Z

    .line 97
    new-instance v0, Lcom/jirbo/adcolony/d$2;

    invoke-direct {v0, p0, p0}, Lcom/jirbo/adcolony/d$2;-><init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;)V

    .line 104
    return-void
.end method

.method declared-synchronized c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 258
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->i:Lcom/jirbo/adcolony/ADCData$g;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 263
    :goto_0
    monitor-exit p0

    return v0

    .line 262
    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    const/4 v0, 0x0

    goto :goto_0

    .line 258
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 272
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->i:Lcom/jirbo/adcolony/ADCData$g;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 277
    :goto_0
    monitor-exit p0

    return-object v0

    .line 276
    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 277
    const/4 v0, 0x0

    goto :goto_0

    .line 272
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method d()V
    .locals 1

    .prologue
    .line 108
    new-instance v0, Lcom/jirbo/adcolony/d$3;

    invoke-direct {v0, p0, p0}, Lcom/jirbo/adcolony/d$3;-><init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;)V

    .line 115
    return-void
.end method

.method declared-synchronized e(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 293
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/t;->c(Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 283
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/b;->c()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 288
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/b;->d()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized f(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 302
    monitor-enter p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/d;->a(Ljava/lang/String;ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized g()V
    .locals 4

    .prologue
    .line 477
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/jirbo/adcolony/a;->c()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 504
    :goto_0
    monitor-exit p0

    return-void

    .line 481
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/jirbo/adcolony/d;->a()V

    .line 483
    sget-boolean v0, Lcom/jirbo/adcolony/a;->p:Z

    if-nez v0, :cond_3

    .line 485
    invoke-static {}, Lcom/jirbo/adcolony/g;->n()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/d;->n:Lcom/jirbo/adcolony/ab$a;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ab$a;->b()D

    move-result-wide v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 487
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/c;->a()V

    .line 488
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->p:Z

    .line 490
    :cond_2
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->r:Z

    .line 493
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/b;->f()V

    .line 494
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/o;->e()V

    .line 495
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/v;->b()V

    .line 496
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/u;->d()V

    .line 497
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/t;->d()V

    .line 498
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->g:Lcom/jirbo/adcolony/ah;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ah;->d()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 502
    :catch_0
    move-exception v0

    :try_start_2
    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/RuntimeException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 477
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized g(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 322
    monitor-enter p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/d;->b(Ljava/lang/String;ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized h(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;
    .locals 1

    .prologue
    .line 399
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
