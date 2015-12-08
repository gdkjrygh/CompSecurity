.class final Lcom/roidapp/photogrid/common/bx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/photogrid/common/bq;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/bq;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bx;->b:Lcom/roidapp/photogrid/common/bq;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/bx;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 191
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bx;->b:Lcom/roidapp/photogrid/common/bq;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bq;->c(Lcom/roidapp/photogrid/common/bq;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bx;->b:Lcom/roidapp/photogrid/common/bq;

    const-string v1, "com.android.vending"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/bq;->a(Lcom/roidapp/photogrid/common/bq;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bx;->b:Lcom/roidapp/photogrid/common/bq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->c()V

    .line 200
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bx;->b:Lcom/roidapp/photogrid/common/bq;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bq;->d(Lcom/roidapp/photogrid/common/bq;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 201
    const-string v0, "Notification/Update/Click/Http"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bx;->b:Lcom/roidapp/photogrid/common/bq;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bq;->e(Lcom/roidapp/photogrid/common/bq;)Z

    .line 207
    :goto_1
    return-void

    .line 195
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bx;->b:Lcom/roidapp/photogrid/common/bq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->g()V

    goto :goto_0

    .line 198
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bx;->b:Lcom/roidapp/photogrid/common/bq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->g()V

    goto :goto_0

    .line 204
    :cond_2
    const-string v0, "Update/Http/Click"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    goto :goto_1
.end method
