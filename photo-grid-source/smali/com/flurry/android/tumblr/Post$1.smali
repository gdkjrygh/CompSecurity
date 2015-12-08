.class Lcom/flurry/android/tumblr/Post$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/jx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/jx",
        "<",
        "Lcom/flurry/sdk/dz;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/android/tumblr/Post;


# direct methods
.method constructor <init>(Lcom/flurry/android/tumblr/Post;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/flurry/android/tumblr/Post$1;->a:Lcom/flurry/android/tumblr/Post;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/flurry/sdk/dz;)V
    .locals 3

    .prologue
    .line 43
    iget v0, p1, Lcom/flurry/sdk/dz;->c:I

    iget-object v1, p0, Lcom/flurry/android/tumblr/Post$1;->a:Lcom/flurry/android/tumblr/Post;

    invoke-static {v1}, Lcom/flurry/android/tumblr/Post;->a(Lcom/flurry/android/tumblr/Post;)I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 85
    :cond_0
    :goto_0
    return-void

    .line 47
    :cond_1
    iget-object v0, p1, Lcom/flurry/sdk/dz;->b:Lcom/flurry/sdk/dz$a;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/flurry/android/tumblr/Post$1;->a:Lcom/flurry/android/tumblr/Post;

    invoke-static {v0}, Lcom/flurry/android/tumblr/Post;->b(Lcom/flurry/android/tumblr/Post;)Lcom/flurry/android/tumblr/PostListener;

    move-result-object v0

    .line 53
    if-eqz v0, :cond_0

    .line 57
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    new-instance v2, Lcom/flurry/android/tumblr/Post$1$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/flurry/android/tumblr/Post$1$1;-><init>(Lcom/flurry/android/tumblr/Post$1;Lcom/flurry/sdk/dz;Lcom/flurry/android/tumblr/PostListener;)V

    invoke-virtual {v1, v2}, Lcom/flurry/sdk/jo;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 38
    check-cast p1, Lcom/flurry/sdk/dz;

    invoke-virtual {p0, p1}, Lcom/flurry/android/tumblr/Post$1;->a(Lcom/flurry/sdk/dz;)V

    return-void
.end method
