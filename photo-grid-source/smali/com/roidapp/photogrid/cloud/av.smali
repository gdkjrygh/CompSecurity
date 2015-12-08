.class final Lcom/roidapp/photogrid/cloud/av;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 0

    .prologue
    .line 311
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/av;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 314
    if-nez p2, :cond_0

    .line 316
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "share/closehashtags"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/av;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "share/closehashtags"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/av;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e()Z

    .line 321
    :cond_0
    return-void
.end method
