.class final Lcom/roidapp/imagelib/filter/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/c;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/s;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/s;)V
    .locals 0

    .prologue
    .line 185
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/t;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/imagelib/filter/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 189
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/t;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/s;->a(Lcom/roidapp/imagelib/filter/s;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 190
    return-void
.end method
