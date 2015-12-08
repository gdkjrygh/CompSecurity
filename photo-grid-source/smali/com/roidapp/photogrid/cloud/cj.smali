.class final Lcom/roidapp/photogrid/cloud/cj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Lcom/roidapp/photogrid/cloud/ch;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/ch;Landroid/widget/CheckBox;)V
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cj;->b:Lcom/roidapp/photogrid/cloud/ch;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/cj;->a:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    const/4 v2, 0x1

    .line 248
    if-eqz p2, :cond_2

    .line 249
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 250
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cj;->b:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "hashtags/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cj;->b:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "hashtags/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 253
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cj;->b:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 254
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cj;->b:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;

    move-result-object v0

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/cm;->a(Ljava/lang/String;Z)V

    .line 255
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cj;->a:Landroid/widget/CheckBox;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    .line 263
    :goto_0
    return-void

    .line 257
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cj;->b:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 258
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cj;->b:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;

    move-result-object v0

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/cm;->a(Ljava/lang/String;Z)V

    .line 259
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cj;->a:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cj;->b:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/ch;->e(Lcom/roidapp/photogrid/cloud/ch;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    goto :goto_0
.end method
