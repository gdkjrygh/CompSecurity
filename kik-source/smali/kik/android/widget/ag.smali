.class final Lkik/android/widget/ag;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:J

.field final synthetic b:I

.field final synthetic c:Lkik/android/widget/af;


# direct methods
.method constructor <init>(Lkik/android/widget/af;JI)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lkik/android/widget/ag;->c:Lkik/android/widget/af;

    iput-wide p2, p0, Lkik/android/widget/ag;->a:J

    iput p4, p0, Lkik/android/widget/ag;->b:I

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 287
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "photoUrl"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/ag;->c:Lkik/android/widget/af;

    iget-object v1, v1, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    new-instance v2, Lkik/android/widget/ah;

    invoke-direct {v2, p0, v0}, Lkik/android/widget/ah;-><init>(Lkik/android/widget/ag;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Lkik/android/widget/GalleryWidget$a;)Lkik/android/widget/GalleryWidget$a;

    iget-object v1, p0, Lkik/android/widget/ag;->c:Lkik/android/widget/af;

    iget-object v1, v1, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v0}, Lkik/android/util/ct;->c(Ljava/lang/String;)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1, v0, v2, v3}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;J)V

    return-void
.end method
