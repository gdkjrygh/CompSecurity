.class public Lcom/facebook/orca/sms/a/c;
.super Landroid/database/ContentObserver;
.source "SmsReceiveObserver.java"


# instance fields
.field private final a:Lcom/facebook/orca/sms/bn;

.field private final b:Lcom/facebook/orca/g/b;

.field private final c:Lcom/facebook/orca/push/b;

.field private final d:Lcom/facebook/orca/sms/af;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljavax/inject/a;
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
.method public constructor <init>(Lcom/facebook/orca/sms/bn;Lcom/facebook/orca/g/b;Lcom/facebook/orca/push/b;Lcom/facebook/orca/sms/af;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/sms/bn;",
            "Lcom/facebook/orca/g/b;",
            "Lcom/facebook/orca/push/b;",
            "Lcom/facebook/orca/sms/af;",
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
    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 37
    iput-object p2, p0, Lcom/facebook/orca/sms/a/c;->b:Lcom/facebook/orca/g/b;

    .line 38
    iput-object p1, p0, Lcom/facebook/orca/sms/a/c;->a:Lcom/facebook/orca/sms/bn;

    .line 39
    iput-object p3, p0, Lcom/facebook/orca/sms/a/c;->c:Lcom/facebook/orca/push/b;

    .line 40
    iput-object p4, p0, Lcom/facebook/orca/sms/a/c;->d:Lcom/facebook/orca/sms/af;

    .line 41
    iput-object p5, p0, Lcom/facebook/orca/sms/a/c;->e:Ljavax/inject/a;

    .line 42
    iput-object p6, p0, Lcom/facebook/orca/sms/a/c;->f:Ljavax/inject/a;

    .line 43
    return-void
.end method

.method private a()Lcom/facebook/messages/model/threads/Message;
    .locals 3

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/orca/sms/a/c;->a:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/bn;->a()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    iget-object v1, p0, Lcom/facebook/orca/sms/a/c;->b:Lcom/facebook/orca/g/b;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/g/b;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 74
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x0

    return v0
.end method

.method public onChange(Z)V
    .locals 5

    .prologue
    .line 47
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/sms/a/c;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/sms/a/c;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 59
    :cond_0
    :goto_0
    return-void

    .line 52
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/sms/a/c;->a()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 56
    iget-object v3, p0, Lcom/facebook/orca/sms/a/c;->c:Lcom/facebook/orca/push/b;

    sget-object v4, Lcom/facebook/push/g;->SMS:Lcom/facebook/push/g;

    invoke-virtual {v3, v2, v1, v0, v4}, Lcom/facebook/orca/push/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    .line 57
    iget-object v0, p0, Lcom/facebook/orca/sms/a/c;->d:Lcom/facebook/orca/sms/af;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/sms/af;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
