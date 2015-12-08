.class Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;
.super Ljava/lang/Object;
.source "MapMaker.java"

# interfaces
.implements Lcom/google/inject/internal/util/$MapMaker$ValueReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$MapMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ComputationExceptionReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final t:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Ljava/lang/Throwable;)V
    .locals 0
    .param p1, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 770
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;, "Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 771
    iput-object p1, p0, Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;->t:Ljava/lang/Throwable;

    .line 772
    return-void
.end method


# virtual methods
.method public copyFor(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 778
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;, "Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference<TK;TV;>;"
    .local p1, "entry":Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;, "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry<TK;TV;>;"
    return-object p0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 774
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;, "Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference<TK;TV;>;"
    const/4 v0, 0x0

    return-object v0
.end method

.method public waitForValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 781
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;, "Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference<TK;TV;>;"
    new-instance v0, Lcom/google/inject/internal/util/$AsynchronousComputationException;

    iget-object v1, p0, Lcom/google/inject/internal/util/$MapMaker$ComputationExceptionReference;->t:Ljava/lang/Throwable;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$AsynchronousComputationException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
