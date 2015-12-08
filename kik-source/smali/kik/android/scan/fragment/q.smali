.class final Lkik/android/scan/fragment/q;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/scan/GroupKikCode;

.field final synthetic b:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/GroupKikCode;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    iput-object p2, p0, Lkik/android/scan/fragment/q;->a:Lcom/kik/scan/GroupKikCode;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 337
    check-cast p1, Lkik/a/f/f/i;

    invoke-virtual {p1}, Lkik/a/f/f/i;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v0, v0, Lkik/android/scan/fragment/ScanFragment;->e:Lkik/a/e/l;

    invoke-virtual {p1}, Lkik/a/f/f/i;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/n;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lkik/a/d/n;->B()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v1, v0}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/g/p;)Lcom/kik/g/p;

    new-instance v1, Lkik/android/scan/fragment/r;

    invoke-direct {v1, p0}, Lkik/android/scan/fragment/r;-><init>(Lkik/android/scan/fragment/q;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :goto_1
    return-void

    :cond_0
    iget-object v1, p0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v2, p0, Lkik/android/scan/fragment/q;->a:Lcom/kik/scan/GroupKikCode;

    invoke-static {v2}, Lkik/android/scan/a/c;->a(Lcom/kik/scan/GroupKikCode;)Lkik/android/scan/a/c;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lkik/a/d/n;Lkik/android/scan/a/c;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/q;->a:Lcom/kik/scan/GroupKikCode;

    invoke-static {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->b(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    goto :goto_1
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 380
    iget-object v0, p0, Lkik/android/scan/fragment/q;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/q;->a:Lcom/kik/scan/GroupKikCode;

    invoke-static {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->b(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    .line 381
    return-void
.end method
