.class Lcom/facebook/orca/stickers/aq;
.super Lcom/facebook/inject/d;
.source "StickersModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/stickers/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/am;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/stickers/am;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/facebook/orca/stickers/aq;->a:Lcom/facebook/orca/stickers/am;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V
    .locals 0

    .prologue
    .line 94
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/aq;-><init>(Lcom/facebook/orca/stickers/am;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/stickers/c;
    .locals 2

    .prologue
    .line 98
    new-instance v1, Lcom/facebook/orca/stickers/c;

    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/aq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    invoke-direct {v1, v0}, Lcom/facebook/orca/stickers/c;-><init>(Lcom/facebook/common/time/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 94
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/aq;->a()Lcom/facebook/orca/stickers/c;

    move-result-object v0

    return-object v0
.end method
