.class final Lcom/c/a/a/h;
.super Lcom/c/a/a/c$a;
.source "SourceFile"


# instance fields
.field final synthetic q:C

.field final synthetic r:C


# direct methods
.method constructor <init>(Ljava/lang/String;CC)V
    .locals 0

    .prologue
    .line 559
    iput-char p2, p0, Lcom/c/a/a/h;->q:C

    iput-char p3, p0, Lcom/c/a/a/h;->r:C

    invoke-direct {p0, p1}, Lcom/c/a/a/c$a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c(C)Z
    .locals 1

    .prologue
    .line 561
    iget-char v0, p0, Lcom/c/a/a/h;->q:C

    if-gt v0, p1, :cond_0

    iget-char v0, p0, Lcom/c/a/a/h;->r:C

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
