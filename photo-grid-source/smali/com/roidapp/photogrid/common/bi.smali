.class final Lcom/roidapp/photogrid/common/bi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Lcom/roidapp/photogrid/common/be;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/be;Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bi;->d:Lcom/roidapp/photogrid/common/be;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/bi;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/roidapp/photogrid/common/bi;->b:Ljava/lang/String;

    iput p4, p0, Lcom/roidapp/photogrid/common/bi;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 169
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/roidapp/photogrid/common/bi;->d:Lcom/roidapp/photogrid/common/be;

    invoke-static {v2}, Lcom/roidapp/photogrid/common/be;->b(Lcom/roidapp/photogrid/common/be;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 184
    :goto_0
    return-void

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bi;->d:Lcom/roidapp/photogrid/common/be;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/common/be;->a(Lcom/roidapp/photogrid/common/be;J)J

    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bi;->a:Landroid/app/Activity;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Preview/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/common/bi;->d:Lcom/roidapp/photogrid/common/be;

    invoke-static {v2}, Lcom/roidapp/photogrid/common/be;->c(Lcom/roidapp/photogrid/common/be;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/share"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bi;->d:Lcom/roidapp/photogrid/common/be;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/be;->d(Lcom/roidapp/photogrid/common/be;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 176
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bi;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bi;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bi;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_2

    .line 179
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bi;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->r:Z

    goto :goto_0

    .line 181
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bi;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bi;->b:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/photogrid/common/bi;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;I)V

    goto :goto_0
.end method
