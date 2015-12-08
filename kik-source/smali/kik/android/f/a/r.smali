.class final Lkik/android/f/a/r;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Landroid/graphics/Bitmap;

.field final synthetic d:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lkik/a/d/a/a;Lcom/kik/g/p;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 754
    iput-object p1, p0, Lkik/android/f/a/r;->d:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/r;->a:Lkik/a/d/a/a;

    iput-object p3, p0, Lkik/android/f/a/r;->b:Lcom/kik/g/p;

    iput-object p4, p0, Lkik/android/f/a/r;->c:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 754
    check-cast p1, Landroid/graphics/Bitmap;

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x50

    invoke-static {p1, v0, v1}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v0

    iget-object v1, p0, Lkik/android/f/a/r;->a:Lkik/a/d/a/a;

    const-string v2, "preview"

    new-instance v3, Lkik/a/d/d;

    invoke-direct {v3, v0}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    iget-object v0, p0, Lkik/android/f/a/r;->b:Lcom/kik/g/p;

    iget-object v1, p0, Lkik/android/f/a/r;->a:Lkik/a/d/a/a;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 766
    iget-object v0, p0, Lkik/android/f/a/r;->c:Landroid/graphics/Bitmap;

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x50

    invoke-static {v0, v1, v2}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v0

    .line 767
    iget-object v1, p0, Lkik/android/f/a/r;->a:Lkik/a/d/a/a;

    const-string v2, "preview"

    new-instance v3, Lkik/a/d/d;

    invoke-direct {v3, v0}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 768
    iget-object v0, p0, Lkik/android/f/a/r;->b:Lcom/kik/g/p;

    iget-object v1, p0, Lkik/android/f/a/r;->a:Lkik/a/d/a/a;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 769
    return-void
.end method
