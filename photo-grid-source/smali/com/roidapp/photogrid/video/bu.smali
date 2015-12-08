.class final Lcom/roidapp/photogrid/video/bu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Lcom/roidapp/photogrid/video/bp;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/bp;Landroid/widget/CheckBox;)V
    .locals 0

    .prologue
    .line 395
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bu;->b:Lcom/roidapp/photogrid/video/bp;

    iput-object p2, p0, Lcom/roidapp/photogrid/video/bu;->a:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 398
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bu;->a:Landroid/widget/CheckBox;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/bu;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 399
    return-void

    .line 398
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
