.class public Lcom/facebook/orca/compose/ComposeAttachmentContainer;
.super Lcom/facebook/widget/f;
.source "ComposeAttachmentContainer.java"


# static fields
.field private static final a:[I

.field private static final b:[I


# instance fields
.field private final c:Landroid/view/LayoutInflater;

.field private final d:Lcom/facebook/ui/media/b/a;

.field private final e:Lcom/facebook/ui/media/attachments/d;

.field private final f:Lcom/facebook/orca/photos/b/k;

.field private final g:Lcom/facebook/orca/photos/b/h;

.field private final h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/facebook/orca/photos/b/ab;

.field private final j:Lcom/facebook/common/executors/a;

.field private final k:Lcom/facebook/orca/compose/l;

.field private final l:Lcom/facebook/ui/images/d/h;

.field private final m:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Lcom/facebook/ui/media/attachments/a;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Landroid/widget/LinearLayout;

.field private final o:Landroid/widget/HorizontalScrollView;

.field private p:Lcom/facebook/orca/compose/k;

.field private q:Ljava/lang/String;

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 65
    const/4 v0, 0x1

    new-array v0, v0, [I

    const v1, 0x10100a7

    aput v1, v0, v2

    sput-object v0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a:[I

    .line 66
    new-array v0, v2, [I

    sput-object v0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->b:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 93
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v3, 0x0

    .line 96
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 98
    invoke-static {}, Lcom/google/common/a/ik;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    .line 99
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 100
    const-class v0, Landroid/view/LayoutInflater;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->c:Landroid/view/LayoutInflater;

    .line 101
    const-class v0, Lcom/facebook/ui/media/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/b/a;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->d:Lcom/facebook/ui/media/b/a;

    .line 102
    const-class v0, Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/d;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->e:Lcom/facebook/ui/media/attachments/d;

    .line 103
    const-class v0, Lcom/facebook/orca/photos/b/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/k;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->f:Lcom/facebook/orca/photos/b/k;

    .line 104
    const-class v0, Lcom/facebook/orca/photos/b/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/h;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->g:Lcom/facebook/orca/photos/b/h;

    .line 105
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsNewPhotoUploadEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->h:Ljavax/inject/a;

    .line 107
    const-class v0, Lcom/facebook/orca/photos/b/ab;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/ab;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->i:Lcom/facebook/orca/photos/b/ab;

    .line 108
    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->j:Lcom/facebook/common/executors/a;

    .line 110
    sget v0, Lcom/facebook/k;->orca_compose_attachment_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->setContentView(I)V

    .line 111
    sget v0, Lcom/facebook/i;->compose_attachments:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->n:Landroid/widget/LinearLayout;

    .line 112
    sget v0, Lcom/facebook/i;->compose_attachment_scroll:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->o:Landroid/widget/HorizontalScrollView;

    .line 114
    new-instance v0, Lcom/facebook/orca/compose/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/compose/l;-><init>(Lcom/facebook/orca/compose/ComposeAttachmentContainer;Lcom/facebook/orca/compose/i;)V

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->k:Lcom/facebook/orca/compose/l;

    .line 116
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->orca_compose_attachment_item_image_width_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 118
    new-instance v1, Lcom/facebook/ui/images/d/i;

    invoke-direct {v1}, Lcom/facebook/ui/images/d/i;-><init>()V

    invoke-virtual {v1, v5}, Lcom/facebook/ui/images/d/i;->a(I)Lcom/facebook/ui/images/d/i;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/d/i;->c(I)Lcom/facebook/ui/images/d/i;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/facebook/ui/images/d/i;->b(I)Lcom/facebook/ui/images/d/i;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/d/i;->d(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Z)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    .line 124
    new-instance v1, Lcom/facebook/ui/images/d/d;

    invoke-direct {v1}, Lcom/facebook/ui/images/d/d;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    sget-object v2, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(Lcom/facebook/ui/images/d/c;)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    .line 131
    invoke-virtual {v1}, Lcom/facebook/ui/images/d/d;->e()Lcom/facebook/ui/images/d/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Lcom/facebook/ui/images/d/b;)Lcom/facebook/ui/images/d/i;

    .line 132
    invoke-virtual {v0}, Lcom/facebook/ui/images/d/i;->j()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->l:Lcom/facebook/ui/images/d/h;

    .line 133
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)Ljava/util/LinkedHashMap;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeAttachmentContainer;Lcom/facebook/ui/media/attachments/a;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/ui/media/attachments/a;)V

    return-void
.end method

.method private a(Lcom/facebook/ui/media/attachments/a;)V
    .locals 2

    .prologue
    .line 264
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    :goto_0
    return-void

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 270
    if-eqz v0, :cond_1

    .line 271
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 274
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_2

    .line 275
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->o:Landroid/widget/HorizontalScrollView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 277
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->c()V

    goto :goto_0
.end method

.method private a(Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/a;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 190
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/a;

    .line 191
    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/ui/media/attachments/a;Ljava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/CharSequence;Lcom/facebook/ui/media/attachments/a;)Z
    .locals 2

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->h:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->r:Z

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)Lcom/facebook/orca/photos/b/ab;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->i:Lcom/facebook/orca/photos/b/ab;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/compose/ComposeAttachmentContainer;Lcom/facebook/ui/media/attachments/a;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->b(Lcom/facebook/ui/media/attachments/a;)V

    return-void
.end method

.method private b(Lcom/facebook/ui/media/attachments/a;)V
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->p:Lcom/facebook/orca/compose/k;

    if-eqz v0, :cond_0

    .line 339
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->p:Lcom/facebook/orca/compose/k;

    invoke-interface {v0, p1}, Lcom/facebook/orca/compose/k;->a(Lcom/facebook/ui/media/attachments/a;)V

    .line 341
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)Lcom/facebook/common/executors/a;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->j:Lcom/facebook/common/executors/a;

    return-object v0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->p:Lcom/facebook/orca/compose/k;

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->p:Lcom/facebook/orca/compose/k;

    invoke-interface {v0}, Lcom/facebook/orca/compose/k;->a()V

    .line 335
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 258
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 259
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->o:Landroid/widget/HorizontalScrollView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 260
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->c()V

    .line 261
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/a;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 198
    if-nez p1, :cond_0

    .line 199
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->c()V

    .line 245
    :goto_0
    return-void

    .line 204
    :cond_0
    const/4 v0, 0x0

    .line 206
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v1

    sget-object v2, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v1, v2, :cond_1

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_composer_attachment_item:I

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 209
    sget v0, Lcom/facebook/i;->composer_attachment_item_image:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 210
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->l:Lcom/facebook/ui/images/d/h;

    invoke-virtual {v2, v3}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/d/h;)Lcom/facebook/ui/images/b/o;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v2

    .line 213
    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 214
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 215
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->o:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0, v4}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    move-object v0, v1

    .line 218
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v1

    .line 220
    invoke-direct {p0, p2, p1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Ljava/lang/CharSequence;Lcom/facebook/ui/media/attachments/a;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 221
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->f:Lcom/facebook/orca/photos/b/k;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Lcom/facebook/orca/photos/b/k;->a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/String;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v1

    .line 225
    :cond_2
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->e:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v2, v1}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v1

    .line 227
    if-eqz v0, :cond_3

    .line 228
    sget v2, Lcom/facebook/i;->composer_attachment_item_remove:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 229
    new-instance v3, Lcom/facebook/orca/compose/i;

    invoke-direct {v3, p0, v1}, Lcom/facebook/orca/compose/i;-><init>(Lcom/facebook/orca/compose/ComposeAttachmentContainer;Lcom/facebook/ui/media/attachments/a;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    new-instance v2, Lcom/facebook/orca/compose/j;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/compose/j;-><init>(Lcom/facebook/orca/compose/ComposeAttachmentContainer;Lcom/facebook/ui/media/attachments/a;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->o:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v2, v4}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 243
    :cond_3
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->c()V

    goto/16 :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 316
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public getMediaAttachments()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap",
            "<",
            "Lcom/facebook/ui/media/attachments/a;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .prologue
    .line 328
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public getMediaResources()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation

    .prologue
    .line 320
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 321
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/a;

    .line 322
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 324
    :cond_0
    return-object v1
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 137
    invoke-super {p0}, Lcom/facebook/widget/f;->onAttachedToWindow()V

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->g:Lcom/facebook/orca/photos/b/h;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->k:Lcom/facebook/orca/compose/l;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/b/h;->a(Lcom/facebook/c/a/c;)Z

    .line 139
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 143
    invoke-super {p0}, Lcom/facebook/widget/f;->onDetachedFromWindow()V

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->g:Lcom/facebook/orca/photos/b/h;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->k:Lcom/facebook/orca/compose/l;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/b/h;->b(Lcom/facebook/c/a/c;)Z

    .line 145
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 4

    .prologue
    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 165
    invoke-super {p0, p1}, Lcom/facebook/widget/f;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 183
    :cond_0
    :goto_0
    return-void

    .line 169
    :cond_1
    check-cast p1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;

    .line 170
    invoke-virtual {p1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/facebook/widget/f;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 171
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a()V

    .line 172
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 173
    iget-object v0, p1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 176
    iget-boolean v0, p1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;->c:Z

    iput-boolean v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->r:Z

    .line 177
    iget-object v0, p1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->q:Ljava/lang/String;

    .line 178
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 179
    iget-object v0, p1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 180
    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->e:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v3, v0}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 182
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->q:Ljava/lang/String;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .prologue
    .line 149
    invoke-super {p0}, Lcom/facebook/widget/f;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 150
    new-instance v1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;

    invoke-direct {v1, v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;-><init>(Landroid/os/Parcelable;)V

    .line 151
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/a;

    .line 153
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 155
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->r:Z

    iput-boolean v0, v1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;->c:Z

    .line 156
    iput-object v2, v1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;->a:Ljava/util/ArrayList;

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->q:Ljava/lang/String;

    iput-object v0, v1, Lcom/facebook/orca/compose/ComposeAttachmentContainer$SavedAttachmentState;->b:Ljava/lang/String;

    .line 158
    return-object v1
.end method

.method public setComposingSmsThread(Z)V
    .locals 0

    .prologue
    .line 344
    iput-boolean p1, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->r:Z

    .line 345
    return-void
.end method

.method public setListener(Lcom/facebook/orca/compose/k;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->p:Lcom/facebook/orca/compose/k;

    .line 187
    return-void
.end method
