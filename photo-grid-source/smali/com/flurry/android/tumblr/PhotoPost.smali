.class public Lcom/flurry/android/tumblr/PhotoPost;
.super Lcom/flurry/android/tumblr/Post;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/flurry/android/tumblr/Post;-><init>()V

    .line 29
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Url to post cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_0
    iput-object p1, p0, Lcom/flurry/android/tumblr/PhotoPost;->a:Ljava/lang/String;

    .line 33
    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/flurry/android/tumblr/PhotoPost;->a:Ljava/lang/String;

    return-object v0
.end method

.method b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/flurry/android/tumblr/PhotoPost;->b:Ljava/lang/String;

    return-object v0
.end method

.method c()Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 53
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 54
    const-string v1, "com.flurry.android.post_caption"

    invoke-virtual {p0}, Lcom/flurry/android/tumblr/PhotoPost;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string v1, "com.flurry.android.post_url"

    invoke-virtual {p0}, Lcom/flurry/android/tumblr/PhotoPost;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v1, "com.flurry.android.post_ios_deeplinks"

    invoke-virtual {p0}, Lcom/flurry/android/tumblr/PhotoPost;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v1, "com.flurry.android.post_android_deeplinks"

    invoke-virtual {p0}, Lcom/flurry/android/tumblr/PhotoPost;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v1, "com.flurry.android.post_weblink"

    invoke-virtual {p0}, Lcom/flurry/android/tumblr/PhotoPost;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v1, "com.flurry.android.is_image_post"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 60
    const-string v1, "com.flurry.android.post_id"

    invoke-virtual {p0}, Lcom/flurry/android/tumblr/PhotoPost;->g()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 61
    return-object v0
.end method

.method public setCaption(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/flurry/android/tumblr/PhotoPost;->b:Ljava/lang/String;

    .line 42
    return-void
.end method
