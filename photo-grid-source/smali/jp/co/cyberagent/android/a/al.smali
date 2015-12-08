.class public Ljp/co/cyberagent/android/a/al;
.super Ljp/co/cyberagent/android/a/k;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/k;-><init>(Ljava/util/List;)V

    .line 24
    new-instance v0, Ljp/co/cyberagent/android/a/h;

    invoke-direct {v0, p1, p2}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/al;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 25
    new-instance v0, Ljp/co/cyberagent/android/a/h;

    invoke-direct {v0, p3, p4}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/al;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 26
    return-void
.end method
