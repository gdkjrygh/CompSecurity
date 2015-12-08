.class public final Lcom/roidapp/photogrid/common/am;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/al;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/common/al;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/roidapp/photogrid/common/am;->a:Lcom/roidapp/photogrid/common/al;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/common/am;->a:Lcom/roidapp/photogrid/common/al;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/al;->a(Lcom/roidapp/photogrid/common/al;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/common/am;->a:Lcom/roidapp/photogrid/common/al;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/al;->a(Lcom/roidapp/photogrid/common/al;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x236

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 129
    :cond_0
    return-void
.end method
