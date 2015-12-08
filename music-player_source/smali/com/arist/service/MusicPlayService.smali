.class public Lcom/arist/service/MusicPlayService;
.super Landroid/app/Service;


# static fields
.field public static a:Ljava/util/ArrayList;

.field public static b:Z


# instance fields
.field c:Lcom/arist/service/b;

.field private d:Lcom/arist/service/k;

.field private e:I

.field private f:Landroid/hardware/SensorManager;

.field private g:Z

.field private h:I

.field private i:Ljava/util/Timer;

.field private j:Lcom/arist/b/b;

.field private k:Z

.field private l:Landroid/os/Handler;

.field private m:Landroid/media/AudioManager;

.field private n:Ljava/util/Random;

.field private o:Lcom/arist/model/b/c;

.field private p:Lcom/arist/service/p;

.field private q:Lcom/arist/service/o;

.field private r:Ljava/util/ArrayList;

.field private s:I

.field private t:Landroid/hardware/SensorEventListener;

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/arist/service/MusicPlayService;->b:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    iput-boolean v1, p0, Lcom/arist/service/MusicPlayService;->g:Z

    iput-boolean v1, p0, Lcom/arist/service/MusicPlayService;->k:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    new-instance v0, Lcom/arist/service/e;

    invoke-direct {v0, p0}, Lcom/arist/service/e;-><init>(Lcom/arist/service/MusicPlayService;)V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->t:Landroid/hardware/SensorEventListener;

    iput-boolean v1, p0, Lcom/arist/service/MusicPlayService;->u:Z

    return-void
.end method

.method private a(I)V
    .locals 2

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->l:Landroid/os/Handler;

    new-instance v1, Lcom/arist/service/i;

    invoke-direct {v1, p0, p1}, Lcom/arist/service/i;-><init>(Lcom/arist/service/MusicPlayService;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic a(Lcom/arist/service/MusicPlayService;)V
    .locals 2

    const-string v0, "MusicPlayService"

    const-string v1, "\u4e0b\u4e00\u9996"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    const v0, 0x7f0900c6

    invoke-direct {p0, v0}, Lcom/arist/service/MusicPlayService;->a(I)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->k:Z

    sget v0, Lcom/arist/activity/MyApplication;->h:I

    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sget v0, Lcom/arist/activity/MyApplication;->i:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sget-object v1, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    move-object v1, p0

    :goto_1
    iput v0, v1, Lcom/arist/service/MusicPlayService;->e:I

    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sput v0, Lcom/arist/activity/MyApplication;->h:I

    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->a()V

    goto :goto_0

    :pswitch_0
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->b()I

    move-result v0

    move-object v1, p0

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    move-object v1, p0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/arist/service/MusicPlayService;I)V
    .locals 0

    iput p1, p0, Lcom/arist/service/MusicPlayService;->h:I

    return-void
.end method

.method static synthetic a(Lcom/arist/service/MusicPlayService;J)V
    .locals 7

    const-string v0, "MusicPlayService"

    const-string v1, "\u6536\u5230\u6709\u6548\u7761\u7720\u5e7f\u64ad"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->i:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->i:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->i:Ljava/util/Timer;

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->i:Ljava/util/Timer;

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->i:Ljava/util/Timer;

    new-instance v1, Lcom/arist/service/g;

    invoke-direct {v1, p0}, Lcom/arist/service/g;-><init>(Lcom/arist/service/MusicPlayService;)V

    const-wide/16 v2, 0x3c

    mul-long/2addr v2, p1

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/arist/service/MusicPlayService;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/arist/service/MusicPlayService;->u:Z

    return-void
.end method

.method private b()I
    .locals 4

    const/4 v0, 0x0

    sget-object v1, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->n:Ljava/util/Random;

    sget-object v1, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p0, Lcom/arist/service/MusicPlayService;->s:I

    if-eq v1, v2, :cond_5

    :cond_1
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    sget-object v2, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    iput v2, p0, Lcom/arist/service/MusicPlayService;->s:I

    :goto_1
    iget v2, p0, Lcom/arist/service/MusicPlayService;->s:I

    if-lt v0, v2, :cond_2

    :goto_2
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->n:Ljava/util/Random;

    iget-object v2, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v1, :cond_4

    move v1, v2

    :goto_3
    iget v2, p0, Lcom/arist/service/MusicPlayService;->e:I

    if-eq v0, v2, :cond_3

    :goto_4
    iget-object v2, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->n:Ljava/util/Random;

    iget-object v1, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_3

    :cond_4
    move v1, v2

    goto :goto_4

    :cond_5
    move v1, v0

    goto :goto_2
.end method

.method static synthetic b(Lcom/arist/service/MusicPlayService;)V
    .locals 3

    const/4 v2, 0x0

    const-string v0, "tag"

    const-string v1, "previous()"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    sput v2, Lcom/arist/activity/MyApplication;->f:I

    sput v2, Lcom/arist/activity/MyApplication;->g:I

    sput v2, Lcom/arist/activity/MyApplication;->h:I

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->a()V

    :goto_0
    return-void

    :cond_0
    const v0, 0x7f0900c6

    invoke-direct {p0, v0}, Lcom/arist/service/MusicPlayService;->a(I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->k:Z

    sget v0, Lcom/arist/activity/MyApplication;->h:I

    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sget v0, Lcom/arist/activity/MyApplication;->i:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    if-gez v0, :cond_2

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move-object v1, p0

    :goto_1
    iput v0, v1, Lcom/arist/service/MusicPlayService;->e:I

    const-string v0, "MusicPlayService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/arist/service/MusicPlayService;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sput v0, Lcom/arist/activity/MyApplication;->h:I

    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->a()V

    goto :goto_0

    :pswitch_0
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->b()I

    move-result v0

    move-object v1, p0

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    move-object v1, p0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic c(Lcom/arist/service/MusicPlayService;)Lcom/arist/service/o;
    .locals 1

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->q:Lcom/arist/service/o;

    return-object v0
.end method

.method private c()V
    .locals 2

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    sput v0, Lcom/arist/activity/MyApplication;->j:I

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    new-instance v0, Lcom/arist/b/b;

    invoke-direct {v0}, Lcom/arist/b/b;-><init>()V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->j:Lcom/arist/b/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method static synthetic d(Lcom/arist/service/MusicPlayService;)Landroid/media/AudioManager;
    .locals 1

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->m:Landroid/media/AudioManager;

    return-object v0
.end method

.method static synthetic e(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->c()V

    return-void
.end method

.method static synthetic f(Lcom/arist/service/MusicPlayService;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arist/service/MusicPlayService;->u:Z

    return v0
.end method

.method static synthetic g(Lcom/arist/service/MusicPlayService;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arist/service/MusicPlayService;->g:Z

    return v0
.end method

.method static synthetic h(Lcom/arist/service/MusicPlayService;)Lcom/arist/service/p;
    .locals 1

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    return-object v0
.end method

.method static synthetic i(Lcom/arist/service/MusicPlayService;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->k:Z

    return-void
.end method

.method static synthetic j(Lcom/arist/service/MusicPlayService;)V
    .locals 2

    const-string v0, "MusicPlayService"

    const-string v1, "\u81ea\u52a8\u4e0b\u4e00\u9996"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    const v0, 0x7f0900c6

    invoke-direct {p0, v0}, Lcom/arist/service/MusicPlayService;->a(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget v0, Lcom/arist/activity/MyApplication;->h:I

    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sget v0, Lcom/arist/activity/MyApplication;->i:I

    packed-switch v0, :pswitch_data_0

    :goto_1
    :pswitch_0
    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sput v0, Lcom/arist/activity/MyApplication;->h:I

    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->a()V

    goto :goto_0

    :pswitch_1
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->b()I

    move-result v0

    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    goto :goto_1

    :pswitch_2
    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sget-object v1, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_2

    const/4 v0, 0x0

    :goto_2
    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    goto :goto_2

    :pswitch_3
    iget v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/arist/service/MusicPlayService;->e:I

    sget-object v1, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-gt v0, v1, :cond_0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic k(Lcom/arist/service/MusicPlayService;)I
    .locals 1

    iget v0, p0, Lcom/arist/service/MusicPlayService;->h:I

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 9

    const/4 v8, 0x2

    const/4 v2, 0x0

    const/4 v1, 0x1

    const-string v0, "MusicPlayService"

    const-string v3, "\u64ad\u653e/\u6682\u505c"

    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->g:Z

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->m:Landroid/media/AudioManager;

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x1

    invoke-virtual {v0, v3, v4, v5}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v3

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v3}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/c/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f0900cb

    invoke-direct {p0, v0}, Lcom/arist/service/MusicPlayService;->a(I)V

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_9

    invoke-virtual {v3}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/arist/service/MusicPlayService;->j:Lcom/arist/b/b;

    invoke-virtual {v4}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/arist/service/MusicPlayService;->k:Z

    if-nez v0, :cond_5

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->k:Z

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    const/4 v0, 0x3

    sput v0, Lcom/arist/activity/MyApplication;->j:I

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    invoke-virtual {v0, v3}, Lcom/arist/service/p;->a(Lcom/arist/b/b;)V

    iget-object v4, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    sget v0, Lcom/arist/activity/MyApplication;->j:I

    if-ne v8, v0, :cond_a

    move v0, v1

    :goto_2
    invoke-virtual {v4, v0}, Lcom/arist/service/p;->a(Z)V

    :cond_2
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    if-eqz v3, :cond_3

    iput-object v3, p0, Lcom/arist/service/MusicPlayService;->j:Lcom/arist/b/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->l:Landroid/os/Handler;

    new-instance v1, Lcom/arist/service/h;

    invoke-direct {v1, p0}, Lcom/arist/service/h;-><init>(Lcom/arist/service/MusicPlayService;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->k:Z

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    const/4 v0, 0x2

    sput v0, Lcom/arist/activity/MyApplication;->j:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :try_start_2
    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->k:Z

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v3}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    const/4 v0, 0x2

    sput v0, Lcom/arist/activity/MyApplication;->j:I

    invoke-static {}, Lcom/arist/activity/MyApplication;->a()V

    new-instance v0, Landroid/content/Intent;

    sget-object v4, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->k:Z

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v3}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->o:Lcom/arist/model/b/c;

    invoke-virtual {v3}, Lcom/arist/b/b;->c()I

    move-result v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v0, v4, v6, v7}, Lcom/arist/model/b/c;->a(IJ)V

    sget v0, Lcom/arist/activity/MyApplication;->f:I

    if-nez v0, :cond_7

    sget v0, Lcom/arist/activity/MyApplication;->g:I

    if-eq v0, v1, :cond_8

    :cond_7
    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->e()V

    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    iget-object v4, p0, Lcom/arist/service/MusicPlayService;->o:Lcom/arist/model/b/c;

    invoke-virtual {v4}, Lcom/arist/model/b/c;->e()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/arist/b/c;->a(Ljava/util/ArrayList;)V

    :cond_8
    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    const/4 v0, 0x2

    sput v0, Lcom/arist/activity/MyApplication;->j:I

    invoke-static {}, Lcom/arist/activity/MyApplication;->a()V

    new-instance v0, Landroid/content/Intent;

    sget-object v4, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_1

    :cond_9
    const v0, 0x7f0900c6

    invoke-direct {p0, v0}, Lcom/arist/service/MusicPlayService;->a(I)V

    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->c()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_1

    :cond_a
    move v0, v2

    goto/16 :goto_2
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 6

    const/16 v4, 0x15

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "MusicPlayService"

    const-string v1, "onCreate()"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v0, Lcom/arist/model/b/c;

    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/arist/model/b/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->o:Lcom/arist/model/b/c;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v4, :cond_0

    new-instance v0, Lcom/arist/service/p;

    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/arist/service/p;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    invoke-virtual {v0}, Lcom/arist/service/p;->a()V

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    invoke-virtual {v0}, Lcom/arist/service/p;->c()V

    :cond_0
    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v4, :cond_2

    new-instance v0, Lcom/arist/service/l;

    invoke-direct {v0, v1}, Lcom/arist/service/l;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->q:Lcom/arist/service/o;

    new-instance v0, Lcom/arist/service/b;

    invoke-direct {v0}, Lcom/arist/service/b;-><init>()V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->c:Lcom/arist/service/b;

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->c:Lcom/arist/service/b;

    invoke-virtual {v0, p0}, Lcom/arist/service/b;->a(Lcom/arist/service/MusicPlayService;)V

    new-instance v0, Lcom/arist/b/b;

    invoke-direct {v0}, Lcom/arist/b/b;-><init>()V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->j:Lcom/arist/b/b;

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->j:Lcom/arist/b/b;

    const-string v1, "last"

    invoke-virtual {v0, v1}, Lcom/arist/b/b;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->l:Landroid/os/Handler;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->n:Ljava/util/Random;

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/arist/c/e;->a()Landroid/media/MediaPlayer;

    move-result-object v0

    sput-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    :cond_1
    invoke-static {}, Lcom/arist/model/equize/j;->a()Lcom/arist/model/equize/j;

    move-result-object v0

    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v4, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v4}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v4

    invoke-virtual {v0, v1, v4}, Lcom/arist/model/equize/j;->a(Landroid/content/Context;I)V

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/arist/service/f;

    invoke-direct {v1, p0}, Lcom/arist/service/f;-><init>(Lcom/arist/service/MusicPlayService;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    new-instance v0, Lcom/arist/service/k;

    invoke-direct {v0, p0}, Lcom/arist/service/k;-><init>(Lcom/arist/service/MusicPlayService;)V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->d:Lcom/arist/service/k;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    sget-object v1, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/service/MusicPlayService;->d:Lcom/arist/service/k;

    invoke-virtual {p0, v1, v0}, Lcom/arist/service/MusicPlayService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const-string v0, "audio"

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->m:Landroid/media/AudioManager;

    new-instance v1, Lcom/arist/service/j;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/arist/service/j;-><init>(Lcom/arist/service/MusicPlayService;B)V

    const-string v0, "phone"

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    const/16 v4, 0x20

    invoke-virtual {v0, v1, v4}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    const-string v0, "sensor"

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->f:Landroid/hardware/SensorManager;

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->f:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/arist/service/MusicPlayService;->t:Landroid/hardware/SensorEventListener;

    iget-object v4, p0, Lcom/arist/service/MusicPlayService;->f:Landroid/hardware/SensorManager;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v4

    const/4 v5, 0x3

    invoke-virtual {v0, v1, v4, v5}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    const-string v0, "MusicPlayService"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "onCreate() \u6267\u884c\u65f6\u95f4: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    new-instance v0, Lcom/arist/service/m;

    invoke-direct {v0, v1}, Lcom/arist/service/m;-><init>(Landroid/content/Context;)V

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 4

    const/4 v3, 0x0

    const-string v0, "MusicPlayService"

    const-string v1, "onDestory()"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    const-class v2, Lcom/arist/service/DeskLrcService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->stopService(Landroid/content/Intent;)Z

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/arist/service/MusicPlayService;->b:Z

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->stopForeground(Z)V

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->q:Lcom/arist/service/o;

    invoke-virtual {v0}, Lcom/arist/service/o;->b()V

    sget-object v0, Lcom/arist/activity/MyApplication;->d:Lcom/arist/activity/MyApplication;

    iget-object v0, v0, Lcom/arist/activity/MyApplication;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {}, Lcom/arist/model/equize/j;->a()Lcom/arist/model/equize/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/model/equize/j;->c()V

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->d:Lcom/arist/service/k;

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    invoke-virtual {v0}, Lcom/arist/service/p;->b()V

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    invoke-virtual {v0}, Lcom/arist/service/p;->d()V

    iput-object v3, p0, Lcom/arist/service/MusicPlayService;->p:Lcom/arist/service/p;

    :cond_1
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->c:Lcom/arist/service/b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->c:Lcom/arist/service/b;

    invoke-virtual {v0, p0}, Lcom/arist/service/b;->a(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/arist/service/MusicPlayService;->c:Lcom/arist/service/b;

    :cond_2
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->f:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->f:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/arist/service/MusicPlayService;->t:Landroid/hardware/SensorEventListener;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    iput-object v3, p0, Lcom/arist/service/MusicPlayService;->f:Landroid/hardware/SensorManager;

    :cond_3
    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_4

    const-string v0, "MusicPlayService"

    const-string v1, "\u91ca\u653eMediaPlayer"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    sput-object v3, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    :cond_4
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->i:Ljava/util/Timer;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->i:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iput-object v3, p0, Lcom/arist/service/MusicPlayService;->i:Ljava/util/Timer;

    :cond_5
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    sget-object v0, Lcom/arist/activity/MyApplication;->d:Lcom/arist/activity/MyApplication;

    invoke-virtual {v0}, Lcom/arist/activity/MyApplication;->h()V

    return-void

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/arist/activity/EqualizerActivity;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    const/4 v1, 0x1

    const-string v2, "MusicPlayService"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v0, "onStartCommand : "

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p1, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "----"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "-------"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    if-eqz p1, :cond_0

    sput-boolean v1, Lcom/arist/service/MusicPlayService;->b:Z

    :cond_0
    const/4 v0, 0x2

    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
