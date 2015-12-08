.class public final Lcom/cm/kinfoc/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Thread;

.field private final b:I

.field private final c:Lcom/cm/kinfoc/a/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/cm/kinfoc/a/d",
            "<TE;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/cm/kinfoc/a/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/cm/kinfoc/a/c",
            "<TE;>;)V"
        }
    .end annotation

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/a/a;->a:Ljava/lang/Thread;

    .line 13
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/a/a;->d:Ljava/util/Queue;

    .line 16
    invoke-static {p1}, Lcom/cm/kinfoc/a/c;->a(Lcom/cm/kinfoc/a/c;)I

    move-result v0

    iput v0, p0, Lcom/cm/kinfoc/a/a;->b:I

    .line 17
    invoke-static {p1}, Lcom/cm/kinfoc/a/c;->b(Lcom/cm/kinfoc/a/c;)Lcom/cm/kinfoc/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/cm/kinfoc/a/a;->c:Lcom/cm/kinfoc/a/d;

    .line 18
    return-void
.end method

.method synthetic constructor <init>(Lcom/cm/kinfoc/a/c;B)V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0, p1}, Lcom/cm/kinfoc/a/a;-><init>(Lcom/cm/kinfoc/a/c;)V

    return-void
.end method

.method static synthetic a(Lcom/cm/kinfoc/a/a;)Ljava/util/Queue;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/cm/kinfoc/a/a;->d:Ljava/util/Queue;

    return-object v0
.end method

.method static synthetic b(Lcom/cm/kinfoc/a/a;)I
    .locals 1

    .prologue
    .line 8
    iget v0, p0, Lcom/cm/kinfoc/a/a;->b:I

    return v0
.end method

.method static synthetic c(Lcom/cm/kinfoc/a/a;)Ljava/lang/Thread;
    .locals 1

    .prologue
    .line 8
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/a/a;->a:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic d(Lcom/cm/kinfoc/a/a;)Lcom/cm/kinfoc/a/d;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/cm/kinfoc/a/a;->c:Lcom/cm/kinfoc/a/d;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .prologue
    .line 51
    if-nez p1, :cond_0

    .line 63
    :goto_0
    return-void

    .line 55
    :cond_0
    iget-object v1, p0, Lcom/cm/kinfoc/a/a;->d:Ljava/util/Queue;

    monitor-enter v1

    .line 56
    :try_start_0
    iget-object v0, p0, Lcom/cm/kinfoc/a/a;->d:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 58
    iget-object v0, p0, Lcom/cm/kinfoc/a/a;->a:Ljava/lang/Thread;

    if-nez v0, :cond_1

    .line 1076
    new-instance v0, Lcom/cm/kinfoc/a/b;

    invoke-direct {v0, p0}, Lcom/cm/kinfoc/a/b;-><init>(Lcom/cm/kinfoc/a/a;)V

    iput-object v0, p0, Lcom/cm/kinfoc/a/a;->a:Ljava/lang/Thread;

    .line 1106
    iget-object v0, p0, Lcom/cm/kinfoc/a/a;->a:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/cm/kinfoc/a/a;->d:Ljava/util/Queue;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 63
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
