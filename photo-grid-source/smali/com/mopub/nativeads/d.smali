.class final Lcom/mopub/nativeads/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/az;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/mopub/nativeads/aw;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Iterator;Lcom/mopub/nativeads/aw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/mopub/nativeads/aw;",
            ")V"
        }
    .end annotation

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/d;->a:Landroid/content/Context;

    .line 26
    iput-object p2, p0, Lcom/mopub/nativeads/d;->b:Ljava/util/Iterator;

    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/mopub/nativeads/d;->c:Ljava/lang/ref/WeakReference;

    .line 28
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lcom/mopub/nativeads/d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/aw;

    .line 108
    if-eqz v0, :cond_0

    .line 1075
    invoke-static {v0}, Lcom/mopub/common/util/Views;->removeFromParent(Landroid/view/View;)V

    .line 1076
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/aw;->setVisibility(I)V

    .line 111
    :cond_0
    return-void
.end method


# virtual methods
.method public final onFailure()V
    .locals 1

    .prologue
    .line 102
    const-string v0, "Failed to resolve URL for click."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 103
    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V

    .line 104
    return-void
.end method

.method public final onSuccess(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 40
    invoke-static {p1}, Lcom/mopub/common/util/Intents;->isAboutScheme(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    const-string v0, "Link to about page ignored."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V

    .line 98
    :goto_0
    return-void

    .line 47
    :cond_0
    invoke-static {p1}, Lcom/mopub/common/util/Intents;->isNativeBrowserScheme(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 49
    :try_start_0
    invoke-static {p1}, Lcom/mopub/common/util/Intents;->intentForNativeBrowserScheme(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 50
    iget-object v1, p0, Lcom/mopub/nativeads/d;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/mopub/common/util/Intents;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V

    .line 51
    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V
    :try_end_0
    .catch Lcom/mopub/exceptions/UrlParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mopub/exceptions/IntentNotResolvableException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/mopub/exceptions/UrlParseException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 59
    :goto_1
    iget-object v0, p0, Lcom/mopub/nativeads/d;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    iget-object v0, p0, Lcom/mopub/nativeads/d;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/mopub/nativeads/ay;->getResolvedUrl(Ljava/lang/String;Lcom/mopub/nativeads/az;)V

    goto :goto_0

    .line 56
    :catch_1
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not handle intent for URI: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 62
    :cond_1
    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V

    goto :goto_0

    .line 68
    :cond_2
    invoke-static {p1}, Lcom/mopub/common/util/Intents;->isDeepLink(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 69
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 72
    iget-object v1, p0, Lcom/mopub/nativeads/d;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/mopub/common/util/Intents;->deviceCanHandleIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 74
    :try_start_1
    iget-object v1, p0, Lcom/mopub/nativeads/d;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/mopub/common/util/Intents;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_1
    .catch Lcom/mopub/exceptions/IntentNotResolvableException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V

    goto :goto_0

    .line 77
    :catch_2
    move-exception v0

    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not handle intent with URI: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V

    .line 83
    :cond_3
    iget-object v0, p0, Lcom/mopub/nativeads/d;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 84
    iget-object v0, p0, Lcom/mopub/nativeads/d;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/mopub/nativeads/ay;->getResolvedUrl(Ljava/lang/String;Lcom/mopub/nativeads/az;)V

    goto/16 :goto_0

    .line 79
    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V

    throw v0

    .line 86
    :cond_4
    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V

    goto/16 :goto_0

    .line 91
    :cond_5
    invoke-direct {p0}, Lcom/mopub/nativeads/d;->a()V

    .line 92
    invoke-static {p1}, Lcom/mopub/common/util/Intents;->isHttpUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 93
    iget-object v0, p0, Lcom/mopub/nativeads/d;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/mopub/common/MoPubBrowser;->open(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 97
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Link ignored. Unable to handle url: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto/16 :goto_0
.end method
