.class final Lkik/android/chat/fragment/iq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ip;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ip;)V
    .locals 0

    .prologue
    .line 763
    iput-object p1, p0, Lkik/android/chat/fragment/iq;->a:Lkik/android/chat/fragment/ip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 767
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/iq;->a:Lkik/android/chat/fragment/ip;

    iget-object v1, v1, Lkik/android/chat/fragment/ip;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_errorHolder:Landroid/widget/LinearLayout;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/av;->b([Landroid/view/View;)V

    .line 768
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/iq;->a:Lkik/android/chat/fragment/ip;

    iget-object v1, v1, Lkik/android/chat/fragment/ip;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_codeInfo:Landroid/view/ViewGroup;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/iq;->a:Lkik/android/chat/fragment/ip;

    iget-object v1, v1, Lkik/android/chat/fragment/ip;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_scanText:Landroid/widget/TextView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/av;->a([Landroid/view/View;)V

    .line 769
    return-void
.end method
