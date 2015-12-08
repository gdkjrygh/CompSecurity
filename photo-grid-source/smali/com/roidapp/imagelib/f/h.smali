.class final Lcom/roidapp/imagelib/f/h;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"


# instance fields
.field a:Landroid/graphics/Picture;

.field b:Landroid/graphics/Canvas;

.field c:Landroid/graphics/Paint;

.field d:Landroid/graphics/RectF;

.field e:Landroid/graphics/RectF;

.field f:Landroid/graphics/Path;

.field g:Landroid/graphics/RectF;

.field h:Ljava/lang/Integer;

.field i:Ljava/lang/Integer;

.field j:Z

.field k:Z

.field l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/Shader;",
            ">;"
        }
    .end annotation
.end field

.field m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/roidapp/imagelib/f/e;",
            ">;"
        }
    .end annotation
.end field

.field n:Lcom/roidapp/imagelib/f/e;

.field private o:Z

.field private p:I

.field private q:Z


# direct methods
.method private constructor <init>(Landroid/graphics/Picture;)V
    .locals 5

    .prologue
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v3, -0x800000    # Float.NEGATIVE_INFINITY

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 786
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 770
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    .line 771
    iput-object v2, p0, Lcom/roidapp/imagelib/f/h;->e:Landroid/graphics/RectF;

    .line 772
    iput-object v2, p0, Lcom/roidapp/imagelib/f/h;->f:Landroid/graphics/Path;

    .line 773
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, v4, v4, v3, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    .line 775
    iput-object v2, p0, Lcom/roidapp/imagelib/f/h;->h:Ljava/lang/Integer;

    .line 776
    iput-object v2, p0, Lcom/roidapp/imagelib/f/h;->i:Ljava/lang/Integer;

    .line 778
    iput-boolean v1, p0, Lcom/roidapp/imagelib/f/h;->j:Z

    .line 780
    iput-boolean v1, p0, Lcom/roidapp/imagelib/f/h;->k:Z

    .line 782
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    .line 783
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->m:Ljava/util/HashMap;

    .line 784
    iput-object v2, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    .line 936
    iput-boolean v1, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    .line 937
    iput v1, p0, Lcom/roidapp/imagelib/f/h;->p:I

    .line 938
    iput-boolean v1, p0, Lcom/roidapp/imagelib/f/h;->q:Z

    .line 787
    iput-object p1, p0, Lcom/roidapp/imagelib/f/h;->a:Landroid/graphics/Picture;

    .line 788
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    .line 789
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 790
    return-void
.end method

.method synthetic constructor <init>(Landroid/graphics/Picture;B)V
    .locals 0

    .prologue
    .line 764
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/f/h;-><init>(Landroid/graphics/Picture;)V

    return-void
.end method

.method private static a(ZLorg/xml/sax/Attributes;)Lcom/roidapp/imagelib/f/e;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 892
    new-instance v1, Lcom/roidapp/imagelib/f/e;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lcom/roidapp/imagelib/f/e;-><init>(B)V

    .line 893
    const-string v0, "id"

    invoke-static {v0, p1}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    .line 894
    iput-boolean p0, v1, Lcom/roidapp/imagelib/f/e;->c:Z

    .line 895
    if-eqz p0, :cond_3

    .line 896
    const-string v0, "x1"

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/f/e;->d:F

    .line 897
    const-string v0, "x2"

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/f/e;->f:F

    .line 898
    const-string v0, "y1"

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/f/e;->e:F

    .line 899
    const-string v0, "y2"

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/f/e;->g:F

    .line 905
    :goto_0
    const-string v0, "gradientTransform"

    invoke-static {v0, p1}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    .line 906
    if-eqz v0, :cond_0

    .line 907
    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    .line 909
    :cond_0
    const-string v0, "href"

    invoke-static {v0, p1}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    .line 910
    if-eqz v0, :cond_2

    .line 911
    const-string v2, "#"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 912
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 914
    :cond_1
    iput-object v0, v1, Lcom/roidapp/imagelib/f/e;->b:Ljava/lang/String;

    .line 916
    :cond_2
    return-object v1

    .line 901
    :cond_3
    const-string v0, "cx"

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/f/e;->h:F

    .line 902
    const-string v0, "cy"

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/f/e;->i:F

    .line 903
    const-string v0, "r"

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/f/e;->j:F

    goto :goto_0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 977
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->k:Z

    if-eqz v0, :cond_0

    .line 978
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 980
    :cond_0
    return-void
.end method

.method private a(FF)V
    .locals 1

    .prologue
    .line 941
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 942
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->left:F

    .line 944
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 945
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->right:F

    .line 947
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    cmpg-float v0, p2, v0

    if-gez v0, :cond_2

    .line 948
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iput p2, v0, Landroid/graphics/RectF;->top:F

    .line 950
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, p2, v0

    if-lez v0, :cond_3

    .line 951
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iput p2, v0, Landroid/graphics/RectF;->bottom:F

    .line 953
    :cond_3
    return-void
.end method

.method private a(Landroid/graphics/Path;)V
    .locals 2

    .prologue
    .line 961
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 962
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 963
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 964
    return-void
.end method

.method private a(Lcom/roidapp/imagelib/f/g;Ljava/lang/Integer;Z)V
    .locals 3

    .prologue
    .line 920
    const v0, 0xffffff

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    and-int/2addr v0, v1

    const/high16 v1, -0x1000000

    or-int/2addr v0, v1

    .line 921
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->h:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->h:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_0

    .line 922
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 924
    :cond_0
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 925
    const-string v0, "opacity"

    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->c(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    .line 926
    if-nez v0, :cond_1

    .line 927
    if-eqz p3, :cond_2

    const-string v0, "fill-opacity"

    :goto_0
    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->c(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    .line 929
    :cond_1
    if-nez v0, :cond_3

    .line 930
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 934
    :goto_1
    return-void

    .line 927
    :cond_2
    const-string v0, "stroke-opacity"

    goto :goto_0

    .line 932
    :cond_3
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    const/high16 v2, 0x437f0000    # 255.0f

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_1
.end method

.method private a(Lorg/xml/sax/Attributes;)V
    .locals 2

    .prologue
    .line 967
    const-string v0, "transform"

    invoke-static {v0, p1}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v1

    .line 968
    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->k:Z

    .line 969
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->k:Z

    if-eqz v0, :cond_0

    .line 970
    invoke-static {v1}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v0

    .line 971
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 972
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 974
    :cond_0
    return-void

    .line 968
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/roidapp/imagelib/f/g;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 852
    iget-boolean v1, p0, Lcom/roidapp/imagelib/f/h;->j:Z

    if-eqz v1, :cond_1

    .line 888
    :cond_0
    :goto_0
    return v0

    .line 856
    :cond_1
    const-string v1, "none"

    const-string v2, "display"

    .line 5724
    invoke-virtual {p1, v2}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 856
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 859
    const-string v1, "stroke"

    invoke-virtual {p1, v1}, Lcom/roidapp/imagelib/f/g;->b(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    .line 860
    if-eqz v1, :cond_0

    .line 861
    invoke-direct {p0, p1, v1, v0}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;Ljava/lang/Integer;Z)V

    .line 863
    const-string v0, "stroke-width"

    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->c(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    .line 866
    if-eqz v0, :cond_2

    .line 867
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 869
    :cond_2
    const-string v0, "stroke-linecap"

    .line 6724
    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 870
    const-string v1, "round"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 871
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 877
    :cond_3
    :goto_1
    const-string v0, "stroke-linejoin"

    .line 7724
    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 878
    const-string v1, "miter"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 879
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 885
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 886
    const/4 v0, 0x1

    goto :goto_0

    .line 872
    :cond_5
    const-string v1, "square"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 873
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_1

    .line 874
    :cond_6
    const-string v1, "butt"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 875
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_1

    .line 880
    :cond_7
    const-string v1, "round"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 881
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    goto :goto_2

    .line 882
    :cond_8
    const-string v1, "bevel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 883
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    goto :goto_2
.end method

.method private a(Lcom/roidapp/imagelib/f/g;Ljava/util/HashMap;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/imagelib/f/g;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/Shader;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 812
    const-string v0, "none"

    const-string v3, "display"

    .line 1724
    invoke-virtual {p1, v3}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 812
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 848
    :goto_0
    return v0

    .line 815
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->j:Z

    if-eqz v0, :cond_1

    .line 816
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 817
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move v0, v2

    .line 818
    goto :goto_0

    .line 820
    :cond_1
    const-string v0, "fill"

    .line 2724
    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 821
    if-eqz v0, :cond_3

    const-string v3, "url(#"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 823
    const/4 v3, 0x5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 824
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Shader;

    .line 825
    if-eqz v0, :cond_2

    .line 827
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 828
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move v0, v2

    .line 829
    goto :goto_0

    :cond_2
    move v0, v1

    .line 832
    goto :goto_0

    .line 835
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 836
    const-string v0, "fill"

    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->b(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 837
    if-eqz v0, :cond_4

    .line 838
    invoke-direct {p0, p1, v0, v2}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;Ljava/lang/Integer;Z)V

    .line 839
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move v0, v2

    .line 840
    goto :goto_0

    .line 841
    :cond_4
    const-string v0, "fill"

    .line 3724
    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 841
    if-nez v0, :cond_5

    const-string v0, "stroke"

    .line 4724
    invoke-virtual {p1, v0}, Lcom/roidapp/imagelib/f/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 841
    if-nez v0, :cond_5

    .line 843
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 844
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move v0, v2

    .line 845
    goto :goto_0

    :cond_5
    move v0, v1

    .line 848
    goto/16 :goto_0
.end method


# virtual methods
.method public final characters([CII)V
    .locals 0

    .prologue
    .line 1174
    return-void
.end method

.method public final endDocument()V
    .locals 0

    .prologue
    .line 809
    return-void
.end method

.method public final endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 1179
    const-string v0, "svg"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1180
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->a:Landroid/graphics/Picture;

    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    .line 1251
    :cond_0
    :goto_0
    return-void

    .line 1181
    :cond_1
    const-string v0, "linearGradient"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1182
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1183
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 1184
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->m:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/f/e;

    .line 1185
    if-eqz v0, :cond_2

    .line 1186
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/f/e;->a(Lcom/roidapp/imagelib/f/e;)Lcom/roidapp/imagelib/f/e;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    .line 1189
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v5, v0, [I

    move v1, v2

    .line 1190
    :goto_1
    array-length v0, v5

    if-ge v1, v0, :cond_3

    .line 1191
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v5, v1

    .line 1190
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1193
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v6, v0, [F

    .line 1194
    :goto_2
    array-length v0, v6

    if-ge v2, v0, :cond_4

    .line 1195
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v6, v2

    .line 1194
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 1200
    :cond_4
    new-instance v0, Landroid/graphics/LinearGradient;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget v1, v1, Lcom/roidapp/imagelib/f/e;->d:F

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget v2, v2, Lcom/roidapp/imagelib/f/e;->e:F

    iget-object v3, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget v3, v3, Lcom/roidapp/imagelib/f/e;->f:F

    iget-object v4, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget v4, v4, Lcom/roidapp/imagelib/f/e;->g:F

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 1201
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    if-eqz v1, :cond_5

    .line 1202
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/LinearGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 1204
    :cond_5
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v2, v2, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1205
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->m:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 1207
    :cond_6
    const-string v0, "radialGradient"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1208
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1209
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->b:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 1210
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->m:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/f/e;

    .line 1211
    if-eqz v0, :cond_7

    .line 1212
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/f/e;->a(Lcom/roidapp/imagelib/f/e;)Lcom/roidapp/imagelib/f/e;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    .line 1215
    :cond_7
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v4, v0, [I

    move v1, v2

    .line 1216
    :goto_3
    array-length v0, v4

    if-ge v1, v0, :cond_8

    .line 1217
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v4, v1

    .line 1216
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 1219
    :cond_8
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v5, v0, [F

    .line 1220
    :goto_4
    array-length v0, v5

    if-ge v2, v0, :cond_9

    .line 1221
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v5, v2

    .line 1220
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 1223
    :cond_9
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v0, v0, Lcom/roidapp/imagelib/f/e;->b:Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 1224
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->m:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/f/e;

    .line 1225
    if-eqz v0, :cond_a

    .line 1226
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/f/e;->a(Lcom/roidapp/imagelib/f/e;)Lcom/roidapp/imagelib/f/e;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    .line 1229
    :cond_a
    new-instance v0, Landroid/graphics/RadialGradient;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget v1, v1, Lcom/roidapp/imagelib/f/e;->h:F

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget v2, v2, Lcom/roidapp/imagelib/f/e;->i:F

    iget-object v3, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget v3, v3, Lcom/roidapp/imagelib/f/e;->j:F

    sget-object v6, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v6}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 1230
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    if-eqz v1, :cond_b

    .line 1231
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/RadialGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 1233
    :cond_b
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v2, v2, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1234
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->m:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 1236
    :cond_c
    const-string v0, "g"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1237
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->q:Z

    if-eqz v0, :cond_d

    .line 1238
    iput-boolean v2, p0, Lcom/roidapp/imagelib/f/h;->q:Z

    .line 1241
    :cond_d
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-eqz v0, :cond_e

    .line 1242
    iget v0, p0, Lcom/roidapp/imagelib/f/h;->p:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/f/h;->p:I

    .line 1244
    iget v0, p0, Lcom/roidapp/imagelib/f/h;->p:I

    if-nez v0, :cond_e

    .line 1245
    iput-boolean v2, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    .line 1249
    :cond_e
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    goto/16 :goto_0
.end method

.method public final startDocument()V
    .locals 0

    .prologue
    .line 804
    return-void
.end method

.method public final startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 11

    .prologue
    const/16 v7, 0x10

    const/high16 v1, -0x1000000

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 985
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    const/16 v2, 0xff

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 987
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->q:Z

    if-eqz v0, :cond_3

    .line 988
    const-string v0, "rect"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 989
    const-string v0, "x"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v0

    .line 990
    if-nez v0, :cond_0

    .line 991
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 993
    :cond_0
    const-string v1, "y"

    invoke-static {v1, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    .line 994
    if-nez v1, :cond_1

    .line 995
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 997
    :cond_1
    const-string v2, "width"

    invoke-static {v2, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v2

    .line 998
    const-string v3, "height"

    invoke-static {v3, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    .line 999
    new-instance v3, Landroid/graphics/RectF;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v6

    add-float/2addr v0, v6

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v1, v2

    invoke-direct {v3, v4, v5, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v3, p0, Lcom/roidapp/imagelib/f/h;->e:Landroid/graphics/RectF;

    .line 1169
    :cond_2
    :goto_0
    return-void

    .line 1003
    :cond_3
    const-string v0, "svg"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1004
    const-string v0, "width"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 1005
    const-string v1, "height"

    invoke-static {v1, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v1, v2

    .line 1006
    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->a:Landroid/graphics/Picture;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    goto :goto_0

    .line 1007
    :cond_4
    const-string v0, "defs"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1009
    const-string v0, "linearGradient"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1010
    invoke-static {v6, p4}, Lcom/roidapp/imagelib/f/h;->a(ZLorg/xml/sax/Attributes;)Lcom/roidapp/imagelib/f/e;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    goto :goto_0

    .line 1011
    :cond_5
    const-string v0, "radialGradient"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1012
    invoke-static {v5, p4}, Lcom/roidapp/imagelib/f/h;->a(ZLorg/xml/sax/Attributes;)Lcom/roidapp/imagelib/f/e;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    goto :goto_0

    .line 1013
    :cond_6
    const-string v0, "stop"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1014
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    if-eqz v0, :cond_2

    .line 1015
    const-string v0, "offset"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 1016
    const-string v0, "style"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    .line 1017
    new-instance v3, Lcom/roidapp/imagelib/f/i;

    invoke-direct {v3, v0, v5}, Lcom/roidapp/imagelib/f/i;-><init>(Ljava/lang/String;B)V

    .line 1018
    const-string v0, "stop-color"

    invoke-virtual {v3, v0}, Lcom/roidapp/imagelib/f/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1020
    if-eqz v0, :cond_21

    .line 1021
    const-string v4, "#"

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 1022
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 1027
    :goto_1
    const-string v4, "stop-opacity"

    invoke-virtual {v3, v4}, Lcom/roidapp/imagelib/f/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1028
    if-eqz v3, :cond_8

    .line 1029
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    .line 1030
    const/high16 v3, 0x437f0000    # 255.0f

    mul-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 1031
    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    .line 1035
    :goto_2
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->k:Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1036
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->n:Lcom/roidapp/imagelib/f/e;

    iget-object v1, v1, Lcom/roidapp/imagelib/f/e;->l:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1024
    :cond_7
    invoke-static {v0, v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_1

    .line 1033
    :cond_8
    or-int/2addr v0, v1

    goto :goto_2

    .line 1038
    :cond_9
    const-string v0, "g"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1040
    const-string v0, "bounds"

    const-string v1, "id"

    invoke-static {v1, p4}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1041
    iput-boolean v6, p0, Lcom/roidapp/imagelib/f/h;->q:Z

    .line 1043
    :cond_a
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-eqz v0, :cond_b

    .line 1044
    iget v0, p0, Lcom/roidapp/imagelib/f/h;->p:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/imagelib/f/h;->p:I

    .line 1048
    :cond_b
    const-string v0, "none"

    const-string v1, "display"

    invoke-static {v1, p4}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1049
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-nez v0, :cond_2

    .line 1050
    iput-boolean v6, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    .line 1051
    iput v6, p0, Lcom/roidapp/imagelib/f/h;->p:I

    goto/16 :goto_0

    .line 1055
    :cond_c
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-nez v0, :cond_f

    const-string v0, "rect"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1056
    const-string v0, "x"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v0

    .line 1057
    if-nez v0, :cond_20

    .line 1058
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v6, v0

    .line 1060
    :goto_3
    const-string v0, "y"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v0

    .line 1061
    if-nez v0, :cond_1f

    .line 1062
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v7, v0

    .line 1064
    :goto_4
    const-string v0, "width"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v8

    .line 1065
    const-string v0, "height"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v9

    .line 1066
    invoke-direct {p0, p4}, Lcom/roidapp/imagelib/f/h;->a(Lorg/xml/sax/Attributes;)V

    .line 1067
    new-instance v10, Lcom/roidapp/imagelib/f/g;

    invoke-direct {v10, p4, v5}, Lcom/roidapp/imagelib/f/g;-><init>(Lorg/xml/sax/Attributes;B)V

    .line 1068
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    invoke-direct {p0, v10, v0}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;Ljava/util/HashMap;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1069
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 7956
    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 7957
    add-float/2addr v0, v2

    add-float/2addr v1, v3

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 1070
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v3, v4

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v5

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1072
    :cond_d
    invoke-direct {p0, v10}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1073
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v3, v4

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v5

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1075
    :cond_e
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/h;->a()V

    goto/16 :goto_0

    .line 1076
    :cond_f
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-nez v0, :cond_10

    const-string v0, "line"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1077
    const-string v0, "x1"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    .line 1078
    const-string v0, "x2"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v3

    .line 1079
    const-string v0, "y1"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v2

    .line 1080
    const-string v0, "y2"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v4

    .line 1081
    new-instance v0, Lcom/roidapp/imagelib/f/g;

    invoke-direct {v0, p4, v5}, Lcom/roidapp/imagelib/f/g;-><init>(Lorg/xml/sax/Attributes;B)V

    .line 1082
    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1083
    invoke-direct {p0, p4}, Lcom/roidapp/imagelib/f/h;->a(Lorg/xml/sax/Attributes;)V

    .line 1084
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-direct {p0, v0, v5}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 1085
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-direct {p0, v0, v5}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 1086
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    iget-object v5, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 1087
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/h;->a()V

    goto/16 :goto_0

    .line 1089
    :cond_10
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-nez v0, :cond_13

    const-string v0, "circle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1090
    const-string v0, "cx"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v0

    .line 1091
    const-string v1, "cy"

    invoke-static {v1, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    .line 1092
    const-string v2, "r"

    invoke-static {v2, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v2

    .line 1093
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    .line 1094
    invoke-direct {p0, p4}, Lcom/roidapp/imagelib/f/h;->a(Lorg/xml/sax/Attributes;)V

    .line 1095
    new-instance v3, Lcom/roidapp/imagelib/f/g;

    invoke-direct {v3, p4, v5}, Lcom/roidapp/imagelib/f/g;-><init>(Lorg/xml/sax/Attributes;B)V

    .line 1096
    iget-object v4, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    invoke-direct {p0, v3, v4}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;Ljava/util/HashMap;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 1097
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v5

    sub-float/2addr v4, v5

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v6

    sub-float/2addr v5, v6

    invoke-direct {p0, v4, v5}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 1098
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v5

    add-float/2addr v4, v5

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v6

    add-float/2addr v5, v6

    invoke-direct {p0, v4, v5}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 1099
    iget-object v4, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v7

    iget-object v8, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1101
    :cond_11
    invoke-direct {p0, v3}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 1102
    iget-object v3, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iget-object v4, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v3, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1104
    :cond_12
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/h;->a()V

    goto/16 :goto_0

    .line 1106
    :cond_13
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-nez v0, :cond_16

    const-string v0, "ellipse"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1107
    const-string v0, "cx"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v0

    .line 1108
    const-string v1, "cy"

    invoke-static {v1, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    .line 1109
    const-string v2, "rx"

    invoke-static {v2, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v2

    .line 1110
    const-string v3, "ry"

    invoke-static {v3, p4}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v3

    .line 1111
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    .line 1112
    invoke-direct {p0, p4}, Lcom/roidapp/imagelib/f/h;->a(Lorg/xml/sax/Attributes;)V

    .line 1113
    new-instance v4, Lcom/roidapp/imagelib/f/g;

    invoke-direct {v4, p4, v5}, Lcom/roidapp/imagelib/f/g;-><init>(Lorg/xml/sax/Attributes;B)V

    .line 1114
    iget-object v5, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v7

    sub-float/2addr v6, v7

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v8

    sub-float/2addr v7, v8

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v9

    add-float/2addr v8, v9

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v9

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v10

    add-float/2addr v9, v10

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1115
    iget-object v5, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    invoke-direct {p0, v4, v5}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;Ljava/util/HashMap;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 1116
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v6

    sub-float/2addr v5, v6

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v7

    sub-float/2addr v6, v7

    invoke-direct {p0, v5, v6}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 1117
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v0, v2

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v1, v2

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/f/h;->a(FF)V

    .line 1118
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1120
    :cond_14
    invoke-direct {p0, v4}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1121
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->d:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1123
    :cond_15
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/h;->a()V

    goto/16 :goto_0

    .line 1125
    :cond_16
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-nez v0, :cond_1c

    const-string v0, "polygon"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    const-string v0, "polyline"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 1126
    :cond_17
    const-string v0, "points"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->c(Ljava/lang/String;Lorg/xml/sax/Attributes;)Lcom/roidapp/imagelib/f/f;

    move-result-object v0

    .line 1127
    if-eqz v0, :cond_2

    .line 1128
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 1129
    invoke-static {v0}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v3

    .line 1130
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v6, :cond_2

    .line 1131
    invoke-direct {p0, p4}, Lcom/roidapp/imagelib/f/h;->a(Lorg/xml/sax/Attributes;)V

    .line 1132
    new-instance v4, Lcom/roidapp/imagelib/f/g;

    invoke-direct {v4, p4, v5}, Lcom/roidapp/imagelib/f/g;-><init>(Lorg/xml/sax/Attributes;B)V

    .line 1133
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1134
    const/4 v0, 0x2

    move v1, v0

    :goto_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_18

    .line 1135
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v5

    .line 1136
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 1137
    invoke-virtual {v2, v5, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1134
    add-int/lit8 v0, v1, 0x2

    move v1, v0

    goto :goto_5

    .line 1140
    :cond_18
    const-string v0, "polygon"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1141
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 1143
    :cond_19
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    invoke-direct {p0, v4, v0}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;Ljava/util/HashMap;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1144
    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/f/h;->a(Landroid/graphics/Path;)V

    .line 1145
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1147
    :cond_1a
    invoke-direct {p0, v4}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 1148
    iget-object v0, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1150
    :cond_1b
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/h;->a()V

    goto/16 :goto_0

    .line 1153
    :cond_1c
    iget-boolean v0, p0, Lcom/roidapp/imagelib/f/h;->o:Z

    if-nez v0, :cond_2

    const-string v0, "path"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1154
    const-string v0, "d"

    invoke-static {v0, p4}, Lcom/roidapp/imagelib/f/d;->a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object v0

    .line 1155
    iput-object v0, p0, Lcom/roidapp/imagelib/f/h;->f:Landroid/graphics/Path;

    .line 1156
    invoke-direct {p0, p4}, Lcom/roidapp/imagelib/f/h;->a(Lorg/xml/sax/Attributes;)V

    .line 1157
    new-instance v1, Lcom/roidapp/imagelib/f/g;

    invoke-direct {v1, p4, v5}, Lcom/roidapp/imagelib/f/g;-><init>(Lorg/xml/sax/Attributes;B)V

    .line 1158
    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->l:Ljava/util/HashMap;

    invoke-direct {p0, v1, v2}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;Ljava/util/HashMap;)Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 1159
    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/f/h;->a(Landroid/graphics/Path;)V

    .line 1160
    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v2, v0, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1162
    :cond_1d
    invoke-direct {p0, v1}, Lcom/roidapp/imagelib/f/h;->a(Lcom/roidapp/imagelib/f/g;)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 1163
    iget-object v1, p0, Lcom/roidapp/imagelib/f/h;->b:Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/roidapp/imagelib/f/h;->c:Landroid/graphics/Paint;

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1165
    :cond_1e
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/h;->a()V

    goto/16 :goto_0

    :cond_1f
    move-object v7, v0

    goto/16 :goto_4

    :cond_20
    move-object v6, v0

    goto/16 :goto_3

    :cond_21
    move v0, v1

    goto/16 :goto_1
.end method
