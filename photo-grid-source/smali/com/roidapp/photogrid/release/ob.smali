.class final Lcom/roidapp/photogrid/release/ob;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/oa;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/oa;)V
    .locals 0

    .prologue
    .line 232
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->a(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->c(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 240
    if-nez p3, :cond_0

    .line 241
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Z)V

    .line 292
    :goto_0
    return-void

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Z)V

    goto :goto_0

    .line 246
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->e(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 247
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 248
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->c(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 250
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->f(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 251
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->f(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07024c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    :cond_2
    invoke-static {}, Lcom/a/c/d;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 254
    if-nez p3, :cond_4

    .line 255
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->f(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 256
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->f(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07024d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "Smart"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 259
    :cond_4
    if-ne p3, v3, :cond_5

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "High"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 261
    :cond_5
    const/4 v0, 0x2

    if-ne p3, v0, :cond_6

    .line 262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "Medium"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 264
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "Low"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 267
    :cond_7
    if-nez p3, :cond_8

    .line 268
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "High"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 269
    :cond_8
    if-ne p3, v3, :cond_9

    .line 270
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "Medium"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 272
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "Low"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 276
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->g(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->h(Lcom/roidapp/photogrid/release/oa;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 277
    if-eqz p3, :cond_b

    .line 278
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->c(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    add-int/lit8 v3, p3, -0x1

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v1

    add-int/lit8 v2, p3, -0x1

    aget v1, v1, v2

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;I)V

    .line 280
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto/16 :goto_0

    .line 282
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->t()V

    goto/16 :goto_0

    .line 285
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->c(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v2

    aget v2, v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "P"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/oa;->d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/oa;->i(Lcom/roidapp/photogrid/release/oa;)[I

    move-result-object v1

    aget v1, v1, p3

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;I)V

    .line 287
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ob;->a:Lcom/roidapp/photogrid/release/oa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto/16 :goto_0
.end method
