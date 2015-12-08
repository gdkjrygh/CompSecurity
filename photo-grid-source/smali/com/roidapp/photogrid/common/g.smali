.class final Lcom/roidapp/photogrid/common/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/ads/d;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/app/AlertDialog;

.field final synthetic d:Lcom/roidapp/photogrid/common/e;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/e;Lcom/roidapp/cloudlib/ads/d;Ljava/lang/String;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/roidapp/photogrid/common/g;->d:Lcom/roidapp/photogrid/common/e;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/g;->a:Lcom/roidapp/cloudlib/ads/d;

    iput-object p3, p0, Lcom/roidapp/photogrid/common/g;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roidapp/photogrid/common/g;->c:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/common/g;->d:Lcom/roidapp/photogrid/common/e;

    const-string v1, "com.cleanmaster.mguard"

    iget-object v2, p0, Lcom/roidapp/photogrid/common/g;->a:Lcom/roidapp/cloudlib/ads/d;

    const-string v3, "com.cleanmaster.mguard"

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/ads/d;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/common/g;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/e;->a(Lcom/roidapp/photogrid/common/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/common/g;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 117
    return-void
.end method
