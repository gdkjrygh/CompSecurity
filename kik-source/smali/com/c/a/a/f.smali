.class final Lcom/c/a/a/f;
.super Lcom/c/a/a/c;
.source "SourceFile"


# instance fields
.field final synthetic q:[C


# direct methods
.method constructor <init>(Ljava/lang/String;[C)V
    .locals 0

    .prologue
    .line 501
    iput-object p2, p0, Lcom/c/a/a/f;->q:[C

    invoke-direct {p0, p1}, Lcom/c/a/a/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 501
    check-cast p1, Ljava/lang/Character;

    invoke-super {p0, p1}, Lcom/c/a/a/c;->a(Ljava/lang/Character;)Z

    move-result v0

    return v0
.end method

.method public final c(C)Z
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lcom/c/a/a/f;->q:[C

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
