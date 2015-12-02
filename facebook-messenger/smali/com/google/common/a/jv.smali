.class Lcom/google/common/a/jv;
.super Lcom/google/common/a/k;
.source "RegularImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/k",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/ju;


# direct methods
.method constructor <init>(Lcom/google/common/a/ju;II)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/google/common/a/jv;->a:Lcom/google/common/a/ju;

    invoke-direct {p0, p2, p3}, Lcom/google/common/a/k;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 130
    iget-object v0, p0, Lcom/google/common/a/jv;->a:Lcom/google/common/a/ju;

    invoke-static {v0}, Lcom/google/common/a/ju;->a(Lcom/google/common/a/ju;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/a/jv;->a:Lcom/google/common/a/ju;

    invoke-static {v1}, Lcom/google/common/a/ju;->b(Lcom/google/common/a/ju;)I

    move-result v1

    add-int/2addr v1, p1

    aget-object v0, v0, v1

    return-object v0
.end method
