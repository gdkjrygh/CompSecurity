.class public Lkik/a/f/e/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/e/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 2

    .prologue
    .line 17
    const-string v0, "sysmsg"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    new-instance v0, Lkik/a/d/a/m;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/a/d/a/m;-><init>(Ljava/lang/String;)V

    .line 20
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
