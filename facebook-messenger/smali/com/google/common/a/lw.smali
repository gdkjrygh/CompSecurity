.class abstract Lcom/google/common/a/lw;
.super Ljava/util/AbstractSet;
.source "StandardTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractSet",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/google/common/a/lj;


# direct methods
.method private constructor <init>(Lcom/google/common/a/lj;)V
    .locals 0

    .prologue
    .line 251
    iput-object p1, p0, Lcom/google/common/a/lw;->b:Lcom/google/common/a/lj;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/a/lj;Lcom/google/common/a/lk;)V
    .locals 0

    .prologue
    .line 251
    invoke-direct {p0, p1}, Lcom/google/common/a/lw;-><init>(Lcom/google/common/a/lj;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/google/common/a/lw;->b:Lcom/google/common/a/lj;

    iget-object v0, v0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 258
    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/google/common/a/lw;->b:Lcom/google/common/a/lj;

    iget-object v0, v0, Lcom/google/common/a/lj;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method
