.class public final Lcom/roidapp/photogrid/release/kf;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field private b:[Ljava/lang/String;

.field private c:[Ljava/lang/String;

.field private d:[Ljava/lang/Integer;

.field private e:Landroid/widget/ListView;

.field private f:Z

.field private g:Lcom/roidapp/photogrid/cloud/t;

.field private h:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kf;->a:Ljava/util/HashMap;

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/kf;->f:Z

    return-void
.end method


# virtual methods
.method protected final a(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kf;->h:Landroid/widget/AdapterView$OnItemClickListener;

    .line 90
    return-void
.end method

.method protected final a([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;)V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/kf;->f:Z

    .line 59
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kf;->b:[Ljava/lang/String;

    .line 60
    iput-object p2, p0, Lcom/roidapp/photogrid/release/kf;->c:[Ljava/lang/String;

    .line 61
    iput-object p3, p0, Lcom/roidapp/photogrid/release/kf;->d:[Ljava/lang/Integer;

    .line 62
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .prologue
    .line 38
    const v0, 0x7f0300ad

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 1044
    const v0, 0x7f0d028f

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kf;->e:Landroid/widget/ListView;

    .line 1045
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/kf;->f:Z

    if-eqz v0, :cond_1

    .line 1046
    new-instance v0, Lcom/roidapp/photogrid/cloud/t;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kf;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kf;->e:Landroid/widget/ListView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/kf;->b:[Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/kf;->c:[Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/kf;->d:[Ljava/lang/Integer;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/kf;->a:Ljava/util/HashMap;

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/photogrid/cloud/t;-><init>(Landroid/content/Context;Landroid/widget/ListView;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;Ljava/util/HashMap;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kf;->g:Lcom/roidapp/photogrid/cloud/t;

    .line 1050
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kf;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kf;->g:Lcom/roidapp/photogrid/cloud/t;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1051
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kf;->h:Landroid/widget/AdapterView$OnItemClickListener;

    if-eqz v0, :cond_0

    .line 1052
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kf;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kf;->h:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 40
    :cond_0
    return-object v8

    .line 1048
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/cloud/t;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/kf;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/cloud/t;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kf;->g:Lcom/roidapp/photogrid/cloud/t;

    goto :goto_0
.end method

.method public final onDestroy()V
    .locals 4

    .prologue
    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kf;->a:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 67
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 86
    :goto_0
    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kf;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 71
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kf;->a:Ljava/util/HashMap;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 73
    if-eqz v0, :cond_1

    .line 74
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 75
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_1

    .line 76
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 78
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->clear()V

    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 83
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kf;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kf;->a:Ljava/util/HashMap;

    .line 85
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    goto :goto_0
.end method
