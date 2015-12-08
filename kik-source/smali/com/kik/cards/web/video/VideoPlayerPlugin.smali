.class public Lcom/kik/cards/web/video/VideoPlayerPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private b:Lcom/kik/cards/web/video/b;

.field private d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

.field private e:Lkik/android/b/s;

.field private f:Lkik/a/e/d;

.field private g:Lcom/kik/cards/web/userdata/e;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/kik/cards/web/browser/BrowserPlugin$a;Lcom/kik/cards/web/video/b;Lkik/android/b/s;Lcom/kik/cards/web/userdata/a;Lkik/a/e/d;)V
    .locals 1

    .prologue
    .line 45
    const-string v0, "VideoPlayer"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 46
    invoke-static {p1}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->a:Z

    .line 47
    iput-object p3, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    .line 48
    iput-object p2, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 49
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0, p0}, Lcom/kik/cards/web/video/b;->a(Lcom/kik/cards/web/video/VideoPlayerPlugin;)V

    .line 50
    iput-object p4, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->e:Lkik/android/b/s;

    .line 51
    iput-object p6, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->f:Lkik/a/e/d;

    .line 52
    invoke-interface {p5}, Lcom/kik/cards/web/userdata/a;->a()Lcom/kik/cards/web/userdata/e;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->g:Lcom/kik/cards/web/userdata/e;

    .line 53
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/video/VideoPlayerPlugin;)Lkik/a/e/d;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->f:Lkik/a/e/d;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/cards/web/video/VideoPlayerPlugin;)Lcom/kik/cards/web/browser/BrowserPlugin$a;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cards/web/video/VideoPlayerPlugin;)Lorg/c/b;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->c:Lorg/c/b;

    return-object v0
.end method

.method private k()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 339
    iget-object v1, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v1}, Lcom/kik/cards/web/video/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 347
    :cond_0
    :goto_0
    return v0

    .line 343
    :cond_1
    iget-object v1, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 347
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    .line 327
    new-instance v0, Lcom/kik/cards/web/plugin/f;

    const-string v1, "error"

    invoke-direct {v0, v1, p1}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->a(Lcom/kik/cards/web/plugin/f;)V

    .line 328
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 312
    new-instance v0, Lcom/kik/cards/web/plugin/f;

    const-string v1, "playing"

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->a(Lcom/kik/cards/web/plugin/f;)V

    .line 313
    return-void
.end method

.method public closeVideo(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 154
    invoke-direct {p0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 158
    :goto_0
    return-object v0

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->i()V

    .line 158
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 317
    new-instance v0, Lcom/kik/cards/web/plugin/f;

    const-string v1, "paused"

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->a(Lcom/kik/cards/web/plugin/f;)V

    .line 318
    return-void
.end method

.method public final f_()V
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->j()V

    .line 334
    invoke-super {p0}, Lcom/kik/cards/web/plugin/d;->f_()V

    .line 335
    return-void
.end method

.method public getCompletion(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 7
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 222
    invoke-direct {p0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 306
    :goto_0
    return-object v0

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->e:Lkik/android/b/s;

    if-eqz v0, :cond_1

    invoke-static {p3}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->h()Z

    move-result v0

    if-nez v0, :cond_2

    .line 227
    :cond_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1aa

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 230
    :cond_2
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->w()Lorg/json/JSONObject;

    move-result-object v4

    .line 231
    const-string v0, "completion"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 233
    const-string v0, "skipPrompt"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 235
    iget-object v1, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->g:Lcom/kik/cards/web/userdata/e;

    invoke-interface {v1, v0, p3}, Lcom/kik/cards/web/userdata/e;->a(ZLjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 236
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1a4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 238
    :cond_3
    iget-object v1, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->g:Lcom/kik/cards/web/userdata/e;

    const/4 v2, 0x1

    invoke-interface {v1, v2, v0, p3}, Lcom/kik/cards/web/userdata/e;->a(ZZLjava/lang/String;)Lcom/kik/g/p;

    move-result-object v6

    .line 240
    new-instance v0, Lcom/kik/cards/web/video/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/kik/cards/web/video/e;-><init>(Lcom/kik/cards/web/video/VideoPlayerPlugin;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 306
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public getPosition(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 6
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 181
    invoke-direct {p0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 193
    :goto_0
    return-object v0

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->n()I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    .line 185
    iget-object v1, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v1}, Lcom/kik/cards/web/video/b;->o()I

    move-result v1

    div-int/lit16 v1, v1, 0x3e8

    int-to-float v1, v1

    .line 186
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 188
    :try_start_0
    const-string v3, "position"

    float-to-double v4, v0

    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 189
    const-string v0, "total"

    float-to-double v4, v1

    invoke-virtual {v2, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    :goto_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xc8

    invoke-direct {v0, v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public getVideoUrl(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 75
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 91
    :goto_0
    return-object v0

    .line 79
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->e()Ljava/lang/String;

    move-result-object v0

    .line 80
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 81
    if-nez v0, :cond_1

    .line 82
    const-string v0, "url"

    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    :goto_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0xc8

    invoke-direct {v0, v2, v1}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 89
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 91
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 85
    :cond_1
    :try_start_1
    const-string v2, "url"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public isClosed(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 165
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 174
    :goto_0
    return-object v0

    .line 168
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 169
    const-string v0, "closed"

    iget-object v2, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v2}, Lcom/kik/cards/web/video/b;->m()Z

    move-result v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 170
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0xc8

    invoke-direct {v0, v2, v1}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 172
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 174
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public isPaused(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 137
    :try_start_0
    invoke-direct {p0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 147
    :goto_0
    return-object v0

    .line 140
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 141
    const-string v0, "paused"

    iget-object v2, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v2}, Lcom/kik/cards/web/video/b;->q()Z

    move-result v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 143
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0xc8

    invoke-direct {v0, v2, v1}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 145
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 147
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public isPlaying(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 108
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 119
    :goto_0
    return-object v0

    .line 113
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 114
    const-string v0, "playing"

    iget-object v2, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v2}, Lcom/kik/cards/web/video/b;->h()Z

    move-result v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 115
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0xc8

    invoke-direct {v0, v2, v1}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 117
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 119
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public final j()V
    .locals 2

    .prologue
    .line 322
    new-instance v0, Lcom/kik/cards/web/plugin/f;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->a(Lcom/kik/cards/web/plugin/f;)V

    .line 323
    return-void
.end method

.method public pauseVideo(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 126
    invoke-direct {p0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 130
    :goto_0
    return-object v0

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->p()V

    .line 130
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public playVideo(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 98
    invoke-direct {p0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 102
    :goto_0
    return-object v0

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->f()V

    .line 102
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public setPosition(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    const/16 v2, 0x190

    .line 199
    invoke-direct {p0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 215
    :goto_0
    return-object v0

    .line 203
    :cond_0
    const-string v0, "position"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 208
    :cond_1
    :try_start_0
    const-string v0, "position"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 209
    if-lez v0, :cond_2

    .line 210
    :goto_1
    iget-object v1, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v1, v0}, Lcom/kik/cards/web/video/b;->a(I)V

    .line 211
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 215
    :catch_0
    move-exception v0

    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 209
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public setVideoUrl(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 58
    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 69
    :goto_0
    return-object v0

    .line 62
    :cond_0
    const-string v0, "url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    const/4 v0, 0x0

    .line 68
    :goto_1
    iget-object v1, p0, Lcom/kik/cards/web/video/VideoPlayerPlugin;->b:Lcom/kik/cards/web/video/b;

    invoke-virtual {v1, v0}, Lcom/kik/cards/web/video/b;->a(Ljava/lang/String;)V

    .line 69
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 66
    :cond_1
    const-string v0, "url"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method
