.class public final Lcom/roidapp/imagelib/f/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Picture;

.field private b:Landroid/graphics/RectF;

.field private c:Landroid/graphics/RectF;

.field private d:Landroid/graphics/Path;


# direct methods
.method constructor <init>(Landroid/graphics/Picture;Landroid/graphics/RectF;)V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/f/b;->c:Landroid/graphics/RectF;

    .line 56
    iput-object p1, p0, Lcom/roidapp/imagelib/f/b;->a:Landroid/graphics/Picture;

    .line 57
    iput-object p2, p0, Lcom/roidapp/imagelib/f/b;->b:Landroid/graphics/RectF;

    .line 58
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Picture;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/roidapp/imagelib/f/b;->a:Landroid/graphics/Picture;

    return-object v0
.end method

.method final a(Landroid/graphics/Path;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/roidapp/imagelib/f/b;->d:Landroid/graphics/Path;

    .line 70
    return-void
.end method

.method final a(Landroid/graphics/RectF;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/roidapp/imagelib/f/b;->c:Landroid/graphics/RectF;

    .line 66
    return-void
.end method

.method public final b()Landroid/graphics/Path;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/roidapp/imagelib/f/b;->d:Landroid/graphics/Path;

    return-object v0
.end method
