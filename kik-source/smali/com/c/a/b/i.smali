.class abstract Lcom/c/a/b/i;
.super Lcom/c/a/b/m;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/c/a/b/m;-><init>()V

    .line 62
    return-void
.end method


# virtual methods
.method final b()Z
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/c/a/b/i;->d()Lcom/c/a/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/k;->b()Z

    move-result v0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/c/a/b/i;->d()Lcom/c/a/b/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/c/a/b/k;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method abstract d()Lcom/c/a/b/k;
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0}, Lcom/c/a/b/i;->d()Lcom/c/a/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/k;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0}, Lcom/c/a/b/i;->d()Lcom/c/a/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/k;->size()I

    move-result v0

    return v0
.end method
