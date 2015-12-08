.class public Lkik/a/d/a/b;
.super Lkik/a/d/a/g;
.source "SourceFile"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 9
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/a/d/a/b;-><init>(B)V

    .line 10
    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 14
    invoke-direct {p0, v0, v0}, Lkik/a/d/a/g;-><init>(ZZ)V

    .line 16
    iput v0, p0, Lkik/a/d/a/b;->a:I

    .line 17
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lkik/a/d/a/b;->a:I

    return v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 21
    iput p1, p0, Lkik/a/d/a/b;->a:I

    .line 22
    return-void
.end method
