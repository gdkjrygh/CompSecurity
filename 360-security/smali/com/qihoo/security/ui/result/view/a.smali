.class public Lcom/qihoo/security/ui/result/view/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo/security/ui/result/view/a;


# instance fields
.field private final b:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method private constructor <init>()V
    .locals 3

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/a;->b:Landroid/content/Context;

    .line 30
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->c(Landroid/content/Context;)I

    move-result v0

    .line 31
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/a;->b:Landroid/content/Context;

    const v2, 0x7f09001c

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;I)I

    move-result v1

    .line 32
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/a;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;)I

    move-result v2

    sub-int v0, v2, v0

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/ui/result/view/a;->f:I

    .line 34
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/a;->f()V

    .line 35
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/ui/result/view/a;
    .locals 2

    .prologue
    .line 21
    const-class v1, Lcom/qihoo/security/ui/result/view/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/result/view/a;->a:Lcom/qihoo/security/ui/result/view/a;

    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lcom/qihoo/security/ui/result/view/a;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/view/a;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/result/view/a;->a:Lcom/qihoo/security/ui/result/view/a;

    .line 24
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/result/view/a;->a:Lcom/qihoo/security/ui/result/view/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 38
    iget v0, p0, Lcom/qihoo/security/ui/result/view/a;->f:I

    int-to-float v0, v0

    const/high16 v1, 0x42610000    # 56.25f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/result/view/a;->c:I

    .line 39
    iget v0, p0, Lcom/qihoo/security/ui/result/view/a;->f:I

    int-to-double v0, v0

    const-wide v2, 0x4034c00000000000L    # 20.75

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/result/view/a;->d:I

    .line 40
    iget v0, p0, Lcom/qihoo/security/ui/result/view/a;->f:I

    mul-int/lit8 v0, v0, 0x17

    div-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/qihoo/security/ui/result/view/a;->e:I

    .line 45
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/qihoo/security/ui/result/view/a;->f:I

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/qihoo/security/ui/result/view/a;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/qihoo/security/ui/result/view/a;->e:I

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/qihoo/security/ui/result/view/a;->d:I

    return v0
.end method
