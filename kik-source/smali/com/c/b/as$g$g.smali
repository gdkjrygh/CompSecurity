.class final Lcom/c/b/as$g$g;
.super Lcom/c/b/as$g$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field private m:Lcom/c/b/ak$d;

.field private n:Ljava/lang/reflect/Method;

.field private o:Ljava/lang/reflect/Method;

.field private p:Z

.field private q:Ljava/lang/reflect/Method;

.field private r:Ljava/lang/reflect/Method;

.field private s:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 2363
    invoke-direct/range {p0 .. p5}, Lcom/c/b/as$g$h;-><init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 2365
    invoke-virtual {p1}, Lcom/c/b/ak$f;->x()Lcom/c/b/ak$d;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$g;->m:Lcom/c/b/ak$d;

    .line 2367
    iget-object v0, p0, Lcom/c/b/as$g$g;->a:Ljava/lang/Class;

    const-string v1, "valueOf"

    new-array v2, v5, [Ljava/lang/Class;

    const-class v3, Lcom/c/b/ak$e;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$g;->n:Ljava/lang/reflect/Method;

    .line 2369
    iget-object v0, p0, Lcom/c/b/as$g$g;->a:Ljava/lang/Class;

    const-string v1, "getValueDescriptor"

    new-array v2, v4, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$g;->o:Ljava/lang/reflect/Method;

    .line 2372
    invoke-virtual {p1}, Lcom/c/b/ak$f;->d()Lcom/c/b/ak$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$g;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/c/b/as$g$g;->p:Z

    .line 2373
    iget-boolean v0, p0, Lcom/c/b/as$g$g;->p:Z

    if-eqz v0, :cond_0

    .line 2374
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

    new-array v1, v4, [Ljava/lang/Class;

    invoke-static {p3, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$g;->q:Ljava/lang/reflect/Method;

    .line 2376
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

    new-array v1, v4, [Ljava/lang/Class;

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$g;->r:Ljava/lang/reflect/Method;

    .line 2378
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

    new-array v1, v5, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v4

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$g;->s:Ljava/lang/reflect/Method;

    .line 2381
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/c/b/as$a;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2404
    iget-boolean v0, p0, Lcom/c/b/as$g$g;->p:Z

    if-eqz v0, :cond_0

    .line 2405
    iget-object v0, p0, Lcom/c/b/as$g$g;->r:Ljava/lang/reflect/Method;

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2406
    iget-object v1, p0, Lcom/c/b/as$g$g;->m:Lcom/c/b/ak$d;

    invoke-virtual {v1, v0}, Lcom/c/b/ak$d;->b(I)Lcom/c/b/ak$e;

    move-result-object v0

    .line 2408
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/as$g$g;->o:Ljava/lang/reflect/Method;

    invoke-super {p0, p1}, Lcom/c/b/as$g$h;->a(Lcom/c/b/as$a;)Ljava/lang/Object;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lcom/c/b/as;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2395
    iget-boolean v0, p0, Lcom/c/b/as$g$g;->p:Z

    if-eqz v0, :cond_0

    .line 2396
    iget-object v0, p0, Lcom/c/b/as$g$g;->q:Ljava/lang/reflect/Method;

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2397
    iget-object v1, p0, Lcom/c/b/as$g$g;->m:Lcom/c/b/ak$d;

    invoke-virtual {v1, v0}, Lcom/c/b/ak$d;->b(I)Lcom/c/b/ak$e;

    move-result-object v0

    .line 2399
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/as$g$g;->o:Ljava/lang/reflect/Method;

    invoke-super {p0, p1}, Lcom/c/b/as$g$h;->a(Lcom/c/b/as;)Ljava/lang/Object;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lcom/c/b/as$a;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2413
    iget-boolean v0, p0, Lcom/c/b/as$g$g;->p:Z

    if-eqz v0, :cond_0

    .line 2414
    iget-object v0, p0, Lcom/c/b/as$g$g;->s:Ljava/lang/reflect/Method;

    new-array v1, v2, [Ljava/lang/Object;

    check-cast p2, Lcom/c/b/ak$e;

    invoke-virtual {p2}, Lcom/c/b/ak$e;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2419
    :goto_0
    return-void

    .line 2418
    :cond_0
    iget-object v0, p0, Lcom/c/b/as$g$g;->n:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-super {p0, p1, v0}, Lcom/c/b/as$g$h;->a(Lcom/c/b/as$a;Ljava/lang/Object;)V

    goto :goto_0
.end method
