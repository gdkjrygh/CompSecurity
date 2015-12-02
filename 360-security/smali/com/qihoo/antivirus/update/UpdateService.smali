.class public Lcom/qihoo/antivirus/update/UpdateService;
.super Landroid/app/Service;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/antivirus/update/UpdateService$a;,
        Lcom/qihoo/antivirus/update/UpdateService$b;
    }
.end annotation


# static fields
.field static a:Z

.field static volatile b:I

.field static volatile c:Ljava/lang/String;

.field static volatile d:Ljava/lang/String;

.field static volatile e:Ljava/lang/String;

.field static volatile f:Z

.field static final g:Landroid/os/Handler;

.field private static h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/UpdateService$a;",
            ">;"
        }
    .end annotation
.end field

.field private static i:Lcom/qihoo/antivirus/update/d;

.field private static j:Lcom/qihoo/antivirus/update/ai;

.field private static k:Landroid/content/Context;

.field private static m:Ljava/lang/String;

.field private static n:I


# instance fields
.field private l:Lcom/qihoo/antivirus/update/UpdateService$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 36
    sput-boolean v2, Lcom/qihoo/antivirus/update/UpdateService;->a:Z

    .line 37
    sput v2, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    .line 38
    sput-object v1, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    .line 39
    sput-object v1, Lcom/qihoo/antivirus/update/UpdateService;->d:Ljava/lang/String;

    .line 40
    sput-object v1, Lcom/qihoo/antivirus/update/UpdateService;->e:Ljava/lang/String;

    .line 41
    sput-boolean v2, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    .line 45
    sput-object v1, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    .line 46
    sput-object v1, Lcom/qihoo/antivirus/update/UpdateService;->j:Lcom/qihoo/antivirus/update/ai;

    .line 48
    sput-object v1, Lcom/qihoo/antivirus/update/UpdateService;->k:Landroid/content/Context;

    .line 76
    sput-object v1, Lcom/qihoo/antivirus/update/UpdateService;->m:Ljava/lang/String;

    .line 77
    sput v2, Lcom/qihoo/antivirus/update/UpdateService;->n:I

    .line 306
    new-instance v0, Lcom/qihoo/antivirus/update/UpdateService$1;

    invoke-direct {v0}, Lcom/qihoo/antivirus/update/UpdateService$1;-><init>()V

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->g:Landroid/os/Handler;

    .line 335
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/UpdateService;->l:Lcom/qihoo/antivirus/update/UpdateService$b;

    .line 15
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(ILjava/lang/String;I)V
    .locals 0

    .prologue
    .line 93
    invoke-static {p0, p1, p2}, Lcom/qihoo/antivirus/update/UpdateService;->b(ILjava/lang/String;I)V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 338
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 339
    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    .line 340
    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 341
    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/qihoo/antivirus/update/UpdateService$a;)V
    .locals 2

    .prologue
    .line 80
    const-string/jumbo v0, "local_pkg_version"

    iget-object v1, p1, Lcom/qihoo/antivirus/update/UpdateService$a;->c:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p1, Lcom/qihoo/antivirus/update/UpdateService$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 83
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    iget-object v1, p1, Lcom/qihoo/antivirus/update/UpdateService$a;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/antivirus/update/d;->a:Ljava/lang/String;

    .line 86
    :cond_0
    iget-object v0, p1, Lcom/qihoo/antivirus/update/UpdateService$a;->e:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->e:Ljava/lang/String;

    .line 87
    iget-object v0, p1, Lcom/qihoo/antivirus/update/UpdateService$a;->a:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    .line 88
    iget-object v0, p1, Lcom/qihoo/antivirus/update/UpdateService$a;->b:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->d:Ljava/lang/String;

    .line 89
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->m:Ljava/lang/String;

    .line 90
    const/4 v0, 0x0

    sput v0, Lcom/qihoo/antivirus/update/UpdateService;->n:I

    .line 91
    return-void
.end method

.method static synthetic a(Lcom/qihoo/antivirus/update/ai;)V
    .locals 0

    .prologue
    .line 46
    sput-object p0, Lcom/qihoo/antivirus/update/UpdateService;->j:Lcom/qihoo/antivirus/update/ai;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/antivirus/update/d;)V
    .locals 0

    .prologue
    .line 45
    sput-object p0, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    return-void
.end method

.method static synthetic b()I
    .locals 1

    .prologue
    .line 77
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->n:I

    return v0
.end method

.method private static b(ILjava/lang/String;I)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 94
    .line 95
    sget-object v3, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    monitor-enter v3

    .line 96
    :try_start_0
    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 101
    if-nez v4, :cond_1

    .line 95
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    if-eqz v0, :cond_0

    .line 153
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->k:Landroid/content/Context;

    const-class v2, Lcom/qihoo/antivirus/update/UpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 154
    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->k:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 156
    :cond_0
    return-void

    .line 103
    :cond_1
    if-ne v4, v0, :cond_2

    .line 104
    :try_start_1
    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 105
    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    .line 95
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 113
    :cond_2
    :try_start_2
    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 114
    if-nez p2, :cond_3

    .line 115
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    .line 116
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 117
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/UpdateService$a;

    .line 118
    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->k:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/qihoo/antivirus/update/UpdateService;->a(Landroid/content/Context;Lcom/qihoo/antivirus/update/UpdateService$a;)V

    .line 122
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->j:Lcom/qihoo/antivirus/update/ai;

    invoke-virtual {v0, v2}, Lcom/qihoo/antivirus/update/d;->a(Lcom/qihoo/antivirus/update/ac;)V

    move v0, v1

    .line 123
    goto :goto_0

    :cond_3
    if-ne p2, v0, :cond_5

    .line 127
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    move v0, v1

    .line 133
    goto :goto_0

    :cond_4
    move v2, v1

    .line 135
    :goto_1
    if-lt v2, v4, :cond_6

    :cond_5
    move v0, v1

    goto :goto_0

    .line 136
    :cond_6
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/UpdateService$a;

    .line 137
    iget-object v0, v0, Lcom/qihoo/antivirus/update/UpdateService$a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 139
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    :cond_7
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1
.end method

.method static synthetic c()Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method private d()V
    .locals 4

    .prologue
    .line 171
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->g:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 172
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 299
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 3

    .prologue
    .line 65
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 66
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/UpdateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->k:Landroid/content/Context;

    .line 67
    new-instance v0, Lcom/qihoo/antivirus/update/UpdateService$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/antivirus/update/UpdateService$b;-><init>(Lcom/qihoo/antivirus/update/UpdateService;Lcom/qihoo/antivirus/update/UpdateService$b;)V

    iput-object v0, p0, Lcom/qihoo/antivirus/update/UpdateService;->l:Lcom/qihoo/antivirus/update/UpdateService$b;

    .line 68
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 69
    const-string/jumbo v1, "com.qihoo.broadcast.UPDATE_STOP"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 70
    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->k:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/antivirus/update/UpdateService;->l:Lcom/qihoo/antivirus/update/UpdateService$b;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 72
    new-instance v0, Lcom/qihoo/antivirus/update/d;

    invoke-direct {v0, p0}, Lcom/qihoo/antivirus/update/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    .line 73
    new-instance v0, Lcom/qihoo/antivirus/update/ai;

    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    invoke-direct {v0, p0, v1}, Lcom/qihoo/antivirus/update/ai;-><init>(Landroid/content/Context;Lcom/qihoo/antivirus/update/d;)V

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->j:Lcom/qihoo/antivirus/update/ai;

    .line 74
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 160
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 164
    iget-object v0, p0, Lcom/qihoo/antivirus/update/UpdateService;->l:Lcom/qihoo/antivirus/update/UpdateService$b;

    if-eqz v0, :cond_0

    .line 165
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/antivirus/update/UpdateService;->l:Lcom/qihoo/antivirus/update/UpdateService$b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 167
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/UpdateService;->d()V

    .line 168
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 179
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 180
    if-nez p1, :cond_1

    .line 181
    const-string/jumbo v0, "UpdateService"

    const-string/jumbo v1, "Update service start without intent."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    :cond_0
    :goto_0
    return v7

    .line 185
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 186
    if-eqz v0, :cond_0

    .line 187
    const-string/jumbo v3, "com.qihoo.action.UPDATE_NOTICE_TIMEOUT"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 191
    sget-boolean v0, Lcom/qihoo/antivirus/update/UpdateService;->a:Z

    if-nez v0, :cond_0

    .line 192
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 193
    const/4 v1, 0x4

    iput v1, v0, Landroid/os/Message;->what:I

    .line 194
    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 199
    :cond_2
    const-string/jumbo v3, "com.qihoo.action.INTENT_EXTRA_UPDATE_TYPE"

    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 200
    if-lez v3, :cond_3

    .line 201
    sput v3, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    .line 207
    :cond_3
    const-string/jumbo v3, "com.qihoo.action.BEGIN_UPDATE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 209
    sget-object v3, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    monitor-enter v3

    .line 210
    :try_start_0
    new-instance v4, Lcom/qihoo/antivirus/update/UpdateService$a;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/qihoo/antivirus/update/UpdateService$a;-><init>(Lcom/qihoo/antivirus/update/UpdateService$a;)V

    .line 211
    const-string/jumbo v0, "com.qihoo.action.INTENT_EXTRA_LOCAL_VERSION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 212
    if-eqz v0, :cond_4

    .line 213
    iput-object v0, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->c:Ljava/lang/String;

    .line 216
    :cond_4
    const-string/jumbo v5, "com.qihoo.action.INTENT_EXTRA_REQ_PARAM"

    invoke-virtual {p1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 217
    if-eqz v5, :cond_5

    .line 218
    iput-object v5, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->d:Ljava/lang/String;

    .line 221
    :cond_5
    const-string/jumbo v6, "com.qihoo.action.INTENT_EXTRA_PRODUCT"

    invoke-virtual {p1, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->a:Ljava/lang/String;

    .line 222
    const-string/jumbo v6, "com.qihoo.action.INTENT_EXTRA_PERMISSION"

    invoke-virtual {p1, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->e:Ljava/lang/String;

    .line 223
    const-string/jumbo v6, "com.qihoo.action.INTENT_EXTRA_SERVER"

    invoke-virtual {p1, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 224
    if-eqz v6, :cond_6

    .line 225
    iput-object v6, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->b:Ljava/lang/String;

    .line 228
    :cond_6
    sget-object v6, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 229
    if-lez v6, :cond_a

    .line 231
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_9

    move v0, v2

    .line 240
    :goto_1
    if-nez v0, :cond_8

    .line 241
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    move v0, v1

    .line 209
    :goto_2
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    if-nez v0, :cond_0

    .line 275
    sput-boolean v2, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    .line 276
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->j:Lcom/qihoo/antivirus/update/ai;

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/d;->a(Lcom/qihoo/antivirus/update/ac;)V

    goto/16 :goto_0

    .line 231
    :cond_9
    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/UpdateService$a;

    .line 232
    iget-object v0, v0, Lcom/qihoo/antivirus/update/UpdateService$a;->a:Ljava/lang/String;

    iget-object v6, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v1

    .line 237
    goto :goto_1

    .line 248
    :cond_a
    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    if-eqz v0, :cond_b

    .line 253
    const-string/jumbo v1, "local_pkg_version"

    invoke-static {p0, v1, v0}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    :cond_b
    if-eqz v5, :cond_c

    .line 260
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    iput-object v5, v0, Lcom/qihoo/antivirus/update/d;->a:Ljava/lang/String;

    .line 263
    :cond_c
    iget-object v0, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->e:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->e:Ljava/lang/String;

    .line 264
    iget-object v0, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->a:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    .line 265
    iget-object v0, v4, Lcom/qihoo/antivirus/update/UpdateService$a;->b:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->d:Ljava/lang/String;

    .line 266
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/UpdateService;->m:Ljava/lang/String;

    .line 267
    const/4 v0, 0x0

    sput v0, Lcom/qihoo/antivirus/update/UpdateService;->n:I

    move v0, v2

    goto :goto_2

    .line 209
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 278
    :cond_d
    const-string/jumbo v3, "com.qihoo.action.BEGIN_UPGRADE_APP"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    const-string/jumbo v0, "extra_apk_merge"

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 284
    sput-boolean v1, Lcom/qihoo/antivirus/update/UpdateService;->a:Z

    .line 285
    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->j:Lcom/qihoo/antivirus/update/ai;

    iput-boolean v0, v1, Lcom/qihoo/antivirus/update/ai;->a:Z

    .line 286
    sput-boolean v2, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    .line 287
    sget-object v1, Lcom/qihoo/antivirus/update/UpdateService;->i:Lcom/qihoo/antivirus/update/d;

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->j:Lcom/qihoo/antivirus/update/ai;

    invoke-virtual {v1, v0, v2}, Lcom/qihoo/antivirus/update/d;->a(ZLcom/qihoo/antivirus/update/y;)V

    goto/16 :goto_0
.end method
