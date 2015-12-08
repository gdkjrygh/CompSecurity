.class public final Lcom/roidapp/photogrid/release/ri;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"


# instance fields
.field protected a:Z

.field private b:Landroid/widget/ProgressBar;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/TextView;

.field private j:Z

.field private k:I

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ri;->a:Z

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ri;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 23
    .line 1105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->f:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->f:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1123
    :cond_0
    :goto_0
    return-void

    .line 1108
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ri;->j:Z

    if-nez v0, :cond_0

    .line 1111
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ri;->l:Z

    .line 1113
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ri;->j:Z

    .line 1114
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 1115
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ri;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1116
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ri;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00c0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1117
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->c:Landroid/widget/TextView;

    const v1, 0x7f070049

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1120
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->f:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->f:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v0, :cond_3

    .line 1122
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->f:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->g()V

    .line 1123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->f:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    goto :goto_0

    .line 1125
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ri;->dismiss()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ri;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 23
    .line 2099
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2100
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2101
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->i:Landroid/widget/TextView;

    const v1, 0x7f070049

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 23
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ri;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ri;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->h:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ri;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->i:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method final a(I)V
    .locals 0

    .prologue
    .line 130
    iput p1, p0, Lcom/roidapp/photogrid/release/ri;->k:I

    .line 131
    return-void
.end method

.method protected final a(II)V
    .locals 6

    .prologue
    const/16 v2, 0x8

    const/4 v5, 0x0

    .line 134
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ri;->l:Z

    if-eqz v0, :cond_1

    .line 180
    :cond_0
    :goto_0
    return-void

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->b:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_2

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 141
    :cond_2
    const/16 v0, 0x50

    if-lt p2, v0, :cond_3

    .line 142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->g:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/roidapp/photogrid/release/rl;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/rl;-><init>(Lcom/roidapp/photogrid/release/ri;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 158
    if-eqz p1, :cond_4

    const/4 v0, -0x1

    if-ne p1, v0, :cond_7

    .line 160
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_5

    .line 161
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 162
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ri;->c:Landroid/widget/TextView;

    if-nez p1, :cond_6

    const v0, 0x7f070319

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_6
    const v0, 0x7f070317

    goto :goto_1

    .line 165
    :cond_7
    if-lez p1, :cond_9

    iget v0, p0, Lcom/roidapp/photogrid/release/ri;->k:I

    if-gt p1, v0, :cond_9

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_8

    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 169
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->c:Landroid/widget/TextView;

    const v1, 0x7f070318

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 170
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "%d/%d"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    const/4 v4, 0x1

    iget v5, p0, Lcom/roidapp/photogrid/release/ri;->k:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 174
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_a

    .line 175
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 176
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->c:Landroid/widget/TextView;

    const v1, 0x7f07028a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 39
    const-string v0, "VideoSavingDialogFragment/onAttach"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    move-object v0, p1

    .line 40
    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ri;->f:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 41
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 42
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 46
    const-string v0, "VideoSavingDialogFragment/onCreateView"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 47
    const v0, 0x7f030136

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1058
    const v0, 0x7f0d04e6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ri;->b:Landroid/widget/ProgressBar;

    .line 1059
    const v0, 0x7f0d04e4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ri;->c:Landroid/widget/TextView;

    .line 1060
    const v0, 0x7f0d04e5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ri;->d:Landroid/widget/TextView;

    .line 1061
    const v0, 0x7f0d04e7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ri;->e:Landroid/widget/TextView;

    .line 1062
    const v0, 0x7f0d04ea

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ri;->i:Landroid/widget/TextView;

    .line 1063
    const v0, 0x7f0d04e9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ri;->g:Landroid/widget/LinearLayout;

    .line 1064
    const v0, 0x7f0d04e8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ri;->h:Landroid/widget/LinearLayout;

    .line 1065
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ri;->g:Landroid/widget/LinearLayout;

    new-instance v2, Lcom/roidapp/photogrid/release/rj;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/rj;-><init>(Lcom/roidapp/photogrid/release/ri;)V

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1071
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ri;->setCancelable(Z)V

    .line 49
    return-object v1
.end method

.method public final onResume()V
    .locals 2

    .prologue
    .line 76
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onResume()V

    .line 77
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ri;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/rk;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/rk;-><init>(Lcom/roidapp/photogrid/release/ri;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 91
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 55
    return-void
.end method
