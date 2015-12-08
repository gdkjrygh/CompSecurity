.class final Lcom/roidapp/photogrid/release/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/as;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/as;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .prologue
    const/high16 v0, 0x42480000    # 50.0f

    const/4 v9, 0x4

    const/4 v8, 0x1

    const/4 v7, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    .line 164
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->a(Lcom/roidapp/photogrid/release/as;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 165
    new-instance v1, Ljava/math/BigDecimal;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/as;->c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v9}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->floatValue()F

    move-result v1

    .line 166
    new-instance v2, Ljava/math/BigDecimal;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x2

    invoke-virtual {v2, v3, v9}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 167
    div-float v3, v1, v2

    .line 168
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->f(Lcom/roidapp/photogrid/release/as;)Z

    .line 170
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->g(Lcom/roidapp/photogrid/release/as;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->g(Lcom/roidapp/photogrid/release/as;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const v2, 0x7f070119

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 206
    :cond_0
    :goto_0
    return-void

    .line 173
    :cond_1
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v5, 0x5

    if-eq v4, v5, :cond_2

    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v5, 0xa

    if-ne v4, v5, :cond_4

    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v4

    if-eq v4, v9, :cond_4

    .line 176
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 177
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 178
    if-eqz v4, :cond_3

    array-length v5, v4

    if-eqz v5, :cond_3

    .line 179
    aget-object v4, v4, v7

    iput-boolean v8, v4, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 182
    :cond_3
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/as;->g(Lcom/roidapp/photogrid/release/as;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J()V

    .line 186
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 187
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 188
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4, v7}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 190
    cmpg-float v4, v3, v6

    if-gez v4, :cond_7

    .line 191
    div-float v4, v6, v3

    sub-float v4, v6, v4

    const/high16 v5, 0x42c80000    # 100.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sub-float/2addr v0, v4

    .line 195
    :cond_5
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    new-array v5, v9, [F

    aput v1, v5, v7

    aput v2, v5, v8

    const/4 v1, 0x2

    const/4 v2, 0x0

    aput v2, v5, v1

    const/4 v1, 0x3

    aput v0, v5, v1

    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->a([F)V

    .line 196
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/as;->dismiss()V

    .line 197
    cmpg-float v0, v3, v6

    if-gez v0, :cond_8

    .line 198
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 199
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->h(Lcom/roidapp/photogrid/release/as;)Lcom/roidapp/photogrid/release/fm;

    move-result-object v0

    invoke-interface {v0, v7}, Lcom/roidapp/photogrid/release/fm;->a(Z)V

    .line 204
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->g(Lcom/roidapp/photogrid/release/as;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v7, v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto/16 :goto_0

    .line 192
    :cond_7
    cmpl-float v4, v3, v6

    if-ltz v4, :cond_5

    .line 193
    sub-float v4, v6, v3

    const/high16 v5, 0x42c80000    # 100.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v0, v4

    goto :goto_1

    .line 200
    :cond_8
    cmpl-float v0, v3, v6

    if-ltz v0, :cond_6

    .line 201
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ax;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->h(Lcom/roidapp/photogrid/release/as;)Lcom/roidapp/photogrid/release/fm;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/roidapp/photogrid/release/fm;->a(Z)V

    goto :goto_2
.end method
