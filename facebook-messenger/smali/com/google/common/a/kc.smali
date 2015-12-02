.class Lcom/google/common/a/kc;
.super Lcom/google/common/a/em;
.source "RegularImmutableMap.java"


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
.field final a:Lcom/google/common/a/jw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jw",
            "<*TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/jw;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jw",
            "<*TV;>;)V"
        }
    .end annotation

    .prologue
    .line 257
    invoke-direct {p0}, Lcom/google/common/a/em;-><init>()V

    .line 258
    iput-object p1, p0, Lcom/google/common/a/kc;->a:Lcom/google/common/a/jw;

    .line 259
    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    .prologue
    .line 279
    const/4 v0, 0x1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lcom/google/common/a/kc;->a:Lcom/google/common/a/jw;

    invoke-virtual {v0, p1}, Lcom/google/common/a/jw;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 267
    new-instance v0, Lcom/google/common/a/kd;

    iget-object v1, p0, Lcom/google/common/a/kc;->a:Lcom/google/common/a/jw;

    invoke-static {v1}, Lcom/google/common/a/jw;->a(Lcom/google/common/a/jw;)[Lcom/google/common/a/jz;

    move-result-object v1

    array-length v1, v1

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/kd;-><init>(Lcom/google/common/a/kc;I)V

    return-object v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 253
    invoke-virtual {p0}, Lcom/google/common/a/kc;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Lcom/google/common/a/kc;->a:Lcom/google/common/a/jw;

    invoke-static {v0}, Lcom/google/common/a/jw;->a(Lcom/google/common/a/jw;)[Lcom/google/common/a/jz;

    move-result-object v0

    array-length v0, v0

    return v0
.end method
