.class Lcom/facebook/widget/images/g;
.super Ljava/lang/Object;
.source "UrlImage.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/facebook/ui/images/b/r;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/facebook/widget/images/UrlImage;


# direct methods
.method constructor <init>(Lcom/facebook/widget/images/UrlImage;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 722
    iput-object p1, p0, Lcom/facebook/widget/images/g;->b:Lcom/facebook/widget/images/UrlImage;

    iput-object p2, p0, Lcom/facebook/widget/images/g;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 722
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/facebook/widget/images/g;->a(Ljava/util/List;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 732
    iget-object v0, p0, Lcom/facebook/widget/images/g;->b:Lcom/facebook/widget/images/UrlImage;

    invoke-static {v0, p1}, Lcom/facebook/widget/images/UrlImage;->a(Lcom/facebook/widget/images/UrlImage;Ljava/lang/Throwable;)V

    .line 733
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 725
    iget-object v0, p0, Lcom/facebook/widget/images/g;->b:Lcom/facebook/widget/images/UrlImage;

    invoke-static {v0}, Lcom/facebook/widget/images/UrlImage;->a(Lcom/facebook/widget/images/UrlImage;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/images/g;->a:Ljava/util/List;

    if-ne v0, v1, :cond_0

    .line 726
    iget-object v0, p0, Lcom/facebook/widget/images/g;->b:Lcom/facebook/widget/images/UrlImage;

    invoke-static {v0, p1}, Lcom/facebook/widget/images/UrlImage;->a(Lcom/facebook/widget/images/UrlImage;Ljava/util/List;)V

    .line 728
    :cond_0
    return-void
.end method
