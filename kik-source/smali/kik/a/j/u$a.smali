.class final Lkik/a/j/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/j/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/a/j/u;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkik/a/j/u;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lkik/a/j/u$a;->a:Lkik/a/j/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p2, p0, Lkik/a/j/u$a;->b:Ljava/lang/String;

    .line 154
    return-void
.end method

.method private a()Lcom/kik/g/p;
    .locals 5

    .prologue
    .line 161
    iget-object v0, p0, Lkik/a/j/u$a;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->a(Lkik/a/j/u;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    .line 162
    :try_start_0
    iget-object v0, p0, Lkik/a/j/u$a;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->a(Lkik/a/j/u;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lkik/a/j/u$a;->b:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    iget-object v0, p0, Lkik/a/j/u$a;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->b(Lkik/a/j/u;)Lkik/a/e/f;

    move-result-object v0

    new-instance v2, Lkik/a/f/f/ap;

    iget-object v3, p0, Lkik/a/j/u$a;->b:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lkik/a/f/f/ap;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    .line 165
    new-instance v2, Lkik/a/j/ae;

    invoke-direct {v2, p0}, Lkik/a/j/ae;-><init>(Lkik/a/j/u$a;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 175
    iget-object v2, p0, Lkik/a/j/u$a;->a:Lkik/a/j/u;

    invoke-static {v2}, Lkik/a/j/u;->a(Lkik/a/j/u;)Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lkik/a/j/u$a;->b:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    new-instance v1, Lkik/a/j/u$f;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lkik/a/j/u$f;-><init>(B)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    .line 185
    new-instance v1, Lkik/a/j/af;

    invoke-direct {v1, p0}, Lkik/a/j/af;-><init>(Lkik/a/j/u$a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 197
    return-object v0

    .line 178
    :cond_0
    :try_start_1
    iget-object v0, p0, Lkik/a/j/u$a;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->a(Lkik/a/j/u;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lkik/a/j/u$a;->b:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    goto :goto_0

    .line 180
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lkik/a/j/u$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lkik/a/j/u$a;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 146
    invoke-direct {p0}, Lkik/a/j/u$a;->a()Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method
