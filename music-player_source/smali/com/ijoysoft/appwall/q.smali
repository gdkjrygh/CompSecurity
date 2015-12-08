.class final Lcom/ijoysoft/appwall/q;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ijoysoft/appwall/g;


# instance fields
.field final synthetic a:Lcom/ijoysoft/appwall/p;

.field private final synthetic b:Landroid/widget/GridView;


# direct methods
.method constructor <init>(Lcom/ijoysoft/appwall/p;Landroid/widget/GridView;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/q;->a:Lcom/ijoysoft/appwall/p;

    iput-object p2, p0, Lcom/ijoysoft/appwall/q;->b:Landroid/widget/GridView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/q;->b:Landroid/widget/GridView;

    invoke-virtual {v0, p1}, Landroid/widget/GridView;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method
