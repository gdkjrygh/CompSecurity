.class public Lcom/flurry/android/tumblr/TumblrShare;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/flurry/android/tumblr/TumblrShare;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/android/tumblr/TumblrShare;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getTumblrImage()Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    .line 55
    sget-object v0, Lcom/flurry/android/tumblr/TumblrShare;->a:Ljava/lang/String;

    const-string v1, "Device SDK Version older than 10"

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const/4 v0, 0x0

    .line 65
    :goto_0
    return-object v0

    .line 59
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 60
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Flurry SDK must be initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_1
    new-instance v0, Lcom/flurry/sdk/gz;

    invoke-direct {v0}, Lcom/flurry/sdk/gz;-><init>()V

    .line 64
    invoke-virtual {v0}, Lcom/flurry/sdk/gz;->r()V

    .line 65
    invoke-virtual {v0}, Lcom/flurry/sdk/gz;->o()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method public static post(Landroid/content/Context;Lcom/flurry/android/tumblr/Post;)V
    .locals 4

    .prologue
    .line 106
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    .line 107
    sget-object v0, Lcom/flurry/android/tumblr/TumblrShare;->a:Ljava/lang/String;

    const-string v1, "Device SDK Version older than 10"

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :goto_0
    return-void

    .line 111
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 112
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Flurry SDK must be initialized before posting on Tumblr"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 115
    :cond_1
    if-nez p0, :cond_2

    .line 116
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 119
    :cond_2
    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_3

    .line 120
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 123
    :cond_3
    if-nez p1, :cond_4

    .line 124
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Post object cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 127
    :cond_4
    invoke-static {}, Lcom/flurry/sdk/ej;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 128
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Consumer api key cannot be null or empty. Please set consumer key using setOAuthConfig()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_5
    invoke-static {}, Lcom/flurry/sdk/ej;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 132
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Consumer secret cannot be null or empty. Please set consumer secret using setOAuthConfig()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 136
    :cond_6
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    const-string v1, "ShareClick"

    invoke-virtual {p1}, Lcom/flurry/android/tumblr/Post;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/flurry/sdk/hi;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/flurry/android/FlurryEventRecordStatus;

    .line 139
    invoke-static {}, Lcom/flurry/sdk/lx;->a()Lcom/flurry/sdk/lx;

    move-result-object v0

    invoke-virtual {p1}, Lcom/flurry/android/tumblr/Post;->g()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/flurry/sdk/lx;->a(ILcom/flurry/android/tumblr/Post;)V

    .line 142
    invoke-virtual {p1}, Lcom/flurry/android/tumblr/Post;->c()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/flurry/sdk/ff;->a(Landroid/content/Context;Landroid/os/Bundle;)Z

    goto :goto_0
.end method

.method public static setOAuthConfig(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 79
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    .line 80
    sget-object v0, Lcom/flurry/android/tumblr/TumblrShare;->a:Ljava/lang/String;

    const-string v1, "Device SDK Version older than 10"

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    :goto_0
    return-void

    .line 84
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Consumer api key cannot be null or empty."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Consumer secret cannot be null or empty."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_2
    invoke-static {p0}, Lcom/flurry/sdk/ej;->a(Ljava/lang/String;)V

    .line 93
    invoke-static {p1}, Lcom/flurry/sdk/ej;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
