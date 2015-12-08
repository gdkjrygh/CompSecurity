.class final Lkik/android/scan/fragment/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 0

    .prologue
    .line 439
    iput-object p1, p0, Lkik/android/scan/fragment/u;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 443
    const v0, 0x7f09020e

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/scan/fragment/u;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_errorRetryButton:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    .line 444
    iget-object v0, p0, Lkik/android/scan/fragment/u;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v0, v0, Lkik/android/scan/fragment/ScanFragment;->_errorRetryButton:Landroid/widget/TextView;

    new-instance v1, Lkik/android/scan/fragment/v;

    invoke-direct {v1, p0}, Lkik/android/scan/fragment/v;-><init>(Lkik/android/scan/fragment/u;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    iget-object v0, p0, Lkik/android/scan/fragment/u;->a:Lkik/android/scan/fragment/ScanFragment;

    const-string v1, ""

    const v2, 0x7f09020f

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    return-void
.end method
