.class Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;
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
    name = "NullOutputExceptionReference"
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
.field final message:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 751
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;, "Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 752
    iput-object p1, p0, Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;->message:Ljava/lang/String;

    .line 753
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
    .line 759
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;, "Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference<TK;TV;>;"
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
    .line 755
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;, "Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference<TK;TV;>;"
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
    .line 762
    .local p0, "this":Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;, "Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference<TK;TV;>;"
    new-instance v0, Lcom/google/inject/internal/util/$NullOutputException;

    iget-object v1, p0, Lcom/google/inject/internal/util/$MapMaker$NullOutputExceptionReference;->message:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$NullOutputException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
