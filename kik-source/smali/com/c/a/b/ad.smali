.class final Lcom/c/a/b/ad;
.super Lcom/c/a/b/ao;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/c/a/b/ao;


# direct methods
.method constructor <init>(Lcom/c/a/b/ao;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/c/a/b/ad;->a:Lcom/c/a/b/ao;

    invoke-direct {p0}, Lcom/c/a/b/ao;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/c/a/b/ad;->a:Lcom/c/a/b/ao;

    invoke-virtual {v0}, Lcom/c/a/b/ao;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/c/a/b/ad;->a:Lcom/c/a/b/ao;

    invoke-virtual {v0}, Lcom/c/a/b/ao;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
