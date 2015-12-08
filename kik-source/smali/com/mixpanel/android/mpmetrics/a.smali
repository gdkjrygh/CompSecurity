.class final Lcom/mixpanel/android/mpmetrics/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/a$b;,
        Lcom/mixpanel/android/mpmetrics/a$a;
    }
.end annotation


# static fields
.field private static d:I

.field private static e:I

.field private static f:I

.field private static g:I

.field private static h:I

.field private static i:I

.field private static j:I

.field private static k:I

.field private static final l:Ljava/util/Map;


# instance fields
.field private final a:Lcom/mixpanel/android/mpmetrics/a$b;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/mixpanel/android/mpmetrics/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 584
    const/4 v0, 0x0

    sput v0, Lcom/mixpanel/android/mpmetrics/a;->d:I

    .line 585
    const/4 v0, 0x1

    sput v0, Lcom/mixpanel/android/mpmetrics/a;->e:I

    .line 586
    const/4 v0, 0x2

    sput v0, Lcom/mixpanel/android/mpmetrics/a;->f:I

    .line 587
    const/4 v0, 0x5

    sput v0, Lcom/mixpanel/android/mpmetrics/a;->g:I

    .line 588
    const/16 v0, 0xc

    sput v0, Lcom/mixpanel/android/mpmetrics/a;->h:I

    .line 589
    const/16 v0, 0xd

    sput v0, Lcom/mixpanel/android/mpmetrics/a;->i:I

    .line 591
    const/4 v0, 0x4

    sput v0, Lcom/mixpanel/android/mpmetrics/a;->j:I

    .line 592
    const/16 v0, 0xa

    sput v0, Lcom/mixpanel/android/mpmetrics/a;->k:I

    .line 596
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/a;->l:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/a;->b:Landroid/content/Context;

    .line 44
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/t;->a(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/a;->c:Lcom/mixpanel/android/mpmetrics/t;

    .line 45
    new-instance v0, Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/mpmetrics/a$b;-><init>(Lcom/mixpanel/android/mpmetrics/a;)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    .line 46
    return-void
.end method

.method static synthetic a(Lcom/mixpanel/android/mpmetrics/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/a;
    .locals 4

    .prologue
    .line 56
    sget-object v1, Lcom/mixpanel/android/mpmetrics/a;->l:Ljava/util/Map;

    monitor-enter v1

    .line 57
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 59
    sget-object v0, Lcom/mixpanel/android/mpmetrics/a;->l:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Lcom/mixpanel/android/mpmetrics/a;

    invoke-direct {v0, v2}, Lcom/mixpanel/android/mpmetrics/a;-><init>(Landroid/content/Context;)V

    .line 61
    sget-object v3, Lcom/mixpanel/android/mpmetrics/a;->l:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :goto_0
    monitor-exit v1

    return-object v0

    .line 64
    :cond_0
    sget-object v0, Lcom/mixpanel/android/mpmetrics/a;->l:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/a;

    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 37
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method protected static b()Lcom/mixpanel/android/mpmetrics/ae;
    .locals 1

    .prologue
    .line 154
    new-instance v0, Lcom/mixpanel/android/mpmetrics/ae;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/ae;-><init>()V

    return-object v0
.end method

.method static synthetic b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a;->c:Lcom/mixpanel/android/mpmetrics/t;

    return-object v0
.end method

.method protected static b(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/u;
    .locals 1

    .prologue
    .line 146
    new-instance v0, Lcom/mixpanel/android/mpmetrics/u;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/mpmetrics/u;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static synthetic c()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/mixpanel/android/mpmetrics/a;->j:I

    return v0
.end method

.method static synthetic d()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/mixpanel/android/mpmetrics/a;->f:I

    return v0
.end method

.method static synthetic e()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/mixpanel/android/mpmetrics/a;->k:I

    return v0
.end method

.method static synthetic f()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/mixpanel/android/mpmetrics/a;->d:I

    return v0
.end method

.method static synthetic g()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/mixpanel/android/mpmetrics/a;->e:I

    return v0
.end method

.method static synthetic h()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/mixpanel/android/mpmetrics/a;->h:I

    return v0
.end method

.method static synthetic i()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/mixpanel/android/mpmetrics/a;->i:I

    return v0
.end method

.method static synthetic j()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/mixpanel/android/mpmetrics/a;->g:I

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 87
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 88
    sget v1, Lcom/mixpanel/android/mpmetrics/a;->f:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 90
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/a$b;->a(Landroid/os/Message;)V

    .line 91
    return-void
.end method

.method public final a(Lcom/mixpanel/android/mpmetrics/a$a;)V
    .locals 2

    .prologue
    .line 71
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 72
    sget v1, Lcom/mixpanel/android/mpmetrics/a;->e:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 73
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 74
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/a$b;->a(Landroid/os/Message;)V

    .line 75
    return-void
.end method

.method public final a(Lcom/mixpanel/android/mpmetrics/h;)V
    .locals 2

    .prologue
    .line 116
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 117
    sget v1, Lcom/mixpanel/android/mpmetrics/a;->h:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 118
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 120
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/a$b;->a(Landroid/os/Message;)V

    .line 121
    return-void
.end method

.method public final a(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    .line 79
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 80
    sget v1, Lcom/mixpanel/android/mpmetrics/a;->d:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 81
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 83
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/a$b;->a(Landroid/os/Message;)V

    .line 84
    return-void
.end method
