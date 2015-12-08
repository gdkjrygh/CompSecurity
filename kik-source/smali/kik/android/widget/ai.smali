.class final Lkik/android/widget/ai;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkik/android/widget/af;


# direct methods
.method constructor <init>(Lkik/android/widget/af;I)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lkik/android/widget/ai;->b:Lkik/android/widget/af;

    iput p2, p0, Lkik/android/widget/ai;->a:I

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 321
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "photoUrl"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/ai;->b:Lkik/android/widget/af;

    iget-object v0, v0, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    iget-object v0, v0, Lkik/android/widget/GalleryWidget;->c:Lcom/kik/android/a;

    const-string v1, "Photo Preview Closed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Selected"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lkik/android/widget/ai;->b:Lkik/android/widget/af;

    iget-object v1, v1, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    iget-object v1, v1, Lkik/android/widget/GalleryWidget;->c:Lcom/kik/android/a;

    const-string v2, "Photo Preview Closed"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Selected"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    iget-object v1, p0, Lkik/android/widget/ai;->b:Lkik/android/widget/af;

    iget-object v1, v1, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v1}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;)Lkik/android/widget/aa;

    invoke-static {}, Lkik/android/widget/aa;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/ai;->b:Lkik/android/widget/af;

    iget-object v2, v2, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    new-instance v3, Lkik/android/widget/aj;

    invoke-direct {v3, p0, v1}, Lkik/android/widget/aj;-><init>(Lkik/android/widget/ai;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Lkik/android/widget/GalleryWidget$a;)Lkik/android/widget/GalleryWidget$a;

    iget-object v1, p0, Lkik/android/widget/ai;->b:Lkik/android/widget/af;

    iget-object v1, v1, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v1, v0}, Lkik/android/widget/GalleryWidget;->b(Lkik/android/widget/GalleryWidget;Ljava/lang/String;)V

    goto :goto_0
.end method
