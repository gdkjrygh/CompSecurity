.class public Lcom/facebook/orca/notify/ap;
.super Lcom/facebook/orca/notify/ai;
.source "NewMessageNotification.java"


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/messages/model/threads/Message;

.field private final d:Lcom/facebook/orca/notify/aq;

.field private final e:Lcom/facebook/push/g;

.field private final f:Lcom/facebook/orca/notify/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/notify/aq;Lcom/facebook/push/g;Lcom/facebook/orca/notify/c;)V
    .locals 1

    .prologue
    .line 53
    sget-object v0, Lcom/facebook/orca/notify/aj;->NEW_MESSAGE:Lcom/facebook/orca/notify/aj;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/ai;-><init>(Lcom/facebook/orca/notify/aj;)V

    .line 54
    iput-object p1, p0, Lcom/facebook/orca/notify/ap;->b:Ljava/lang/String;

    .line 55
    iput-object p2, p0, Lcom/facebook/orca/notify/ap;->c:Lcom/facebook/messages/model/threads/Message;

    .line 56
    iput-object p3, p0, Lcom/facebook/orca/notify/ap;->d:Lcom/facebook/orca/notify/aq;

    .line 57
    iput-object p4, p0, Lcom/facebook/orca/notify/ap;->e:Lcom/facebook/push/g;

    .line 58
    iput-object p5, p0, Lcom/facebook/orca/notify/ap;->f:Lcom/facebook/orca/notify/c;

    .line 59
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/orca/notify/ap;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/orca/notify/ap;->c:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public c()Lcom/facebook/orca/notify/aq;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/notify/ap;->d:Lcom/facebook/orca/notify/aq;

    return-object v0
.end method

.method public d()Z
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/orca/notify/ap;->e:Lcom/facebook/push/g;

    sget-object v1, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Lcom/facebook/orca/notify/c;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/orca/notify/ap;->f:Lcom/facebook/orca/notify/c;

    return-object v0
.end method
