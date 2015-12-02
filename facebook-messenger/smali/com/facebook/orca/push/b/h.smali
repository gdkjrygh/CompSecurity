.class Lcom/facebook/orca/push/b/h;
.super Ljava/lang/Object;
.source "OrcaMqttTopicsSetProvider.java"

# interfaces
.implements Lcom/facebook/push/mqtt/m;


# instance fields
.field private final a:Lcom/facebook/config/a/a;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/config/a/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/config/a/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/orca/push/b/h;->a:Lcom/facebook/config/a/a;

    .line 29
    iput-object p2, p0, Lcom/facebook/orca/push/b/h;->b:Ljavax/inject/a;

    .line 30
    iput-object p3, p0, Lcom/facebook/orca/push/b/h;->c:Ljavax/inject/a;

    .line 31
    iput-object p4, p0, Lcom/facebook/orca/push/b/h;->d:Ljavax/inject/a;

    .line 32
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/ev;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            "Lcom/facebook/push/mqtt/ar;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 36
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v1

    .line 37
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/orca_message_notifications"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 38
    iget-object v0, p0, Lcom/facebook/orca/push/b/h;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/orca_typing_notifications"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->APP_USE:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 40
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/orca_presence"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->APP_USE:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/push/b/h;->a:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v2, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/push/b/h;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/inbox"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 45
    :cond_1
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/messaging_events"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->DEVICE_USE:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 46
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/push_notification"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 47
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/webrtc"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 48
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/webrtc_response"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 49
    new-instance v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    const-string v2, "/mercury"

    invoke-direct {v0, v2, v3}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    sget-object v2, Lcom/facebook/push/mqtt/ar;->DEVICE_USE:Lcom/facebook/push/mqtt/ar;

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 50
    invoke-virtual {v1}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method
