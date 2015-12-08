.class public Lkik/android/widget/GalleryWidget;
.super Lkik/android/chat/fragment/KikFragmentBase;
.source "SourceFile"

# interfaces
.implements Lcom/kik/h/b;
.implements Lkik/android/e/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/GalleryWidget$1;,
        Lkik/android/widget/GalleryWidget$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/HashSet;

.field public static b:Ljava/lang/String;

.field private static g:Ljava/lang/String;


# instance fields
.field protected _dimBackground:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0113
    .end annotation
.end field

.field protected _folderDropdown:Lkik/android/util/KikSpinner;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0111
    .end annotation
.end field

.field protected _grid:Landroid/widget/GridView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0112
    .end annotation
.end field

.field protected _noPhotosText:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0110
    .end annotation
.end field

.field protected _topDivider:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e010f
    .end annotation
.end field

.field protected c:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContentImageLoader"
    .end annotation
.end field

.field private h:Landroid/database/Cursor;

.field private i:I

.field private j:Lkik/android/widget/z;

.field private k:Lkik/a/e/g;

.field private l:Lkik/android/widget/aa;

.field private m:Z

.field private n:Z

.field private o:Landroid/app/Activity;

.field private p:I

.field private q:Z

.field private r:Lkik/android/widget/GalleryWidget$a;

.field private s:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private t:Landroid/widget/AdapterView$OnItemLongClickListener;

.field private x:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 86
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, ".mp4"

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lkik/android/widget/GalleryWidget;->a:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 66
    invoke-direct {p0}, Lkik/android/chat/fragment/KikFragmentBase;-><init>()V

    .line 101
    iput-boolean v1, p0, Lkik/android/widget/GalleryWidget;->m:Z

    .line 102
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/GalleryWidget;->n:Z

    .line 105
    iput-boolean v1, p0, Lkik/android/widget/GalleryWidget;->q:Z

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->r:Lkik/android/widget/GalleryWidget$a;

    .line 246
    new-instance v0, Lkik/android/widget/ae;

    invoke-direct {v0, p0}, Lkik/android/widget/ae;-><init>(Lkik/android/widget/GalleryWidget;)V

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->s:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 272
    new-instance v0, Lkik/android/widget/af;

    invoke-direct {v0, p0}, Lkik/android/widget/af;-><init>(Lkik/android/widget/GalleryWidget;)V

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->t:Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 354
    new-instance v0, Lkik/android/widget/ak;

    invoke-direct {v0, p0}, Lkik/android/widget/ak;-><init>(Lkik/android/widget/GalleryWidget;)V

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->x:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic a(Lkik/android/widget/GalleryWidget;Lkik/android/widget/GalleryWidget$a;)Lkik/android/widget/GalleryWidget$a;
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lkik/android/widget/GalleryWidget;->r:Lkik/android/widget/GalleryWidget$a;

    return-object p1
.end method

.method static synthetic a(Lkik/android/widget/GalleryWidget;)Lkik/android/widget/aa;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->l:Lkik/android/widget/aa;

    return-object v0
.end method

.method static synthetic a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1}, Lkik/android/widget/GalleryWidget;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;J)V
    .locals 8

    .prologue
    .line 66
    const/16 v0, 0x12

    :try_start_0
    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {p1}, Lkik/android/util/ak;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lkik/android/widget/ap;

    invoke-direct {v0, p0}, Lkik/android/widget/ap;-><init>(Lkik/android/widget/GalleryWidget;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/GalleryWidget;->b(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    iget-object v7, p0, Lkik/android/widget/GalleryWidget;->e:Lcom/kik/l/ab;

    move-object v3, p1

    move-wide v4, p2

    invoke-virtual/range {v1 .. v7}, Lkik/android/f/a/f;->a(Landroid/content/Context;Ljava/lang/String;JZLcom/kik/l/ab;)Lkik/a/d/a/a;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->k:Lkik/a/e/g;

    invoke-interface {v1, v0}, Lkik/a/e/g;->a(Lkik/a/d/a/a;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, ""

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    const v2, 0x7f09035b

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/widget/GalleryWidget;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;JIZ)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 66
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->c:Lcom/kik/android/a;

    const-string v3, "Video Trimmer Opened"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Index"

    int-to-long v4, p4

    invoke-virtual {v0, v3, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Recent"

    invoke-static {}, Lkik/android/widget/aa;->b()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Maximized"

    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-virtual {v0}, Lkik/android/util/KikSpinner;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    iget-object v4, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    :goto_1
    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Forced"

    invoke-virtual {v0, v1, p5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Video Length"

    invoke-virtual {v0, v1, p2, p3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is From Intent"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-static {v0, p1}, Lkik/android/util/by;->b(Lcom/kik/android/a$f;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;JZI)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 66
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->c:Lcom/kik/android/a;

    const-string v3, "Video Selected"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Index"

    int-to-long v4, p5

    invoke-virtual {v0, v3, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Album Name"

    invoke-static {}, Lkik/android/widget/aa;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Recent"

    invoke-static {}, Lkik/android/widget/aa;->b()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "From Trimmer"

    invoke-virtual {v0, v3, p4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Maximized"

    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-virtual {v0}, Lkik/android/util/KikSpinner;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    iget-object v4, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    :goto_1
    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Video Length"

    invoke-static {p1}, Lkik/android/util/ct;->c(Ljava/lang/String;)I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v0, v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Video Orginal Length"

    invoke-virtual {v0, v1, p2, p3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is From Intent"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-static {v0, p1}, Lkik/android/util/by;->b(Lcom/kik/android/a$f;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/widget/GalleryWidget;ZILjava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 66
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->c:Lcom/kik/android/a;

    const-string v3, "Photo Selected"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Index"

    int-to-long v4, p2

    invoke-virtual {v0, v3, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Album Name"

    invoke-virtual {v0, v3, p3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Recent"

    sget-object v4, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "From Preview"

    invoke-virtual {v0, v3, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Maximized"

    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-virtual {v0}, Lkik/android/util/KikSpinner;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    iget-object v4, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    :goto_1
    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 438
    invoke-direct {p0, p1}, Lkik/android/widget/GalleryWidget;->c(Ljava/lang/String;)V

    .line 439
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    if-eqz v0, :cond_1

    .line 440
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 443
    sget-object p1, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    .line 444
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->l:Lkik/android/widget/aa;

    invoke-virtual {v0}, Lkik/android/widget/aa;->a()V

    .line 446
    :cond_0
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->l:Lkik/android/widget/aa;

    invoke-virtual {v0, p1}, Lkik/android/widget/aa;->a(Ljava/lang/String;)V

    .line 447
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->j:Lkik/android/widget/z;

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-virtual {v0, v1}, Lkik/android/widget/z;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    .line 448
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->j:Lkik/android/widget/z;

    invoke-virtual {v0}, Lkik/android/widget/z;->notifyDataSetChanged()V

    .line 450
    :cond_1
    return-void
.end method

.method static synthetic b(Lkik/android/widget/GalleryWidget;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 66
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    iget-object v3, p0, Lkik/android/widget/GalleryWidget;->d:Lkik/a/e/v;

    invoke-virtual {v1, v2, v0, v3}, Lkik/android/f/a/f;->a(Landroid/app/Activity;Ljava/io/File;Lkik/a/e/v;)Lkik/a/d/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->k:Lkik/a/e/g;

    invoke-interface {v1, v0}, Lkik/a/e/g;->a(Lkik/a/d/a/a;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, ""

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    const v2, 0x7f090134

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/widget/GalleryWidget;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/widget/GalleryWidget;)Z
    .locals 1

    .prologue
    .line 66
    iget-boolean v0, p0, Lkik/android/widget/GalleryWidget;->n:Z

    return v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 573
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 574
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 576
    :cond_0
    invoke-virtual {p0, p1}, Lkik/android/widget/GalleryWidget;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    .line 577
    return-void
.end method

.method static synthetic c(Lkik/android/widget/GalleryWidget;)Z
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/GalleryWidget;->n:Z

    return v0
.end method

.method static synthetic d(Lkik/android/widget/GalleryWidget;)Landroid/database/Cursor;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    sget-object v0, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lkik/android/widget/GalleryWidget;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    return-object v0
.end method

.method private e()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 184
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->c:Lcom/kik/android/a;

    const-string v3, "Gallery Tray Opened"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Album List Size"

    iget-object v4, p0, Lkik/android/widget/GalleryWidget;->l:Lkik/android/widget/aa;

    invoke-virtual {v4}, Lkik/android/widget/aa;->getCount()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v0, v3, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Total Photos Count"

    iget v4, p0, Lkik/android/widget/GalleryWidget;->p:I

    int-to-long v4, v4

    invoke-virtual {v0, v3, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Landscape"

    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-ne v0, v5, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Maximized"

    iget-object v4, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-virtual {v4}, Lkik/android/util/KikSpinner;->getVisibility()I

    move-result v4

    if-nez v4, :cond_0

    move v2, v1

    :cond_0
    invoke-virtual {v0, v3, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Has Permission"

    invoke-virtual {v0, v2, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 191
    return-void

    :cond_1
    move v0, v2

    .line 184
    goto :goto_0
.end method

.method private f()V
    .locals 3

    .prologue
    .line 454
    const/4 v0, 0x1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p0}, Lkik/android/widget/GalleryWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    .line 455
    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    invoke-direct {p0}, Lkik/android/widget/GalleryWidget;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setColumnWidth(I)V

    .line 456
    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    invoke-virtual {v1, v0}, Landroid/widget/GridView;->setHorizontalSpacing(I)V

    .line 457
    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    invoke-virtual {v1, v0}, Landroid/widget/GridView;->setVerticalSpacing(I)V

    .line 458
    return-void
.end method

.method private g()I
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    .line 592
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 593
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    .line 594
    add-float v2, v1, v6

    float-to-double v2, v2

    .line 595
    add-float/2addr v1, v6

    const/high16 v4, 0x42ae0000    # 87.0f

    div-float/2addr v1, v4

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    .line 596
    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v1, v2

    sub-float/2addr v1, v6

    .line 597
    const/4 v2, 0x1

    invoke-static {v2, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 13

    .prologue
    const/4 v5, 0x3

    const/4 v7, 0x0

    const/4 v12, 0x2

    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 521
    .line 523
    if-nez p1, :cond_0

    .line 524
    sget-object p1, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    .line 526
    :cond_0
    sget-object v0, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lkik/android/widget/GalleryWidget;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 527
    const-string v0, "bucket_display_name = ?"

    .line 528
    new-array v4, v11, [Ljava/lang/String;

    aput-object p1, v4, v10

    move-object v8, v0

    .line 532
    :goto_0
    if-eqz v8, :cond_2

    .line 533
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and duration <> 0 and _data LIKE \'%.mp4\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 540
    :goto_1
    const/4 v0, 0x5

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "_id"

    aput-object v0, v2, v10

    const-string v0, "_data"

    aput-object v0, v2, v11

    const-string v0, "bucket_display_name"

    aput-object v0, v2, v12

    const-string v0, "date_added"

    aput-object v0, v2, v5

    const/4 v0, 0x4

    const-string v1, "duration"

    aput-object v1, v2, v0

    .line 541
    const/4 v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "_id"

    aput-object v0, v9, v10

    const-string v0, "_data"

    aput-object v0, v9, v11

    const-string v0, "bucket_display_name"

    aput-object v0, v9, v12

    const-string v0, "date_added"

    aput-object v0, v9, v5

    .line 543
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v5, "_id DESC"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 549
    sget-object v0, Lkik/android/widget/GalleryWidget;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v0, v6

    .line 565
    :goto_2
    if-eqz v0, :cond_1

    .line 566
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 568
    :cond_1
    return-object v0

    .line 536
    :cond_2
    const-string v3, "duration <> 0 and _data LIKE \'%.mp4\'"

    goto :goto_1

    .line 553
    :cond_3
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v5, "_id DESC"

    move-object v2, v9

    move-object v3, v8

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 559
    if-nez v6, :cond_4

    if-eqz v0, :cond_5

    .line 560
    :cond_4
    new-array v1, v12, [Landroid/database/Cursor;

    aput-object v6, v1, v10

    aput-object v0, v1, v11

    .line 561
    new-instance v0, Lkik/android/ah;

    const-string v2, "date_added"

    invoke-direct {v0, v1, v2}, Lkik/android/ah;-><init>([Landroid/database/Cursor;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object v0, v7

    goto :goto_2

    :cond_6
    move-object v4, v7

    move-object v8, v7

    goto/16 :goto_0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 683
    iget-boolean v0, p0, Lkik/android/widget/GalleryWidget;->q:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/GalleryWidget;->q:Z

    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_dimBackground:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 684
    :cond_0
    return-void
.end method

.method public final a(JLjava/lang/String;Lkik/android/widget/KikNetworkedImageView;IZ)V
    .locals 9

    .prologue
    const/4 v7, 0x1

    .line 694
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 702
    :goto_0
    return-void

    .line 699
    :cond_0
    iget-object v4, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    new-instance v6, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v0, 0x2

    iput v0, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v0, v6, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    invoke-direct {p0}, Lkik/android/widget/GalleryWidget;->g()I

    move-result v0

    iput v0, v6, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iput v0, v6, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    move-wide v0, p1

    move-object v2, p3

    move v3, p6

    move v5, p5

    invoke-static/range {v0 .. v6}, Lcom/kik/cache/u;->a(JLjava/lang/String;ZLandroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Lcom/kik/cache/u;

    move-result-object v1

    .line 701
    iget-object v2, p0, Lkik/android/widget/GalleryWidget;->f:Lcom/kik/cache/ad;

    move-object v0, p4

    move v3, p5

    move v4, p5

    move v5, v7

    move v6, v7

    invoke-virtual/range {v0 .. v6}, Lkik/android/widget/KikNetworkedImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V

    goto :goto_0
.end method

.method protected final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 603
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 604
    return-void
.end method

.method public final a(Lkik/a/e/g;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 638
    iput-object p1, p0, Lkik/android/widget/GalleryWidget;->k:Lkik/a/e/g;

    .line 639
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    if-nez v0, :cond_1

    .line 678
    :cond_0
    :goto_0
    return-void

    .line 643
    :cond_1
    invoke-direct {p0}, Lkik/android/widget/GalleryWidget;->e()V

    .line 644
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->l:Lkik/android/widget/aa;

    invoke-virtual {v0}, Lkik/android/widget/aa;->a()V

    .line 646
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/widget/GalleryWidget;->c(Ljava/lang/String;)V

    .line 647
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 648
    iget v0, p0, Lkik/android/widget/GalleryWidget;->p:I

    .line 649
    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v1

    .line 650
    iput v1, p0, Lkik/android/widget/GalleryWidget;->p:I

    .line 651
    invoke-static {}, Lkik/android/widget/aa;->b()Ljava/lang/String;

    move-result-object v2

    .line 653
    invoke-direct {p0, v2}, Lkik/android/widget/GalleryWidget;->b(Ljava/lang/String;)V

    .line 654
    if-ge v0, v1, :cond_2

    .line 656
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    new-instance v1, Lkik/android/widget/aq;

    invoke-direct {v1, p0}, Lkik/android/widget/aq;-><init>(Lkik/android/widget/GalleryWidget;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->post(Ljava/lang/Runnable;)Z

    .line 664
    :cond_2
    iget-boolean v0, p0, Lkik/android/widget/GalleryWidget;->m:Z

    if-eqz v0, :cond_3

    .line 665
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 666
    iput-boolean v3, p0, Lkik/android/widget/GalleryWidget;->m:Z

    .line 667
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_noPhotosText:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 668
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_topDivider:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 671
    :cond_3
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 672
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/GalleryWidget;->m:Z

    .line 673
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_noPhotosText:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 674
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-virtual {v0, v4}, Lkik/android/util/KikSpinner;->setVisibility(I)V

    .line 675
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_topDivider:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public final a(Lkik/android/chat/fragment/KikChatFragment$e;)V
    .locals 4

    .prologue
    const/16 v3, 0x30

    const/4 v2, 0x0

    .line 609
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    if-nez v0, :cond_1

    .line 633
    :cond_0
    :goto_0
    return-void

    .line 613
    :cond_1
    sget-object v0, Lkik/android/widget/GalleryWidget$1;->a:[I

    invoke-virtual {p1}, Lkik/android/chat/fragment/KikChatFragment$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 615
    :pswitch_0
    iget-boolean v0, p0, Lkik/android/widget/GalleryWidget;->m:Z

    if-nez v0, :cond_0

    .line 616
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/util/av;->a(Landroid/view/View;I)V

    goto :goto_0

    .line 620
    :pswitch_1
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/util/av;->a(Landroid/view/View;I)V

    goto :goto_0

    .line 623
    :pswitch_2
    sget-object v0, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lkik/android/widget/GalleryWidget;->b(Ljava/lang/String;)V

    .line 624
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lkik/android/util/KikSpinner;->setVisibility(I)V

    goto :goto_0

    .line 627
    :pswitch_3
    iget-boolean v0, p0, Lkik/android/widget/GalleryWidget;->m:Z

    if-nez v0, :cond_0

    .line 628
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-virtual {v0}, Lkik/android/util/KikSpinner;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 629
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-virtual {v0, v2}, Lkik/android/util/KikSpinner;->setVisibility(I)V

    goto :goto_0

    .line 613
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 689
    iget-boolean v0, p0, Lkik/android/widget/GalleryWidget;->q:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/GalleryWidget;->q:Z

    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_dimBackground:Landroid/view/View;

    const/16 v1, 0x96

    invoke-static {v0, v1}, Lkik/android/util/av;->b(Landroid/view/View;I)V

    .line 690
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->r:Lkik/android/widget/GalleryWidget$a;

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->r:Lkik/android/widget/GalleryWidget$a;

    invoke-interface {v0}, Lkik/android/widget/GalleryWidget$a;->a()V

    .line 242
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->r:Lkik/android/widget/GalleryWidget$a;

    .line 244
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 463
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikFragmentBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 464
    invoke-direct {p0}, Lkik/android/widget/GalleryWidget;->f()V

    .line 465
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->j:Lkik/android/widget/z;

    invoke-direct {p0}, Lkik/android/widget/GalleryWidget;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/z;->a(I)V

    .line 466
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 122
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 123
    invoke-virtual {p0}, Lkik/android/widget/GalleryWidget;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/GalleryWidget;)V

    .line 124
    invoke-virtual {p0}, Lkik/android/widget/GalleryWidget;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    .line 125
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0901e6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    .line 126
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->o:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090358

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/widget/GalleryWidget;->b:Ljava/lang/String;

    .line 128
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/widget/GalleryWidget;->c(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    const-string v1, "_id"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lkik/android/widget/GalleryWidget;->i:I

    .line 132
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 137
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikFragmentBase;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 138
    const v0, 0x7f03004a

    invoke-virtual {p1, v0, p2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 139
    invoke-static {p0, v6}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 141
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lkik/android/util/KikSpinner;->setVisibility(I)V

    .line 142
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    const-string v1, "AUTOMATION_GALLERY_DROPDOWN"

    invoke-virtual {v0, v1}, Lkik/android/util/KikSpinner;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 143
    new-instance v0, Lkik/android/widget/aa;

    iget v1, p0, Lkik/android/widget/GalleryWidget;->i:I

    sget-object v2, Lkik/android/widget/GalleryWidget;->g:Ljava/lang/String;

    invoke-direct {v0, p0, p1, v1, v2}, Lkik/android/widget/aa;-><init>(Lkik/android/widget/GalleryWidget;Landroid/view/LayoutInflater;ILjava/lang/String;)V

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->l:Lkik/android/widget/aa;

    .line 144
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->l:Lkik/android/widget/aa;

    invoke-virtual {v0, v1}, Lkik/android/util/KikSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 145
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->s:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Lkik/android/util/KikSpinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 146
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    const-string v1, "AUTOMATION_GALLERY_PHOTO_LIST"

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 147
    invoke-direct {p0}, Lkik/android/widget/GalleryWidget;->f()V

    .line 148
    new-instance v0, Lkik/android/widget/z;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-direct {p0}, Lkik/android/widget/GalleryWidget;->g()I

    move-result v4

    iget v5, p0, Lkik/android/widget/GalleryWidget;->i:I

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lkik/android/widget/z;-><init>(Lkik/android/widget/GalleryWidget;Landroid/content/Context;Landroid/database/Cursor;II)V

    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->j:Lkik/android/widget/z;

    .line 149
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->j:Lkik/android/widget/z;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 150
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->x:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 152
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    iget-object v1, p0, Lkik/android/widget/GalleryWidget;->t:Landroid/widget/AdapterView$OnItemLongClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 154
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    iput v0, p0, Lkik/android/widget/GalleryWidget;->p:I

    .line 156
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 158
    :cond_0
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-nez v0, :cond_2

    .line 159
    :cond_1
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_noPhotosText:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 160
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_topDivider:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 161
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/GalleryWidget;->m:Z

    .line 164
    :cond_2
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    invoke-virtual {v0, p0}, Lkik/android/util/KikSpinner;->a(Lkik/android/e/b;)V

    .line 165
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    new-instance v1, Lkik/android/widget/ad;

    invoke-direct {v1, p0}, Lkik/android/widget/ad;-><init>(Lkik/android/widget/GalleryWidget;)V

    invoke-virtual {v0, v1}, Lkik/android/util/KikSpinner;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 178
    invoke-direct {p0}, Lkik/android/widget/GalleryWidget;->e()V

    .line 179
    return-object v6
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 471
    invoke-super {p0}, Lkik/android/chat/fragment/KikFragmentBase;->onDestroy()V

    .line 472
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 473
    iget-object v0, p0, Lkik/android/widget/GalleryWidget;->h:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 475
    :cond_0
    return-void
.end method
