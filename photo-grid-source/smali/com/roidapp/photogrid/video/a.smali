.class public final Lcom/roidapp/photogrid/video/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/baselib/e/b;

.field private b:Lcom/roidapp/baselib/e/a;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v0, p0, Lcom/roidapp/photogrid/video/a;->a:Lcom/roidapp/baselib/e/b;

    .line 12
    iput-object v0, p0, Lcom/roidapp/photogrid/video/a;->b:Lcom/roidapp/baselib/e/a;

    .line 13
    iput-object v0, p0, Lcom/roidapp/photogrid/video/a;->c:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/a;)Lcom/roidapp/baselib/e/b;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/roidapp/photogrid/video/a;->a:Lcom/roidapp/baselib/e/b;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/roidapp/photogrid/video/a;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/roidapp/photogrid/video/a;->b:Lcom/roidapp/baselib/e/a;

    if-eqz v0, :cond_0

    .line 21
    iget-object v0, p0, Lcom/roidapp/photogrid/video/a;->b:Lcom/roidapp/baselib/e/a;

    invoke-virtual {v0}, Lcom/roidapp/baselib/e/a;->f()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/a;->b:Lcom/roidapp/baselib/e/a;

    .line 24
    :cond_0
    return-void
.end method

.method public final a(Lcom/roidapp/baselib/e/b;)V
    .locals 0

    .prologue
    .line 16
    iput-object p1, p0, Lcom/roidapp/photogrid/video/a;->a:Lcom/roidapp/baselib/e/b;

    .line 17
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/photogrid/video/a;->b:Lcom/roidapp/baselib/e/a;

    if-eqz v0, :cond_0

    .line 56
    :goto_0
    return-void

    .line 29
    :cond_0
    iput-object p2, p0, Lcom/roidapp/photogrid/video/a;->c:Ljava/lang/String;

    .line 30
    new-instance v0, Lcom/roidapp/baselib/e/a;

    new-instance v1, Lcom/roidapp/photogrid/video/b;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/b;-><init>(Lcom/roidapp/photogrid/video/a;)V

    invoke-direct {v0, p1, p2, v1}, Lcom/roidapp/baselib/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/b;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/a;->b:Lcom/roidapp/baselib/e/a;

    .line 55
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/a;->b:Lcom/roidapp/baselib/e/a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
