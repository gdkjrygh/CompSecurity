.class public Lcom/arist/activity/LrcBrowseActivity;
.super Lcom/arist/activity/base/BaseActivity;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private b:Ljava/util/ArrayList;

.field private c:Lcom/arist/activity/j;

.field private d:Ljava/lang/String;

.field private e:Landroid/widget/TextView;

.field private g:Ljava/lang/String;

.field private h:I

.field private i:Ljava/lang/String;

.field private j:Ljava/util/Comparator;

.field private k:Ljava/io/FileFilter;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/arist/activity/base/BaseActivity;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->b:Ljava/util/ArrayList;

    new-instance v0, Lcom/arist/activity/h;

    invoke-direct {v0, p0}, Lcom/arist/activity/h;-><init>(Lcom/arist/activity/LrcBrowseActivity;)V

    iput-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->j:Ljava/util/Comparator;

    new-instance v0, Lcom/arist/activity/i;

    invoke-direct {v0, p0}, Lcom/arist/activity/i;-><init>(Lcom/arist/activity/LrcBrowseActivity;)V

    iput-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->k:Ljava/io/FileFilter;

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/LrcBrowseActivity;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/"

    iput-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->i:Ljava/lang/String;

    const-string v0, "/"

    invoke-direct {p0, v0}, Lcom/arist/activity/LrcBrowseActivity;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "/storage"

    iput-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->c:Lcom/arist/activity/j;

    invoke-virtual {v0}, Lcom/arist/activity/j;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lcom/arist/activity/LrcBrowseActivity;->d:Ljava/lang/String;

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->k:Ljava/io/FileFilter;

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_2
    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->j:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->c:Lcom/arist/activity/j;

    invoke-virtual {v0}, Lcom/arist/activity/j;->notifyDataSetChanged()V

    goto :goto_0
.end method


# virtual methods
.method public handleBackClicked(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/arist/activity/LrcBrowseActivity;->onBackPressed()V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    iget v0, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/arist/activity/base/BaseActivity;->onBackPressed()V

    :goto_0
    return-void

    :cond_0
    iget v0, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    invoke-direct {p0}, Lcom/arist/activity/LrcBrowseActivity;->a()V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/arist/activity/LrcBrowseActivity;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/arist/activity/LrcBrowseActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "music_path"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->g:Ljava/lang/String;

    const v0, 0x7f030003

    invoke-virtual {p0, v0}, Lcom/arist/activity/LrcBrowseActivity;->setContentView(I)V

    const v0, 0x7f060022

    invoke-virtual {p0, v0}, Lcom/arist/activity/LrcBrowseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f060023

    invoke-virtual {p0, v0}, Lcom/arist/activity/LrcBrowseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    new-instance v1, Lcom/arist/activity/j;

    invoke-direct {v1, p0}, Lcom/arist/activity/j;-><init>(Lcom/arist/activity/LrcBrowseActivity;)V

    iput-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->c:Lcom/arist/activity/j;

    iget-object v1, p0, Lcom/arist/activity/LrcBrowseActivity;->c:Lcom/arist/activity/j;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lcom/arist/activity/LrcBrowseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/c/c;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/arist/activity/LrcBrowseActivity;->a()V

    return-void

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/arist/activity/LrcBrowseActivity;->b:Ljava/util/ArrayList;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    iget-object v0, p0, Lcom/arist/activity/LrcBrowseActivity;->c:Lcom/arist/activity/j;

    invoke-virtual {v0, p3}, Lcom/arist/activity/j;->a(I)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/arist/activity/LrcBrowseActivity;->h:I

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/arist/activity/LrcBrowseActivity;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v2, Lcom/arist/c/a;->F:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/arist/activity/LrcBrowseActivity;->g:Ljava/lang/String;

    invoke-static {v2}, Lcom/arist/c/c;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".lrc"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/arist/c/c;->a(Ljava/io/File;Ljava/io/File;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/arist/activity/LrcBrowseActivity;->setResult(I)V

    invoke-virtual {p0}, Lcom/arist/activity/LrcBrowseActivity;->finish()V

    goto :goto_0
.end method
