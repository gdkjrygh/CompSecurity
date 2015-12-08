.class final Lkik/android/chat/fragment/tk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ti;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ti;)V
    .locals 0

    .prologue
    .line 406
    iput-object p1, p0, Lkik/android/chat/fragment/tk;->a:Lkik/android/chat/fragment/ti;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 411
    iget-object v0, p0, Lkik/android/chat/fragment/tk;->a:Lkik/android/chat/fragment/ti;

    iget-object v0, v0, Lkik/android/chat/fragment/ti;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/ViewPictureFragment;)V

    .line 412
    return-void
.end method
