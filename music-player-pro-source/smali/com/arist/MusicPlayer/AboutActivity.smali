.class public Lcom/arist/MusicPlayer/AboutActivity;
.super Landroid/app/Activity;
.source "AboutActivity.java"


# instance fields
.field private pagerAdapter:Lcom/arist/Adapter/MyPagerAdapter;

.field private vpAbout:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/AboutActivity;)Lcom/arist/Adapter/MyPagerAdapter;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/arist/MusicPlayer/AboutActivity;->pagerAdapter:Lcom/arist/Adapter/MyPagerAdapter;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/16 v8, 0x400

    .line 27
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 29
    const/4 v7, 0x1

    invoke-virtual {p0, v7}, Lcom/arist/MusicPlayer/AboutActivity;->requestWindowFeature(I)Z

    .line 30
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/AboutActivity;->getWindow()Landroid/view/Window;

    move-result-object v7

    invoke-virtual {v7, v8, v8}, Landroid/view/Window;->setFlags(II)V

    .line 32
    const/high16 v7, 0x7f030000

    invoke-virtual {p0, v7}, Lcom/arist/MusicPlayer/AboutActivity;->setContentView(I)V

    .line 33
    const v7, 0x7f0d0017

    invoke-virtual {p0, v7}, Lcom/arist/MusicPlayer/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/support/v4/view/ViewPager;

    iput-object v7, p0, Lcom/arist/MusicPlayer/AboutActivity;->vpAbout:Landroid/support/v4/view/ViewPager;

    .line 34
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 35
    .local v2, "inflater":Landroid/view/LayoutInflater;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .local v6, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/AboutActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0b0006

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 38
    .local v4, "skinRes":Landroid/content/res/TypedArray;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/4 v7, 0x2

    if-lt v1, v7, :cond_0

    .line 44
    new-instance v7, Lcom/arist/Adapter/MyPagerAdapter;

    invoke-direct {v7, v6}, Lcom/arist/Adapter/MyPagerAdapter;-><init>(Ljava/util/ArrayList;)V

    iput-object v7, p0, Lcom/arist/MusicPlayer/AboutActivity;->pagerAdapter:Lcom/arist/Adapter/MyPagerAdapter;

    .line 45
    iget-object v7, p0, Lcom/arist/MusicPlayer/AboutActivity;->vpAbout:Landroid/support/v4/view/ViewPager;

    iget-object v8, p0, Lcom/arist/MusicPlayer/AboutActivity;->pagerAdapter:Lcom/arist/Adapter/MyPagerAdapter;

    invoke-virtual {v7, v8}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 47
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 48
    .local v0, "handler":Landroid/os/Handler;
    new-instance v7, Lcom/arist/MusicPlayer/AboutActivity$1;

    invoke-direct {v7, p0, v4, v2, v6}, Lcom/arist/MusicPlayer/AboutActivity$1;-><init>(Lcom/arist/MusicPlayer/AboutActivity;Landroid/content/res/TypedArray;Landroid/view/LayoutInflater;Ljava/util/ArrayList;)V

    .line 58
    const-wide/16 v8, 0xc8

    .line 48
    invoke-virtual {v0, v7, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 59
    return-void

    .line 39
    .end local v0    # "handler":Landroid/os/Handler;
    :cond_0
    const v7, 0x7f030002

    const/4 v8, 0x0

    invoke-virtual {v2, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 40
    .local v5, "v":Landroid/view/View;
    const v7, 0x7f0d0018

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 41
    .local v3, "iv":Landroid/widget/ImageView;
    const/4 v7, 0x0

    invoke-virtual {v4, v1, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 42
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method
