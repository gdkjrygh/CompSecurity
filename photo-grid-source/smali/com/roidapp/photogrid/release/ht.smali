.class public Lcom/roidapp/photogrid/release/ht;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field public static final b:Ljava/lang/String;


# instance fields
.field private a:I

.field protected c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field protected d:Lcom/roidapp/photogrid/release/ng;

.field protected e:[Lcom/roidapp/photogrid/video/bj;

.field protected f:I

.field protected g:Landroid/view/View;

.field protected h:Landroid/view/LayoutInflater;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/roidapp/photogrid/release/ht;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/release/ht;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 27
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 32
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    .line 33
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/ht;->f:I

    .line 34
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    .line 35
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ht;->h:Landroid/view/LayoutInflater;

    return-void
.end method

.method private a(Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 177
    sget-object v0, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    .line 179
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    if-eqz p1, :cond_1

    const v0, 0x7f0205f9

    :goto_0
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 183
    if-eqz v0, :cond_0

    .line 184
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v1, v2, v1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 186
    :cond_0
    return-void

    .line 179
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v0, v0, v1

    iget v0, v0, Lcom/roidapp/photogrid/video/bj;->c:I

    goto :goto_0
.end method


# virtual methods
.method protected a()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 46
    sget-object v0, Lcom/roidapp/videolib/b/u;->k:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v0

    new-array v0, v0, [Lcom/roidapp/photogrid/video/bj;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    .line 47
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703cc

    const v5, 0x7f02040c

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703d0

    const v5, 0x7f0205f8

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 49
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->e:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->e:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703ce

    const v5, 0x7f0205f1

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->f:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->f:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703cf

    const v5, 0x7f0205f2

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 51
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->g:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->g:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703ca

    const v5, 0x7f0205f3

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 52
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->h:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->h:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703c7

    const v5, 0x7f0205f4

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->i:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->i:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703c8

    const v5, 0x7f0205f5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 54
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->j:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->j:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703c9

    const v5, 0x7f0205f6

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 55
    return-void
.end method

.method protected final a(I)Z
    .locals 2

    .prologue
    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->d:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->d:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->d:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v1}, Lcom/roidapp/videolib/core/e;->c(Lcom/roidapp/videolib/b/u;)I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 131
    const v0, 0x7f0300c9

    return v0
.end method

.method protected final b(I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 160
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/roidapp/photogrid/video/bj;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 161
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/ht;->a(I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 162
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c00c0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 163
    if-eqz v0, :cond_0

    .line 164
    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 165
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4, v0, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 174
    :cond_0
    :goto_0
    return-void

    .line 168
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c00bf

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 169
    if-eqz v0, :cond_0

    .line 170
    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 171
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4, v0, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method protected c()I
    .locals 1

    .prologue
    .line 135
    const v0, 0x7f03013a

    return v0
.end method

.method protected d()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 139
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    .line 140
    sget-object v2, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    if-eq v0, v2, :cond_0

    sget-object v2, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    if-ne v0, v2, :cond_2

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v2, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v2}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v2

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ht;->f:I

    .line 142
    sget-object v0, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    .line 147
    :goto_0
    sget-object v2, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    if-eq v0, v2, :cond_1

    .line 148
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v3

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    .line 150
    :cond_1
    sget-object v2, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    if-ne v0, v2, :cond_3

    move v0, v1

    :goto_1
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ht;->a(Z)V

    .line 151
    return-void

    .line 144
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v3

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ht;->f:I

    goto :goto_0

    .line 150
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 40
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 42
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->a()V

    .line 43
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ht;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ht;->d:Lcom/roidapp/photogrid/release/ng;

    .line 77
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ht;->h:Landroid/view/LayoutInflater;

    .line 78
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ht;->a:I

    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->h:Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->b()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    .line 81
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    check-cast v0, Lcom/roidapp/photogrid/video/d;

    new-instance v1, Lcom/roidapp/photogrid/release/hu;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/hu;-><init>(Lcom/roidapp/photogrid/release/ht;)V

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/video/d;->a(Landroid/widget/BaseAdapter;)V

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    check-cast v0, Lcom/roidapp/photogrid/video/d;

    invoke-interface {v0, p0}, Lcom/roidapp/photogrid/video/d;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 125
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->d()V

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    return-object v0
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 59
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    instance-of v0, v0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-eqz v0, :cond_1

    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    check-cast v0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b()V

    .line 64
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    .line 70
    :cond_0
    :goto_0
    return-void

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    instance-of v0, v0, Lcom/roidapp/photogrid/video/HorizontalViewEx;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    check-cast v0, Lcom/roidapp/photogrid/video/HorizontalViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalViewEx;->a()V

    .line 67
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    goto :goto_0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
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
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 191
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    instance-of v0, v0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-eqz v0, :cond_0

    .line 192
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 193
    iget v0, p0, Lcom/roidapp/photogrid/release/ht;->a:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    sub-int/2addr v0, v4

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getScrollX()I

    move-result v5

    sub-int/2addr v4, v5

    sub-int v4, v0, v4

    .line 194
    if-ge v4, v3, :cond_1

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    check-cast v0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    sub-int/2addr v3, v4

    invoke-virtual {v0, v3, v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->smoothScrollBy(II)V

    .line 206
    :cond_0
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v3

    .line 208
    :try_start_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ht;->f:I

    if-ne v0, v3, :cond_2

    sget-object v0, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eq v3, v0, :cond_2

    .line 235
    :goto_1
    return-void

    .line 198
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    move-result v4

    sub-int v4, v0, v4

    .line 200
    if-ge v4, v3, :cond_0

    .line 201
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->g:Landroid/view/View;

    check-cast v0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    sub-int v3, v4, v3

    invoke-virtual {v0, v3, v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->smoothScrollBy(II)V

    goto :goto_0

    .line 210
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v0

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/ht;->a(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 211
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702f8

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v5

    aget-object v3, v5, v3

    invoke-static {v3}, Lcom/roidapp/videolib/core/e;->c(Lcom/roidapp/videolib/b/u;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/roidapp/photogrid/release/ht;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_1

    .line 235
    :catch_0
    move-exception v0

    goto :goto_1

    .line 216
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    iget v4, p0, Lcom/roidapp/photogrid/release/ht;->f:I

    aget-object v0, v0, v4

    iget-object v0, v0, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/view/View;->setSelected(Z)V

    .line 217
    iput v3, p0, Lcom/roidapp/photogrid/release/ht;->f:I

    .line 219
    sget-object v0, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v0

    if-ne v0, v3, :cond_6

    move v0, v1

    .line 220
    :goto_2
    if-nez v0, :cond_4

    .line 221
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v1, v1, v3

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 224
    :cond_4
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ht;->a(Z)V

    .line 227
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->d:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_5

    .line 228
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ht;->d:Lcom/roidapp/photogrid/release/ng;

    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v1

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/videolib/b/u;)V

    .line 231
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ht;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1

    :cond_6
    move v0, v2

    .line 219
    goto :goto_2
.end method
