.class public Lcom/roidapp/photogrid/video/TrackSelector;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/photogrid/video/ce;


# instance fields
.field private A:Landroid/app/AlertDialog;

.field private B:Landroid/content/Context;

.field private C:Landroid/widget/ProgressBar;

.field private D:Landroid/widget/TextView;

.field private E:Lcom/roidapp/photogrid/video/f;

.field private F:I

.field private G:Z

.field private H:Z

.field private I:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

.field private J:Landroid/os/Handler;

.field private K:I

.field private L:I

.field private M:Z

.field private N:Landroid/app/AlertDialog;

.field private O:Ljava/lang/String;

.field private P:Landroid/content/ServiceConnection;

.field private Q:Lcom/roidapp/photogrid/video/MusicPlayerService;

.field private R:Landroid/content/Intent;

.field private S:Landroid/content/BroadcastReceiver;

.field a:Lcom/roidapp/photogrid/video/q;

.field private b:Lcom/roidapp/baselib/view/FixedDrawerLayout;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/ListView;

.field private e:Lcom/roidapp/photogrid/video/XListView;

.field private f:I

.field private g:Lcom/roidapp/photogrid/video/ad;

.field private h:Lcom/roidapp/photogrid/video/g;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/view/View;

.field private k:Landroid/view/View;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/Button;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/widget/LinearLayout;

.field private s:Landroid/widget/ImageView;

.field private y:Landroid/widget/ProgressBar;

.field private z:Landroid/app/AlertDialog;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 56
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 61
    iput v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->f:I

    .line 85
    const v0, 0x989680

    iput v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    .line 114
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->G:Z

    .line 115
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->H:Z

    .line 116
    iput-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->I:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 117
    new-instance v0, Lcom/roidapp/photogrid/video/ae;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/video/ae;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    .line 259
    sget v0, Lcom/roidapp/photogrid/video/bg;->a:I

    iput v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->K:I

    .line 260
    iput v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->L:I

    .line 1188
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->M:Z

    .line 1189
    iput-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->N:Landroid/app/AlertDialog;

    .line 1235
    iput-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->O:Ljava/lang/String;

    .line 1254
    new-instance v0, Lcom/roidapp/photogrid/video/bh;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/video/bh;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->P:Landroid/content/ServiceConnection;

    .line 1255
    iput-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->Q:Lcom/roidapp/photogrid/video/MusicPlayerService;

    .line 1257
    new-instance v0, Lcom/roidapp/photogrid/video/ay;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/video/ay;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->S:Landroid/content/BroadcastReceiver;

    .line 1291
    return-void
.end method

.method static synthetic A(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->z:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic B(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->z:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic C(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic D(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->d:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic E(Lcom/roidapp/photogrid/video/TrackSelector;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->f:I

    return v0
.end method

.method static synthetic F(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->c:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic G(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->b:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    return-object v0
.end method

.method static synthetic H(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic I(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->N:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic J(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->N:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic K(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->R:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/TrackSelector;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->L:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/MusicPlayerService;)Lcom/roidapp/photogrid/video/MusicPlayerService;
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->Q:Lcom/roidapp/photogrid/video/MusicPlayerService;

    return-object p1
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 721
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 722
    :cond_0
    const-string p0, ""

    .line 730
    :cond_1
    :goto_0
    return-object p0

    .line 723
    :cond_2
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    .line 724
    const/4 v1, 0x7

    if-ge v0, v1, :cond_3

    .line 725
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    .line 726
    const/16 v1, 0x8

    if-lt v0, v1, :cond_1

    :cond_3
    move v1, v0

    .line 729
    if-nez p1, :cond_6

    const/4 v0, -0x1

    .line 730
    :goto_1
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_5

    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_5
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 729
    :cond_6
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_1
.end method

.method private a(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 593
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->g:Lcom/roidapp/photogrid/video/ad;

    if-eqz v0, :cond_1

    .line 594
    iput p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    .line 595
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 596
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->e(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->L:I

    .line 597
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/XListView;->a(Z)V

    .line 598
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/XListView;->c()V

    .line 599
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    const v1, 0x989682

    if-ne v0, v1, :cond_3

    .line 600
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->L:I

    if-lez v0, :cond_2

    .line 601
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/XListView;->a()V

    .line 608
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->g:Lcom/roidapp/photogrid/video/ad;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ad;->notifyDataSetChanged()V

    .line 610
    :cond_1
    return-void

    .line 603
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/XListView;->b(Z)V

    goto :goto_0

    .line 606
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->b(Z)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/TrackSelector;IZ)V
    .locals 3

    .prologue
    .line 56
    .line 2632
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_2

    .line 2634
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2635
    new-instance v1, Lcom/roidapp/photogrid/video/af;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/af;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 2656
    new-instance v1, Lcom/roidapp/photogrid/video/ag;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/ag;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 2669
    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    const v2, 0x7f070035

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    const v2, 0x7f07003a

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    const v2, 0x7f07003c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/video/ai;

    invoke-direct {v2, p0, p1}, Lcom/roidapp/photogrid/video/ai;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;I)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    const v2, 0x7f070034

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/video/ah;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/ah;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 2709
    :cond_1
    :goto_0
    return-void

    .line 2705
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_1

    .line 2707
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2708
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->G:Z

    if-eqz v0, :cond_3

    .line 2709
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(I)Z

    goto :goto_0

    .line 2711
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/q;->a()I

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V
    .locals 7

    .prologue
    .line 56
    .line 7835
    iput-object p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->I:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 7836
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 7837
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 7838
    const v1, 0x7f030090

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 7839
    const v0, 0x7f0d0228

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 7840
    const v1, 0x7f0d0229

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 7841
    const v2, 0x7f0d022a

    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 7842
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/FragmentActivity;)Lcom/bumptech/glide/p;

    move-result-object v5

    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v6

    iget-object v6, v6, Lcom/roidapp/photogrid/video/onlinemusic/Track;->thumb_url:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v5

    sget-object v6, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v5, v6}, Lcom/bumptech/glide/d;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 7848
    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7849
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "By "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->artist_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7851
    const v0, 0x7f0d0232

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->C:Landroid/widget/ProgressBar;

    .line 7852
    const v0, 0x7f0d0231

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->D:Landroid/widget/TextView;

    .line 7853
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 7854
    const v0, 0x7f070049

    new-instance v1, Lcom/roidapp/photogrid/video/ao;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/video/ao;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 7867
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    .line 7868
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 7869
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/TrackSelector;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 56
    .line 4238
    iput-object p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->O:Ljava/lang/String;

    .line 4239
    new-instance v0, Landroid/content/Intent;

    const-string v1, "MusicPlayerService.PlayMusic"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4240
    const-string v1, "MusicPlayerService.Source"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4241
    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/TrackSelector;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 56
    .line 3614
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 3615
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 3616
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->I:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 3617
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 3618
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "file:///"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "audio/*"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 3619
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/lang/String;)V

    .line 3620
    const v1, 0xaa04

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->setResult(ILandroid/content/Intent;)V

    .line 3622
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->finish()V

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z
    .locals 0

    .prologue
    .line 56
    iput-boolean p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->M:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/TrackSelector;I)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/TrackSelector;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 8734
    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-direct {v4, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 8735
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 8736
    const v1, 0x7f03008f

    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 8737
    const v0, 0x7f0d0228

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 8738
    const v1, 0x7f0d0229

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 8739
    const v2, 0x7f0d022a

    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 8740
    const v3, 0x7f0d022d

    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 8741
    if-eqz v3, :cond_0

    .line 8742
    new-instance v6, Lcom/roidapp/photogrid/video/aj;

    invoke-direct {v6, p0}, Lcom/roidapp/photogrid/video/aj;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8752
    :cond_0
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/FragmentActivity;)Lcom/bumptech/glide/p;

    move-result-object v3

    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v6

    iget-object v6, v6, Lcom/roidapp/photogrid/video/onlinemusic/Track;->thumb_url:Ljava/lang/String;

    invoke-virtual {v3, v6}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v3

    sget-object v6, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v3, v6}, Lcom/bumptech/glide/d;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 8758
    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8759
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "By "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->artist_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8761
    const v0, 0x7f0d022e

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 8762
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<u>"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_url:Ljava/lang/String;

    const-string v3, "/"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "...</u>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8763
    new-instance v1, Lcom/roidapp/photogrid/video/ak;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/video/ak;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8771
    const v0, 0x7f0d022f

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 8772
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<u>"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->license_url:Ljava/lang/String;

    const-string v3, "licenses/"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "...</u>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8773
    new-instance v1, Lcom/roidapp/photogrid/video/al;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/video/al;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8781
    const v0, 0x7f0d0230

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 8782
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<u>"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->artist_url:Ljava/lang/String;

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "</u>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8783
    new-instance v1, Lcom/roidapp/photogrid/video/am;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/video/am;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8791
    invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 8801
    const v0, 0x7f0701c6

    new-instance v1, Lcom/roidapp/photogrid/video/an;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/video/an;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    invoke-virtual {v4, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 8828
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->z:Landroid/app/AlertDialog;

    .line 8829
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->z:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 56
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z
    .locals 0

    .prologue
    .line 56
    iput-boolean p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->H:Z

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/video/TrackSelector;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->f:I

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->C:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/video/TrackSelector;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->K:I

    return p1
.end method

.method static synthetic d(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->D:Landroid/widget/TextView;

    return-object v0
.end method

.method private d()V
    .locals 3

    .prologue
    const/16 v2, 0x2003

    .line 1082
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1083
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1084
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x1002

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1085
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x1003

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1086
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x2001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1087
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1088
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 1089
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 1090
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x2005

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1091
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x3001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1092
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x3002

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1093
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x4001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1094
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x4002

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1095
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x4004

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1096
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v1, 0x4003

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1100
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/roidapp/photogrid/video/TrackSelector;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/video/TrackSelector;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    return p1
.end method

.method static synthetic f(Lcom/roidapp/photogrid/video/TrackSelector;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->L:I

    return v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 1247
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->O:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1248
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->O:Ljava/lang/String;

    .line 1249
    new-instance v0, Landroid/content/Intent;

    const-string v1, "MusicPlayerService.StopMusic"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1250
    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 1253
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->g:Lcom/roidapp/photogrid/video/ad;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/g;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->h:Lcom/roidapp/photogrid/video/g;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->q:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->f()V

    return-void
.end method

.method static synthetic m(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->o:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/video/TrackSelector;)Z
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->M:Z

    return v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 56
    .line 5192
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030132

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 5193
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0300e9

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 5195
    const v0, 0x7f0d03b0

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 5196
    if-eqz v0, :cond_0

    .line 5197
    new-instance v3, Lcom/roidapp/photogrid/video/av;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/av;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5206
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701ca

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/video/ax;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/ax;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/video/aw;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/aw;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 5229
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->N:Landroid/app/AlertDialog;

    .line 56
    return-void
.end method

.method static synthetic p(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 2

    .prologue
    .line 6038
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6039
    const-string v1, "audio/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 6041
    const v1, 0xaa04

    :try_start_0
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6044
    :goto_0
    return-void

    .line 6043
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic q(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->y:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->r:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 2

    .prologue
    .line 56
    .line 6513
    const v0, 0x7f0d03b7

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/XListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    .line 6514
    new-instance v0, Lcom/roidapp/photogrid/video/ad;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/video/ad;-><init>(Landroid/app/Activity;Lcom/roidapp/photogrid/video/f;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->g:Lcom/roidapp/photogrid/video/ad;

    .line 6515
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->g:Lcom/roidapp/photogrid/video/ad;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6517
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    new-instance v1, Lcom/roidapp/photogrid/video/bf;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/bf;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 6545
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/video/XListView;->a(Lcom/roidapp/photogrid/video/ce;)V

    .line 56
    return-void
.end method

.method static synthetic t(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 7

    .prologue
    const/16 v6, 0x2005

    const/4 v5, 0x1

    const v4, 0x989682

    const/4 v1, 0x0

    .line 56
    .line 6873
    const v0, 0x7f0d002d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->b:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    .line 6874
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->b:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->setFocusableInTouchMode(Z)V

    .line 6875
    const v0, 0x7f0d002f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->c:Landroid/widget/LinearLayout;

    .line 6876
    const v0, 0x7f0d0031

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->d:Landroid/widget/ListView;

    .line 6878
    new-instance v0, Lcom/roidapp/photogrid/video/g;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-direct {v0, p0, v2}, Lcom/roidapp/photogrid/video/g;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/video/f;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->h:Lcom/roidapp/photogrid/video/g;

    .line 6880
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->d:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->h:Lcom/roidapp/photogrid/video/g;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6881
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    if-eqz v0, :cond_0

    move v0, v1

    .line 6882
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v2}, Lcom/roidapp/photogrid/video/f;->a()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 6883
    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v2, v0}, Lcom/roidapp/photogrid/video/f;->a(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v2, v0}, Lcom/roidapp/photogrid/video/f;->a(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v2

    iget v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_id:I

    iget v3, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    if-ne v2, v3, :cond_5

    .line 6884
    iput v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->f:I

    .line 6885
    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->m:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v3, v0}, Lcom/roidapp/photogrid/video/f;->a(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_title:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6890
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    const v2, 0x989680

    if-eq v0, v2, :cond_4

    .line 6891
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    if-eq v0, v4, :cond_1

    .line 6892
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    if-gtz v0, :cond_6

    .line 6893
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    iget v3, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-virtual {v2, v6, v3, v5}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 6900
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    if-gtz v0, :cond_3

    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    if-eq v0, v4, :cond_3

    .line 6901
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/video/XListView;->a(Z)V

    .line 6905
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    if-ne v0, v4, :cond_4

    .line 6906
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    if-lez v0, :cond_7

    .line 6907
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/XListView;->a()V

    .line 6914
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->h:Lcom/roidapp/photogrid/video/g;

    iget v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->f:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/g;->a(I)V

    .line 6915
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->d:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/video/aq;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/aq;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 56
    return-void

    .line 6882
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 6895
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    iget v3, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-virtual {v2, v6, v3, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1

    .line 6909
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->b(Z)V

    goto :goto_2
.end method

.method static synthetic u(Lcom/roidapp/photogrid/video/TrackSelector;)Z
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->G:Z

    return v0
.end method

.method static synthetic v(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 56
    .line 7572
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    if-gtz v0, :cond_1

    .line 7574
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7575
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 7577
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 7587
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    if-eqz v0, :cond_0

    .line 7588
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->b(Z)V

    .line 56
    :cond_0
    return-void

    .line 7582
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 7583
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->y:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 7584
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7585
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic x(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->I:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    return-object v0
.end method

.method static synthetic y(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->I:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    return-object v0
.end method

.method static synthetic z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1121
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1122
    const-string v0, "selector"

    const-string v1, " not data"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1123
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->b(Z)V

    .line 1130
    :goto_0
    return-void

    .line 1126
    :cond_0
    const-string v0, "selector"

    const-string v1, " has data"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1127
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->b(Z)V

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 1181
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    const v1, 0x989682

    if-ne v0, v1, :cond_0

    .line 2133
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2134
    new-instance v1, Lcom/roidapp/photogrid/video/ar;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/ar;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 2144
    new-instance v1, Lcom/roidapp/photogrid/video/as;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/as;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 2152
    const-string v1, "Clear History"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Do you want to clear history?"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    const v2, 0x7f070058

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/video/au;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/au;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    const v2, 0x7f070034

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/video/at;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/at;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1183
    iget v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a(I)V

    .line 1186
    :cond_0
    return-void
.end method

.method public finish()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1103
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->d()V

    .line 1104
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    if-eqz v0, :cond_0

    .line 1105
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1106
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->e:Lcom/roidapp/photogrid/video/XListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->a(Z)V

    .line 1108
    :cond_0
    iput-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->I:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 1110
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->f()V

    .line 1112
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_1

    .line 1113
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/q;->b()V

    .line 1114
    :cond_1
    iput-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    .line 1115
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->finish()V

    .line 1117
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 1050
    sparse-switch p1, :sswitch_data_0

    .line 1075
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1079
    :cond_0
    :goto_0
    return-void

    .line 1052
    :sswitch_0
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1053
    invoke-virtual {p0, p2, p3}, Lcom/roidapp/photogrid/video/TrackSelector;->setResult(ILandroid/content/Intent;)V

    .line 1055
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->finish()V

    goto :goto_0

    .line 1060
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 1061
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1062
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 1063
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(I)Z

    goto :goto_0

    .line 1066
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1067
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 1068
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(I)Z

    goto :goto_0

    .line 1071
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 1072
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(I)Z

    goto :goto_0

    .line 1050
    nop

    :sswitch_data_0
    .sparse-switch
        0x5001 -> :sswitch_1
        0x5002 -> :sswitch_2
        0x5003 -> :sswitch_3
        0xaa04 -> :sswitch_0
    .end sparse-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 996
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 1029
    :cond_0
    :goto_0
    return-void

    .line 998
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->d:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 1000
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->d:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_2

    .line 1004
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->c:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1005
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->b:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto :goto_0

    .line 1007
    :cond_1
    sget v0, Lcom/roidapp/photogrid/video/bg;->f:I

    iput v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->K:I

    .line 1009
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->b:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    goto :goto_0

    .line 1012
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->c:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1013
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->b:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto :goto_0

    .line 1015
    :cond_3
    sget v0, Lcom/roidapp/photogrid/video/bg;->f:I

    iput v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->K:I

    .line 1019
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->b:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    goto :goto_0

    .line 1026
    :sswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->finish()V

    goto :goto_0

    .line 996
    :sswitch_data_0
    .sparse-switch
        0x7f0d037a -> :sswitch_0
        0x7f0d03b1 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const v6, 0x7f0d03b1

    const/4 v5, 0x1

    const/4 v2, 0x0

    const/16 v1, 0x8

    .line 265
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 266
    iput-object p0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    .line 268
    const v0, 0x7f0300ea

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 274
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->v:Z

    if-nez v0, :cond_1

    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "last_gener_id"

    const v4, 0x989680

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->F:I

    .line 277
    :cond_0
    invoke-virtual {p0, v6}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->j:Landroid/view/View;

    .line 278
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->j:Landroid/view/View;

    new-instance v3, Lcom/roidapp/photogrid/video/ap;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/ap;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 287
    const v0, 0x7f0d037a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->k:Landroid/view/View;

    .line 288
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->k:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    const v0, 0x7f0d03b2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->i:Landroid/widget/TextView;

    .line 290
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->i:Landroid/widget/TextView;

    new-instance v3, Lcom/roidapp/photogrid/video/az;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/az;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 302
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    .line 303
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "progressbar:"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 304
    const v0, 0x7f0d03b8

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->o:Landroid/widget/LinearLayout;

    .line 305
    const v0, 0x7f0d03b9

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->p:Landroid/widget/Button;

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->p:Landroid/widget/Button;

    new-instance v3, Lcom/roidapp/photogrid/video/ba;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/ba;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 320
    const v0, 0x7f0d037b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->m:Landroid/widget/TextView;

    .line 321
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->m:Landroid/widget/TextView;

    const-string v3, "All Genres"

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    const v0, 0x7f0d03b3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->q:Landroid/widget/RelativeLayout;

    .line 323
    iget-object v3, p0, Lcom/roidapp/photogrid/video/TrackSelector;->q:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 324
    const v0, 0x7f0d03b4

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->r:Landroid/widget/LinearLayout;

    .line 325
    const v0, 0x7f0d03b6

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->y:Landroid/widget/ProgressBar;

    .line 326
    const v0, 0x7f0d03b5

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->s:Landroid/widget/ImageView;

    .line 327
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->s:Landroid/widget/ImageView;

    new-instance v3, Lcom/roidapp/photogrid/video/bb;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/bb;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 335
    invoke-virtual {p0, v6}, Lcom/roidapp/photogrid/video/TrackSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->n:Landroid/widget/TextView;

    .line 336
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 341
    new-instance v0, Lcom/roidapp/photogrid/video/q;

    new-instance v3, Lcom/roidapp/photogrid/video/bc;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/bc;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, p0, v3, v4}, Lcom/roidapp/photogrid/video/q;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/video/ac;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    .line 404
    new-instance v0, Lcom/roidapp/photogrid/video/bd;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/video/bd;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->E:Lcom/roidapp/photogrid/video/f;

    .line 450
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    new-instance v3, Lcom/roidapp/photogrid/video/be;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/be;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/ab;)V

    .line 479
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/q;->a()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 498
    :goto_2
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    const-class v2, Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->R:Landroid/content/Intent;

    .line 499
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->R:Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->P:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1, v2, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 501
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 502
    const-string v1, "MusicPlayerService.onError"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 503
    const-string v1, "MusicPlayerServic.onComplete"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 504
    const-string v1, "MusicPlayerService.onInfo"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 505
    const-string v1, "MusicPlayerService.onPrepared"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 507
    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->S:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 510
    :cond_1
    return-void

    .line 270
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 271
    iput-boolean v5, p0, Lcom/roidapp/photogrid/video/TrackSelector;->v:Z

    .line 272
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    :cond_2
    move v0, v2

    .line 323
    goto/16 :goto_1

    .line 481
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 484
    :pswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0702f5

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 485
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 488
    :pswitch_2
    iput-boolean v5, p0, Lcom/roidapp/photogrid/video/TrackSelector;->H:Z

    .line 489
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 490
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 491
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 494
    :pswitch_3
    iput-boolean v2, p0, Lcom/roidapp/photogrid/video/TrackSelector;->H:Z

    goto :goto_2

    .line 479
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1310
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->d()V

    .line 1311
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 1312
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->A:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1314
    :cond_0
    iput-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->I:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 1315
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->f()V

    .line 1317
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_1

    .line 1318
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/q;->b()V

    .line 1320
    :cond_1
    iput-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    .line 1322
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->S:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1323
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->B:Landroid/content/Context;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->P:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 1325
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 1328
    return-void
.end method

.method protected onPause()V
    .locals 3

    .prologue
    .line 551
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->d()V

    .line 552
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/TrackSelector;->d()V

    .line 553
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 554
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/TrackSelector;->J:Landroid/os/Handler;

    const/16 v2, 0x3002

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 556
    :cond_0
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 557
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 561
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->G:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->H:Z

    if-nez v0, :cond_0

    .line 562
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    iget-object v0, p0, Lcom/roidapp/photogrid/video/TrackSelector;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 566
    :cond_0
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 567
    return-void
.end method

.method public final x()V
    .locals 0

    .prologue
    .line 1034
    return-void
.end method
