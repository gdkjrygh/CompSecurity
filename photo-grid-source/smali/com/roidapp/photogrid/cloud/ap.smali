.class final Lcom/roidapp/photogrid/cloud/ap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ap;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .prologue
    .line 193
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isPressed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 203
    :goto_0
    return-void

    .line 195
    :cond_0
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 196
    if-eqz p2, :cond_1

    .line 197
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ap;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Ljava/lang/String;Z)V

    .line 198
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ap;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    goto :goto_0

    .line 200
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ap;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Ljava/lang/String;Z)V

    .line 201
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ap;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ap;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e(Lcom/roidapp/photogrid/cloud/PGShareActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    goto :goto_0
.end method
