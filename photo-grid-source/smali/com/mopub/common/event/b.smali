.class final Lcom/mopub/common/event/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/mopub/common/event/ScribeEventRecorder;


# direct methods
.method constructor <init>(Lcom/mopub/common/event/ScribeEventRecorder;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/mopub/common/event/b;->b:Lcom/mopub/common/event/ScribeEventRecorder;

    iput-object p2, p0, Lcom/mopub/common/event/b;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createRequest(Lcom/mopub/network/ScribeRequest$Listener;)Lcom/mopub/network/ScribeRequest;
    .locals 4

    .prologue
    .line 103
    new-instance v0, Lcom/mopub/network/ScribeRequest;

    const-string v1, "https://analytics.mopub.com/i/jot/exchange_client_event"

    iget-object v2, p0, Lcom/mopub/common/event/b;->a:Ljava/util/List;

    iget-object v3, p0, Lcom/mopub/common/event/b;->b:Lcom/mopub/common/event/ScribeEventRecorder;

    invoke-static {v3}, Lcom/mopub/common/event/ScribeEventRecorder;->a(Lcom/mopub/common/event/ScribeEventRecorder;)Lcom/mopub/common/event/EventSerializer;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/mopub/network/ScribeRequest;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/mopub/common/event/EventSerializer;Lcom/mopub/network/ScribeRequest$Listener;)V

    return-object v0
.end method
