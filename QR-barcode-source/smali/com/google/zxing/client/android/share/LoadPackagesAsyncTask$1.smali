.class Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask$1;
.super Landroid/widget/ArrayAdapter;
.source "LoadPackagesAsyncTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->onPostExecute(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/google/zxing/client/android/share/AppInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;

.field private final synthetic val$results:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;Landroid/content/Context;IILjava/util/List;Ljava/util/List;)V
    .locals 0
    .param p2, "$anonymous0"    # Landroid/content/Context;
    .param p3, "$anonymous1"    # I
    .param p4, "$anonymous2"    # I

    .prologue
    .line 1
    .local p5, "$anonymous3":Ljava/util/List;, "Ljava/util/List<Lcom/google/zxing/client/android/share/AppInfo;>;"
    iput-object p1, p0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask$1;->this$0:Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;

    iput-object p6, p0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask$1;->val$results:Ljava/util/List;

    .line 96
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 102
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 103
    .local v1, "view":Landroid/view/View;
    iget-object v2, p0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask$1;->val$results:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/zxing/client/android/share/AppInfo;

    invoke-virtual {v2}, Lcom/google/zxing/client/android/share/AppInfo;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 104
    .local v0, "icon":Landroid/graphics/drawable/Drawable;
    if-eqz v0, :cond_0

    .line 105
    sget v2, Lcom/google/zxing/client/android/R$id;->app_picker_list_item_icon:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 107
    :cond_0
    return-object v1
.end method
