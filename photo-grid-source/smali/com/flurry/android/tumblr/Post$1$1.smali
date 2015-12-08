.class Lcom/flurry/android/tumblr/Post$1$1;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/dz;

.field final synthetic b:Lcom/flurry/android/tumblr/PostListener;

.field final synthetic c:Lcom/flurry/android/tumblr/Post$1;


# direct methods
.method constructor <init>(Lcom/flurry/android/tumblr/Post$1;Lcom/flurry/sdk/dz;Lcom/flurry/android/tumblr/PostListener;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/flurry/android/tumblr/Post$1$1;->c:Lcom/flurry/android/tumblr/Post$1;

    iput-object p2, p0, Lcom/flurry/android/tumblr/Post$1$1;->a:Lcom/flurry/sdk/dz;

    iput-object p3, p0, Lcom/flurry/android/tumblr/Post$1$1;->b:Lcom/flurry/android/tumblr/PostListener;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    const/4 v4, 0x3

    .line 60
    sget-object v0, Lcom/flurry/android/tumblr/Post$2;->a:[I

    iget-object v1, p0, Lcom/flurry/android/tumblr/Post$1$1;->a:Lcom/flurry/sdk/dz;

    iget-object v1, v1, Lcom/flurry/sdk/dz;->b:Lcom/flurry/sdk/dz$a;

    invoke-virtual {v1}, Lcom/flurry/sdk/dz$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 83
    :goto_0
    return-void

    .line 62
    :pswitch_0
    invoke-static {}, Lcom/flurry/android/tumblr/Post;->h()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Post success for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/flurry/android/tumblr/Post$1$1;->a:Lcom/flurry/sdk/dz;

    iget v2, v2, Lcom/flurry/sdk/dz;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/flurry/android/tumblr/Post$1$1;->b:Lcom/flurry/android/tumblr/PostListener;

    iget-object v1, p0, Lcom/flurry/android/tumblr/Post$1$1;->a:Lcom/flurry/sdk/dz;

    iget-object v1, v1, Lcom/flurry/sdk/dz;->f:Ljava/lang/Long;

    invoke-interface {v0, v1}, Lcom/flurry/android/tumblr/PostListener;->onPostSuccess(Ljava/lang/Long;)V

    .line 64
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.impl.analytics.tumblr.TumblrEvents"

    iget-object v2, p0, Lcom/flurry/android/tumblr/Post$1$1;->c:Lcom/flurry/android/tumblr/Post$1;

    iget-object v2, v2, Lcom/flurry/android/tumblr/Post$1;->a:Lcom/flurry/android/tumblr/Post;

    invoke-static {v2}, Lcom/flurry/android/tumblr/Post;->c(Lcom/flurry/android/tumblr/Post;)Lcom/flurry/sdk/jx;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->b(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 65
    invoke-static {}, Lcom/flurry/sdk/lx;->a()Lcom/flurry/sdk/lx;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/android/tumblr/Post$1$1;->c:Lcom/flurry/android/tumblr/Post$1;

    iget-object v1, v1, Lcom/flurry/android/tumblr/Post$1;->a:Lcom/flurry/android/tumblr/Post;

    invoke-static {v1}, Lcom/flurry/android/tumblr/Post;->a(Lcom/flurry/android/tumblr/Post;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/lx;->a(I)V

    goto :goto_0

    .line 69
    :pswitch_1
    iget-object v0, p0, Lcom/flurry/android/tumblr/Post$1$1;->a:Lcom/flurry/sdk/dz;

    iget-object v0, v0, Lcom/flurry/sdk/dz;->e:Ljava/lang/String;

    .line 70
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 71
    const-string v0, "Internal error."

    .line 73
    :cond_0
    invoke-static {}, Lcom/flurry/android/tumblr/Post;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Post failed for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/android/tumblr/Post$1$1;->a:Lcom/flurry/sdk/dz;

    iget v3, v3, Lcom/flurry/sdk/dz;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " with error code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/flurry/android/tumblr/Post$1$1;->a:Lcom/flurry/sdk/dz;

    iget-object v3, v3, Lcom/flurry/sdk/dz;->d:Lcom/flurry/sdk/ea;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  and error message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 74
    iget-object v1, p0, Lcom/flurry/android/tumblr/Post$1$1;->b:Lcom/flurry/android/tumblr/PostListener;

    invoke-interface {v1, v0}, Lcom/flurry/android/tumblr/PostListener;->onPostFailure(Ljava/lang/String;)V

    .line 75
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.impl.analytics.tumblr.TumblrEvents"

    iget-object v2, p0, Lcom/flurry/android/tumblr/Post$1$1;->c:Lcom/flurry/android/tumblr/Post$1;

    iget-object v2, v2, Lcom/flurry/android/tumblr/Post$1;->a:Lcom/flurry/android/tumblr/Post;

    invoke-static {v2}, Lcom/flurry/android/tumblr/Post;->c(Lcom/flurry/android/tumblr/Post;)Lcom/flurry/sdk/jx;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->b(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 76
    invoke-static {}, Lcom/flurry/sdk/lx;->a()Lcom/flurry/sdk/lx;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/android/tumblr/Post$1$1;->c:Lcom/flurry/android/tumblr/Post$1;

    iget-object v1, v1, Lcom/flurry/android/tumblr/Post$1;->a:Lcom/flurry/android/tumblr/Post;

    invoke-static {v1}, Lcom/flurry/android/tumblr/Post;->a(Lcom/flurry/android/tumblr/Post;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/lx;->a(I)V

    goto/16 :goto_0

    .line 60
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
