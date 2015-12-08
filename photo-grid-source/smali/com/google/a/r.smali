.class final Lcom/google/a/r;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/a/am",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/a/am;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 862
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/d/a;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 873
    iget-object v0, p0, Lcom/google/a/r;->a:Lcom/google/a/am;

    if-nez v0, :cond_0

    .line 874
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 876
    :cond_0
    iget-object v0, p0, Lcom/google/a/r;->a:Lcom/google/a/am;

    invoke-virtual {v0, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/a/am;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/am",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 866
    iget-object v0, p0, Lcom/google/a/r;->a:Lcom/google/a/am;

    if-eqz v0, :cond_0

    .line 867
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 869
    :cond_0
    iput-object p1, p0, Lcom/google/a/r;->a:Lcom/google/a/am;

    .line 870
    return-void
.end method

.method public final a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/d/f;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 880
    iget-object v0, p0, Lcom/google/a/r;->a:Lcom/google/a/am;

    if-nez v0, :cond_0

    .line 881
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 883
    :cond_0
    iget-object v0, p0, Lcom/google/a/r;->a:Lcom/google/a/am;

    invoke-virtual {v0, p1, p2}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    .line 884
    return-void
.end method
