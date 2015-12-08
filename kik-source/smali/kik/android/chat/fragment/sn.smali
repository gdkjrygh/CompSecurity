.class final Lkik/android/chat/fragment/sn;
.super Landroid/widget/MediaController;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 751
    iput-object p1, p0, Lkik/android/chat/fragment/sn;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-direct {p0, p2}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final show()V
    .locals 0

    .prologue
    .line 761
    return-void
.end method

.method public final show(I)V
    .locals 1

    .prologue
    .line 766
    const/16 v0, 0x3a98

    invoke-super {p0, v0}, Landroid/widget/MediaController;->show(I)V

    .line 767
    return-void
.end method
