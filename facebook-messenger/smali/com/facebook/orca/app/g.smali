.class public Lcom/facebook/orca/app/g;
.super Ljava/lang/Object;
.source "MessagesActivityBroadcaster.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/c/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/c/j;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/facebook/orca/app/g;->a:Landroid/content/Context;

    .line 43
    iput-object p2, p0, Lcom/facebook/orca/app/g;->b:Lcom/facebook/c/j;

    .line 44
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/orca/app/g;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/app/g;->b:Lcom/facebook/c/j;

    iget-object v1, p0, Lcom/facebook/orca/app/g;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/c/j;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 109
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 87
    const-wide/16 v0, -0x1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;Ljava/lang/String;J)V

    .line 88
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    .prologue
    .line 91
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 92
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    const-string v1, "threadid"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 94
    const-wide/16 v1, -0x1

    cmp-long v1, p3, v1

    if-eqz v1, :cond_0

    .line 95
    const-string v1, "actionid"

    invoke-virtual {v0, v1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 97
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/app/g;->a(Landroid/content/Intent;)V

    .line 98
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 47
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 48
    const-string v1, "com.facebook.orca.ACTION_SMS_ENABLED_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    invoke-direct {p0, v0}, Lcom/facebook/orca/app/g;->a(Landroid/content/Intent;)V

    .line 50
    return-void
.end method

.method public a(Lcom/facebook/user/UserIdentifierKey;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 57
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 58
    const-string v1, "com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    const-string v1, "user_identifier_key"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 60
    if-eqz p2, :cond_0

    .line 61
    const-string v1, "new_threadid"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/app/g;->a(Landroid/content/Intent;)V

    .line 64
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 53
    const-string v0, "com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method public a(Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 67
    const-string v0, "com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI"

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;Ljava/lang/String;J)V

    .line 68
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/common/a/fi;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 71
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 72
    const-string v1, "com.facebook.orca.ACTION_DELETED_MESSAGES_FOR_UI"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    const-string v1, "threadid"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    const-string v1, "message_ids"

    invoke-virtual {p2}, Lcom/google/common/a/fi;->h()Lcom/google/common/a/es;

    move-result-object v2

    invoke-static {v2}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 75
    invoke-direct {p0, v0}, Lcom/facebook/orca/app/g;->a(Landroid/content/Intent;)V

    .line 76
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 79
    const-string v0, "com.facebook.orca.ACTION_READ_THREAD_FOR_UI"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 83
    const-string v0, "com.facebook.orca.ACTION_REMOVED_THREAD_FOR_UI"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    return-void
.end method
