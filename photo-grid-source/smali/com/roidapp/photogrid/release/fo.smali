.class public final Lcom/roidapp/photogrid/release/fo;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fo;)Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fo;->b:Landroid/content/SharedPreferences;

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 92
    if-ltz p1, :cond_0

    const/16 v0, 0xff

    if-le p1, v0, :cond_1

    .line 101
    :cond_0
    :goto_0
    return-void

    .line 95
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fo;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 96
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 97
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 98
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ra;->d(I)V

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fo;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 28
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fo;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 29
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fo;->b:Landroid/content/SharedPreferences;

    .line 30
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 31
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/16 v2, 0xff

    .line 34
    const v0, 0x7f0300bc

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 35
    new-instance v0, Lcom/roidapp/photogrid/release/fp;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/fp;-><init>(Lcom/roidapp/photogrid/release/fo;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    const v0, 0x7f0d02f9

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    const v0, 0x7f0d02fb

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    .line 1078
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fo;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v1

    .line 1079
    if-eqz v1, :cond_0

    instance-of v4, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v4, :cond_0

    .line 1080
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 1081
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->q()I

    move-result v1

    .line 45
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 46
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setKeyProgressIncrement(I)V

    .line 47
    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setMax(I)V

    .line 48
    const-string v1, "alpha"

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setTag(Ljava/lang/Object;)V

    .line 49
    new-instance v1, Lcom/roidapp/photogrid/release/fq;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/fq;-><init>(Lcom/roidapp/photogrid/release/fo;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 70
    return-object v3

    :cond_0
    move v1, v2

    .line 1083
    goto :goto_0
.end method
