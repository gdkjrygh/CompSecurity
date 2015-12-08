.class public final Lcom/roidapp/photogrid/cloud/a/u;
.super Lcom/roidapp/photogrid/cloud/a/l;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:I

.field private c:Ljava/lang/Boolean;

.field private g:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;Z)V
    .locals 6

    .prologue
    .line 31
    const/4 v0, 0x3

    invoke-direct {p0, p1, v0, p2}, Lcom/roidapp/photogrid/cloud/a/l;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 32
    iput-boolean p3, p0, Lcom/roidapp/photogrid/cloud/a/u;->a:Z

    .line 1038
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->a:Z

    if-eqz v0, :cond_0

    .line 1040
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    packed-switch v0, :pswitch_data_0

    .line 1048
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    .line 1091
    :goto_0
    return-void

    .line 1042
    :pswitch_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto :goto_0

    .line 1045
    :pswitch_1
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto :goto_0

    .line 1201
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->d:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 1202
    const/4 v0, 0x0

    .line 1054
    :goto_1
    if-eqz v0, :cond_5

    .line 1055
    const/4 v0, 0x6

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto :goto_0

    .line 1204
    :cond_1
    invoke-static {}, Lcom/roidapp/videolib/core/l;->a()Lcom/roidapp/videolib/core/l;

    invoke-static {}, Lcom/roidapp/videolib/core/l;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1205
    const/4 v0, 0x0

    goto :goto_1

    .line 1207
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->c:Ljava/lang/Boolean;

    if-nez v0, :cond_4

    .line 1208
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 1210
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1211
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    .line 1214
    :cond_3
    sget-object v1, Lcom/roidapp/photogrid/cloud/a/v;->a:[I

    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    move-result-object v2

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v3

    const-string v4, "video"

    const-string v5, "black_list"

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;Ljava/util/List;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    .line 1224
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/u;->c:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    .line 1216
    :pswitch_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    .line 1218
    :pswitch_3
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    .line 1221
    :pswitch_4
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    invoke-static {v0}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    .line 1059
    :cond_5
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_2

    .line 1085
    :pswitch_5
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    packed-switch v0, :pswitch_data_3

    .line 1093
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1061
    :pswitch_6
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_6

    .line 1062
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1065
    :cond_6
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1069
    :pswitch_7
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_7

    .line 1070
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1073
    :cond_7
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1077
    :pswitch_8
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_8

    .line 1078
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1081
    :cond_8
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1087
    :pswitch_9
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1090
    :pswitch_a
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    goto/16 :goto_0

    .line 1040
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 1214
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    .line 1059
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_8
    .end packed-switch

    .line 1085
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v4, 0x0

    const v7, 0x7f0702bf

    .line 129
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->f:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move-object v0, v4

    .line 187
    :goto_0
    return-object v0

    .line 131
    :cond_1
    if-eqz p2, :cond_6

    .line 132
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/a/u;

    if-nez v0, :cond_6

    move-object v5, v4

    .line 138
    :goto_1
    if-eqz v5, :cond_2

    .line 140
    :goto_2
    if-nez v5, :cond_3

    move-object v0, v4

    .line 141
    goto :goto_0

    .line 138
    :cond_2
    const v0, 0x7f030013

    invoke-virtual {p1, v0, p3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    goto :goto_2

    .line 143
    :cond_3
    invoke-virtual {v5, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    const v0, 0x7f0d007d

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 146
    const v1, 0x7f0d007b

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 147
    const v2, 0x7f0d007c

    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 148
    const v3, 0x7f0d007e

    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 149
    const/16 v6, 0x8

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 151
    if-nez v0, :cond_4

    move-object v0, v4

    .line 152
    goto :goto_0

    .line 154
    :cond_4
    iget v4, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    packed-switch v4, :pswitch_data_0

    .line 185
    :goto_3
    :pswitch_0
    invoke-virtual {v5, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v5

    .line 187
    goto :goto_0

    .line 156
    :pswitch_1
    const v3, 0x7f02045f

    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 157
    const v0, 0x7f0702b0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 158
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    .line 162
    :pswitch_2
    const v3, 0x7f020461

    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 163
    const v0, 0x7f0702af

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 164
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    .line 168
    :pswitch_3
    const v3, 0x7f0205ce

    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 169
    const v0, 0x7f0702b1

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 170
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    .line 174
    :pswitch_4
    const v4, 0x7f0702b2

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 175
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    .line 176
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/u;->g:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/u;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_5

    .line 177
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/u;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 178
    :cond_5
    invoke-virtual {v3}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 179
    const/16 v1, 0x4b

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 180
    const v0, 0x7f0200fa

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 181
    invoke-virtual {v3, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    :cond_6
    move-object v5, p2

    goto/16 :goto_1

    .line 154
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 123
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->g:Landroid/graphics/Bitmap;

    .line 124
    invoke-super {p0}, Lcom/roidapp/photogrid/cloud/a/l;->a()V

    .line 125
    return-void
.end method

.method final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 194
    :goto_0
    return-void

    .line 193
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/u;->g:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method final b()I
    .locals 1

    .prologue
    .line 197
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/u;->b:I

    return v0
.end method
