.class public final Ljp/co/cyberagent/android/a/n;
.super Ljp/co/cyberagent/android/a/k;
.source "SourceFile"


# instance fields
.field protected F:F

.field private G:Ljp/co/cyberagent/android/a/l;

.field private H:Ljp/co/cyberagent/android/a/l;

.field private I:Ljp/co/cyberagent/android/a/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/n;-><init>(F)V

    .line 16
    return-void
.end method

.method public constructor <init>(F)V
    .locals 3

    .prologue
    const/high16 v2, 0x40a00000    # 5.0f

    const/high16 v1, 0x3f800000    # 1.0f

    .line 18
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/k;-><init>()V

    .line 9
    iput v1, p0, Ljp/co/cyberagent/android/a/n;->F:F

    .line 19
    new-instance v0, Ljp/co/cyberagent/android/a/l;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/l;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/a/n;->G:Ljp/co/cyberagent/android/a/l;

    .line 20
    new-instance v0, Ljp/co/cyberagent/android/a/l;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/l;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/a/n;->H:Ljp/co/cyberagent/android/a/l;

    .line 21
    new-instance v0, Ljp/co/cyberagent/android/a/l;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/l;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/a/n;->I:Ljp/co/cyberagent/android/a/l;

    .line 22
    cmpg-float v0, p1, v2

    if-gtz v0, :cond_0

    .line 23
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->G:Ljp/co/cyberagent/android/a/l;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/l;->a(F)V

    .line 24
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->H:Ljp/co/cyberagent/android/a/l;

    sub-float v1, p1, v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/l;->a(F)V

    .line 29
    :goto_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->I:Ljp/co/cyberagent/android/a/l;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/l;->a(F)V

    .line 30
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->G:Ljp/co/cyberagent/android/a/l;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/n;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 31
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->H:Ljp/co/cyberagent/android/a/l;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/n;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 32
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->I:Ljp/co/cyberagent/android/a/l;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/n;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 33
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->G:Ljp/co/cyberagent/android/a/l;

    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/a/l;->a(F)V

    .line 27
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->H:Ljp/co/cyberagent/android/a/l;

    sub-float v1, p1, v2

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/l;->a(F)V

    goto :goto_0
.end method


# virtual methods
.method public final a(F)V
    .locals 5

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v3, 0x40a00000    # 5.0f

    .line 41
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "blursize:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 42
    iput p1, p0, Ljp/co/cyberagent/android/a/n;->F:F

    .line 43
    cmpg-float v0, p1, v3

    if-gtz v0, :cond_0

    .line 44
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->G:Ljp/co/cyberagent/android/a/l;

    invoke-virtual {v0, v4}, Ljp/co/cyberagent/android/a/l;->a(F)V

    .line 45
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->H:Ljp/co/cyberagent/android/a/l;

    sub-float v1, p1, v4

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/l;->a(F)V

    .line 50
    :goto_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->I:Ljp/co/cyberagent/android/a/l;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/l;->a(F)V

    .line 57
    return-void

    .line 47
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->G:Ljp/co/cyberagent/android/a/l;

    invoke-virtual {v0, v3}, Ljp/co/cyberagent/android/a/l;->a(F)V

    .line 48
    iget-object v0, p0, Ljp/co/cyberagent/android/a/n;->H:Ljp/co/cyberagent/android/a/l;

    sub-float v1, p1, v3

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/l;->a(F)V

    goto :goto_0
.end method
