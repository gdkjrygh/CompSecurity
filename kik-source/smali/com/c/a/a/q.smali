.class final Lcom/c/a/a/q;
.super Lcom/c/a/a/c$a;
.source "SourceFile"


# instance fields
.field final synthetic q:C


# direct methods
.method constructor <init>(Ljava/lang/String;C)V
    .locals 0

    .prologue
    .line 416
    iput-char p2, p0, Lcom/c/a/a/q;->q:C

    invoke-direct {p0, p1}, Lcom/c/a/a/c$a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 434
    iget-char v0, p0, Lcom/c/a/a/q;->q:C

    invoke-static {v0}, Lcom/c/a/a/q;->b(C)Lcom/c/a/a/c;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/a/a/c;)Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 430
    iget-char v0, p0, Lcom/c/a/a/q;->q:C

    invoke-virtual {p1, v0}, Lcom/c/a/a/c;->c(C)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    invoke-super {p0, p1}, Lcom/c/a/a/c$a;->a(Lcom/c/a/a/c;)Lcom/c/a/a/c;

    move-result-object p1

    goto :goto_0
.end method

.method public final c(C)Z
    .locals 1

    .prologue
    .line 418
    iget-char v0, p0, Lcom/c/a/a/q;->q:C

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 422
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-char v1, p0, Lcom/c/a/a/q;->q:C

    const/16 v2, 0x2e

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
