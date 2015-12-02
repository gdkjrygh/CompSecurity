.class final Lcom/mobvista/sdk/m/core/loader/v;
.super Lcom/mobvista/sdk/m/a/e/c;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/loader/u;

.field private final b:Ljava/util/concurrent/Semaphore;

.field private final f:Landroid/content/Context;

.field private g:Ljava/lang/String;

.field private h:Lcom/mobvista/sdk/m/core/loader/t;


# direct methods
.method public constructor <init>(Lcom/mobvista/sdk/m/core/loader/u;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 78
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/c;-><init>()V

    .line 63
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->b:Ljava/util/concurrent/Semaphore;

    .line 179
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/w;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/loader/w;-><init>(Lcom/mobvista/sdk/m/core/loader/v;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->h:Lcom/mobvista/sdk/m/core/loader/t;

    .line 79
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/v;->f:Landroid/content/Context;

    .line 80
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/loader/v;->g:Ljava/lang/String;

    .line 85
    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x1

    .line 125
    const-string/jumbo v1, "302"

    const-string/jumbo v2, "startJavaHTTPSpider"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    new-instance v1, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    invoke-direct {v1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;-><init>()V

    .line 129
    new-instance v4, Lcom/mobvista/sdk/m/core/loader/i;

    invoke-direct {v4}, Lcom/mobvista/sdk/m/core/loader/i;-><init>()V

    move v2, v3

    .line 131
    :goto_0
    const/16 v5, 0xa

    if-ge v2, v5, :cond_1

    .line 133
    iget-object v5, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v5}, Lcom/mobvista/sdk/m/core/loader/u;->b(Lcom/mobvista/sdk/m/core/loader/u;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 176
    :goto_1
    return-object v0

    .line 137
    :cond_0
    invoke-virtual {v4, p1}, Lcom/mobvista/sdk/m/core/loader/i;->a(Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/j;

    move-result-object v5

    .line 139
    if-nez v5, :cond_2

    .line 141
    invoke-virtual {v1, v3}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setSuccess(Z)V

    :cond_1
    :goto_2
    move-object v0, v1

    .line 176
    goto :goto_1

    .line 145
    :cond_2
    invoke-virtual {v1, v7}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setSuccess(Z)V

    .line 147
    iget v6, v5, Lcom/mobvista/sdk/m/core/loader/j;->f:I

    invoke-static {v6}, Lcom/mobvista/sdk/m/core/loader/v;->c(I)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 148
    iget-object v6, v5, Lcom/mobvista/sdk/m/core/loader/j;->a:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 150
    invoke-virtual {v1, v7}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setjumpDone(Z)V

    .line 151
    invoke-virtual {v1, p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setUrl(Ljava/lang/String;)V

    goto :goto_2

    .line 154
    :cond_3
    iget-object p1, v5, Lcom/mobvista/sdk/m/core/loader/j;->a:Ljava/lang/String;

    .line 156
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/loader/v;->c(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-static {p1}, Lcom/mobvista/sdk/m/core/loader/v;->e(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-static {p1}, Lcom/mobvista/sdk/m/core/loader/v;->d(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 157
    :cond_4
    invoke-virtual {v1, v7}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setjumpDone(Z)V

    .line 158
    invoke-virtual {v1, p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setUrl(Ljava/lang/String;)V

    goto :goto_2

    .line 164
    :cond_5
    iget v2, v5, Lcom/mobvista/sdk/m/core/loader/j;->f:I

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/loader/v;->b(I)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 165
    invoke-virtual {v1, v7}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setjumpDone(Z)V

    .line 166
    invoke-virtual {v1, p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setUrl(Ljava/lang/String;)V

    .line 167
    iget-object v2, v5, Lcom/mobvista/sdk/m/core/loader/j;->g:Ljava/lang/String;

    if-nez v2, :cond_6

    :goto_3
    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setContent(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    iget-object v0, v5, Lcom/mobvista/sdk/m/core/loader/j;->g:Ljava/lang/String;

    goto :goto_3

    .line 170
    :cond_7
    invoke-virtual {v1, v3}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setjumpDone(Z)V

    .line 171
    invoke-virtual {v1, p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setUrl(Ljava/lang/String;)V

    goto :goto_2

    .line 131
    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/v;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/v;->d()V

    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/v;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/loader/v;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static b(I)Z
    .locals 1

    .prologue
    .line 242
    const/16 v0, 0xc8

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 220
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/loader/v;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 221
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setCode(I)V

    .line 222
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setUrl(Ljava/lang/String;)V

    .line 223
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setjumpDone(Z)V

    .line 238
    :goto_0
    return v0

    .line 225
    :cond_0
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/loader/v;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 226
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setCode(I)V

    .line 227
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setUrl(Ljava/lang/String;)V

    .line 228
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setjumpDone(Z)V

    goto :goto_0

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setCode(I)V

    .line 232
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setUrl(Ljava/lang/String;)V

    .line 238
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquireUninterruptibly()V

    .line 67
    return-void
.end method

.method private static c(I)Z
    .locals 1

    .prologue
    .line 250
    const/16 v0, 0x12d

    if-eq p0, v0, :cond_0

    const/16 v0, 0x12e

    if-eq p0, v0, :cond_0

    const/16 v0, 0x133

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 246
    invoke-static {p0}, Landroid/webkit/URLUtil;->isNetworkUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 71
    return-void
.end method

.method private static d(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 256
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "market:/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "play.google.com"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static e(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 261
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    .line 90
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    new-instance v1, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    invoke-direct {v1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;-><init>()V

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    .line 91
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setUrl(Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->g:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/mobvista/sdk/m/core/loader/v;->a(Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    .line 95
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->b(Lcom/mobvista/sdk/m/core/loader/u;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 122
    :cond_0
    :goto_0
    return-void

    .line 99
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/v;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/v;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/v;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 107
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 108
    const-string/jumbo v0, "302"

    const-string/jumbo v1, "startWebViewHtmlParser"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/n;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/n;-><init>()V

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v3}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getContent()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/mobvista/sdk/m/core/loader/v;->h:Lcom/mobvista/sdk/m/core/loader/t;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/mobvista/sdk/m/core/loader/n;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/mobvista/sdk/m/core/loader/t;)V

    .line 117
    :goto_1
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/v;->c()V

    goto :goto_0

    .line 111
    :cond_2
    const-string/jumbo v0, "302"

    const-string/jumbo v1, "startWebViewSpider"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/n;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/n;-><init>()V

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/v;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/v;->h:Lcom/mobvista/sdk/m/core/loader/t;

    invoke-virtual {v0, v1, v2, v3}, Lcom/mobvista/sdk/m/core/loader/n;->a(Landroid/content/Context;Ljava/lang/String;Lcom/mobvista/sdk/m/core/loader/t;)V

    goto :goto_1

    .line 119
    :cond_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/loader/v;->b(Ljava/lang/String;)Z

    goto/16 :goto_0
.end method
