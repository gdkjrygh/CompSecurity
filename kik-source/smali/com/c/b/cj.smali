.class final enum Lcom/c/b/cj;
.super Lcom/c/b/cd$c;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 178
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/c/b/cd$c;-><init>(Ljava/lang/String;IB)V

    return-void
.end method


# virtual methods
.method final a(Lcom/c/b/g;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 180
    invoke-virtual {p1}, Lcom/c/b/g;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
