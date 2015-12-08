.class final Lkik/android/chat/fragment/oo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/on;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/on;)V
    .locals 0

    .prologue
    .line 555
    iput-object p1, p0, Lkik/android/chat/fragment/oo;->a:Lkik/android/chat/fragment/on;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 560
    iget-object v0, p0, Lkik/android/chat/fragment/oo;->a:Lkik/android/chat/fragment/on;

    iget-object v0, v0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->showDropDown()V

    .line 561
    return-void
.end method
