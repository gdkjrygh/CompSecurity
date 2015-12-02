.class public Lcom/facebook/b/a/b;
.super Ljava/lang/Object;
.source "ChatHeadsBroadcaster.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/i/a/a/f;

.field private final d:Lcom/facebook/i/a/a/a;

.field private e:Lcom/facebook/base/j;

.field private f:Lcom/facebook/common/w/q;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljavax/inject/a;Lcom/facebook/i/a/a/f;Lcom/facebook/base/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/i/a/a/f;",
            "Lcom/facebook/base/j;",
            ")V"
        }
    .end annotation

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/b/a/b;->f:Lcom/facebook/common/w/q;

    .line 58
    iput-object p1, p0, Lcom/facebook/b/a/b;->a:Landroid/content/Context;

    .line 59
    iput-object p2, p0, Lcom/facebook/b/a/b;->b:Ljavax/inject/a;

    .line 60
    iput-object p3, p0, Lcom/facebook/b/a/b;->c:Lcom/facebook/i/a/a/f;

    .line 61
    iput-object p4, p0, Lcom/facebook/b/a/b;->e:Lcom/facebook/base/j;

    .line 62
    new-instance v0, Lcom/facebook/b/a/c;

    invoke-direct {v0, p0}, Lcom/facebook/b/a/c;-><init>(Lcom/facebook/b/a/b;)V

    iput-object v0, p0, Lcom/facebook/b/a/b;->d:Lcom/facebook/i/a/a/a;

    .line 81
    iget-object v0, p0, Lcom/facebook/b/a/b;->c:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    iget-object v2, p0, Lcom/facebook/b/a/b;->d:Lcom/facebook/i/a/a/a;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Lcom/facebook/i/a/a/a;)V

    .line 84
    iget-object v0, p0, Lcom/facebook/b/a/b;->c:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const-string v2, "disconnected"

    invoke-static {v1, v2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/b/a/b;->d:Lcom/facebook/i/a/a/a;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Lcom/facebook/i/a/a/a;)V

    .line 88
    iget-object v0, p0, Lcom/facebook/b/a/b;->c:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->f:Landroid/net/Uri;

    iget-object v2, p0, Lcom/facebook/b/a/b;->d:Lcom/facebook/i/a/a/a;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Lcom/facebook/i/a/a/a;)V

    .line 91
    return-void
.end method

.method static synthetic a(Lcom/facebook/b/a/b;Lcom/facebook/common/w/q;)Lcom/facebook/common/w/q;
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/facebook/b/a/b;->f:Lcom/facebook/common/w/q;

    return-object p1
.end method

.method private a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 174
    const-string v1, "com.facebook.orca.chatheads.EXTRA_LOGGED_IN_USER_ID"

    iget-object v0, p0, Lcom/facebook/b/a/b;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    iget-object v0, p0, Lcom/facebook/b/a/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/b/a/b;->e:Lcom/facebook/base/j;

    invoke-virtual {v1}, Lcom/facebook/base/j;->getPermission()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 176
    return-void
.end method

.method private b(Landroid/content/Intent;)Lcom/google/common/d/a/s;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 179
    const-string v1, "com.facebook.orca.chatheads.EXTRA_LOGGED_IN_USER_ID"

    iget-object v0, p0, Lcom/facebook/b/a/b;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 181
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v8

    .line 182
    new-instance v3, Lcom/facebook/b/a/e;

    invoke-direct {v3, p0, v8}, Lcom/facebook/b/a/e;-><init>(Lcom/facebook/b/a/b;Lcom/google/common/d/a/ab;)V

    .line 190
    iget-object v0, p0, Lcom/facebook/b/a/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/b/a/b;->e:Lcom/facebook/base/j;

    invoke-virtual {v1}, Lcom/facebook/base/j;->getPermission()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    move-object v1, p1

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V

    .line 199
    return-object v8
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 106
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 107
    const-string v1, "com.facebook.orca.chatheads.EXTRA_THREAD_ID"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    const-string v1, "com.facebook.orca.chatheads.EXTRA_REASON"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    invoke-direct {p0, v0}, Lcom/facebook/b/a/b;->b(Landroid/content/Intent;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 128
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.chatheads.ACTION_CLEAR_ALL_UNREAD_THREADS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 129
    invoke-direct {p0, v0}, Lcom/facebook/b/a/b;->a(Landroid/content/Intent;)V

    .line 130
    return-void
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 94
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.chatheads.ACTION_NEW_MESSAGE_NOTIFICATION"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 95
    const-string v1, "com.facebook.orca.chatheads.EXTRA_MESSAGE_NOTIFIED"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 96
    invoke-direct {p0, v0}, Lcom/facebook/b/a/b;->a(Landroid/content/Intent;)V

    .line 97
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 100
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.chatheads.ACTION_POPUP_CHAT_HEAD"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 101
    const-string v1, "com.facebook.orca.chatheads.EXTRA_THREAD_ID"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 102
    invoke-direct {p0, v0}, Lcom/facebook/b/a/b;->a(Landroid/content/Intent;)V

    .line 103
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 133
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.chatheads.ACTION_SHOW_CHATHEADS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 134
    invoke-direct {p0, v0}, Lcom/facebook/b/a/b;->a(Landroid/content/Intent;)V

    .line 135
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 114
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.chatheads.ACTION_REMOVE_CHAT_HEAD"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 115
    const-string v1, "com.facebook.orca.chatheads.EXTRA_THREAD_ID"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    const-string v1, "com.facebook.orca.chatheads.EXTRA_REASON"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    invoke-direct {p0, v0}, Lcom/facebook/b/a/b;->b(Landroid/content/Intent;)Lcom/google/common/d/a/s;

    .line 118
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 144
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.chatheads.ACTION_HIDE_CHATHEADS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 145
    invoke-direct {p0, v0}, Lcom/facebook/b/a/b;->a(Landroid/content/Intent;)V

    .line 146
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 121
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.chatheads.ACTION_CLEAR_UNREAD_THREAD"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 122
    const-string v1, "com.facebook.orca.chatheads.EXTRA_THREAD_ID"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    const-string v1, "com.facebook.orca.chatheads.EXTRA_REASON"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    invoke-direct {p0, v0}, Lcom/facebook/b/a/b;->a(Landroid/content/Intent;)V

    .line 125
    return-void
.end method

.method public d()Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 152
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    .line 153
    iget-object v1, p0, Lcom/facebook/b/a/b;->f:Lcom/facebook/common/w/q;

    invoke-virtual {v1}, Lcom/facebook/common/w/q;->isSet()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 154
    iget-object v1, p0, Lcom/facebook/b/a/b;->f:Lcom/facebook/common/w/q;

    invoke-virtual {v1}, Lcom/facebook/common/w/q;->asBoolean()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 170
    :goto_0
    return-object v0

    .line 156
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.orca.chatheads.ACTION_QUERY_CHATHEADS_ENABLED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 157
    invoke-direct {p0, v1}, Lcom/facebook/b/a/b;->b(Landroid/content/Intent;)Lcom/google/common/d/a/s;

    move-result-object v1

    .line 158
    new-instance v2, Lcom/facebook/b/a/d;

    invoke-direct {v2, p0, v0}, Lcom/facebook/b/a/d;-><init>(Lcom/facebook/b/a/b;Lcom/google/common/d/a/ab;)V

    invoke-static {v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method
