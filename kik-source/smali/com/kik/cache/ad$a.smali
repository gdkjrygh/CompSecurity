.class final Lcom/kik/cache/ad$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cache/ad;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cache/ad;

.field private final b:Lcom/android/volley/n;

.field private c:Landroid/graphics/Bitmap;

.field private d:Lcom/android/volley/w;

.field private final e:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(Lcom/kik/cache/ad;Lcom/android/volley/n;Lcom/kik/cache/ad$c;)V
    .locals 1

    .prologue
    .line 546
    iput-object p1, p0, Lcom/kik/cache/ad$a;->a:Lcom/kik/cache/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 538
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ad$a;->e:Ljava/util/LinkedList;

    .line 547
    iput-object p2, p0, Lcom/kik/cache/ad$a;->b:Lcom/android/volley/n;

    .line 548
    iget-object v0, p0, Lcom/kik/cache/ad$a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 549
    return-void
.end method

.method static synthetic a(Lcom/kik/cache/ad$a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 529
    iput-object p1, p0, Lcom/kik/cache/ad$a;->c:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/kik/cache/ad$a;)Lcom/android/volley/n;
    .locals 1

    .prologue
    .line 529
    iget-object v0, p0, Lcom/kik/cache/ad$a;->b:Lcom/android/volley/n;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/cache/ad$a;)Ljava/util/LinkedList;
    .locals 1

    .prologue
    .line 529
    iget-object v0, p0, Lcom/kik/cache/ad$a;->e:Ljava/util/LinkedList;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cache/ad$a;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 529
    iget-object v0, p0, Lcom/kik/cache/ad$a;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/android/volley/w;
    .locals 1

    .prologue
    .line 564
    iget-object v0, p0, Lcom/kik/cache/ad$a;->d:Lcom/android/volley/w;

    return-object v0
.end method

.method public final a(Lcom/android/volley/w;)V
    .locals 0

    .prologue
    .line 556
    iput-object p1, p0, Lcom/kik/cache/ad$a;->d:Lcom/android/volley/w;

    .line 557
    return-void
.end method

.method public final a(Lcom/kik/cache/ad$c;)V
    .locals 1

    .prologue
    .line 573
    iget-object v0, p0, Lcom/kik/cache/ad$a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 574
    return-void
.end method

.method public final b(Lcom/kik/cache/ad$c;)Z
    .locals 1

    .prologue
    .line 584
    iget-object v0, p0, Lcom/kik/cache/ad$a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 585
    iget-object v0, p0, Lcom/kik/cache/ad$a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 586
    iget-object v0, p0, Lcom/kik/cache/ad$a;->b:Lcom/android/volley/n;

    invoke-virtual {v0}, Lcom/android/volley/n;->g()V

    .line 587
    const/4 v0, 0x1

    .line 589
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
