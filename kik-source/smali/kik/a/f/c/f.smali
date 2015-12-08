.class public final Lkik/a/f/c/f;
.super Lkik/a/f/c/c;
.source "SourceFile"


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 19
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lkik/a/f/c/c;-><init>(I)V

    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkik/a/d/j;Lkik/a/d/j;)V
    .locals 1

    .prologue
    .line 24
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lkik/a/f/c/c;-><init>(I)V

    .line 26
    iput-object p1, p0, Lkik/a/f/c/f;->e:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lkik/a/f/c/f;->b:Lkik/a/d/j;

    .line 28
    iput-object p3, p0, Lkik/a/f/c/f;->c:Lkik/a/d/j;

    .line 29
    return-void
.end method
