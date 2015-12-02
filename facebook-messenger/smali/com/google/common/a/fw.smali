.class Lcom/google/common/a/fw;
.super Lcom/google/common/a/em;
.source "ImmutableSortedMap.java"


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
.field private final a:Lcom/google/common/a/fp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fp",
            "<*TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/fp;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/fp",
            "<*TV;>;)V"
        }
    .end annotation

    .prologue
    .line 562
    invoke-direct {p0}, Lcom/google/common/a/em;-><init>()V

    .line 563
    iput-object p1, p0, Lcom/google/common/a/fw;->a:Lcom/google/common/a/fp;

    .line 564
    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    .prologue
    .line 580
    const/4 v0, 0x1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 576
    iget-object v0, p0, Lcom/google/common/a/fw;->a:Lcom/google/common/a/fp;

    invoke-virtual {v0, p1}, Lcom/google/common/a/fp;->containsValue(Ljava/lang/Object;)Z

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
    .line 572
    iget-object v0, p0, Lcom/google/common/a/fw;->a:Lcom/google/common/a/fp;

    invoke-virtual {v0}, Lcom/google/common/a/fp;->h()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 558
    invoke-virtual {p0}, Lcom/google/common/a/fw;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 568
    iget-object v0, p0, Lcom/google/common/a/fw;->a:Lcom/google/common/a/fp;

    invoke-virtual {v0}, Lcom/google/common/a/fp;->size()I

    move-result v0

    return v0
.end method
