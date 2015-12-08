.class final Lcom/roidapp/imagelib/retouch/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/imagelib/retouch/m;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/m;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 487
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/r;->c:Lcom/roidapp/imagelib/retouch/m;

    iput-object p2, p0, Lcom/roidapp/imagelib/retouch/r;->a:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/roidapp/imagelib/retouch/r;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 491
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/r;->c:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 492
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/r;->c:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/t;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/r;->a:Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/r;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/t;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 494
    :cond_0
    return-void
.end method
