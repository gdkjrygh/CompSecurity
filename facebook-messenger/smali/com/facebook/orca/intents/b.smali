.class public Lcom/facebook/orca/intents/b;
.super Ljava/lang/Object;
.source "IntentHandler.java"


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
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/user/i;

.field private final d:Lcom/facebook/auth/b/b;

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

.field private final g:Lcom/facebook/c/s;

.field private final h:Landroid/content/ComponentName;

.field private final i:Lcom/facebook/b/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/orca/intents/b;

    sput-object v0, Lcom/facebook/orca/intents/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/user/i;Lcom/facebook/auth/b/b;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/c/s;Landroid/content/ComponentName;Lcom/facebook/b/a/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/user/i;",
            "Lcom/facebook/auth/b/b;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/c/s;",
            "Landroid/content/ComponentName;",
            "Lcom/facebook/b/a/b;",
            ")V"
        }
    .end annotation

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    .line 67
    iput-object p2, p0, Lcom/facebook/orca/intents/b;->c:Lcom/facebook/user/i;

    .line 68
    iput-object p3, p0, Lcom/facebook/orca/intents/b;->d:Lcom/facebook/auth/b/b;

    .line 69
    iput-object p4, p0, Lcom/facebook/orca/intents/b;->e:Ljavax/inject/a;

    .line 70
    iput-object p5, p0, Lcom/facebook/orca/intents/b;->f:Ljavax/inject/a;

    .line 71
    iput-object p6, p0, Lcom/facebook/orca/intents/b;->g:Lcom/facebook/c/s;

    .line 72
    iput-object p7, p0, Lcom/facebook/orca/intents/b;->h:Landroid/content/ComponentName;

    .line 73
    iput-object p8, p0, Lcom/facebook/orca/intents/b;->i:Lcom/facebook/b/a/b;

    .line 74
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/intents/b;Ljava/lang/String;ZLjava/lang/String;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/intents/b;->a(Ljava/lang/String;ZLjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;ZLjava/lang/String;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 183
    if-eqz p2, :cond_0

    .line 184
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 185
    iget-object v1, p0, Lcom/facebook/orca/intents/b;->h:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 186
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 190
    :goto_0
    const-string v1, "thread_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 191
    const-string v1, "trigger"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 192
    return-object v0

    .line 188
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 167
    const-string v0, "from_notification"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    const-string v0, "from_notification"

    const-string v1, "from_notification"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 173
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_1

    .line 174
    invoke-virtual {p2}, Landroid/content/Intent;->getFlags()I

    move-result v0

    const/high16 v1, 0x10000000

    or-int/2addr v0, v1

    .line 175
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 177
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/intents/b;->g:Lcom/facebook/c/s;

    iget-object v1, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    invoke-virtual {v0, p2, v1}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 178
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Intent;Ljava/lang/String;ZLjava/lang/String;)Lcom/google/common/d/a/s;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 137
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v6

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/intents/b;->i:Lcom/facebook/b/a/b;

    const-string v1, "from_notification"

    invoke-virtual {v0, p2, v1}, Lcom/facebook/b/a/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/d/a/s;

    move-result-object v7

    .line 141
    new-instance v0, Lcom/facebook/orca/intents/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/intents/c;-><init>(Lcom/facebook/orca/intents/b;Landroid/content/Intent;Ljava/lang/String;ZLjava/lang/String;Lcom/google/common/d/a/ab;)V

    invoke-static {v7, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 162
    return-object v6
.end method

.method static synthetic a(Lcom/facebook/orca/intents/b;Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Lcom/google/common/d/a/s;
    .locals 8
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
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 77
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 80
    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v3

    .line 81
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    .line 83
    const-string v4, "modify_backstack_override"

    invoke-virtual {p1, v4, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 87
    iget-object v5, p0, Lcom/facebook/orca/intents/b;->d:Lcom/facebook/auth/b/b;

    invoke-interface {v5}, Lcom/facebook/auth/b/b;->b()Z

    move-result v5

    if-nez v5, :cond_1

    .line 88
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/auth/StartScreenActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    .line 128
    :cond_0
    :goto_0
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    :goto_1
    return-object v0

    .line 89
    :cond_1
    const-string v5, "smsto"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "sms"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "mmsto"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "mms"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 91
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/intents/b;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/intents/b;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 92
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/intents/CanonicalThreadHandler;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 93
    const-string v1, "user_key"

    iget-object v2, p0, Lcom/facebook/orca/intents/b;->c:Lcom/facebook/user/i;

    invoke-virtual {v2, v3}, Lcom/facebook/user/i;->d(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 94
    const-string v1, "use_thread_list"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 95
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    goto :goto_0

    .line 97
    :cond_3
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/auth/StartScreenActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    goto :goto_0

    .line 99
    :cond_4
    const-string v2, "thread"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v7, :cond_7

    .line 100
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 101
    const-string v1, "trigger"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 102
    const-string v2, "prefer_chat_if_possible"

    invoke-virtual {p1, v2, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 103
    iget-object v2, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    instance-of v2, v2, Landroid/app/Activity;

    if-eqz v2, :cond_6

    .line 104
    sget-object v2, Lcom/facebook/orca/intents/b;->a:Ljava/lang/Class;

    const-string v3, "To view a thread in a chat head, use startService."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 109
    :cond_5
    invoke-direct {p0, v0, v4, v1}, Lcom/facebook/orca/intents/b;->a(Ljava/lang/String;ZLjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 110
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto/16 :goto_1

    .line 106
    :cond_6
    invoke-direct {p0, p1, v0, v4, v1}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Ljava/lang/String;ZLjava/lang/String;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto/16 :goto_1

    .line 111
    :cond_7
    const-string v2, "threads"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 112
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 113
    iget-object v1, p0, Lcom/facebook/orca/intents/b;->h:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 114
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 115
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto/16 :goto_1

    .line 116
    :cond_8
    const-string v2, "settings"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 117
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 118
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto/16 :goto_1

    .line 119
    :cond_9
    const-string v2, "user"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v7, :cond_0

    .line 120
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/orca/intents/b;->b:Landroid/content/Context;

    const-class v3, Lcom/facebook/orca/intents/CanonicalThreadHandler;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 121
    const-string v2, "user_key"

    new-instance v3, Lcom/facebook/user/UserKey;

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v3, v5, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    const-string v0, "use_thread_list"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 125
    invoke-direct {p0, p1, v1}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    goto/16 :goto_0
.end method
