.class public final Lcom/roidapp/photogrid/release/km;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/ListView;

.field private d:Lcom/roidapp/photogrid/release/bj;

.field private e:Z

.field private f:Ljava/util/HashMap;
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

.field private g:[Ljava/lang/String;

.field private h:[Ljava/lang/String;

.field private i:[Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/km;->e:Z

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/km;->f:Ljava/util/HashMap;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/km;)V
    .locals 3

    .prologue
    .line 1104
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/km;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/release/PickFolder;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1105
    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/km;->startActivityForResult(Landroid/content/Intent;I)V

    .line 21
    return-void
.end method


# virtual methods
.method protected final a([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;)V
    .locals 1

    .prologue
    .line 91
    array-length v0, p1

    if-nez v0, :cond_0

    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/km;->e:Z

    .line 97
    :goto_0
    iput-object p1, p0, Lcom/roidapp/photogrid/release/km;->g:[Ljava/lang/String;

    .line 98
    iput-object p2, p0, Lcom/roidapp/photogrid/release/km;->h:[Ljava/lang/String;

    .line 99
    iput-object p3, p0, Lcom/roidapp/photogrid/release/km;->i:[Ljava/lang/Integer;

    .line 101
    return-void

    .line 94
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/km;->e:Z

    goto :goto_0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 110
    const/4 v0, 0x2

    if-ne v0, p2, :cond_0

    .line 111
    const-string v0, "added"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/km;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d()V

    .line 115
    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/16 v2, 0x8

    .line 39
    const v0, 0x7f0300b7

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 1047
    const v0, 0x7f0d02e1

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/km;->a:Landroid/widget/LinearLayout;

    .line 1048
    const v0, 0x7f0d02e3

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/km;->b:Landroid/widget/LinearLayout;

    .line 1049
    const v0, 0x7f0d02e2

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/km;->c:Landroid/widget/ListView;

    .line 1052
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->a:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/roidapp/photogrid/release/kn;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/kn;-><init>(Lcom/roidapp/photogrid/release/km;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1063
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/km;->e:Z

    if-eqz v0, :cond_0

    .line 1064
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1065
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->c:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 1066
    new-instance v0, Lcom/roidapp/photogrid/release/bj;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/km;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/km;->g:[Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/km;->i:[Ljava/lang/Integer;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/km;->h:[Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/km;->c:Landroid/widget/ListView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/km;->f:Ljava/util/HashMap;

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/bj;-><init>(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/Integer;[Ljava/lang/String;Landroid/widget/ListView;Ljava/util/HashMap;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/km;->d:Lcom/roidapp/photogrid/release/bj;

    .line 1067
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/km;->d:Lcom/roidapp/photogrid/release/bj;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 41
    :goto_0
    return-object v7

    .line 1069
    :cond_0
    const v0, 0x7f0d02e4

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1071
    const v1, 0x7f0205d1

    :try_start_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 1075
    :goto_1
    new-instance v1, Lcom/roidapp/photogrid/release/ko;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ko;-><init>(Lcom/roidapp/photogrid/release/km;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1082
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V

    goto :goto_0

    .line 1073
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1
.end method

.method public final onDestroy()V
    .locals 4

    .prologue
    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->f:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 121
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 140
    :goto_0
    return-void

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 125
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->f:Ljava/util/HashMap;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 127
    if-eqz v0, :cond_1

    .line 128
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 129
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_1

    .line 130
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 132
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->clear()V

    .line 133
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 137
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/km;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 138
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/km;->f:Ljava/util/HashMap;

    .line 139
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    goto :goto_0
.end method
