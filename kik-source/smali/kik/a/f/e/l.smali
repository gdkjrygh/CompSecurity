.class public Lkik/a/f/e/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/e/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 19
    const-string v1, "roster"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 20
    const-string v1, "full"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 22
    :goto_0
    new-instance v1, Lkik/a/d/a/j;

    invoke-direct {v1, v0}, Lkik/a/d/a/j;-><init>(Z)V

    move-object v0, v1

    .line 24
    :cond_0
    return-object v0

    .line 21
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
