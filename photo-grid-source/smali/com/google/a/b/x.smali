.class final Lcom/google/a/b/x;
.super Lcom/google/a/b/ab;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/b/v",
        "<TV;>.com/google/a/b/ab<",
        "Ljava/util/Map$Entry",
        "<",
        "Ljava/lang/String;",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/a/b/w;


# direct methods
.method constructor <init>(Lcom/google/a/b/w;)V
    .locals 2

    .prologue
    .line 452
    iput-object p1, p0, Lcom/google/a/b/x;->a:Lcom/google/a/b/w;

    iget-object v0, p1, Lcom/google/a/b/w;->a:Lcom/google/a/b/v;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/a/b/ab;-><init>(Lcom/google/a/b/v;B)V

    return-void
.end method


# virtual methods
.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 452
    .line 1454
    invoke-virtual {p0}, Lcom/google/a/b/x;->a()Lcom/google/a/b/aa;

    move-result-object v0

    .line 452
    return-object v0
.end method
