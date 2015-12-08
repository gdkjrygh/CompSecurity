.class final Lkik/android/chat/fragment/sz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/sx;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/sx;)V
    .locals 0

    .prologue
    .line 1036
    iput-object p1, p0, Lkik/android/chat/fragment/sz;->a:Lkik/android/chat/fragment/sx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1041
    iget-object v0, p0, Lkik/android/chat/fragment/sz;->a:Lkik/android/chat/fragment/sx;

    iget-object v0, v0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;Z)Z

    .line 1042
    iget-object v0, p0, Lkik/android/chat/fragment/sz;->a:Lkik/android/chat/fragment/sx;

    iget-object v0, v0, Lkik/android/chat/fragment/sx;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;)V

    .line 1043
    return-void
.end method
