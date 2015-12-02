.class Lcom/facebook/orca/stickers/au;
.super Lcom/facebook/inject/d;
.source "StickersModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/stickers/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/stickers/am;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/stickers/am;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/facebook/orca/stickers/au;->a:Lcom/facebook/orca/stickers/am;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V
    .locals 0

    .prologue
    .line 133
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/au;-><init>(Lcom/facebook/orca/stickers/am;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/stickers/e;
    .locals 4

    .prologue
    .line 137
    new-instance v3, Lcom/facebook/orca/stickers/e;

    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    const-class v1, Lcom/facebook/orca/stickers/ak;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/stickers/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/stickers/ak;

    const-class v2, Lcom/facebook/orca/stickers/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/stickers/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/stickers/k;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/stickers/e;-><init>(Lcom/facebook/common/time/a;Lcom/facebook/orca/stickers/ak;Lcom/facebook/orca/stickers/k;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 133
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/au;->a()Lcom/facebook/orca/stickers/e;

    move-result-object v0

    return-object v0
.end method
