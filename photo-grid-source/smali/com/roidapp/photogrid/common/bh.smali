.class final Lcom/roidapp/photogrid/common/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/roidapp/photogrid/common/be;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/be;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bh;->c:Lcom/roidapp/photogrid/common/be;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/bh;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/photogrid/common/bh;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "file://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 154
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 155
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_0

    .line 156
    const-string v2, "video/*"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 161
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bh;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bh;->c:Lcom/roidapp/photogrid/common/be;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/be;->a(Lcom/roidapp/photogrid/common/be;)V

    .line 163
    return-void

    .line 158
    :cond_0
    const-string v2, "image/*"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0
.end method
