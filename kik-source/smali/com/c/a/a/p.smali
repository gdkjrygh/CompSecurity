.class final Lcom/c/a/a/p;
.super Lcom/c/a/a/c$a;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 329
    invoke-direct {p0, p1}, Lcom/c/a/a/c$a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;I)I
    .locals 1

    .prologue
    .line 340
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 341
    invoke-static {p2, v0}, Lcom/c/a/a/u;->b(II)I

    .line 342
    const/4 v0, -0x1

    return v0
.end method

.method public final a()Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 405
    sget-object v0, Lcom/c/a/a/p;->l:Lcom/c/a/a/c;

    return-object v0
.end method

.method public final a(Lcom/c/a/a/c;)Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 401
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/a/a/c;

    return-object v0
.end method

.method public final b(Ljava/lang/CharSequence;)Z
    .locals 1

    .prologue
    .line 351
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c(C)Z
    .locals 1

    .prologue
    .line 331
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Ljava/lang/CharSequence;)Z
    .locals 1

    .prologue
    .line 355
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    const/4 v0, 0x1

    return v0
.end method

.method public final d(Ljava/lang/CharSequence;)I
    .locals 1

    .prologue
    .line 335
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    const/4 v0, -0x1

    return v0
.end method

.method public final e(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 360
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 364
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
