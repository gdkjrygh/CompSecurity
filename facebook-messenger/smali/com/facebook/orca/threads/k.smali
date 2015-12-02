.class Lcom/facebook/orca/threads/k;
.super Ljava/lang/Object;
.source "MessagesCollectionMerger.java"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 281
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/k;->a:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/threads/j;)V
    .locals 0

    .prologue
    .line 279
    invoke-direct {p0}, Lcom/facebook/orca/threads/k;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 284
    iget-object v0, p0, Lcom/facebook/orca/threads/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/threads/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    :cond_0
    return-void
.end method

.method b(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 1

    .prologue
    .line 295
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/k;->c(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method c(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/Message;
    .locals 2

    .prologue
    .line 299
    iget-object v0, p0, Lcom/facebook/orca/threads/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 300
    if-eqz v0, :cond_1

    .line 306
    :cond_0
    :goto_0
    return-object v0

    .line 303
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 304
    iget-object v0, p0, Lcom/facebook/orca/threads/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    goto :goto_0
.end method

.method d(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 310
    iget-object v0, p0, Lcom/facebook/orca/threads/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/facebook/orca/threads/k;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    :cond_0
    return-void
.end method
