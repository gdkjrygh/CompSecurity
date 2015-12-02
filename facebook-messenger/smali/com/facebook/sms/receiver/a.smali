.class public Lcom/facebook/sms/receiver/a;
.super Ljava/lang/Object;
.source "SmsBroadcastActionReceiver.java"

# interfaces
.implements Lcom/facebook/c/b;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/sms/a/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/sms/receiver/a;

    sput-object v0, Lcom/facebook/sms/receiver/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/facebook/sms/receiver/a;->b:Ljava/lang/Class;

    .line 34
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/sms/receiver/a;->c:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 38
    invoke-static {p1}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 39
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 40
    const-class v1, Lcom/facebook/sms/a/a;

    iget-object v2, p0, Lcom/facebook/sms/receiver/a;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/sms/receiver/a;->c:Ljava/util/Set;

    .line 42
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 54
    invoke-direct {p0, p1}, Lcom/facebook/sms/receiver/a;->a(Landroid/content/Context;)V

    .line 55
    sget-object v0, Lcom/facebook/sms/receiver/a;->a:Ljava/lang/Class;

    const-string v1, "SMS received"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 58
    if-nez v0, :cond_0

    .line 79
    :goto_0
    return-void

    .line 62
    :cond_0
    const-string v1, "pdus"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 63
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v3

    .line 65
    const/4 v1, 0x0

    move v2, v1

    :goto_1
    array-length v1, v0

    if-ge v2, v1, :cond_3

    .line 66
    aget-object v1, v0, v2

    check-cast v1, [B

    check-cast v1, [B

    invoke-static {v1}, Landroid/telephony/SmsMessage;->createFromPdu([B)Landroid/telephony/SmsMessage;

    move-result-object v1

    .line 67
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/telephony/SmsMessage;->getMessageBody()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    .line 65
    :cond_1
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 70
    :cond_2
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 73
    :cond_3
    iget-object v0, p0, Lcom/facebook/sms/receiver/a;->c:Ljava/util/Set;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/sms/receiver/a;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 74
    iget-object v0, p0, Lcom/facebook/sms/receiver/a;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/sms/a/a;

    .line 75
    invoke-interface {v0, p1, p2, p3, v3}, Lcom/facebook/sms/a/a;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;Ljava/util/List;)V

    goto :goto_3

    .line 78
    :cond_4
    const/4 v0, -0x1

    invoke-interface {p3, v0, v5, v5}, Lcom/facebook/c/c;->setResult(ILjava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0
.end method
