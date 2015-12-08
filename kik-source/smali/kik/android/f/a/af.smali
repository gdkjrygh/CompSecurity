.class final Lkik/android/f/a/af;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lkik/android/f/a/ae$b;


# direct methods
.method constructor <init>(Lkik/android/f/a/ae$b;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 569
    iput-object p1, p0, Lkik/android/f/a/af;->b:Lkik/android/f/a/ae$b;

    iput-object p2, p0, Lkik/android/f/a/af;->a:Lkik/a/d/a/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 583
    iget-object v0, p0, Lkik/android/f/a/af;->a:Lkik/a/d/a/a;

    const-string v1, "icon"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    if-nez v0, :cond_0

    .line 584
    iget-object v0, p0, Lkik/android/f/a/af;->b:Lkik/android/f/a/ae$b;

    iget-object v1, p0, Lkik/android/f/a/af;->a:Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/android/f/a/ae$b;->a(Lkik/android/f/a/ae$b;Lkik/a/d/a/a;)V

    .line 586
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/af;->b:Lkik/android/f/a/ae$b;

    iget-object v1, p0, Lkik/android/f/a/af;->a:Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/android/f/a/ae$b;->b(Lkik/android/f/a/ae$b;Lkik/a/d/a/a;)V

    .line 587
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 569
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {p1}, Lkik/android/f/a/ae;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    iget-object v1, p0, Lkik/android/f/a/af;->a:Lkik/a/d/a/a;

    const-string v2, "icon"

    new-instance v3, Lkik/a/d/d;

    invoke-direct {v3, v0}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    :cond_0
    return-void
.end method
