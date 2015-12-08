.class public abstract Lcom/c/b/as$a;
.super Lcom/c/b/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/as$a$a;
    }
.end annotation


# instance fields
.field private a:Lcom/c/b/as$b;

.field private b:Lcom/c/b/as$a$a;

.field private c:Z

.field private d:Lcom/c/b/by;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 324
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 325
    return-void
.end method

.method protected constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 327
    invoke-direct {p0}, Lcom/c/b/a$a;-><init>()V

    .line 320
    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$a;->d:Lcom/c/b/by;

    .line 328
    iput-object p1, p0, Lcom/c/b/as$a;->a:Lcom/c/b/as$b;

    .line 329
    return-void
.end method

.method static synthetic a(Lcom/c/b/as$a;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 309
    invoke-direct {p0}, Lcom/c/b/as$a;->r()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private r()Ljava/util/Map;
    .locals 5

    .prologue
    .line 398
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 400
    invoke-virtual {p0}, Lcom/c/b/as$a;->d()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;)Lcom/c/b/ak$a;

    move-result-object v0

    .line 401
    invoke-virtual {v0}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    .line 402
    invoke-virtual {v0}, Lcom/c/b/ak$f;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 403
    invoke-virtual {p0, v0}, Lcom/c/b/as$a;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 404
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 405
    invoke-virtual {v2, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 408
    :cond_1
    invoke-virtual {p0, v0}, Lcom/c/b/as$a;->a(Lcom/c/b/ak$f;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 409
    invoke-virtual {p0, v0}, Lcom/c/b/as$a;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 413
    :cond_2
    return-object v2
.end method


# virtual methods
.method public synthetic a(Lcom/c/b/by;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 308
    invoke-virtual {p0, p1}, Lcom/c/b/as$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 308
    invoke-virtual {p0, p1, p2}, Lcom/c/b/as$a;->d(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$a;

    move-result-object v0

    return-object v0
.end method

.method public a()Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 524
    invoke-virtual {p0}, Lcom/c/b/as$a;->e()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    .line 526
    invoke-virtual {v0}, Lcom/c/b/ak$f;->m()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 527
    invoke-virtual {p0, v0}, Lcom/c/b/as$a;->a(Lcom/c/b/ak$f;)Z

    move-result v3

    if-nez v3, :cond_1

    move v0, v1

    .line 549
    :goto_0
    return v0

    .line 532
    :cond_1
    invoke-virtual {v0}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v3

    sget-object v4, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v3, v4, :cond_0

    .line 533
    invoke-virtual {v0}, Lcom/c/b/ak$f;->o()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 535
    invoke-virtual {p0, v0}, Lcom/c/b/as$a;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 536
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 537
    invoke-interface {v0}, Lcom/c/b/bd;->a()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 538
    goto :goto_0

    .line 542
    :cond_3
    invoke-virtual {p0, v0}, Lcom/c/b/as$a;->a(Lcom/c/b/ak$f;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v0}, Lcom/c/b/as$a;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    invoke-interface {v0}, Lcom/c/b/bd;->a()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 544
    goto :goto_0

    .line 549
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public a(Lcom/c/b/ak$f;)Z
    .locals 1

    .prologue
    .line 445
    invoke-virtual {p0}, Lcom/c/b/as$a;->d()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/c/b/as$g$a;->b(Lcom/c/b/as$a;)Z

    move-result v0

    return v0
.end method

.method public synthetic b()Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 308
    invoke-virtual {p0}, Lcom/c/b/as$a;->o()Lcom/c/b/as$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 308
    invoke-virtual {p0, p1, p2}, Lcom/c/b/as$a;->c(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Lcom/c/b/by;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 308
    invoke-virtual {p0, p1}, Lcom/c/b/as$a;->c(Lcom/c/b/by;)Lcom/c/b/as$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/c/b/ak$f;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 450
    invoke-virtual {p0}, Lcom/c/b/as$a;->d()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/c/b/as$g$a;->a(Lcom/c/b/as$a;)Ljava/lang/Object;

    move-result-object v0

    .line 451
    invoke-virtual {p1}, Lcom/c/b/ak$f;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 454
    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 456
    :cond_0
    return-object v0
.end method

.method public c(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$a;
    .locals 1

    .prologue
    .line 462
    invoke-virtual {p0}, Lcom/c/b/as$a;->d()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;

    move-result-object v0

    invoke-interface {v0, p0, p2}, Lcom/c/b/as$g$a;->a(Lcom/c/b/as$a;Ljava/lang/Object;)V

    .line 463
    return-object p0
.end method

.method public c(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 506
    iput-object p1, p0, Lcom/c/b/as$a;->d:Lcom/c/b/by;

    .line 507
    invoke-virtual {p0}, Lcom/c/b/as$a;->q()V

    .line 508
    return-object p0
.end method

.method public synthetic c()Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 308
    invoke-virtual {p0}, Lcom/c/b/as$a;->o()Lcom/c/b/as$a;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lcom/c/b/ak$f;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 418
    invoke-virtual {p0}, Lcom/c/b/as$a;->d()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/b/as$g$a;->a()Lcom/c/b/bd$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 308
    invoke-virtual {p0}, Lcom/c/b/as$a;->o()Lcom/c/b/as$a;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$a;
    .locals 1

    .prologue
    .line 500
    invoke-virtual {p0}, Lcom/c/b/as$a;->d()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;

    move-result-object v0

    invoke-interface {v0, p0, p2}, Lcom/c/b/as$g$a;->b(Lcom/c/b/as$a;Ljava/lang/Object;)V

    .line 501
    return-object p0
.end method

.method public d(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 1

    .prologue
    .line 514
    iget-object v0, p0, Lcom/c/b/as$a;->d:Lcom/c/b/by;

    invoke-static {v0}, Lcom/c/b/by;->a(Lcom/c/b/by;)Lcom/c/b/by$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/c/b/by$a;->a(Lcom/c/b/by;)Lcom/c/b/by$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$a;->d:Lcom/c/b/by;

    .line 518
    invoke-virtual {p0}, Lcom/c/b/as$a;->q()V

    .line 519
    return-object p0
.end method

.method protected abstract d()Lcom/c/b/as$g;
.end method

.method public d_()Ljava/util/Map;
    .locals 1

    .prologue
    .line 393
    invoke-direct {p0}, Lcom/c/b/as$a;->r()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 388
    invoke-virtual {p0}, Lcom/c/b/as$a;->d()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;)Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 554
    iget-object v0, p0, Lcom/c/b/as$a;->d:Lcom/c/b/by;

    return-object v0
.end method

.method final k()V
    .locals 1

    .prologue
    .line 332
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/as$a;->a:Lcom/c/b/as$b;

    .line 333
    return-void
.end method

.method protected final l()V
    .locals 1

    .prologue
    .line 339
    iget-object v0, p0, Lcom/c/b/as$a;->a:Lcom/c/b/as$b;

    if-eqz v0, :cond_0

    .line 340
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/as$a;->c:Z

    .line 342
    :cond_0
    return-void
.end method

.method protected final m()V
    .locals 1

    .prologue
    .line 349
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/as$a;->c:Z

    .line 350
    return-void
.end method

.method protected final n()Z
    .locals 1

    .prologue
    .line 358
    iget-boolean v0, p0, Lcom/c/b/as$a;->c:Z

    return v0
.end method

.method public o()Lcom/c/b/as$a;
    .locals 2

    .prologue
    .line 363
    invoke-virtual {p0}, Lcom/c/b/as$a;->w()Lcom/c/b/bd;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/as$a;

    .line 365
    invoke-virtual {p0}, Lcom/c/b/as$a;->h()Lcom/c/b/bd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    .line 366
    return-object v0
.end method

.method protected final p()Lcom/c/b/as$b;
    .locals 2

    .prologue
    .line 587
    iget-object v0, p0, Lcom/c/b/as$a;->b:Lcom/c/b/as$a$a;

    if-nez v0, :cond_0

    .line 588
    new-instance v0, Lcom/c/b/as$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/b/as$a$a;-><init>(Lcom/c/b/as$a;B)V

    iput-object v0, p0, Lcom/c/b/as$a;->b:Lcom/c/b/as$a$a;

    .line 590
    :cond_0
    iget-object v0, p0, Lcom/c/b/as$a;->b:Lcom/c/b/as$a$a;

    return-object v0
.end method

.method protected final q()V
    .locals 1

    .prologue
    .line 598
    iget-boolean v0, p0, Lcom/c/b/as$a;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/c/b/as$a;->a:Lcom/c/b/as$b;

    if-eqz v0, :cond_0

    .line 599
    iget-object v0, p0, Lcom/c/b/as$a;->a:Lcom/c/b/as$b;

    invoke-interface {v0}, Lcom/c/b/as$b;->a()V

    .line 602
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/as$a;->c:Z

    .line 604
    :cond_0
    return-void
.end method
