.class final Lkik/a/c/e;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lkik/a/c/c;


# direct methods
.method constructor <init>(Lkik/a/c/c;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 185
    iput-object p1, p0, Lkik/a/c/e;->b:Lkik/a/c/c;

    iput-object p2, p0, Lkik/a/c/e;->a:Ljava/util/Map;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 185
    check-cast p1, Lkik/a/f/f/z;

    instance-of v0, p1, Lkik/a/f/f/d;

    if-eqz v0, :cond_1

    check-cast p1, Lkik/a/f/f/d;

    iget-object v0, p0, Lkik/a/c/e;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lkik/a/f/f/d;->a(Ljava/lang/String;)Lkik/a/d/r;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Exception;

    const-string v3, "No result found for requested link"

    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p0, v0}, Lkik/a/c/e;->a(Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 211
    iget-object v0, p0, Lkik/a/c/e;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 213
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/g/p;

    invoke-virtual {v1, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 217
    iget-object v1, p0, Lkik/a/c/e;->b:Lkik/a/c/c;

    invoke-static {v1}, Lkik/a/c/c;->a(Lkik/a/c/c;)Lkik/a/c/f;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lkik/a/c/f;->b(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 219
    :cond_0
    return-void
.end method
