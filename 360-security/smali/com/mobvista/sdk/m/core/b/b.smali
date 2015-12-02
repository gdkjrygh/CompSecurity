.class final Lcom/mobvista/sdk/m/core/b/b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/d/a/h;


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/mobvista/sdk/m/core/b/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/b/a;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/b/b;->b:Lcom/mobvista/sdk/m/core/b/a;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/b/b;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/b;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/b;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 165
    :cond_0
    return-void
.end method
