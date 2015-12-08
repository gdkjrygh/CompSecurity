.class public Lcom/google/android/gms/analytics/o;
.super Lcom/google/android/gms/c/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/c/e",
        "<",
        "Lcom/google/android/gms/analytics/o;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/analytics/internal/aa;

.field private c:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/analytics/internal/aa;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/aa;->g()Lcom/google/android/gms/c/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/aa;->c()Lcom/google/android/gms/internal/wg;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/c/e;-><init>(Lcom/google/android/gms/c/f;Lcom/google/android/gms/internal/wg;)V

    iput-object p1, p0, Lcom/google/android/gms/analytics/o;->b:Lcom/google/android/gms/analytics/internal/aa;

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/c/c;)V
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/sz;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/c/c;->b(Ljava/lang/Class;)Lcom/google/android/gms/c/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/sz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/sz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/analytics/o;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/aa;->o()Lcom/google/android/gms/analytics/internal/as;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/as;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/sz;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/analytics/o;->c:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/sz;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/analytics/o;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/aa;->n()Lcom/google/android/gms/analytics/internal/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/sz;->d(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/b;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/sz;->a(Z)V

    :cond_1
    return-void
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/analytics/o;->c:Z

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 0
    invoke-static {p1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1000
    invoke-static {p1}, Lcom/google/android/gms/analytics/p;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/o;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/c/l;

    invoke-interface {v0}, Lcom/google/android/gms/c/l;->a()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/ListIterator;->remove()V

    goto :goto_0

    .line 0
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/o;->i()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/analytics/p;

    iget-object v2, p0, Lcom/google/android/gms/analytics/o;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/analytics/p;-><init>(Lcom/google/android/gms/analytics/internal/aa;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final f()Lcom/google/android/gms/analytics/internal/aa;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/o;->b:Lcom/google/android/gms/analytics/internal/aa;

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/c/c;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/o;->h()Lcom/google/android/gms/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/c/c;->a()Lcom/google/android/gms/c/c;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/o;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/aa;->p()Lcom/google/android/gms/analytics/internal/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/al;->b()Lcom/google/android/gms/internal/wu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/c/c;->a(Lcom/google/android/gms/c/d;)V

    iget-object v1, p0, Lcom/google/android/gms/analytics/o;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/aa;->q()Lcom/google/android/gms/analytics/internal/bd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/bd;->b()Lcom/google/android/gms/internal/ww;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/c/c;->a(Lcom/google/android/gms/c/d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/o;->j()V

    return-object v0
.end method
