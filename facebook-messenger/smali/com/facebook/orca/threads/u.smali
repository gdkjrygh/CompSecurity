.class Lcom/facebook/orca/threads/u;
.super Ljava/util/AbstractList;
.source "ThreadSummary.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList",
        "<",
        "Lcom/facebook/orca/threads/ThreadParticipant;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/es;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 284
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 285
    iput-object p1, p0, Lcom/facebook/orca/threads/u;->a:Lcom/google/common/a/es;

    .line 286
    iput-object p2, p0, Lcom/facebook/orca/threads/u;->b:Lcom/google/common/a/es;

    .line 287
    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 2

    .prologue
    .line 291
    iget-object v0, p0, Lcom/facebook/orca/threads/u;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/facebook/orca/threads/u;->a:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 294
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threads/u;->b:Lcom/google/common/a/es;

    iget-object v1, p0, Lcom/facebook/orca/threads/u;->a:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    sub-int v1, p1, v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    goto :goto_0
.end method

.method public synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 278
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/u;->a(I)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 2

    .prologue
    .line 299
    iget-object v0, p0, Lcom/facebook/orca/threads/u;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/orca/threads/u;->b:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
