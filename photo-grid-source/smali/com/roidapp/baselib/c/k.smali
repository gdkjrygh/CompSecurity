.class final Lcom/roidapp/baselib/c/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/roidapp/baselib/c/j;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/c/j;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 258
    iput-object p1, p0, Lcom/roidapp/baselib/c/k;->b:Lcom/roidapp/baselib/c/j;

    iput-object p2, p0, Lcom/roidapp/baselib/c/k;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 261
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/k;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    iget-object v0, p0, Lcom/roidapp/baselib/c/k;->b:Lcom/roidapp/baselib/c/j;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/j;->a()V

    .line 264
    return-void

    .line 263
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/baselib/c/k;->b:Lcom/roidapp/baselib/c/j;

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/j;->a()V

    throw v0
.end method
