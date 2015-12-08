.class final Lcom/roidapp/photogrid/cloud/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 0

    .prologue
    .line 551
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/e;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 554
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/e;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 555
    return-void
.end method
