.class Lcom/facebook/orca/stickers/aw;
.super Lcom/facebook/inject/d;
.source "StickersModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/stickers/al;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/am;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/stickers/am;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/facebook/orca/stickers/aw;->a:Lcom/facebook/orca/stickers/am;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/aw;-><init>(Lcom/facebook/orca/stickers/am;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/stickers/al;
    .locals 1

    .prologue
    .line 115
    new-instance v0, Lcom/facebook/orca/stickers/al;

    invoke-direct {v0}, Lcom/facebook/orca/stickers/al;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 111
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/aw;->a()Lcom/facebook/orca/stickers/al;

    move-result-object v0

    return-object v0
.end method
