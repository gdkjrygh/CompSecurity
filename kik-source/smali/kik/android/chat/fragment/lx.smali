.class final Lkik/android/chat/fragment/lx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/lw;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/lw;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lkik/android/chat/fragment/lx;->a:Lkik/android/chat/fragment/lw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/lx;->a:Lkik/android/chat/fragment/lw;

    iget-object v0, v0, Lkik/android/chat/fragment/lw;->a:Lkik/android/chat/fragment/KikIqFragmentBase;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 90
    return-void
.end method
