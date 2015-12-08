.class public Lcom/arist/MusicPlayer/SkinSetting;
.super Landroid/app/Activity;
.source "SkinSetting.java"


# instance fields
.field private adapter:Lcom/arist/Adapter/SkinAdapter;

.field private gridView:Landroid/widget/GridView;

.field private layout:Landroid/widget/LinearLayout;

.field private skins:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Skin;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/SkinSetting;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->layout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$1(Lcom/arist/MusicPlayer/SkinSetting;)Lcom/arist/Adapter/SkinAdapter;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->adapter:Lcom/arist/Adapter/SkinAdapter;

    return-object v0
.end method

.method private initData()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Recycle"
        }
    .end annotation

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/SkinSetting;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 37
    const v4, 0x7f0b0006

    .line 36
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 38
    .local v2, "skinRes":Landroid/content/res/TypedArray;
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/arist/MusicPlayer/SkinSetting;->skins:Ljava/util/ArrayList;

    .line 39
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 45
    return-void

    .line 40
    :cond_0
    new-instance v1, Lcom/arist/entity/Skin;

    invoke-direct {v1}, Lcom/arist/entity/Skin;-><init>()V

    .line 41
    .local v1, "skin":Lcom/arist/entity/Skin;
    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/arist/entity/Skin;->setResId(I)V

    .line 43
    iget-object v3, p0, Lcom/arist/MusicPlayer/SkinSetting;->skins:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v2, 0x1

    .line 49
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/SkinSetting;->requestWindowFeature(I)Z

    .line 51
    const v0, 0x7f03000d

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/SkinSetting;->setContentView(I)V

    .line 52
    const v0, 0x7f0d004a

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/SkinSetting;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->gridView:Landroid/widget/GridView;

    .line 53
    const v0, 0x7f0d0046

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/SkinSetting;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->layout:Landroid/widget/LinearLayout;

    .line 54
    invoke-direct {p0}, Lcom/arist/MusicPlayer/SkinSetting;->initData()V

    .line 55
    new-instance v0, Lcom/arist/Adapter/SkinAdapter;

    iget-object v1, p0, Lcom/arist/MusicPlayer/SkinSetting;->skins:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/arist/Adapter/SkinAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->adapter:Lcom/arist/Adapter/SkinAdapter;

    .line 56
    iget-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->gridView:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/arist/MusicPlayer/SkinSetting;->adapter:Lcom/arist/Adapter/SkinAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 57
    iget-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->gridView:Landroid/widget/GridView;

    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setFocusable(Z)V

    .line 58
    iget-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->gridView:Landroid/widget/GridView;

    new-instance v1, Lcom/arist/MusicPlayer/SkinSetting$1;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/SkinSetting$1;-><init>(Lcom/arist/MusicPlayer/SkinSetting;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 74
    const v0, 0x7f0d0048

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/SkinSetting;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/arist/MusicPlayer/SkinSetting$2;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/SkinSetting$2;-><init>(Lcom/arist/MusicPlayer/SkinSetting;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 85
    iget-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting;->layout:Landroid/widget/LinearLayout;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getWallpaperId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 86
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 87
    return-void
.end method
