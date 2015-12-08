.class final enum Lcom/c/b/ch;
.super Lcom/c/b/cd$a;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/c/b/cd$b;)V
    .locals 6

    .prologue
    .line 127
    const/16 v2, 0xb

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;IB)V

    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 1

    .prologue
    .line 128
    const/4 v0, 0x0

    return v0
.end method
