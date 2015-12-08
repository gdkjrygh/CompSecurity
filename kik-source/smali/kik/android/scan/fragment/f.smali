.class final Lkik/android/scan/fragment/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/scan/fragment/e;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/e;Z)V
    .locals 0

    .prologue
    .line 536
    iput-object p1, p0, Lkik/android/scan/fragment/f;->b:Lkik/android/scan/fragment/e;

    iput-boolean p2, p0, Lkik/android/scan/fragment/f;->a:Z

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 540
    iget-boolean v0, p0, Lkik/android/scan/fragment/f;->a:Z

    if-eqz v0, :cond_0

    .line 541
    iget-object v0, p0, Lkik/android/scan/fragment/f;->b:Lkik/android/scan/fragment/e;

    iget-object v0, v0, Lkik/android/scan/fragment/e;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-virtual {v0}, Lkik/android/scan/fragment/ScanFragment;->J()V

    .line 543
    :cond_0
    return-void
.end method
