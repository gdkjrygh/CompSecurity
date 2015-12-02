.class public Lcom/facebook/ui/images/d/j;
.super Ljava/lang/Object;
.source "GraphicSizer.java"

# interfaces
.implements Lcom/facebook/ui/images/d/g;


# instance fields
.field private final a:Lcom/facebook/ui/images/d/h;

.field private final b:I

.field private final c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/images/d/g;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Lcom/facebook/ui/images/d/h;II)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/ui/images/d/j;->a:Lcom/facebook/ui/images/d/h;

    .line 29
    iput p2, p0, Lcom/facebook/ui/images/d/j;->b:I

    .line 30
    iput p3, p0, Lcom/facebook/ui/images/d/j;->c:I

    .line 31
    invoke-direct {p0, p2, p3}, Lcom/facebook/ui/images/d/j;->a(II)V

    .line 32
    return-void
.end method

.method private a(II)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 71
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 72
    iget-object v1, p0, Lcom/facebook/ui/images/d/j;->a:Lcom/facebook/ui/images/d/h;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/d/h;->a(Landroid/graphics/Rect;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/ui/images/d/j;->d:Ljava/util/List;

    .line 74
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    iput v1, p0, Lcom/facebook/ui/images/d/j;->e:I

    .line 75
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/d/j;->f:I

    .line 76
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/ui/images/d/j;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/d/g;

    .line 37
    invoke-interface {v0, p1}, Lcom/facebook/ui/images/d/g;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_0

    .line 39
    :cond_0
    return-object p1
.end method
