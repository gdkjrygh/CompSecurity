.class final Lcom/roidapp/photogrid/release/qk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Lcom/roidapp/photogrid/release/qi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/qi;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qk;->b:Lcom/roidapp/photogrid/release/qi;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/qk;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 2

    .prologue
    .line 99
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    .line 100
    const v1, 0x7f0d0408

    if-ne v0, v1, :cond_1

    .line 101
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qk;->b:Lcom/roidapp/photogrid/release/qi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qk;->b:Lcom/roidapp/photogrid/release/qi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/qi;->b(Lcom/roidapp/photogrid/release/qi;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/qi;->a(Lcom/roidapp/photogrid/release/qi;I)I

    .line 102
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qk;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    :cond_0
    :goto_0
    return-void

    .line 103
    :cond_1
    const v1, 0x7f0d0409

    if-ne v0, v1, :cond_0

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qk;->b:Lcom/roidapp/photogrid/release/qi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qk;->b:Lcom/roidapp/photogrid/release/qi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/qi;->c(Lcom/roidapp/photogrid/release/qi;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/qi;->a(Lcom/roidapp/photogrid/release/qi;I)I

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qk;->a:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method
