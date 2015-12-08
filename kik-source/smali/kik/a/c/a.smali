.class public final Lkik/a/c/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/m;


# instance fields
.field private a:Lkik/a/e/v;


# direct methods
.method public constructor <init>(Lkik/a/e/v;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lkik/a/c/a;->a:Lkik/a/e/v;

    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lkik/a/d/i;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lkik/a/c/a;->a:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->i(Ljava/lang/String;)Lkik/a/d/i;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/d/i;)Z
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/a/c/a;->a:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->a(Lkik/a/d/i;)Z

    move-result v0

    return v0
.end method
