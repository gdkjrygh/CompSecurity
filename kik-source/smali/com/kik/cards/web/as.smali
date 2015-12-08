.class final Lcom/kik/cards/web/as;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/aq;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/aq;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 78
    check-cast p1, Ljava/lang/Long;

    if-nez p1, :cond_1

    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object v2

    iget-object v0, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->a(Lcom/kik/cards/web/aq;)J

    move-result-wide v4

    iget-object v0, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->b(Lcom/kik/cards/web/aq;)J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->c(Lcom/kik/cards/web/aq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->c(Lcom/kik/cards/web/aq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/webkit/WebStorage;->deleteOrigin(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lcom/kik/cards/web/aq;->a(Lcom/kik/cards/web/aq;J)J

    invoke-static {}, Lcom/kik/cards/web/aq;->o()Lorg/c/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Cache size too big, deleted key "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " with size "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->c(Lcom/kik/cards/web/aq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->c(Lcom/kik/cards/web/aq;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    iget-object v1, v1, Lcom/kik/cards/web/aq;->b:Landroid/webkit/ValueCallback;

    invoke-virtual {v2, v0, v1}, Landroid/webkit/WebStorage;->getUsageForOrigin(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-static {v0}, Lcom/kik/cards/web/aq;->d(Lcom/kik/cards/web/aq;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lkik/android/f/a/ae;->a(Ljava/io/File;)J

    invoke-static {}, Lcom/kik/cards/web/aq;->o()Lorg/c/b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Old Cache size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kik/cards/web/as;->a:Lcom/kik/cards/web/aq;

    invoke-static {v1}, Lcom/kik/cards/web/aq;->a(Lcom/kik/cards/web/aq;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/kik/cards/web/aq;->o()Lorg/c/b;

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto/16 :goto_0
.end method
