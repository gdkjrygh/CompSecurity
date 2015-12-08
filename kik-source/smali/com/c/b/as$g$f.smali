.class final Lcom/c/b/as$g$f;
.super Lcom/c/b/as$g$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# instance fields
.field private final k:Ljava/lang/reflect/Method;

.field private final l:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2631
    invoke-direct {p0, p1, p2, p3}, Lcom/c/b/as$g$e;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 2633
    iget-object v0, p0, Lcom/c/b/as$g$f;->a:Ljava/lang/Class;

    const-string v1, "newBuilder"

    new-array v2, v3, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$f;->k:Ljava/lang/reflect/Method;

    .line 2634
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Builder"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v3

    invoke-static {p3, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$f;->l:Ljava/lang/reflect/Method;

    .line 2636
    return-void
.end method


# virtual methods
.method public final a()Lcom/c/b/bd$a;
    .locals 3

    .prologue
    .line 2665
    iget-object v0, p0, Lcom/c/b/as$g$f;->k:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd$a;

    return-object v0
.end method

.method public final b(Lcom/c/b/as$a;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 2661
    iget-object v0, p0, Lcom/c/b/as$g$f;->a:Ljava/lang/Class;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-super {p0, p1, p2}, Lcom/c/b/as$g$e;->b(Lcom/c/b/as$a;Ljava/lang/Object;)V

    .line 2662
    return-void

    .line 2661
    :cond_0
    iget-object v0, p0, Lcom/c/b/as$g$f;->k:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd$a;

    check-cast p2, Lcom/c/b/bd;

    invoke-interface {v0, p2}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/b/bd$a;->i()Lcom/c/b/bd;

    move-result-object p2

    goto :goto_0
.end method
