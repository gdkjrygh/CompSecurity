.class public Lcom/arist/activity/MainActivity;
.super Lcom/arist/activity/base/BaseActivity;

# interfaces
.implements Landroid/text/TextWatcher;
.implements Lcom/mobeta/android/dslv/i;


# instance fields
.field private A:Landroid/view/View;

.field private B:Landroid/view/View;

.field private C:Landroid/view/View;

.field private D:Lcom/arist/model/skin/ColorTextView;

.field private E:Landroid/view/View$OnCreateContextMenuListener;

.field private F:Landroid/widget/ImageView;

.field private G:Lcom/arist/model/skin/ColorImageView;

.field private H:Lcom/arist/model/skin/ColorProgressBar;

.field private I:Landroid/widget/TextView;

.field private J:Landroid/widget/TextView;

.field private K:Z

.field private L:Landroid/os/Handler;

.field private M:Landroid/widget/ImageView;

.field private N:Landroid/widget/ImageView;

.field private O:Landroid/widget/ImageView;

.field private P:[Landroid/widget/ImageView;

.field private Q:I

.field private R:Lcom/arist/activity/ad;

.field public a:I

.field public b:I

.field public c:I

.field d:Landroid/app/ProgressDialog;

.field public e:Lcom/arist/b/b;

.field private g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

.field private h:Landroid/widget/Button;

.field private i:Lcom/arist/view/e;

.field private j:I

.field private k:Lcom/arist/a/a;

.field private l:Lcom/arist/a/e;

.field private m:Lcom/arist/model/b/c;

.field private n:Lcom/arist/model/a/b;

.field private o:Landroid/support/v4/view/ViewPager;

.field private p:Lcom/arist/a/h;

.field private q:Ljava/util/ArrayList;

.field private r:Landroid/widget/ListView;

.field private s:Lcom/mobeta/android/dslv/DragSortListView;

.field private t:Landroid/view/View;

.field private u:Landroid/widget/EditText;

.field private v:Landroid/view/View;

.field private w:Lcom/arist/activity/MyApplication;

.field private x:Lcom/ijoysoft/appwall/AppWallReceiver;

.field private y:Lcom/arist/view/a;

.field private z:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/arist/activity/base/BaseActivity;-><init>()V

    iput v1, p0, Lcom/arist/activity/MainActivity;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->q:Ljava/util/ArrayList;

    sget v0, Lcom/arist/activity/MyApplication;->f:I

    iput v0, p0, Lcom/arist/activity/MainActivity;->b:I

    sget v0, Lcom/arist/activity/MyApplication;->g:I

    iput v0, p0, Lcom/arist/activity/MainActivity;->c:I

    new-instance v0, Lcom/arist/activity/l;

    invoke-direct {v0, p0}, Lcom/arist/activity/l;-><init>(Lcom/arist/activity/MainActivity;)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->E:Landroid/view/View$OnCreateContextMenuListener;

    iput-boolean v1, p0, Lcom/arist/activity/MainActivity;->K:Z

    new-instance v0, Lcom/arist/activity/s;

    invoke-direct {v0, p0}, Lcom/arist/activity/s;-><init>(Lcom/arist/activity/MainActivity;)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->L:Landroid/os/Handler;

    iput v1, p0, Lcom/arist/activity/MainActivity;->Q:I

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    return-object v0
.end method

.method static synthetic a(Lcom/arist/activity/MainActivity;I)V
    .locals 0

    iput p1, p0, Lcom/arist/activity/MainActivity;->Q:I

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/MainActivity;II)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->d:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    new-instance v0, Landroid/app/ProgressDialog;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->d:Landroid/app/ProgressDialog;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->d:Landroid/app/ProgressDialog;

    const v1, 0x7f0900f9

    invoke-virtual {p0, v1}, Lcom/arist/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->d:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->d:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->d:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    new-instance v0, Lcom/arist/activity/z;

    invoke-direct {v0, p0, p2, p1}, Lcom/arist/activity/z;-><init>(Lcom/arist/activity/MainActivity;II)V

    invoke-virtual {v0}, Lcom/arist/activity/z;->start()V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/arist/activity/MainActivity;I[I)V
    .locals 5

    const v4, 0x7f0200d4

    const v3, 0x7f0200d3

    const/4 v2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x3

    if-ne p1, v1, :cond_3

    :goto_0
    if-lt v0, p1, :cond_0

    :goto_1
    return-void

    :cond_0
    aget v1, p2, v0

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->P:[Landroid/widget/ImageView;

    aget-object v1, v1, v0

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/arist/activity/MainActivity;->P:[Landroid/widget/ImageView;

    aget-object v1, v1, v0

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    :cond_2
    aget v1, p2, v0

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->P:[Landroid/widget/ImageView;

    aget-object v1, v1, v0

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_3
    add-int/lit8 v0, v0, 0x1

    :cond_3
    if-lt v0, p1, :cond_2

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lcom/arist/activity/MainActivity;->P:[Landroid/widget/ImageView;

    aget-object v1, v1, v0

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3
.end method

.method static synthetic a(Lcom/arist/activity/MainActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arist/activity/MainActivity;->d(Z)V

    return-void
.end method

.method static synthetic b(Lcom/arist/activity/MainActivity;)I
    .locals 1

    iget v0, p0, Lcom/arist/activity/MainActivity;->Q:I

    return v0
.end method

.method static synthetic c(Lcom/arist/activity/MainActivity;)Lcom/arist/model/skin/ColorProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->H:Lcom/arist/model/skin/ColorProgressBar;

    return-object v0
.end method

.method static synthetic d(Lcom/arist/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/arist/activity/MainActivity;->h()V

    return-void
.end method

.method private d(Z)V
    .locals 4

    const/4 v1, 0x1

    const-string v0, "MainActivity"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "refrashPlayListView() : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lcom/arist/activity/MainActivity;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/arist/activity/MainActivity;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    iget v2, p0, Lcom/arist/activity/MainActivity;->b:I

    invoke-virtual {v0, v2}, Lcom/arist/a/e;->a(I)V

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->s:Lcom/mobeta/android/dslv/DragSortListView;

    iget v0, p0, Lcom/arist/activity/MainActivity;->b:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v2, v0}, Lcom/mobeta/android/dslv/DragSortListView;->a(Z)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->b(I)V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    return-object v0
.end method

.method static synthetic f(Lcom/arist/activity/MainActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arist/activity/MainActivity;->K:Z

    return v0
.end method

.method static synthetic g(Lcom/arist/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/arist/activity/MainActivity;->i()V

    return-void
.end method

.method static synthetic h(Lcom/arist/activity/MainActivity;)Lcom/arist/view/a;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    return-object v0
.end method

.method private h()V
    .locals 3

    const-string v0, "MainActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "refrashMusicListView() : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/arist/activity/MainActivity;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--------"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/arist/activity/MainActivity;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    iget v1, p0, Lcom/arist/activity/MainActivity;->b:I

    iget v2, p0, Lcom/arist/activity/MainActivity;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/arist/a/a;->a(II)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->a(I)V

    return-void
.end method

.method static synthetic i(Lcom/arist/activity/MainActivity;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->F:Landroid/widget/ImageView;

    return-object v0
.end method

.method private i()V
    .locals 3

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->I:Landroid/widget/TextView;

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->J:Landroid/widget/TextView;

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/arist/activity/MainActivity;->H:Lcom/arist/model/skin/ColorProgressBar;

    invoke-static {}, Lcom/arist/activity/MyApplication;->c()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    invoke-static {}, Lcom/arist/activity/MyApplication;->b()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->F:Landroid/widget/ImageView;

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->G:Lcom/arist/model/skin/ColorImageView;

    invoke-static {v0, v1}, Lcom/arist/c/a/a;->a(Lcom/arist/b/b;Lcom/arist/model/skin/ColorImageView;)V

    return-void
.end method

.method static synthetic j(Lcom/arist/activity/MainActivity;)Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    return-object v0
.end method

.method static synthetic k(Lcom/arist/activity/MainActivity;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->q:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic l(Lcom/arist/activity/MainActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->L:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic m(Lcom/arist/activity/MainActivity;)Lcom/arist/model/b/c;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->m:Lcom/arist/model/b/c;

    return-object v0
.end method

.method static synthetic n(Lcom/arist/activity/MainActivity;)Lcom/arist/model/a/b;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->n:Lcom/arist/model/a/b;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 10

    const-wide/high16 v8, 0x4090000000000000L    # 1024.0

    invoke-virtual {p0}, Lcom/arist/activity/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03002d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v0, 0x7f0600ae

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0600af

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0600b0

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0600b1

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->g()I

    move-result v1

    invoke-static {v1}, Lcom/arist/c/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0600b2

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->f()J

    move-result-wide v4

    const-wide/32 v6, 0x100000

    cmp-long v1, v4, v6

    if-gez v1, :cond_0

    long-to-double v4, v4

    div-double/2addr v4, v8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " KB"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0600b3

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f020064

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    const v1, 0x7f0600b5

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v3, Lcom/arist/activity/n;

    invoke-direct {v3, p0, v0}, Lcom/arist/activity/n;-><init>(Lcom/arist/activity/MainActivity;Landroid/app/Dialog;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0600b4

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/arist/activity/o;

    invoke-direct {v2, p0, v0}, Lcom/arist/activity/o;-><init>(Lcom/arist/activity/MainActivity;Landroid/app/Dialog;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_0
    const-wide/32 v6, 0x40000000

    cmp-long v1, v4, v6

    if-gez v1, :cond_1

    const-wide/16 v6, 0x400

    div-long/2addr v4, v6

    long-to-double v4, v4

    div-double/2addr v4, v8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " MB"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    goto :goto_0
.end method

.method public final a(I)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/arist/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final a(II)V
    .locals 4

    new-instance v1, Landroid/widget/ListView;

    invoke-direct {v1, p0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/widget/ArrayAdapter;

    const v3, 0x7f03000f

    invoke-direct {v0, p0, v3, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x1080027

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f09005b

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    new-instance v2, Lcom/arist/activity/y;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/arist/activity/y;-><init>(Lcom/arist/activity/MainActivity;Landroid/app/AlertDialog;II)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 5

    const/4 v4, 0x3

    const/16 v2, 0x8

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->z:Landroid/view/View;

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->D:Lcom/arist/model/skin/ColorTextView;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v0}, Lcom/arist/a/a;->a()I

    move-result v0

    if-ne v0, v4, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Lcom/arist/model/skin/ColorTextView;->setVisibility(I)V

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->A:Landroid/view/View;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v0}, Lcom/arist/a/a;->a()I

    move-result v0

    if-ne v0, v4, :cond_2

    move v0, v1

    :goto_2
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->C:Landroid/view/View;

    if-nez p1, :cond_3

    :goto_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    move v1, v2

    goto :goto_3
.end method

.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-direct {p0}, Lcom/arist/activity/MainActivity;->h()V

    invoke-direct {p0, v6}, Lcom/arist/activity/MainActivity;->d(Z)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    sget v0, Lcom/arist/activity/MyApplication;->f:I

    if-nez v0, :cond_0

    sget v0, Lcom/arist/activity/MyApplication;->g:I

    if-ne v7, v0, :cond_0

    sput v6, Lcom/arist/activity/MyApplication;->f:I

    sput v6, Lcom/arist/activity/MyApplication;->g:I

    sput v6, Lcom/arist/activity/MyApplication;->h:I

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    :cond_0
    return-void

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->m:Lcom/arist/model/b/c;

    invoke-virtual {v0}, Lcom/arist/b/b;->c()I

    move-result v0

    const-wide/16 v4, 0x0

    invoke-virtual {v3, v0, v4, v5}, Lcom/arist/model/b/c;->a(IJ)V

    goto :goto_0
.end method

.method public final b(II)V
    .locals 3

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->m:Lcom/arist/model/b/c;

    sget-object v1, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/arist/model/b/c;->b(Ljava/util/ArrayList;)V

    return-void

    :cond_0
    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v2}, Lcom/arist/b/c;->a(I)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final b(Z)V
    .locals 4

    const/16 v2, 0x8

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->u:Landroid/widget/EditText;

    if-eqz p1, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->v:Landroid/view/View;

    if-eqz p1, :cond_2

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    if-nez p1, :cond_0

    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->u:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v2, v1

    goto :goto_1
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v1}, Lcom/arist/a/a;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->n:Lcom/arist/model/a/b;

    invoke-virtual {v1, v0}, Lcom/arist/model/a/b;->b(Lcom/arist/b/c;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    invoke-direct {p0}, Lcom/arist/activity/MainActivity;->h()V

    invoke-direct {p0, v2}, Lcom/arist/activity/MainActivity;->d(Z)V

    const/4 v0, 0x3

    sget v1, Lcom/arist/activity/MyApplication;->f:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v0}, Lcom/arist/a/a;->b()I

    move-result v0

    sget v1, Lcom/arist/activity/MyApplication;->g:I

    if-ne v0, v1, :cond_0

    sput v2, Lcom/arist/activity/MyApplication;->f:I

    sput v2, Lcom/arist/activity/MyApplication;->g:I

    sput v2, Lcom/arist/activity/MyApplication;->h:I

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 7

    const/4 v6, 0x0

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->m:Lcom/arist/model/b/c;

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v2}, Lcom/arist/b/b;->c()I

    move-result v2

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v2, v4, v5}, Lcom/arist/model/b/c;->a(IJ)V

    :goto_0
    iget-object v1, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1, v2}, Lcom/arist/a/a;->a(Lcom/arist/b/b;)V

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v1}, Lcom/arist/view/a;->b()V

    iget v1, p0, Lcom/arist/activity/MainActivity;->b:I

    sget v2, Lcom/arist/activity/MyApplication;->f:I

    if-ne v1, v2, :cond_2

    iget v1, p0, Lcom/arist/activity/MainActivity;->c:I

    sget v2, Lcom/arist/activity/MyApplication;->g:I

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v1}, Lcom/arist/a/a;->getCount()I

    move-result v1

    if-nez v1, :cond_1

    sput v6, Lcom/arist/activity/MyApplication;->f:I

    sput v6, Lcom/arist/activity/MyApplication;->g:I

    sput v6, Lcom/arist/activity/MyApplication;->h:I

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    invoke-direct {p0}, Lcom/arist/activity/MainActivity;->h()V

    invoke-direct {p0, v6}, Lcom/arist/activity/MainActivity;->d(Z)V

    :goto_1
    return-void

    :cond_0
    iget-object v1, p0, Lcom/arist/activity/MainActivity;->n:Lcom/arist/model/a/b;

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    iget v4, p0, Lcom/arist/activity/MainActivity;->c:I

    invoke-virtual {v3, v4}, Lcom/arist/a/e;->b(I)Lcom/arist/b/c;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/arist/model/a/b;->a(Lcom/arist/b/b;Lcom/arist/b/c;)V

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v1}, Lcom/arist/view/a;->b()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v1}, Lcom/arist/a/a;->c()I

    move-result v1

    sget v2, Lcom/arist/activity/MyApplication;->h:I

    if-ne v1, v2, :cond_3

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    invoke-virtual {v0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    goto :goto_1

    :cond_3
    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    sput v0, Lcom/arist/activity/MyApplication;->h:I

    goto :goto_2
.end method

.method public final d()V
    .locals 5

    const/4 v2, 0x1

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900ce

    invoke-virtual {p0, v1}, Lcom/arist/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900cd

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v4}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/arist/activity/MainActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1080027

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090073

    invoke-virtual {p0, v1}, Lcom/arist/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/arist/activity/r;

    invoke-direct {v2, p0}, Lcom/arist/activity/r;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09004a

    invoke-virtual {p0, v1}, Lcom/arist/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final e()V
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    iget v0, p0, Lcom/arist/activity/MainActivity;->b:I

    sget v2, Lcom/arist/activity/MyApplication;->f:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lcom/arist/activity/MainActivity;->c:I

    sget v2, Lcom/arist/activity/MyApplication;->g:I

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getChildCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    :goto_1
    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    invoke-virtual {v4}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v3, v4}, Lcom/arist/a/a;->c(I)Lcom/arist/b/b;

    move-result-object v3

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Lcom/arist/b/b;->c()I

    move-result v3

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/b/b;->c()I

    move-result v4

    if-ne v3, v4, :cond_2

    if-eqz v0, :cond_2

    const v3, -0x3c2b22

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method public final f()V
    .locals 8

    invoke-virtual {p0}, Lcom/arist/activity/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03002e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    const v0, 0x7f0600b6

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    const v0, 0x7f0600b7

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/EditText;

    const v0, 0x7f0600b8

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/EditText;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f020064

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    const v0, 0x7f0600b9

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    new-instance v0, Lcom/arist/activity/p;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/arist/activity/p;-><init>(Lcom/arist/activity/MainActivity;Landroid/app/Dialog;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0600ba

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/arist/activity/q;

    invoke-direct {v1, p0, v2}, Lcom/arist/activity/q;-><init>(Lcom/arist/activity/MainActivity;Landroid/app/Dialog;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    invoke-virtual {v0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    return-void
.end method

.method public handleAlbumClicked(Landroid/view/View;)V
    .locals 2

    const v0, 0x7f04000d

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    new-instance v1, Lcom/arist/activity/m;

    invoke-direct {v1, p0}, Lcom/arist/activity/m;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->G:Lcom/arist/model/skin/ColorImageView;

    invoke-virtual {v1, v0}, Lcom/arist/model/skin/ColorImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public handleNextClicked(Landroid/view/View;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v1, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public handlePlayPauseClicked(Landroid/view/View;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v1, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public handlePreviousClicked(Landroid/view/View;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v1, Lcom/arist/c/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/arist/activity/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0xa

    if-ne v0, p1, :cond_1

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    :cond_0
    iget-object v0, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    invoke-virtual {v0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v0}, Lcom/arist/a/a;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V

    :cond_1
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    const/4 v3, 0x0

    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    iget v2, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v2}, Lcom/arist/a/e;->b(I)Lcom/arist/b/c;

    move-result-object v1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :cond_0
    :goto_0
    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lcom/arist/activity/MainActivity;->n:Lcom/arist/model/a/b;

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v0, p0, v1, v2, v3}, Lcom/arist/model/a/b;->a(Landroid/content/Context;Lcom/arist/b/c;Landroid/widget/BaseAdapter;Lcom/arist/view/a;)V

    goto :goto_0

    :pswitch_1
    iget-object v2, p0, Lcom/arist/activity/MainActivity;->n:Lcom/arist/model/a/b;

    invoke-virtual {v2, v1}, Lcom/arist/model/a/b;->a(Lcom/arist/b/c;)V

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    invoke-virtual {v2, v1}, Lcom/arist/a/e;->a(Lcom/arist/b/c;)V

    iget-object v1, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v1}, Lcom/arist/view/a;->b()V

    sget v1, Lcom/arist/activity/MyApplication;->f:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    sget v1, Lcom/arist/activity/MyApplication;->g:I

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    if-ne v1, v0, :cond_0

    sput v3, Lcom/arist/activity/MyApplication;->f:I

    sput v3, Lcom/arist/activity/MyApplication;->g:I

    sput v3, Lcom/arist/activity/MyApplication;->h:I

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->b(I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/4 v6, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-super {p0, v5}, Lcom/arist/activity/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0, v1}, Lcom/arist/activity/MainActivity;->requestWindowFeature(I)Z

    const v0, 0x7f030004

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->setContentView(I)V

    const-string v0, "MainActivity"

    const-string v3, "onCreate()"

    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/ijoysoft/a/a;->a()Lcom/ijoysoft/a/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ijoysoft/a/a;->a(Landroid/app/Activity;)V

    new-instance v0, Lcom/arist/activity/ad;

    invoke-direct {v0, p0, v2}, Lcom/arist/activity/ad;-><init>(Lcom/arist/activity/MainActivity;B)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->R:Lcom/arist/activity/ad;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    sget-object v3, Lcom/arist/c/a;->r:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v3, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v3, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v3, Lcom/arist/c/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v3, Lcom/arist/c/a;->x:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v3, Lcom/arist/c/a;->z:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v3, Lcom/arist/c/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v3, "android.intent.action.MEDIA_SCANNER_STARTED"

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v3, "android.intent.action.MEDIA_SCANNER_FINISHED"

    invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->R:Lcom/arist/activity/ad;

    invoke-virtual {p0, v3, v0}, Lcom/arist/activity/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    if-eqz p1, :cond_0

    const-string v0, "firstPosition"

    iget v3, p0, Lcom/arist/activity/MainActivity;->b:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/arist/activity/MainActivity;->b:I

    const-string v0, "secondPosition"

    iget v3, p0, Lcom/arist/activity/MainActivity;->c:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/arist/activity/MainActivity;->c:I

    :cond_0
    new-instance v0, Lcom/arist/model/b/c;

    invoke-direct {v0, p0}, Lcom/arist/model/b/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->m:Lcom/arist/model/b/c;

    new-instance v0, Lcom/arist/model/a/b;

    invoke-direct {v0}, Lcom/arist/model/a/b;-><init>()V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->n:Lcom/arist/model/a/b;

    sget v0, Lcom/arist/activity/MyApplication;->i:I

    iput v0, p0, Lcom/arist/activity/MainActivity;->j:I

    invoke-virtual {p0}, Lcom/arist/activity/MainActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/arist/activity/MyApplication;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->w:Lcom/arist/activity/MyApplication;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->w:Lcom/arist/activity/MyApplication;

    iget-object v0, v0, Lcom/arist/activity/MyApplication;->b:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const v0, 0x7f060028

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/AppWallView;

    new-instance v3, Lcom/ijoysoft/appwall/AppWallReceiver;

    new-instance v4, Lcom/arist/activity/t;

    invoke-direct {v4, p0, v0}, Lcom/arist/activity/t;-><init>(Lcom/arist/activity/MainActivity;Lcom/ijoysoft/appwall/AppWallView;)V

    invoke-direct {v3, v4}, Lcom/ijoysoft/appwall/AppWallReceiver;-><init>(Lcom/ijoysoft/appwall/c;)V

    iput-object v3, p0, Lcom/arist/activity/MainActivity;->x:Lcom/ijoysoft/appwall/AppWallReceiver;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->x:Lcom/ijoysoft/appwall/AppWallReceiver;

    invoke-virtual {v0, p0}, Lcom/ijoysoft/appwall/AppWallReceiver;->a(Landroid/content/Context;)V

    new-instance v0, Lcom/arist/view/a;

    new-instance v3, Lcom/arist/activity/ac;

    invoke-direct {v3, p0}, Lcom/arist/activity/ac;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-direct {v0, p0, v3}, Lcom/arist/view/a;-><init>(Landroid/content/Context;Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {p0}, Lcom/arist/activity/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f03002f

    invoke-virtual {v0, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    const v0, 0x7f0600be

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->z:Landroid/view/View;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->z:Landroid/view/View;

    const v4, 0x7f0600c0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorTextView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->D:Lcom/arist/model/skin/ColorTextView;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->D:Lcom/arist/model/skin/ColorTextView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorTextView;->a()V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->D:Lcom/arist/model/skin/ColorTextView;

    new-instance v4, Lcom/arist/activity/ab;

    invoke-direct {v4, p0}, Lcom/arist/activity/ab;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v4}, Lcom/arist/model/skin/ColorTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0600bb

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->C:Landroid/view/View;

    const v0, 0x7f0600bd

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->A:Landroid/view/View;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->A:Landroid/view/View;

    new-instance v4, Lcom/arist/activity/ab;

    invoke-direct {v4, p0}, Lcom/arist/activity/ab;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0600bc

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->B:Landroid/view/View;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->B:Landroid/view/View;

    new-instance v4, Lcom/arist/activity/ag;

    invoke-direct {v4, p0}, Lcom/arist/activity/ag;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f06008a

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    new-instance v0, Lcom/arist/a/a;

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v4

    invoke-direct {v0, p0, v4}, Lcom/arist/a/a;-><init>(Lcom/arist/activity/MainActivity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    new-instance v4, Lcom/arist/activity/af;

    invoke-direct {v4, p0}, Lcom/arist/activity/af;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->r:Landroid/widget/ListView;

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    invoke-virtual {p0}, Lcom/arist/activity/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v4, 0x7f030022

    invoke-virtual {v0, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/mobeta/android/dslv/DragSortListView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->s:Lcom/mobeta/android/dslv/DragSortListView;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->s:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0, p0}, Lcom/mobeta/android/dslv/DragSortListView;->a(Lcom/mobeta/android/dslv/i;)V

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->s:Lcom/mobeta/android/dslv/DragSortListView;

    iget v0, p0, Lcom/arist/activity/MainActivity;->b:I

    if-ne v0, v6, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {v4, v0}, Lcom/mobeta/android/dslv/DragSortListView;->a(Z)V

    new-instance v0, Lcom/arist/a/e;

    invoke-static {}, Lcom/arist/activity/MyApplication;->e()Ljava/util/ArrayList;

    move-result-object v4

    invoke-direct {v0, p0, v4}, Lcom/arist/a/e;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->s:Lcom/mobeta/android/dslv/DragSortListView;

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->l:Lcom/arist/a/e;

    invoke-virtual {v0, v4}, Lcom/mobeta/android/dslv/DragSortListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->s:Lcom/mobeta/android/dslv/DragSortListView;

    new-instance v4, Lcom/arist/activity/ae;

    invoke-direct {v4, p0}, Lcom/arist/activity/ae;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v4}, Lcom/mobeta/android/dslv/DragSortListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->s:Lcom/mobeta/android/dslv/DragSortListView;

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->E:Landroid/view/View$OnCreateContextMenuListener;

    invoke-virtual {v0, v4}, Lcom/mobeta/android/dslv/DragSortListView;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    const v0, 0x7f06002a

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->q:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->y:Lcom/arist/view/a;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->q:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/arist/activity/MainActivity;->s:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/arist/a/h;

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->q:Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Lcom/arist/a/h;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->p:Lcom/arist/a/h;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->p:Lcom/arist/a/h;

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/aa;)V

    const v0, 0x7f060026

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->h:Landroid/widget/Button;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->h:Landroid/widget/Button;

    new-instance v3, Lcom/arist/activity/u;

    invoke-direct {v3, p0}, Lcom/arist/activity/u;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f060027

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->t:Landroid/view/View;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->t:Landroid/view/View;

    new-instance v3, Lcom/arist/activity/v;

    invoke-direct {v3, p0}, Lcom/arist/activity/v;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f060029

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->u:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->u:Landroid/widget/EditText;

    invoke-virtual {v0, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f060025

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->v:Landroid/view/View;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v0}, Lcom/arist/a/a;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->a(Z)V

    const v0, 0x7f06002d

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->M:Landroid/widget/ImageView;

    const v0, 0x7f06002c

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->N:Landroid/widget/ImageView;

    const v0, 0x7f06002e

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->O:Landroid/widget/ImageView;

    new-array v0, v6, [Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->M:Landroid/widget/ImageView;

    aput-object v3, v0, v2

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->N:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/arist/activity/MainActivity;->O:Landroid/widget/ImageView;

    aput-object v3, v0, v2

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->P:[Landroid/widget/ImageView;

    const v0, 0x7f060051

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->F:Landroid/widget/ImageView;

    const v0, 0x7f060054

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorImageView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->G:Lcom/arist/model/skin/ColorImageView;

    const v0, 0x7f060053

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorProgressBar;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->H:Lcom/arist/model/skin/ColorProgressBar;

    const v0, 0x7f060056

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->I:Landroid/widget/TextView;

    const v0, 0x7f060057

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->J:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    new-instance v2, Lcom/arist/activity/w;

    invoke-direct {v2, p0}, Lcom/arist/activity/w;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/bo;)V

    invoke-direct {p0}, Lcom/arist/activity/MainActivity;->i()V

    new-instance v0, Lcom/arist/view/e;

    invoke-direct {v0, p0}, Lcom/arist/view/e;-><init>(Lcom/arist/activity/MainActivity;)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->i:Lcom/arist/view/e;

    new-instance v0, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-direct {v0, p0, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;-><init>(Landroid/app/Activity;I)V

    iput-object v0, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->i:Lcom/arist/view/e;

    invoke-virtual {v0, v2}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->j()V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->i()V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    const v2, 0x3eb33333    # 0.35f

    invoke-virtual {v0, v2}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v0, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->a(I)V

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    sget-object v1, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v1}, Lcom/arist/c/f;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v1}, Lcom/arist/c/f;->n()V

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->a(Landroid/content/Context;)V

    :cond_1
    return-void

    :cond_2
    move v0, v2

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 2

    const-string v0, "MainActivity"

    const-string v1, "onDestroy()"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->R:Lcom/arist/activity/ad;

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->x:Lcom/ijoysoft/appwall/AppWallReceiver;

    invoke-virtual {v0, p0}, Lcom/ijoysoft/appwall/AppWallReceiver;->b(Landroid/content/Context;)V

    invoke-super {p0}, Lcom/arist/activity/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    sparse-switch p1, :sswitch_data_0

    invoke-super {p0, p1, p2}, Lcom/arist/activity/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v1

    :goto_0
    return v1

    :sswitch_0
    iget-object v0, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->f()V

    goto :goto_0

    :sswitch_1
    iget-object v2, p0, Lcom/arist/activity/MainActivity;->g:Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;

    invoke-virtual {v2}, Lcom/jeremyfeinstein/slidingmenu/lib/SlidingMenu;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-super {p0, p1, p2}, Lcom/arist/activity/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/arist/activity/MainActivity;->u:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->u:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/MainActivity;->b(Z)V

    goto :goto_0

    :cond_1
    iget v2, p0, Lcom/arist/activity/MainActivity;->b:I

    if-nez v2, :cond_2

    iget v2, p0, Lcom/arist/activity/MainActivity;->a:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2, v0}, Landroid/support/v4/view/ViewPager;->a(I)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->b()I

    move-result v2

    if-lez v2, :cond_3

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->b()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->a(I)V

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/ijoysoft/a/a;->a()Lcom/ijoysoft/a/a;

    move-result-object v2

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_1
    new-instance v3, Lcom/arist/activity/x;

    invoke-direct {v3, p0}, Lcom/arist/activity/x;-><init>(Lcom/arist/activity/MainActivity;)V

    invoke-virtual {v2, p0, v0, v3}, Lcom/ijoysoft/a/a;->a(Landroid/app/Activity;ZLjava/lang/Runnable;)V

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x52 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onPause()V
    .locals 0

    invoke-super {p0}, Lcom/arist/activity/base/BaseActivity;->onPause()V

    invoke-static {p0}, Lcom/b/a/b;->a(Landroid/content/Context;)V

    return-void
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Lcom/arist/activity/base/BaseActivity;->onResume()V

    iget v0, p0, Lcom/arist/activity/MainActivity;->j:I

    sget v1, Lcom/arist/activity/MyApplication;->i:I

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->i:Lcom/arist/view/e;

    invoke-virtual {v0}, Lcom/arist/view/e;->a()V

    sget v0, Lcom/arist/activity/MyApplication;->i:I

    iput v0, p0, Lcom/arist/activity/MainActivity;->j:I

    :cond_0
    invoke-static {p0}, Lcom/b/a/b;->b(Landroid/content/Context;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "firstPosition"

    iget v1, p0, Lcom/arist/activity/MainActivity;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "secondPosition"

    iget v1, p0, Lcom/arist/activity/MainActivity;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 5

    const/4 v1, 0x0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    :goto_0
    return-void

    :cond_0
    iput v1, p0, Lcom/arist/activity/MainActivity;->b:I

    iput v1, p0, Lcom/arist/activity/MainActivity;->c:I

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    iget v2, p0, Lcom/arist/activity/MainActivity;->b:I

    invoke-virtual {v0, v2}, Lcom/arist/a/a;->a(I)V

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    iget v2, p0, Lcom/arist/activity/MainActivity;->c:I

    invoke-virtual {v0, v2}, Lcom/arist/a/a;->b(I)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->o:Landroid/support/v4/view/ViewPager;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->a(I)V

    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    iget-object v0, p0, Lcom/arist/activity/MainActivity;->k:Lcom/arist/a/a;

    invoke-virtual {v0, v4}, Lcom/arist/a/a;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    invoke-virtual {v0}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method
