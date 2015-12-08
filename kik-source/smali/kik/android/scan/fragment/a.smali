.class final Lkik/android/scan/fragment/a;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .prologue
    .line 138
    check-cast p2, Lkik/android/scan/k$a;

    iget-object v0, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;)Lkik/android/scan/k;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/scan/k;->a()Lcom/kik/scan/Scanner$ScanResult;

    move-result-object v0

    iget-object v1, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v1}, Lkik/android/scan/fragment/ScanFragment;->b(Lkik/android/scan/fragment/ScanFragment;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v1}, Lkik/android/scan/fragment/ScanFragment;->c(Lkik/android/scan/fragment/ScanFragment;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p2, :cond_1

    iget-object v1, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v1}, Lkik/android/scan/fragment/ScanFragment;->d(Lkik/android/scan/fragment/ScanFragment;)Z

    iget-object v1, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v1, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/Scanner$ScanResult;)Landroid/graphics/Point;

    move-result-object v1

    iget-object v2, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v2}, Lkik/android/scan/fragment/ScanFragment;->e(Lkik/android/scan/fragment/ScanFragment;)Landroid/graphics/Point;

    move-result-object v2

    iget v3, v1, Landroid/graphics/Point;->x:I

    iget v4, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v2, p2}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lkik/android/scan/k$a;)Lkik/android/scan/k$a;

    iget-object v2, p2, Lkik/android/scan/k$a;->b:Lcom/kik/scan/KikCode;

    iget-object v3, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v2}, Lkik/android/chat/b/a;->b(Lcom/kik/scan/KikCode;)I

    move-result v4

    invoke-static {v3, v4}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;I)I

    const-string v3, "Success"

    iget-object v4, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v4, v4, Lkik/android/scan/fragment/ScanFragment;->a:Lcom/kik/android/a;

    invoke-static {v3, v4}, Lkik/android/util/by;->a(Ljava/lang/String;Lcom/kik/android/a;)Lcom/kik/android/a$f;

    move-result-object v3

    if-eqz v0, :cond_0

    const-string v4, "Size"

    iget v0, v0, Lcom/kik/scan/Scanner$ScanResult;->scale:I

    int-to-long v6, v0

    invoke-virtual {v3, v4, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    const-string v0, "X"

    iget v4, v1, Landroid/graphics/Point;->x:I

    int-to-long v4, v4

    invoke-virtual {v3, v0, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    const-string v0, "Y"

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-long v4, v1

    invoke-virtual {v3, v0, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    :cond_0
    const-string v0, "Colour"

    invoke-static {v2}, Lkik/android/chat/b/a;->a(Lcom/kik/scan/KikCode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    invoke-virtual {v3}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/scan/fragment/a;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0, v2}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    :cond_1
    return-void
.end method
