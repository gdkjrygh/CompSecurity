.class public Lcom/facebook/common/e/o;
.super Lcom/facebook/common/e/a;
.source "StubFbErrorReporter.java"


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/common/e/a;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/common/e/o;->a:Ljavax/inject/a;

    .line 24
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .prologue
    .line 107
    new-instance v7, Ljava/lang/Thread;

    new-instance v0, Lcom/facebook/common/e/p;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/common/e/p;-><init>(Lcom/facebook/common/e/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 130
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 98
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/common/e/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct/range {p0 .. p5}, Lcom/facebook/common/e/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/common/e/m;)V
    .locals 6

    .prologue
    .line 28
    invoke-virtual {p1}, Lcom/facebook/common/e/m;->a()Ljava/lang/String;

    move-result-object v2

    .line 29
    invoke-virtual {p1}, Lcom/facebook/common/e/m;->b()Ljava/lang/String;

    move-result-object v3

    .line 30
    invoke-virtual {p1}, Lcom/facebook/common/e/m;->c()Ljava/lang/Throwable;

    move-result-object v4

    .line 31
    invoke-virtual {p1}, Lcom/facebook/common/e/m;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/e/o;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v0, v1, :cond_0

    .line 32
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Soft Error FAILING HARDER: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nMessage:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 37
    :cond_0
    new-instance v5, Ljava/lang/Throwable;

    invoke-direct {v5}, Ljava/lang/Throwable;-><init>()V

    .line 38
    const-string v1, "SOFT_ERROR"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/common/e/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 39
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 78
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/common/e/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 61
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 48
    const-string v0, "STRICT_MODE"

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/facebook/common/e/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 74
    return-void
.end method
