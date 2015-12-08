.class final Lcom/roidapp/photogrid/release/ik;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageEditor;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 10

    .prologue
    const/high16 v6, 0x3f400000    # 0.75f

    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 157
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 159
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->a()I

    move-result v2

    if-ne v0, v2, :cond_5

    .line 160
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/an;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/an;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    if-ne v0, v2, :cond_4

    move v2, v1

    .line 164
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_1

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->d(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 166
    if-nez v0, :cond_3

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->e(Lcom/roidapp/photogrid/release/ImageEditor;)V

    .line 180
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->d(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)V

    .line 181
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->g(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    move-result v0

    if-ne v0, v5, :cond_2

    const-string v0, "retato"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->h(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 182
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f07027c

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->i(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    .line 373
    :cond_2
    :goto_2
    return-void

    .line 171
    :cond_3
    const-string v3, "layout sieze"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget v1, v1, Lcom/roidapp/photogrid/release/ic;->d:I

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 175
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 164
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto/16 :goto_0

    .line 178
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->f(Lcom/roidapp/photogrid/release/ImageEditor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 369
    :catch_0
    move-exception v0

    .line 370
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 371
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 185
    :cond_5
    :try_start_1
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->b()I

    move-result v2

    if-ne v0, v2, :cond_7

    .line 186
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 187
    if-eqz v0, :cond_6

    .line 188
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->bringToFront()V

    .line 189
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_2

    .line 191
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_2

    .line 193
    :cond_7
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->d()I

    move-result v2

    if-ne v0, v2, :cond_9

    .line 194
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->k(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v3, 0x7f07027e

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ImageEditor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->l(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 200
    :goto_3
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_2

    .line 197
    :cond_8
    new-instance v1, Lcom/roidapp/photogrid/common/be;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v3, 0x7f0d0260

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iget-object v4, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->m(Lcom/roidapp/photogrid/release/ImageEditor;)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0xbb8

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/photogrid/common/be;-><init>(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;IZZJ)V

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v3, 0x7f07027e

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ImageEditor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->l(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/common/be;->a(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 201
    :cond_9
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->f()I

    move-result v2

    if-ne v0, v2, :cond_a

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 203
    :cond_a
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->g()I

    move-result v2

    if-ne v0, v2, :cond_e

    .line 204
    iget v2, p1, Landroid/os/Message;->arg1:I

    .line 205
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->n(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/aq;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 206
    add-int/lit8 v4, v2, -0x1

    .line 207
    const/4 v3, 0x0

    .line 209
    :try_start_2
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v2, :cond_c

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_c

    .line 210
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v2, v4

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/ic;

    iget v7, v2, Lcom/roidapp/photogrid/release/ic;->d:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/ic;

    iget v2, v2, Lcom/roidapp/photogrid/release/ic;->e:I

    invoke-virtual {v1, v5, v6, v7, v2}, Lcom/roidapp/photogrid/release/ic;->a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;

    .line 211
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/aq;->a(Landroid/graphics/Bitmap;)V

    .line 212
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v4

    iput-object v1, v0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v1, v3

    .line 240
    :goto_4
    :try_start_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z

    .line 241
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_2

    .line 242
    :catch_1
    move-exception v0

    .line 243
    :goto_5
    if-eqz v1, :cond_b

    :try_start_4
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_b

    .line 244
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 247
    :cond_b
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z

    .line 248
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 249
    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->b()I

    move-result v2

    iput v2, p1, Landroid/os/Message;->what:I

    .line 250
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 251
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 252
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/16 v1, 0xa1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;I)I

    .line 254
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_2

    .line 215
    :cond_c
    :try_start_5
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    move v2, v1

    .line 231
    :goto_6
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v5, v5, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v4

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v5, v1, v2, v6}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result-object v1

    .line 232
    if-eqz v1, :cond_d

    :try_start_6
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_d

    .line 233
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/aq;->a(Landroid/graphics/Bitmap;)V

    .line 234
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, v4

    iput-object v2, v0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-virtual {v0, v4, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(ILandroid/graphics/Bitmap;)V
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto/16 :goto_4

    .line 218
    :pswitch_1
    :try_start_7
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;)[I

    move-result-object v1

    .line 219
    const/4 v2, 0x0

    aget v2, v1, v2

    add-int/lit8 v2, v2, 0x6

    .line 220
    const/4 v5, 0x1

    aget v1, v1, v5

    add-int/lit8 v1, v1, 0x6

    .line 221
    goto :goto_6

    .line 223
    :pswitch_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v1

    .line 224
    int-to-float v2, v1

    mul-float/2addr v2, v6

    float-to-int v2, v2

    .line 225
    goto :goto_6

    .line 227
    :pswitch_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I
    :try_end_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    move-result v2

    .line 228
    int-to-float v1, v2

    mul-float/2addr v1, v6

    float-to-int v1, v1

    goto :goto_6

    .line 237
    :cond_d
    :try_start_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->f(Lcom/roidapp/photogrid/release/ImageEditor;)V
    :try_end_8
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    goto/16 :goto_4

    .line 256
    :cond_e
    :try_start_9
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->j()I

    move-result v1

    if-ne v0, v1, :cond_f

    .line 257
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Lcom/roidapp/photogrid/release/ImageEditor;Z)V

    goto/16 :goto_2

    .line 258
    :cond_f
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->k()I

    move-result v1

    if-ne v0, v1, :cond_10

    .line 259
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Lcom/roidapp/photogrid/release/ImageEditor;Z)V

    goto/16 :goto_2

    .line 260
    :cond_10
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->l()I

    move-result v1

    if-ne v0, v1, :cond_11

    .line 261
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;Z)V

    goto/16 :goto_2

    .line 262
    :cond_11
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->m()I

    move-result v1

    if-ne v0, v1, :cond_12

    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;Z)V

    goto/16 :goto_2

    .line 264
    :cond_12
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->n()I

    move-result v1

    if-ne v0, v1, :cond_13

    .line 265
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Lcom/roidapp/photogrid/release/ImageEditor;I)V

    goto/16 :goto_2

    .line 266
    :cond_13
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->o()I

    move-result v1

    if-ne v0, v1, :cond_14

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/16 v1, -0xa

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Lcom/roidapp/photogrid/release/ImageEditor;I)V

    goto/16 :goto_2

    .line 268
    :cond_14
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->p()I

    move-result v1

    if-ne v0, v1, :cond_15

    .line 269
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/16 v1, 0x5a

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Lcom/roidapp/photogrid/release/ImageEditor;I)V

    goto/16 :goto_2

    .line 270
    :cond_15
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->q()I

    move-result v1

    if-ne v0, v1, :cond_16

    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->o(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto/16 :goto_2

    .line 272
    :cond_16
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->r()I

    move-result v1

    if-ne v0, v1, :cond_17

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->p(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto/16 :goto_2

    .line 274
    :cond_17
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->i()I

    move-result v1

    if-ne v0, v1, :cond_18

    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->f(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto/16 :goto_2

    .line 276
    :cond_18
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->s()I

    move-result v1

    if-ne v0, v1, :cond_19

    .line 277
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->q(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto/16 :goto_2

    .line 278
    :cond_19
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->t()I

    move-result v1

    if-ne v0, v1, :cond_1a

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->r(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto/16 :goto_2

    .line 280
    :cond_1a
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->u()I

    move-result v1

    if-ne v0, v1, :cond_1b

    .line 281
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f0d024a

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 282
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f0d024c

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 283
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f0d024d

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 284
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f0d024f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 285
    iget v0, p1, Landroid/os/Message;->arg1:I

    packed-switch v0, :pswitch_data_1

    :pswitch_4
    goto/16 :goto_2

    .line 291
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f0d024d

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 292
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f0d024f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    goto/16 :goto_2

    .line 287
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f0d024a

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v1, 0x7f0d024c

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    goto/16 :goto_2

    .line 295
    :cond_1b
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->v()I

    move-result v1

    if-ne v0, v1, :cond_1d

    .line 296
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->s(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 297
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->s(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v0

    .line 298
    add-int/lit8 v0, v0, -0x1

    .line 299
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->n(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "mask"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 300
    if-eqz v0, :cond_1c

    .line 301
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 303
    :cond_1c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->t(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;

    goto/16 :goto_2

    .line 305
    :cond_1d
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->w()I

    move-result v1

    if-ne v0, v1, :cond_1e

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->u(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto/16 :goto_2

    .line 307
    :cond_1e
    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->a:I

    if-ne v0, v1, :cond_20

    .line 308
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    .line 309
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->s(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/aq;->a(Landroid/graphics/Bitmap;)V

    .line 310
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageEditor;->s(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v1

    .line 311
    add-int/lit8 v1, v1, -0x1

    .line 312
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->v(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    .line 313
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->v(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    :goto_7
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-virtual {v2, v1, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->a(ILandroid/graphics/Bitmap;)V

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->t(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;

    .line 319
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z

    .line 320
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_2

    .line 315
    :cond_1f
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageEditor;->v(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 321
    :cond_20
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->y()I

    move-result v1

    if-ne v0, v1, :cond_21

    .line 322
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    .line 323
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v2, 0x7f0d0239

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 324
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 325
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x1

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 326
    const/16 v3, 0x11

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 327
    invoke-virtual {v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 328
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)V

    .line 329
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->i(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    goto/16 :goto_2

    .line 330
    :cond_21
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->z()I

    move-result v1

    if-ne v0, v1, :cond_22

    .line 331
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    .line 332
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const v2, 0x7f0d0239

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 333
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 334
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 335
    const/16 v3, 0x11

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 336
    invoke-virtual {v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 337
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)V

    .line 338
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->i(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    goto/16 :goto_2

    .line 339
    :cond_22
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x236

    if-ne v0, v1, :cond_23

    .line 340
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->w(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 341
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->w(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->a()V

    goto/16 :goto_2

    .line 343
    :cond_23
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x290

    if-ne v0, v1, :cond_24

    .line 344
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 345
    if-eqz v0, :cond_2

    .line 346
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_2

    .line 348
    :cond_24
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x7b

    if-ne v0, v1, :cond_25

    .line 349
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 350
    :cond_25
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_27

    .line 351
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_26

    .line 352
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 354
    :cond_26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z

    .line 355
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto/16 :goto_2

    .line 356
    :cond_27
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2bc

    if-ne v0, v1, :cond_29

    .line 357
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_28

    .line 358
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 360
    :cond_28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z

    .line 361
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 362
    :cond_29
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2bd

    if-ne v0, v1, :cond_2

    .line 363
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_2a

    .line 364
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 366
    :cond_2a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z

    .line 367
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ik;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    goto/16 :goto_2

    .line 242
    :catch_2
    move-exception v0

    move-object v1, v3

    goto/16 :goto_5

    .line 215
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 285
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_5
        :pswitch_4
        :pswitch_6
    .end packed-switch
.end method
