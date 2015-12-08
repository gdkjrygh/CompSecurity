.class final Lcom/roidapp/photogrid/common/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/cloudlib/ads/d;

.field final synthetic c:Lcom/roidapp/photogrid/common/e;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/e;Ljava/lang/String;Lcom/roidapp/cloudlib/ads/d;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/roidapp/photogrid/common/j;->c:Lcom/roidapp/photogrid/common/e;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/j;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/photogrid/common/j;->b:Lcom/roidapp/cloudlib/ads/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/common/j;->c:Lcom/roidapp/photogrid/common/e;

    invoke-static {v1}, Lcom/roidapp/photogrid/common/e;->a(Lcom/roidapp/photogrid/common/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/common/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/com.cleanmaster.mguard/Click/Description/Dialog/Download"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/common/j;->c:Lcom/roidapp/photogrid/common/e;

    const-string v1, "com.cleanmaster.mguard"

    iget-object v2, p0, Lcom/roidapp/photogrid/common/j;->b:Lcom/roidapp/cloudlib/ads/d;

    const-string v3, "com.cleanmaster.mguard"

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/ads/d;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/common/j;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/e;->a(Lcom/roidapp/photogrid/common/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    return-void
.end method
