.class public final Lcom/google/a/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/a/b/o;

.field private b:Lcom/google/a/ah;

.field private c:Lcom/google/a/j;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/a/t",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/a/an;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/a/an;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    sget-object v0, Lcom/google/a/b/o;->a:Lcom/google/a/b/o;

    iput-object v0, p0, Lcom/google/a/s;->a:Lcom/google/a/b/o;

    .line 70
    sget-object v0, Lcom/google/a/ah;->a:Lcom/google/a/ah;

    iput-object v0, p0, Lcom/google/a/s;->b:Lcom/google/a/ah;

    .line 71
    sget-object v0, Lcom/google/a/d;->a:Lcom/google/a/d;

    iput-object v0, p0, Lcom/google/a/s;->c:Lcom/google/a/j;

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/a/s;->d:Ljava/util/Map;

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/a/s;->e:Ljava/util/List;

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/a/s;->f:Ljava/util/List;

    .line 79
    iput v1, p0, Lcom/google/a/s;->i:I

    .line 80
    iput v1, p0, Lcom/google/a/s;->j:I

    .line 83
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/a/s;->m:Z

    .line 94
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/a/k;
    .locals 12

    .prologue
    const/4 v5, 0x2

    .line 539
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 540
    iget-object v0, p0, Lcom/google/a/s;->e:Ljava/util/List;

    invoke-interface {v11, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 541
    invoke-static {v11}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 542
    iget-object v0, p0, Lcom/google/a/s;->f:Ljava/util/List;

    invoke-interface {v11, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 543
    iget-object v1, p0, Lcom/google/a/s;->h:Ljava/lang/String;

    iget v2, p0, Lcom/google/a/s;->i:I

    iget v3, p0, Lcom/google/a/s;->j:I

    .line 1554
    if-eqz v1, :cond_1

    const-string v0, ""

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1555
    new-instance v0, Lcom/google/a/a;

    invoke-direct {v0, v1}, Lcom/google/a/a;-><init>(Ljava/lang/String;)V

    .line 1562
    :goto_0
    const-class v1, Ljava/util/Date;

    invoke-static {v1}, Lcom/google/a/c/a;->a(Ljava/lang/Class;)Lcom/google/a/c/a;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/a/ak;->a(Lcom/google/a/c/a;Ljava/lang/Object;)Lcom/google/a/an;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1563
    const-class v1, Ljava/sql/Timestamp;

    invoke-static {v1}, Lcom/google/a/c/a;->a(Ljava/lang/Class;)Lcom/google/a/c/a;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/a/ak;->a(Lcom/google/a/c/a;Ljava/lang/Object;)Lcom/google/a/an;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1564
    const-class v1, Ljava/sql/Date;

    invoke-static {v1}, Lcom/google/a/c/a;->a(Ljava/lang/Class;)Lcom/google/a/c/a;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/a/ak;->a(Lcom/google/a/c/a;Ljava/lang/Object;)Lcom/google/a/an;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 545
    :cond_0
    new-instance v0, Lcom/google/a/k;

    iget-object v1, p0, Lcom/google/a/s;->a:Lcom/google/a/b/o;

    iget-object v2, p0, Lcom/google/a/s;->c:Lcom/google/a/j;

    iget-object v3, p0, Lcom/google/a/s;->d:Ljava/util/Map;

    iget-boolean v4, p0, Lcom/google/a/s;->g:Z

    iget-boolean v5, p0, Lcom/google/a/s;->k:Z

    iget-boolean v6, p0, Lcom/google/a/s;->o:Z

    iget-boolean v7, p0, Lcom/google/a/s;->m:Z

    iget-boolean v8, p0, Lcom/google/a/s;->n:Z

    iget-boolean v9, p0, Lcom/google/a/s;->l:Z

    iget-object v10, p0, Lcom/google/a/s;->b:Lcom/google/a/ah;

    invoke-direct/range {v0 .. v11}, Lcom/google/a/k;-><init>(Lcom/google/a/b/o;Lcom/google/a/j;Ljava/util/Map;ZZZZZZLcom/google/a/ah;Ljava/util/List;)V

    return-object v0

    .line 1556
    :cond_1
    if-eq v2, v5, :cond_0

    if-eq v3, v5, :cond_0

    .line 1557
    new-instance v0, Lcom/google/a/a;

    invoke-direct {v0, v2, v3}, Lcom/google/a/a;-><init>(II)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/a/s;
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 448
    invoke-static {v1}, Lcom/google/a/b/a;->a(Z)V

    .line 452
    instance-of v0, p2, Lcom/google/a/t;

    if-eqz v0, :cond_0

    .line 453
    iget-object v3, p0, Lcom/google/a/s;->d:Ljava/util/Map;

    move-object v0, p2

    check-cast v0, Lcom/google/a/t;

    invoke-interface {v3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    :cond_0
    invoke-static {p1}, Lcom/google/a/c/a;->a(Ljava/lang/reflect/Type;)Lcom/google/a/c/a;

    move-result-object v3

    .line 457
    iget-object v4, p0, Lcom/google/a/s;->e:Ljava/util/List;

    .line 1095
    invoke-virtual {v3}, Lcom/google/a/c/a;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v3}, Lcom/google/a/c/a;->a()Ljava/lang/Class;

    move-result-object v5

    if-ne v0, v5, :cond_2

    move v0, v1

    .line 1096
    :goto_0
    new-instance v1, Lcom/google/a/al;

    invoke-direct {v1, p2, v3, v0, v2}, Lcom/google/a/al;-><init>(Ljava/lang/Object;Lcom/google/a/c/a;ZB)V

    .line 457
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    instance-of v0, p2, Lcom/google/a/am;

    if-eqz v0, :cond_1

    .line 460
    iget-object v0, p0, Lcom/google/a/s;->e:Ljava/util/List;

    invoke-static {p1}, Lcom/google/a/c/a;->a(Ljava/lang/reflect/Type;)Lcom/google/a/c/a;

    move-result-object v1

    check-cast p2, Lcom/google/a/am;

    invoke-static {v1, p2}, Lcom/google/a/b/a/y;->a(Lcom/google/a/c/a;Lcom/google/a/am;)Lcom/google/a/an;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    :cond_1
    return-object p0

    :cond_2
    move v0, v2

    .line 1095
    goto :goto_0
.end method
