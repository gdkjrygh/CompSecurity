.class final Lcom/mobvista/sdk/m/b/b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/d/a/h;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/b/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/b/a;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/mobvista/sdk/m/b/b;->a:Lcom/mobvista/sdk/m/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/b;->a:Lcom/mobvista/sdk/m/b/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/b/a;->a(Lcom/mobvista/sdk/m/b/a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/b;->a:Lcom/mobvista/sdk/m/b/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/b/a;->a(Lcom/mobvista/sdk/m/b/a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 51
    :cond_0
    return-void
.end method
