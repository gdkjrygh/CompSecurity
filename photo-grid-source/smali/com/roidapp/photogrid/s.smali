.class public final Lcom/roidapp/photogrid/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/cloudlib/a/b;


# instance fields
.field protected a:Landroid/widget/TextView;

.field private b:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 403
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/s;)Lcom/roidapp/photogrid/MainPage;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 13

    .prologue
    .line 47
    invoke-static {}, Lcom/roidapp/videolib/core/l;->a()Lcom/roidapp/videolib/core/l;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/MainPage;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/core/l;->a(Landroid/content/Context;)V

    .line 49
    const v0, 0x7f0300b3

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    .line 1125
    new-instance v8, Lcom/roidapp/cloudlib/template/g;

    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v8, v0}, Lcom/roidapp/cloudlib/template/g;-><init>(Landroid/content/Context;)V

    .line 1126
    invoke-virtual {v8}, Lcom/roidapp/cloudlib/template/g;->a()Lcom/roidapp/cloudlib/template/i;

    move-result-object v0

    .line 1127
    iget v1, v0, Lcom/roidapp/cloudlib/template/i;->a:I

    iget v0, v0, Lcom/roidapp/cloudlib/template/i;->b:I

    if-le v1, v0, :cond_0

    .line 1128
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "template_new"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1131
    :cond_0
    const v0, 0x7f0d02b6

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 1132
    const v0, 0x7f0d02bb

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 1133
    const v0, 0x7f0d02c0

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 1135
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->n()I

    move-result v0

    sget v2, Lcom/roidapp/videolib/f;->a:I

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "hideVideo"

    const/4 v5, 0x0

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1137
    iget-object v5, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    move-object v2, v3

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v5, v0, v2}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V

    .line 1275
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 1276
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1277
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1278
    if-le v2, v0, :cond_6

    .line 1284
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f090044

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    .line 1285
    int-to-float v0, v0

    const/high16 v5, 0x40400000    # 3.0f

    mul-float/2addr v2, v5

    sub-float/2addr v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    .line 1286
    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v0, v2

    const/high16 v2, 0x40400000    # 3.0f

    div-float/2addr v0, v2

    .line 1288
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 1290
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1291
    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1293
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1294
    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1296
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1297
    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1142
    const v0, 0x7f0d02b7

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 1143
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1145
    const v0, 0x7f0d02b9

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1146
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1148
    const v0, 0x7f0d02bc

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 1149
    invoke-virtual {v5, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1151
    const v0, 0x7f0d02be

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 1152
    if-eqz v3, :cond_2

    .line 1153
    invoke-virtual {v3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1155
    :cond_2
    const v0, 0x7f0d02c1

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 1156
    invoke-virtual {v6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1158
    const v0, 0x7f0d02c3

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 1159
    invoke-virtual {v9, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1160
    const v0, 0x7f0d02c4

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/s;->a:Landroid/widget/TextView;

    .line 1162
    const v0, 0x7f0d02c5

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    .line 1163
    invoke-virtual {v10, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1165
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->h:Lcom/roidapp/photogrid/common/w;

    const/4 v11, 0x5

    new-array v11, v11, [Landroid/view/View;

    const/4 v12, 0x0

    aput-object v1, v11, v12

    const/4 v12, 0x1

    aput-object v2, v11, v12

    const/4 v12, 0x2

    aput-object v5, v11, v12

    const/4 v12, 0x3

    aput-object v3, v11, v12

    const/4 v12, 0x4

    aput-object v4, v11, v12

    invoke-virtual {v0, v11}, Lcom/roidapp/photogrid/common/w;->a([Landroid/view/View;)V

    .line 1204
    const v0, 0x7f0d02b8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1205
    const v1, 0x7f0d02ba

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1206
    const v2, 0x7f0d02c2

    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 1207
    if-nez v3, :cond_5

    const/4 v3, 0x0

    move-object v6, v3

    .line 1208
    :goto_1
    const v3, 0x7f0d01c3

    invoke-virtual {v9, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 1209
    const v4, 0x7f0d02c6

    invoke-virtual {v10, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 1210
    const v9, 0x7f0d02bd

    invoke-virtual {v5, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 1212
    const/4 v9, 0x0

    const v10, 0x7f02033c

    const/4 v11, 0x0

    invoke-static {v0, v9, v10, v11}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1213
    const/4 v9, 0x0

    const v10, 0x7f02033a

    const/4 v11, 0x0

    invoke-static {v2, v9, v10, v11}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1214
    const/4 v9, 0x0

    const v10, 0x7f02033f

    const/4 v11, 0x0

    invoke-static {v1, v9, v10, v11}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1215
    const/4 v9, 0x0

    const v10, 0x7f020341

    const/4 v11, 0x0

    invoke-static {v6, v9, v10, v11}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1216
    const/4 v9, 0x0

    const v10, 0x7f020340

    const/4 v11, 0x0

    invoke-static {v3, v9, v10, v11}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1217
    const/4 v9, 0x0

    const v10, 0x7f02033d

    const/4 v11, 0x0

    invoke-static {v4, v9, v10, v11}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1218
    const/4 v9, 0x0

    const v10, 0x7f020339

    const/4 v11, 0x0

    invoke-static {v5, v9, v10, v11}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1223
    iget-object v5, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v9, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v9}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v9

    invoke-static {v5, v9}, Lcom/roidapp/photogrid/cloud/w;->a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;

    move-result-object v5

    .line 1224
    invoke-virtual {v5}, Lcom/roidapp/photogrid/cloud/w;->a()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 1225
    iget-object v9, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v9}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    .line 1226
    const-string v10, "main_gridmode"

    const v11, 0x7f0701a9

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1227
    const-string v0, "main_singlemode"

    const v10, 0x7f0701ae

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v0, v10}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1228
    const-string v0, "main_freemode"

    const v1, 0x7f0701a8

    invoke-virtual {v9, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1229
    if-eqz v6, :cond_3

    .line 1230
    const-string v0, "main_video"

    const v1, 0x7f0701b1

    invoke-virtual {v9, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1231
    :cond_3
    const-string v0, "main_templatemode"

    const v1, 0x7f0701af

    invoke-virtual {v9, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1232
    const-string v0, "main_high_wide"

    const v1, 0x7f0701aa

    invoke-virtual {v9, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1258
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/photogrid/t;

    invoke-direct {v1, p0, v8}, Lcom/roidapp/photogrid/t;-><init>(Lcom/roidapp/photogrid/s;Lcom/roidapp/cloudlib/template/g;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 58
    return-object v7

    .line 1207
    :cond_5
    const v4, 0x7f0d02bf

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move-object v6, v3

    goto/16 :goto_1

    :cond_6
    move v0, v2

    goto/16 :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/a/a;->a(Lcom/roidapp/cloudlib/a/b;)V

    .line 99
    :cond_0
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 63
    check-cast p1, Lcom/roidapp/photogrid/MainPage;

    iput-object p1, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    .line 65
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/a/a;->b(Lcom/roidapp/cloudlib/a/b;)Z

    .line 106
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 514
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 302
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 401
    :cond_0
    :goto_0
    return-void

    .line 305
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 342
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 345
    sget-object v0, Lcom/roidapp/photogrid/b/g;->b:Lcom/roidapp/photogrid/b/g;

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 346
    const-string v0, "CartPage_View"

    const-string v1, "Home_Cart"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v0, "Grid"

    sget v1, Lcom/roidapp/photogrid/MainPage;->g:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/MainPage;->g:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;I)V

    .line 348
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Home/Grid"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Home/Grid"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 350
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->r()V

    goto :goto_0

    .line 307
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 310
    sget-object v0, Lcom/roidapp/photogrid/b/g;->a:Lcom/roidapp/photogrid/b/g;

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 311
    const-string v0, "CartPage_View"

    const-string v1, "Home_Cart"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    const-string v0, "PhotoEditor"

    sget v1, Lcom/roidapp/photogrid/MainPage;->g:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/MainPage;->g:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;I)V

    .line 313
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Home/PhotoEditor"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Home/PhotoEditor"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 315
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->q()V

    goto/16 :goto_0

    .line 318
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 321
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 322
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 323
    :cond_2
    sget-object v0, Lcom/roidapp/photogrid/b/g;->f:Lcom/roidapp/photogrid/b/g;

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 324
    const-string v0, "CartPage_View"

    const-string v1, "Home_Cart"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const-string v0, "FilmStrip"

    sget v1, Lcom/roidapp/photogrid/MainPage;->g:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/MainPage;->g:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;I)V

    .line 326
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Home/Filmstrip"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Home/Filmstrip"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 328
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->u()V

    goto/16 :goto_0

    .line 331
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 334
    sget-object v0, Lcom/roidapp/photogrid/b/g;->c:Lcom/roidapp/photogrid/b/g;

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 335
    const-string v0, "CartPage_View"

    const-string v1, "Home_Cart"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    const-string v0, "Scrapbook"

    sget v1, Lcom/roidapp/photogrid/MainPage;->g:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/MainPage;->g:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;I)V

    .line 337
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Home/Scrapbook"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Home/Scrapbook"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 339
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->v()V

    goto/16 :goto_0

    .line 353
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 356
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 357
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 358
    :cond_3
    sget-object v0, Lcom/roidapp/photogrid/b/g;->e:Lcom/roidapp/photogrid/b/g;

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 359
    const-string v0, "TemplateSelect_View"

    const-string v1, "Home_TemplateSelect"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    const-string v0, "Template"

    sget v1, Lcom/roidapp/photogrid/MainPage;->g:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/MainPage;->g:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;I)V

    .line 361
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Home/Template"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Home/Template"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 363
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->w()V

    goto/16 :goto_0

    .line 366
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 370
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 371
    :cond_4
    sget-object v0, Lcom/roidapp/photogrid/b/g;->d:Lcom/roidapp/photogrid/b/g;

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 372
    const-string v0, "CartPage_View"

    const-string v1, "Home_Cart"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    const-string v0, "Video"

    sget v1, Lcom/roidapp/photogrid/MainPage;->g:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/MainPage;->g:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;I)V

    .line 374
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Home/Video"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Home/Video"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 376
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->s()V

    goto/16 :goto_0

    .line 381
    :pswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 385
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 386
    :cond_5
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Home/SelfCam"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Home/SelfCam"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 388
    iget-object v0, p0, Lcom/roidapp/photogrid/s;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->t()V

    goto/16 :goto_0

    .line 305
    nop

    :pswitch_data_0
    .packed-switch 0x7f0d02b7
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
