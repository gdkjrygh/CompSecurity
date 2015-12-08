.class final Lkik/android/scan/f;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/scan/d;


# direct methods
.method constructor <init>(Lkik/android/scan/d;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lkik/android/scan/f;->a:Lkik/android/scan/d;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 87
    check-cast p2, Lkik/a/d/s;

    iget-object v0, p0, Lkik/android/scan/f;->a:Lkik/android/scan/d;

    invoke-static {v0, p2}, Lkik/android/scan/d;->a(Lkik/android/scan/d;Lkik/a/d/s;)V

    iget-object v0, p0, Lkik/android/scan/f;->a:Lkik/android/scan/d;

    invoke-virtual {v0}, Lkik/android/scan/d;->a()V

    return-void
.end method
