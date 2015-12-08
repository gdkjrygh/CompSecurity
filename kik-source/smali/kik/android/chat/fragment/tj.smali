.class final Lkik/android/chat/fragment/tj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lkik/android/chat/fragment/ti;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ti;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 391
    iput-object p1, p0, Lkik/android/chat/fragment/tj;->b:Lkik/android/chat/fragment/ti;

    iput-object p2, p0, Lkik/android/chat/fragment/tj;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 396
    iget-object v0, p0, Lkik/android/chat/fragment/tj;->b:Lkik/android/chat/fragment/ti;

    iget-object v0, v0, Lkik/android/chat/fragment/ti;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Z)Z

    .line 397
    iget-object v0, p0, Lkik/android/chat/fragment/tj;->b:Lkik/android/chat/fragment/ti;

    iget-object v0, v0, Lkik/android/chat/fragment/ti;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/tj;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/kik/cache/ProfileImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 398
    iget-object v0, p0, Lkik/android/chat/fragment/tj;->b:Lkik/android/chat/fragment/ti;

    iget-object v0, v0, Lkik/android/chat/fragment/ti;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 399
    return-void
.end method
