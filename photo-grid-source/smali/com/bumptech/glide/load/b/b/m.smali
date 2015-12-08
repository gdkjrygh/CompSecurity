.class public final Lcom/bumptech/glide/load/b/b/m;
.super Lcom/bumptech/glide/i/e;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/b/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/i/e",
        "<",
        "Lcom/bumptech/glide/load/c;",
        "Lcom/bumptech/glide/load/b/x",
        "<*>;>;",
        "Lcom/bumptech/glide/load/b/b/n;"
    }
.end annotation


# instance fields
.field private a:Lcom/bumptech/glide/load/b/b/o;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/bumptech/glide/i/e;-><init>(I)V

    .line 22
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 12
    check-cast p1, Lcom/bumptech/glide/load/b/x;

    .line 1038
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->c()I

    move-result v0

    .line 12
    return v0
.end method

.method public final synthetic a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/load/b/x;
    .locals 1

    .prologue
    .line 12
    invoke-super {p0, p1}, Lcom/bumptech/glide/i/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/b/x;

    return-object v0
.end method

.method public final synthetic a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;
    .locals 1

    .prologue
    .line 12
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/i/e;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/b/x;

    return-object v0
.end method

.method public final a(I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .prologue
    .line 44
    const/16 v0, 0x3c

    if-lt p1, v0, :cond_1

    .line 47
    invoke-virtual {p0}, Lcom/bumptech/glide/load/b/b/m;->a()V

    .line 53
    :cond_0
    :goto_0
    return-void

    .line 48
    :cond_1
    const/16 v0, 0x28

    if-lt p1, v0, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/bumptech/glide/load/b/b/m;->b()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/load/b/b/m;->b(I)V

    goto :goto_0
.end method

.method public final a(Lcom/bumptech/glide/load/b/b/o;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/bumptech/glide/load/b/b/m;->a:Lcom/bumptech/glide/load/b/b/o;

    .line 27
    return-void
.end method

.method protected final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 12
    check-cast p2, Lcom/bumptech/glide/load/b/x;

    .line 1031
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/m;->a:Lcom/bumptech/glide/load/b/b/o;

    if-eqz v0, :cond_0

    .line 1032
    iget-object v0, p0, Lcom/bumptech/glide/load/b/b/m;->a:Lcom/bumptech/glide/load/b/b/o;

    invoke-interface {v0, p2}, Lcom/bumptech/glide/load/b/b/o;->b(Lcom/bumptech/glide/load/b/x;)V

    .line 12
    :cond_0
    return-void
.end method
