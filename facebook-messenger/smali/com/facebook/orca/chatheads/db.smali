.class Lcom/facebook/orca/chatheads/db;
.super Ljava/lang/Object;
.source "ChatHeadsServiceBroadcastReceiver.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field private a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/facebook/orca/chatheads/cz;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/da;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/db;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/chatheads/db;->a:Ljavax/inject/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/db;->b:Ljavax/inject/a;

    if-nez v0, :cond_1

    .line 67
    :cond_0
    invoke-static {p1}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 68
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 69
    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsEnabled;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/db;->a:Ljavax/inject/a;

    .line 70
    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/db;->b:Ljavax/inject/a;

    .line 71
    const-class v1, Lcom/facebook/orca/chatheads/cz;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cz;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/db;->c:Lcom/facebook/orca/chatheads/cz;

    .line 73
    :cond_1
    return-void
.end method

.method private a(Lcom/facebook/c/c;)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/chatheads/db;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lcom/facebook/c/c;->setResultCode(I)V

    .line 110
    invoke-interface {p1}, Lcom/facebook/c/c;->abortBroadcast()V

    .line 112
    :cond_0
    return-void
.end method

.method private b(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 117
    const/4 v0, -0x1

    invoke-interface {p3, v0}, Lcom/facebook/c/c;->setResultCode(I)V

    .line 121
    invoke-interface {p3}, Lcom/facebook/c/c;->abortBroadcast()V

    .line 125
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 126
    iget-object v1, p0, Lcom/facebook/orca/chatheads/db;->c:Lcom/facebook/orca/chatheads/cz;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/cz;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 127
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 128
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 77
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/db;->a(Landroid/content/Context;)V

    .line 79
    const-string v0, "com.facebook.orca.chatheads.EXTRA_LOGGED_IN_USER_ID"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    iget-object v1, p0, Lcom/facebook/orca/chatheads/db;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/db;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 103
    :cond_0
    :goto_0
    return-void

    .line 85
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 87
    const-string v0, "com.facebook.orca.chatheads.ACTION_QUERY_CHATHEADS_ENABLED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    invoke-direct {p0, p3}, Lcom/facebook/orca/chatheads/db;->a(Lcom/facebook/c/c;)V

    goto :goto_0

    .line 92
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/db;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.facebook.orca.chatheads.ACTION_POPUP_CHAT_HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/db;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/chatheads/db;->b(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V

    goto :goto_0
.end method
