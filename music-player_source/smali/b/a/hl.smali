.class public final Lb/a/hl;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/hr;


# static fields
.field private static c:Lb/a/hl;


# instance fields
.field private a:Lb/a/hr;

.field private b:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lb/a/hl;->b:Landroid/content/Context;

    new-instance v0, Lb/a/hi;

    iget-object v1, p0, Lb/a/hl;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lb/a/hi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lb/a/hl;->a:Lb/a/hr;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lb/a/hl;
    .locals 2

    const-class v1, Lb/a/hl;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lb/a/hl;->c:Lb/a/hl;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    new-instance v0, Lb/a/hl;

    invoke-direct {v0, p0}, Lb/a/hl;-><init>(Landroid/content/Context;)V

    sput-object v0, Lb/a/hl;->c:Lb/a/hl;

    :cond_0
    sget-object v0, Lb/a/hl;->c:Lb/a/hl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lb/a/hl;)Lb/a/hr;
    .locals 1

    iget-object v0, p0, Lb/a/hl;->a:Lb/a/hr;

    return-object v0
.end method


# virtual methods
.method public final a(Lb/a/hs;)V
    .locals 1

    new-instance v0, Lb/a/hm;

    invoke-direct {v0, p0, p1}, Lb/a/hm;-><init>(Lb/a/hl;Lb/a/hs;)V

    invoke-static {v0}, Lcom/b/a/r;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()V
    .locals 1

    new-instance v0, Lb/a/hn;

    invoke-direct {v0, p0}, Lb/a/hn;-><init>(Lb/a/hl;)V

    invoke-static {v0}, Lcom/b/a/r;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Lb/a/hs;)V
    .locals 1

    iget-object v0, p0, Lb/a/hl;->a:Lb/a/hr;

    invoke-interface {v0, p1}, Lb/a/hr;->b(Lb/a/hs;)V

    return-void
.end method
