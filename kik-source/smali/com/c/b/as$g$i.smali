.class final Lcom/c/b/as$g$i;
.super Lcom/c/b/as$g$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation


# instance fields
.field private final m:Ljava/lang/reflect/Method;

.field private final n:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2587
    invoke-direct/range {p0 .. p5}, Lcom/c/b/as$g$h;-><init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 2590
    iget-object v0, p0, Lcom/c/b/as$g$i;->a:Ljava/lang/Class;

    const-string v1, "newBuilder"

    new-array v2, v3, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$i;->m:Ljava/lang/reflect/Method;

    .line 2591
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Builder"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Class;

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$i;->n:Ljava/lang/reflect/Method;

    .line 2593
    return-void
.end method


# virtual methods
.method public final a()Lcom/c/b/bd$a;
    .locals 3

    .prologue
    .line 2617
    iget-object v0, p0, Lcom/c/b/as$g$i;->m:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd$a;

    return-object v0
.end method

.method public final a(Lcom/c/b/as$a;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 2613
    iget-object v0, p0, Lcom/c/b/as$g$i;->a:Ljava/lang/Class;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-super {p0, p1, p2}, Lcom/c/b/as$g$h;->a(Lcom/c/b/as$a;Ljava/lang/Object;)V

    .line 2614
    return-void

    .line 2613
    :cond_0
    iget-object v0, p0, Lcom/c/b/as$g$i;->m:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd$a;

    check-cast p2, Lcom/c/b/bd;

    invoke-interface {v0, p2}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/b/bd$a;->h()Lcom/c/b/bd;

    move-result-object p2

    goto :goto_0
.end method
