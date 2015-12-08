.class final Lkik/android/chat/fragment/sh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 0

    .prologue
    .line 604
    iput-object p1, p0, Lkik/android/chat/fragment/sh;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 608
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 609
    const-string v1, "photoUrl"

    iget-object v2, p0, Lkik/android/chat/fragment/sh;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/ViewPictureFragment;->j(Lkik/android/chat/fragment/ViewPictureFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 610
    iget-object v1, p0, Lkik/android/chat/fragment/sh;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Landroid/os/Bundle;)V

    .line 611
    iget-object v0, p0, Lkik/android/chat/fragment/sh;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->J()V

    .line 612
    return-void
.end method
