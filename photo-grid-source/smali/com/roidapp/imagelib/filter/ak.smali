.class final Lcom/roidapp/imagelib/filter/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/c;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/aj;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/aj;)V
    .locals 0

    .prologue
    .line 456
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ak;->a:Lcom/roidapp/imagelib/filter/aj;

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
    .line 460
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ak;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x406

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 461
    return-void
.end method
