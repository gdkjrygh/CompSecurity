.class final Lcom/b/a/c/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/b/a/c/h;

.field private b:Z

.field private final c:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method private constructor <init>(Lcom/b/a/c/h;)V
    .locals 2

    .prologue
    .line 1065
    iput-object p1, p0, Lcom/b/a/c/t;->a:Lcom/b/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1066
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/b/a/c/t;->b:Z

    .line 1067
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/b/a/c/t;->c:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method synthetic constructor <init>(Lcom/b/a/c/h;B)V
    .locals 0

    .prologue
    .line 1065
    invoke-direct {p0, p1}, Lcom/b/a/c/t;-><init>(Lcom/b/a/c/h;)V

    return-void
.end method


# virtual methods
.method final a(Z)V
    .locals 1

    .prologue
    .line 1070
    iput-boolean p1, p0, Lcom/b/a/c/t;->b:Z

    .line 1071
    iget-object v0, p0, Lcom/b/a/c/t;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1072
    return-void
.end method

.method final a()Z
    .locals 1

    .prologue
    .line 1075
    iget-boolean v0, p0, Lcom/b/a/c/t;->b:Z

    return v0
.end method

.method final b()V
    .locals 1

    .prologue
    .line 1080
    :try_start_0
    iget-object v0, p0, Lcom/b/a/c/t;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1084
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
