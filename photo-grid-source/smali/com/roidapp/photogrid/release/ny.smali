.class final Lcom/roidapp/photogrid/release/ny;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Lcom/roidapp/photogrid/release/nn;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/nn;Landroid/widget/CheckBox;)V
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ny;->b:Lcom/roidapp/photogrid/release/nn;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ny;->a:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 230
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ny;->b:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->a(Lcom/roidapp/photogrid/release/nn;)V

    .line 231
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ny;->a:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ny;->b:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/nn;->b(Lcom/roidapp/photogrid/release/nn;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 232
    return-void
.end method
