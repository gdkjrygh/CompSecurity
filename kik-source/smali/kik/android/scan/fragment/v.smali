.class final Lkik/android/scan/fragment/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/scan/fragment/u;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/u;)V
    .locals 0

    .prologue
    .line 444
    iput-object p1, p0, Lkik/android/scan/fragment/v;->a:Lkik/android/scan/fragment/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 448
    iget-object v0, p0, Lkik/android/scan/fragment/v;->a:Lkik/android/scan/fragment/u;

    iget-object v0, v0, Lkik/android/scan/fragment/u;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-virtual {v0}, Lkik/android/scan/fragment/ScanFragment;->b()V

    .line 449
    return-void
.end method
