.class final Lkik/android/scan/fragment/j;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/scan/KikCode;

.field final synthetic b:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V
    .locals 0

    .prologue
    .line 621
    iput-object p1, p0, Lkik/android/scan/fragment/j;->b:Lkik/android/scan/fragment/ScanFragment;

    iput-object p2, p0, Lkik/android/scan/fragment/j;->a:Lcom/kik/scan/KikCode;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 621
    check-cast p1, Lkik/android/scan/a/b;

    if-nez p1, :cond_0

    iget-object v0, p0, Lkik/android/scan/fragment/j;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/j;->a:Lcom/kik/scan/KikCode;

    invoke-static {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->b(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/scan/fragment/j;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0, p1}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lkik/android/scan/a/b;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 636
    iget-object v0, p0, Lkik/android/scan/fragment/j;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/j;->a:Lcom/kik/scan/KikCode;

    invoke-static {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->b(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    .line 637
    return-void
.end method
