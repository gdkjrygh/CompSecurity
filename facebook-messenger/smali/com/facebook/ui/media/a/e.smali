.class Lcom/facebook/ui/media/a/e;
.super Lcom/facebook/ui/media/a/c;
.source "MediaDownloader.java"


# direct methods
.method constructor <init>(Lcom/facebook/ui/media/a/d;)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/a/c;-><init>(Lcom/facebook/ui/media/a/d;)V

    .line 99
    sget-object v0, Lcom/facebook/ui/media/a/d;->SUCCESS:Lcom/facebook/ui/media/a/d;

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 100
    return-void

    .line 99
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
