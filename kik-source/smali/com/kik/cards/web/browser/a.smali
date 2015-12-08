.class final Lcom/kik/cards/web/browser/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/cards/web/browser/BrowserPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/browser/BrowserPlugin;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lcom/kik/cards/web/browser/a;->b:Lcom/kik/cards/web/browser/BrowserPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/browser/a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 274
    iget-object v0, p0, Lcom/kik/cards/web/browser/a;->b:Lcom/kik/cards/web/browser/BrowserPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/browser/BrowserPlugin;->a(Lcom/kik/cards/web/browser/BrowserPlugin;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    .line 275
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/browser/a;->b:Lcom/kik/cards/web/browser/BrowserPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/browser/BrowserPlugin;->a(Lcom/kik/cards/web/browser/BrowserPlugin;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lcom/kik/cards/web/browser/a;->a:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 276
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 278
    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/kik/cards/web/browser/a;->b:Lcom/kik/cards/web/browser/BrowserPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/browser/BrowserPlugin;->b(Lcom/kik/cards/web/browser/BrowserPlugin;)Lcom/kik/cards/web/browser/BrowserPlugin$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->q()V

    .line 282
    :cond_0
    return-void

    .line 276
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
