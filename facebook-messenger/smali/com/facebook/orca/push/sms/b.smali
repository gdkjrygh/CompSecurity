.class public Lcom/facebook/orca/push/sms/b;
.super Ljava/lang/Object;
.source "OrcaSmsBroadcastHandler.java"

# interfaces
.implements Lcom/facebook/sms/a/a;


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

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

.field private final c:Lcom/facebook/orca/nux/h;

.field private final d:Lcom/facebook/orca/phonenumber/identification/f;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/nux/h;Lcom/facebook/orca/phonenumber/identification/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/orca/nux/h;",
            "Lcom/facebook/orca/phonenumber/identification/f;",
            ")V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/push/sms/b;->a:Ljavax/inject/a;

    .line 31
    iput-object p2, p0, Lcom/facebook/orca/push/sms/b;->b:Ljavax/inject/a;

    .line 33
    iput-object p3, p0, Lcom/facebook/orca/push/sms/b;->c:Lcom/facebook/orca/nux/h;

    .line 34
    iput-object p4, p0, Lcom/facebook/orca/push/sms/b;->d:Lcom/facebook/orca/phonenumber/identification/f;

    .line 35
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            "Lcom/facebook/c/c;",
            "Ljava/util/List",
            "<",
            "Landroid/telephony/SmsMessage;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/push/sms/b;->d:Lcom/facebook/orca/phonenumber/identification/f;

    invoke-virtual {v0}, Lcom/facebook/orca/phonenumber/identification/f;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 46
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/SmsMessage;

    .line 48
    invoke-virtual {v0}, Landroid/telephony/SmsMessage;->getMessageBody()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/push/sms/b;->d:Lcom/facebook/orca/phonenumber/identification/f;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/phonenumber/identification/f;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    invoke-interface {p3}, Lcom/facebook/c/c;->abortBroadcast()V

    .line 63
    :cond_1
    :goto_1
    return-void

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/push/sms/b;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/push/sms/b;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/push/sms/b;->c:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    invoke-static {p1, p2}, Lcom/facebook/orca/push/sms/SmsReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 60
    invoke-interface {p3}, Lcom/facebook/c/c;->abortBroadcast()V

    goto :goto_1
.end method
