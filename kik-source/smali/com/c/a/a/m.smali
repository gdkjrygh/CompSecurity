.class final Lcom/c/a/a/m;
.super Lcom/c/a/a/c;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 191
    invoke-direct {p0, p1}, Lcom/c/a/a/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 191
    check-cast p1, Ljava/lang/Character;

    invoke-super {p0, p1}, Lcom/c/a/a/c;->a(Ljava/lang/Character;)Z

    move-result v0

    return v0
.end method

.method public final c(C)Z
    .locals 1

    .prologue
    .line 193
    invoke-static {p1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    return v0
.end method
