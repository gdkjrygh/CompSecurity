.class public Lcom/arist/activity/AddToListActivity;
.super Lcom/arist/activity/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field a:Lcom/arist/b/c;

.field private b:Ljava/util/List;

.field private c:[Z

.field private d:Lcom/arist/activity/c;

.field private e:Lcom/arist/model/b/c;

.field private g:Landroid/app/ProgressDialog;

.field private h:Landroid/os/Handler;

.field private i:Lcom/arist/model/skin/ColorTextView;

.field private j:Landroid/view/View;

.field private k:Ljava/lang/String;

.field private l:Ljava/util/List;

.field private m:Lcom/arist/model/b/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/arist/activity/base/BaseActivity;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/arist/activity/AddToListActivity;->h:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/AddToListActivity;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->b:Ljava/util/List;

    return-object v0
.end method

.method private a()V
    .locals 5

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    if-eqz v0, :cond_3

    move v0, v1

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    array-length v3, v3

    if-lt v0, v3, :cond_0

    :goto_1
    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->i:Lcom/arist/model/skin/ColorTextView;

    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/arist/activity/AddToListActivity;->k:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/arist/model/skin/ColorTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->j:Landroid/view/View;

    if-lez v2, :cond_2

    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object v3, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    aget-boolean v3, v3, v0

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/arist/activity/AddToListActivity;->l:Ljava/util/List;

    iget-object v4, p0, Lcom/arist/activity/AddToListActivity;->b:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/16 v1, 0x8

    goto :goto_2

    :cond_3
    move v2, v1

    goto :goto_1
.end method

.method static synthetic b(Lcom/arist/activity/AddToListActivity;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->l:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/arist/activity/AddToListActivity;)[Z
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    return-object v0
.end method

.method static synthetic d(Lcom/arist/activity/AddToListActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/arist/activity/AddToListActivity;->a()V

    return-void
.end method

.method static synthetic e(Lcom/arist/activity/AddToListActivity;)Lcom/arist/model/b/d;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->m:Lcom/arist/model/b/d;

    return-object v0
.end method

.method static synthetic f(Lcom/arist/activity/AddToListActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->h:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic g(Lcom/arist/activity/AddToListActivity;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->g:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/activity/AddToListActivity;->g:Landroid/app/ProgressDialog;

    :cond_0
    return-void
.end method


# virtual methods
.method public handleBackClicked(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/arist/activity/AddToListActivity;->onBackPressed()V

    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    invoke-static {v0, p2}, Ljava/util/Arrays;->fill([ZZ)V

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->d:Lcom/arist/activity/c;

    invoke-virtual {v0}, Lcom/arist/activity/c;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/arist/activity/AddToListActivity;->a()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    new-instance v0, Landroid/app/ProgressDialog;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/arist/activity/AddToListActivity;->g:Landroid/app/ProgressDialog;

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->g:Landroid/app/ProgressDialog;

    const v1, 0x7f0900f9

    invoke-virtual {p0, v1}, Lcom/arist/activity/AddToListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->g:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    new-instance v0, Lcom/arist/activity/a;

    invoke-direct {v0, p0}, Lcom/arist/activity/a;-><init>(Lcom/arist/activity/AddToListActivity;)V

    invoke-virtual {v0}, Lcom/arist/activity/a;->start()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f060091
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f09010f

    invoke-virtual {p0, v0}, Lcom/arist/activity/AddToListActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/AddToListActivity;->k:Ljava/lang/String;

    const v0, 0x7f030026

    invoke-virtual {p0, v0}, Lcom/arist/activity/AddToListActivity;->setContentView(I)V

    const v0, 0x7f06008f

    invoke-virtual {p0, v0}, Lcom/arist/activity/AddToListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    new-instance v1, Lcom/arist/model/b/c;

    invoke-virtual {p0}, Lcom/arist/activity/AddToListActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/arist/model/b/c;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/arist/activity/AddToListActivity;->e:Lcom/arist/model/b/c;

    new-instance v1, Lcom/arist/model/b/d;

    invoke-direct {v1}, Lcom/arist/model/b/d;-><init>()V

    iput-object v1, p0, Lcom/arist/activity/AddToListActivity;->m:Lcom/arist/model/b/d;

    iget-object v1, p0, Lcom/arist/activity/AddToListActivity;->e:Lcom/arist/model/b/c;

    invoke-virtual {v1}, Lcom/arist/model/b/c;->a()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/activity/AddToListActivity;->b:Ljava/util/List;

    invoke-virtual {p0}, Lcom/arist/activity/AddToListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "playlist_id"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0}, Lcom/arist/activity/AddToListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "playlist_name"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/arist/b/c;

    const-string v4, ""

    invoke-direct {v3, v1, v2, v4}, Lcom/arist/b/c;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/arist/activity/AddToListActivity;->a:Lcom/arist/b/c;

    iget-object v1, p0, Lcom/arist/activity/AddToListActivity;->m:Lcom/arist/model/b/d;

    iget-object v2, p0, Lcom/arist/activity/AddToListActivity;->a:Lcom/arist/b/c;

    invoke-virtual {v1, v2}, Lcom/arist/model/b/d;->a(Lcom/arist/b/c;)V

    iget-object v1, p0, Lcom/arist/activity/AddToListActivity;->a:Lcom/arist/b/c;

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/activity/AddToListActivity;->l:Ljava/util/List;

    new-instance v1, Lcom/arist/activity/c;

    invoke-direct {v1, p0}, Lcom/arist/activity/c;-><init>(Lcom/arist/activity/AddToListActivity;)V

    iput-object v1, p0, Lcom/arist/activity/AddToListActivity;->d:Lcom/arist/activity/c;

    iget-object v1, p0, Lcom/arist/activity/AddToListActivity;->d:Lcom/arist/activity/c;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const v0, 0x7f060090

    invoke-virtual {p0, v0}, Lcom/arist/activity/AddToListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/AddToListActivity;->j:Landroid/view/View;

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->j:Landroid/view/View;

    const v1, 0x7f060091

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorTextView;

    iput-object v0, p0, Lcom/arist/activity/AddToListActivity;->i:Lcom/arist/model/skin/ColorTextView;

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->i:Lcom/arist/model/skin/ColorTextView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorTextView;->a()V

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->i:Lcom/arist/model/skin/ColorTextView;

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/ColorTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f06008e

    invoke-virtual {p0, v0}, Lcom/arist/activity/AddToListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorCheckBox;

    iget-object v1, p0, Lcom/arist/activity/AddToListActivity;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lcom/arist/activity/AddToListActivity;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorCheckBox;->setEnabled(Z)V

    :cond_0
    invoke-virtual {v0, p0}, Lcom/arist/model/skin/ColorCheckBox;->a(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    if-eqz p1, :cond_1

    const-string v0, "mSelectFlags"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBooleanArray(Ljava/lang/String;)[Z

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    array-length v0, v0

    iget-object v1, p0, Lcom/arist/activity/AddToListActivity;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lcom/arist/activity/AddToListActivity;->a()V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    if-eqz v0, :cond_0

    const-string v0, "mSelectFlags"

    iget-object v1, p0, Lcom/arist/activity/AddToListActivity;->c:[Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBooleanArray(Ljava/lang/String;[Z)V

    :cond_0
    return-void
.end method
