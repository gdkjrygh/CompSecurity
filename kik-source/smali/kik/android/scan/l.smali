.class final Lkik/android/scan/l;
.super Lkik/android/c/b$a;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/scan/k;


# direct methods
.method constructor <init>(Lkik/android/scan/k;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lkik/android/scan/l;->a:Lkik/android/scan/k;

    invoke-direct {p0}, Lkik/android/c/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/Camera;)V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lkik/android/scan/l;->a:Lkik/android/scan/k;

    invoke-static {v0, p1}, Lkik/android/scan/k;->a(Lkik/android/scan/k;Landroid/hardware/Camera;)V

    .line 65
    return-void
.end method
