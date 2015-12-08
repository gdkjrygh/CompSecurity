.class public final La/a/a/a/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a/a/s;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x3

    iput v0, p0, La/a/a/a/e;->a:I

    .line 30
    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x4

    iput v0, p0, La/a/a/a/e;->a:I

    .line 34
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 98
    .line 1067
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, La/a/a/a/e;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1068
    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 99
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 74
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, La/a/a/a/e;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-static {p1, p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 77
    :cond_0
    return-void
.end method

.method public final a(I)Z
    .locals 1

    .prologue
    .line 38
    iget v0, p0, La/a/a/a/e;->a:I

    if-gt v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, La/a/a/a/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, La/a/a/a/e;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    invoke-static {p1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 84
    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 108
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, La/a/a/a/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 113
    .line 1118
    invoke-virtual {p0, v1}, La/a/a/a/e;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1119
    invoke-static {v1, p1, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 114
    :cond_0
    return-void
.end method
