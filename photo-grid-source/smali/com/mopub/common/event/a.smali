.class final Lcom/mopub/common/event/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field final synthetic a:Lcom/mopub/common/event/EventDispatcher;


# direct methods
.method constructor <init>(Lcom/mopub/common/event/EventDispatcher;)V
    .locals 0

    .prologue
    .line 20
    iput-object p1, p0, Lcom/mopub/common/event/a;->a:Lcom/mopub/common/event/EventDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    .prologue
    .line 23
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/mopub/common/event/BaseEvent;

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/mopub/common/event/a;->a:Lcom/mopub/common/event/EventDispatcher;

    invoke-static {v0}, Lcom/mopub/common/event/EventDispatcher;->a(Lcom/mopub/common/event/EventDispatcher;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/event/EventRecorder;

    .line 25
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/mopub/common/event/BaseEvent;

    invoke-interface {v0, v1}, Lcom/mopub/common/event/EventRecorder;->record(Lcom/mopub/common/event/BaseEvent;)V

    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "EventDispatcher received non-BaseEvent message type."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 30
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
