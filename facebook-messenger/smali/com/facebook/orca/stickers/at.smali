.class Lcom/facebook/orca/stickers/at;
.super Lcom/facebook/inject/d;
.source "StickersModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/stickers/w;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/am;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/stickers/am;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/facebook/orca/stickers/at;->a:Lcom/facebook/orca/stickers/am;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V
    .locals 0

    .prologue
    .line 145
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/at;-><init>(Lcom/facebook/orca/stickers/am;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/stickers/w;
    .locals 7

    .prologue
    .line 149
    new-instance v0, Lcom/facebook/orca/stickers/w;

    const-class v1, Lcom/facebook/http/protocol/i;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/stickers/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/i;

    const-class v2, Lcom/facebook/orca/protocol/methods/m;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/stickers/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/protocol/methods/m;

    const-class v3, Lcom/facebook/orca/protocol/methods/b;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/stickers/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/protocol/methods/b;

    const-class v4, Lcom/facebook/orca/stickers/c;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/stickers/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/stickers/c;

    const-class v5, Lcom/facebook/orca/stickers/e;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/stickers/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/stickers/e;

    const-class v6, Lcom/facebook/orca/stickers/ak;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/stickers/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/stickers/ak;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/stickers/w;-><init>(Lcom/facebook/http/protocol/i;Lcom/facebook/orca/protocol/methods/m;Lcom/facebook/orca/protocol/methods/b;Lcom/facebook/orca/stickers/c;Lcom/facebook/orca/stickers/e;Lcom/facebook/orca/stickers/ak;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/at;->a()Lcom/facebook/orca/stickers/w;

    move-result-object v0

    return-object v0
.end method
