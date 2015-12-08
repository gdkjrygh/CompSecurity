.class public final Lcom/roidapp/baselib/b/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Z

.field protected b:Landroid/content/res/Resources;

.field protected c:Ljava/lang/String;

.field private d:Z

.field private e:Z

.field private final f:Landroid/os/Handler;

.field private final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-boolean v2, p0, Lcom/roidapp/baselib/b/k;->d:Z

    .line 44
    iput-boolean v2, p0, Lcom/roidapp/baselib/b/k;->e:Z

    .line 45
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roidapp/baselib/b/k;->f:Landroid/os/Handler;

    .line 46
    iput-boolean v2, p0, Lcom/roidapp/baselib/b/k;->a:Z

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/b/k;->g:Ljava/lang/Object;

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/b/k;->b:Landroid/content/res/Resources;

    .line 54
    iput-object p2, p0, Lcom/roidapp/baselib/b/k;->c:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public static a(Landroid/widget/ImageView;)V
    .locals 2

    .prologue
    .line 86
    invoke-static {p0}, Lcom/roidapp/baselib/b/k;->c(Landroid/widget/ImageView;)Lcom/roidapp/baselib/b/m;

    move-result-object v0

    .line 87
    if-eqz v0, :cond_0

    .line 88
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/b/m;->cancel(Z)Z

    .line 98
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/b/k;)Z
    .locals 1

    .prologue
    .line 40
    iget-boolean v0, p0, Lcom/roidapp/baselib/b/k;->d:Z

    return v0
.end method

.method static synthetic b(Landroid/widget/ImageView;)Lcom/roidapp/baselib/b/m;
    .locals 1

    .prologue
    .line 40
    invoke-static {p0}, Lcom/roidapp/baselib/b/k;->c(Landroid/widget/ImageView;)Lcom/roidapp/baselib/b/m;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/baselib/b/k;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/baselib/b/k;->g:Ljava/lang/Object;

    return-object v0
.end method

.method private static c(Landroid/widget/ImageView;)Lcom/roidapp/baselib/b/m;
    .locals 2

    .prologue
    .line 131
    if-eqz p0, :cond_0

    .line 132
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 133
    instance-of v1, v0, Lcom/roidapp/baselib/b/l;

    if-eqz v1, :cond_0

    .line 134
    check-cast v0, Lcom/roidapp/baselib/b/l;

    .line 135
    invoke-virtual {v0}, Lcom/roidapp/baselib/b/l;->a()Lcom/roidapp/baselib/b/m;

    move-result-object v0

    .line 138
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/baselib/b/k;)Z
    .locals 1

    .prologue
    .line 40
    iget-boolean v0, p0, Lcom/roidapp/baselib/b/k;->e:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/baselib/b/k;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/baselib/b/k;->f:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Lcom/roidapp/baselib/b/p;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 62
    if-nez p1, :cond_1

    .line 74
    :cond_0
    :goto_0
    return-void

    .line 1106
    :cond_1
    invoke-static {p2}, Lcom/roidapp/baselib/b/k;->c(Landroid/widget/ImageView;)Lcom/roidapp/baselib/b/m;

    move-result-object v0

    .line 1108
    if-eqz v0, :cond_3

    .line 1109
    invoke-static {v0}, Lcom/roidapp/baselib/b/m;->a(Lcom/roidapp/baselib/b/m;)Ljava/lang/Object;

    move-result-object v3

    .line 1110
    if-eqz v3, :cond_2

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 1111
    :cond_2
    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/b/m;->cancel(Z)Z

    :cond_3
    move v0, v2

    .line 66
    :goto_1
    if-eqz v0, :cond_0

    .line 67
    new-instance v0, Lcom/roidapp/baselib/b/m;

    invoke-direct {v0, p0, p2, p3, p4}, Lcom/roidapp/baselib/b/m;-><init>(Lcom/roidapp/baselib/b/k;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Lcom/roidapp/baselib/b/p;)V

    .line 68
    new-instance v3, Lcom/roidapp/baselib/b/l;

    iget-object v4, p0, Lcom/roidapp/baselib/b/k;->b:Landroid/content/res/Resources;

    invoke-direct {v3, v4, v0}, Lcom/roidapp/baselib/b/l;-><init>(Landroid/content/res/Resources;Lcom/roidapp/baselib/b/m;)V

    .line 70
    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 72
    sget-object v3, Lcom/roidapp/baselib/c/c;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-virtual {v0, v3, v2}, Lcom/roidapp/baselib/b/m;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_0

    :cond_4
    move v0, v1

    .line 1118
    goto :goto_1
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 58
    iput-boolean p1, p0, Lcom/roidapp/baselib/b/k;->d:Z

    .line 59
    return-void
.end method
