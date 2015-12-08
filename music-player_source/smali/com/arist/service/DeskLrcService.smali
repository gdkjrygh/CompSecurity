.class public Lcom/arist/service/DeskLrcService;
.super Landroid/app/Service;

# interfaces
.implements Lcom/arist/model/lrc/d;


# instance fields
.field private a:Z

.field private b:Landroid/view/WindowManager;

.field private c:Landroid/view/WindowManager$LayoutParams;

.field private d:Lcom/arist/c/f;

.field private e:I

.field private f:I

.field private g:Lcom/arist/model/lrc/DeskLrcView;

.field private h:Lcom/arist/service/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/service/DeskLrcService;->a:Z

    return-void
.end method

.method static synthetic a(Lcom/arist/service/DeskLrcService;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arist/service/DeskLrcService;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 3

    const-string v0, "DeskLrcService"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "showDeskLrc:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lcom/arist/service/DeskLrcService;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/service/DeskLrcService;->a:Z

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->b:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/arist/service/DeskLrcService;->g:Lcom/arist/model/lrc/DeskLrcView;

    iget-object v2, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p1, :cond_0

    iget-boolean v0, p0, Lcom/arist/service/DeskLrcService;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/service/DeskLrcService;->a:Z

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->b:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/arist/service/DeskLrcService;->g:Lcom/arist/model/lrc/DeskLrcView;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v1, 0x0

    const v0, 0x7f0900eb

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-direct {p0, v1}, Lcom/arist/service/DeskLrcService;->a(Z)V

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->d:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->e()V

    return-void
.end method

.method public final a(I)V
    .locals 3

    iget v0, p0, Lcom/arist/service/DeskLrcService;->e:I

    add-int/2addr v0, p1

    if-gez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    iget v1, p0, Lcom/arist/service/DeskLrcService;->f:I

    if-le v0, v1, :cond_1

    iget v0, p0, Lcom/arist/service/DeskLrcService;->f:I

    :cond_1
    iget v1, p0, Lcom/arist/service/DeskLrcService;->e:I

    if-eq v1, v0, :cond_2

    iput v0, p0, Lcom/arist/service/DeskLrcService;->e:I

    iget-object v1, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->b:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/arist/service/DeskLrcService;->g:Lcom/arist/model/lrc/DeskLrcView;

    iget-object v2, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method

.method public final a(Lcom/arist/b/b;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->g:Lcom/arist/model/lrc/DeskLrcView;

    invoke-static {p1, v0}, Lcom/arist/model/lrc/e;->a(Lcom/arist/b/b;Lcom/arist/model/lrc/LrcView;)V

    return-void
.end method

.method public final b(I)V
    .locals 4

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->g:Lcom/arist/model/lrc/DeskLrcView;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Lcom/arist/model/lrc/DeskLrcView;->a(J)V

    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, Lcom/arist/service/a;

    invoke-direct {v0, p0}, Lcom/arist/service/a;-><init>(Lcom/arist/service/DeskLrcService;)V

    iput-object v0, p0, Lcom/arist/service/DeskLrcService;->h:Lcom/arist/service/a;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    sget-object v1, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/service/DeskLrcService;->h:Lcom/arist/service/a;

    invoke-virtual {p0, v1, v0}, Lcom/arist/service/DeskLrcService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v0, Lcom/arist/c/f;

    invoke-virtual {p0}, Lcom/arist/service/DeskLrcService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/arist/c/f;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/service/DeskLrcService;->d:Lcom/arist/c/f;

    invoke-virtual {p0}, Lcom/arist/service/DeskLrcService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/arist/service/DeskLrcService;->f:I

    new-instance v0, Lcom/arist/model/lrc/DeskLrcView;

    invoke-virtual {p0}, Lcom/arist/service/DeskLrcService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/arist/model/lrc/DeskLrcView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/service/DeskLrcService;->g:Lcom/arist/model/lrc/DeskLrcView;

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->g:Lcom/arist/model/lrc/DeskLrcView;

    invoke-virtual {v0, p0}, Lcom/arist/model/lrc/DeskLrcView;->a(Lcom/arist/model/lrc/d;)V

    invoke-virtual {p0}, Lcom/arist/service/DeskLrcService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/arist/service/DeskLrcService;->b:Landroid/view/WindowManager;

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x7d7

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x28

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x31

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->d:Lcom/arist/c/f;

    iget v1, p0, Lcom/arist/service/DeskLrcService;->f:I

    iget-object v2, p0, Lcom/arist/service/DeskLrcService;->g:Lcom/arist/model/lrc/DeskLrcView;

    invoke-virtual {v2}, Lcom/arist/model/lrc/DeskLrcView;->a()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Lcom/arist/c/f;->e(I)I

    move-result v0

    iput v0, p0, Lcom/arist/service/DeskLrcService;->e:I

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->c:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/arist/service/DeskLrcService;->e:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/service/DeskLrcService;->a(Lcom/arist/b/b;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->h:Lcom/arist/service/a;

    invoke-virtual {p0, v0}, Lcom/arist/service/DeskLrcService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/arist/service/DeskLrcService;->a(Z)V

    iget-object v0, p0, Lcom/arist/service/DeskLrcService;->d:Lcom/arist/c/f;

    iget v1, p0, Lcom/arist/service/DeskLrcService;->e:I

    invoke-virtual {v0, v1}, Lcom/arist/c/f;->d(I)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 7

    const/4 v1, 0x1

    const/4 v6, 0x2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v6

    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const-string v3, "desk_lrc_action_activity_changed"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v2, "desk_lrc_action_activity_changed_key"

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "DeskLrcService"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "change:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eq v2, v1, :cond_2

    if-ne v2, v6, :cond_0

    :cond_2
    if-ne v2, v6, :cond_3

    invoke-virtual {p0}, Lcom/arist/service/DeskLrcService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/arist/c/g;->a(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    :goto_1
    invoke-direct {p0, v0}, Lcom/arist/service/DeskLrcService;->a(Z)V

    const-string v1, "DeskLrcService"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "showDeskLrc:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1

    :cond_5
    const-string v1, "desk_lrc_action_stop"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/arist/service/DeskLrcService;->a(Z)V

    invoke-virtual {p0}, Lcom/arist/service/DeskLrcService;->stopSelf()V

    goto :goto_0
.end method
