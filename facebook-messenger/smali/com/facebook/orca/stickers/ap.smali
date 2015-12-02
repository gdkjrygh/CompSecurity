.class Lcom/facebook/orca/stickers/ap;
.super Lcom/facebook/inject/d;
.source "StickersModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/am;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/stickers/am;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/orca/stickers/ap;->a:Lcom/facebook/orca/stickers/am;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/ap;-><init>(Lcom/facebook/orca/stickers/am;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/m;
    .locals 1

    .prologue
    .line 81
    new-instance v0, Lcom/facebook/orca/protocol/methods/m;

    invoke-direct {v0}, Lcom/facebook/orca/protocol/methods/m;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/ap;->a()Lcom/facebook/orca/protocol/methods/m;

    move-result-object v0

    return-object v0
.end method
