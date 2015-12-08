.class public final Lcom/roidapp/photogrid/cloud/a/y;
.super Lcom/roidapp/photogrid/cloud/a/w;
.source "SourceFile"


# instance fields
.field private j:Ljava/lang/String;

.field private k:Z

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/BaseAdapter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/roidapp/photogrid/cloud/a/t;)V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, p3}, Lcom/roidapp/photogrid/cloud/a/w;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 33
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/a/y;->j:Ljava/lang/String;

    .line 34
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/a/y;->b()V

    .line 35
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/a/y;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->m:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private b()V
    .locals 8

    .prologue
    const v7, 0x7f0702f2

    const v6, 0x7f07012e

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->k:Z

    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->a(Landroid/content/res/Resources;)Ljava/util/List;

    move-result-object v0

    .line 51
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 1126
    iget-object v3, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 54
    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/y;->d:Landroid/content/Context;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "com.roidapp.photogrid.plugin.stickers"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2126
    iget-object v5, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 54
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 55
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 58
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 59
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v4, v0

    mul-double/2addr v2, v4

    double-to-int v0, v2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 61
    if-eqz v0, :cond_5

    .line 63
    const v1, 0x7f07027f

    iput v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->h:I

    .line 3126
    iget-object v1, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 64
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->l:Ljava/lang/String;

    .line 67
    const-string v1, ".valentinequote"

    .line 4126
    iget-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 70
    const v0, 0x7f0204e3

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->a:I

    .line 71
    const v0, 0x7f0702f1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->b:I

    .line 72
    const v0, 0x7f07012d

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->g:I

    .line 124
    :goto_1
    return-void

    .line 74
    :cond_2
    const-string v1, ".christmas2014"

    .line 5126
    iget-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 77
    const v0, 0x7f0204e0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->a:I

    .line 78
    iput v7, p0, Lcom/roidapp/photogrid/cloud/a/y;->b:I

    .line 79
    iput v6, p0, Lcom/roidapp/photogrid/cloud/a/y;->g:I

    goto :goto_1

    .line 81
    :cond_3
    const-string v1, ".christmas"

    .line 6126
    iget-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 84
    const v0, 0x7f0204df

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->a:I

    .line 85
    iput v7, p0, Lcom/roidapp/photogrid/cloud/a/y;->b:I

    .line 86
    iput v6, p0, Lcom/roidapp/photogrid/cloud/a/y;->g:I

    goto :goto_1

    .line 6142
    :cond_4
    iget v1, v0, Lcom/roidapp/photogrid/release/StickerInfo;->d:I

    .line 90
    iput v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->a:I

    .line 7134
    iget-object v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->c:Ljava/lang/String;

    .line 91
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->c:Ljava/lang/String;

    .line 92
    const v0, 0x7f07012b

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->g:I

    goto :goto_1

    .line 116
    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->f:Z

    goto :goto_1
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 24
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/a/w;->a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method final a(Landroid/widget/BaseAdapter;)V
    .locals 1

    .prologue
    .line 43
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->m:Ljava/lang/ref/WeakReference;

    .line 44
    return-void
.end method

.method protected final b(Landroid/widget/BaseAdapter;)V
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 128
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/a/y;->b()V

    .line 129
    if-eqz p1, :cond_0

    .line 130
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 132
    :cond_0
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->d:Landroid/content/Context;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ParentActivity;

    if-eqz v0, :cond_4

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/y;->d:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/ParentActivity;

    .line 138
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->l:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 139
    const-string v1, ".valentinequote"

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->l:Ljava/lang/String;

    .line 140
    :cond_0
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->k:Z

    if-eqz v1, :cond_3

    .line 141
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->d:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/y;->j:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/sticker/unlock"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 143
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->l:Ljava/lang/String;

    .line 7157
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->E()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7206
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->h()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 150
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/a/w;->onClick(Landroid/view/View;)V

    .line 153
    :goto_1
    return-void

    .line 7209
    :cond_2
    new-instance v2, Lcom/roidapp/photogrid/release/re;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/re;-><init>()V

    .line 7210
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/z;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/cloud/a/z;-><init>(Lcom/roidapp/photogrid/cloud/a/y;Lcom/roidapp/photogrid/release/ParentActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/re;->a(Landroid/view/View$OnClickListener;)V

    .line 7228
    const/4 v1, 0x0

    const v3, 0x7f0b0027

    invoke-virtual {v2, v1, v3}, Lcom/roidapp/photogrid/release/re;->setStyle(II)V

    .line 7229
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "videoAdDialog"

    invoke-static {v0, v2, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    goto :goto_0

    .line 146
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->d:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/y;->j:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/sticker/free_download"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/y;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 148
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/y;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ab;->a(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 152
    :cond_4
    const-string v0, "StickerCard"

    const-string v1, "context is not Activity."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method
