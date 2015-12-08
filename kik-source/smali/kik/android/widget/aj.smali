.class final Lkik/android/widget/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/GalleryWidget$a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/widget/ai;


# direct methods
.method constructor <init>(Lkik/android/widget/ai;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lkik/android/widget/aj;->b:Lkik/android/widget/ai;

    iput-object p2, p0, Lkik/android/widget/aj;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 341
    iget-object v0, p0, Lkik/android/widget/aj;->b:Lkik/android/widget/ai;

    iget-object v0, v0, Lkik/android/widget/ai;->b:Lkik/android/widget/af;

    iget-object v0, v0, Lkik/android/widget/af;->a:Lkik/android/widget/GalleryWidget;

    const/4 v1, 0x1

    iget-object v2, p0, Lkik/android/widget/aj;->b:Lkik/android/widget/ai;

    iget v2, v2, Lkik/android/widget/ai;->a:I

    iget-object v3, p0, Lkik/android/widget/aj;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;ZILjava/lang/String;)V

    .line 342
    return-void
.end method
