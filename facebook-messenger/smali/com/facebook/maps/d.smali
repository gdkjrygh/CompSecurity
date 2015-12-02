.class public Lcom/facebook/maps/d;
.super Lcom/google/android/maps/MapActivity;
.source "GoogleEmbeddableMapActivity.java"


# instance fields
.field private a:Landroid/widget/FrameLayout;

.field private b:Lcom/facebook/maps/a;

.field private c:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/google/android/maps/MapActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/maps/a;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/maps/d;->b:Lcom/facebook/maps/a;

    return-object v0
.end method

.method public isRouteDisplayed()Z
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x0

    return v0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/maps/d;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 44
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 22
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreate(Landroid/os/Bundle;)V

    .line 23
    invoke-virtual {p0}, Lcom/facebook/maps/d;->getParent()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/maps/d;->c:Landroid/app/Activity;

    .line 24
    invoke-virtual {p0}, Lcom/facebook/maps/d;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "API_KEY"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 26
    sget v0, Lcom/facebook/k;->embeddable_map:I

    invoke-virtual {p0, v0}, Lcom/facebook/maps/d;->setContentView(I)V

    .line 27
    sget v0, Lcom/facebook/i;->embeddable_map_frame:I

    invoke-virtual {p0, v0}, Lcom/facebook/maps/d;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/maps/d;->a:Landroid/widget/FrameLayout;

    .line 28
    new-instance v0, Lcom/facebook/maps/a;

    invoke-direct {v0, p0, v1}, Lcom/facebook/maps/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/maps/d;->b:Lcom/facebook/maps/a;

    .line 29
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 33
    iget-object v1, p0, Lcom/facebook/maps/d;->b:Lcom/facebook/maps/a;

    invoke-virtual {v1, v0}, Lcom/facebook/maps/a;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    iget-object v0, p0, Lcom/facebook/maps/d;->a:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/maps/d;->b:Lcom/facebook/maps/a;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 35
    return-void
.end method
