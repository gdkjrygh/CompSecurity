.class public Lcom/roidapp/imagelib/freecrop/TemplateClipView;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public a:[[I

.field public b:[[I

.field private c:Landroid/content/Context;

.field private d:Landroid/view/LayoutInflater;

.field private e:Lcom/roidapp/imagelib/freecrop/p;

.field private f:Landroid/view/View;

.field private g:I

.field private h:I

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private j:[I

.field private k:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 48
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 29
    iput v4, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->h:I

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    .line 93
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->k:Landroid/os/Handler;

    .line 177
    new-array v0, v6, [[I

    const/16 v1, 0x14

    new-array v1, v1, [I

    sget v2, Lcom/roidapp/imagelib/f;->w:I

    aput v2, v1, v4

    sget v2, Lcom/roidapp/imagelib/f;->H:I

    aput v2, v1, v5

    sget v2, Lcom/roidapp/imagelib/f;->S:I

    aput v2, v1, v6

    sget v2, Lcom/roidapp/imagelib/f;->W:I

    aput v2, v1, v7

    sget v2, Lcom/roidapp/imagelib/f;->X:I

    aput v2, v1, v8

    const/4 v2, 0x5

    sget v3, Lcom/roidapp/imagelib/f;->Y:I

    aput v3, v1, v2

    const/4 v2, 0x6

    sget v3, Lcom/roidapp/imagelib/f;->Z:I

    aput v3, v1, v2

    const/4 v2, 0x7

    sget v3, Lcom/roidapp/imagelib/f;->aa:I

    aput v3, v1, v2

    const/16 v2, 0x8

    sget v3, Lcom/roidapp/imagelib/f;->ab:I

    aput v3, v1, v2

    const/16 v2, 0x9

    sget v3, Lcom/roidapp/imagelib/f;->x:I

    aput v3, v1, v2

    const/16 v2, 0xa

    sget v3, Lcom/roidapp/imagelib/f;->y:I

    aput v3, v1, v2

    const/16 v2, 0xb

    sget v3, Lcom/roidapp/imagelib/f;->z:I

    aput v3, v1, v2

    const/16 v2, 0xc

    sget v3, Lcom/roidapp/imagelib/f;->A:I

    aput v3, v1, v2

    const/16 v2, 0xd

    sget v3, Lcom/roidapp/imagelib/f;->B:I

    aput v3, v1, v2

    const/16 v2, 0xe

    sget v3, Lcom/roidapp/imagelib/f;->C:I

    aput v3, v1, v2

    const/16 v2, 0xf

    sget v3, Lcom/roidapp/imagelib/f;->D:I

    aput v3, v1, v2

    const/16 v2, 0x10

    sget v3, Lcom/roidapp/imagelib/f;->E:I

    aput v3, v1, v2

    const/16 v2, 0x11

    sget v3, Lcom/roidapp/imagelib/f;->F:I

    aput v3, v1, v2

    const/16 v2, 0x12

    sget v3, Lcom/roidapp/imagelib/f;->G:I

    aput v3, v1, v2

    const/16 v2, 0x13

    sget v3, Lcom/roidapp/imagelib/f;->I:I

    aput v3, v1, v2

    aput-object v1, v0, v4

    const/16 v1, 0xc

    new-array v1, v1, [I

    sget v2, Lcom/roidapp/imagelib/f;->J:I

    aput v2, v1, v4

    sget v2, Lcom/roidapp/imagelib/f;->K:I

    aput v2, v1, v5

    sget v2, Lcom/roidapp/imagelib/f;->L:I

    aput v2, v1, v6

    sget v2, Lcom/roidapp/imagelib/f;->M:I

    aput v2, v1, v7

    sget v2, Lcom/roidapp/imagelib/f;->N:I

    aput v2, v1, v8

    const/4 v2, 0x5

    sget v3, Lcom/roidapp/imagelib/f;->O:I

    aput v3, v1, v2

    const/4 v2, 0x6

    sget v3, Lcom/roidapp/imagelib/f;->P:I

    aput v3, v1, v2

    const/4 v2, 0x7

    sget v3, Lcom/roidapp/imagelib/f;->Q:I

    aput v3, v1, v2

    const/16 v2, 0x8

    sget v3, Lcom/roidapp/imagelib/f;->R:I

    aput v3, v1, v2

    const/16 v2, 0x9

    sget v3, Lcom/roidapp/imagelib/f;->T:I

    aput v3, v1, v2

    const/16 v2, 0xa

    sget v3, Lcom/roidapp/imagelib/f;->U:I

    aput v3, v1, v2

    const/16 v2, 0xb

    sget v3, Lcom/roidapp/imagelib/f;->V:I

    aput v3, v1, v2

    aput-object v1, v0, v5

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a:[[I

    .line 217
    new-array v0, v6, [[I

    const/16 v1, 0x14

    new-array v1, v1, [I

    sget v2, Lcom/roidapp/imagelib/i;->L:I

    aput v2, v1, v4

    sget v2, Lcom/roidapp/imagelib/i;->W:I

    aput v2, v1, v5

    sget v2, Lcom/roidapp/imagelib/i;->ah:I

    aput v2, v1, v6

    sget v2, Lcom/roidapp/imagelib/i;->al:I

    aput v2, v1, v7

    sget v2, Lcom/roidapp/imagelib/i;->am:I

    aput v2, v1, v8

    const/4 v2, 0x5

    sget v3, Lcom/roidapp/imagelib/i;->an:I

    aput v3, v1, v2

    const/4 v2, 0x6

    sget v3, Lcom/roidapp/imagelib/i;->ao:I

    aput v3, v1, v2

    const/4 v2, 0x7

    sget v3, Lcom/roidapp/imagelib/i;->ap:I

    aput v3, v1, v2

    const/16 v2, 0x8

    sget v3, Lcom/roidapp/imagelib/i;->aq:I

    aput v3, v1, v2

    const/16 v2, 0x9

    sget v3, Lcom/roidapp/imagelib/i;->M:I

    aput v3, v1, v2

    const/16 v2, 0xa

    sget v3, Lcom/roidapp/imagelib/i;->N:I

    aput v3, v1, v2

    const/16 v2, 0xb

    sget v3, Lcom/roidapp/imagelib/i;->O:I

    aput v3, v1, v2

    const/16 v2, 0xc

    sget v3, Lcom/roidapp/imagelib/i;->P:I

    aput v3, v1, v2

    const/16 v2, 0xd

    sget v3, Lcom/roidapp/imagelib/i;->Q:I

    aput v3, v1, v2

    const/16 v2, 0xe

    sget v3, Lcom/roidapp/imagelib/i;->R:I

    aput v3, v1, v2

    const/16 v2, 0xf

    sget v3, Lcom/roidapp/imagelib/i;->S:I

    aput v3, v1, v2

    const/16 v2, 0x10

    sget v3, Lcom/roidapp/imagelib/i;->T:I

    aput v3, v1, v2

    const/16 v2, 0x11

    sget v3, Lcom/roidapp/imagelib/i;->U:I

    aput v3, v1, v2

    const/16 v2, 0x12

    sget v3, Lcom/roidapp/imagelib/i;->V:I

    aput v3, v1, v2

    const/16 v2, 0x13

    sget v3, Lcom/roidapp/imagelib/i;->X:I

    aput v3, v1, v2

    aput-object v1, v0, v4

    const/16 v1, 0xc

    new-array v1, v1, [I

    sget v2, Lcom/roidapp/imagelib/i;->Y:I

    aput v2, v1, v4

    sget v2, Lcom/roidapp/imagelib/i;->Z:I

    aput v2, v1, v5

    sget v2, Lcom/roidapp/imagelib/i;->aa:I

    aput v2, v1, v6

    sget v2, Lcom/roidapp/imagelib/i;->ab:I

    aput v2, v1, v7

    sget v2, Lcom/roidapp/imagelib/i;->ac:I

    aput v2, v1, v8

    const/4 v2, 0x5

    sget v3, Lcom/roidapp/imagelib/i;->ad:I

    aput v3, v1, v2

    const/4 v2, 0x6

    sget v3, Lcom/roidapp/imagelib/i;->ae:I

    aput v3, v1, v2

    const/4 v2, 0x7

    sget v3, Lcom/roidapp/imagelib/i;->af:I

    aput v3, v1, v2

    const/16 v2, 0x8

    sget v3, Lcom/roidapp/imagelib/i;->ag:I

    aput v3, v1, v2

    const/16 v2, 0x9

    sget v3, Lcom/roidapp/imagelib/i;->ai:I

    aput v3, v1, v2

    const/16 v2, 0xa

    sget v3, Lcom/roidapp/imagelib/i;->aj:I

    aput v3, v1, v2

    const/16 v2, 0xb

    sget v3, Lcom/roidapp/imagelib/i;->ak:I

    aput v3, v1, v2

    aput-object v1, v0, v5

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b:[[I

    .line 49
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->c:Landroid/content/Context;

    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->c:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->d:Landroid/view/LayoutInflater;

    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->d:Landroid/view/LayoutInflater;

    sget v1, Lcom/roidapp/imagelib/h;->o:I

    invoke-virtual {v0, v1, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->f:Landroid/view/View;

    .line 52
    new-array v0, v6, [I

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    .line 53
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    const/4 v1, -0x1

    aput v1, v0, v4

    .line 54
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    const/4 v1, -0x1

    aput v1, v0, v5

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 58
    invoke-direct {p0, p1, p2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    iput v4, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->h:I

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    .line 93
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->k:Landroid/os/Handler;

    .line 177
    new-array v0, v6, [[I

    const/16 v1, 0x14

    new-array v1, v1, [I

    sget v2, Lcom/roidapp/imagelib/f;->w:I

    aput v2, v1, v4

    sget v2, Lcom/roidapp/imagelib/f;->H:I

    aput v2, v1, v5

    sget v2, Lcom/roidapp/imagelib/f;->S:I

    aput v2, v1, v6

    sget v2, Lcom/roidapp/imagelib/f;->W:I

    aput v2, v1, v7

    sget v2, Lcom/roidapp/imagelib/f;->X:I

    aput v2, v1, v8

    const/4 v2, 0x5

    sget v3, Lcom/roidapp/imagelib/f;->Y:I

    aput v3, v1, v2

    const/4 v2, 0x6

    sget v3, Lcom/roidapp/imagelib/f;->Z:I

    aput v3, v1, v2

    const/4 v2, 0x7

    sget v3, Lcom/roidapp/imagelib/f;->aa:I

    aput v3, v1, v2

    const/16 v2, 0x8

    sget v3, Lcom/roidapp/imagelib/f;->ab:I

    aput v3, v1, v2

    const/16 v2, 0x9

    sget v3, Lcom/roidapp/imagelib/f;->x:I

    aput v3, v1, v2

    const/16 v2, 0xa

    sget v3, Lcom/roidapp/imagelib/f;->y:I

    aput v3, v1, v2

    const/16 v2, 0xb

    sget v3, Lcom/roidapp/imagelib/f;->z:I

    aput v3, v1, v2

    const/16 v2, 0xc

    sget v3, Lcom/roidapp/imagelib/f;->A:I

    aput v3, v1, v2

    const/16 v2, 0xd

    sget v3, Lcom/roidapp/imagelib/f;->B:I

    aput v3, v1, v2

    const/16 v2, 0xe

    sget v3, Lcom/roidapp/imagelib/f;->C:I

    aput v3, v1, v2

    const/16 v2, 0xf

    sget v3, Lcom/roidapp/imagelib/f;->D:I

    aput v3, v1, v2

    const/16 v2, 0x10

    sget v3, Lcom/roidapp/imagelib/f;->E:I

    aput v3, v1, v2

    const/16 v2, 0x11

    sget v3, Lcom/roidapp/imagelib/f;->F:I

    aput v3, v1, v2

    const/16 v2, 0x12

    sget v3, Lcom/roidapp/imagelib/f;->G:I

    aput v3, v1, v2

    const/16 v2, 0x13

    sget v3, Lcom/roidapp/imagelib/f;->I:I

    aput v3, v1, v2

    aput-object v1, v0, v4

    const/16 v1, 0xc

    new-array v1, v1, [I

    sget v2, Lcom/roidapp/imagelib/f;->J:I

    aput v2, v1, v4

    sget v2, Lcom/roidapp/imagelib/f;->K:I

    aput v2, v1, v5

    sget v2, Lcom/roidapp/imagelib/f;->L:I

    aput v2, v1, v6

    sget v2, Lcom/roidapp/imagelib/f;->M:I

    aput v2, v1, v7

    sget v2, Lcom/roidapp/imagelib/f;->N:I

    aput v2, v1, v8

    const/4 v2, 0x5

    sget v3, Lcom/roidapp/imagelib/f;->O:I

    aput v3, v1, v2

    const/4 v2, 0x6

    sget v3, Lcom/roidapp/imagelib/f;->P:I

    aput v3, v1, v2

    const/4 v2, 0x7

    sget v3, Lcom/roidapp/imagelib/f;->Q:I

    aput v3, v1, v2

    const/16 v2, 0x8

    sget v3, Lcom/roidapp/imagelib/f;->R:I

    aput v3, v1, v2

    const/16 v2, 0x9

    sget v3, Lcom/roidapp/imagelib/f;->T:I

    aput v3, v1, v2

    const/16 v2, 0xa

    sget v3, Lcom/roidapp/imagelib/f;->U:I

    aput v3, v1, v2

    const/16 v2, 0xb

    sget v3, Lcom/roidapp/imagelib/f;->V:I

    aput v3, v1, v2

    aput-object v1, v0, v5

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a:[[I

    .line 217
    new-array v0, v6, [[I

    const/16 v1, 0x14

    new-array v1, v1, [I

    sget v2, Lcom/roidapp/imagelib/i;->L:I

    aput v2, v1, v4

    sget v2, Lcom/roidapp/imagelib/i;->W:I

    aput v2, v1, v5

    sget v2, Lcom/roidapp/imagelib/i;->ah:I

    aput v2, v1, v6

    sget v2, Lcom/roidapp/imagelib/i;->al:I

    aput v2, v1, v7

    sget v2, Lcom/roidapp/imagelib/i;->am:I

    aput v2, v1, v8

    const/4 v2, 0x5

    sget v3, Lcom/roidapp/imagelib/i;->an:I

    aput v3, v1, v2

    const/4 v2, 0x6

    sget v3, Lcom/roidapp/imagelib/i;->ao:I

    aput v3, v1, v2

    const/4 v2, 0x7

    sget v3, Lcom/roidapp/imagelib/i;->ap:I

    aput v3, v1, v2

    const/16 v2, 0x8

    sget v3, Lcom/roidapp/imagelib/i;->aq:I

    aput v3, v1, v2

    const/16 v2, 0x9

    sget v3, Lcom/roidapp/imagelib/i;->M:I

    aput v3, v1, v2

    const/16 v2, 0xa

    sget v3, Lcom/roidapp/imagelib/i;->N:I

    aput v3, v1, v2

    const/16 v2, 0xb

    sget v3, Lcom/roidapp/imagelib/i;->O:I

    aput v3, v1, v2

    const/16 v2, 0xc

    sget v3, Lcom/roidapp/imagelib/i;->P:I

    aput v3, v1, v2

    const/16 v2, 0xd

    sget v3, Lcom/roidapp/imagelib/i;->Q:I

    aput v3, v1, v2

    const/16 v2, 0xe

    sget v3, Lcom/roidapp/imagelib/i;->R:I

    aput v3, v1, v2

    const/16 v2, 0xf

    sget v3, Lcom/roidapp/imagelib/i;->S:I

    aput v3, v1, v2

    const/16 v2, 0x10

    sget v3, Lcom/roidapp/imagelib/i;->T:I

    aput v3, v1, v2

    const/16 v2, 0x11

    sget v3, Lcom/roidapp/imagelib/i;->U:I

    aput v3, v1, v2

    const/16 v2, 0x12

    sget v3, Lcom/roidapp/imagelib/i;->V:I

    aput v3, v1, v2

    const/16 v2, 0x13

    sget v3, Lcom/roidapp/imagelib/i;->X:I

    aput v3, v1, v2

    aput-object v1, v0, v4

    const/16 v1, 0xc

    new-array v1, v1, [I

    sget v2, Lcom/roidapp/imagelib/i;->Y:I

    aput v2, v1, v4

    sget v2, Lcom/roidapp/imagelib/i;->Z:I

    aput v2, v1, v5

    sget v2, Lcom/roidapp/imagelib/i;->aa:I

    aput v2, v1, v6

    sget v2, Lcom/roidapp/imagelib/i;->ab:I

    aput v2, v1, v7

    sget v2, Lcom/roidapp/imagelib/i;->ac:I

    aput v2, v1, v8

    const/4 v2, 0x5

    sget v3, Lcom/roidapp/imagelib/i;->ad:I

    aput v3, v1, v2

    const/4 v2, 0x6

    sget v3, Lcom/roidapp/imagelib/i;->ae:I

    aput v3, v1, v2

    const/4 v2, 0x7

    sget v3, Lcom/roidapp/imagelib/i;->af:I

    aput v3, v1, v2

    const/16 v2, 0x8

    sget v3, Lcom/roidapp/imagelib/i;->ag:I

    aput v3, v1, v2

    const/16 v2, 0x9

    sget v3, Lcom/roidapp/imagelib/i;->ai:I

    aput v3, v1, v2

    const/16 v2, 0xa

    sget v3, Lcom/roidapp/imagelib/i;->aj:I

    aput v3, v1, v2

    const/16 v2, 0xb

    sget v3, Lcom/roidapp/imagelib/i;->ak:I

    aput v3, v1, v2

    aput-object v1, v0, v5

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b:[[I

    .line 60
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)Ljava/util/List;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)[I
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 63
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->h:I

    .line 65
    return-void
.end method

.method public final a(I)V
    .locals 12

    .prologue
    const/4 v1, 0x0

    const/4 v11, -0x1

    .line 68
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->h:I

    if-ne v0, p1, :cond_1

    .line 69
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget v0, v0, v1

    if-eq v0, v11, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget v1, v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->o:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 71
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 72
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->e:Lcom/roidapp/imagelib/freecrop/p;

    invoke-interface {v0, v11}, Lcom/roidapp/imagelib/freecrop/p;->a(I)V

    .line 73
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aput v11, v0, v1

    .line 82
    :cond_0
    :goto_0
    return-void

    .line 78
    :cond_1
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    .line 79
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b()V

    .line 1096
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->f:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->aR:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1099
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/e;->j:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 1101
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a:[[I

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget-object v5, v3, v4

    .line 1102
    array-length v6, v5

    .line 1103
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v7, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1104
    iget-object v8, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    monitor-enter v8

    move v4, v1

    .line 1105
    :goto_1
    if-ge v4, v6, :cond_2

    .line 1107
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->d:Landroid/view/LayoutInflater;

    sget v2, Lcom/roidapp/imagelib/h;->p:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v9

    .line 1108
    sget v1, Lcom/roidapp/imagelib/g;->c:I

    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1110
    :try_start_1
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    aget v3, v5, v4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 1111
    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 1112
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1121
    :goto_2
    :try_start_2
    invoke-virtual {v9, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1122
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1123
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1124
    invoke-virtual {v9, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1125
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1105
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_1

    .line 1113
    :catch_0
    move-exception v2

    move-object v3, v2

    .line 1114
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1115
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1116
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    aget v10, v5, v4

    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 1117
    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 1118
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1119
    invoke-virtual {v3}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_2

    .line 1135
    :catchall_0
    move-exception v0

    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1127
    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget v0, v0, v1

    if-eq v0, v11, :cond_3

    .line 1128
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget v1, v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->o:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1129
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1130
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b:[[I

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget-object v0, v0, v1

    .line 1131
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->e:Lcom/roidapp/imagelib/freecrop/p;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget v2, v2, v3

    aget v0, v0, v2

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/freecrop/p;->a(I)V

    .line 1135
    :goto_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1137
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->k:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/freecrop/o;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/freecrop/o;-><init>(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 81
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->h:I

    goto/16 :goto_0

    .line 1133
    :cond_3
    :try_start_4
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->e:Lcom/roidapp/imagelib/freecrop/p;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/freecrop/p;->a(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3
.end method

.method public final a(Landroid/support/v4/app/Fragment;)V
    .locals 3

    .prologue
    .line 39
    instance-of v0, p1, Lcom/roidapp/imagelib/freecrop/p;

    if-eqz v0, :cond_0

    .line 40
    check-cast p1, Lcom/roidapp/imagelib/freecrop/p;

    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->e:Lcom/roidapp/imagelib/freecrop/p;

    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet ImageEditFreeCropFragment.OnTemplateClipListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 85
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->f:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->aR:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 86
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 87
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    monitor-enter v1

    .line 88
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 89
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 160
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->e:Lcom/roidapp/imagelib/freecrop/p;

    invoke-interface {v0}, Lcom/roidapp/imagelib/freecrop/p;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    :goto_0
    return-void

    .line 162
    :cond_0
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    monitor-enter v1

    .line 163
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 164
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b:[[I

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget-object v3, v0, v3

    .line 165
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget v0, v0, v4

    const/4 v4, -0x1

    if-eq v0, v4, :cond_1

    .line 166
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v5, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aget v4, v4, v5

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v4, Lcom/roidapp/imagelib/g;->o:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 167
    const/16 v4, 0x8

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 169
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->i:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v4, Lcom/roidapp/imagelib/g;->o:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 170
    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->e:Lcom/roidapp/imagelib/freecrop/p;

    aget v3, v3, v2

    invoke-interface {v0, v3}, Lcom/roidapp/imagelib/freecrop/p;->a(I)V

    .line 172
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->j:[I

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->g:I

    aput v2, v0, v3

    .line 173
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
