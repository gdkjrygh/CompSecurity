.class final Lkik/android/chat/fragment/qp;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ScanCodeTabFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lkik/android/chat/fragment/qp;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lkik/android/chat/fragment/qp;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->c(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/qp;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->c(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$b;->b()Z

    :cond_0
    return-void
.end method
