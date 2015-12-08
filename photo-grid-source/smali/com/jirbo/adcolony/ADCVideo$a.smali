.class Lcom/jirbo/adcolony/ADCVideo$a;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field a:Landroid/graphics/Rect;

.field final synthetic b:Lcom/jirbo/adcolony/ADCVideo;


# direct methods
.method public constructor <init>(Lcom/jirbo/adcolony/ADCVideo;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 663
    iput-object p1, p0, Lcom/jirbo/adcolony/ADCVideo$a;->b:Lcom/jirbo/adcolony/ADCVideo;

    .line 664
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 660
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo$a;->a:Landroid/graphics/Rect;

    .line 665
    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 669
    const/16 v0, 0xff

    invoke-virtual {p1, v0, v1, v1, v1}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 670
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo$a;->a:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo$a;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 671
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo$a;->b:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->R:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo$a;->a:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ADCVideo$a;->b:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCVideo;->R:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/jirbo/adcolony/ADCVideo$a;->a:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/ADCVideo$a;->b:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v3, v3, Lcom/jirbo/adcolony/ADCVideo;->R:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 672
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo$a;->invalidate()V

    .line 673
    return-void
.end method
