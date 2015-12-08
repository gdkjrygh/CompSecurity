.class Lnet/coocent/android/xmlparser/GiftGridViewAdapter$1;
.super Ljava/lang/Object;
.source "GiftGridViewAdapter.java"

# interfaces
.implements Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/coocent/android/xmlparser/GiftGridViewAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/widget/GridView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

.field private final synthetic val$lvNetMusics:Landroid/widget/GridView;


# direct methods
.method constructor <init>(Lnet/coocent/android/xmlparser/GiftGridViewAdapter;Landroid/widget/GridView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$1;->this$0:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    iput-object p2, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$1;->val$lvNetMusics:Landroid/widget/GridView;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public imageLoaded(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 40
    iget-object v1, p0, Lnet/coocent/android/xmlparser/GiftGridViewAdapter$1;->val$lvNetMusics:Landroid/widget/GridView;

    invoke-virtual {v1, p1}, Landroid/widget/GridView;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 41
    .local v0, "iv":Landroid/widget/ImageView;
    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 43
    :cond_0
    return-void
.end method
