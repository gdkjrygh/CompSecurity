.class final Lcom/kik/cache/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/r$b;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/cache/z;

.field final synthetic c:Lcom/kik/cache/ad;


# direct methods
.method constructor <init>(Lcom/kik/cache/ad;Ljava/lang/String;Lcom/kik/cache/z;)V
    .locals 0

    .prologue
    .line 316
    iput-object p1, p0, Lcom/kik/cache/ag;->c:Lcom/kik/cache/ad;

    iput-object p2, p0, Lcom/kik/cache/ag;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cache/ag;->b:Lcom/kik/cache/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 316
    check-cast p1, Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/kik/cache/ag;->c:Lcom/kik/cache/ad;

    iget-object v1, p0, Lcom/kik/cache/ag;->a:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/ad;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/kik/cache/ag;->b:Lcom/kik/cache/z;

    invoke-virtual {v0}, Lcom/kik/cache/z;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cache/ag;->c:Lcom/kik/cache/ad;

    invoke-static {v0}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/ad;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/ag;->b:Lcom/kik/cache/z;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
