.class final Lcom/c/a/b/u;
.super Lcom/c/a/b/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/c/a/b/m;

.field final synthetic b:Lcom/c/a/b/t;


# direct methods
.method constructor <init>(Lcom/c/a/b/t;Lcom/c/a/b/m;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/c/a/b/u;->b:Lcom/c/a/b/t;

    iput-object p2, p0, Lcom/c/a/b/u;->a:Lcom/c/a/b/m;

    invoke-direct {p0}, Lcom/c/a/b/i;-><init>()V

    return-void
.end method


# virtual methods
.method final d()Lcom/c/a/b/k;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/c/a/b/u;->b:Lcom/c/a/b/t;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/c/a/b/u;->a:Lcom/c/a/b/m;

    invoke-virtual {v0, p1}, Lcom/c/a/b/m;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
