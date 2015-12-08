.class public Lcom/roidapp/photogrid/cloud/PGShareActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private B:Landroid/os/Handler;

.field private C:[Ljava/lang/String;

.field private D:I

.field private E:I

.field private F:Landroid/widget/RelativeLayout;

.field private G:Landroid/widget/RelativeLayout;

.field private H:Lcom/roidapp/photogrid/cloud/ch;

.field private I:Lcom/roidapp/cloudlib/upload/x;

.field private J:Lcom/roidapp/photogrid/cloud/bb;

.field private K:I

.field private L:I

.field private M:Ljava/lang/String;

.field private N:Z

.field private O:Landroid/view/View;

.field private P:Landroid/os/Handler;

.field a:Lcom/roidapp/cloudlib/sns/upload/j;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/ImageView;

.field private e:I

.field private f:Landroid/widget/EditText;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/ProgressBar;

.field private j:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/ScrollView;

.field private l:Landroid/widget/CheckBox;

.field private m:Landroid/widget/CheckBox;

.field private n:Landroid/widget/RelativeLayout;

.field private o:Landroid/widget/TextView;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Z

.field private y:J

.field private z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 86
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 116
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->y:J

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->z:Ljava/util/ArrayList;

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->A:Ljava/util/ArrayList;

    .line 120
    new-instance v0, Lcom/roidapp/photogrid/cloud/bd;

    invoke-direct {v0, p0, v2}, Lcom/roidapp/photogrid/cloud/bd;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->B:Landroid/os/Handler;

    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->C:[Ljava/lang/String;

    .line 133
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->L:I

    .line 134
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->M:Ljava/lang/String;

    .line 139
    new-instance v0, Lcom/roidapp/photogrid/cloud/be;

    invoke-direct {v0, p0, v2}, Lcom/roidapp/photogrid/cloud/be;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->P:Landroid/os/Handler;

    .line 566
    new-instance v0, Lcom/roidapp/photogrid/cloud/az;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/az;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a:Lcom/roidapp/cloudlib/sns/upload/j;

    .line 1185
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/PGShareActivity;I)I
    .locals 0

    .prologue
    .line 86
    iput p1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->L:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->G:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/PGShareActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->M:Ljava/lang/String;

    return-object p1
.end method

.method private static a([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 721
    if-nez p0, :cond_1

    .line 722
    const/4 v0, 0x0

    .line 729
    :cond_0
    return-object v0

    .line 723
    :cond_1
    array-length v3, p0

    .line 724
    const-string v1, ""

    .line 725
    const/4 v0, 0x0

    move v4, v0

    move-object v0, v1

    move v1, v4

    :goto_0
    if-ge v1, v3, :cond_0

    .line 726
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v2, p0, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 727
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 725
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move-object v0, v2

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/PGShareActivity;JI)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 86
    .line 4616
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    .line 4617
    if-eqz v0, :cond_1

    .line 4618
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 4619
    invoke-virtual {v0, p3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    .line 4620
    const/16 v3, 0x64

    if-ne p3, v3, :cond_0

    .line 4621
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 4622
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->k:Landroid/widget/ScrollView;

    invoke-virtual {v0, v2, v2}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 4623
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->k:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->requestLayout()V

    :cond_0
    move v0, v1

    .line 4625
    :goto_0
    return v0

    :cond_1
    move v0, v2

    .line 86
    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/PGShareActivity;I)I
    .locals 0

    .prologue
    .line 86
    iput p1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->K:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/PGShareActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/PGShareActivity;)I
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->L:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/PGShareActivity;I)I
    .locals 0

    .prologue
    .line 86
    iput p1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->E:I

    return p1
.end method

.method private c(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 895
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 896
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 897
    const/4 v2, 0x1

    .line 900
    :cond_0
    return v2

    .line 895
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 972
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->M:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 973
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 974
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    .line 979
    :goto_0
    return-void

    .line 976
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 977
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->D:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/cloud/PGShareActivity;)I
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->D:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/cloud/PGShareActivity;)I
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->K:I

    return v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->M:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/cloud/PGShareActivity;)J
    .locals 2

    .prologue
    .line 86
    iget-wide v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->y:J

    return-wide v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->i:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ScrollView;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->k:Landroid/widget/ScrollView;

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->n:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->P:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Lcom/roidapp/photogrid/cloud/bb;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->J:Lcom/roidapp/photogrid/cloud/bb;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic t(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->B:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 503
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->N:Z

    .line 504
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->O:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 505
    return-void
.end method

.method public final a(I)V
    .locals 5

    .prologue
    const v4, 0x7f0d00d7

    const/4 v3, 0x0

    .line 790
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 791
    invoke-virtual {v1, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 792
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/roidapp/photogrid/cloud/ch;

    if-nez v2, :cond_2

    .line 793
    :cond_0
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 794
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->H:Lcom/roidapp/photogrid/cloud/ch;

    if-nez v1, :cond_1

    .line 795
    new-instance v1, Lcom/roidapp/photogrid/cloud/ch;

    invoke-direct {v1}, Lcom/roidapp/photogrid/cloud/ch;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->H:Lcom/roidapp/photogrid/cloud/ch;

    .line 797
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->H:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/cloud/ch;->a(I)V

    .line 798
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->H:Lcom/roidapp/photogrid/cloud/ch;

    new-instance v2, Lcom/roidapp/photogrid/cloud/aq;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/aq;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/ch;->a(Lcom/roidapp/photogrid/cloud/cm;)V

    .line 819
    const/high16 v1, 0x7f040000

    const v2, 0x7f040001

    invoke-virtual {v0, v1, v2, v3, v3}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    .line 820
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->H:Lcom/roidapp/photogrid/cloud/ch;

    const-string v2, "tag_fragment"

    invoke-virtual {v0, v4, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 821
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 825
    :goto_0
    return-void

    .line 823
    :cond_2
    check-cast v0, Lcom/roidapp/photogrid/cloud/ch;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->H:Lcom/roidapp/photogrid/cloud/ch;

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 904
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 905
    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 5

    .prologue
    const v4, 0x7f0d00d7

    const/4 v3, 0x0

    .line 847
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 848
    invoke-virtual {v1, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 849
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/roidapp/cloudlib/upload/x;

    if-nez v2, :cond_2

    .line 850
    :cond_0
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 851
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->I:Lcom/roidapp/cloudlib/upload/x;

    if-nez v1, :cond_1

    .line 852
    new-instance v1, Lcom/roidapp/cloudlib/upload/x;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/upload/x;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->I:Lcom/roidapp/cloudlib/upload/x;

    .line 854
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->I:Lcom/roidapp/cloudlib/upload/x;

    invoke-virtual {v1, p2}, Lcom/roidapp/cloudlib/upload/x;->a(I)V

    .line 855
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->I:Lcom/roidapp/cloudlib/upload/x;

    new-instance v2, Lcom/roidapp/photogrid/cloud/ar;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/ar;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/ab;)V

    .line 867
    const/high16 v1, 0x7f040000

    const v2, 0x7f040001

    invoke-virtual {v0, v1, v2, v3, v3}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->I:Lcom/roidapp/cloudlib/upload/x;

    const-string v3, "search_fragment"

    invoke-virtual {v1, v4, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 869
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 873
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->I:Lcom/roidapp/cloudlib/upload/x;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/upload/x;->a(Ljava/lang/String;)V

    .line 874
    return-void

    .line 871
    :cond_2
    check-cast v0, Lcom/roidapp/cloudlib/upload/x;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->I:Lcom/roidapp/cloudlib/upload/x;

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 982
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 983
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 984
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v2

    .line 985
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int v4, v2, v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-interface {v3, v4, v2, v1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 986
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int v0, v2, v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 987
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->J:Lcom/roidapp/photogrid/cloud/bb;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/bb;->a()V

    .line 988
    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 924
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->J:Lcom/roidapp/photogrid/cloud/bb;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/bb;->a()V

    .line 925
    if-eqz p2, :cond_6

    .line 927
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 928
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 929
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 930
    array-length v3, v0

    if-eq v3, v5, :cond_0

    array-length v3, v0

    if-nez v3, :cond_1

    .line 931
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 933
    :cond_1
    array-length v3, v0

    if-le v3, v5, :cond_4

    .line 934
    const-string v1, ""

    .line 935
    aget-object v3, v0, v2

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 936
    aget-object v1, v0, v2

    .line 937
    :cond_2
    aget-object v3, v0, v5

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 938
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v3, v0, v5

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 939
    :cond_3
    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    .line 948
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 949
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->length()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 963
    :goto_1
    return-void

    .line 940
    :cond_4
    array-length v3, v0

    if-ne v3, v5, :cond_5

    .line 941
    aget-object v3, v0, v2

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 942
    aget-object v1, v0, v2

    .line 943
    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_0

    .line 945
    :cond_5
    array-length v0, v0

    if-nez v0, :cond_7

    .line 946
    const-string v1, ""

    move v0, v2

    goto :goto_0

    .line 951
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 952
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 953
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 954
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 955
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 957
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 958
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 959
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 960
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->length()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_1

    :cond_7
    move v0, v2

    goto/16 :goto_0
.end method

.method public final a(Ljava/util/Collection;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/i;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v9, 0x8

    const/4 v8, 0x0

    .line 670
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 671
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 672
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 673
    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    .line 674
    iget-byte v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->f:B

    .line 675
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    .line 676
    iget-wide v6, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->y:J

    cmp-long v6, v4, v6

    if-nez v6, :cond_2

    .line 677
    const/4 v0, 0x2

    if-ne v3, v0, :cond_1

    .line 678
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 679
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 680
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->i:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 681
    iget v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->E:I

    sget v1, Lcom/roidapp/cloudlib/sns/upload/b;->d:I

    if-eq v0, v1, :cond_0

    .line 682
    sget v0, Lcom/roidapp/cloudlib/sns/upload/b;->d:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->E:I

    .line 683
    const v0, 0x7f0700c0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 686
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    move-result v0

    .line 687
    if-nez v0, :cond_0

    .line 688
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c:Landroid/widget/TextView;

    const v1, 0x7f0700fa

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 689
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 690
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 691
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->i:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 697
    :cond_2
    if-nez v1, :cond_3

    .line 3631
    new-instance v1, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;-><init>(Landroid/content/Context;)V

    .line 3632
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->setTag(Ljava/lang/Object;)V

    .line 3633
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 3634
    iget v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    .line 3635
    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Ljava/lang/String;)V

    .line 3636
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3637
    const/16 v4, 0x14

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 3638
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3639
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 3640
    new-instance v3, Lcom/roidapp/photogrid/cloud/ba;

    invoke-direct {v3, p0, v1, v0}, Lcom/roidapp/photogrid/cloud/ba;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;Lcom/roidapp/cloudlib/sns/upload/i;)V

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 700
    :cond_3
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 701
    iget v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    goto/16 :goto_0

    .line 706
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->k:Landroid/widget/ScrollView;

    invoke-virtual {v0, v8, v8}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 707
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 508
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->N:Z

    .line 509
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->O:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 510
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 1027
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->n:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1028
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1029
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->n:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/roidapp/photogrid/cloud/as;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/as;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/RelativeLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1035
    return-void
.end method

.method public final d()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 828
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->L:I

    .line 830
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 831
    const v2, 0x7f0d00d7

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v2

    .line 832
    if-eqz v2, :cond_1

    instance-of v3, v2, Lcom/roidapp/cloudlib/upload/x;

    if-eqz v3, :cond_1

    .line 833
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 837
    const/4 v0, 0x1

    .line 839
    :goto_0
    if-eqz v0, :cond_0

    .line 840
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 842
    :cond_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public final e()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 877
    .line 878
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 879
    const v3, 0x7f0d00d7

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v3

    .line 880
    if-eqz v3, :cond_1

    instance-of v4, v3, Lcom/roidapp/photogrid/cloud/ch;

    if-eqz v4, :cond_1

    .line 881
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    move v0, v1

    .line 887
    :goto_0
    if-eqz v0, :cond_0

    .line 888
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3966
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l:Landroid/widget/CheckBox;

    invoke-virtual {v2, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 3967
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l:Landroid/widget/CheckBox;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 3968
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d(Ljava/lang/String;)V

    .line 891
    return v0

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 908
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 909
    return-void
.end method

.method public final g()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 912
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 913
    const-string v1, "#\\w+"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 914
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 915
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 916
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 917
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v1

    .line 918
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 920
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->z:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 465
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 466
    packed-switch p1, :pswitch_data_0

    .line 500
    :goto_0
    return-void

    .line 468
    :pswitch_0
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 469
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b()V

    goto :goto_0

    .line 473
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/cloud/ay;

    invoke-direct {v0, p0, p3}, Lcom/roidapp/photogrid/cloud/ay;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;Landroid/content/Intent;)V

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/w;)Z

    goto :goto_0

    .line 466
    nop

    :pswitch_data_0
    .packed-switch 0x33d9
        :pswitch_0
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 11

    .prologue
    const/4 v6, 0x0

    const v10, 0x7f0700f9

    const-wide/16 v8, 0x1

    const/16 v7, 0x8

    const/4 v1, 0x0

    .line 391
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 392
    sparse-switch v0, :sswitch_data_0

    .line 2775
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 394
    :sswitch_1
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 395
    if-eqz v0, :cond_1

    .line 396
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 399
    :cond_1
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->setResult(I)V

    .line 400
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->finish()V

    goto :goto_0

    .line 403
    :sswitch_2
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2733
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 2734
    if-eqz v0, :cond_2

    .line 2735
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 2737
    :cond_2
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2738
    invoke-static {p0, v6}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    .line 2991
    :cond_3
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 2992
    const-string v0, "history_tag"

    const-string v2, ""

    invoke-interface {v4, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2993
    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 2994
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2995
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_4

    .line 2996
    aget-object v5, v2, v0

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2995
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 3004
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3005
    invoke-static {v0, v6}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    move v0, v1

    .line 3006
    :goto_2
    array-length v5, v2

    if-ge v0, v5, :cond_7

    .line 3007
    aget-object v5, v2, v0

    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 3009
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v5

    const/16 v6, 0x14

    if-ne v5, v6, :cond_5

    .line 3010
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 3012
    :cond_5
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "#"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v2, v0

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3006
    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 3015
    :cond_7
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 3016
    const-string v2, ""

    .line 3017
    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    :goto_3
    if-ltz v3, :cond_9

    .line 3018
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v5, v0, v3

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3019
    if-lez v3, :cond_8

    .line 3020
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, ","

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3017
    :cond_8
    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 3023
    :cond_9
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "history_tag"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2744
    const-string v0, "SNS"

    const-string v2, "share_click"

    const-string v3, "Save/Save/SendPG"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2745
    const-string v0, "SNS"

    const-string v2, "share_click"

    const-string v3, "Save/Save/SendPG"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p0, v0, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 2746
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2747
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2748
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->k:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1, v1}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 2750
    sget v0, Lcom/roidapp/cloudlib/sns/upload/b;->e:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->E:I

    .line 2751
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    .line 2752
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->d()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2753
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2754
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2755
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->i:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v7}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2756
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c:Landroid/widget/TextView;

    invoke-virtual {p0, v10}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2767
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2768
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->C:[Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 2769
    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2770
    :goto_5
    array-length v4, v2

    if-ge v1, v4, :cond_b

    .line 2771
    const-string v4, "SNS"

    const-string v5, "hashtags_upload"

    aget-object v6, v2, v1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v4, v5, v6}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2772
    const-string v4, "SNS"

    const-string v5, "hashtags_upload"

    aget-object v6, v2, v1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {p0, v4, v5, v6, v7}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 2770
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 2758
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2759
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2760
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->i:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2761
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->i:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 2762
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 2763
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c:Landroid/widget/TextView;

    const v2, 0x7f0700fa

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2764
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c:Landroid/widget/TextView;

    invoke-static {v0, v1, v1, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    goto :goto_4

    .line 2774
    :cond_b
    iget-wide v4, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->y:J

    const-wide/16 v6, -0x1

    cmp-long v1, v4, v6

    if-nez v1, :cond_c

    .line 2775
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p:Ljava/lang/String;

    invoke-static {p0, v1, v3, v0}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->y:J

    goto/16 :goto_0

    .line 2777
    :cond_c
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->y:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->a(J)Lcom/roidapp/cloudlib/sns/upload/i;

    move-result-object v0

    .line 2778
    if-eqz v0, :cond_0

    .line 2780
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->b(J)V

    .line 2781
    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/content/Context;Lcom/roidapp/cloudlib/sns/upload/i;)V

    goto/16 :goto_0

    .line 406
    :cond_d
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->N:Z

    if-nez v0, :cond_0

    .line 407
    new-instance v0, Lcom/roidapp/photogrid/cloud/ax;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/ax;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    const-string v1, "Save_Finish_Page"

    invoke-static {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/aj;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 417
    :sswitch_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->s:Z

    if-nez v0, :cond_e

    .line 419
    new-instance v0, Lcom/roidapp/photogrid/release/jj;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/jj;-><init>()V

    .line 420
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/jj;->a(Ljava/lang/String;)V

    .line 421
    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/jj;->setStyle(II)V

    .line 422
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "ImagePreviewDialogFragment"

    invoke-static {v1, v0, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    goto/16 :goto_0

    .line 426
    :cond_e
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 427
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "video/mp4"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 429
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 433
    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 449
    :sswitch_4
    iget v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->E:I

    sget v2, Lcom/roidapp/cloudlib/sns/upload/b;->c:I

    if-ne v0, v2, :cond_f

    .line 3513
    const v0, 0x8809

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->setResult(I)V

    .line 3514
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->finish()V

    .line 3515
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->s:Z

    .line 3516
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3517
    const-string v1, "jump_from_sharepage"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 3518
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 452
    :cond_f
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    move-result v0

    .line 453
    if-lez v0, :cond_10

    .line 454
    invoke-virtual {p0, v10}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 456
    :cond_10
    const-string v0, "Uploading now, please wait..."

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 392
    :sswitch_data_0
    .sparse-switch
        0x7f0d0028 -> :sswitch_1
        0x7f0d00a2 -> :sswitch_3
        0x7f0d00a8 -> :sswitch_2
        0x7f0d00ba -> :sswitch_0
        0x7f0d00c1 -> :sswitch_4
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/4 v4, 0x3

    const/4 v1, 0x2

    const/4 v9, 0x1

    const/16 v8, 0x8

    const/4 v5, 0x0

    .line 164
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 167
    const v0, 0x7f030028

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "image_path"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p:Ljava/lang/String;

    .line 176
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "mode_str"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q:Ljava/lang/String;

    .line 177
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "text_content"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->r:Ljava/lang/String;

    .line 178
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "is_video"

    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->s:Z

    .line 179
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->v:Z

    if-nez v0, :cond_6

    .line 1259
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v2, "event"

    const-string v3, "mother2015"

    invoke-virtual {v0, v2, v3, v5}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1260
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v2, " #mother"

    aput-object v2, v0, v5

    const-string v2, " #mothersday"

    aput-object v2, v0, v9

    const-string v2, " #mothernature"

    aput-object v2, v0, v1

    const-string v2, " #motherhood"

    aput-object v2, v0, v4

    const/4 v2, 0x4

    const-string v3, " #mom"

    aput-object v3, v0, v2

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->C:[Ljava/lang/String;

    .line 1263
    :cond_0
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b:Landroid/widget/TextView;

    .line 1264
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1266
    iget v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e:I

    if-nez v0, :cond_1

    .line 1267
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 1268
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090139

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x41800000    # 16.0f

    mul-float/2addr v0, v3

    sub-float v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e:I

    .line 1272
    :cond_1
    const v0, 0x7f0d00a1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d:Landroid/widget/ImageView;

    .line 1273
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    .line 1274
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1275
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 1276
    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1277
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 1278
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v6, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1279
    if-lez v6, :cond_2

    .line 1280
    iput v6, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e:I

    .line 1281
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->s:Z

    if-eqz v0, :cond_9

    .line 1283
    const v0, 0x7f0d00b7

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1284
    if-eqz v0, :cond_3

    .line 1285
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1286
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    :goto_1
    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1287
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1290
    :cond_3
    const v0, 0x7f0d00a2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1291
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1292
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 1293
    iget v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e:I

    const/16 v7, 0x64

    if-ge v6, v7, :cond_8

    :goto_2
    div-int v1, v3, v1

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1294
    const v1, 0x7f0200fa

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1295
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1308
    :cond_4
    :goto_3
    const v0, 0x7f0d00ba

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l:Landroid/widget/CheckBox;

    .line 1309
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l:Landroid/widget/CheckBox;

    const v1, 0x7f020401

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    .line 1310
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l:Landroid/widget/CheckBox;

    invoke-virtual {v0, v9}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1311
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l:Landroid/widget/CheckBox;

    new-instance v1, Lcom/roidapp/photogrid/cloud/av;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/av;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1323
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l:Landroid/widget/CheckBox;

    invoke-virtual {v0, v8}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 1325
    const v0, 0x7f0d00d6

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->O:Landroid/view/View;

    .line 1326
    const-string v0, "#253034"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->D:I

    .line 2185
    const v0, 0x7f0d00bd

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->G:Landroid/widget/RelativeLayout;

    .line 2186
    const v0, 0x7f0d00bf

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    .line 2187
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 2188
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->D:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    .line 2189
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m:Landroid/widget/CheckBox;

    new-instance v1, Lcom/roidapp/photogrid/cloud/ap;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/ap;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2205
    const v0, 0x7f0d00c0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2206
    new-instance v1, Lcom/roidapp/photogrid/cloud/at;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/at;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2232
    new-instance v0, Lcom/roidapp/photogrid/cloud/au;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/au;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/q;->d(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 2254
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 1329
    const v0, 0x7f0d00d7

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->F:Landroid/widget/RelativeLayout;

    .line 1330
    const v0, 0x7f0d00d2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->n:Landroid/widget/RelativeLayout;

    .line 1331
    const v0, 0x7f0d00d3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->o:Landroid/widget/TextView;

    .line 2363
    const v0, 0x7f0d00b8

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    .line 2364
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    new-instance v1, Lcom/roidapp/photogrid/cloud/aw;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/aw;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2374
    const-string v0, ""

    .line 2375
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->r:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->r:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 2376
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2377
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 2378
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 2379
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    new-array v1, v9, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/16 v3, 0x1000

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 2381
    new-instance v0, Lcom/roidapp/photogrid/cloud/bb;

    invoke-direct {v0, p0, v5}, Lcom/roidapp/photogrid/cloud/bb;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->J:Lcom/roidapp/photogrid/cloud/bb;

    .line 2382
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->J:Lcom/roidapp/photogrid/cloud/bb;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1334
    const v0, 0x7f0d00a8

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g:Landroid/widget/RelativeLayout;

    .line 1335
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1337
    const v0, 0x7f0d00c1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    .line 1338
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1339
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1341
    const v0, 0x7f0d00c2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->i:Landroid/widget/ProgressBar;

    .line 1343
    const v0, 0x7f0d00c3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c:Landroid/widget/TextView;

    .line 1345
    const v0, 0x7f0d00b5

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    .line 1346
    const v0, 0x7f0d00df

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->k:Landroid/widget/ScrollView;

    .line 1347
    const v0, 0x7f0d00c4

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1348
    const v0, 0x7f0d00c5

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1349
    const v0, 0x7f0d00c7

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1350
    const v0, 0x7f0d00c8

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1354
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Ljava/lang/String;)V

    .line 1355
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Ljava/util/Collection;)V

    .line 1356
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Lcom/roidapp/cloudlib/sns/upload/j;)V

    .line 1358
    new-instance v6, Ljava/lang/Thread;

    new-instance v0, Lcom/roidapp/photogrid/cloud/bc;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p:Ljava/lang/String;

    iget v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e:I

    iget-boolean v4, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->s:Z

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/cloud/bc;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;Ljava/lang/String;IZB)V

    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 182
    :cond_6
    return-void

    .line 170
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 171
    iput-boolean v9, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->v:Z

    .line 172
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    .line 1286
    :cond_7
    const-wide/16 v2, 0x0

    goto/16 :goto_1

    :cond_8
    move v1, v4

    .line 1293
    goto/16 :goto_2

    .line 1297
    :cond_9
    const v0, 0x7f0d00a2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1298
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1299
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 1300
    iget v3, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e:I

    const/16 v7, 0x64

    if-ge v6, v7, :cond_a

    :goto_4
    div-int v1, v3, v1

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1301
    const v1, 0x7f0200dc

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1302
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    :cond_a
    move v1, v4

    .line 1300
    goto :goto_4
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 523
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 524
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->b(Lcom/roidapp/cloudlib/sns/upload/j;)V

    .line 525
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    const/4 v0, 0x0

    .line 529
    const/4 v1, 0x4

    if-ne p1, v1, :cond_2

    .line 530
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 531
    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "back/closehashtags"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "back/closehashtags"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 538
    :cond_0
    :goto_0
    return v0

    .line 535
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d()Z

    move-result v1

    if-nez v1, :cond_0

    .line 538
    :cond_2
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public final p_()V
    .locals 2

    .prologue
    .line 786
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/PGShareActivity;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 787
    return-void
.end method

.method public final x()V
    .locals 0

    .prologue
    .line 387
    return-void
.end method
