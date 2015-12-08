.class final Lcom/google/a/b/ad;
.super Lcom/google/a/b/ab;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/b/v",
        "<TV;>.com/google/a/b/ab<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/a/b/ac;


# direct methods
.method constructor <init>(Lcom/google/a/b/ac;)V
    .locals 2

    .prologue
    .line 430
    iput-object p1, p0, Lcom/google/a/b/ad;->a:Lcom/google/a/b/ac;

    iget-object v0, p1, Lcom/google/a/b/ac;->a:Lcom/google/a/b/v;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/a/b/ab;-><init>(Lcom/google/a/b/v;B)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 432
    invoke-virtual {p0}, Lcom/google/a/b/ad;->a()Lcom/google/a/b/aa;

    move-result-object v0

    iget-object v0, v0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    return-object v0
.end method
