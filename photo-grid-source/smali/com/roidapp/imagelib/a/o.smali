.class final Lcom/roidapp/imagelib/a/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1059
    iput-object p1, p0, Lcom/roidapp/imagelib/a/o;->c:Lcom/roidapp/imagelib/a/i;

    iput-object p2, p0, Lcom/roidapp/imagelib/a/o;->a:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/roidapp/imagelib/a/o;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1063
    iget-object v0, p0, Lcom/roidapp/imagelib/a/o;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/y;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1064
    iget-object v0, p0, Lcom/roidapp/imagelib/a/o;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->y(Lcom/roidapp/imagelib/a/i;)V

    .line 1065
    iget-object v0, p0, Lcom/roidapp/imagelib/a/o;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/y;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/o;->a:Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/o;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/roidapp/imagelib/a/y;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1067
    :cond_0
    return-void
.end method
