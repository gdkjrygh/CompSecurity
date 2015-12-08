.class final Lkik/android/widget/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/GalleryWidget$a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/widget/ag;


# direct methods
.method constructor <init>(Lkik/android/widget/ag;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 293
    iput-object p1, p0, Lkik/android/widget/ah;->b:Lkik/android/widget/ag;

    iput-object p2, p0, Lkik/android/widget/ah;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 297
    iget-object v0, p0, Lkik/android/widget/ah;->b:Lkik/android/widget/ag;

    iget-object v0, v0, Lkik/android/widget/ag;->c:Lkik/android/widget/af;

    iget-object v0, v0, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    iget-object v1, p0, Lkik/android/widget/ah;->a:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/widget/ah;->b:Lkik/android/widget/ag;

    iget-wide v2, v2, Lkik/android/widget/ag;->a:J

    const/4 v4, 0x1

    iget-object v5, p0, Lkik/android/widget/ah;->b:Lkik/android/widget/ag;

    iget v5, v5, Lkik/android/widget/ag;->b:I

    invoke-static/range {v0 .. v5}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;JZI)V

    .line 298
    return-void
.end method
