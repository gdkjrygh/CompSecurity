.class final Lcom/google/common/a/hm;
.super Ljava/lang/Object;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field c:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field d:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field e:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field f:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .prologue
    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput-object p1, p0, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    .line 121
    iput-object p2, p0, Lcom/google/common/a/hm;->b:Ljava/lang/Object;

    .line 122
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/a/hm;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
