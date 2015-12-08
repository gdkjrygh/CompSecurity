.class Lcom/arist/MusicPlayer/AboutActivity$1;
.super Ljava/lang/Object;
.source "AboutActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/AboutActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/AboutActivity;

.field private final synthetic val$inflater:Landroid/view/LayoutInflater;

.field private final synthetic val$skinRes:Landroid/content/res/TypedArray;

.field private final synthetic val$views:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/AboutActivity;Landroid/content/res/TypedArray;Landroid/view/LayoutInflater;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->this$0:Lcom/arist/MusicPlayer/AboutActivity;

    iput-object p2, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->val$skinRes:Landroid/content/res/TypedArray;

    iput-object p3, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->val$inflater:Landroid/view/LayoutInflater;

    iput-object p4, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->val$views:Ljava/util/ArrayList;

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 50
    const/4 v0, 0x2

    .local v0, "i":I
    :goto_0
    iget-object v3, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->val$skinRes:Landroid/content/res/TypedArray;

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 56
    iget-object v3, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->this$0:Lcom/arist/MusicPlayer/AboutActivity;

    # getter for: Lcom/arist/MusicPlayer/AboutActivity;->pagerAdapter:Lcom/arist/Adapter/MyPagerAdapter;
    invoke-static {v3}, Lcom/arist/MusicPlayer/AboutActivity;->access$0(Lcom/arist/MusicPlayer/AboutActivity;)Lcom/arist/Adapter/MyPagerAdapter;

    move-result-object v3

    iget-object v4, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->val$views:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Lcom/arist/Adapter/MyPagerAdapter;->changeData(Ljava/util/ArrayList;)V

    .line 57
    return-void

    .line 51
    :cond_0
    iget-object v3, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->val$inflater:Landroid/view/LayoutInflater;

    const v4, 0x7f030002

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 52
    .local v2, "v":Landroid/view/View;
    const v3, 0x7f0d0018

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 53
    .local v1, "iv":Landroid/widget/ImageView;
    iget-object v3, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->val$skinRes:Landroid/content/res/TypedArray;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 54
    iget-object v3, p0, Lcom/arist/MusicPlayer/AboutActivity$1;->val$views:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
