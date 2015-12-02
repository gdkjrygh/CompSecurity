.class Lcom/android/volley/toolbox/g$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/volley/toolbox/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/android/volley/toolbox/g;

.field private final b:Lcom/android/volley/Request;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/volley/Request",
            "<*>;"
        }
    .end annotation
.end field

.field private c:Landroid/graphics/Bitmap;

.field private d:Lcom/android/volley/VolleyError;

.field private final e:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/android/volley/toolbox/g$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/volley/toolbox/g;Lcom/android/volley/Request;Lcom/android/volley/toolbox/g$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request",
            "<*>;",
            "Lcom/android/volley/toolbox/g$c;",
            ")V"
        }
    .end annotation

    .prologue
    .line 407
    iput-object p1, p0, Lcom/android/volley/toolbox/g$a;->a:Lcom/android/volley/toolbox/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 397
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/android/volley/toolbox/g$a;->e:Ljava/util/LinkedList;

    .line 408
    iput-object p2, p0, Lcom/android/volley/toolbox/g$a;->b:Lcom/android/volley/Request;

    .line 409
    iget-object v0, p0, Lcom/android/volley/toolbox/g$a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 410
    return-void
.end method

.method static synthetic a(Lcom/android/volley/toolbox/g$a;)Ljava/util/LinkedList;
    .locals 1

    .prologue
    .line 397
    iget-object v0, p0, Lcom/android/volley/toolbox/g$a;->e:Ljava/util/LinkedList;

    return-object v0
.end method

.method static synthetic a(Lcom/android/volley/toolbox/g$a;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 391
    iput-object p1, p0, Lcom/android/volley/toolbox/g$a;->c:Landroid/graphics/Bitmap;

    return-void
.end method

.method static synthetic b(Lcom/android/volley/toolbox/g$a;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 391
    iget-object v0, p0, Lcom/android/volley/toolbox/g$a;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/android/volley/VolleyError;
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lcom/android/volley/toolbox/g$a;->d:Lcom/android/volley/VolleyError;

    return-object v0
.end method

.method public a(Lcom/android/volley/VolleyError;)V
    .locals 0

    .prologue
    .line 416
    iput-object p1, p0, Lcom/android/volley/toolbox/g$a;->d:Lcom/android/volley/VolleyError;

    .line 417
    return-void
.end method

.method public a(Lcom/android/volley/toolbox/g$c;)V
    .locals 1

    .prologue
    .line 431
    iget-object v0, p0, Lcom/android/volley/toolbox/g$a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 432
    return-void
.end method

.method public b(Lcom/android/volley/toolbox/g$c;)Z
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lcom/android/volley/toolbox/g$a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 444
    iget-object v0, p0, Lcom/android/volley/toolbox/g$a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/android/volley/toolbox/g$a;->b:Lcom/android/volley/Request;

    invoke-virtual {v0}, Lcom/android/volley/Request;->g()V

    .line 446
    const/4 v0, 0x1

    .line 448
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
