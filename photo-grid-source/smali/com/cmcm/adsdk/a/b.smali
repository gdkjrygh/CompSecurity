.class public Lcom/cmcm/adsdk/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/cmcm/adsdk/a/b;


# instance fields
.field private b:Lcom/cmcm/adsdk/a/a;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Lcom/cmcm/adsdk/a/a;

    invoke-direct {v0, p1}, Lcom/cmcm/adsdk/a/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/a/b;->b:Lcom/cmcm/adsdk/a/a;

    .line 13
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/cmcm/adsdk/a/b;
    .locals 2

    .prologue
    .line 16
    sget-object v0, Lcom/cmcm/adsdk/a/b;->a:Lcom/cmcm/adsdk/a/b;

    if-nez v0, :cond_1

    .line 17
    const-class v1, Lcom/cmcm/adsdk/a/b;

    monitor-enter v1

    .line 18
    :try_start_0
    sget-object v0, Lcom/cmcm/adsdk/a/b;->a:Lcom/cmcm/adsdk/a/b;

    if-nez v0, :cond_0

    .line 19
    new-instance v0, Lcom/cmcm/adsdk/a/b;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/a/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/cmcm/adsdk/a/b;->a:Lcom/cmcm/adsdk/a/b;

    .line 21
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :cond_1
    sget-object v0, Lcom/cmcm/adsdk/a/b;->a:Lcom/cmcm/adsdk/a/b;

    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a()Lcom/cmcm/adsdk/a/a;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/cmcm/adsdk/a/b;->b:Lcom/cmcm/adsdk/a/a;

    return-object v0
.end method
