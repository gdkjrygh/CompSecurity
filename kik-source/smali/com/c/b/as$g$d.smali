.class final Lcom/c/b/as$g$d;
.super Lcom/c/b/as$g$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private k:Lcom/c/b/ak$d;

.field private final l:Ljava/lang/reflect/Method;

.field private final m:Ljava/lang/reflect/Method;

.field private n:Z

.field private o:Ljava/lang/reflect/Method;

.field private p:Ljava/lang/reflect/Method;

.field private q:Ljava/lang/reflect/Method;

.field private r:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 2428
    invoke-direct {p0, p2, p3, p4}, Lcom/c/b/as$g$e;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 2430
    invoke-virtual {p1}, Lcom/c/b/ak$f;->x()Lcom/c/b/ak$d;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$d;->k:Lcom/c/b/ak$d;

    .line 2432
    iget-object v0, p0, Lcom/c/b/as$g$d;->a:Ljava/lang/Class;

    const-string v1, "valueOf"

    new-array v2, v5, [Ljava/lang/Class;

    const-class v3, Lcom/c/b/ak$e;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$d;->l:Ljava/lang/reflect/Method;

    .line 2434
    iget-object v0, p0, Lcom/c/b/as$g$d;->a:Ljava/lang/Class;

    const-string v1, "getValueDescriptor"

    new-array v2, v4, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$d;->m:Ljava/lang/reflect/Method;

    .line 2437
    invoke-virtual {p1}, Lcom/c/b/ak$f;->d()Lcom/c/b/ak$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$g;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/c/b/as$g$d;->n:Z

    .line 2438
    iget-boolean v0, p0, Lcom/c/b/as$g$d;->n:Z

    if-eqz v0, :cond_0

    .line 2439
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v4

    invoke-static {p3, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$d;->o:Ljava/lang/reflect/Method;

    .line 2441
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v4

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$d;->p:Ljava/lang/reflect/Method;

    .line 2443
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "set"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v5

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$d;->q:Ljava/lang/reflect/Method;

    .line 2445
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "add"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v4

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$d;->r:Ljava/lang/reflect/Method;

    .line 2448
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/c/b/as$a;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 2474
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2475
    invoke-virtual {p0, p1}, Lcom/c/b/as$g$d;->c(Lcom/c/b/as$a;)I

    move-result v2

    .line 2476
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 2477
    invoke-virtual {p0, p1, v0}, Lcom/c/b/as$g$d;->a(Lcom/c/b/as$a;I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2476
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2479
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/as$a;I)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2495
    iget-boolean v0, p0, Lcom/c/b/as$g$d;->n:Z

    if-eqz v0, :cond_0

    .line 2496
    iget-object v0, p0, Lcom/c/b/as$g$d;->p:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2497
    iget-object v1, p0, Lcom/c/b/as$g$d;->k:Lcom/c/b/ak$d;

    invoke-virtual {v1, v0}, Lcom/c/b/ak$d;->b(I)Lcom/c/b/ak$e;

    move-result-object v0

    .line 2499
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/as$g$d;->m:Ljava/lang/reflect/Method;

    invoke-super {p0, p1, p2}, Lcom/c/b/as$g$e;->a(Lcom/c/b/as$a;I)Ljava/lang/Object;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lcom/c/b/as;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 2463
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2464
    invoke-virtual {p0, p1}, Lcom/c/b/as$g$d;->d(Lcom/c/b/as;)I

    move-result v2

    .line 2465
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 2466
    invoke-virtual {p0, p1, v0}, Lcom/c/b/as$g$d;->a(Lcom/c/b/as;I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2465
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2468
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/as;I)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2485
    iget-boolean v0, p0, Lcom/c/b/as$g$d;->n:Z

    if-eqz v0, :cond_0

    .line 2486
    iget-object v0, p0, Lcom/c/b/as$g$d;->o:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2487
    iget-object v1, p0, Lcom/c/b/as$g$d;->k:Lcom/c/b/ak$d;

    invoke-virtual {v1, v0}, Lcom/c/b/ak$d;->b(I)Lcom/c/b/ak$e;

    move-result-object v0

    .line 2489
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/as$g$d;->m:Ljava/lang/reflect/Method;

    invoke-super {p0, p1, p2}, Lcom/c/b/as$g$e;->a(Lcom/c/b/as;I)Ljava/lang/Object;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final b(Lcom/c/b/as$a;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2515
    iget-boolean v0, p0, Lcom/c/b/as$g$d;->n:Z

    if-eqz v0, :cond_0

    .line 2516
    iget-object v0, p0, Lcom/c/b/as$g$d;->r:Ljava/lang/reflect/Method;

    new-array v1, v2, [Ljava/lang/Object;

    check-cast p2, Lcom/c/b/ak$e;

    invoke-virtual {p2}, Lcom/c/b/ak$e;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2521
    :goto_0
    return-void

    .line 2520
    :cond_0
    iget-object v0, p0, Lcom/c/b/as$g$d;->l:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-super {p0, p1, v0}, Lcom/c/b/as$g$e;->b(Lcom/c/b/as$a;Ljava/lang/Object;)V

    goto :goto_0
.end method
