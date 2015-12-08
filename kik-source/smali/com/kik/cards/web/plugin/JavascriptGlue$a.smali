.class final Lcom/kik/cards/web/plugin/JavascriptGlue$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/web/plugin/JavascriptGlue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final a:J

.field final b:Ljava/lang/String;

.field final c:[Ljava/lang/String;

.field final synthetic d:Lcom/kik/cards/web/plugin/JavascriptGlue;


# direct methods
.method private constructor <init>(Lcom/kik/cards/web/plugin/JavascriptGlue;JLjava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 260
    iput-object p1, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 261
    iput-wide p2, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->a:J

    .line 262
    iput-object p4, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->b:Ljava/lang/String;

    .line 263
    iput-object p5, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->c:[Ljava/lang/String;

    .line 264
    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/cards/web/plugin/JavascriptGlue;JLjava/lang/String;[Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 253
    invoke-direct/range {p0 .. p5}, Lcom/kik/cards/web/plugin/JavascriptGlue$a;-><init>(Lcom/kik/cards/web/plugin/JavascriptGlue;JLjava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 269
    iget-object v0, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->h(Lcom/kik/cards/web/plugin/JavascriptGlue;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a(Lcom/kik/cards/web/plugin/JavascriptGlue;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 288
    :cond_0
    :goto_0
    return-void

    .line 274
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->f(Lcom/kik/cards/web/plugin/JavascriptGlue;)Ljava/util/LinkedList;

    move-result-object v1

    monitor-enter v1

    .line 275
    :try_start_0
    iget-wide v2, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->a:J

    iget-object v0, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->i(Lcom/kik/cards/web/plugin/JavascriptGlue;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 276
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    if-eqz v0, :cond_0

    .line 278
    invoke-static {}, Lcom/kik/cards/web/plugin/JavascriptGlue;->c()Lorg/c/b;

    move-result-object v0

    const-string v1, "BAD: timed out waiting for poll, forcing javascript poll."

    invoke-interface {v0, v1}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 282
    :try_start_1
    iget-object v0, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$a;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->h(Lcom/kik/cards/web/plugin/JavascriptGlue;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "javascript:cards._.bridge.forceAndroidPoll();"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 284
    :catch_0
    move-exception v0

    .line 285
    invoke-static {}, Lcom/kik/cards/web/plugin/JavascriptGlue;->c()Lorg/c/b;

    move-result-object v1

    const-string v2, "Exception while trying to force poll"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 275
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 276
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
