.class final Lcom/facebook/common/c/h;
.super Ljava/lang/Object;
.source "LogFileUtils.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/common/c/f;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/common/c/f;Lcom/facebook/common/c/f;)I
    .locals 3

    .prologue
    .line 50
    invoke-virtual {p1}, Lcom/facebook/common/c/f;->b()Ljava/util/Date;

    move-result-object v0

    .line 51
    invoke-virtual {p2}, Lcom/facebook/common/c/f;->b()Ljava/util/Date;

    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 53
    const/4 v0, -0x1

    .line 57
    :goto_0
    return v0

    .line 54
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 55
    const/4 v0, 0x1

    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 47
    check-cast p1, Lcom/facebook/common/c/f;

    check-cast p2, Lcom/facebook/common/c/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/common/c/h;->a(Lcom/facebook/common/c/f;Lcom/facebook/common/c/f;)I

    move-result v0

    return v0
.end method
