.class final enum Lcom/c/b/ck;
.super Lcom/c/b/cd$c;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 184
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/c/b/cd$c;-><init>(Ljava/lang/String;IB)V

    return-void
.end method


# virtual methods
.method final a(Lcom/c/b/g;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 186
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    return-object v0
.end method
