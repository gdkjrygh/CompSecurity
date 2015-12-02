.class Lcom/facebook/ads/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/ads/b;-><init>(Landroid/content/Context;Lcom/facebook/ads/NativeAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ads/b;


# direct methods
.method constructor <init>(Lcom/facebook/ads/b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/b$1;->a:Lcom/facebook/ads/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/b$1;->a:Lcom/facebook/ads/b;

    invoke-static {v0}, Lcom/facebook/ads/b;->a(Lcom/facebook/ads/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string/jumbo v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.category.BROWSABLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/ads/b$1;->a:Lcom/facebook/ads/b;

    invoke-static {v1}, Lcom/facebook/ads/b;->b(Lcom/facebook/ads/b;)Lcom/facebook/ads/NativeAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/ads/b$1;->a:Lcom/facebook/ads/b;

    invoke-static {v1}, Lcom/facebook/ads/b;->c(Lcom/facebook/ads/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/b$1;->a:Lcom/facebook/ads/b;

    invoke-static {v0}, Lcom/facebook/ads/b;->d(Lcom/facebook/ads/b;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
