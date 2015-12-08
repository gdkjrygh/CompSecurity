.class final Lkik/android/scan/fragment/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/scan/fragment/h;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/h;)V
    .locals 0

    .prologue
    .line 603
    iput-object p1, p0, Lkik/android/scan/fragment/i;->a:Lkik/android/scan/fragment/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 607
    iget-object v0, p0, Lkik/android/scan/fragment/i;->a:Lkik/android/scan/fragment/h;

    iget-object v0, v0, Lkik/android/scan/fragment/h;->a:Lkik/android/scan/fragment/g;

    iget-object v0, v0, Lkik/android/scan/fragment/g;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->k(Lkik/android/scan/fragment/ScanFragment;)V

    .line 608
    iget-object v0, p0, Lkik/android/scan/fragment/i;->a:Lkik/android/scan/fragment/h;

    iget-object v0, v0, Lkik/android/scan/fragment/h;->a:Lkik/android/scan/fragment/g;

    iget-object v0, v0, Lkik/android/scan/fragment/g;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/i;->a:Lkik/android/scan/fragment/h;

    iget-object v1, v1, Lkik/android/scan/fragment/h;->a:Lkik/android/scan/fragment/g;

    iget-object v1, v1, Lkik/android/scan/fragment/g;->a:Lcom/kik/scan/KikCode;

    invoke-static {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->c(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    .line 609
    return-void
.end method
