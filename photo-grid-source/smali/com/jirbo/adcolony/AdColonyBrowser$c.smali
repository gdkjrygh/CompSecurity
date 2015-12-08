.class Lcom/jirbo/adcolony/AdColonyBrowser$c;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field a:Landroid/graphics/Paint;

.field b:Lcom/jirbo/adcolony/ADCImage;

.field c:Lcom/jirbo/adcolony/ADCImage;

.field final synthetic d:Lcom/jirbo/adcolony/AdColonyBrowser;


# direct methods
.method public constructor <init>(Lcom/jirbo/adcolony/AdColonyBrowser;Landroid/app/Activity;)V
    .locals 5

    .prologue
    .line 340
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->d:Lcom/jirbo/adcolony/AdColonyBrowser;

    .line 341
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 335
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->a:Landroid/graphics/Paint;

    .line 336
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "close_image_normal"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->b:Lcom/jirbo/adcolony/ADCImage;

    .line 337
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "close_image_down"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->c:Lcom/jirbo/adcolony/ADCImage;

    .line 345
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setLayerType"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/graphics/Paint;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 346
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 353
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->a:Landroid/graphics/Paint;

    const v1, -0x333334

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 354
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->a:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 355
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 356
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->a:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, -0x1000000

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 357
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 362
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->d:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    int-to-float v3, v0

    const/high16 v4, 0x41200000    # 10.0f

    iget-object v5, p0, Lcom/jirbo/adcolony/AdColonyBrowser$c;->a:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 365
    return-void
.end method
