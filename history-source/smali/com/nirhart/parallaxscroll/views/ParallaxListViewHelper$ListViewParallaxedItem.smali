.class public Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper$ListViewParallaxedItem;
.super Lcom/nirhart/parallaxscroll/views/ParallaxedView;
.source "ParallaxListViewHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "ListViewParallaxedItem"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;


# direct methods
.method public constructor <init>(Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;Landroid/view/View;)V
    .locals 0
    .param p1, "this$0"    # Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;
    .param p2, "view"    # Landroid/view/View;

    .prologue
    .line 126
    iput-object p1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper$ListViewParallaxedItem;->this$0:Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;

    .line 127
    invoke-direct {p0, p2}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;-><init>(Landroid/view/View;)V

    .line 128
    return-void
.end method


# virtual methods
.method protected translatePreICS(Landroid/view/View;F)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "offset"    # F

    .prologue
    const/4 v1, 0x0

    .line 132
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    invoke-direct {v0, v1, v1, p2, p2}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    invoke-virtual {p0, v0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper$ListViewParallaxedItem;->addAnimation(Landroid/view/animation/Animation;)V

    .line 133
    return-void
.end method
