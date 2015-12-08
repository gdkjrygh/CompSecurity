.class final enum Lcom/c/b/ci;
.super Lcom/c/b/cd$c;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 172
    invoke-direct {p0, p1, v0, v0}, Lcom/c/b/cd$c;-><init>(Ljava/lang/String;IB)V

    return-void
.end method


# virtual methods
.method final a(Lcom/c/b/g;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 174
    invoke-virtual {p1}, Lcom/c/b/g;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
