.class public Lcom/qihoo/security/widget/a;
.super Landroid/widget/RelativeLayout;
.source "360Security"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/widget/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static final m:[Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Landroid/hardware/Camera;

.field private d:Landroid/view/WindowManager;

.field private e:Landroid/view/WindowManager$LayoutParams;

.field private f:Landroid/view/SurfaceView;

.field private g:Landroid/view/SurfaceHolder;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:Landroid/app/AlarmManager;

.field private p:Landroid/app/PendingIntent;

.field private q:Lcom/qihoo/security/widget/a$a;

.field private r:Landroid/content/Intent;

.field private s:Landroid/os/Handler;

.field private final t:Ljava/lang/Object;

.field private u:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 32
    const-class v0, Lcom/qihoo/security/widget/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/widget/a;->a:Ljava/lang/String;

    .line 48
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string/jumbo v2, "XT531"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/widget/a;->m:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/widget/a$a;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, -0x1

    const/4 v4, 0x0

    .line 78
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/a;->l:Z

    .line 49
    iput-object v4, p0, Lcom/qihoo/security/widget/a;->n:Ljava/util/List;

    .line 50
    iput-object v4, p0, Lcom/qihoo/security/widget/a;->o:Landroid/app/AlarmManager;

    .line 51
    iput-object v4, p0, Lcom/qihoo/security/widget/a;->p:Landroid/app/PendingIntent;

    .line 54
    new-instance v0, Lcom/qihoo/security/widget/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/widget/a$1;-><init>(Lcom/qihoo/security/widget/a;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->s:Landroid/os/Handler;

    .line 377
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->t:Ljava/lang/Object;

    .line 411
    new-instance v0, Lcom/qihoo/security/widget/a$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/widget/a$3;-><init>(Lcom/qihoo/security/widget/a;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->u:Landroid/content/BroadcastReceiver;

    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->b:Landroid/content/Context;

    .line 80
    iput-object p2, p0, Lcom/qihoo/security/widget/a;->q:Lcom/qihoo/security/widget/a$a;

    .line 81
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->h()V

    .line 82
    const v0, 0x7f03004e

    invoke-static {p1, v0, p0}, Lcom/qihoo/security/widget/a;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 83
    const v2, 0x7f0b010f

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->f:Landroid/view/SurfaceView;

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->f:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->g:Landroid/view/SurfaceHolder;

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->g:Landroid/view/SurfaceHolder;

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 86
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->g:Landroid/view/SurfaceHolder;

    const/4 v2, 0x3

    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 87
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/a;->h:Z

    .line 88
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 89
    const-string/jumbo v2, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 90
    const-string/jumbo v2, "com.qihoo.security.action.TURN_OFF_LIGHT"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 91
    iget-object v2, p0, Lcom/qihoo/security/widget/a;->u:Landroid/content/BroadcastReceiver;

    const-string/jumbo v3, "com.qihoo.security.lite.PERMISSION"

    invoke-virtual {p1, v2, v0, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 92
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v3, 0x7d2

    const/16 v4, 0x18

    const/4 v5, -0x3

    move v2, v1

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->e:Landroid/view/WindowManager$LayoutParams;

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->b:Landroid/content/Context;

    const-string/jumbo v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->d:Landroid/view/WindowManager;

    .line 99
    invoke-virtual {p0, v6}, Lcom/qihoo/security/widget/a;->setFocusableInTouchMode(Z)V

    .line 100
    invoke-virtual {p0, v6}, Lcom/qihoo/security/widget/a;->setFocusable(Z)V

    .line 101
    const-string/jumbo v0, "alarm"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->o:Landroid/app/AlarmManager;

    .line 102
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.action.TURN_OFF_LIGHT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->r:Landroid/content/Intent;

    .line 103
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/widget/a;Landroid/hardware/Camera;)Landroid/hardware/Camera;
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/widget/a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/qihoo/security/widget/a;->n:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/widget/a;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->l:Z

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/a;Z)Z
    .locals 0

    .prologue
    .line 30
    iput-boolean p1, p0, Lcom/qihoo/security/widget/a;->l:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->q:Lcom/qihoo/security/widget/a$a;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/widget/a;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->d()V

    return-void
.end method

.method private c()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 223
    :try_start_0
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 224
    sget-object v3, Lcom/qihoo/security/widget/a;->m:[Ljava/lang/String;

    array-length v4, v3

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_2

    aget-object v5, v3, v1

    .line 225
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 252
    :cond_0
    :goto_1
    return v0

    .line 224
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 230
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->getCamera()V

    .line 231
    iget-object v1, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    if-eqz v1, :cond_0

    .line 234
    iget-object v1, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    .line 235
    if-eqz v1, :cond_0

    .line 239
    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v1

    .line 240
    if-eqz v1, :cond_0

    .line 244
    const-string/jumbo v2, "torch"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string/jumbo v2, "on"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    .line 247
    :cond_3
    const/4 v0, 0x1

    goto :goto_1

    .line 248
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method private d()V
    .locals 6

    .prologue
    .line 258
    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->h:Z

    if-nez v0, :cond_1

    .line 310
    :cond_0
    :goto_0
    return-void

    .line 263
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->getCamera()V

    .line 264
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    .line 268
    if-eqz v0, :cond_0

    .line 271
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v1

    .line 272
    if-eqz v1, :cond_0

    .line 275
    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lcom/qihoo/security/widget/a;->setIsLightOn(Z)V

    .line 276
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v2

    .line 278
    const-string/jumbo v3, "torch"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 280
    const-string/jumbo v2, "torch"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 284
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->f()V

    .line 285
    const-string/jumbo v1, "torch"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 286
    iget-object v1, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 299
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->b:Landroid/content/Context;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/widget/a;->r:Landroid/content/Intent;

    const/high16 v3, 0x8000000

    invoke-static {v0, v1, v2, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->p:Landroid/app/PendingIntent;

    .line 300
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->o:Landroid/app/AlarmManager;

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->o:Landroid/app/AlarmManager;

    const/4 v1, 0x2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/32 v4, 0x2bf20

    add-long/2addr v2, v4

    iget-object v4, p0, Lcom/qihoo/security/widget/a;->p:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    goto :goto_0

    .line 305
    :catch_0
    move-exception v0

    goto :goto_0

    .line 287
    :cond_3
    const-string/jumbo v2, "on"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 291
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->f()V

    .line 292
    const-string/jumbo v1, "on"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 293
    iget-object v1, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1
.end method

.method static synthetic d(Lcom/qihoo/security/widget/a;)Z
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->getIsLightOn()Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/widget/a;)Landroid/hardware/Camera;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    .line 313
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->h:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->getIsLightOn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 315
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    if-nez v0, :cond_1

    .line 351
    :cond_0
    :goto_0
    return-void

    .line 319
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    .line 320
    if-eqz v0, :cond_0

    .line 324
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v1

    .line 325
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v2

    .line 328
    if-eqz v1, :cond_0

    .line 332
    const-string/jumbo v3, "off"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 334
    const-string/jumbo v2, "off"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 335
    const-string/jumbo v1, "off"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 336
    iget-object v1, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 341
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->o:Landroid/app/AlarmManager;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/widget/a;->p:Landroid/app/PendingIntent;

    if-eqz v0, :cond_3

    .line 342
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->o:Landroid/app/AlarmManager;

    iget-object v1, p0, Lcom/qihoo/security/widget/a;->p:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 343
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->p:Landroid/app/PendingIntent;

    .line 345
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/a;->setIsLightOn(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 347
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic f(Lcom/qihoo/security/widget/a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->n:Ljava/util/List;

    return-object v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 355
    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 356
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    .line 357
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/a;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 364
    :cond_0
    :goto_0
    return-void

    .line 359
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private g()V
    .locals 1

    .prologue
    .line 368
    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 370
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/a;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 375
    :cond_0
    :goto_0
    return-void

    .line 372
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic g(Lcom/qihoo/security/widget/a;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->e()V

    return-void
.end method

.method private getCamera()V
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 212
    :try_start_0
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    :cond_0
    :goto_0
    return-void

    .line 213
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private getIsLightOn()Z
    .locals 2

    .prologue
    .line 380
    iget-object v1, p0, Lcom/qihoo/security/widget/a;->t:Ljava/lang/Object;

    monitor-enter v1

    .line 381
    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->i:Z

    monitor-exit v1

    return v0

    .line 382
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 470
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/widget/a$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/a$4;-><init>(Lcom/qihoo/security/widget/a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 478
    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/widget/a;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->g()V

    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/widget/a;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->getCamera()V

    return-void
.end method

.method static synthetic j(Lcom/qihoo/security/widget/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->s:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/security/widget/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method private setIsLightOn(Z)V
    .locals 2

    .prologue
    .line 386
    iget-object v1, p0, Lcom/qihoo/security/widget/a;->t:Ljava/lang/Object;

    monitor-enter v1

    .line 387
    :try_start_0
    iput-boolean p1, p0, Lcom/qihoo/security/widget/a;->i:Z

    .line 388
    monitor-exit v1

    .line 389
    return-void

    .line 388
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 111
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->h:Z

    if-nez v0, :cond_1

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->q:Lcom/qihoo/security/widget/a$a;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->q:Lcom/qihoo/security/widget/a$a;

    invoke-interface {v0}, Lcom/qihoo/security/widget/a$a;->b()V

    .line 149
    :cond_0
    :goto_0
    return-void

    .line 118
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->k:Z

    if-nez v0, :cond_0

    .line 122
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/a;->k:Z

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->q:Lcom/qihoo/security/widget/a$a;

    if-eqz v0, :cond_2

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->q:Lcom/qihoo/security/widget/a$a;

    invoke-interface {v0, v4}, Lcom/qihoo/security/widget/a$a;->b(Z)V

    .line 129
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->d:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/qihoo/security/widget/a;->e:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :goto_1
    sget-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;->FUNC_NOTIFICATION_FLASHLIGHT:Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;

    invoke-static {v0}, Lcom/qihoo/security/quc/AccountLog;->a(Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;)V

    .line 133
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/widget/a$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/a$2;-><init>(Lcom/qihoo/security/widget/a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 148
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->s:Landroid/os/Handler;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 130
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 152
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->h:Z

    if-nez v0, :cond_2

    .line 154
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 155
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->e()V

    .line 156
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->g()V

    .line 157
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 158
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 163
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/widget/a;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 184
    :cond_1
    :goto_1
    return-void

    .line 169
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/widget/a;->k:Z

    if-eqz v0, :cond_1

    .line 173
    iput-boolean v1, p0, Lcom/qihoo/security/widget/a;->k:Z

    .line 176
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->d:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 180
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->s:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->s:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_1

    .line 177
    :catch_0
    move-exception v0

    goto :goto_2

    .line 160
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .prologue
    .line 188
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V

    .line 189
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 193
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    .line 195
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 196
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->e()V

    .line 197
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->g()V

    .line 198
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 199
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 205
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/widget/a;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 207
    :cond_1
    return-void

    .line 201
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .prologue
    .line 404
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .prologue
    .line 394
    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/widget/a;->getCamera()V

    .line 395
    iget-object v0, p0, Lcom/qihoo/security/widget/a;->c:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 399
    :goto_0
    return-void

    .line 396
    :catch_0
    move-exception v0

    .line 397
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    .prologue
    .line 409
    return-void
.end method
