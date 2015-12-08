.class public abstract Lcom/bumptech/glide/load/c/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/c/s",
        "<",
        "Landroid/net/Uri;",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/bumptech/glide/load/c/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/c/s",
            "<",
            "Lcom/bumptech/glide/load/c/e;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/c/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/load/c/s",
            "<",
            "Lcom/bumptech/glide/load/c/e;",
            "TT;>;)V"
        }
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/bumptech/glide/load/c/x;->a:Landroid/content/Context;

    .line 22
    iput-object p2, p0, Lcom/bumptech/glide/load/c/x;->b:Lcom/bumptech/glide/load/c/s;

    .line 23
    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Context;Landroid/net/Uri;)Lcom/bumptech/glide/load/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/bumptech/glide/load/a/c",
            "<TT;>;"
        }
    .end annotation
.end method

.method protected abstract a(Landroid/content/Context;Ljava/lang/String;)Lcom/bumptech/glide/load/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Lcom/bumptech/glide/load/a/c",
            "<TT;>;"
        }
    .end annotation
.end method

.method public final synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;
    .locals 3

    .prologue
    .line 16
    check-cast p1, Landroid/net/Uri;

    .line 1027
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 1029
    const/4 v0, 0x0

    .line 1049
    const-string v1, "file"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "content"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "android.resource"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    const/4 v1, 0x1

    .line 1030
    :goto_0
    if-eqz v1, :cond_4

    .line 1031
    invoke-static {p1}, Lcom/bumptech/glide/load/c/a;->a(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1032
    invoke-static {p1}, Lcom/bumptech/glide/load/c/a;->b(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 1033
    iget-object v1, p0, Lcom/bumptech/glide/load/c/x;->a:Landroid/content/Context;

    invoke-virtual {p0, v1, v0}, Lcom/bumptech/glide/load/c/x;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/bumptech/glide/load/a/c;

    move-result-object v0

    .line 16
    :cond_1
    :goto_1
    return-object v0

    .line 1049
    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    .line 1035
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/load/c/x;->a:Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, Lcom/bumptech/glide/load/c/x;->a(Landroid/content/Context;Landroid/net/Uri;)Lcom/bumptech/glide/load/a/c;

    move-result-object v0

    goto :goto_1

    .line 1037
    :cond_4
    iget-object v1, p0, Lcom/bumptech/glide/load/c/x;->b:Lcom/bumptech/glide/load/c/s;

    if-eqz v1, :cond_1

    const-string v1, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "https"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1038
    :cond_5
    iget-object v0, p0, Lcom/bumptech/glide/load/c/x;->b:Lcom/bumptech/glide/load/c/s;

    new-instance v1, Lcom/bumptech/glide/load/c/e;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/bumptech/glide/load/c/e;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/bumptech/glide/load/c/s;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;

    move-result-object v0

    goto :goto_1
.end method
