.class final Lkik/android/widget/al;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:J

.field final synthetic b:I

.field final synthetic c:Lkik/android/widget/ak;


# direct methods
.method constructor <init>(Lkik/android/widget/ak;JI)V
    .locals 0

    .prologue
    .line 379
    iput-object p1, p0, Lkik/android/widget/al;->c:Lkik/android/widget/ak;

    iput-wide p2, p0, Lkik/android/widget/al;->a:J

    iput p4, p0, Lkik/android/widget/al;->b:I

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 379
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "photoUrl"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/al;->c:Lkik/android/widget/ak;

    iget-object v1, v1, Lkik/android/widget/ak;->a:Lkik/android/widget/GalleryWidget;

    new-instance v2, Lkik/android/widget/am;

    invoke-direct {v2, p0, v0}, Lkik/android/widget/am;-><init>(Lkik/android/widget/al;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Lkik/android/widget/GalleryWidget$a;)Lkik/android/widget/GalleryWidget$a;

    iget-object v1, p0, Lkik/android/widget/al;->c:Lkik/android/widget/ak;

    iget-object v1, v1, Lkik/android/widget/ak;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v0}, Lkik/android/util/ct;->c(Ljava/lang/String;)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1, v0, v2, v3}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;J)V

    return-void
.end method
