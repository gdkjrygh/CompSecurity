.class Lcom/google/common/a/kt;
.super Lcom/google/common/a/em;
.source "SingletonImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/em",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .prologue
    .line 107
    invoke-direct {p0}, Lcom/google/common/a/em;-><init>()V

    .line 108
    iput-object p1, p0, Lcom/google/common/a/kt;->a:Ljava/lang/Object;

    .line 109
    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    .prologue
    .line 129
    const/4 v0, 0x1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/google/common/a/kt;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 125
    iget-object v0, p0, Lcom/google/common/a/kt;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/common/a/gg;->a(Ljava/lang/Object;)Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 116
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 103
    invoke-virtual {p0}, Lcom/google/common/a/kt;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x1

    return v0
.end method
