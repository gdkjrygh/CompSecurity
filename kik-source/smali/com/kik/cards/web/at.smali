.class final Lcom/kik/cards/web/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field final synthetic a:Landroid/webkit/WebStorage;

.field final synthetic b:Lcom/kik/cards/web/aq;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/aq;Landroid/webkit/WebStorage;)V
    .locals 0

    .prologue
    .line 333
    iput-object p1, p0, Lcom/kik/cards/web/at;->b:Lcom/kik/cards/web/aq;

    iput-object p2, p0, Lcom/kik/cards/web/at;->a:Landroid/webkit/WebStorage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 333
    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/at;->b:Lcom/kik/cards/web/aq;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v1}, Lcom/kik/cards/web/aq;->a(Lcom/kik/cards/web/aq;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/kik/cards/web/at;->b:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->c(Lcom/kik/cards/web/aq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {}, Lcom/kik/cards/web/aq;->p()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/kik/cards/web/at;->b:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->c(Lcom/kik/cards/web/aq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {}, Lcom/kik/cards/web/aq;->p()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/kik/cards/web/at;->b:Lcom/kik/cards/web/aq;

    iget-object v1, p0, Lcom/kik/cards/web/at;->b:Lcom/kik/cards/web/aq;

    invoke-static {v1}, Lcom/kik/cards/web/aq;->d(Lcom/kik/cards/web/aq;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lkik/android/f/a/ae;->a(Ljava/io/File;)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/kik/cards/web/aq;->b(Lcom/kik/cards/web/aq;J)J

    iget-object v0, p0, Lcom/kik/cards/web/at;->b:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->c(Lcom/kik/cards/web/aq;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/kik/cards/web/at;->a:Landroid/webkit/WebStorage;

    iget-object v2, p0, Lcom/kik/cards/web/at;->b:Lcom/kik/cards/web/aq;

    iget-object v2, v2, Lcom/kik/cards/web/aq;->b:Landroid/webkit/ValueCallback;

    invoke-virtual {v1, v0, v2}, Landroid/webkit/WebStorage;->getUsageForOrigin(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_0
    return-void
.end method
