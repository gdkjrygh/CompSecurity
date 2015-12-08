.class final Lcom/roidapp/photogrid/cloud/bz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/br;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/br;)V
    .locals 0

    .prologue
    .line 425
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bz;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 428
    if-nez p2, :cond_0

    .line 430
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bz;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "share/closehashtags"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bz;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "share/closehashtags"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 432
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bz;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j()Z

    .line 434
    :cond_0
    return-void
.end method
