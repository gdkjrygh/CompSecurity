.class final Lcom/c/a/b/s;
.super Lcom/c/a/b/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/c/a/b/m;

.field final synthetic b:Lcom/c/a/b/r;


# direct methods
.method constructor <init>(Lcom/c/a/b/r;Lcom/c/a/b/m;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/c/a/b/s;->b:Lcom/c/a/b/r;

    iput-object p2, p0, Lcom/c/a/b/s;->a:Lcom/c/a/b/m;

    invoke-direct {p0}, Lcom/c/a/b/i;-><init>()V

    return-void
.end method


# virtual methods
.method final d()Lcom/c/a/b/k;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/c/a/b/s;->b:Lcom/c/a/b/r;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/c/a/b/s;->a:Lcom/c/a/b/m;

    invoke-virtual {v0, p1}, Lcom/c/a/b/m;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
