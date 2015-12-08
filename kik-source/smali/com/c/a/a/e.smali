.class final Lcom/c/a/a/e;
.super Lcom/c/a/a/c$a;
.source "SourceFile"


# instance fields
.field final synthetic q:C


# direct methods
.method constructor <init>(Ljava/lang/String;C)V
    .locals 0

    .prologue
    .line 452
    iput-char p2, p0, Lcom/c/a/a/e;->q:C

    invoke-direct {p0, p1}, Lcom/c/a/a/c$a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 473
    iget-char v0, p0, Lcom/c/a/a/e;->q:C

    invoke-static {v0}, Lcom/c/a/a/e;->a(C)Lcom/c/a/a/c;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/a/a/c;)Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 462
    iget-char v0, p0, Lcom/c/a/a/e;->q:C

    invoke-virtual {p1, v0}, Lcom/c/a/a/c;->c(C)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/c/a/a/e;->l:Lcom/c/a/a/c;

    :cond_0
    return-object p0
.end method

.method public final c(C)Z
    .locals 1

    .prologue
    .line 454
    iget-char v0, p0, Lcom/c/a/a/e;->q:C

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
