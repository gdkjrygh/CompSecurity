.class public Lcom/arist/model/scan/MediaScanService;
.super Landroid/app/Service;

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# static fields
.field private static final a:Ljava/util/List;

.field private static f:I


# instance fields
.field private b:[Ljava/lang/String;

.field private c:Landroid/media/MediaScannerConnection;

.field private d:I

.field private e:Lcom/arist/model/scan/e;

.field private g:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/model/scan/MediaScanService;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/arist/model/scan/c;

    invoke-direct {v0, p0}, Lcom/arist/model/scan/c;-><init>(Lcom/arist/model/scan/MediaScanService;)V

    iput-object v0, p0, Lcom/arist/model/scan/MediaScanService;->g:Landroid/os/Handler;

    return-void
.end method

.method public static a()I
    .locals 1

    sget v0, Lcom/arist/model/scan/MediaScanService;->f:I

    return v0
.end method

.method static a(ILjava/lang/Object;)V
    .locals 3

    if-eqz p0, :cond_1

    sget v0, Lcom/arist/model/scan/MediaScanService;->f:I

    if-nez v0, :cond_1

    sput p0, Lcom/arist/model/scan/MediaScanService;->f:I

    :cond_0
    return-void

    :cond_1
    sput p0, Lcom/arist/model/scan/MediaScanService;->f:I

    sget-object v0, Lcom/arist/model/scan/MediaScanService;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/model/scan/d;

    if-eqz v0, :cond_2

    sget v2, Lcom/arist/model/scan/MediaScanService;->f:I

    invoke-interface {v0, v2, p1}, Lcom/arist/model/scan/d;->a(ILjava/lang/Object;)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/arist/model/scan/MediaScanService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method static synthetic a(Lcom/arist/model/scan/MediaScanService;)V
    .locals 2

    const/4 v1, 0x3

    invoke-static {}, Lcom/arist/model/scan/MediaScanService;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sput v1, Lcom/arist/model/scan/MediaScanService;->f:I

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/arist/model/scan/MediaScanService;->a(ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/arist/model/scan/MediaScanService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/model/scan/MediaScanService;->g:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/arist/model/scan/f;->a(Landroid/content/Context;Landroid/os/Handler;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/arist/model/scan/MediaScanService;[Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/model/scan/MediaScanService;->d:I

    iput-object p1, p0, Lcom/arist/model/scan/MediaScanService;->b:[Ljava/lang/String;

    new-instance v0, Landroid/media/MediaScannerConnection;

    invoke-virtual {p0}, Lcom/arist/model/scan/MediaScanService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    iput-object v0, p0, Lcom/arist/model/scan/MediaScanService;->c:Landroid/media/MediaScannerConnection;

    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->c:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->connect()V

    return-void
.end method

.method public static a(Lcom/arist/model/scan/d;)V
    .locals 1

    sget-object v0, Lcom/arist/model/scan/MediaScanService;->a:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/arist/model/scan/MediaScanService;->a:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/arist/model/scan/MediaScanService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "exit"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public static b(Lcom/arist/model/scan/d;)V
    .locals 1

    sget-object v0, Lcom/arist/model/scan/MediaScanService;->a:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static b()Z
    .locals 2

    sget v0, Lcom/arist/model/scan/MediaScanService;->f:I

    if-eqz v0, :cond_0

    sget v0, Lcom/arist/model/scan/MediaScanService;->f:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static c()V
    .locals 2

    sget v0, Lcom/arist/model/scan/MediaScanService;->f:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    sput v0, Lcom/arist/model/scan/MediaScanService;->f:I

    :cond_0
    return-void
.end method

.method private d()V
    .locals 3

    sget v0, Lcom/arist/model/scan/MediaScanService;->f:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->b:[Ljava/lang/String;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/arist/model/scan/MediaScanService;->d:I

    iget-object v1, p0, Lcom/arist/model/scan/MediaScanService;->b:[Ljava/lang/String;

    array-length v1, v1

    if-lt v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->g:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->c:Landroid/media/MediaScannerConnection;

    iget-object v1, p0, Lcom/arist/model/scan/MediaScanService;->b:[Ljava/lang/String;

    iget v2, p0, Lcom/arist/model/scan/MediaScanService;->d:I

    aget-object v1, v1, v2

    const-string v2, "audio/*"

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private e()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->e:Lcom/arist/model/scan/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->e:Lcom/arist/model/scan/e;

    invoke-virtual {v0}, Lcom/arist/model/scan/e;->a()V

    iput-object v1, p0, Lcom/arist/model/scan/MediaScanService;->e:Lcom/arist/model/scan/e;

    :cond_0
    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->c:Landroid/media/MediaScannerConnection;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->c:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->c:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V

    :cond_1
    iput-object v1, p0, Lcom/arist/model/scan/MediaScanService;->c:Landroid/media/MediaScannerConnection;

    iput-object v1, p0, Lcom/arist/model/scan/MediaScanService;->b:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onDestroy()V
    .locals 0

    invoke-direct {p0}, Lcom/arist/model/scan/MediaScanService;->e()V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onMediaScannerConnected()V
    .locals 0

    invoke-direct {p0}, Lcom/arist/model/scan/MediaScanService;->d()V

    return-void
.end method

.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 4

    iget v0, p0, Lcom/arist/model/scan/MediaScanService;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/arist/model/scan/MediaScanService;->d:I

    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->g:Landroid/os/Handler;

    const/4 v1, 0x2

    iget v2, p0, Lcom/arist/model/scan/MediaScanService;->d:I

    iget-object v3, p0, Lcom/arist/model/scan/MediaScanService;->b:[Ljava/lang/String;

    array-length v3, v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    invoke-direct {p0}, Lcom/arist/model/scan/MediaScanService;->d()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    const/4 v4, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    const-string v0, "exit"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/arist/model/scan/MediaScanService;->a(ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/arist/model/scan/MediaScanService;->e()V

    invoke-virtual {p0}, Lcom/arist/model/scan/MediaScanService;->stopSelf()V

    :cond_0
    :goto_0
    return v4

    :cond_1
    invoke-static {}, Lcom/arist/model/scan/MediaScanService;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-static {v4, v0}, Lcom/arist/model/scan/MediaScanService;->a(ILjava/lang/Object;)V

    new-instance v0, Lcom/arist/model/scan/e;

    invoke-virtual {p0}, Lcom/arist/model/scan/MediaScanService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/model/scan/MediaScanService;->g:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/arist/model/scan/MediaScanService;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/arist/c/c;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/arist/model/scan/e;-><init>(Landroid/content/ContentResolver;Landroid/os/Handler;Ljava/util/List;)V

    iput-object v0, p0, Lcom/arist/model/scan/MediaScanService;->e:Lcom/arist/model/scan/e;

    iget-object v0, p0, Lcom/arist/model/scan/MediaScanService;->e:Lcom/arist/model/scan/e;

    invoke-virtual {v0}, Lcom/arist/model/scan/e;->start()V

    goto :goto_0
.end method
