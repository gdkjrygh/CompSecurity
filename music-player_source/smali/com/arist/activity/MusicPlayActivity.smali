.class public Lcom/arist/activity/MusicPlayActivity;
.super Lcom/arist/activity/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/arist/model/skin/l;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Lcom/arist/model/skin/ColorProgressBar;

.field private l:[I

.field private m:[Ljava/lang/String;

.field private n:Lcom/arist/model/lrc/LrcView;

.field private o:Landroid/view/View;

.field private p:Lcom/arist/model/equize/n;

.field private q:Lcom/arist/model/b/d;

.field private r:Lcom/arist/activity/ai;

.field private s:Landroid/widget/ViewFlipper;

.field private t:J

.field private u:Landroid/widget/ListView;

.field private v:Lcom/arist/a/i;

.field private w:Landroid/widget/ImageView;

.field private x:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/arist/activity/base/BaseActivity;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->l:[I

    return-void

    :array_0
    .array-data 4
        0x7f0200ad
        0x7f0200af
        0x7f0200ac
        0x7f0200ae
    .end array-data
.end method

.method static synthetic a(Lcom/arist/activity/MusicPlayActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/arist/activity/MusicPlayActivity;->b()V

    return-void
.end method

.method static synthetic b(Lcom/arist/activity/MusicPlayActivity;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method private b()V
    .locals 3

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/arist/b/b;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Lcom/arist/activity/MusicPlayActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->h:Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lcom/arist/c/a/a;->a(Lcom/arist/b/b;Landroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->n:Lcom/arist/model/lrc/LrcView;

    invoke-static {v1, v0}, Lcom/arist/model/lrc/e;->a(Lcom/arist/b/b;Lcom/arist/model/lrc/LrcView;)V

    :cond_0
    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->v:Lcom/arist/a/i;

    invoke-virtual {v0}, Lcom/arist/a/i;->notifyDataSetChanged()V

    return-void
.end method

.method static synthetic c(Lcom/arist/activity/MusicPlayActivity;)Lcom/arist/model/equize/n;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->p:Lcom/arist/model/equize/n;

    return-object v0
.end method

.method static synthetic d(Lcom/arist/activity/MusicPlayActivity;)Lcom/arist/model/skin/ColorProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->k:Lcom/arist/model/skin/ColorProgressBar;

    return-object v0
.end method

.method static synthetic e(Lcom/arist/activity/MusicPlayActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->j:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lcom/arist/activity/MusicPlayActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lcom/arist/activity/MusicPlayActivity;)Lcom/arist/model/lrc/LrcView;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->n:Lcom/arist/model/lrc/LrcView;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->n:Lcom/arist/model/lrc/LrcView;

    invoke-static {v0, v1}, Lcom/arist/model/lrc/e;->a(Lcom/arist/b/b;Lcom/arist/model/lrc/LrcView;)V

    return-void
.end method

.method public final a(Lcom/arist/model/skin/ColorProgressBar;ZF)V
    .locals 3

    if-eqz p2, :cond_0

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->e:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "seekProgress"

    invoke-static {}, Lcom/arist/activity/MyApplication;->b()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p3

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public handleBackClicked(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/arist/activity/MusicPlayActivity;->onBackPressed()V

    return-void
.end method

.method public handleEqualizerClicked(Landroid/view/View;)V
    .locals 2

    invoke-static {}, Lcom/arist/model/equize/j;->a()Lcom/arist/model/equize/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/model/equize/j;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f0900ed

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public handleFavouriteClicked(Landroid/view/View;)V
    .locals 4

    const/4 v3, 0x0

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/activity/MusicPlayActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/arist/activity/MusicPlayActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/arist/activity/MusicPlayActivity;->q:Lcom/arist/model/b/d;

    invoke-virtual {v2, v1, v0}, Lcom/arist/model/b/d;->b(Lcom/arist/b/b;Lcom/arist/b/c;)V

    :goto_0
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->c:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/arist/activity/MusicPlayActivity;->g:Landroid/widget/ImageView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/arist/activity/MusicPlayActivity;->q:Lcom/arist/model/b/d;

    invoke-virtual {v2, v1, v0}, Lcom/arist/model/b/d;->a(Lcom/arist/b/b;Lcom/arist/b/c;)V

    goto :goto_0
.end method

.method public handleModeClicked(Landroid/view/View;)V
    .locals 2

    sget v0, Lcom/arist/activity/MyApplication;->i:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/arist/activity/MyApplication;->i:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput v0, Lcom/arist/activity/MyApplication;->i:I

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    sget v1, Lcom/arist/activity/MyApplication;->i:I

    invoke-virtual {v0, v1}, Lcom/arist/c/f;->c(I)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->m:[Ljava/lang/String;

    sget v1, Lcom/arist/activity/MyApplication;->i:I

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    check-cast p1, Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->l:[I

    sget v1, Lcom/arist/activity/MyApplication;->i:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_0
    sget v0, Lcom/arist/activity/MyApplication;->i:I

    goto :goto_0
.end method

.method public handleNextClicked(Landroid/view/View;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public handlePlayPauseClicked(Landroid/view/View;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public handlePreviousClicked(Landroid/view/View;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public handleShareClicked(Landroid/view/View;)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.extra.STREAM"

    new-instance v2, Ljava/io/File;

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v1, "audio/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x7f0900dd

    invoke-virtual {p0, v1}, Lcom/arist/activity/MusicPlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public handleSwitcherClicked(Landroid/view/View;)V
    .locals 10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/arist/activity/MusicPlayActivity;->t:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3fc

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-wide v0, p0, Lcom/arist/activity/MusicPlayActivity;->t:J

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v4, v0, v1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getWidth()I

    move-result v0

    div-int/lit8 v6, v0, 0x2

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->w:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->w:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->w:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/arist/view/d;

    const/high16 v1, -0x3d4c0000    # -90.0f

    const/4 v2, 0x0

    int-to-float v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/arist/view/d;-><init>(FFFFF)V

    const-wide/16 v8, 0x1f4

    invoke-virtual {v0, v8, v9}, Landroid/view/animation/Animation;->setStartOffset(J)V

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, v0}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    new-instance v0, Lcom/arist/view/d;

    const/4 v1, 0x0

    const/high16 v2, 0x42b40000    # 90.0f

    int-to-float v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/arist/view/d;-><init>(FFFFF)V

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, v0}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showPrevious()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/arist/view/d;

    const/high16 v1, 0x42b40000    # 90.0f

    const/4 v2, 0x0

    int-to-float v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/arist/view/d;-><init>(FFFFF)V

    const-wide/16 v8, 0x1f4

    invoke-virtual {v0, v8, v9}, Landroid/view/animation/Animation;->setStartOffset(J)V

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, v0}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    new-instance v0, Lcom/arist/view/d;

    const/4 v1, 0x0

    const/high16 v2, -0x3d4c0000    # -90.0f

    int-to-float v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/arist/view/d;-><init>(FFFFF)V

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, v0}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    goto/16 :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->n:Lcom/arist/model/lrc/LrcView;

    invoke-static {v0, v1}, Lcom/arist/model/lrc/e;->a(Lcom/arist/b/b;Lcom/arist/model/lrc/LrcView;)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    new-instance v0, Lcom/arist/model/lrc/i;

    invoke-direct {v0}, Lcom/arist/model/lrc/i;-><init>()V

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/arist/model/lrc/i;->a(Lcom/arist/activity/MusicPlayActivity;Lcom/arist/b/b;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10

    const/4 v9, 0x0

    const v8, 0x7f060039

    const v7, 0x7f060038

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f030005

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->setContentView(I)V

    new-instance v0, Lcom/arist/model/b/d;

    invoke-direct {v0}, Lcom/arist/model/b/d;-><init>()V

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->q:Lcom/arist/model/b/d;

    invoke-virtual {p0}, Lcom/arist/activity/MusicPlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c0001

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->m:[Ljava/lang/String;

    const v0, 0x7f060034

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->a:Landroid/widget/TextView;

    const v0, 0x7f060033

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->w:Landroid/widget/ImageView;

    const v0, 0x7f0600ca

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->d:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->d:Landroid/widget/ImageView;

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    const v0, 0x7f0600cf

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f0600d1

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->j:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->i:Landroid/widget/TextView;

    invoke-static {v3}, Lcom/arist/c/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0600d0

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorProgressBar;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->k:Lcom/arist/model/skin/ColorProgressBar;

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->k:Lcom/arist/model/skin/ColorProgressBar;

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/ColorProgressBar;->a(Lcom/arist/model/skin/l;)V

    const v0, 0x7f0600c9

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    const v1, 0x7f0600c8

    invoke-virtual {p0, v1}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ViewPager;

    iput-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->x:Landroid/support/v4/view/ViewPager;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/arist/activity/MusicPlayActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const v5, 0x7f030030

    invoke-virtual {v1, v5, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/arist/activity/MusicPlayActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const v6, 0x7f030033

    invoke-virtual {v1, v6, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    const v1, 0x7f0600cd

    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/arist/model/lrc/LrcView;

    iput-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->n:Lcom/arist/model/lrc/LrcView;

    const v1, 0x7f0600ce

    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->o:Landroid/view/View;

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->o:Landroid/view/View;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->x:Landroid/support/v4/view/ViewPager;

    new-instance v6, Lcom/arist/a/h;

    invoke-direct {v6, v4}, Lcom/arist/a/h;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {v1, v6}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/aa;)V

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->x:Landroid/support/v4/view/ViewPager;

    new-instance v6, Lcom/arist/activity/ah;

    invoke-direct {v6, p0, v0}, Lcom/arist/activity/ah;-><init>(Lcom/arist/activity/MusicPlayActivity;Landroid/widget/LinearLayout;)V

    invoke-virtual {v1, v6}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/bo;)V

    invoke-virtual {p0}, Lcom/arist/activity/MusicPlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    move v0, v2

    :goto_0
    if-nez v0, :cond_3

    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    add-int/lit8 v6, v0, 0x3c

    invoke-direct {v1, v6, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const v0, 0x7f0600c1

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->c:Landroid/widget/TextView;

    :goto_1
    const v0, 0x7f0600c6

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->g:Landroid/widget/ImageView;

    const v0, 0x7f0600c4

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->e:Landroid/widget/ImageView;

    const v0, 0x7f0600c7

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->h:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->l:[I

    sget v5, Lcom/arist/activity/MyApplication;->i:I

    add-int/lit8 v5, v5, -0x1

    aget v1, v1, v5

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const v0, 0x7f060036

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->u:Landroid/widget/ListView;

    new-instance v0, Lcom/arist/a/i;

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/arist/a/i;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->v:Lcom/arist/a/i;

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->u:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->v:Lcom/arist/a/i;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->u:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f060035

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    const v0, 0x7f060037

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/equize/VisualizerView;

    new-instance v1, Lcom/arist/model/equize/n;

    sget-object v5, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v5

    invoke-direct {v1, v5}, Lcom/arist/model/equize/n;-><init>(I)V

    iput-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->p:Lcom/arist/model/equize/n;

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->p:Lcom/arist/model/equize/n;

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/VisualizerView;->a(Lcom/arist/model/equize/n;)V

    if-eqz p1, :cond_1

    const-string v0, "pager_index"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->x:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->a(I)V

    :cond_0
    const-string v0, "show_next"

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    :cond_1
    invoke-direct {p0}, Lcom/arist/activity/MusicPlayActivity;->b()V

    new-instance v0, Lcom/arist/activity/ai;

    invoke-direct {v0, p0, v3}, Lcom/arist/activity/ai;-><init>(Lcom/arist/activity/MusicPlayActivity;B)V

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->r:Lcom/arist/activity/ai;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    sget-object v1, Lcom/arist/c/a;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->r:Lcom/arist/activity/ai;

    invoke-virtual {p0, v1, v0}, Lcom/arist/activity/MusicPlayActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void

    :cond_2
    move v0, v3

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0, v7}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->b:Landroid/widget/TextView;

    invoke-virtual {p0, v8}, Lcom/arist/activity/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->c:Landroid/widget/TextView;

    goto/16 :goto_1
.end method

.method protected onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->r:Lcom/arist/activity/ai;

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->p:Lcom/arist/model/equize/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/n;->a(Z)V

    iget-object v0, p0, Lcom/arist/activity/MusicPlayActivity;->p:Lcom/arist/model/equize/n;

    invoke-virtual {v0}, Lcom/arist/model/equize/n;->b()V

    invoke-super {p0}, Lcom/arist/activity/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    sput p3, Lcom/arist/activity/MyApplication;->h:I

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "pager_index"

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->x:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->b()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "show_next"

    iget-object v1, p0, Lcom/arist/activity/MusicPlayActivity;->w:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->isSelected()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/arist/activity/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    return-void
.end method
