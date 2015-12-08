.class final Lkik/android/widget/ao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/GalleryWidget$a;


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/android/widget/ak;


# direct methods
.method constructor <init>(Lkik/android/widget/ak;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 407
    iput-object p1, p0, Lkik/android/widget/ao;->c:Lkik/android/widget/ak;

    iput p2, p0, Lkik/android/widget/ao;->a:I

    iput-object p3, p0, Lkik/android/widget/ao;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 411
    iget-object v0, p0, Lkik/android/widget/ao;->c:Lkik/android/widget/ak;

    iget-object v0, v0, Lkik/android/widget/ak;->a:Lkik/android/widget/GalleryWidget;

    const/4 v1, 0x0

    iget v2, p0, Lkik/android/widget/ao;->a:I

    iget-object v3, p0, Lkik/android/widget/ao;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;ZILjava/lang/String;)V

    .line 412
    return-void
.end method
