.class public Lcom/facebook/orca/notify/d;
.super Lcom/facebook/orca/notify/a;
.source "ChatHeadMessagingNotificationHandler.java"


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

.field private final b:Lcom/facebook/orca/notify/ak;

.field private final c:Landroid/app/KeyguardManager;

.field private final d:Lcom/facebook/orca/notify/at;

.field private final e:Lcom/facebook/b/a/b;

.field private final f:Lcom/facebook/i/a/a/f;

.field private final g:Lcom/facebook/common/hardware/q;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/orca/notify/ak;Landroid/app/KeyguardManager;Lcom/facebook/orca/notify/at;Lcom/facebook/b/a/b;Lcom/facebook/i/a/a/f;Lcom/facebook/common/hardware/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/orca/notify/ak;",
            "Landroid/app/KeyguardManager;",
            "Lcom/facebook/orca/notify/at;",
            "Lcom/facebook/b/a/b;",
            "Lcom/facebook/i/a/a/f;",
            "Lcom/facebook/common/hardware/q;",
            ")V"
        }
    .end annotation

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/notify/a;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/orca/notify/d;->a:Ljavax/inject/a;

    .line 38
    iput-object p2, p0, Lcom/facebook/orca/notify/d;->b:Lcom/facebook/orca/notify/ak;

    .line 39
    iput-object p3, p0, Lcom/facebook/orca/notify/d;->c:Landroid/app/KeyguardManager;

    .line 40
    iput-object p4, p0, Lcom/facebook/orca/notify/d;->d:Lcom/facebook/orca/notify/at;

    .line 41
    iput-object p5, p0, Lcom/facebook/orca/notify/d;->e:Lcom/facebook/b/a/b;

    .line 42
    iput-object p6, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    .line 43
    iput-object p7, p0, Lcom/facebook/orca/notify/d;->g:Lcom/facebook/common/hardware/q;

    .line 44
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->e:Lcom/facebook/b/a/b;

    invoke-virtual {v0, p1}, Lcom/facebook/b/a/b;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 193
    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->e:Lcom/facebook/b/a/b;

    invoke-virtual {v0}, Lcom/facebook/b/a/b;->a()V

    .line 197
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 189
    :goto_0
    return-void

    .line 188
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/notify/d;->b()V

    goto :goto_0
.end method

.method protected a(Lcom/facebook/orca/notify/ap;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 49
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v2

    .line 53
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    invoke-virtual {v2, v5}, Lcom/facebook/orca/notify/c;->a(Z)V

    .line 88
    :goto_0
    return-void

    .line 59
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    invoke-static {v1}, Lcom/facebook/messages/ipc/peer/d;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    invoke-virtual {v2, v5}, Lcom/facebook/orca/notify/c;->b(Z)V

    goto :goto_0

    .line 68
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    sget-object v4, Lcom/facebook/messages/ipc/peer/d;->d:Landroid/net/Uri;

    invoke-interface {v3, v4}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 70
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    invoke-static {v1}, Lcom/facebook/messages/ipc/peer/d;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-interface {v4, v1}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 73
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    .line 74
    invoke-virtual {v2, v5}, Lcom/facebook/orca/notify/c;->a(Z)V

    goto :goto_0

    .line 79
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->a:Landroid/net/Uri;

    invoke-interface {v0, v1}, Lcom/facebook/i/a/a/f;->b(Landroid/net/Uri;)Z

    move-result v0

    .line 81
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/notify/d;->g:Lcom/facebook/common/hardware/q;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/q;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 82
    invoke-virtual {v2, v5}, Lcom/facebook/orca/notify/c;->a(Z)V

    goto :goto_0

    .line 87
    :cond_3
    invoke-virtual {v2, v5}, Lcom/facebook/orca/notify/c;->b(Z)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    :goto_0
    return-void

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->e:Lcom/facebook/b/a/b;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/facebook/b/a/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected b(Lcom/facebook/orca/notify/ap;)V
    .locals 4

    .prologue
    .line 93
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    :cond_0
    :goto_0
    return-void

    .line 102
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    invoke-interface {v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->n:Landroid/net/Uri;

    invoke-interface {v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->c:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/notify/d;->d:Lcom/facebook/orca/notify/at;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/at;->a()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 120
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v0

    .line 122
    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->f()Z

    move-result v1

    if-nez v1, :cond_0

    .line 127
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->t()Z

    move-result v1

    if-nez v1, :cond_0

    .line 133
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    .line 135
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->d()Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    invoke-static {v1}, Lcom/facebook/messages/ipc/peer/d;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-interface {v3, v1}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/facebook/orca/notify/d;->f:Lcom/facebook/i/a/a/f;

    sget-object v3, Lcom/facebook/messages/ipc/peer/d;->n:Landroid/net/Uri;

    invoke-interface {v2, v3}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 142
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/notify/d;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 143
    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->g()V

    .line 147
    :cond_5
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 148
    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->b()Z

    move-result v1

    if-nez v1, :cond_6

    .line 149
    iget-object v1, p0, Lcom/facebook/orca/notify/d;->b:Lcom/facebook/orca/notify/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/ak;->a(Lcom/facebook/orca/notify/c;)V

    .line 151
    :cond_6
    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->d()Z

    move-result v1

    if-nez v1, :cond_0

    .line 152
    iget-object v1, p0, Lcom/facebook/orca/notify/d;->g:Lcom/facebook/common/hardware/q;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/q;->a()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 153
    iget-object v1, p0, Lcom/facebook/orca/notify/d;->b:Lcom/facebook/orca/notify/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/ak;->b(Lcom/facebook/orca/notify/c;)V

    goto/16 :goto_0

    .line 155
    :cond_7
    iget-object v1, p0, Lcom/facebook/orca/notify/d;->b:Lcom/facebook/orca/notify/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/ak;->c(Lcom/facebook/orca/notify/c;)V

    goto/16 :goto_0
.end method

.method protected b(Lcom/facebook/orca/notify/bi;)V
    .locals 4

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/orca/notify/d;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    :cond_0
    return-void

    .line 167
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/notify/bi;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 168
    iget-object v2, p0, Lcom/facebook/orca/notify/d;->e:Lcom/facebook/b/a/b;

    const-string v3, "read_on_web"

    invoke-virtual {v2, v0, v3}, Lcom/facebook/b/a/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
