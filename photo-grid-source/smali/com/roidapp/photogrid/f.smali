.class public final Lcom/roidapp/photogrid/f;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/baselib/hlistview/s;


# instance fields
.field private a:Lcom/roidapp/baselib/hlistview/HListView;

.field private b:Landroid/widget/HorizontalScrollView;

.field private c:Landroid/widget/ImageView;

.field private d:Lcom/roidapp/photogrid/MainPage;

.field private e:Landroid/view/View;

.field private f:Landroid/view/View;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/roidapp/photogrid/i;

.field private i:Z

.field private j:Landroid/os/Handler;

.field private k:Lcom/roidapp/photogrid/release/kp;

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 55
    new-instance v0, Lcom/roidapp/photogrid/g;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/g;-><init>(Lcom/roidapp/photogrid/f;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/f;->j:Landroid/os/Handler;

    .line 539
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/f;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->j:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    invoke-static {p0}, Lcom/roidapp/photogrid/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/f;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/roidapp/photogrid/f;->g:Ljava/util/List;

    return-object p1
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 350
    const-string v0, ""

    .line 351
    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 352
    if-gez v1, :cond_0

    .line 353
    const/4 v0, 0x0

    .line 360
    :goto_0
    return-object v0

    .line 356
    :cond_0
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 358
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/f;)Ljava/util/List;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->g:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/f;)Lcom/roidapp/photogrid/release/kp;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->k:Lcom/roidapp/photogrid/release/kp;

    return-object v0
.end method

.method static synthetic h()V
    .locals 0

    .prologue
    .line 42
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/baselib/hlistview/AdapterView;Landroid/view/View;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/baselib/hlistview/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 467
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/j;

    .line 468
    iget-object v0, v0, Lcom/roidapp/photogrid/j;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/GridImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 470
    iget-object v1, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    if-eqz v1, :cond_0

    .line 472
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Main/Create/Recent/Position---"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v1, v2, v3, v4, v5}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 473
    iget-object v1, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/MainPage;->a(Ljava/lang/String;)V

    .line 486
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->h:Lcom/roidapp/photogrid/i;

    if-nez v0, :cond_0

    .line 118
    new-instance v0, Lcom/roidapp/photogrid/i;

    invoke-direct {v0, p0, v2}, Lcom/roidapp/photogrid/i;-><init>(Lcom/roidapp/photogrid/f;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/f;->h:Lcom/roidapp/photogrid/i;

    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->a:Lcom/roidapp/baselib/hlistview/HListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/f;->h:Lcom/roidapp/photogrid/i;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/widget/ListAdapter;)V

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->h:Lcom/roidapp/photogrid/i;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/i;->notifyDataSetChanged()V

    .line 122
    iput-boolean v2, p0, Lcom/roidapp/photogrid/f;->l:Z

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->g:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/f;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 124
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->e:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 128
    :goto_0
    return-void

    .line 126
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->f:Landroid/view/View;

    const v1, 0x7f0d02ad

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 134
    :cond_0
    return-void
.end method

.method public final g()V
    .locals 3

    .prologue
    .line 171
    iget-boolean v0, p0, Lcom/roidapp/photogrid/f;->i:Z

    if-nez v0, :cond_1

    .line 347
    :cond_0
    :goto_0
    return-void

    .line 172
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/f;->l:Z

    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->n()I

    move-result v0

    sget v1, Lcom/roidapp/videolib/f;->a:I

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "hideVideo"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 175
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->f()V

    .line 178
    :cond_2
    const-string v0, "FastTools/initRecent"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 179
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 180
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f07028d

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 183
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 188
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/h;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/h;-><init>(Lcom/roidapp/photogrid/f;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 108
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onActivityCreated(Landroid/os/Bundle;)V

    .line 1137
    const/16 v0, 0x64

    .line 1138
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1139
    const/16 v3, 0x1e0

    if-gt v2, v3, :cond_1

    .line 1140
    const/16 v0, 0x46

    .line 1144
    :cond_0
    :goto_0
    new-instance v2, Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/photogrid/f;->j:Landroid/os/Handler;

    invoke-direct {v2, v3, v0, v4}, Lcom/roidapp/photogrid/release/kp;-><init>(Landroid/content/Context;ILandroid/os/Handler;)V

    iput-object v2, p0, Lcom/roidapp/photogrid/f;->k:Lcom/roidapp/photogrid/release/kp;

    .line 1146
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1147
    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1149
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020086

    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 1157
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/f;->k:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/kp;->a(Landroid/graphics/Bitmap;)V

    .line 110
    new-instance v0, Lcom/roidapp/photogrid/i;

    invoke-direct {v0, p0, v5}, Lcom/roidapp/photogrid/i;-><init>(Lcom/roidapp/photogrid/f;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/f;->h:Lcom/roidapp/photogrid/i;

    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->a:Lcom/roidapp/baselib/hlistview/HListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/f;->h:Lcom/roidapp/photogrid/i;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/widget/ListAdapter;)V

    .line 112
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/f;->i:Z

    .line 113
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->g()V

    .line 114
    return-void

    .line 1141
    :cond_1
    const/16 v3, 0x5a0

    if-lt v2, v3, :cond_0

    .line 1142
    const/16 v0, 0x96

    goto :goto_0

    .line 1151
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v1

    .line 1156
    goto :goto_1

    .line 1154
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    .line 1155
    goto :goto_1
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 77
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onAttach(Landroid/app/Activity;)V

    .line 78
    check-cast p1, Lcom/roidapp/photogrid/MainPage;

    iput-object p1, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    .line 79
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 365
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 414
    :goto_0
    return-void

    .line 367
    :pswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Close/Fast"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Create/Close/Fast"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 369
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->y()V

    goto :goto_0

    .line 373
    :pswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Grid"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Create/Grid"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 375
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->r()V

    goto :goto_0

    .line 379
    :pswitch_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/PhotoEditor"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Create/PhotoEditor"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 381
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->q()V

    goto :goto_0

    .line 385
    :pswitch_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/SelfCam"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Create/SelfCam"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 387
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->t()V

    goto/16 :goto_0

    .line 391
    :pswitch_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Video"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Create/Video"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 393
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->s()V

    goto/16 :goto_0

    .line 397
    :pswitch_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Scrapbook"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Create/Scrapbook"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 399
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->v()V

    goto/16 :goto_0

    .line 403
    :pswitch_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Template"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Create/Template"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 405
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->w()V

    goto/16 :goto_0

    .line 409
    :pswitch_7
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Filmstrip"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    invoke-virtual {p0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Main/Create/Filmstrip"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 411
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->u()V

    goto/16 :goto_0

    .line 365
    nop

    :pswitch_data_0
    .packed-switch 0x7f0d02aa
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 84
    const v0, 0x7f0300b0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 85
    const v0, 0x7f0d02a5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    const v0, 0x7f0d02a7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/HListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/f;->a:Lcom/roidapp/baselib/hlistview/HListView;

    .line 87
    const v0, 0x7f0d02a8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/f;->b:Landroid/widget/HorizontalScrollView;

    .line 88
    const v0, 0x7f0d02b1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/f;->c:Landroid/widget/ImageView;

    .line 89
    const v0, 0x7f0d0171

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/f;->e:Landroid/view/View;

    .line 90
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/f;->a:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/HListView;->a(Lcom/roidapp/baselib/hlistview/s;)V

    .line 92
    const v0, 0x7f0d02aa

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    const v0, 0x7f0d02ab

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    const v0, 0x7f0d02ac

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    const v0, 0x7f0d02ad

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    const v0, 0x7f0d02ae

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    const v0, 0x7f0d02af

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    const v0, 0x7f0d02b0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    iput-object v1, p0, Lcom/roidapp/photogrid/f;->f:Landroid/view/View;

    .line 103
    return-object v1
.end method
