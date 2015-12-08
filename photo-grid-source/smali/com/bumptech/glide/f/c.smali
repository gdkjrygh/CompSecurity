.class public final Lcom/bumptech/glide/f/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/bumptech/glide/i/g;


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/bumptech/glide/i/g;",
            "Lcom/bumptech/glide/f/b",
            "<**>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    new-instance v0, Lcom/bumptech/glide/i/g;

    invoke-direct {v0}, Lcom/bumptech/glide/i/g;-><init>()V

    sput-object v0, Lcom/bumptech/glide/f/c;->a:Lcom/bumptech/glide/i/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/f/c;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/f/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TZ;>;)",
            "Lcom/bumptech/glide/f/b",
            "<TT;TZ;>;"
        }
    .end annotation

    .prologue
    .line 44
    sget-object v1, Lcom/bumptech/glide/f/c;->a:Lcom/bumptech/glide/i/g;

    monitor-enter v1

    .line 45
    :try_start_0
    sget-object v0, Lcom/bumptech/glide/f/c;->a:Lcom/bumptech/glide/i/g;

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/i/g;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 46
    iget-object v0, p0, Lcom/bumptech/glide/f/c;->b:Ljava/util/Map;

    sget-object v2, Lcom/bumptech/glide/f/c;->a:Lcom/bumptech/glide/i/g;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f/b;

    .line 47
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    if-nez v0, :cond_0

    .line 49
    invoke-static {}, Lcom/bumptech/glide/f/d;->e()Lcom/bumptech/glide/f/b;

    move-result-object v0

    .line 51
    :cond_0
    return-object v0

    .line 47
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TZ;>;",
            "Lcom/bumptech/glide/f/b",
            "<TT;TZ;>;)V"
        }
    .end annotation

    .prologue
    .line 30
    iget-object v0, p0, Lcom/bumptech/glide/f/c;->b:Ljava/util/Map;

    new-instance v1, Lcom/bumptech/glide/i/g;

    invoke-direct {v1, p1, p2}, Lcom/bumptech/glide/i/g;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    return-void
.end method
