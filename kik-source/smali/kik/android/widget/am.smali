.class final Lkik/android/widget/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/GalleryWidget$a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/widget/al;


# direct methods
.method constructor <init>(Lkik/android/widget/al;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 384
    iput-object p1, p0, Lkik/android/widget/am;->b:Lkik/android/widget/al;

    iput-object p2, p0, Lkik/android/widget/am;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 388
    iget-object v0, p0, Lkik/android/widget/am;->b:Lkik/android/widget/al;

    iget-object v0, v0, Lkik/android/widget/al;->c:Lkik/android/widget/ak;

    iget-object v0, v0, Lkik/android/widget/ak;->a:Lkik/android/widget/GalleryWidget;

    iget-object v1, p0, Lkik/android/widget/am;->a:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/widget/am;->b:Lkik/android/widget/al;

    iget-wide v2, v2, Lkik/android/widget/al;->a:J

    const/4 v4, 0x1

    iget-object v5, p0, Lkik/android/widget/am;->b:Lkik/android/widget/al;

    iget v5, v5, Lkik/android/widget/al;->b:I

    invoke-static/range {v0 .. v5}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;JZI)V

    .line 389
    return-void
.end method
