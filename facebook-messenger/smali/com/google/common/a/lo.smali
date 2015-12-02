.class Lcom/google/common/a/lo;
.super Lcom/google/common/a/iq;
.source "StandardTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/iq",
        "<TC;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/ln;


# direct methods
.method constructor <init>(Lcom/google/common/a/ln;)V
    .locals 0

    .prologue
    .line 422
    iput-object p1, p0, Lcom/google/common/a/lo;->a:Lcom/google/common/a/ln;

    invoke-direct {p0}, Lcom/google/common/a/iq;-><init>()V

    return-void
.end method


# virtual methods
.method a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TC;TV;>;"
        }
    .end annotation

    .prologue
    .line 425
    iget-object v0, p0, Lcom/google/common/a/lo;->a:Lcom/google/common/a/ln;

    return-object v0
.end method
