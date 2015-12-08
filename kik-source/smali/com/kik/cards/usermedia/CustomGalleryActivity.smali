.class public Lcom/kik/cards/usermedia/CustomGalleryActivity;
.super Lkik/android/chat/activity/KikActivityBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/usermedia/CustomGalleryActivity$b;,
        Lcom/kik/cards/usermedia/CustomGalleryActivity$a;,
        Lcom/kik/cards/usermedia/CustomGalleryActivity$c;,
        Lcom/kik/cards/usermedia/CustomGalleryActivity$d;
    }
.end annotation


# instance fields
.field a:Lcom/kik/g/i;

.field private e:I

.field private f:Landroid/database/Cursor;

.field private g:Landroid/widget/GridView;

.field private h:Landroid/view/View;

.field private i:Landroid/widget/LinearLayout;

.field private j:Landroid/view/View;

.field private k:Lkik/android/widget/UserMediaImageThumbNailList;

.field private l:Landroid/widget/TextView;

.field private m:Lcom/kik/cards/usermedia/o;

.field private n:Lcom/kik/cache/d;

.field private o:Lcom/kik/cache/c;

.field private p:Lcom/kik/sdkutils/b/b;

.field private q:Ljava/util/HashMap;

.field private r:Lcom/kik/g/f;

.field private s:I

.field private t:Landroid/widget/Toast;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 46
    invoke-direct {p0}, Lkik/android/chat/activity/KikActivityBase;-><init>()V

    .line 97
    iput v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->e:I

    .line 98
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->f:Landroid/database/Cursor;

    .line 99
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    .line 100
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->h:Landroid/view/View;

    .line 101
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->i:Landroid/widget/LinearLayout;

    .line 102
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->j:Landroid/view/View;

    .line 103
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->k:Lkik/android/widget/UserMediaImageThumbNailList;

    .line 104
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->l:Landroid/widget/TextView;

    .line 105
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->m:Lcom/kik/cards/usermedia/o;

    .line 106
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->n:Lcom/kik/cache/d;

    .line 107
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->o:Lcom/kik/cache/c;

    .line 108
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->p:Lcom/kik/sdkutils/b/b;

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->q:Ljava/util/HashMap;

    .line 110
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->r:Lcom/kik/g/f;

    .line 111
    iput v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->s:I

    .line 112
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->t:Landroid/widget/Toast;

    .line 212
    new-instance v0, Lcom/kik/cards/usermedia/f;

    invoke-direct {v0, p0}, Lcom/kik/cards/usermedia/f;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;)V

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a:Lcom/kik/g/i;

    .line 345
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->q:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/cards/usermedia/CustomGalleryActivity;)I
    .locals 1

    .prologue
    .line 46
    iget v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->s:I

    return v0
.end method

.method static synthetic c(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/widget/GridView;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/cache/d;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->n:Lcom/kik/cache/d;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/sdkutils/b/b;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->p:Lcom/kik/sdkutils/b/b;

    return-object v0
.end method

.method static synthetic f(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lkik/android/widget/UserMediaImageThumbNailList;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->k:Lkik/android/widget/UserMediaImageThumbNailList;

    return-object v0
.end method

.method static synthetic g(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/database/Cursor;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->f:Landroid/database/Cursor;

    return-object v0
.end method

.method static synthetic h(Lcom/kik/cards/usermedia/CustomGalleryActivity;)I
    .locals 1

    .prologue
    .line 46
    iget v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->e:I

    return v0
.end method

.method static synthetic i(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/widget/Toast;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->t:Landroid/widget/Toast;

    return-object v0
.end method

.method static synthetic j(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Lcom/kik/cache/c;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->o:Lcom/kik/cache/c;

    return-object v0
.end method


# virtual methods
.method protected final a()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 505
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->l:Landroid/widget/TextView;

    aput-object v1, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 510
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 511
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->l:Landroid/widget/TextView;

    const v1, 0x7f090307

    invoke-virtual {p0, v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 522
    :goto_0
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 523
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->i:Landroid/widget/LinearLayout;

    aput-object v1, v0, v5

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->j:Landroid/view/View;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 525
    :cond_0
    return-void

    .line 514
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-ne v0, v4, :cond_2

    .line 515
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->l:Landroid/widget/TextView;

    const v1, 0x7f0902ee

    invoke-virtual {p0, v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->q:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 518
    :cond_2
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->l:Landroid/widget/TextView;

    const v1, 0x7f0902ef

    invoke-virtual {p0, v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->q:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method protected final a(I)V
    .locals 4

    .prologue
    .line 474
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget v0, v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->d:I

    .line 478
    const/4 v1, 0x2

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->i:Landroid/widget/LinearLayout;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->j:Landroid/view/View;

    aput-object v3, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 480
    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v1}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v2

    .line 482
    rem-int v1, v2, v0

    .line 484
    if-nez v1, :cond_1

    .line 488
    :goto_0
    sub-int v0, v2, v0

    .line 490
    if-lt p1, v0, :cond_0

    .line 492
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v0, p1}, Landroid/widget/GridView;->smoothScrollToPosition(I)V

    .line 493
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    new-instance v1, Lcom/kik/cards/usermedia/g;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/usermedia/g;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;I)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/GridView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 501
    :cond_0
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .prologue
    const/4 v2, 0x5

    const/4 v1, 0x3

    .line 238
    invoke-super {p0, p1}, Lkik/android/chat/activity/KikActivityBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 239
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;

    .line 242
    iget v3, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 244
    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v2, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 251
    :cond_0
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;->a(I)V

    .line 252
    invoke-virtual {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity$a;->notifyDataSetChanged()V

    .line 253
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->requestLayout()V

    .line 254
    return-void

    .line 246
    :cond_1
    iget v3, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    .line 248
    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setNumColumns(I)V

    move v1, v2

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 11

    .prologue
    const v10, 0x7f0e005f

    const/4 v7, 0x5

    const/4 v6, 0x3

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 134
    invoke-super {p0, p1}, Lkik/android/chat/activity/KikActivityBase;->onCreate(Landroid/os/Bundle;)V

    .line 135
    invoke-virtual {p0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "extra.maxselections"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->e:I

    const-string v1, "extra.minselections"

    invoke-virtual {v0, v1, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->s:I

    .line 136
    const v0, 0x7f03000c

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->setContentView(I)V

    .line 137
    new-instance v2, Lcom/kik/cards/usermedia/r;

    invoke-direct {v2}, Lcom/kik/cards/usermedia/r;-><init>()V

    .line 138
    new-instance v0, Lcom/kik/cards/usermedia/c;

    invoke-direct {v0}, Lcom/kik/cards/usermedia/c;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->p:Lcom/kik/sdkutils/b/b;

    .line 140
    new-instance v0, Lcom/kik/cards/usermedia/o;

    invoke-virtual {p0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Lcom/kik/cards/usermedia/o;-><init>(Lcom/kik/sdkutils/b/a;Landroid/content/ContentResolver;Landroid/content/res/Resources;)V

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->m:Lcom/kik/cards/usermedia/o;

    .line 141
    new-instance v0, Lcom/kik/cache/c;

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->m:Lcom/kik/cards/usermedia/o;

    iget-object v3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->p:Lcom/kik/sdkutils/b/b;

    const-string v4, "activity"

    invoke-virtual {p0, v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/ActivityManager;

    invoke-virtual {v4}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v4

    const/16 v5, 0x10

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/16 v5, 0x40

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    div-int/lit8 v4, v4, 0x10

    mul-int/lit8 v4, v4, 0x19

    int-to-long v4, v4

    invoke-direct/range {v0 .. v5}, Lcom/kik/cache/c;-><init>(Lcom/kik/cache/d;Lcom/kik/sdkutils/b/a;Lcom/kik/sdkutils/b/b;J)V

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->n:Lcom/kik/cache/d;

    .line 142
    new-instance v0, Lcom/kik/cache/c;

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->m:Lcom/kik/cards/usermedia/o;

    iget-object v3, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->p:Lcom/kik/sdkutils/b/b;

    iget v4, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->e:I

    int-to-long v4, v4

    invoke-direct/range {v0 .. v5}, Lcom/kik/cache/c;-><init>(Lcom/kik/cache/d;Lcom/kik/sdkutils/b/a;Lcom/kik/sdkutils/b/b;J)V

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->o:Lcom/kik/cache/c;

    .line 143
    const v0, 0x7f0e0060

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    .line 144
    const v0, 0x7f0e0136

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->h:Landroid/view/View;

    .line 145
    const v0, 0x7f0e005e

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->i:Landroid/widget/LinearLayout;

    .line 146
    const v0, 0x7f0e0061

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->j:Landroid/view/View;

    .line 148
    const v0, 0x7f0e0135

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/UserMediaImageThumbNailList;

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->k:Lkik/android/widget/UserMediaImageThumbNailList;

    .line 150
    const v0, 0x7f0e0078

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->l:Landroid/widget/TextView;

    .line 151
    new-array v2, v7, [Ljava/lang/String;

    const-string v0, "_id"

    aput-object v0, v2, v8

    const-string v0, "_size"

    aput-object v0, v2, v9

    const/4 v0, 0x2

    const-string v1, "_data"

    aput-object v1, v2, v0

    const-string v0, "date_added"

    aput-object v0, v2, v6

    const/4 v0, 0x4

    const-string v1, "orientation"

    aput-object v1, v2, v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v3, ""

    const/4 v4, 0x0

    const-string v5, "date_added DESC"

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->f:Landroid/database/Cursor;

    invoke-virtual {p0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v9, :cond_2

    move v0, v6

    :goto_0
    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v1, v0}, Landroid/widget/GridView;->setNumColumns(I)V

    new-instance v1, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->f:Landroid/database/Cursor;

    invoke-direct {v1, p0, p0, v2, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;Landroid/content/Context;Landroid/database/Cursor;I)V

    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 155
    iget v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->e:I

    if-ne v0, v9, :cond_3

    .line 156
    const v0, 0x7f09032a

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 162
    :goto_1
    invoke-static {p0, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->t:Landroid/widget/Toast;

    .line 164
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->g:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getCount()I

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    new-array v0, v9, [Landroid/view/View;

    invoke-virtual {p0, v10}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    aput-object v1, v0, v8

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 166
    :goto_2
    invoke-virtual {p0, v8}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->setResult(I)V

    .line 168
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->h:Landroid/view/View;

    new-instance v1, Lcom/kik/cards/usermedia/d;

    invoke-direct {v1, p0}, Lcom/kik/cards/usermedia/d;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->r:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->k:Lkik/android/widget/UserMediaImageThumbNailList;

    invoke-virtual {v1}, Lkik/android/widget/UserMediaImageThumbNailList;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 197
    invoke-virtual {p0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a()V

    .line 198
    const v0, 0x7f0e001d

    invoke-virtual {p0, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 199
    if-eqz v0, :cond_1

    .line 200
    new-instance v1, Lcom/kik/cards/usermedia/e;

    invoke-direct {v1, p0}, Lcom/kik/cards/usermedia/e;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    :cond_1
    return-void

    :cond_2
    move v0, v7

    .line 151
    goto :goto_0

    .line 159
    :cond_3
    const v0, 0x7f09032c

    new-array v1, v9, [Ljava/lang/Object;

    iget v2, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v8

    invoke-virtual {p0, v0, v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 164
    :cond_4
    new-array v0, v9, [Landroid/view/View;

    invoke-virtual {p0, v10}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    aput-object v1, v0, v8

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_2
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 226
    invoke-super {p0}, Lkik/android/chat/activity/KikActivityBase;->onDestroy()V

    .line 227
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->m:Lcom/kik/cards/usermedia/o;

    invoke-virtual {v0}, Lcom/kik/cards/usermedia/o;->d()V

    .line 228
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->r:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 229
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->n:Lcom/kik/cache/d;

    invoke-virtual {v0}, Lcom/kik/cache/d;->b()V

    .line 230
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->n:Lcom/kik/cache/d;

    .line 231
    iget-object v0, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->o:Lcom/kik/cache/c;

    invoke-virtual {v0}, Lcom/kik/cache/c;->b()V

    .line 232
    iput-object v1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity;->o:Lcom/kik/cache/c;

    .line 233
    return-void
.end method
