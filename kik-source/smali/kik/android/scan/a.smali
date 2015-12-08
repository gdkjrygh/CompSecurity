.class public final Lkik/android/scan/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# static fields
.field private static d:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field private final a:Landroid/hardware/Camera;

.field private final b:I

.field private c:Z

.field private final e:Lorg/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lkik/android/scan/a;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/hardware/Camera;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/scan/a;->c:Z

    .line 19
    const-string v0, "ScanFocus"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    iput-object v0, p0, Lkik/android/scan/a;->e:Lorg/c/b;

    .line 24
    iput-object p1, p0, Lkik/android/scan/a;->a:Landroid/hardware/Camera;

    .line 25
    const/16 v0, 0x3e8

    iput v0, p0, Lkik/android/scan/a;->b:I

    .line 26
    return-void
.end method

.method static synthetic a(Lkik/android/scan/a;)Lorg/c/b;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lkik/android/scan/a;->e:Lorg/c/b;

    return-object v0
.end method

.method static synthetic b(Lkik/android/scan/a;)Z
    .locals 1

    .prologue
    .line 13
    iget-boolean v0, p0, Lkik/android/scan/a;->c:Z

    return v0
.end method

.method static synthetic c(Lkik/android/scan/a;)Landroid/hardware/Camera;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lkik/android/scan/a;->a:Landroid/hardware/Camera;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    .line 30
    sget-object v0, Lkik/android/scan/a;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lkik/android/scan/b;

    invoke-direct {v1, p0}, Lkik/android/scan/b;-><init>(Lkik/android/scan/a;)V

    iget v2, p0, Lkik/android/scan/a;->b:I

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 40
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/scan/a;->c:Z

    .line 45
    return-void
.end method

.method public final onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 0

    .prologue
    .line 49
    invoke-virtual {p0}, Lkik/android/scan/a;->a()V

    .line 50
    return-void
.end method
