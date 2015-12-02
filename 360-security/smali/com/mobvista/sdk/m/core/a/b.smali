.class public final Lcom/mobvista/sdk/m/core/a/b;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Lcom/mobvista/sdk/m/core/a/a;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Lcom/facebook/ads/NativeAd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/a/b;)Lcom/mobvista/sdk/m/core/a/a;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    return-object v0
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/a/b;)Lcom/facebook/ads/NativeAd;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    return-object v0
.end method

.method private static b()Z
    .locals 1

    .prologue
    .line 145
    :try_start_0
    const-string/jumbo v0, "com.facebook.ads.a"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 146
    const-string/jumbo v0, "com.facebook.ads.c"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 147
    const-string/jumbo v0, "com.facebook.ads.NativeAd"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    const/4 v0, 0x1

    .line 150
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 133
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->n()V

    .line 135
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0, v1}, Lcom/facebook/ads/NativeAd;->a(Lcom/facebook/ads/d;)V

    .line 136
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->b()V

    .line 137
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    .line 139
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 118
    :try_start_0
    const-string/jumbo v0, "com.facebook.ads.a"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 119
    const-string/jumbo v0, "com.facebook.ads.c"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 120
    const-string/jumbo v0, "com.facebook.ads.NativeAd"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0, p1}, Lcom/facebook/ads/NativeAd;->a(Landroid/view/View;)V

    .line 130
    :cond_0
    :goto_0
    return-void

    .line 122
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    const-string/jumbo v1, "ClassNotFound:com.facebook.ads.*, is Facebook Audience Network JAR file added to your project?"

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/a/a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(Lcom/mobvista/sdk/m/core/a/a;)V
    .locals 3

    .prologue
    .line 40
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    .line 41
    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->f()I

    move-result v0

    const/16 v1, 0xa

    if-gt v0, v1, :cond_2

    .line 42
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    const-string/jumbo v1, "facebook need api above 10"

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/a/a;->a(Ljava/lang/String;)V

    .line 45
    :cond_0
    const-string/jumbo v0, ""

    const-string/jumbo v1, "facebook need api above 10"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    :cond_1
    :goto_0
    return-void

    .line 51
    :cond_2
    :try_start_0
    const-string/jumbo v0, "com.facebook.ads.a"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 52
    const-string/jumbo v0, "com.facebook.ads.c"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 53
    const-string/jumbo v0, "com.facebook.ads.NativeAd"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :try_start_1
    new-instance v0, Lcom/facebook/ads/NativeAd;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/a/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/a/b;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/NativeAd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    .line 62
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    new-instance v1, Lcom/mobvista/sdk/m/core/a/c;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/a/c;-><init>(Lcom/mobvista/sdk/m/core/a/b;)V

    invoke-virtual {v0, v1}, Lcom/facebook/ads/NativeAd;->a(Lcom/facebook/ads/d;)V

    .line 106
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->d:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 108
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    if-eqz v0, :cond_1

    .line 109
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    const-string/jumbo v1, "fb crash nothing reason"

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/a/a;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 55
    :catch_1
    move-exception v0

    :try_start_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    if-eqz v0, :cond_1

    .line 56
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->a:Lcom/mobvista/sdk/m/core/a/a;

    const-string/jumbo v1, "ClassNotFound:com.facebook.ads.*, is Facebook Audience Network JAR file added to your project?"

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/a/a;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0
.end method

.method public final varargs a([Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 28
    invoke-static {}, Lcom/mobvista/sdk/m/core/a/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    const/4 v0, 0x0

    aget-object v0, p1, v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->b:Landroid/content/Context;

    .line 30
    const/4 v0, 0x1

    aget-object v0, p1, v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/a/b;->c:Ljava/lang/String;

    .line 35
    :goto_0
    return-void

    .line 32
    :cond_0
    const-string/jumbo v0, "Mobvista SDK M"

    const-string/jumbo v1, "Try to load ad from \"facebook\" but Facebook Audience Network JAR file not found."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
