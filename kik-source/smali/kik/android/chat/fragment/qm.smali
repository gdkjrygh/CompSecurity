.class final Lkik/android/chat/fragment/qm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/scan/fragment/ScanFragment$b;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ScanCodeTabFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lkik/android/chat/fragment/qm;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lkik/android/chat/fragment/qm;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->a(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    .line 105
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lkik/android/chat/fragment/qm;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->b(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    .line 111
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lkik/android/chat/fragment/qm;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->c(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lkik/android/chat/fragment/qm;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->c(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    .line 118
    const/4 v0, 0x1

    .line 122
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
