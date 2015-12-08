.class final Lcom/roidapp/photogrid/common/bg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/roidapp/photogrid/common/be;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/be;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bg;->b:Lcom/roidapp/photogrid/common/be;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/bg;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bg;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 134
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v1, :cond_0

    .line 144
    :goto_0
    return-void

    .line 139
    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 140
    const-string v2, "fromPhotoGrid"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 141
    const-class v2, Lcom/roidapp/photogrid/release/Preference;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 142
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method
