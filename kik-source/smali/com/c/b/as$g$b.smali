.class final Lcom/c/b/as$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/as$g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/c/b/ak$f;

.field private final b:Lcom/c/b/bd;


# direct methods
.method constructor <init>(Lcom/c/b/ak$f;Ljava/lang/Class;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2235
    iput-object p1, p0, Lcom/c/b/as$g$b;->a:Lcom/c/b/ak$f;

    .line 2236
    const-string v0, "getDefaultInstance"

    new-array v1, v2, [Ljava/lang/Class;

    invoke-static {p2, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 2238
    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/as;

    invoke-direct {p0, v0}, Lcom/c/b/as$g$b;->d(Lcom/c/b/as;)Lcom/c/b/bb;

    move-result-object v0

    .line 2240
    invoke-virtual {v0}, Lcom/c/b/bb;->c()Lcom/c/b/bd;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$b;->b:Lcom/c/b/bd;

    .line 2242
    return-void
.end method

.method private c(Lcom/c/b/as$a;)Lcom/c/b/bb;
    .locals 3

    .prologue
    .line 2252
    iget-object v0, p0, Lcom/c/b/as$g$b;->a:Lcom/c/b/ak$f;

    invoke-virtual {v0}, Lcom/c/b/ak$f;->e()I

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No map fields found in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private d(Lcom/c/b/as$a;)Lcom/c/b/bb;
    .locals 3

    .prologue
    .line 2257
    iget-object v0, p0, Lcom/c/b/as$g$b;->a:Lcom/c/b/ak$f;

    invoke-virtual {v0}, Lcom/c/b/ak$f;->e()I

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No map fields found in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private d(Lcom/c/b/as;)Lcom/c/b/bb;
    .locals 3

    .prologue
    .line 2248
    iget-object v0, p0, Lcom/c/b/as$g$b;->a:Lcom/c/b/ak$f;

    invoke-virtual {v0}, Lcom/c/b/ak$f;->e()I

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No map fields found in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 2339
    iget-object v0, p0, Lcom/c/b/as$g$b;->b:Lcom/c/b/bd;

    invoke-interface {v0}, Lcom/c/b/bd;->u()Lcom/c/b/bd$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/as$a;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 2270
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2271
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lcom/c/b/as$g$b;->c(Lcom/c/b/as$a;)Lcom/c/b/bb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/bb;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 2272
    invoke-direct {p0, p1}, Lcom/c/b/as$g$b;->c(Lcom/c/b/as$a;)Lcom/c/b/bb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/bb;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2271
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2274
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/as;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 2262
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2263
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lcom/c/b/as$g$b;->d(Lcom/c/b/as;)Lcom/c/b/bb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/bb;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 2264
    invoke-direct {p0, p1}, Lcom/c/b/as$g$b;->d(Lcom/c/b/as;)Lcom/c/b/bb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/bb;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2263
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2266
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/as$a;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 2286
    invoke-direct {p0, p1}, Lcom/c/b/as$g$b;->d(Lcom/c/b/as$a;)Lcom/c/b/bb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/bb;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2287
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 2288
    invoke-virtual {p0, p1, v1}, Lcom/c/b/as$g$b;->b(Lcom/c/b/as$a;Ljava/lang/Object;)V

    goto :goto_0

    .line 2290
    :cond_0
    return-void
.end method

.method public final b(Lcom/c/b/as;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2278
    invoke-virtual {p0, p1}, Lcom/c/b/as$g$b;->a(Lcom/c/b/as;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/c/b/as$a;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 2313
    invoke-direct {p0, p1}, Lcom/c/b/as$g$b;->d(Lcom/c/b/as$a;)Lcom/c/b/bb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/bb;->b()Ljava/util/List;

    move-result-object v0

    check-cast p2, Lcom/c/b/bd;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2314
    return-void
.end method

.method public final b(Lcom/c/b/as$a;)Z
    .locals 2

    .prologue
    .line 2322
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "hasField() is not supported for repeated fields."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lcom/c/b/as;)Z
    .locals 2

    .prologue
    .line 2317
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "hasField() is not supported for repeated fields."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
