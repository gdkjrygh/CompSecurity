.class final Lcom/facebook/i/a/a/c;
.super Ljava/lang/Object;
.source "PeerStateRole.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/i/a/a/b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/i/a/a/b;Lcom/facebook/i/a/a/b;)I
    .locals 2

    .prologue
    .line 63
    invoke-static {p1}, Lcom/facebook/i/a/a/b;->a(Lcom/facebook/i/a/a/b;)I

    move-result v0

    invoke-static {p2}, Lcom/facebook/i/a/a/b;->a(Lcom/facebook/i/a/a/b;)I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    invoke-static {p1}, Lcom/facebook/i/a/a/b;->a(Lcom/facebook/i/a/a/b;)I

    move-result v0

    invoke-static {p2}, Lcom/facebook/i/a/a/b;->a(Lcom/facebook/i/a/a/b;)I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/facebook/i/a/a/b;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/i/a/a/b;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 59
    check-cast p1, Lcom/facebook/i/a/a/b;

    check-cast p2, Lcom/facebook/i/a/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/i/a/a/c;->a(Lcom/facebook/i/a/a/b;Lcom/facebook/i/a/a/b;)I

    move-result v0

    return v0
.end method
