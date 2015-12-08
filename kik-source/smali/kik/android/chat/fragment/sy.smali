.class final Lkik/android/chat/fragment/sy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lkik/android/chat/fragment/sx;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/sx;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 1017
    iput-object p1, p0, Lkik/android/chat/fragment/sy;->b:Lkik/android/chat/fragment/sx;

    iput-object p2, p0, Lkik/android/chat/fragment/sy;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1022
    iget-object v0, p0, Lkik/android/chat/fragment/sy;->b:Lkik/android/chat/fragment/sx;

    iget-object v0, v0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Z)Z

    .line 1023
    iget-object v0, p0, Lkik/android/chat/fragment/sy;->b:Lkik/android/chat/fragment/sx;

    iget-object v0, v0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/sy;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContentImageView;->d(Landroid/graphics/Bitmap;)V

    .line 1024
    return-void
.end method
