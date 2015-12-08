.class final Lcom/a/a/c/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/a/a/c/g;

.field private b:Z

.field private final c:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method private constructor <init>(Lcom/a/a/c/g;)V
    .locals 2

    .prologue
    .line 1060
    iput-object p1, p0, Lcom/a/a/c/g$a;->a:Lcom/a/a/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1061
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/c/g$a;->b:Z

    .line 1062
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/a/a/c/g$a;->c:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method synthetic constructor <init>(Lcom/a/a/c/g;B)V
    .locals 0

    .prologue
    .line 1060
    invoke-direct {p0, p1}, Lcom/a/a/c/g$a;-><init>(Lcom/a/a/c/g;)V

    return-void
.end method


# virtual methods
.method final a(Z)V
    .locals 1

    .prologue
    .line 1065
    iput-boolean p1, p0, Lcom/a/a/c/g$a;->b:Z

    .line 1066
    iget-object v0, p0, Lcom/a/a/c/g$a;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1067
    return-void
.end method

.method final a()Z
    .locals 1

    .prologue
    .line 1070
    iget-boolean v0, p0, Lcom/a/a/c/g$a;->b:Z

    return v0
.end method

.method final b()V
    .locals 1

    .prologue
    .line 1075
    :try_start_0
    iget-object v0, p0, Lcom/a/a/c/g$a;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1079
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
