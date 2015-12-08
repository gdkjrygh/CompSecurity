.class public Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$ScrollViewParallaxedItem;
.super Lcom/nirhart/parallaxscroll/views/ParallaxedView;
.source "ParallaxScrollView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "ScrollViewParallaxedItem"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;


# direct methods
.method public constructor <init>(Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;Landroid/view/View;)V
    .locals 0
    .param p1, "this$0"    # Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;
    .param p2, "view"    # Landroid/view/View;

    .prologue
    .line 115
    iput-object p1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$ScrollViewParallaxedItem;->this$0:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    .line 116
    invoke-direct {p0, p2}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;-><init>(Landroid/view/View;)V

    .line 117
    return-void
.end method


# virtual methods
.method protected translatePreICS(Landroid/view/View;F)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "offset"    # F

    .prologue
    .line 121
    float-to-int v0, p2

    iget v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$ScrollViewParallaxedItem;->lastOffset:I

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 122
    float-to-int v0, p2

    iput v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$ScrollViewParallaxedItem;->lastOffset:I

    .line 123
    return-void
.end method
