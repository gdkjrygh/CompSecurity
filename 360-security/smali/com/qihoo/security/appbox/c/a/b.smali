.class public Lcom/qihoo/security/appbox/c/a/b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/appbox/c/a/b$a;,
        Lcom/qihoo/security/appbox/c/a/b$d;,
        Lcom/qihoo/security/appbox/c/a/b$c;,
        Lcom/qihoo/security/appbox/c/a/b$b;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static g:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private b:Landroid/os/Handler;

.field private c:Lcom/qihoo360/mobilesafe/core/d/b;

.field private final d:Lcom/android/volley/toolbox/g;

.field private final e:Lcom/qihoo/security/appbox/c/a/a;

.field private f:Lcom/qihoo/security/appbox/c/a/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-string/jumbo v0, "ImageCacheManager"

    sput-object v0, Lcom/qihoo/security/appbox/c/a/b;->a:Ljava/lang/String;

    .line 189
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/qihoo/security/appbox/c/a/b;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const/high16 v1, 0x100000

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "activity"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0

    mul-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x3

    .line 69
    new-instance v1, Lcom/qihoo/security/appbox/c/a/a;

    invoke-direct {v1, v0}, Lcom/qihoo/security/appbox/c/a/a;-><init>(I)V

    iput-object v1, p0, Lcom/qihoo/security/appbox/c/a/b;->e:Lcom/qihoo/security/appbox/c/a/a;

    .line 70
    new-instance v0, Lcom/android/volley/toolbox/g;

    invoke-static {}, Lcom/qihoo/security/appbox/c/b/a;->a()Lcom/android/volley/e;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/appbox/c/a/b;->e:Lcom/qihoo/security/appbox/c/a/a;

    invoke-direct {v0, v1, v2}, Lcom/android/volley/toolbox/g;-><init>(Lcom/android/volley/j;Lcom/android/volley/toolbox/g$b;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->d:Lcom/android/volley/toolbox/g;

    .line 71
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "ImageCacheManager"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 72
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 73
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo/security/appbox/c/a/b;->b:Landroid/os/Handler;

    .line 74
    new-instance v0, Lcom/qihoo/security/appbox/c/a/b$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/appbox/c/a/b$a;-><init>(Lcom/qihoo/security/appbox/c/a/b;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->f:Lcom/qihoo/security/appbox/c/a/b$a;

    .line 75
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/b;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/core/d/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->c:Lcom/qihoo360/mobilesafe/core/d/b;

    .line 76
    return-void
.end method

.method private a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/android/volley/toolbox/g$d;
    .locals 6

    .prologue
    .line 193
    sget-object v0, Lcom/qihoo/security/appbox/c/a/b;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 194
    const v0, 0x7f0b0006

    invoke-virtual {p1, v0, v3}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V

    .line 195
    new-instance v0, Lcom/qihoo/security/appbox/c/a/b$2;

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/appbox/c/a/b$2;-><init>(Lcom/qihoo/security/appbox/c/a/b;Landroid/widget/ImageView;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method public static a()Lcom/qihoo/security/appbox/c/a/b;
    .locals 1

    .prologue
    .line 111
    sget-object v0, Lcom/qihoo/security/appbox/c/a/b$d;->a:Lcom/qihoo/security/appbox/c/a/b;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/c/a/b;)Lcom/qihoo360/mobilesafe/core/d/b;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->c:Lcom/qihoo360/mobilesafe/core/d/b;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/appbox/c/a/b;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/qihoo/security/appbox/c/a/b;->d()V

    return-void
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/qihoo/security/appbox/c/a/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method private d()V
    .locals 4

    .prologue
    .line 185
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/appbox/c/a/b;->f:Lcom/qihoo/security/appbox/c/a/b$a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 186
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/appbox/c/a/b;->f:Lcom/qihoo/security/appbox/c/a/b$a;

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 187
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/widget/ImageView;I)Lcom/qihoo/security/appbox/c/a/b$b;
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 158
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v5, v4

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;Landroid/widget/ImageView;III)Lcom/qihoo/security/appbox/c/a/b$b;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Landroid/widget/ImageView;III)Lcom/qihoo/security/appbox/c/a/b$b;
    .locals 2

    .prologue
    .line 163
    const/4 v0, 0x0

    .line 164
    if-lez p3, :cond_0

    .line 165
    invoke-virtual {p2}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 167
    :cond_0
    invoke-direct {p0, p2, v0, v0}, Lcom/qihoo/security/appbox/c/a/b;->a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/android/volley/toolbox/g$d;

    move-result-object v0

    .line 168
    iget-object v1, p0, Lcom/qihoo/security/appbox/c/a/b;->d:Lcom/android/volley/toolbox/g;

    invoke-virtual {v1, p1, v0, p4, p5}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Lcom/android/volley/toolbox/g$d;II)Lcom/android/volley/toolbox/g$c;

    move-result-object v0

    .line 169
    new-instance v1, Lcom/qihoo/security/appbox/c/a/b$c;

    invoke-direct {v1, v0}, Lcom/qihoo/security/appbox/c/a/b$c;-><init>(Lcom/android/volley/toolbox/g$c;)V

    .line 170
    invoke-direct {p0}, Lcom/qihoo/security/appbox/c/a/b;->d()V

    .line 171
    return-object v1
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 115
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    :cond_0
    :goto_0
    return-void

    .line 119
    :cond_1
    invoke-static {p1}, Lcom/qihoo/security/appbox/c/b/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->d:Lcom/android/volley/toolbox/g;

    invoke-virtual {v0, p1, v1, v1}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->d:Lcom/android/volley/toolbox/g;

    new-instance v1, Lcom/qihoo/security/appbox/c/a/b$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/appbox/c/a/b$1;-><init>(Lcom/qihoo/security/appbox/c/a/b;)V

    invoke-virtual {v0, p1, v1}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Lcom/android/volley/toolbox/g$d;)Lcom/android/volley/toolbox/g$c;

    .line 154
    invoke-direct {p0}, Lcom/qihoo/security/appbox/c/a/b;->d()V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->e:Lcom/qihoo/security/appbox/c/a/a;

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b;->e:Lcom/qihoo/security/appbox/c/a/a;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/c/a/a;->a()V

    .line 242
    :cond_0
    return-void
.end method
