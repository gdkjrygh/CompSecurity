.class final Lkik/android/chat/fragment/sx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cache/ad$d;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 0

    .prologue
    .line 1010
    iput-object p1, p0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/w;)V
    .locals 2

    .prologue
    .line 1036
    iget-object v0, p0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->d(Lkik/android/chat/fragment/ViewPictureFragment;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/sz;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sz;-><init>(Lkik/android/chat/fragment/sx;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1045
    return-void
.end method

.method public final a(Lcom/kik/cache/ad$c;Z)V
    .locals 3

    .prologue
    .line 1014
    invoke-virtual {p1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1015
    if-eqz v0, :cond_1

    .line 1016
    iget-object v1, p0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 1017
    iget-object v1, p0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/ViewPictureFragment;->d(Lkik/android/chat/fragment/ViewPictureFragment;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/sy;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/sy;-><init>(Lkik/android/chat/fragment/sx;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1031
    :cond_0
    :goto_0
    return-void

    .line 1027
    :cond_1
    if-nez p2, :cond_0

    .line 1029
    iget-object v0, p0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Z)Z

    goto :goto_0
.end method
