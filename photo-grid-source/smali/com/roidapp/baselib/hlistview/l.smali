.class public final Lcom/roidapp/baselib/hlistview/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AbsHListView;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private final g:I

.field private h:I


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 1

    .prologue
    .line 3923
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3924
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/l;->g:I

    .line 3925
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 4169
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4170
    return-void
.end method

.method final a(I)V
    .locals 9

    .prologue
    const/16 v5, 0xc8

    const/4 v0, 0x0

    const/4 v4, -0x1

    .line 3928
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 3930
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-boolean v1, v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-eqz v1, :cond_1

    .line 3932
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    new-instance v1, Lcom/roidapp/baselib/hlistview/m;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/baselib/hlistview/m;-><init>(Lcom/roidapp/baselib/hlistview/l;I)V

    iput-object v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->O:Ljava/lang/Runnable;

    .line 3974
    :cond_0
    :goto_0
    return-void

    .line 3942
    :cond_1
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 3943
    if-eqz v1, :cond_0

    .line 3948
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v2, v2, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 3949
    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    .line 3952
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->s()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 3953
    if-ge v3, v2, :cond_2

    .line 3954
    sub-int v0, v2, v3

    add-int/lit8 v0, v0, 0x1

    .line 3955
    const/4 v1, 0x2

    iput v1, p0, Lcom/roidapp/baselib/hlistview/l;->b:I

    .line 3964
    :goto_1
    if-lez v0, :cond_8

    .line 3965
    div-int v0, v5, v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    .line 3969
    :goto_2
    iput v3, p0, Lcom/roidapp/baselib/hlistview/l;->c:I

    .line 3970
    iput v4, p0, Lcom/roidapp/baselib/hlistview/l;->d:I

    .line 3971
    iput v4, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    .line 3973
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 3956
    :cond_2
    if-le v3, v1, :cond_3

    .line 3957
    sub-int v0, v3, v1

    add-int/lit8 v0, v0, 0x1

    .line 3958
    const/4 v1, 0x1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/l;->b:I

    goto :goto_1

    .line 5119
    :cond_3
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v1, v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 5120
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v2

    .line 5121
    add-int/2addr v2, v1

    add-int/lit8 v2, v2, -0x1

    .line 5122
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v4, v4, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 5123
    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v6, v6, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    sub-int/2addr v5, v6

    .line 5125
    if-lt v3, v1, :cond_4

    if-le v3, v2, :cond_5

    .line 5126
    :cond_4
    const-string v6, "AbsListView"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "scrollToVisible called with targetPos "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " not visible ["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ", "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v7, "]"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 5134
    :cond_5
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    sub-int v1, v3, v1

    invoke-virtual {v2, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 5135
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 5136
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    .line 5139
    if-le v1, v5, :cond_6

    .line 5140
    sub-int v0, v1, v5

    .line 5142
    :cond_6
    if-ge v2, v4, :cond_7

    .line 5143
    sub-int v0, v2, v4

    .line 5146
    :cond_7
    if-eqz v0, :cond_0

    .line 5165
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d(I)V

    goto/16 :goto_0

    .line 3967
    :cond_8
    iput v5, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    goto/16 :goto_2
.end method

.method public final run()V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v7, 0x1

    .line 4174
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v1

    .line 4175
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v2, v2, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 4177
    iget v3, p0, Lcom/roidapp/baselib/hlistview/l;->b:I

    packed-switch v3, :pswitch_data_0

    .line 4345
    :cond_0
    :goto_0
    return-void

    .line 4179
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 4180
    add-int/2addr v2, v0

    .line 4182
    if-ltz v0, :cond_0

    .line 4186
    iget v3, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    if-ne v2, v3, :cond_1

    .line 4188
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 4192
    :cond_1
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v3, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 4193
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 4194
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    .line 4195
    sub-int/2addr v1, v0

    .line 4196
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    add-int/lit8 v0, v0, -0x1

    if-ge v2, v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget v4, p0, Lcom/roidapp/baselib/hlistview/l;->g:I

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 4198
    :goto_1
    sub-int v1, v3, v1

    add-int/2addr v0, v1

    .line 4199
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v3, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    invoke-virtual {v1, v0, v3, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    .line 4201
    iput v2, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    .line 4202
    iget v0, p0, Lcom/roidapp/baselib/hlistview/l;->c:I

    if-ge v2, v0, :cond_0

    .line 4203
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 4196
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    goto :goto_1

    .line 4210
    :pswitch_1
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 4212
    iget v3, p0, Lcom/roidapp/baselib/hlistview/l;->d:I

    if-eq v2, v3, :cond_0

    if-le v1, v7, :cond_0

    add-int/2addr v1, v2

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v3, v3, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-ge v1, v3, :cond_0

    .line 4216
    add-int/lit8 v1, v2, 0x1

    .line 4218
    iget v2, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    if-ne v1, v2, :cond_3

    .line 4220
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 4224
    :cond_3
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 4225
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 4226
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 4227
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v4, v4, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    iget v5, p0, Lcom/roidapp/baselib/hlistview/l;->g:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 4228
    iget v5, p0, Lcom/roidapp/baselib/hlistview/l;->d:I

    if-ge v1, v5, :cond_4

    .line 4229
    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    add-int/2addr v2, v3

    sub-int/2addr v2, v4

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    invoke-virtual {v5, v0, v2, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    .line 4231
    iput v1, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    .line 4233
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 4235
    :cond_4
    if-le v2, v4, :cond_0

    .line 4236
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    sub-int v1, v2, v4

    iget v2, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    invoke-virtual {v0, v1, v2, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    goto/16 :goto_0

    .line 4243
    :pswitch_2
    iget v1, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    if-ne v2, v1, :cond_5

    .line 4245
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 4249
    :cond_5
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 4250
    if-eqz v0, :cond_0

    .line 4253
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v1

    .line 4254
    if-lez v2, :cond_6

    iget v0, p0, Lcom/roidapp/baselib/hlistview/l;->g:I

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v3, v3, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 4256
    :goto_2
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    sub-int v0, v1, v0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    invoke-virtual {v3, v0, v1, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    .line 4258
    iput v2, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    .line 4260
    iget v0, p0, Lcom/roidapp/baselib/hlistview/l;->c:I

    if-le v2, v0, :cond_0

    .line 4261
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 4254
    :cond_6
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    goto :goto_2

    .line 4267
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    .line 4268
    if-ltz v0, :cond_0

    .line 4271
    add-int/2addr v2, v0

    .line 4273
    iget v3, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    if-ne v2, v3, :cond_7

    .line 4275
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 4279
    :cond_7
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v3, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 4280
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 4281
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    .line 4282
    sub-int v4, v1, v0

    .line 4283
    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v5, v5, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    iget v6, p0, Lcom/roidapp/baselib/hlistview/l;->g:I

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 4284
    iput v2, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    .line 4285
    iget v6, p0, Lcom/roidapp/baselib/hlistview/l;->d:I

    if-le v2, v6, :cond_8

    .line 4286
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    sub-int v1, v4, v5

    neg-int v1, v1

    iget v2, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    invoke-virtual {v0, v1, v2, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    .line 4287
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 4289
    :cond_8
    sub-int/2addr v1, v5

    .line 4290
    add-int/2addr v0, v3

    .line 4291
    if-le v1, v0, :cond_0

    .line 4292
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    sub-int v0, v1, v0

    neg-int v0, v0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    invoke-virtual {v2, v0, v1, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    goto/16 :goto_0

    .line 4299
    :pswitch_4
    iget v1, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    if-ne v1, v2, :cond_9

    .line 4301
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 4305
    :cond_9
    iput v2, p0, Lcom/roidapp/baselib/hlistview/l;->e:I

    .line 4307
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 4308
    iget v3, p0, Lcom/roidapp/baselib/hlistview/l;->c:I

    .line 4309
    add-int v4, v2, v1

    add-int/lit8 v4, v4, -0x1

    .line 4312
    if-ge v3, v2, :cond_b

    .line 4313
    sub-int v0, v2, v3

    add-int/lit8 v0, v0, 0x1

    .line 4319
    :cond_a
    :goto_3
    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 4321
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 4322
    if-ge v3, v2, :cond_c

    .line 4323
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    float-to-int v1, v1

    .line 4324
    iget v2, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 4325
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2, v1, v0, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    .line 4326
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 4314
    :cond_b
    if-le v3, v4, :cond_a

    .line 4315
    sub-int v0, v3, v4

    goto :goto_3

    .line 4327
    :cond_c
    if-le v3, v4, :cond_d

    .line 4328
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    float-to-int v1, v1

    .line 4329
    iget v2, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 4330
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2, v1, v0, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    .line 4331
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 4334
    :cond_d
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    sub-int v1, v3, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    .line 4335
    iget v1, p0, Lcom/roidapp/baselib/hlistview/l;->h:I

    sub-int/2addr v0, v1

    .line 4336
    iget v1, p0, Lcom/roidapp/baselib/hlistview/l;->f:I

    int-to-float v1, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 4337
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/l;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2, v0, v1, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    goto/16 :goto_0

    .line 4177
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
