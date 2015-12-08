.class final Lkik/android/widget/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field final synthetic a:Lkik/android/widget/GalleryWidget;


# direct methods
.method constructor <init>(Lkik/android/widget/GalleryWidget;)V
    .locals 0

    .prologue
    .line 246
    iput-object p1, p0, Lkik/android/widget/ae;->a:Lkik/android/widget/GalleryWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .prologue
    .line 250
    iget-object v0, p0, Lkik/android/widget/ae;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v0}, Lkik/android/widget/GalleryWidget;->b(Lkik/android/widget/GalleryWidget;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lkik/android/widget/ae;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v0}, Lkik/android/widget/GalleryWidget;->c(Lkik/android/widget/GalleryWidget;)Z

    .line 263
    :goto_0
    return-void

    .line 256
    :cond_0
    iget-object v0, p0, Lkik/android/widget/ae;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v0}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;)Lkik/android/widget/aa;

    move-result-object v0

    invoke-virtual {v0, p3}, Lkik/android/widget/aa;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 257
    iget-object v1, p0, Lkik/android/widget/ae;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v1, v0}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;)V

    .line 258
    iget-object v1, p0, Lkik/android/widget/ae;->a:Lkik/android/widget/GalleryWidget;

    iget-object v1, v1, Lkik/android/widget/GalleryWidget;->c:Lcom/kik/android/a;

    const-string v2, "Album Switched"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Album List Size"

    iget-object v3, p0, Lkik/android/widget/ae;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {v3}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;)Lkik/android/widget/aa;

    move-result-object v3

    invoke-virtual {v3}, Lkik/android/widget/aa;->getCount()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Recent"

    invoke-static {}, Lkik/android/widget/GalleryWidget;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Album Name"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 2

    .prologue
    .line 268
    iget-object v0, p0, Lkik/android/widget/ae;->a:Lkik/android/widget/GalleryWidget;

    invoke-static {}, Lkik/android/widget/GalleryWidget;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/widget/GalleryWidget;->a(Lkik/android/widget/GalleryWidget;Ljava/lang/String;)V

    .line 269
    return-void
.end method
