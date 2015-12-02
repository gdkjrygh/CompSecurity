.class public Lcom/facebook/orca/sms/MmsTransactionStateReceiver;
.super Landroid/app/IntentService;
.source "MmsTransactionStateReceiver.java"


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
.field private b:Lcom/facebook/orca/sms/bm;

.field private c:Lcom/facebook/orca/sms/r;

.field private d:Lcom/facebook/orca/push/b;

.field private e:Lcom/facebook/orca/sms/af;

.field private f:Lcom/facebook/orca/f/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;

    sput-object v0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    const-string v0, "MmsTransactionStateReceiver"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 34
    return-void
.end method

.method private a(J)V
    .locals 7

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->c:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/sms/r;->a(J)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->e:Lcom/facebook/orca/sms/af;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p1, p2, v3}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;JZ)V

    .line 112
    if-eqz v0, :cond_0

    .line 113
    iget-object v1, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->f:Lcom/facebook/orca/f/o;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->s()J

    move-result-wide v3

    const-wide/16 v5, 0x1

    sub-long/2addr v3, v5

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/orca/f/o;->a(Ljava/lang/String;J)V

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 115
    new-instance v2, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v2}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v2, v0}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/facebook/messages/model/threads/e;->d(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    .line 119
    iget-object v3, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->d:Lcom/facebook/orca/push/b;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Lcom/facebook/push/g;->MMS:Lcom/facebook/push/g;

    invoke-virtual {v3, v1, v0, v2, v4}, Lcom/facebook/orca/push/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    .line 123
    :goto_0
    return-void

    .line 121
    :cond_0
    sget-object v0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find specified Mms Message with the id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 56
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/bm;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/bm;

    .line 58
    iget-object v0, v0, Lcom/facebook/orca/sms/bm;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->a()V

    .line 60
    const-class v0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 61
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 62
    return-void
.end method

.method private a(Landroid/net/Uri;Landroid/net/Uri;)Z
    .locals 2

    .prologue
    .line 106
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private b(J)V
    .locals 3

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->c:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/sms/r;->a(J)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 127
    iget-object v1, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->e:Lcom/facebook/orca/sms/af;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p1, p2, v2}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;JZ)V

    .line 128
    return-void
.end method

.method private b(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    .line 81
    sget-object v0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->a:Ljava/lang/Class;

    const-string v1, "Received onMessage"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 83
    const-string v0, "uri"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 84
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 85
    const-string v3, "state"

    const/4 v4, 0x0

    invoke-virtual {p2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 86
    if-eqz v0, :cond_0

    .line 87
    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 88
    sget-object v3, Landroid_src/c/f;->a:Landroid/net/Uri;

    invoke-direct {p0, v0, v3}, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->a(Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->a(J)V

    .line 97
    :cond_0
    :goto_0
    return-void

    .line 91
    :cond_1
    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    .line 92
    sget-object v3, Landroid_src/c/f;->a:Landroid/net/Uri;

    invoke-direct {p0, v0, v3}, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->a(Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->b(J)V

    goto :goto_0
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .prologue
    .line 38
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 40
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 41
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 42
    const-class v0, Lcom/facebook/orca/sms/bm;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/bm;

    iput-object v0, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->b:Lcom/facebook/orca/sms/bm;

    .line 44
    const-class v0, Lcom/facebook/orca/sms/r;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/r;

    iput-object v0, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->c:Lcom/facebook/orca/sms/r;

    .line 45
    const-class v0, Lcom/facebook/orca/push/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/push/b;

    iput-object v0, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->d:Lcom/facebook/orca/push/b;

    .line 46
    const-class v0, Lcom/facebook/orca/sms/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/af;

    iput-object v0, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->e:Lcom/facebook/orca/sms/af;

    .line 47
    const-class v0, Lcom/facebook/orca/f/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/o;

    iput-object v0, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->f:Lcom/facebook/orca/f/o;

    .line 48
    return-void
.end method

.method public final onHandleIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 67
    :try_start_0
    invoke-direct {p0, p0, p1}, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->b(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    iget-object v0, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->b:Lcom/facebook/orca/sms/bm;

    iget-object v0, v0, Lcom/facebook/orca/sms/bm;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->b()V

    .line 77
    return-void

    .line 75
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/orca/sms/MmsTransactionStateReceiver;->b:Lcom/facebook/orca/sms/bm;

    iget-object v1, v1, Lcom/facebook/orca/sms/bm;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/o;->b()V

    throw v0
.end method
