.class final Lkik/android/scan/fragment/r;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/scan/fragment/q;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/q;)V
    .locals 0

    .prologue
    .line 351
    iput-object p1, p0, Lkik/android/scan/fragment/r;->a:Lkik/android/scan/fragment/q;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 351
    check-cast p1, Lkik/a/d/n;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/scan/fragment/r;->a:Lkik/android/scan/fragment/q;

    iget-object v0, v0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/r;->a:Lkik/android/scan/fragment/q;

    iget-object v1, v1, Lkik/android/scan/fragment/q;->a:Lcom/kik/scan/GroupKikCode;

    invoke-static {v1}, Lkik/android/scan/a/c;->a(Lcom/kik/scan/GroupKikCode;)Lkik/android/scan/a/c;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lkik/a/d/k;Lkik/android/scan/a/c;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 362
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_0

    check-cast p1, Lkik/a/f/q;

    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0x194

    if-ne v0, v1, :cond_0

    .line 363
    iget-object v0, p0, Lkik/android/scan/fragment/r;->a:Lkik/android/scan/fragment/q;

    iget-object v0, v0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/r;->a:Lkik/android/scan/fragment/q;

    iget-object v1, v1, Lkik/android/scan/fragment/q;->a:Lcom/kik/scan/GroupKikCode;

    const v2, 0x7f090211

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0901da

    invoke-static {v3}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    :goto_0
    return-void

    .line 367
    :cond_0
    iget-object v0, p0, Lkik/android/scan/fragment/r;->a:Lkik/android/scan/fragment/q;

    iget-object v0, v0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/r;->a:Lkik/android/scan/fragment/q;

    iget-object v1, v1, Lkik/android/scan/fragment/q;->a:Lcom/kik/scan/GroupKikCode;

    invoke-static {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->b(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    goto :goto_0
.end method
