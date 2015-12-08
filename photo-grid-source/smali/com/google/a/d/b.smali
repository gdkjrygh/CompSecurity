.class final Lcom/google/a/d/b;
.super Lcom/google/a/b/q;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1315
    invoke-direct {p0}, Lcom/google/a/b/q;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/a/d/a;)V
    .locals 3

    .prologue
    .line 1317
    instance-of v0, p1, Lcom/google/a/b/a/g;

    if-eqz v0, :cond_0

    .line 1318
    check-cast p1, Lcom/google/a/b/a/g;

    invoke-virtual {p1}, Lcom/google/a/b/a/g;->o()V

    .line 1329
    :goto_0
    return-void

    .line 1321
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 1322
    invoke-static {p1}, Lcom/google/a/d/a;->a(Lcom/google/a/d/a;)Lcom/google/a/d/e;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/e;->e:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_1

    .line 1323
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a name but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/google/a/d/a;->b(Lcom/google/a/d/a;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/google/a/d/a;->c(Lcom/google/a/d/a;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1326
    :cond_1
    invoke-static {p1}, Lcom/google/a/d/a;->d(Lcom/google/a/d/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/a;Ljava/lang/String;)Ljava/lang/String;

    .line 1327
    invoke-static {p1}, Lcom/google/a/d/a;->e(Lcom/google/a/d/a;)Ljava/lang/String;

    .line 1328
    sget-object v0, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    invoke-static {p1, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/a;Lcom/google/a/d/e;)Lcom/google/a/d/e;

    goto :goto_0
.end method
