.class public Lkik/a/d/a/f;
.super Lkik/a/d/a/g;
.source "SourceFile"


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, v0, v0}, Lkik/a/d/a/g;-><init>(ZZ)V

    .line 11
    iput-boolean p1, p0, Lkik/a/d/a/f;->a:Z

    .line 12
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 16
    iget-boolean v0, p0, Lkik/a/d/a/f;->a:Z

    return v0
.end method
