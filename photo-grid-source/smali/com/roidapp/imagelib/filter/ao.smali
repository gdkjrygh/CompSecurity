.class final Lcom/roidapp/imagelib/filter/ao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/imagelib/filter/aj;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1005
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ao;->c:Lcom/roidapp/imagelib/filter/aj;

    iput-object p2, p0, Lcom/roidapp/imagelib/filter/ao;->a:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/roidapp/imagelib/filter/ao;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1009
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ao;->c:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1010
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ao;->c:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ao;->a:Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/ao;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/roidapp/imagelib/filter/av;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1012
    :cond_0
    return-void
.end method
