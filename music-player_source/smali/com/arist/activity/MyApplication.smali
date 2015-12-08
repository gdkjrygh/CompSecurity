.class public Lcom/arist/activity/MyApplication;
.super Landroid/app/Application;


# static fields
.field public static a:Landroid/media/MediaPlayer;

.field public static c:Ljava/util/Timer;

.field public static d:Lcom/arist/activity/MyApplication;

.field public static e:Lcom/arist/c/f;

.field public static f:I

.field public static g:I

.field public static h:I

.field public static i:I

.field public static j:I

.field public static k:Z

.field public static l:Ljava/util/ArrayList;

.field public static m:Ljava/util/ArrayList;

.field public static n:Ljava/util/ArrayList;

.field public static o:Ljava/util/ArrayList;

.field public static p:Ljava/util/ArrayList;

.field public static q:Landroid/content/Context;

.field public static r:Z

.field public static s:Z

.field private static t:Lcom/arist/b/b;

.field private static u:I


# instance fields
.field public b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    sput v1, Lcom/arist/activity/MyApplication;->f:I

    sput v1, Lcom/arist/activity/MyApplication;->g:I

    sput v1, Lcom/arist/activity/MyApplication;->h:I

    const/4 v0, 0x1

    sput v0, Lcom/arist/activity/MyApplication;->j:I

    sput-boolean v1, Lcom/arist/activity/MyApplication;->k:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/activity/MyApplication;->m:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/activity/MyApplication;->n:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/activity/MyApplication;->o:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    sput-boolean v1, Lcom/arist/activity/MyApplication;->r:Z

    sput-boolean v1, Lcom/arist/activity/MyApplication;->s:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/arist/activity/MyApplication;->b:Ljava/util/List;

    return-void
.end method

.method public static a()V
    .locals 2

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    sget v1, Lcom/arist/activity/MyApplication;->f:I

    invoke-virtual {v0, v1}, Lcom/arist/c/f;->b(I)V

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    sget v1, Lcom/arist/activity/MyApplication;->g:I

    invoke-virtual {v0, v1}, Lcom/arist/c/f;->a(I)V

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/c/f;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(I)V
    .locals 0

    sput p0, Lcom/arist/activity/MyApplication;->u:I

    return-void
.end method

.method public static b()I
    .locals 1

    sget-object v0, Lcom/arist/activity/MyApplication;->t:Lcom/arist/b/b;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/arist/activity/MyApplication;->t:Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->g()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const v0, 0x493e0

    :goto_0
    return v0

    :cond_1
    sget-object v0, Lcom/arist/activity/MyApplication;->t:Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->g()I

    move-result v0

    goto :goto_0
.end method

.method public static c()I
    .locals 1

    :try_start_0
    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static d()Z
    .locals 1

    :try_start_0
    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static e()Ljava/util/ArrayList;
    .locals 1

    sget v0, Lcom/arist/activity/MyApplication;->f:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lcom/arist/activity/MyApplication;->n:Ljava/util/ArrayList;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/arist/activity/MyApplication;->o:Ljava/util/ArrayList;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/arist/activity/MyApplication;->m:Ljava/util/ArrayList;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static f()Lcom/arist/b/c;
    .locals 3

    const/4 v2, 0x0

    sget v0, Lcom/arist/activity/MyApplication;->g:I

    invoke-static {}, Lcom/arist/activity/MyApplication;->e()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    sget v0, Lcom/arist/activity/MyApplication;->g:I

    if-gez v0, :cond_1

    :cond_0
    sput v2, Lcom/arist/activity/MyApplication;->g:I

    sput v2, Lcom/arist/activity/MyApplication;->h:I

    :cond_1
    :try_start_0
    invoke-static {}, Lcom/arist/activity/MyApplication;->e()Ljava/util/ArrayList;

    move-result-object v0

    sget v1, Lcom/arist/activity/MyApplication;->g:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/arist/b/c;->h()Lcom/arist/b/c;

    move-result-object v0

    goto :goto_0
.end method

.method public static g()Lcom/arist/b/b;
    .locals 5

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/arist/b/b;

    const-string v1, "Title"

    const-string v2, ""

    const-string v3, "1"

    const-string v4, "Artist"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/arist/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_0
    sget v0, Lcom/arist/activity/MyApplication;->h:I

    if-gez v0, :cond_1

    const/4 v0, 0x0

    sput v0, Lcom/arist/activity/MyApplication;->h:I

    :cond_1
    sget v0, Lcom/arist/activity/MyApplication;->h:I

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_2

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/arist/activity/MyApplication;->h:I

    :cond_2
    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    sget v1, Lcom/arist/activity/MyApplication;->h:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    sput-object v0, Lcom/arist/activity/MyApplication;->t:Lcom/arist/b/b;

    const-string v0, "size_last"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "size="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/arist/activity/MyApplication;->e()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--firstPoistion:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/arist/activity/MyApplication;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--secondPosition:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/arist/activity/MyApplication;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--thirdPosition:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/arist/activity/MyApplication;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/activity/MyApplication;->t:Lcom/arist/b/b;

    goto :goto_0
.end method

.method static synthetic i()I
    .locals 1

    sget v0, Lcom/arist/activity/MyApplication;->u:I

    return v0
.end method


# virtual methods
.method public final h()V
    .locals 4

    const/4 v3, 0x0

    const-string v0, "MyApplication"

    const-string v1, "\u9000\u51fa"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/activity/MyApplication;->c:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    const-class v2, Lcom/arist/service/MusicPlayService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MyApplication;->stopService(Landroid/content/Intent;)Z

    invoke-virtual {p0}, Lcom/arist/activity/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/arist/model/scan/MediaScanService;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/arist/c/j;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/arist/activity/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/model/scan/MediaScanService;->b(Landroid/content/Context;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/arist/activity/MyApplication;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    const-string v0, "MyApplication"

    const-string v1, "\u91ca\u653eMediaPlayer"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    sput-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    :cond_1
    invoke-static {v3}, Ljava/lang/System;->exit(I)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/arist/activity/MyApplication;->b:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public onCreate()V
    .locals 8

    const/4 v2, 0x0

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    const-string v0, "MyApplication"

    const-string v1, "onCreate()"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {}, Lcom/arist/model/errorinfo/a;->a()Lcom/arist/model/errorinfo/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/arist/activity/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/model/errorinfo/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/ijoysoft/a/a;->a()Lcom/ijoysoft/a/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/arist/activity/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ijoysoft/a/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/ijoysoft/a/a;->a()Lcom/ijoysoft/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ijoysoft/a/a;->c()V

    invoke-virtual {p0}, Lcom/arist/activity/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    sput-object p0, Lcom/arist/activity/MyApplication;->d:Lcom/arist/activity/MyApplication;

    invoke-static {}, Lcom/arist/c/e;->a()Landroid/media/MediaPlayer;

    move-result-object v0

    sput-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Lcom/arist/activity/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/c/a/a;->a(Landroid/content/Context;)V

    new-instance v0, Lcom/arist/model/a/b;

    invoke-direct {v0}, Lcom/arist/model/a/b;-><init>()V

    invoke-virtual {v0}, Lcom/arist/model/a/b;->a()V

    new-instance v0, Lcom/arist/c/f;

    sget-object v1, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/arist/c/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->d()I

    move-result v0

    sput v0, Lcom/arist/activity/MyApplication;->i:I

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->c()I

    move-result v0

    sput v0, Lcom/arist/activity/MyApplication;->f:I

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->b()I

    move-result v0

    sput v0, Lcom/arist/activity/MyApplication;->g:I

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->f()Z

    move-result v0

    sput-boolean v0, Lcom/arist/activity/MyApplication;->r:Z

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    sget-object v1, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v1}, Lcom/arist/c/f;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/b;->a(I)V

    const/4 v0, -0x1

    sput v0, Lcom/arist/activity/MyApplication;->h:I

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    :goto_1
    sget v0, Lcom/arist/activity/MyApplication;->h:I

    if-gez v0, :cond_0

    sput v2, Lcom/arist/activity/MyApplication;->f:I

    sput v2, Lcom/arist/activity/MyApplication;->g:I

    sput v2, Lcom/arist/activity/MyApplication;->h:I

    :cond_0
    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lcom/arist/activity/MyApplication;->c:Ljava/util/Timer;

    new-instance v1, Lcom/arist/activity/aj;

    invoke-direct {v1}, Lcom/arist/activity/aj;-><init>()V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x3e8

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    invoke-virtual {p0}, Lcom/arist/activity/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ijoysoft/appwall/a;->a(Landroid/content/Context;)V

    const-string v0, "MyApplication"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u542f\u52a8\u65f6\u95f4:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v6

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sput v1, Lcom/arist/activity/MyApplication;->h:I

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method
