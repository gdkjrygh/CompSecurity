.class final Lcom/google/a/b/y;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/a/b/v;


# direct methods
.method private constructor <init>(Lcom/google/a/b/v;)V
    .locals 0

    .prologue
    .line 400
    iput-object p1, p0, Lcom/google/a/b/y;->a:Lcom/google/a/b/v;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/a/b/v;B)V
    .locals 0

    .prologue
    .line 400
    invoke-direct {p0, p1}, Lcom/google/a/b/y;-><init>(Lcom/google/a/b/v;)V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .prologue
    .line 424
    iget-object v0, p0, Lcom/google/a/b/y;->a:Lcom/google/a/b/v;

    invoke-virtual {v0}, Lcom/google/a/b/v;->clear()V

    .line 425
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 414
    iget-object v0, p0, Lcom/google/a/b/y;->a:Lcom/google/a/b/v;

    invoke-virtual {v0, p1}, Lcom/google/a/b/v;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 402
    new-instance v0, Lcom/google/a/b/z;

    invoke-direct {v0, p0}, Lcom/google/a/b/z;-><init>(Lcom/google/a/b/y;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 418
    iget-object v0, p0, Lcom/google/a/b/y;->a:Lcom/google/a/b/v;

    invoke-static {v0}, Lcom/google/a/b/v;->b(Lcom/google/a/b/v;)I

    move-result v0

    .line 419
    iget-object v1, p0, Lcom/google/a/b/y;->a:Lcom/google/a/b/v;

    invoke-virtual {v1, p1}, Lcom/google/a/b/v;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    iget-object v1, p0, Lcom/google/a/b/y;->a:Lcom/google/a/b/v;

    invoke-static {v1}, Lcom/google/a/b/v;->b(Lcom/google/a/b/v;)I

    move-result v1

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 410
    iget-object v0, p0, Lcom/google/a/b/y;->a:Lcom/google/a/b/v;

    invoke-static {v0}, Lcom/google/a/b/v;->b(Lcom/google/a/b/v;)I

    move-result v0

    return v0
.end method
