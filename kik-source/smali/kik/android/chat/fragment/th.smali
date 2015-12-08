.class final Lkik/android/chat/fragment/th;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lkik/android/chat/fragment/tg;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/tg;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 376
    iput-object p1, p0, Lkik/android/chat/fragment/th;->b:Lkik/android/chat/fragment/tg;

    iput-object p2, p0, Lkik/android/chat/fragment/th;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 380
    iget-object v0, p0, Lkik/android/chat/fragment/th;->b:Lkik/android/chat/fragment/tg;

    iget-object v0, v0, Lkik/android/chat/fragment/tg;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Z)Z

    .line 381
    iget-object v0, p0, Lkik/android/chat/fragment/th;->b:Lkik/android/chat/fragment/tg;

    iget-object v0, v0, Lkik/android/chat/fragment/tg;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/th;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/kik/cache/ProfileImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 382
    iget-object v0, p0, Lkik/android/chat/fragment/th;->b:Lkik/android/chat/fragment/tg;

    iget-object v0, v0, Lkik/android/chat/fragment/tg;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 383
    return-void
.end method
