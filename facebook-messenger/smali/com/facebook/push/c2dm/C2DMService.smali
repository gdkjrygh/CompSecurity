.class public Lcom/facebook/push/c2dm/C2DMService;
.super Landroid/app/IntentService;
.source "C2DMService.java"


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
.field private b:Lcom/facebook/push/c2dm/C2DMRegistrar;

.field private c:Lcom/facebook/push/c2dm/m;

.field private d:Lcom/facebook/prefs/shared/d;

.field private e:Lcom/facebook/analytics/cn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/push/c2dm/C2DMService;

    sput-object v0, Lcom/facebook/push/c2dm/C2DMService;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 54
    const-string v0, "C2DMReceiver"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 55
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 159
    sget-object v1, Lcom/facebook/push/c2dm/c;->g:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 160
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 161
    return-void
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->e:Lcom/facebook/analytics/cn;

    sget-object v1, Lcom/facebook/push/h;->C2DM:Lcom/facebook/push/h;

    invoke-virtual {v1}, Lcom/facebook/push/h;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "gcm_deleted_messages"

    invoke-virtual {v0, v1, v2, p1}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;Ljava/lang/String;I)V

    .line 168
    return-void
.end method

.method static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 69
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 70
    const-class v1, Lcom/facebook/push/c2dm/m;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/m;

    .line 77
    iget-object v1, v0, Lcom/facebook/push/c2dm/m;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/o;->a()V

    .line 79
    :try_start_0
    const-class v1, Lcom/facebook/push/c2dm/C2DMService;

    invoke-virtual {p1, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 80
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 81
    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 83
    :goto_0
    if-nez v1, :cond_0

    .line 84
    iget-object v0, v0, Lcom/facebook/push/c2dm/m;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->b()V

    .line 85
    sget-object v0, Lcom/facebook/push/c2dm/C2DMService;->a:Ljava/lang/Class;

    const-string v1, "Failed to start service"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 88
    :cond_0
    return-void

    .line 81
    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 83
    :catchall_0
    move-exception v1

    .line 84
    iget-object v0, v0, Lcom/facebook/push/c2dm/m;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->b()V

    .line 85
    sget-object v0, Lcom/facebook/push/c2dm/C2DMService;->a:Ljava/lang/Class;

    const-string v2, "Failed to start service"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    throw v1
.end method

.method private a(Landroid/content/Intent;)V
    .locals 6

    .prologue
    .line 128
    const-string v0, "registration_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 129
    const-string v0, "error"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 130
    const-string v0, "unregistered"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 132
    const/4 v3, 0x3

    invoke-static {v3}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 133
    sget-object v3, Lcom/facebook/push/c2dm/C2DMService;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "dmControl: registrationId = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", error = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", removed = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 137
    :cond_0
    iget-object v3, p0, Lcom/facebook/push/c2dm/C2DMService;->b:Lcom/facebook/push/c2dm/C2DMRegistrar;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v3, v1, v2, v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 138
    return-void

    .line 137
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 141
    sget-object v0, Lcom/facebook/push/c2dm/C2DMService;->a:Ljava/lang/Class;

    const-string v1, "Received handleMessage"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 143
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 144
    if-eqz v0, :cond_0

    .line 145
    const-string v1, "message_type"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 146
    const-string v2, "deleted_messages"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 147
    const-string v1, "total_deleted"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 148
    invoke-direct {p0, v0}, Lcom/facebook/push/c2dm/C2DMService;->a(I)V

    .line 155
    :cond_0
    :goto_0
    return-void

    .line 149
    :cond_1
    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 150
    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMService;->a()V

    .line 151
    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 152
    sget-object v1, Lcom/facebook/push/g;->C2DM:Lcom/facebook/push/g;

    invoke-static {p0, v0, v1}, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->a(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/push/g;)V

    goto :goto_0
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .prologue
    .line 92
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 94
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 95
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 96
    const-class v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    iput-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->b:Lcom/facebook/push/c2dm/C2DMRegistrar;

    .line 97
    const-class v0, Lcom/facebook/push/c2dm/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/m;

    iput-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->c:Lcom/facebook/push/c2dm/m;

    .line 99
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->d:Lcom/facebook/prefs/shared/d;

    .line 100
    const-class v0, Lcom/facebook/analytics/cn;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cn;

    iput-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->e:Lcom/facebook/analytics/cn;

    .line 101
    return-void
.end method

.method public final onHandleIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 106
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-nez v0, :cond_1

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->c:Lcom/facebook/push/c2dm/m;

    iget-object v0, v0, Lcom/facebook/push/c2dm/m;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->b()V

    .line 125
    :goto_0
    return-void

    .line 109
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.android.c2dm.intent.REGISTRATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 110
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/C2DMService;->a(Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->c:Lcom/facebook/push/c2dm/m;

    iget-object v0, v0, Lcom/facebook/push/c2dm/m;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->b()V

    goto :goto_0

    .line 111
    :cond_3
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.android.c2dm.intent.RECEIVE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 112
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/C2DMService;->b(Landroid/content/Intent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 123
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMService;->c:Lcom/facebook/push/c2dm/m;

    iget-object v1, v1, Lcom/facebook/push/c2dm/m;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/o;->b()V

    throw v0

    .line 113
    :cond_4
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.android.c2dm.intent.RETRY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 114
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMService;->b:Lcom/facebook/push/c2dm/C2DMRegistrar;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method
