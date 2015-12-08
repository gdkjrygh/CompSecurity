.class final Lkik/android/chat/fragment/ri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/rh;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/rh;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lkik/android/chat/fragment/ri;->a:Lkik/android/chat/fragment/rh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lkik/android/chat/fragment/ri;->a:Lkik/android/chat/fragment/rh;

    iget-object v0, v0, Lkik/android/chat/fragment/rh;->a:Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->a(Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;)Lcom/kik/g/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 44
    iget-object v0, p0, Lkik/android/chat/fragment/ri;->a:Lkik/android/chat/fragment/rh;

    iget-object v0, v0, Lkik/android/chat/fragment/rh;->a:Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;

    invoke-virtual {v0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->finish()V

    .line 45
    return-void
.end method
