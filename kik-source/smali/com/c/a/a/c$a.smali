.class abstract Lcom/c/a/a/c$a;
.super Lcom/c/a/a/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 819
    invoke-direct {p0, p1}, Lcom/c/a/a/c;-><init>(Ljava/lang/String;)V

    .line 820
    return-void
.end method


# virtual methods
.method public a()Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 829
    new-instance v0, Lcom/c/a/a/c$b;

    invoke-direct {v0, p0}, Lcom/c/a/a/c$b;-><init>(Lcom/c/a/a/c;)V

    return-object v0
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 813
    check-cast p1, Ljava/lang/Character;

    invoke-super {p0, p1}, Lcom/c/a/a/c;->a(Ljava/lang/Character;)Z

    move-result v0

    return v0
.end method
