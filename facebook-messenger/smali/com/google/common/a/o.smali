.class public abstract Lcom/google/common/a/o;
.super Lcom/google/common/a/mh;
.source "AbstractLinkedIterator.java"


# annotations
.annotation build Lcom/google/common/annotations/Beta;
.end annotation

.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/mh",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/google/common/a/mh;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/google/common/a/o;->a:Ljava/lang/Object;

    .line 47
    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/google/common/a/o;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/google/common/a/o;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 68
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/common/a/o;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    iget-object v1, p0, Lcom/google/common/a/o;->a:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lcom/google/common/a/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/google/common/a/o;->a:Ljava/lang/Object;

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/common/a/o;->a:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lcom/google/common/a/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/google/common/a/o;->a:Ljava/lang/Object;

    throw v0
.end method
