.class Lcom/arist/MusicPlayer/SkinSetting$1;
.super Ljava/lang/Object;
.source "SkinSetting.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/SkinSetting;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/SkinSetting;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/SkinSetting;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/SkinSetting$1;->this$0:Lcom/arist/MusicPlayer/SkinSetting;

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
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
    .line 61
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    long-to-int v2, p4

    .line 64
    .local v2, "resId":I
    iget-object v3, p0, Lcom/arist/MusicPlayer/SkinSetting$1;->this$0:Lcom/arist/MusicPlayer/SkinSetting;

    invoke-virtual {v3}, Lcom/arist/MusicPlayer/SkinSetting;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/arist/util/BitmapService;->readBitMap(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 65
    .local v1, "bmp":Landroid/graphics/Bitmap;
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 66
    .local v0, "bd":Landroid/graphics/drawable/BitmapDrawable;
    iget-object v3, p0, Lcom/arist/MusicPlayer/SkinSetting$1;->this$0:Lcom/arist/MusicPlayer/SkinSetting;

    # getter for: Lcom/arist/MusicPlayer/SkinSetting;->layout:Landroid/widget/LinearLayout;
    invoke-static {v3}, Lcom/arist/MusicPlayer/SkinSetting;->access$0(Lcom/arist/MusicPlayer/SkinSetting;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    invoke-static {v2}, Lcom/arist/MusicPlayer/MyApplication;->setWallpaperId(I)V

    .line 69
    iget-object v3, p0, Lcom/arist/MusicPlayer/SkinSetting$1;->this$0:Lcom/arist/MusicPlayer/SkinSetting;

    # getter for: Lcom/arist/MusicPlayer/SkinSetting;->adapter:Lcom/arist/Adapter/SkinAdapter;
    invoke-static {v3}, Lcom/arist/MusicPlayer/SkinSetting;->access$1(Lcom/arist/MusicPlayer/SkinSetting;)Lcom/arist/Adapter/SkinAdapter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/arist/Adapter/SkinAdapter;->notifyDataSetChanged()V

    .line 71
    return-void
.end method
