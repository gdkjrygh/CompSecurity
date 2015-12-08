.class public abstract Lcom/google/android/gms/c/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/gms/c/e;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:Lcom/google/android/gms/c/c;

.field private final b:Lcom/google/android/gms/c/f;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/c/f;Lcom/google/android/gms/internal/wg;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/c/e;->b:Lcom/google/android/gms/c/f;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/c/e;->c:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/c/c;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/c/c;-><init>(Lcom/google/android/gms/c/e;Lcom/google/android/gms/internal/wg;)V

    invoke-virtual {v0}, Lcom/google/android/gms/c/c;->j()V

    iput-object v0, p0, Lcom/google/android/gms/c/e;->a:Lcom/google/android/gms/c/c;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/c/c;)V
    .locals 0

    return-void
.end method

.method public g()Lcom/google/android/gms/c/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/c/e;->a:Lcom/google/android/gms/c/c;

    invoke-virtual {v0}, Lcom/google/android/gms/c/c;->a()Lcom/google/android/gms/c/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/c/e;->j()V

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/c/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/c/e;->a:Lcom/google/android/gms/c/c;

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/c/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/c/e;->a:Lcom/google/android/gms/c/c;

    invoke-virtual {v0}, Lcom/google/android/gms/c/c;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected final j()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/c/e;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final k()Lcom/google/android/gms/c/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/c/e;->b:Lcom/google/android/gms/c/f;

    return-object v0
.end method
