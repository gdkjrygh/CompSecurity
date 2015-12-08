.class public Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;
.super Lcom/kik/sdkutils/KikServiceBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$c;,
        Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;,
        Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private b:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;

.field private c:Ljava/util/concurrent/ConcurrentHashMap;

.field private d:Landroid/app/AlarmManager;

.field private e:Landroid/os/PowerManager;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-string v0, "KikExecutor"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/kik/sdkutils/KikServiceBase;-><init>()V

    .line 32
    new-instance v0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;

    invoke-direct {v0, p0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;-><init>(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)V

    iput-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->b:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;

    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->f:I

    .line 316
    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 4

    .prologue
    .line 40
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 41
    const-string v1, "TAG"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    invoke-virtual {p0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/high16 v3, 0x8000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->c:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method static synthetic b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Landroid/app/AlarmManager;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->d:Landroid/app/AlarmManager;

    return-object v0
.end method

.method static synthetic c(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Landroid/os/PowerManager;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->e:Landroid/os/PowerManager;

    return-object v0
.end method

.method static synthetic d(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)I
    .locals 2

    .prologue
    .line 26
    iget v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->f:I

    return v0
.end method

.method static synthetic e(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)I
    .locals 2

    .prologue
    .line 26
    iget v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->f:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->f:I

    return v0
.end method

.method static synthetic f(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;)Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->b:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;

    return-object v0
.end method


# virtual methods
.method protected final a(Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 49
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->d:Landroid/app/AlarmManager;

    if-nez v0, :cond_0

    .line 50
    const-string v0, "power"

    invoke-virtual {p0, v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->e:Landroid/os/PowerManager;

    .line 52
    :cond_0
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->d:Landroid/app/AlarmManager;

    if-nez v0, :cond_1

    .line 53
    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->d:Landroid/app/AlarmManager;

    .line 56
    :cond_1
    if-eqz p1, :cond_2

    .line 57
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 58
    if-eqz v1, :cond_2

    const-string v0, "com.kik-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 60
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;

    .line 61
    if-nez v0, :cond_3

    .line 63
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->d:Landroid/app/AlarmManager;

    invoke-direct {p0, v1}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 74
    :cond_2
    :goto_0
    return-void

    .line 67
    :cond_3
    invoke-static {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->a(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)V

    .line 68
    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->a()Z

    move-result v1

    if-nez v1, :cond_4

    .line 69
    iget-object v1, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->b(Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_4
    iget-object v1, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->b:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;

    invoke-virtual {v1, v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 83
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService;->b:Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;

    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$a;->shutdownNow()Ljava/util/List;

    move-result-object v0

    .line 86
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 87
    instance-of v2, v0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;

    if-eqz v2, :cond_0

    .line 88
    check-cast v0, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lkik/android/sdkutils/concurrent/AlarmManagerExecutorService$b;->cancel(Z)Z

    goto :goto_0

    .line 92
    :cond_1
    invoke-super {p0}, Lcom/kik/sdkutils/KikServiceBase;->onDestroy()V

    .line 93
    return-void
.end method
