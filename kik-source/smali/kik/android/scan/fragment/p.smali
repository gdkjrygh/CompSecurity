.class final Lkik/android/scan/fragment/p;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/scan/a/a;

.field final synthetic b:Lcom/kik/scan/KikCode;

.field final synthetic c:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;Lkik/android/scan/a/a;Lcom/kik/scan/KikCode;)V
    .locals 0

    .prologue
    .line 305
    iput-object p1, p0, Lkik/android/scan/fragment/p;->c:Lkik/android/scan/fragment/ScanFragment;

    iput-object p2, p0, Lkik/android/scan/fragment/p;->a:Lkik/android/scan/a/a;

    iput-object p3, p0, Lkik/android/scan/fragment/p;->b:Lcom/kik/scan/KikCode;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 305
    check-cast p1, Lkik/a/d/k;

    iget-object v0, p0, Lkik/android/scan/fragment/p;->c:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/p;->a:Lkik/android/scan/a/a;

    invoke-static {v1}, Lkik/android/scan/a/c;->a(Lkik/android/scan/a/a;)Lkik/android/scan/a/c;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lkik/android/scan/fragment/ScanFragment;->a(Lkik/android/scan/fragment/ScanFragment;Lkik/a/d/k;Lkik/android/scan/a/c;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 315
    iget-object v0, p0, Lkik/android/scan/fragment/p;->c:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, p0, Lkik/android/scan/fragment/p;->b:Lcom/kik/scan/KikCode;

    invoke-static {v0, v1}, Lkik/android/scan/fragment/ScanFragment;->b(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V

    .line 316
    return-void
.end method
