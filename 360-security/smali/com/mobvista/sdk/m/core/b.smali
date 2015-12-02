.class final Lcom/mobvista/sdk/m/core/b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/d/a/h;


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/b;->b:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/b;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 259
    return-void
.end method
