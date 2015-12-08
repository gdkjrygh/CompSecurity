.class public final Lcom/roidapp/cloudlib/upload/x;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field a:Landroid/widget/ListView;

.field b:Landroid/widget/ProgressBar;

.field private c:Lcom/roidapp/cloudlib/upload/aa;

.field private d:Lcom/roidapp/cloudlib/upload/ab;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 48
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/cloudlib/upload/x;->j:I

    .line 214
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/upload/x;)Lcom/roidapp/cloudlib/upload/ab;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->d:Lcom/roidapp/cloudlib/upload/ab;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/upload/x;Lcom/roidapp/cloudlib/sns/b/a/h;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 36
    .line 1175
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1176
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1177
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1178
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 1179
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1180
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->c:Lcom/roidapp/cloudlib/upload/aa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1181
    :cond_0
    new-instance v0, Lcom/roidapp/cloudlib/upload/aa;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/upload/x;->getActivity()Landroid/support/v4/app/FragmentActivity;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/cloudlib/upload/aa;-><init>(Lcom/roidapp/cloudlib/upload/x;Ljava/util/List;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->c:Lcom/roidapp/cloudlib/upload/aa;

    .line 1182
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/x;->c:Lcom/roidapp/cloudlib/upload/aa;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1184
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->c:Lcom/roidapp/cloudlib/upload/aa;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/upload/aa;->a(Ljava/util/List;)V

    .line 1185
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->c:Lcom/roidapp/cloudlib/upload/aa;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/aa;->notifyDataSetChanged()V

    .line 36
    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/upload/x;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 36
    .line 1160
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1161
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1162
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->h:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->ac:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1163
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1164
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 36
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/upload/x;)V
    .locals 2

    .prologue
    .line 36
    .line 1189
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->b:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 36
    return-void
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/upload/x;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 36
    .line 2168
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2169
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2170
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2171
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 36
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 207
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/upload/x;->g:Z

    .line 208
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 211
    iput p1, p0, Lcom/roidapp/cloudlib/upload/x;->j:I

    .line 212
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/upload/ab;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/x;->d:Lcom/roidapp/cloudlib/upload/ab;

    .line 103
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 97
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/x;->e:Ljava/lang/String;

    .line 1106
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->b:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 1107
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1108
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    if-eqz v0, :cond_1

    .line 1109
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 1110
    :cond_1
    new-instance v0, Lcom/roidapp/cloudlib/upload/z;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/upload/z;-><init>(Lcom/roidapp/cloudlib/upload/x;)V

    invoke-static {v2, p1, v0}, Lcom/roidapp/cloudlib/sns/q;->a(ZLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 1155
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 1156
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/x;->f:Ljava/lang/String;

    .line 203
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 271
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 272
    sget v1, Lcom/roidapp/cloudlib/ar;->cd:I

    if-ne v0, v1, :cond_0

    .line 273
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/upload/x;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    .line 276
    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 57
    sget v0, Lcom/roidapp/cloudlib/as;->ao:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 58
    new-instance v0, Lcom/roidapp/cloudlib/upload/y;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/upload/y;-><init>(Lcom/roidapp/cloudlib/upload/x;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/upload/x;->g:Z

    if-eqz v0, :cond_1

    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 66
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 67
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1089
    :cond_0
    :goto_0
    sget v0, Lcom/roidapp/cloudlib/ar;->cc:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->a:Landroid/widget/ListView;

    .line 1090
    sget v0, Lcom/roidapp/cloudlib/ar;->bP:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->b:Landroid/widget/ProgressBar;

    .line 1091
    sget v0, Lcom/roidapp/cloudlib/ar;->bY:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->h:Landroid/widget/TextView;

    .line 1092
    sget v0, Lcom/roidapp/cloudlib/ar;->cd:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->i:Landroid/widget/TextView;

    .line 1093
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    return-object v1

    .line 69
    :cond_1
    iget v0, p0, Lcom/roidapp/cloudlib/upload/x;->j:I

    if-eq v0, v2, :cond_0

    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 71
    iget v2, p0, Lcom/roidapp/cloudlib/upload/x;->j:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 72
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 194
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->c:Lcom/roidapp/cloudlib/upload/aa;

    invoke-virtual {v0, p3}, Lcom/roidapp/cloudlib/upload/aa;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/x;

    .line 195
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/x;->d:Lcom/roidapp/cloudlib/upload/ab;

    if-eqz v1, :cond_0

    .line 196
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/x;->d:Lcom/roidapp/cloudlib/upload/ab;

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/x;->e:Ljava/lang/String;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Lcom/roidapp/cloudlib/upload/ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 1

    .prologue
    .line 81
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/upload/x;->a(Ljava/lang/String;)V

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/x;->f:Ljava/lang/String;

    .line 86
    :cond_0
    return-void
.end method
