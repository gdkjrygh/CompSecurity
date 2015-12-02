.class public abstract Lcom/facebook/orca/threadview/cb;
.super Lcom/facebook/base/broadcast/q;
.source "ThreadViewFragmentBroadcastReceiver.java"


# instance fields
.field private a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    invoke-static {}, Lcom/facebook/orca/threadview/cb;->e()Landroid/content/IntentFilter;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 18
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object v0, p0, Lcom/facebook/orca/threadview/cb;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 23
    return-void
.end method

.method private a(Lcom/facebook/user/UserIdentifierKey;)Z
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/orca/threadview/cb;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/cb;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/user/UserIdentifierKey;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/threadview/cb;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/cb;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static e()Landroid/content/IntentFilter;
    .locals 2

    .prologue
    .line 31
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 32
    const-string v1, "com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 33
    const-string v1, "com.facebook.orca.ACTION_REMOVED_THREAD_FOR_UI"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 34
    const-string v1, "com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 35
    const-string v1, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 36
    return-object v0
.end method


# virtual methods
.method public abstract a(J)V
.end method

.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 45
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 46
    const-string v1, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 47
    const-string v0, "event"

    sget-object v1, Lcom/facebook/push/mqtt/cj;->UNKNOWN:Lcom/facebook/push/mqtt/cj;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/cj;->toValue()I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 49
    invoke-static {v0}, Lcom/facebook/push/mqtt/cj;->fromValue(I)Lcom/facebook/push/mqtt/cj;

    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/cb;->a(Lcom/facebook/push/mqtt/cj;)V

    .line 71
    :cond_0
    :goto_0
    return-void

    .line 51
    :cond_1
    iget-boolean v1, p0, Lcom/facebook/orca/threadview/cb;->b:Z

    if-eqz v1, :cond_0

    .line 52
    const-string v1, "com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 53
    const-string v0, "threadid"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/cb;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const-string v0, "actionid"

    const-wide/16 v1, -0x1

    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 55
    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/threadview/cb;->a(J)V

    goto :goto_0

    .line 57
    :cond_2
    const-string v1, "com.facebook.orca.ACTION_REMOVED_THREAD_FOR_UI"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 58
    const-string v0, "threadid"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/cb;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/cb;->d()V

    goto :goto_0

    .line 61
    :cond_3
    const-string v1, "com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    const-string v0, "user_identifier_key"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserIdentifierKey;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/cb;->a(Lcom/facebook/user/UserIdentifierKey;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const/4 v0, 0x0

    .line 64
    const-string v1, "new_threadid"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 65
    const-string v0, "new_threadid"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 67
    :cond_4
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/cb;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/orca/threadview/cb;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 109
    return-void
.end method

.method public abstract a(Lcom/facebook/push/mqtt/cj;)V
.end method

.method public abstract a(Ljava/lang/String;)V
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 112
    iput-boolean p1, p0, Lcom/facebook/orca/threadview/cb;->b:Z

    .line 113
    return-void
.end method

.method public abstract d()V
.end method
