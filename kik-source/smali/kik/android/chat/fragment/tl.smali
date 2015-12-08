.class final Lkik/android/chat/fragment/tl;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 0

    .prologue
    .line 434
    iput-object p1, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 434
    check-cast p1, Ljava/io/File;

    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Z)Z

    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Ljava/io/File;)Ljava/io/File;

    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Ljava/io/File;Lkik/a/d/a/a;)V

    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    new-instance v1, Lkik/android/chat/fragment/tm;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/tm;-><init>(Lkik/android/chat/fragment/tl;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 456
    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 457
    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Z)Z

    .line 458
    iget-object v0, p0, Lkik/android/chat/fragment/tl;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    new-instance v1, Lkik/android/chat/fragment/tn;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/tn;-><init>(Lkik/android/chat/fragment/tl;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->b(Ljava/lang/Runnable;)V

    .line 470
    return-void
.end method
