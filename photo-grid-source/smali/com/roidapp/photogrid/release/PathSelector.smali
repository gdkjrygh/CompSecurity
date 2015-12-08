.class public Lcom/roidapp/photogrid/release/PathSelector;
.super Landroid/app/ListActivity;
.source "SourceFile"


# instance fields
.field a:Ljava/util/Comparator;

.field private b:Ljava/lang/String;

.field private c:Landroid/widget/TextView;

.field private d:Ljava/io/File;

.field private e:Z

.field private f:Lcom/roidapp/photogrid/release/lu;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/lu;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Landroid/app/ListActivity;-><init>()V

    .line 39
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->b:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->e:Z

    .line 225
    new-instance v0, Lcom/roidapp/photogrid/release/lx;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/lx;-><init>(Lcom/roidapp/photogrid/release/PathSelector;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->a:Ljava/util/Comparator;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/PathSelector;)Ljava/io/File;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->d:Ljava/io/File;

    return-object v0
.end method

.method private a()Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 1278
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 1279
    const-string v2, "mounted"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1280
    const/4 v0, 0x1

    .line 263
    :goto_0
    if-nez v0, :cond_1

    .line 264
    const-string v0, "no sdcard"

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 265
    const-string v0, ""

    .line 273
    :goto_1
    return-object v0

    :cond_0
    move v0, v1

    .line 1282
    goto :goto_0

    .line 269
    :cond_1
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 273
    :catch_0
    move-exception v0

    const-string v0, ""

    goto :goto_1
.end method

.method private a(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 170
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 172
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->g:Ljava/util/List;

    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->g:Ljava/util/List;

    if-nez v0, :cond_1

    .line 221
    :cond_0
    :goto_0
    return-void

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 191
    if-eqz v3, :cond_3

    move v0, v1

    .line 192
    :goto_1
    array-length v4, v3

    if-ge v0, v4, :cond_3

    .line 193
    aget-object v4, v3, v0

    .line 196
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 197
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 198
    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 199
    new-instance v5, Lcom/roidapp/photogrid/release/lu;

    invoke-direct {v5}, Lcom/roidapp/photogrid/release/lu;-><init>()V

    iput-object v5, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    .line 200
    iget-object v5, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/roidapp/photogrid/release/lu;->a:Ljava/lang/String;

    .line 201
    iget-object v5, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v5, Lcom/roidapp/photogrid/release/lu;->b:Ljava/lang/String;

    .line 202
    iget-object v4, p0, Lcom/roidapp/photogrid/release/PathSelector;->g:Ljava/util/List;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 209
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->g:Ljava/util/List;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PathSelector;->a:Ljava/util/Comparator;

    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 211
    new-instance v0, Lcom/roidapp/photogrid/release/lu;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/lu;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    const-string v3, "backupParent"

    iput-object v3, v0, Lcom/roidapp/photogrid/release/lu;->a:Ljava/lang/String;

    .line 213
    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    const-string v2, "/"

    iput-object v2, v0, Lcom/roidapp/photogrid/release/lu;->b:Ljava/lang/String;

    .line 218
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->g:Ljava/util/List;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 220
    new-instance v0, Lcom/roidapp/photogrid/release/ls;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PathSelector;->g:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/release/ls;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PathSelector;->setListAdapter(Landroid/widget/ListAdapter;)V

    goto/16 :goto_0

    .line 216
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->f:Lcom/roidapp/photogrid/release/lu;

    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roidapp/photogrid/release/lu;->b:Ljava/lang/String;

    goto :goto_2
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/PathSelector;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->h:Z

    return v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 49
    invoke-super {p0, p1}, Landroid/app/ListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    const v0, 0x7f03009e

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PathSelector;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->e:Z

    if-nez v0, :cond_2

    .line 58
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PathSelector;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isFromDialogFragment"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->h:Z

    .line 60
    const v0, 0x7f0d0277

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PathSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->c:Landroid/widget/TextView;

    .line 61
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PathSelector;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->b:Ljava/lang/String;

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PathSelector;->a(Ljava/lang/String;)V

    .line 63
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PathSelector;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->d:Ljava/io/File;

    .line 66
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PathSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PathSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    const/16 v1, 0x500

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PathSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    const/16 v1, 0x4a0

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PathSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/16 v1, 0x320

    if-ne v0, v1, :cond_1

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->c:Landroid/widget/TextView;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 73
    :cond_1
    const v0, 0x7f0d0275

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PathSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 74
    new-instance v1, Lcom/roidapp/photogrid/release/lv;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/lv;-><init>(Lcom/roidapp/photogrid/release/PathSelector;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    const v0, 0x7f0d0276

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PathSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 84
    new-instance v1, Lcom/roidapp/photogrid/release/lw;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/lw;-><init>(Lcom/roidapp/photogrid/release/PathSelector;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    :cond_2
    return-void

    .line 53
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->e:Z

    .line 55
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 160
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 161
    const v0, 0xcc03

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PathSelector;->setResult(ILandroid/content/Intent;)V

    .line 162
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PathSelector;->finish()V

    .line 163
    const/4 v0, 0x1

    .line 166
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/ListActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 235
    invoke-super/range {p0 .. p5}, Landroid/app/ListActivity;->onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V

    .line 236
    new-instance v1, Ljava/io/File;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->g:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lu;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/lu;->b:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/PathSelector;->d:Ljava/io/File;

    .line 237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PathSelector;->g:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lu;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/lu;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PathSelector;->a(Ljava/lang/String;)V

    .line 240
    :cond_0
    return-void
.end method
