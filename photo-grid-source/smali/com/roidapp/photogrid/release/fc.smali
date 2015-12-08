.class final Lcom/roidapp/photogrid/release/fc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/fb;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fb;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fc;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fc;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->a(Lcom/roidapp/photogrid/release/fb;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fc;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const v1, 0x7f070202

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 174
    :goto_0
    return-void

    .line 168
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fc;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->c(Lcom/roidapp/photogrid/release/fb;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Ratio"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 170
    new-instance v0, Lcom/roidapp/photogrid/release/fi;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/fi;-><init>()V

    .line 171
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fc;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const v2, 0x7f0d03ec

    const-string v3, "ProportionFragment"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0
.end method
