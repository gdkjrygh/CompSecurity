.class public final Lcom/kik/cache/ad$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cache/ad;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cache/ad;

.field private b:Landroid/graphics/Bitmap;

.field private final c:Lcom/kik/cache/ad$d;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:I

.field private final g:I


# direct methods
.method public constructor <init>(Lcom/kik/cache/ad;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/kik/cache/ad$d;II)V
    .locals 0

    .prologue
    .line 454
    iput-object p1, p0, Lcom/kik/cache/ad$c;->a:Lcom/kik/cache/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 455
    iput-object p2, p0, Lcom/kik/cache/ad$c;->b:Landroid/graphics/Bitmap;

    .line 456
    iput-object p3, p0, Lcom/kik/cache/ad$c;->e:Ljava/lang/String;

    .line 457
    iput-object p4, p0, Lcom/kik/cache/ad$c;->d:Ljava/lang/String;

    .line 458
    iput-object p5, p0, Lcom/kik/cache/ad$c;->c:Lcom/kik/cache/ad$d;

    .line 459
    iput p6, p0, Lcom/kik/cache/ad$c;->f:I

    .line 460
    iput p7, p0, Lcom/kik/cache/ad$c;->g:I

    .line 461
    return-void
.end method

.method static synthetic a(Lcom/kik/cache/ad$c;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 431
    iput-object p1, p0, Lcom/kik/cache/ad$c;->b:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/kik/cache/ad$c;)Lcom/kik/cache/ad$d;
    .locals 1

    .prologue
    .line 431
    iget-object v0, p0, Lcom/kik/cache/ad$c;->c:Lcom/kik/cache/ad$d;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 468
    iget-object v0, p0, Lcom/kik/cache/ad$c;->c:Lcom/kik/cache/ad$d;

    if-nez v0, :cond_1

    .line 488
    :cond_0
    :goto_0
    return-void

    .line 471
    :cond_1
    iget-object v0, p0, Lcom/kik/cache/ad$c;->a:Lcom/kik/cache/ad;

    invoke-static {v0}, Lcom/kik/cache/ad;->b(Lcom/kik/cache/ad;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/ad$c;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad$a;

    .line 472
    if-eqz v0, :cond_2

    .line 473
    invoke-virtual {v0, p0}, Lcom/kik/cache/ad$a;->b(Lcom/kik/cache/ad$c;)Z

    move-result v0

    .line 474
    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Lcom/kik/cache/ad$c;->a:Lcom/kik/cache/ad;

    invoke-static {v0}, Lcom/kik/cache/ad;->b(Lcom/kik/cache/ad;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/ad$c;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 480
    :cond_2
    iget-object v0, p0, Lcom/kik/cache/ad$c;->a:Lcom/kik/cache/ad;

    invoke-static {v0}, Lcom/kik/cache/ad;->c(Lcom/kik/cache/ad;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/ad$c;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad$a;

    .line 481
    if-eqz v0, :cond_0

    .line 482
    invoke-virtual {v0, p0}, Lcom/kik/cache/ad$a;->b(Lcom/kik/cache/ad$c;)Z

    .line 483
    invoke-static {v0}, Lcom/kik/cache/ad$a;->b(Lcom/kik/cache/ad$a;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 484
    iget-object v0, p0, Lcom/kik/cache/ad$c;->a:Lcom/kik/cache/ad;

    invoke-static {v0}, Lcom/kik/cache/ad;->c(Lcom/kik/cache/ad;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/ad$c;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final b()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 495
    iget-object v0, p0, Lcom/kik/cache/ad$c;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 500
    iget v0, p0, Lcom/kik/cache/ad$c;->f:I

    return v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 505
    iget v0, p0, Lcom/kik/cache/ad$c;->g:I

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 521
    iget-object v0, p0, Lcom/kik/cache/ad$c;->d:Ljava/lang/String;

    return-object v0
.end method
