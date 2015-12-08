.class public final Lcom/roidapp/photogrid/release/jj;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/ProgressBar;

.field private i:Landroid/graphics/Bitmap;

.field private j:I

.field private k:I

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 136
    new-instance v0, Lcom/roidapp/photogrid/release/jk;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/jk;-><init>(Lcom/roidapp/photogrid/release/jj;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->n:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/jj;I)I
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/roidapp/photogrid/release/jj;->j:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/jj;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->h:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 284
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 287
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 290
    :cond_1
    iput-object v1, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    .line 291
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/jj;Z)Z
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/jj;->l:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/jj;I)I
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/roidapp/photogrid/release/jj;->k:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/jj;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->b:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/jj;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->n:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jj;->m:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 46
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 47
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 295
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 1276
    :goto_0
    :sswitch_0
    return-void

    .line 1267
    :sswitch_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1268
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/jj;->m:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "image/*"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 1271
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/jj;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1273
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    .line 1274
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/jj;->a()V

    .line 1275
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/jj;->dismissAllowingStateLoss()V

    goto :goto_0

    .line 303
    :sswitch_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/jj;->a()V

    .line 304
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/jj;->dismissAllowingStateLoss()V

    goto :goto_0

    .line 295
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0d002a -> :sswitch_2
        0x7f0d02c9 -> :sswitch_0
        0x7f0d02cb -> :sswitch_1
    .end sparse-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/16 v3, 0x8

    .line 63
    const v0, 0x7f0300b5

    invoke-virtual {p1, v0, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 64
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v3, :cond_0

    .line 65
    const v0, 0x7f02008e

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1092
    :cond_0
    const v0, 0x7f0d02ca

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->c:Landroid/widget/TextView;

    .line 1093
    const v0, 0x7f0d002a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->d:Landroid/widget/TextView;

    .line 1094
    const v0, 0x7f0d02cb

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->e:Landroid/widget/TextView;

    .line 1095
    const v0, 0x7f0d02ce

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->a:Landroid/widget/ImageView;

    .line 1096
    const v0, 0x7f0d02cf

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->b:Landroid/widget/ImageView;

    .line 1097
    const v0, 0x7f0d02d0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->f:Landroid/widget/TextView;

    .line 1098
    const v0, 0x7f0d02cd

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->g:Landroid/widget/RelativeLayout;

    .line 1099
    const v0, 0x7f0d0094

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/jj;->h:Landroid/widget/ProgressBar;

    .line 1103
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1104
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1120
    const v0, 0x7f0d02c9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1121
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1122
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1125
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->d:Landroid/widget/TextView;

    const v2, 0x7f070304

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 1126
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1128
    const v0, 0x7f0d02cc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 69
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/jj;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/jj;->j:I

    .line 72
    sget v0, Lcom/roidapp/photogrid/common/az;->g:I

    if-nez v0, :cond_1

    .line 73
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 74
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/jj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 75
    iget v2, v0, Landroid/graphics/Rect;->top:I

    if-lez v2, :cond_1

    .line 76
    iget v0, v0, Landroid/graphics/Rect;->top:I

    sput v0, Lcom/roidapp/photogrid/common/az;->g:I

    .line 80
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/jj;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    sget v2, Lcom/roidapp/photogrid/common/az;->g:I

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/jj;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f5

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/photogrid/release/jj;->k:I

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jj;->m:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/photogrid/release/jj;->j:I

    iget v3, p0, Lcom/roidapp/photogrid/release/jj;->k:I

    .line 1201
    iget-object v4, p0, Lcom/roidapp/photogrid/release/jj;->a:Landroid/widget/ImageView;

    if-eqz v4, :cond_2

    .line 1202
    iget-object v4, p0, Lcom/roidapp/photogrid/release/jj;->a:Landroid/widget/ImageView;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1204
    :cond_2
    iget-object v4, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_3

    .line 1205
    iget-object v4, p0, Lcom/roidapp/photogrid/release/jj;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 1207
    :cond_3
    iget-object v4, p0, Lcom/roidapp/photogrid/release/jj;->h:Landroid/widget/ProgressBar;

    if-eqz v4, :cond_4

    .line 1208
    iget-object v4, p0, Lcom/roidapp/photogrid/release/jj;->h:Landroid/widget/ProgressBar;

    invoke-virtual {v4, v6}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1210
    :cond_4
    new-instance v4, Ljava/lang/Thread;

    new-instance v5, Lcom/roidapp/photogrid/release/jl;

    invoke-direct {v5, p0, v0, v2, v3}, Lcom/roidapp/photogrid/release/jl;-><init>(Lcom/roidapp/photogrid/release/jj;Ljava/lang/String;II)V

    invoke-direct {v4, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 86
    return-object v1
.end method

.method public final onPause()V
    .locals 0

    .prologue
    .line 56
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onPause()V

    .line 57
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/jj;->a()V

    .line 58
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/jj;->dismissAllowingStateLoss()V

    .line 59
    return-void
.end method
