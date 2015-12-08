.class final Lkik/android/scan/g;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/scan/d;


# direct methods
.method constructor <init>(Lkik/android/scan/d;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lkik/android/scan/g;->a:Lkik/android/scan/d;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 126
    check-cast p1, Lcom/kik/n/a/i/a;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    iget-object v0, p0, Lkik/android/scan/g;->a:Lkik/android/scan/d;

    invoke-static {v0}, Lkik/android/scan/d;->b(Lkik/android/scan/d;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 139
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 140
    iget-object v0, p0, Lkik/android/scan/g;->a:Lkik/android/scan/d;

    invoke-static {v0}, Lkik/android/scan/d;->b(Lkik/android/scan/d;)V

    .line 141
    return-void
.end method
