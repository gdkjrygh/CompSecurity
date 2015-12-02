.class public Lcom/qihoo/security/service/SecurityService;
.super Landroid/app/Service;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/clearengine/b/a$a;
.implements Lcom/qihoo/security/notify/c$a;
.implements Lcom/qihoo/security/receiver/CommonReceiver$a;
.implements Lcom/qihoo/security/receiver/PackageMonitor$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/service/SecurityService$b;,
        Lcom/qihoo/security/service/SecurityService$a;
    }
.end annotation


# static fields
.field public static a:Z


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private B:Lcom/qihoo/security/opti/trashclear/service/e;

.field private C:Lcom/qihoo/utils/notice/b;

.field private D:Lcom/qihoo/security/app/c;

.field private E:Lcom/qihoo360/mobilesafe/core/d/b;

.field private final F:Landroid/content/BroadcastReceiver;

.field private final G:Lcom/qihoo/security/service/a$a;

.field private H:Landroid/os/Handler;

.field private I:Ljava/lang/String;

.field private final J:Lcom/qihoo/security/locale/b$a;

.field private b:Lcom/qihoo360/mobilesafe/support/a/b$a;

.field private c:Lcom/qihoo/security/floatview/a/a;

.field private d:Landroid/content/Context;

.field private e:Lcom/qihoo/security/notify/b;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Lcom/qihoo/security/service/SecurityService$b;

.field private l:Lcom/qihoo/security/service/SecurityService$a;

.field private m:Landroid/app/ActivityManager;

.field private n:Landroid/app/KeyguardManager;

.field private o:I

.field private p:I

.field private q:J

.field private r:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList",
            "<",
            "Lcom/qihoo/security/service/b;",
            ">;"
        }
    .end annotation
.end field

.field private s:I

.field private t:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList",
            "<",
            "Lcom/qihoo/security/service/c;",
            ">;"
        }
    .end annotation
.end field

.field private u:I

.field private v:Lcom/qihoo/security/receiver/PackageMonitor;

.field private w:Lcom/qihoo/security/receiver/CommonReceiver;

.field private x:Lcom/qihoo360/mobilesafe/core/c;

.field private y:Lcom/qihoo/security/notify/a;

.field private final z:Lcom/qihoo/security/locale/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/service/SecurityService;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 77
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 90
    iput-object v1, p0, Lcom/qihoo/security/service/SecurityService;->b:Lcom/qihoo360/mobilesafe/support/a/b$a;

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/service/SecurityService;->f:Z

    .line 147
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->z:Lcom/qihoo/security/locale/d;

    .line 194
    new-instance v0, Lcom/qihoo/security/service/SecurityService$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/service/SecurityService$1;-><init>(Lcom/qihoo/security/service/SecurityService;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->F:Landroid/content/BroadcastReceiver;

    .line 1018
    new-instance v0, Lcom/qihoo/security/service/SecurityService$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/service/SecurityService$2;-><init>(Lcom/qihoo/security/service/SecurityService;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->G:Lcom/qihoo/security/service/a$a;

    .line 1131
    iput-object v1, p0, Lcom/qihoo/security/service/SecurityService;->I:Ljava/lang/String;

    .line 1203
    new-instance v0, Lcom/qihoo/security/service/SecurityService$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/service/SecurityService$4;-><init>(Lcom/qihoo/security/service/SecurityService;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->J:Lcom/qihoo/security/locale/b$a;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService;I)I
    .locals 0

    .prologue
    .line 77
    iput p1, p0, Lcom/qihoo/security/service/SecurityService;->u:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService;J)J
    .locals 1

    .prologue
    .line 77
    iput-wide p1, p0, Lcom/qihoo/security/service/SecurityService;->q:J

    return-wide p1
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->r:Landroid/os/RemoteCallbackList;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService;Lcom/qihoo360/mobilesafe/core/d/b;)Lcom/qihoo360/mobilesafe/core/d/b;
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService;->E:Lcom/qihoo360/mobilesafe/core/d/b;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService;->A:Ljava/util/List;

    return-object p1
.end method

.method private final a(Landroid/os/Message;)V
    .locals 6

    .prologue
    .line 1141
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1146
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->H:Landroid/os/Handler;

    monitor-enter v1

    .line 1147
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->I:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 1151
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->I:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1155
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1188
    :goto_0
    return-void

    .line 1162
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->H:Landroid/os/Handler;

    const-wide/16 v4, 0x3a98

    invoke-virtual {v2, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1167
    :goto_1
    :try_start_2
    invoke-direct {p0, v0}, Lcom/qihoo/security/service/SecurityService;->d(Ljava/lang/String;)V

    .line 1169
    monitor-exit v1

    goto :goto_0

    .line 1186
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1172
    :cond_1
    :try_start_3
    const-string/jumbo v2, "sp_key_last_cq_locale"

    const-string/jumbo v3, ""

    invoke-static {p0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1175
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1180
    invoke-direct {p0, v0}, Lcom/qihoo/security/service/SecurityService;->d(Ljava/lang/String;)V

    .line 1186
    :cond_2
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 1164
    :catch_0
    move-exception v2

    goto :goto_1
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0, p1}, Lcom/qihoo/security/service/SecurityService;->a(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService;Z)Z
    .locals 0

    .prologue
    .line 77
    iput-boolean p1, p0, Lcom/qihoo/security/service/SecurityService;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/service/SecurityService;)I
    .locals 2

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/service/SecurityService;->s:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/service/SecurityService;->s:I

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/service/SecurityService;I)I
    .locals 0

    .prologue
    .line 77
    iput p1, p0, Lcom/qihoo/security/service/SecurityService;->s:I

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/service/SecurityService;Z)Z
    .locals 0

    .prologue
    .line 77
    iput-boolean p1, p0, Lcom/qihoo/security/service/SecurityService;->i:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/service/SecurityService;I)I
    .locals 0

    .prologue
    .line 77
    iput p1, p0, Lcom/qihoo/security/service/SecurityService;->o:I

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->k:Lcom/qihoo/security/service/SecurityService$b;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/service/SecurityService;Z)Z
    .locals 0

    .prologue
    .line 77
    iput-boolean p1, p0, Lcom/qihoo/security/service/SecurityService;->j:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/service/SecurityService;)I
    .locals 2

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/service/SecurityService;->s:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/qihoo/security/service/SecurityService;->s:I

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/service/SecurityService;I)I
    .locals 0

    .prologue
    .line 77
    iput p1, p0, Lcom/qihoo/security/service/SecurityService;->p:I

    return p1
.end method

.method private d()V
    .locals 0

    .prologue
    .line 316
    return-void
.end method

.method private final d(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1135
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService;->I:Ljava/lang/String;

    .line 1136
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-static {v0, v1, v2, p1, p0}, Lcom/qihoo/security/clearengine/b/a;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Lcom/qihoo/security/clearengine/b/a$a;)V

    .line 1138
    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/service/SecurityService;)Landroid/os/RemoteCallbackList;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->t:Landroid/os/RemoteCallbackList;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 473
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    .line 475
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    .line 476
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-static {p0, v2, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 477
    invoke-virtual {v0, p0, v3, v3, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 478
    const/16 v1, 0x100

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/service/SecurityService;->startForeground(ILandroid/app/Notification;)V

    .line 485
    :goto_0
    return-void

    .line 480
    :cond_0
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    .line 481
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-static {p0, v2, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 482
    invoke-virtual {v0, p0, v3, v3, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 483
    invoke-virtual {p0, v2, v0}, Lcom/qihoo/security/service/SecurityService;->startForeground(ILandroid/app/Notification;)V

    goto :goto_0
.end method

.method static synthetic f(Lcom/qihoo/security/service/SecurityService;)I
    .locals 2

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/service/SecurityService;->u:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/service/SecurityService;->u:I

    return v0
.end method

.method private final f()V
    .locals 2

    .prologue
    .line 1191
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "CQThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 1192
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 1193
    new-instance v1, Lcom/qihoo/security/service/SecurityService$3;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/service/SecurityService$3;-><init>(Lcom/qihoo/security/service/SecurityService;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo/security/service/SecurityService;->H:Landroid/os/Handler;

    .line 1201
    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/service/SecurityService;)I
    .locals 2

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/service/SecurityService;->u:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/qihoo/security/service/SecurityService;->u:I

    return v0
.end method

.method static synthetic h(Lcom/qihoo/security/service/SecurityService;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/qihoo/security/service/SecurityService;->i:Z

    return v0
.end method

.method static synthetic i(Lcom/qihoo/security/service/SecurityService;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/qihoo/security/service/SecurityService;->j:Z

    return v0
.end method

.method static synthetic j(Lcom/qihoo/security/service/SecurityService;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/qihoo/security/service/SecurityService;->h:Z

    return v0
.end method

.method static synthetic k(Lcom/qihoo/security/service/SecurityService;)I
    .locals 1

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/service/SecurityService;->o:I

    return v0
.end method

.method static synthetic l(Lcom/qihoo/security/service/SecurityService;)J
    .locals 2

    .prologue
    .line 77
    iget-wide v0, p0, Lcom/qihoo/security/service/SecurityService;->q:J

    return-wide v0
.end method

.method static synthetic m(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo360/mobilesafe/core/c;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->x:Lcom/qihoo360/mobilesafe/core/c;

    return-object v0
.end method

.method static synthetic n(Lcom/qihoo/security/service/SecurityService;)I
    .locals 1

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/service/SecurityService;->p:I

    return v0
.end method

.method static synthetic o(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$a;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->l:Lcom/qihoo/security/service/SecurityService$a;

    return-object v0
.end method

.method static synthetic p(Lcom/qihoo/security/service/SecurityService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic q(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo360/mobilesafe/core/d/b;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->E:Lcom/qihoo360/mobilesafe/core/d/b;

    return-object v0
.end method

.method static synthetic r(Lcom/qihoo/security/service/SecurityService;)Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/qihoo/security/service/SecurityService;->g:Z

    return v0
.end method

.method static synthetic s(Lcom/qihoo/security/service/SecurityService;)I
    .locals 1

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/service/SecurityService;->s:I

    return v0
.end method

.method static synthetic t(Lcom/qihoo/security/service/SecurityService;)I
    .locals 1

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/service/SecurityService;->u:I

    return v0
.end method

.method static synthetic u(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/notify/b;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->e:Lcom/qihoo/security/notify/b;

    return-object v0
.end method

.method static synthetic v(Lcom/qihoo/security/service/SecurityService;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->H:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 507
    iput-boolean v1, p0, Lcom/qihoo/security/service/SecurityService;->g:Z

    .line 509
    iput-boolean v1, p0, Lcom/qihoo/security/service/SecurityService;->h:Z

    .line 515
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->k:Lcom/qihoo/security/service/SecurityService$b;

    invoke-static {v0, v1}, Lcom/qihoo/security/service/SecurityService$b;->a(Lcom/qihoo/security/service/SecurityService$b;Z)V

    .line 516
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->k:Lcom/qihoo/security/service/SecurityService$b;

    invoke-static {v0, v1}, Lcom/qihoo/security/service/SecurityService$b;->b(Lcom/qihoo/security/service/SecurityService$b;Z)V

    .line 518
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->y:Lcom/qihoo/security/notify/a;

    if-eqz v0, :cond_0

    .line 519
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->y:Lcom/qihoo/security/notify/a;

    invoke-virtual {v0}, Lcom/qihoo/security/notify/a;->a()V

    .line 533
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->C:Lcom/qihoo/utils/notice/b;

    if-eqz v0, :cond_1

    .line 534
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->C:Lcom/qihoo/utils/notice/b;

    invoke-virtual {v0}, Lcom/qihoo/utils/notice/b;->b()V

    .line 536
    :cond_1
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 591
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->c:Lcom/qihoo/security/floatview/a/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/floatview/a/a;->a(I)V

    .line 592
    return-void
.end method

.method public a(II)V
    .locals 3

    .prologue
    .line 1324
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->H:Landroid/os/Handler;

    monitor-enter v1

    .line 1328
    if-eqz p1, :cond_0

    .line 1329
    const/16 v0, 0x465f

    :try_start_0
    invoke-static {v0, p1, p2}, Lcom/qihoo/security/support/b;->b(III)V

    .line 1332
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 1333
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1334
    if-nez v0, :cond_1

    .line 1335
    const-string/jumbo v0, ""

    .line 1340
    :cond_1
    const-string/jumbo v2, "sp_key_last_cq_locale"

    invoke-static {p0, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1342
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->I:Ljava/lang/String;

    .line 1343
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->H:Landroid/os/Handler;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 1344
    monitor-exit v1

    .line 1345
    return-void

    .line 1344
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 1266
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->k:Lcom/qihoo/security/service/SecurityService$b;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/service/SecurityService$b;->sendEmptyMessage(I)Z

    .line 1276
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1277
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1278
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo/security/locale/d;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v2, v3, p0}, Lcom/qihoo/security/clearengine/b/a;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Lcom/qihoo/security/clearengine/b/a$a;)V

    .line 1280
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/gamebooster/b;->b(Ljava/lang/String;)V

    .line 1281
    invoke-static {p1}, Lcom/qihoo/security/installreport/a;->b(Ljava/lang/String;)V

    .line 1289
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 1294
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1301
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->B:Lcom/qihoo/security/opti/trashclear/service/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    const-string/jumbo v1, "remind_uninstallReminder_swtich"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1303
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->B:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/service/e;->b(Ljava/lang/String;)V

    .line 1307
    :cond_0
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/lang/String;)V

    .line 1308
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 540
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/service/SecurityService;->g:Z

    .line 542
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/service/SecurityService;->h:Z

    .line 584
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->C:Lcom/qihoo/utils/notice/b;

    if-eqz v0, :cond_0

    .line 585
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->C:Lcom/qihoo/utils/notice/b;

    invoke-virtual {v0}, Lcom/qihoo/utils/notice/b;->c()V

    .line 587
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 596
    const-string/jumbo v0, "o_c_spb.dat"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 597
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->x:Lcom/qihoo360/mobilesafe/core/c;

    if-eqz v0, :cond_0

    .line 598
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->x:Lcom/qihoo360/mobilesafe/core/c;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/c;->a()V

    .line 606
    :cond_0
    :goto_0
    return-void

    .line 600
    :cond_1
    const-string/jumbo v0, "lock_screen.dat"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 601
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->k:Lcom/qihoo/security/service/SecurityService$b;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService$b;->a(Lcom/qihoo/security/service/SecurityService$b;)V

    goto :goto_0

    .line 602
    :cond_2
    const-string/jumbo v0, "locale.dat"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 603
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->c()V

    goto :goto_0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 213
    if-eqz p1, :cond_1

    .line 214
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 219
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 220
    const-string/jumbo v2, "com.qihoo.security.service.ROOTSERVICE"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string/jumbo v2, "com.qihoo.msafe.service.ROOTSERVICE"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->b:Lcom/qihoo360/mobilesafe/support/a/b$a;

    .line 297
    :cond_1
    :goto_0
    return-object v0

    .line 226
    :cond_2
    const-string/jumbo v2, "com.qihoo.security.service.INTERNAL_CONTROL"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 230
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->G:Lcom/qihoo/security/service/a$a;

    goto :goto_0

    .line 231
    :cond_3
    const-string/jumbo v2, "com.qihoo.security.floatview.SERVICER"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->c:Lcom/qihoo/security/floatview/a/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/a/a;->a()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    .line 236
    :cond_4
    sget-object v2, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->x:Lcom/qihoo360/mobilesafe/core/c;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/c;->c()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    .line 271
    :cond_5
    const-string/jumbo v2, "com.qihoo.security.ACTION_SERVICE_RESIDUAL_FILE"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 275
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->B:Lcom/qihoo/security/opti/trashclear/service/e;

    if-eqz v1, :cond_1

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->B:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    .line 290
    :cond_6
    const-string/jumbo v2, "com.qihoo.security.service.UIBARRIER"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 291
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/f;->a(Landroid/content/Context;)Lcom/qihoo/security/ui/b/f;

    move-result-object v0

    goto :goto_0

    .line 292
    :cond_7
    const-string/jumbo v2, "com.qihoo.security.service.PROFILE"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 293
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/profile/k;->a(Landroid/content/Context;)Lcom/qihoo/security/profile/k;

    move-result-object v0

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 310
    invoke-super {p0, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 311
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->c:Lcom/qihoo/security/floatview/a/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/floatview/a/a;->a(Landroid/content/res/Configuration;)V

    .line 312
    return-void
.end method

.method public onCreate()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 320
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 325
    invoke-virtual {p0}, Lcom/qihoo/security/service/SecurityService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    .line 326
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/service/SecurityService;->a:Z

    .line 329
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/support/b;->a(Landroid/content/Context;)V

    .line 331
    invoke-direct {p0}, Lcom/qihoo/security/service/SecurityService;->d()V

    .line 332
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->b:Lcom/qihoo360/mobilesafe/support/a/b$a;

    if-nez v0, :cond_0

    .line 333
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/support/a/e;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->b:Lcom/qihoo360/mobilesafe/support/a/b$a;

    .line 335
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    const-string/jumbo v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 336
    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/service/SecurityService;->g:Z

    .line 337
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    const-string/jumbo v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->m:Landroid/app/ActivityManager;

    .line 338
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    const-string/jumbo v1, "keyguard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->n:Landroid/app/KeyguardManager;

    .line 339
    iput v2, p0, Lcom/qihoo/security/service/SecurityService;->o:I

    .line 340
    iput v2, p0, Lcom/qihoo/security/service/SecurityService;->p:I

    .line 341
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/service/SecurityService;->q:J

    .line 342
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->r:Landroid/os/RemoteCallbackList;

    .line 343
    iput v2, p0, Lcom/qihoo/security/service/SecurityService;->s:I

    .line 345
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->t:Landroid/os/RemoteCallbackList;

    .line 346
    iput v2, p0, Lcom/qihoo/security/service/SecurityService;->u:I

    .line 349
    new-instance v0, Lcom/qihoo/security/receiver/PackageMonitor;

    invoke-direct {v0, p0}, Lcom/qihoo/security/receiver/PackageMonitor;-><init>(Lcom/qihoo/security/receiver/PackageMonitor$a;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->v:Lcom/qihoo/security/receiver/PackageMonitor;

    .line 350
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->v:Lcom/qihoo/security/receiver/PackageMonitor;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/receiver/PackageMonitor;->a(Landroid/content/Context;)V

    .line 355
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "ss"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 356
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 357
    new-instance v1, Lcom/qihoo/security/service/SecurityService$b;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/service/SecurityService$b;-><init>(Lcom/qihoo/security/service/SecurityService;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo/security/service/SecurityService;->k:Lcom/qihoo/security/service/SecurityService$b;

    .line 358
    new-instance v0, Lcom/qihoo/security/service/SecurityService$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/service/SecurityService$a;-><init>(Lcom/qihoo/security/service/SecurityService;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->l:Lcom/qihoo/security/service/SecurityService$a;

    .line 359
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    .line 360
    new-instance v0, Lcom/qihoo/security/notify/c;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->G:Lcom/qihoo/security/service/a$a;

    invoke-direct {v0, v1, v2, p0}, Lcom/qihoo/security/notify/c;-><init>(Landroid/content/Context;Lcom/qihoo/security/service/a;Lcom/qihoo/security/notify/c$a;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->e:Lcom/qihoo/security/notify/b;

    .line 365
    :goto_0
    new-instance v0, Lcom/qihoo/security/notify/a;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->G:Lcom/qihoo/security/service/a$a;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/notify/a;-><init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->y:Lcom/qihoo/security/notify/a;

    .line 366
    new-instance v0, Lcom/qihoo/security/receiver/CommonReceiver;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->e:Lcom/qihoo/security/notify/b;

    invoke-direct {v0, v1, p0}, Lcom/qihoo/security/receiver/CommonReceiver;-><init>(Lcom/qihoo/security/notify/b;Lcom/qihoo/security/receiver/CommonReceiver$a;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->w:Lcom/qihoo/security/receiver/CommonReceiver;

    .line 367
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->w:Lcom/qihoo/security/receiver/CommonReceiver;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/receiver/CommonReceiver;->a(Landroid/content/Context;)V

    .line 368
    new-instance v0, Lcom/qihoo/security/floatview/a/a;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->G:Lcom/qihoo/security/service/a$a;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/floatview/a/a;-><init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->c:Lcom/qihoo/security/floatview/a/a;

    .line 369
    invoke-direct {p0}, Lcom/qihoo/security/service/SecurityService;->f()V

    .line 370
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->z:Lcom/qihoo/security/locale/d;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->J:Lcom/qihoo/security/locale/b$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(Lcom/qihoo/security/locale/b;)V

    .line 372
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->G:Lcom/qihoo/security/service/a$a;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Landroid/content/Context;Lcom/qihoo/security/service/a;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->x:Lcom/qihoo360/mobilesafe/core/c;

    .line 401
    new-instance v0, Lcom/qihoo/security/opti/trashclear/service/e;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/e;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->B:Lcom/qihoo/security/opti/trashclear/service/e;

    .line 403
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 404
    const-string/jumbo v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 405
    const-string/jumbo v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 406
    const-string/jumbo v1, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 407
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->F:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/service/SecurityService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 409
    new-instance v0, Lcom/qihoo/utils/notice/b;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->G:Lcom/qihoo/security/service/a$a;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/utils/notice/b;-><init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->C:Lcom/qihoo/utils/notice/b;

    .line 410
    invoke-static {}, Lcom/qihoo/security/app/c;->a()Lcom/qihoo/security/app/c;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->D:Lcom/qihoo/security/app/c;

    .line 411
    return-void

    .line 362
    :cond_1
    new-instance v0, Lcom/qihoo/security/notify/d;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/notify/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService;->e:Lcom/qihoo/security/notify/b;

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 1349
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 1355
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/service/SecurityService;->a:Z

    .line 1357
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->c:Lcom/qihoo/security/floatview/a/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/a/a;->b()V

    .line 1359
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->e:Lcom/qihoo/security/notify/b;

    invoke-virtual {v0}, Lcom/qihoo/security/notify/b;->b()V

    .line 1361
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->v:Lcom/qihoo/security/receiver/PackageMonitor;

    if-eqz v0, :cond_0

    .line 1362
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->v:Lcom/qihoo/security/receiver/PackageMonitor;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/receiver/PackageMonitor;->b(Landroid/content/Context;)V

    .line 1364
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->w:Lcom/qihoo/security/receiver/CommonReceiver;

    if-eqz v0, :cond_1

    .line 1365
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->w:Lcom/qihoo/security/receiver/CommonReceiver;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/receiver/CommonReceiver;->b(Landroid/content/Context;)V

    .line 1368
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->F:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/service/SecurityService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1383
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->x:Lcom/qihoo360/mobilesafe/core/c;

    if-eqz v0, :cond_2

    .line 1384
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->x:Lcom/qihoo360/mobilesafe/core/c;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/c;->d()V

    .line 1387
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->z:Lcom/qihoo/security/locale/d;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService;->J:Lcom/qihoo/security/locale/b$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/b;)V

    .line 1389
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->r:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->kill()V

    .line 1390
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->t:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->kill()V

    .line 1392
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->k:Lcom/qihoo/security/service/SecurityService$b;

    invoke-virtual {v0}, Lcom/qihoo/security/service/SecurityService$b;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 1394
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->y:Lcom/qihoo/security/notify/a;

    if-eqz v0, :cond_3

    .line 1395
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->y:Lcom/qihoo/security/notify/a;

    invoke-virtual {v0}, Lcom/qihoo/security/notify/a;->b()V

    .line 1419
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->B:Lcom/qihoo/security/opti/trashclear/service/e;

    if-eqz v0, :cond_4

    .line 1420
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->B:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->b()V

    .line 1423
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->C:Lcom/qihoo/utils/notice/b;

    if-eqz v0, :cond_5

    .line 1424
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->C:Lcom/qihoo/utils/notice/b;

    invoke-virtual {v0}, Lcom/qihoo/utils/notice/b;->a()V

    .line 1426
    :cond_5
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 418
    .line 421
    if-eqz p1, :cond_0

    .line 422
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 423
    const-string/jumbo v3, "com.qihoo.security.ACTION_FINISH"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 425
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    .line 426
    new-instance v2, Landroid/content/Intent;

    const-string/jumbo v3, "com.qihoo.security.ACTION_FINISH"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/support/v4/content/g;->a(Landroid/content/Intent;)Z

    .line 428
    invoke-virtual {p0}, Lcom/qihoo/security/service/SecurityService;->stopSelf()V

    move v0, v1

    .line 455
    :cond_0
    :goto_0
    iget-boolean v2, p0, Lcom/qihoo/security/service/SecurityService;->f:Z

    if-nez v2, :cond_1

    if-nez v0, :cond_1

    .line 456
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService;->e:Lcom/qihoo/security/notify/b;

    invoke-virtual {v0}, Lcom/qihoo/security/notify/b;->c()V

    .line 457
    iput-boolean v1, p0, Lcom/qihoo/security/service/SecurityService;->f:Z

    .line 460
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/service/SecurityService;->e()V

    .line 462
    const/4 v0, 0x2

    return v0

    .line 429
    :cond_2
    const-string/jumbo v3, "com.qihoo.security.action.function.notification"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 430
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->e:Lcom/qihoo/security/notify/b;

    const-string/jumbo v3, "com.qihoo.security.index.function.notification"

    const/4 v4, -0x1

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/notify/b;->a(I)V

    goto :goto_0

    .line 432
    :cond_3
    const-string/jumbo v3, "com.qihoo360.action.START_RETRIEVE_CONF"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 435
    const-string/jumbo v3, "com.qihoo.security.clean.scan.status"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 436
    const-string/jumbo v2, "hasScan"

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 437
    if-eqz v2, :cond_0

    .line 438
    invoke-static {v1}, Lcom/qihoo/security/opti/b/a;->a(Z)V

    goto :goto_0

    .line 440
    :cond_4
    const-string/jumbo v3, "com.qihoo.security.action.DAEMON"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 441
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->e:Lcom/qihoo/security/notify/b;

    invoke-virtual {v2}, Lcom/qihoo/security/notify/b;->c()V

    .line 442
    iput-boolean v1, p0, Lcom/qihoo/security/service/SecurityService;->f:Z

    .line 443
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService;->d:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Z)V

    goto :goto_0
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 490
    invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V

    .line 503
    return-void
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 305
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
