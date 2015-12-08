.class public final Lkik/android/net/communicator/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/net/communicator/a$d;,
        Lkik/android/net/communicator/a$c;,
        Lkik/android/net/communicator/a$a;,
        Lkik/android/net/communicator/a$b;,
        Lkik/android/net/communicator/a$e;
    }
.end annotation


# static fields
.field private static final e:Lorg/c/b;


# instance fields
.field private A:Lkik/a/e/y;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Landroid/os/PowerManager;

.field private G:J

.field private H:J

.field private I:Z

.field private volatile J:Ljava/lang/String;

.field private volatile K:Z

.field private volatile L:J

.field private volatile M:Ljava/lang/String;

.field private volatile N:I

.field private volatile O:Lkik/a/f/g/c;

.field protected a:Lcom/kik/android/a;

.field protected b:Lkik/a/ab;

.field private c:Lcom/kik/g/k;

.field private d:Lcom/kik/g/k;

.field private f:Lcom/kik/g/k;

.field private g:Lcom/kik/g/k;

.field private h:Lcom/kik/g/k;

.field private i:Lkik/a/e/o;

.field private j:Lkik/a/f/k;

.field private k:Lcom/kik/android/b/a;

.field private l:Lcom/kik/android/b/a;

.field private m:Ljava/util/concurrent/BlockingQueue;

.field private n:Ljava/util/concurrent/BlockingQueue;

.field private o:Landroid/content/Context;

.field private p:Lkik/android/d/c;

.field private q:Ljava/util/ArrayList;

.field private r:Lkik/a/f/b/a;

.field private s:Lkik/a/f/a/c;

.field private volatile t:I

.field private volatile u:Z

.field private volatile v:J

.field private volatile w:I

.field private final x:Ljava/lang/Object;

.field private volatile y:Lkik/android/net/communicator/a$c;

.field private final z:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const-string v0, "AndroidCommunicator"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/net/communicator/a;->e:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lkik/a/e/y;Lkik/android/util/ar;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->c:Lcom/kik/g/k;

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/net/communicator/a;->q:Ljava/util/ArrayList;

    .line 130
    new-instance v0, Lkik/a/f/b/a;

    invoke-direct {v0}, Lkik/a/f/b/a;-><init>()V

    iput-object v0, p0, Lkik/android/net/communicator/a;->r:Lkik/a/f/b/a;

    .line 132
    new-instance v0, Lkik/a/f/a/c;

    invoke-direct {v0}, Lkik/a/f/a/c;-><init>()V

    iput-object v0, p0, Lkik/android/net/communicator/a;->s:Lkik/a/f/a/c;

    .line 134
    const/4 v0, 0x4

    iput v0, p0, Lkik/android/net/communicator/a;->t:I

    .line 135
    iput-boolean v3, p0, Lkik/android/net/communicator/a;->u:Z

    .line 137
    iput-wide v6, p0, Lkik/android/net/communicator/a;->v:J

    .line 139
    iput v3, p0, Lkik/android/net/communicator/a;->w:I

    .line 141
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/net/communicator/a;->x:Ljava/lang/Object;

    .line 142
    iput-object v4, p0, Lkik/android/net/communicator/a;->y:Lkik/android/net/communicator/a$c;

    .line 143
    new-instance v0, Ljava/util/Timer;

    const-string v1, "AndroidCommunicatorTimer"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->z:Ljava/util/Timer;

    .line 152
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/net/communicator/a;->G:J

    .line 156
    iput-boolean v3, p0, Lkik/android/net/communicator/a;->I:Z

    .line 159
    iput-boolean v3, p0, Lkik/android/net/communicator/a;->K:Z

    .line 161
    iput-wide v6, p0, Lkik/android/net/communicator/a;->L:J

    .line 162
    iput-object v4, p0, Lkik/android/net/communicator/a;->M:Ljava/lang/String;

    .line 163
    const/16 v0, 0x1466

    iput v0, p0, Lkik/android/net/communicator/a;->N:I

    .line 164
    iput-object v4, p0, Lkik/android/net/communicator/a;->O:Lkik/a/f/g/c;

    .line 194
    const-string v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 195
    iput-object p2, p0, Lkik/android/net/communicator/a;->D:Ljava/lang/String;

    .line 197
    new-instance v0, Lcom/kik/android/b/a;

    const-string v1, "ping"

    invoke-direct {v0, p1, v1, v3}, Lcom/kik/android/b/a;-><init>(Landroid/content/Context;Ljava/lang/String;B)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->k:Lcom/kik/android/b/a;

    .line 198
    new-instance v0, Lcom/kik/android/b/a;

    const-string v1, "read"

    invoke-direct {v0, p1, v1, v3}, Lcom/kik/android/b/a;-><init>(Landroid/content/Context;Ljava/lang/String;B)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->l:Lcom/kik/android/b/a;

    .line 200
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->m:Ljava/util/concurrent/BlockingQueue;

    .line 201
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->n:Ljava/util/concurrent/BlockingQueue;

    .line 202
    iput-object p1, p0, Lkik/android/net/communicator/a;->o:Landroid/content/Context;

    .line 203
    const-string v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, p0, Lkik/android/net/communicator/a;->F:Landroid/os/PowerManager;

    .line 204
    iput-object p3, p0, Lkik/android/net/communicator/a;->A:Lkik/a/e/y;

    .line 207
    iget-object v0, p0, Lkik/android/net/communicator/a;->o:Landroid/content/Context;

    invoke-static {v0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/communicator/a;->p:Lkik/android/d/c;

    .line 208
    iget-object v6, p0, Lkik/android/net/communicator/a;->p:Lkik/android/d/c;

    new-instance v0, Lkik/android/d/a;

    iget-object v1, p0, Lkik/android/net/communicator/a;->o:Landroid/content/Context;

    const-string v2, "use-wrong-socket-port"

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lkik/android/d/a;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v6, v0}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 209
    return-void
.end method

.method static synthetic A(Lkik/android/net/communicator/a;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->z:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic B(Lkik/android/net/communicator/a;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->g:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic C(Lkik/android/net/communicator/a;)I
    .locals 2

    .prologue
    .line 61
    iget v0, p0, Lkik/android/net/communicator/a;->w:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkik/android/net/communicator/a;->w:I

    return v0
.end method

.method static synthetic D(Lkik/android/net/communicator/a;)Lkik/android/net/communicator/a$c;
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/net/communicator/a;->y:Lkik/android/net/communicator/a$c;

    return-object v0
.end method

.method static synthetic E(Lkik/android/net/communicator/a;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->f:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic F(Lkik/android/net/communicator/a;)Lkik/a/e/o;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->i:Lkik/a/e/o;

    return-object v0
.end method

.method static synthetic G(Lkik/android/net/communicator/a;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->q:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic a(Lkik/android/net/communicator/a;I)I
    .locals 0

    .prologue
    .line 61
    iput p1, p0, Lkik/android/net/communicator/a;->t:I

    return p1
.end method

.method static synthetic a(Lkik/android/net/communicator/a;J)J
    .locals 1

    .prologue
    .line 61
    iput-wide p1, p0, Lkik/android/net/communicator/a;->H:J

    return-wide p1
.end method

.method static synthetic a(Lkik/android/net/communicator/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lkik/android/net/communicator/a;->E:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lkik/android/net/communicator/a;Lkik/a/f/g/c;)Lkik/a/f/g/c;
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lkik/android/net/communicator/a;->O:Lkik/a/f/g/c;

    return-object p1
.end method

.method static synthetic a(Lkik/android/net/communicator/a;)Lkik/a/f/k;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->j:Lkik/a/f/k;

    return-object v0
.end method

.method private a(Lkik/android/net/communicator/a$c;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    .line 639
    iget-object v2, p0, Lkik/android/net/communicator/a;->x:Ljava/lang/Object;

    monitor-enter v2

    .line 640
    const/4 v1, 0x0

    .line 642
    :try_start_0
    invoke-virtual {p1}, Lkik/android/net/communicator/a$c;->d()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 643
    iget v3, p0, Lkik/android/net/communicator/a;->t:I

    if-ne v3, v0, :cond_1

    iget-wide v4, p1, Lkik/android/net/communicator/a$c;->b:J

    iget-wide v6, p0, Lkik/android/net/communicator/a;->v:J

    cmp-long v3, v4, v6

    if-nez v3, :cond_1

    .line 653
    :goto_0
    iget-object v1, p0, Lkik/android/net/communicator/a;->y:Lkik/android/net/communicator/a$c;

    if-ne v1, p1, :cond_0

    .line 654
    const/4 v1, 0x0

    iput-object v1, p0, Lkik/android/net/communicator/a;->y:Lkik/android/net/communicator/a$c;

    .line 656
    :cond_0
    monitor-exit v2

    return v0

    .line 657
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/net/communicator/a;Lkik/android/net/communicator/a$c;)Z
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lkik/android/net/communicator/a;->a(Lkik/android/net/communicator/a$c;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lkik/android/net/communicator/a;Z)Z
    .locals 0

    .prologue
    .line 61
    iput-boolean p1, p0, Lkik/android/net/communicator/a;->I:Z

    return p1
.end method

.method static synthetic b(Lkik/android/net/communicator/a;I)I
    .locals 0

    .prologue
    .line 61
    iput p1, p0, Lkik/android/net/communicator/a;->N:I

    return p1
.end method

.method static synthetic b(Lkik/android/net/communicator/a;J)J
    .locals 1

    .prologue
    .line 61
    iput-wide p1, p0, Lkik/android/net/communicator/a;->L:J

    return-wide p1
.end method

.method static synthetic b(Lkik/android/net/communicator/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lkik/android/net/communicator/a;->M:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lkik/android/net/communicator/a;)Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lkik/android/net/communicator/a;->K:Z

    return v0
.end method

.method static synthetic c(Lkik/android/net/communicator/a;J)J
    .locals 1

    .prologue
    .line 61
    iput-wide p1, p0, Lkik/android/net/communicator/a;->G:J

    return-wide p1
.end method

.method static synthetic c(Lkik/android/net/communicator/a;)Lkik/android/d/c;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->p:Lkik/android/d/c;

    return-object v0
.end method

.method static synthetic d(Lkik/android/net/communicator/a;)J
    .locals 2

    .prologue
    .line 61
    iget-wide v0, p0, Lkik/android/net/communicator/a;->L:J

    return-wide v0
.end method

.method static synthetic e(Lkik/android/net/communicator/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->M:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lkik/android/net/communicator/a;)I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lkik/android/net/communicator/a;->N:I

    return v0
.end method

.method static synthetic g(Lkik/android/net/communicator/a;)Lkik/a/f/g/c;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->O:Lkik/a/f/g/c;

    return-object v0
.end method

.method static synthetic h(Lkik/android/net/communicator/a;)Lcom/kik/android/b/a;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->l:Lcom/kik/android/b/a;

    return-object v0
.end method

.method static synthetic i(Lkik/android/net/communicator/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->D:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lkik/android/net/communicator/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->B:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lkik/android/net/communicator/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->C:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic l(Lkik/android/net/communicator/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->J:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lkik/android/net/communicator/a;)I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lkik/android/net/communicator/a;->w:I

    return v0
.end method

.method static synthetic n(Lkik/android/net/communicator/a;)Lkik/a/e/y;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->A:Lkik/a/e/y;

    return-object v0
.end method

.method static synthetic o(Lkik/android/net/communicator/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->o:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic p(Lkik/android/net/communicator/a;)Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lkik/android/net/communicator/a;->u:Z

    return v0
.end method

.method static synthetic q(Lkik/android/net/communicator/a;)Ljava/util/concurrent/BlockingQueue;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->m:Ljava/util/concurrent/BlockingQueue;

    return-object v0
.end method

.method static synthetic r(Lkik/android/net/communicator/a;)Ljava/util/concurrent/BlockingQueue;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->n:Ljava/util/concurrent/BlockingQueue;

    return-object v0
.end method

.method static synthetic s(Lkik/android/net/communicator/a;)Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lkik/android/net/communicator/a;->I:Z

    return v0
.end method

.method static synthetic t(Lkik/android/net/communicator/a;)J
    .locals 4

    .prologue
    .line 61
    iget-wide v0, p0, Lkik/android/net/communicator/a;->v:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lkik/android/net/communicator/a;->v:J

    return-wide v0
.end method

.method static synthetic u(Lkik/android/net/communicator/a;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->c:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic v(Lkik/android/net/communicator/a;)I
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/net/communicator/a;->w:I

    return v0
.end method

.method static synthetic w(Lkik/android/net/communicator/a;)Lkik/a/f/b/a;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->r:Lkik/a/f/b/a;

    return-object v0
.end method

.method static synthetic x(Lkik/android/net/communicator/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic y(Lkik/android/net/communicator/a;)Lkik/android/net/communicator/a$c;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->y:Lkik/android/net/communicator/a$c;

    return-object v0
.end method

.method static synthetic z(Lkik/android/net/communicator/a;)Lkik/a/f/a/c;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/android/net/communicator/a;->s:Lkik/a/f/a/c;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lkik/android/net/communicator/a;->d:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/f/f/z;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 830
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkik/android/net/communicator/a;->a(Lkik/a/f/f/z;Z)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/f/f/z;Z)Lcom/kik/g/p;
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 805
    iget-object v2, p0, Lkik/android/net/communicator/a;->B:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkik/android/net/communicator/a;->C:Ljava/lang/String;

    if-eqz v2, :cond_1

    move v2, v1

    .line 806
    :goto_0
    if-nez v2, :cond_0

    move v0, v1

    :cond_0
    instance-of v2, p1, Lkik/a/f/f/w;

    xor-int/2addr v0, v2

    if-eqz v0, :cond_2

    .line 807
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to send stanza from wrong auth state: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lkik/a/f/f/z;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    const/16 v0, 0x66

    invoke-virtual {p1, v0}, Lkik/a/f/f/z;->c(I)V

    .line 809
    new-instance v0, Lkik/a/f/a;

    const-string v1, ""

    invoke-direct {v0, v1}, Lkik/a/f/a;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    .line 824
    :goto_1
    return-object v0

    :cond_1
    move v2, v0

    .line 805
    goto :goto_0

    .line 812
    :cond_2
    iget-object v0, p0, Lkik/android/net/communicator/a;->r:Lkik/a/f/b/a;

    invoke-virtual {v0, p1}, Lkik/a/f/b/a;->a(Lkik/a/f/f/z;)V

    .line 814
    iget v0, p0, Lkik/android/net/communicator/a;->t:I

    if-ne v0, v1, :cond_3

    .line 815
    iget-object v0, p0, Lkik/android/net/communicator/a;->n:Ljava/util/concurrent/BlockingQueue;

    new-instance v2, Lkik/android/net/communicator/a$e;

    invoke-direct {v2, p0, v1}, Lkik/android/net/communicator/a$e;-><init>(Lkik/android/net/communicator/a;I)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 818
    :cond_3
    if-nez p2, :cond_4

    .line 821
    iget-object v0, p0, Lkik/android/net/communicator/a;->d:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 824
    :cond_4
    invoke-virtual {p1}, Lkik/a/f/f/z;->j()Lcom/kik/g/p;

    move-result-object v0

    goto :goto_1
.end method

.method public final a(Lcom/kik/android/a;)V
    .locals 0

    .prologue
    .line 744
    iput-object p1, p0, Lkik/android/net/communicator/a;->a:Lcom/kik/android/a;

    .line 745
    return-void
.end method

.method public final a(Ljava/lang/String;Lkik/a/e/f$b;Z)V
    .locals 3

    .prologue
    .line 693
    iget v0, p0, Lkik/android/net/communicator/a;->t:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 694
    new-instance v0, Lkik/a/e/f$a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lkik/android/net/communicator/a;->t:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/a/e/f$a;-><init>(Ljava/lang/String;)V

    throw v0

    .line 696
    :cond_0
    iput-object p1, p0, Lkik/android/net/communicator/a;->J:Ljava/lang/String;

    .line 697
    iput-boolean p3, p0, Lkik/android/net/communicator/a;->K:Z

    .line 699
    iget-object v0, p0, Lkik/android/net/communicator/a;->m:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p2}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 700
    new-instance v0, Lkik/a/e/f$a;

    const-string v1, "Already have connection enqueued"

    invoke-direct {v0, v1}, Lkik/a/e/f$a;-><init>(Ljava/lang/String;)V

    throw v0

    .line 702
    :cond_1
    return-void
.end method

.method public final a(Ljava/util/concurrent/ExecutorService;Lkik/a/f/k;Lkik/a/e/o;)V
    .locals 3

    .prologue
    .line 755
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p1}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->h:Lcom/kik/g/k;

    .line 756
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p1}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->f:Lcom/kik/g/k;

    .line 757
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p1}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->g:Lcom/kik/g/k;

    .line 758
    iput-object p2, p0, Lkik/android/net/communicator/a;->j:Lkik/a/f/k;

    .line 759
    iput-object p3, p0, Lkik/android/net/communicator/a;->i:Lkik/a/e/o;

    .line 760
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p1}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/android/net/communicator/a;->d:Lcom/kik/g/k;

    .line 761
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lkik/android/net/communicator/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lkik/android/net/communicator/a$b;-><init>(Lkik/android/net/communicator/a;B)V

    const-string v2, "CommOutput"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 762
    return-void
.end method

.method public final a(Lkik/a/ab;)V
    .locals 0

    .prologue
    .line 749
    iput-object p1, p0, Lkik/android/net/communicator/a;->b:Lkik/a/ab;

    .line 750
    return-void
.end method

.method public final a(Lkik/a/e/f$c;)V
    .locals 8

    .prologue
    .line 713
    iget v0, p0, Lkik/android/net/communicator/a;->t:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 714
    new-instance v0, Lkik/a/e/f$a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lkik/android/net/communicator/a;->t:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/a/e/f$a;-><init>(Ljava/lang/String;)V

    throw v0

    .line 717
    :cond_0
    iget-object v7, p0, Lkik/android/net/communicator/a;->x:Ljava/lang/Object;

    monitor-enter v7

    .line 718
    :try_start_0
    iget-object v0, p0, Lkik/android/net/communicator/a;->y:Lkik/android/net/communicator/a$c;

    if-nez v0, :cond_1

    .line 719
    new-instance v1, Lkik/android/net/communicator/a$c;

    iget-wide v4, p0, Lkik/android/net/communicator/a;->v:J

    iget-object v0, p0, Lkik/android/net/communicator/a;->k:Lcom/kik/android/b/a;

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/b/a;->a(J)Lcom/kik/g/ar;

    move-result-object v6

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lkik/android/net/communicator/a$c;-><init>(Lkik/android/net/communicator/a;Lkik/a/e/f$c;JLcom/kik/g/ar;)V

    iput-object v1, p0, Lkik/android/net/communicator/a;->y:Lkik/android/net/communicator/a$c;

    .line 724
    iget-object v0, p0, Lkik/android/net/communicator/a;->z:Ljava/util/Timer;

    new-instance v1, Lkik/android/net/communicator/a$d;

    iget-object v2, p0, Lkik/android/net/communicator/a;->y:Lkik/android/net/communicator/a$c;

    invoke-direct {v1, p0, v2}, Lkik/android/net/communicator/a$d;-><init>(Lkik/android/net/communicator/a;Lkik/android/net/communicator/a$c;)V

    const-wide/16 v2, 0x1f40

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 725
    iget-object v0, p0, Lkik/android/net/communicator/a;->n:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lkik/android/net/communicator/a$e;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lkik/android/net/communicator/a$e;-><init>(Lkik/android/net/communicator/a;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 727
    :cond_1
    monitor-exit v7

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lkik/a/f/i;)V
    .locals 1

    .prologue
    .line 842
    iget-object v0, p0, Lkik/android/net/communicator/a;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 843
    return-void
.end method

.method public final a(Lkik/a/z;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    .line 767
    invoke-virtual {p1}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/communicator/a;->B:Ljava/lang/String;

    .line 768
    invoke-virtual {p1}, Lkik/a/z;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/communicator/a;->C:Ljava/lang/String;

    .line 770
    iget v0, p0, Lkik/android/net/communicator/a;->t:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lkik/android/net/communicator/a;->t:I

    if-ne v0, v2, :cond_1

    .line 771
    :cond_0
    iget-object v0, p0, Lkik/android/net/communicator/a;->n:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lkik/android/net/communicator/a$e;

    invoke-direct {v1, p0, v2}, Lkik/android/net/communicator/a$e;-><init>(Lkik/android/net/communicator/a;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 773
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 836
    iget-object v0, p0, Lkik/android/net/communicator/a;->r:Lkik/a/f/b/a;

    invoke-virtual {v0, p1}, Lkik/a/f/b/a;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lkik/android/net/communicator/a;->c:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lkik/a/f/i;)V
    .locals 1

    .prologue
    .line 848
    iget-object v0, p0, Lkik/android/net/communicator/a;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 849
    return-void
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/android/net/communicator/a;->f:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lkik/android/net/communicator/a;->g:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lkik/android/net/communicator/a;->h:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lkik/android/net/communicator/a;->h:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 106
    return-void
.end method

.method public final g()J
    .locals 2

    .prologue
    .line 219
    iget-wide v0, p0, Lkik/android/net/communicator/a;->G:J

    return-wide v0
.end method

.method public final h()J
    .locals 2

    .prologue
    .line 224
    iget-wide v0, p0, Lkik/android/net/communicator/a;->H:J

    return-wide v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lkik/android/net/communicator/a;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final j()J
    .locals 2

    .prologue
    .line 236
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final k()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 707
    iget v1, p0, Lkik/android/net/communicator/a;->t:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()I
    .locals 1

    .prologue
    .line 733
    iget v0, p0, Lkik/android/net/communicator/a;->t:I

    return v0
.end method

.method public final m()Z
    .locals 1

    .prologue
    .line 739
    iget-object v0, p0, Lkik/android/net/communicator/a;->B:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/net/communicator/a;->C:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final n()V
    .locals 3

    .prologue
    .line 778
    iget-object v0, p0, Lkik/android/net/communicator/a;->n:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lkik/android/net/communicator/a$e;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lkik/android/net/communicator/a$e;-><init>(Lkik/android/net/communicator/a;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 779
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/net/communicator/a;->u:Z

    .line 780
    return-void
.end method

.method public final o()V
    .locals 2

    .prologue
    .line 785
    iget-object v0, p0, Lkik/android/net/communicator/a;->d:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 786
    return-void
.end method
