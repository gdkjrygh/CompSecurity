.class final Lkik/android/widget/an;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/GalleryWidget$a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:I

.field final synthetic d:Lkik/android/widget/ak;


# direct methods
.method constructor <init>(Lkik/android/widget/ak;Ljava/lang/String;JI)V
    .locals 1

    .prologue
    .line 396
    iput-object p1, p0, Lkik/android/widget/an;->d:Lkik/android/widget/ak;

    iput-object p2, p0, Lkik/android/widget/an;->a:Ljava/lang/String;

    iput-wide p3, p0, Lkik/android/widget/an;->b:J

    iput p5, p0, Lkik/android/widget/an;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 400
    iget-object v0, p0, Lkik/android/widget/an;->d:Lkik/android/widget/ak;

    iget-object v0, v0, Lkik/android/widget/ak;->a:Lkik/android/widget/GalleryWidget;

    iget-object v1, p0, Lkik/android/widget/an;->a:Ljava/lang/String;

    iget-wide v2, p0, Lkik/android/widget/an;->b:J

    const/4 v4, 0x0

    iget v5, p0, Lkik/android/widget/an;->c:I

    invoke-static/range {v0 .. v5}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;JZI)V

    .line 401
    return-void
.end method
