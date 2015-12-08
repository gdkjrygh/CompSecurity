.class final Lcom/b/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/d/i;


# instance fields
.field final a:Ljava/util/concurrent/ScheduledExecutorService;

.field b:Lcom/b/a/a/w;

.field private final c:La/a/a/a/p;

.field private final d:Landroid/content/Context;

.field private final e:Lcom/b/a/a/h;

.field private final f:Lcom/b/a/a/ac;

.field private final g:La/a/a/a/a/e/m;


# direct methods
.method public constructor <init>(La/a/a/a/p;Landroid/content/Context;Lcom/b/a/a/h;Lcom/b/a/a/ac;La/a/a/a/a/e/m;)V
    .locals 7

    .prologue
    .line 35
    const-string v0, "Answers Events Handler"

    invoke-static {v0}, La/a/a/a/a/b/t;->b(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/b/a/a/b;-><init>(La/a/a/a/p;Landroid/content/Context;Lcom/b/a/a/h;Lcom/b/a/a/ac;La/a/a/a/a/e/m;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 37
    return-void
.end method

.method private constructor <init>(La/a/a/a/p;Landroid/content/Context;Lcom/b/a/a/h;Lcom/b/a/a/ac;La/a/a/a/a/e/m;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Lcom/b/a/a/l;

    invoke-direct {v0}, Lcom/b/a/a/l;-><init>()V

    iput-object v0, p0, Lcom/b/a/a/b;->b:Lcom/b/a/a/w;

    .line 43
    iput-object p1, p0, Lcom/b/a/a/b;->c:La/a/a/a/p;

    .line 44
    iput-object p2, p0, Lcom/b/a/a/b;->d:Landroid/content/Context;

    .line 45
    iput-object p3, p0, Lcom/b/a/a/b;->e:Lcom/b/a/a/h;

    .line 46
    iput-object p4, p0, Lcom/b/a/a/b;->f:Lcom/b/a/a/ac;

    .line 47
    iput-object p5, p0, Lcom/b/a/a/b;->g:La/a/a/a/a/e/m;

    .line 48
    iput-object p6, p0, Lcom/b/a/a/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    return-void
.end method

.method static synthetic a(Lcom/b/a/a/b;)Lcom/b/a/a/ac;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/b/a/a/b;->f:Lcom/b/a/a/ac;

    return-object v0
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 4

    .prologue
    .line 176
    :try_start_0
    iget-object v0, p0, Lcom/b/a/a/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    :goto_0
    return-void

    .line 177
    :catch_0
    move-exception v0

    .line 178
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to submit events task"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/b/a/a/b;)Lcom/b/a/a/h;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/b/a/a/b;->e:Lcom/b/a/a/h;

    return-object v0
.end method

.method static synthetic c(Lcom/b/a/a/b;)La/a/a/a/p;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/b/a/a/b;->c:La/a/a/a/p;

    return-object v0
.end method

.method static synthetic d(Lcom/b/a/a/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/b/a/a/b;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/b/a/a/b;)La/a/a/a/a/e/m;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/b/a/a/b;->g:La/a/a/a/a/e/m;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 94
    new-instance v0, Lcom/b/a/a/d;

    invoke-direct {v0, p0}, Lcom/b/a/a/d;-><init>(Lcom/b/a/a/b;)V

    invoke-direct {p0, v0}, Lcom/b/a/a/b;->a(Ljava/lang/Runnable;)V

    .line 106
    return-void
.end method

.method public final a(La/a/a/a/a/g/b;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 77
    new-instance v0, Lcom/b/a/a/c;

    invoke-direct {v0, p0, p1, p2}, Lcom/b/a/a/c;-><init>(Lcom/b/a/a/b;La/a/a/a/a/g/b;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/b/a/a/b;->a(Ljava/lang/Runnable;)V

    .line 88
    return-void
.end method

.method public final a(Lcom/b/a/a/y;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p0, p1, v0, v0}, Lcom/b/a/a/b;->a(Lcom/b/a/a/y;ZZ)V

    .line 56
    return-void
.end method

.method final a(Lcom/b/a/a/y;ZZ)V
    .locals 4

    .prologue
    .line 144
    new-instance v0, Lcom/b/a/a/g;

    invoke-direct {v0, p0, p1, p3}, Lcom/b/a/a/g;-><init>(Lcom/b/a/a/b;Lcom/b/a/a/y;Z)V

    .line 159
    if-eqz p2, :cond_0

    .line 1168
    :try_start_0
    iget-object v1, p0, Lcom/b/a/a/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1171
    :goto_0
    return-void

    .line 1169
    :catch_0
    move-exception v0

    .line 1170
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to run events task"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 162
    :cond_0
    invoke-direct {p0, v0}, Lcom/b/a/a/b;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 110
    new-instance v0, Lcom/b/a/a/e;

    invoke-direct {v0, p0}, Lcom/b/a/a/e;-><init>(Lcom/b/a/a/b;)V

    invoke-direct {p0, v0}, Lcom/b/a/a/b;->a(Ljava/lang/Runnable;)V

    .line 120
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 126
    new-instance v0, Lcom/b/a/a/f;

    invoke-direct {v0, p0}, Lcom/b/a/a/f;-><init>(Lcom/b/a/a/b;)V

    invoke-direct {p0, v0}, Lcom/b/a/a/b;->a(Ljava/lang/Runnable;)V

    .line 141
    return-void
.end method
