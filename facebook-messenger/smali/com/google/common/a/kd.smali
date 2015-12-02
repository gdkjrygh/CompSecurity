.class Lcom/google/common/a/kd;
.super Lcom/google/common/a/k;
.source "RegularImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/k",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/kc;


# direct methods
.method constructor <init>(Lcom/google/common/a/kc;I)V
    .locals 0

    .prologue
    .line 267
    iput-object p1, p0, Lcom/google/common/a/kd;->a:Lcom/google/common/a/kc;

    invoke-direct {p0, p2}, Lcom/google/common/a/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .prologue
    .line 269
    iget-object v0, p0, Lcom/google/common/a/kd;->a:Lcom/google/common/a/kc;

    iget-object v0, v0, Lcom/google/common/a/kc;->a:Lcom/google/common/a/jw;

    invoke-static {v0}, Lcom/google/common/a/jw;->a(Lcom/google/common/a/jw;)[Lcom/google/common/a/jz;

    move-result-object v0

    aget-object v0, v0, p1

    invoke-interface {v0}, Lcom/google/common/a/jz;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
