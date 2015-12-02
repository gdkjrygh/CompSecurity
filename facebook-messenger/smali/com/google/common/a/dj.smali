.class final Lcom/google/common/a/dj;
.super Ljava/lang/ref/WeakReference;
.source "CustomConcurrentHashMap.java"

# interfaces
.implements Lcom/google/common/a/dd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/ref/WeakReference",
        "<TV;>;",
        "Lcom/google/common/a/dd",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/common/a/cm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue",
            "<TV;>;TV;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1743
    invoke-direct {p0, p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 1744
    iput-object p3, p0, Lcom/google/common/a/dj;->a:Lcom/google/common/a/cm;

    .line 1745
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1749
    iget-object v0, p0, Lcom/google/common/a/dj;->a:Lcom/google/common/a/cm;

    return-object v0
.end method

.method public a(Ljava/lang/ref/ReferenceQueue;Lcom/google/common/a/cm;)Lcom/google/common/a/dd;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue",
            "<TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)",
            "Lcom/google/common/a/dd",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1760
    new-instance v0, Lcom/google/common/a/dj;

    invoke-virtual {p0}, Lcom/google/common/a/dj;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Lcom/google/common/a/dj;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Lcom/google/common/a/cm;)V

    return-object v0
.end method

.method public a(Lcom/google/common/a/dd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/dd",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1754
    invoke-virtual {p0}, Lcom/google/common/a/dj;->clear()V

    .line 1755
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 1765
    const/4 v0, 0x0

    return v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 1770
    invoke-virtual {p0}, Lcom/google/common/a/dj;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
