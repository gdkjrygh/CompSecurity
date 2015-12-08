.class final Lcom/c/a/b/t;
.super Lcom/c/a/b/k;
.source "SourceFile"


# instance fields
.field private final a:Lcom/c/a/b/o;


# direct methods
.method constructor <init>(Lcom/c/a/b/o;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/c/a/b/k;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/c/a/b/t;->a:Lcom/c/a/b/o;

    .line 39
    return-void
.end method


# virtual methods
.method public final a()Lcom/c/a/b/ao;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/c/a/b/t;->a:Lcom/c/a/b/o;

    invoke-virtual {v0}, Lcom/c/a/b/o;->b()Lcom/c/a/b/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/v;->a()Lcom/c/a/b/ao;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/b/ac;->a(Lcom/c/a/b/ao;)Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method final b()Z
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x1

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 53
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/c/a/b/t;->a()Lcom/c/a/b/ao;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/c/a/b/w;->a(Ljava/util/Iterator;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final e()Lcom/c/a/b/m;
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lcom/c/a/b/t;->a:Lcom/c/a/b/o;

    invoke-virtual {v0}, Lcom/c/a/b/o;->b()Lcom/c/a/b/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/v;->c()Lcom/c/a/b/m;

    move-result-object v0

    .line 64
    new-instance v1, Lcom/c/a/b/u;

    invoke-direct {v1, p0, v0}, Lcom/c/a/b/u;-><init>(Lcom/c/a/b/t;Lcom/c/a/b/m;)V

    return-object v1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0}, Lcom/c/a/b/t;->a()Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/c/a/b/t;->a:Lcom/c/a/b/o;

    invoke-virtual {v0}, Lcom/c/a/b/o;->size()I

    move-result v0

    return v0
.end method
