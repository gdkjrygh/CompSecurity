.class public Lcom/qihoo/security/service/ProcessClearService;
.super Landroid/app/Service;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 3

    .prologue
    .line 99
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 100
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "action_init_engine"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 101
    const-class v2, Lcom/qihoo/security/service/ProcessClearService;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 102
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 103
    return-void
.end method

.method public static a(Lcom/qihoo360/mobilesafe/service/KillBean;)V
    .locals 1

    .prologue
    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 80
    if-eqz p0, :cond_0

    .line 81
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    :cond_0
    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->b(Ljava/util/List;)V

    .line 84
    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    if-eqz p0, :cond_0

    .line 69
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 71
    :cond_0
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    .line 72
    new-instance v2, Landroid/content/Intent;

    const-string/jumbo v3, "action_set_data"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 73
    const-class v3, Lcom/qihoo/security/service/ProcessClearService;

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 74
    const-string/jumbo v3, "data"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 75
    invoke-virtual {v1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 76
    return-void
.end method

.method public static b()V
    .locals 3

    .prologue
    .line 106
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 107
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "action_release_engine"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 108
    const-class v2, Lcom/qihoo/security/service/ProcessClearService;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 109
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 110
    return-void
.end method

.method public static b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 88
    if-eqz p0, :cond_0

    .line 89
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 91
    :cond_0
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    .line 92
    new-instance v2, Landroid/content/Intent;

    const-string/jumbo v3, "action_remove_data"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 93
    const-class v3, Lcom/qihoo/security/service/ProcessClearService;

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 94
    const-string/jumbo v3, "data"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 95
    invoke-virtual {v1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 96
    return-void
.end method

.method public static c()V
    .locals 3

    .prologue
    .line 113
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 114
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "action_clear"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 115
    const-class v2, Lcom/qihoo/security/service/ProcessClearService;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 116
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 117
    return-void
.end method

.method public static d()V
    .locals 3

    .prologue
    .line 120
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 121
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "action_get_data_size"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 122
    const-class v2, Lcom/qihoo/security/service/ProcessClearService;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 123
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 124
    return-void
.end method

.method public static e()V
    .locals 3

    .prologue
    .line 127
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 128
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "action_get_pre_data_size"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 129
    const-class v2, Lcom/qihoo/security/service/ProcessClearService;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 130
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 131
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    return-object v0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .prologue
    .line 35
    if-eqz p1, :cond_0

    .line 36
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    .line 39
    const-string/jumbo v2, "action_set_data"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 40
    const-string/jumbo v0, "data"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 41
    invoke-static {v1}, Lcom/qihoo/security/opti/b/c;->a(Landroid/content/Context;)Lcom/qihoo/security/opti/b/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/b/c;->a(Ljava/util/List;)V

    .line 62
    :cond_0
    :goto_0
    invoke-virtual {p0, p3}, Lcom/qihoo/security/service/ProcessClearService;->stopSelf(I)V

    .line 63
    const/4 v0, 0x2

    return v0

    .line 42
    :cond_1
    const-string/jumbo v2, "action_remove_data"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 43
    invoke-static {v1}, Lcom/qihoo/security/opti/b/c;->a(Landroid/content/Context;)Lcom/qihoo/security/opti/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/c;->c()Ljava/util/List;

    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    const-string/jumbo v0, "data"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 46
    invoke-interface {v2, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 48
    :cond_2
    invoke-static {v1}, Lcom/qihoo/security/opti/b/c;->a(Landroid/content/Context;)Lcom/qihoo/security/opti/b/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/b/c;->a(Ljava/util/List;)V

    goto :goto_0

    .line 49
    :cond_3
    const-string/jumbo v2, "action_get_data_size"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string/jumbo v2, "action_get_pre_data_size"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 50
    :cond_4
    invoke-static {v1}, Lcom/qihoo/security/opti/b/c;->a(Landroid/content/Context;)Lcom/qihoo/security/opti/b/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/opti/b/c;->d()J

    move-result-wide v2

    .line 51
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 52
    const-string/jumbo v0, "size"

    invoke-virtual {v4, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 53
    invoke-virtual {v1, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 54
    :cond_5
    const-string/jumbo v2, "action_init_engine"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 55
    invoke-static {v1}, Lcom/qihoo/security/opti/b/c;->a(Landroid/content/Context;)Lcom/qihoo/security/opti/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/c;->a()V

    goto :goto_0

    .line 56
    :cond_6
    const-string/jumbo v2, "action_release_engine"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 57
    invoke-static {v1}, Lcom/qihoo/security/opti/b/c;->a(Landroid/content/Context;)Lcom/qihoo/security/opti/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/c;->b()V

    goto :goto_0

    .line 58
    :cond_7
    const-string/jumbo v2, "action_clear"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    invoke-static {v1}, Lcom/qihoo/security/opti/b/c;->a(Landroid/content/Context;)Lcom/qihoo/security/opti/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/c;->e()V

    goto/16 :goto_0
.end method
