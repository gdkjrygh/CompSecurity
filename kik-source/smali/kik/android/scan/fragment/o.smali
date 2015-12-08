.class final Lkik/android/scan/fragment/o;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/scan/UsernameKikCode;

.field final synthetic b:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/UsernameKikCode;)V
    .locals 0

    .prologue
    .line 266
    iput-object p1, p0, Lkik/android/scan/fragment/o;->b:Lkik/android/scan/fragment/ScanFragment;

    iput-object p2, p0, Lkik/android/scan/fragment/o;->a:Lcom/kik/scan/UsernameKikCode;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 266
    check-cast p1, Lkik/a/d/k;

    iget-object v0, p0, Lkik/android/scan/fragment/o;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/o;->a:Lcom/kik/scan/UsernameKikCode;

    invoke-static {v1}, Lkik/android/scan/a/c;->a(Lcom/kik/scan/UsernameKikCode;)Lkik/android/scan/a/c;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lkik/a/d/k;Lkik/android/scan/a/c;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 276
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_1

    .line 277
    check-cast p1, Lkik/a/f/q;

    .line 278
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0xca

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_1

    .line 280
    :cond_0
    iget-object v0, p0, Lkik/android/scan/fragment/o;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->g(Lkik/android/scan/fragment/ScanFragment;)V

    .line 285
    :goto_0
    return-void

    .line 284
    :cond_1
    iget-object v0, p0, Lkik/android/scan/fragment/o;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->g(Lkik/android/scan/fragment/ScanFragment;)V

    goto :goto_0
.end method
